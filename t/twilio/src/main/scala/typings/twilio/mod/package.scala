package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): typings.twilio.mod.RestClient = typings.twilio.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.twilio.mod.RestClient]
  @scala.inline
  def apply(
    sid: js.UndefOr[scala.Nothing],
    tkn: js.UndefOr[scala.Nothing],
    options: typings.twilio.mod.ClientOptions
  ): typings.twilio.mod.RestClient = (typings.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any], tkn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.mod.RestClient]
  @scala.inline
  def apply(sid: js.UndefOr[scala.Nothing], tkn: java.lang.String): typings.twilio.mod.RestClient = (typings.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any], tkn.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.mod.RestClient]
  @scala.inline
  def apply(sid: js.UndefOr[scala.Nothing], tkn: java.lang.String, options: typings.twilio.mod.ClientOptions): typings.twilio.mod.RestClient = (typings.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any], tkn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.mod.RestClient]
  @scala.inline
  def apply(sid: java.lang.String): typings.twilio.mod.RestClient = typings.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any]).asInstanceOf[typings.twilio.mod.RestClient]
  @scala.inline
  def apply(sid: java.lang.String, tkn: js.UndefOr[scala.Nothing], options: typings.twilio.mod.ClientOptions): typings.twilio.mod.RestClient = (typings.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any], tkn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.mod.RestClient]
  @scala.inline
  def apply(sid: java.lang.String, tkn: java.lang.String): typings.twilio.mod.RestClient = (typings.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any], tkn.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.mod.RestClient]
  @scala.inline
  def apply(sid: java.lang.String, tkn: java.lang.String, options: typings.twilio.mod.ClientOptions): typings.twilio.mod.RestClient = (typings.twilio.mod.^.asInstanceOf[js.Dynamic].apply(sid.asInstanceOf[js.Any], tkn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.mod.RestClient]
  
  type AddressResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.AddressInstance]
  
  type AlertInstance = typings.twilio.mod.Resource
  
  type ApplicationInstance = typings.twilio.mod.InstanceResource
  
  type ApplicationResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.ApplicationInstance]
  
  type AuthorizedConnectAppInstance = typings.twilio.mod.Resource
  
  type AuthorizedConnectAppResource = typings.twilio.mod.MappedResource[typings.twilio.mod.AuthorizedConnectAppInstance]
  
  type AvailablePhoneNumberResource = typings.twilio.mod.BaseMappedResource[typings.twilio.mod.AvailablePhoneNumberInstance]
  
  type BaseMappedResource[T] = js.Function1[/* resourceSid */ java.lang.String, T]
  
  type CallFeedbackSummaryInstance = typings.twilio.mod.DeletableResource
  
  type CallNotificationResource = typings.twilio.mod.ListableResource
  
  type CallRecordingResource = typings.twilio.mod.ListableResource
  
  type ConnectAppResource = typings.twilio.mod.MappedResource[typings.twilio.mod.ConnectAppInstance]
  
  type CountryInstance = typings.twilio.mod.Resource
  
  type CredentialInstance = typings.twilio.mod.InstanceResource
  
  type CredentialListMappingInstance = typings.twilio.mod.DeletableResource
  
  type CredentialListMappingResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.CredentialListMappingInstance]
  
  type CredentialListResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.CredentialListInstance]
  
  type CredentialResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.CredentialInstance]
  
  type DependentPhoneNumberResource = typings.twilio.mod.ListableResource
  
  type DomainResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.DomainInstance]
  
  type EventInstance = typings.twilio.mod.Resource
  
  type IPAccessControlListMappingInstance = typings.twilio.mod.DeletableResource
  
  type IPAccessControlListMappingResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.IPAccessControlListMappingInstance]
  
  type IPAccessControlListResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.IPAccessControlListInstance]
  
  type IPAddressInstance = typings.twilio.mod.InstanceResource
  
  type IPAddressResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.IPAddressInstance]
  
  type KeyInstance = typings.twilio.mod.InstanceResource
  
  type KeyResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.KeyInstance]
  
  type MessageMediaInstance = typings.twilio.mod.DeletableResource
  
  type MessageResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.MessageInstance]
  
  type MiddlewareFunction = js.Function3[
    /* request */ typings.node.httpMod.IncomingMessage, 
    /* response */ typings.node.httpMod.ServerResponse, 
    /* next */ typings.express.mod.NextFunction, 
    scala.Unit
  ]
  
  type NotificationInstance = typings.twilio.mod.DeletableResource
  
  type NotificationResource = typings.twilio.mod.MappedResource[typings.twilio.mod.NotificationInstance]
  
  type NumberInstance = typings.twilio.mod.Resource
  
  type OriginationURLInstance = typings.twilio.mod.InstanceResource
  
  type OriginationURLResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.OriginationURLInstance]
  
  type OutgoingCallerIdResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.OutgoingCallerIdInstance]
  
  type PhoneNumberInstance = typings.twilio.mod.Resource
  
  type PhoneNumberResource = typings.twilio.mod.BaseMappedResource[typings.twilio.mod.PhoneNumberInstance]
  
  type QueueResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.QueueInstance]
  
  type RecordingTranscriptionResource = typings.twilio.mod.ListableResource
  
  type RequestCallback = js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]
  
  type SMSMessageInstance = typings.twilio.mod.Resource
  
  type SMSMessageResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.SMSMessageInstance]
  
  type SMSShortCodeResource = typings.twilio.mod.MappedResource[typings.twilio.mod.SMSShortCodeInstance]
  
  type ServiceChannelMemberInstance = typings.twilio.mod.InstanceResource
  
  type ServiceChannelMemberResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.ServiceChannelMemberInstance]
  
  type ServiceChannelMessageInstance = typings.twilio.mod.InstanceResource
  
  type ServiceChannelMessageResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.ServiceChannelMessageInstance]
  
  type ServiceChannelResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.ServiceChannelInstance]
  
  type ServiceResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.ServiceInstance]
  
  type ServiceRoleInstance = typings.twilio.mod.Resource
  
  type ServiceUserInstance = typings.twilio.mod.InstanceResource
  
  type ServiceUserResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.ServiceUserInstance]
  
  type TranscriptionInstance = typings.twilio.mod.DeletableResource
  
  type TranscriptionResource = typings.twilio.mod.MappedResource[typings.twilio.mod.TranscriptionInstance]
  
  type TrunkResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.TrunkInstance]
  
  type TwimlCallback = js.Function1[/* node */ typings.twilio.mod.Node, scala.Unit]
  
  type UsageRecordInstance = typings.twilio.mod.Resource
  
  type UsageRecordRange = typings.twilio.mod.ListableResource
  
  type UsageTriggerInstance = typings.twilio.mod.InstanceResource
  
  type UsageTriggerResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.UsageTriggerInstance]
  
  type WorkspaceActivityInstance = typings.twilio.mod.InstanceResource
  
  type WorkspaceActivityResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.WorkspaceActivityInstance]
  
  type WorkspaceEventInstance = typings.twilio.mod.Resource
  
  type WorkspaceInstanceStatisticResource = typings.twilio.mod.Resource
  
  type WorkspaceResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.WorkspaceInstance]
  
  type WorkspaceStatisticResource = typings.twilio.mod.ListableResource
  
  type WorkspaceTaskResource = typings.twilio.mod.ListMappedResource[typings.twilio.mod.WorkspaceTaskInstance]
  
  type twilio = js.Function3[
    /* sid */ js.UndefOr[java.lang.String], 
    /* tkn */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[typings.twilio.mod.ClientOptions], 
    typings.twilio.mod.RestClient
  ]
  
  @scala.inline
  def validateExpressRequest(
    request: typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      _, 
      _, 
      typings.expressServeStaticCore.mod.Query
    ],
    authToken: java.lang.String
  ): scala.Boolean = (typings.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateExpressRequest")(request.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def validateExpressRequest(
    request: typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      _, 
      _, 
      typings.expressServeStaticCore.mod.Query
    ],
    authToken: java.lang.String,
    options: typings.twilio.mod.WebhookExpressOptions
  ): scala.Boolean = (typings.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateExpressRequest")(request.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def validateRequest(authToken: java.lang.String, twilioHeader: java.lang.String, url: java.lang.String): scala.Boolean = (typings.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateRequest")(authToken.asInstanceOf[js.Any], twilioHeader.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def validateRequest(authToken: java.lang.String, twilioHeader: java.lang.String, url: java.lang.String, params: js.Any): scala.Boolean = (typings.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateRequest")(authToken.asInstanceOf[js.Any], twilioHeader.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def webhook(): typings.twilio.mod.MiddlewareFunction = typings.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("webhook")().asInstanceOf[typings.twilio.mod.MiddlewareFunction]
  @scala.inline
  def webhook(authToken: java.lang.String): typings.twilio.mod.MiddlewareFunction = typings.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("webhook")(authToken.asInstanceOf[js.Any]).asInstanceOf[typings.twilio.mod.MiddlewareFunction]
  @scala.inline
  def webhook(authToken: java.lang.String, options: typings.twilio.mod.WebhookOptions): typings.twilio.mod.MiddlewareFunction = (typings.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("webhook")(authToken.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.mod.MiddlewareFunction]
  @scala.inline
  def webhook(options: typings.twilio.mod.WebhookOptions): typings.twilio.mod.MiddlewareFunction = typings.twilio.mod.^.asInstanceOf[js.Dynamic].applyDynamic("webhook")(options.asInstanceOf[js.Any]).asInstanceOf[typings.twilio.mod.MiddlewareFunction]
}
