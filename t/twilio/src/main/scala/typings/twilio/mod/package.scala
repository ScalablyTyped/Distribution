package typings.twilio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AlertInstance = typings.twilio.mod.Resource
  type ApplicationInstance = typings.twilio.mod.InstanceResource
  type ApplicationResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.ApplicationInstance]
  type AuthorizedConnectAppInstance = typings.twilio.mod.Resource
  type AvailablePhoneNumberResource = typings.twilio.mod.BaseMappedResource[typings.twilio.mod.AvailablePhoneNumberInstance]
  type BaseMappedResource[T] = js.Function1[/* resourceSid */ java.lang.String, T]
  type CallFeedbackSummaryInstance = typings.twilio.mod.DeletableResource
  type CallNotificationResource = typings.twilio.mod.ListableResource
  type CallRecordingResource = typings.twilio.mod.ListableResource
  type CountryInstance = typings.twilio.mod.Resource
  type CredentialInstance = typings.twilio.mod.InstanceResource
  type CredentialListMappingInstance = typings.twilio.mod.DeletableResource
  type DependentPhoneNumberResource = typings.twilio.mod.ListableResource
  type EventInstance = typings.twilio.mod.Resource
  type IPAccessControlListMappingInstance = typings.twilio.mod.DeletableResource
  type IPAddressInstance = typings.twilio.mod.InstanceResource
  type KeyInstance = typings.twilio.mod.InstanceResource
  type KeyResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.KeyInstance]
  type MessageMediaInstance = typings.twilio.mod.DeletableResource
  type MiddlewareFunction = js.Function3[
    /* request */ typings.node.httpMod.IncomingMessage, 
    /* response */ typings.node.httpMod.ServerResponse, 
    /* next */ typings.express.mod.NextFunction, 
    scala.Unit
  ]
  type NotificationInstance = typings.twilio.mod.DeletableResource
  type NumberInstance = typings.twilio.mod.Resource
  type OriginationURLInstance = typings.twilio.mod.InstanceResource
  type OutgoingCallerIdResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.OutgoingCallerIdInstance]
  type PhoneNumberInstance = typings.twilio.mod.Resource
  type PhoneNumberResource = typings.twilio.mod.BaseMappedResource[typings.twilio.mod.PhoneNumberInstance]
  type QueueResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.QueueInstance]
  type RecordingTranscriptionResource = typings.twilio.mod.ListableResource
  type RequestCallback = js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]
  type SMSMessageInstance = typings.twilio.mod.Resource
  type SMSMessageResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.SMSMessageInstance]
  type ServiceChannelMemberInstance = typings.twilio.mod.InstanceResource
  type ServiceChannelMessageInstance = typings.twilio.mod.InstanceResource
  type ServiceRoleInstance = typings.twilio.mod.Resource
  type ServiceUserInstance = typings.twilio.mod.InstanceResource
  type TranscriptionInstance = typings.twilio.mod.DeletableResource
  type TwimlCallback = js.Function1[/* node */ typings.twilio.mod.Node, scala.Unit]
  type UsageRecordInstance = typings.twilio.mod.Resource
  type UsageRecordRange = typings.twilio.mod.ListableResource
  type UsageTriggerInstance = typings.twilio.mod.InstanceResource
  type UsageTriggerResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.UsageTriggerInstance]
  type WorkspaceActivityInstance = typings.twilio.mod.InstanceResource
  type WorkspaceEventInstance = typings.twilio.mod.Resource
  type WorkspaceInstanceStatisticResource = typings.twilio.mod.Resource
  type WorkspaceResource = typings.twilio.mod.CreatableMappedResource[typings.twilio.mod.WorkspaceInstance]
  type WorkspaceStatisticResource = typings.twilio.mod.ListableResource
  type twilio = js.Function3[
    /* sid */ js.UndefOr[java.lang.String], 
    /* tkn */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[typings.twilio.mod.ClientOptions], 
    typings.twilio.mod.RestClient
  ]
}
