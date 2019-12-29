package typings.twilio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twilioMod {
  import typings.express.expressMod.NextFunction
  import typings.node.httpMod.IncomingMessage
  import typings.node.httpMod.ServerResponse

  type AlertInstance = Resource
  type ApplicationInstance = InstanceResource
  type ApplicationResource = CreatableMappedResource[ApplicationInstance]
  type AuthorizedConnectAppInstance = Resource
  type AvailablePhoneNumberResource = BaseMappedResource[AvailablePhoneNumberInstance]
  type BaseMappedResource[T] = js.Function1[/* resourceSid */ String, T]
  type CallFeedbackSummaryInstance = DeletableResource
  type CallNotificationResource = ListableResource
  type CallRecordingResource = ListableResource
  type CountryInstance = Resource
  type CredentialInstance = InstanceResource
  type CredentialListMappingInstance = DeletableResource
  type DependentPhoneNumberResource = ListableResource
  type EventInstance = Resource
  type IPAccessControlListMappingInstance = DeletableResource
  type IPAddressInstance = InstanceResource
  type KeyInstance = InstanceResource
  type KeyResource = CreatableMappedResource[KeyInstance]
  type MessageMediaInstance = DeletableResource
  type MiddlewareFunction = js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* next */ NextFunction, 
    Unit
  ]
  type NotificationInstance = DeletableResource
  type NumberInstance = Resource
  type OriginationURLInstance = InstanceResource
  type OutgoingCallerIdResource = CreatableMappedResource[OutgoingCallerIdInstance]
  type PhoneNumberInstance = Resource
  type PhoneNumberResource = BaseMappedResource[PhoneNumberInstance]
  type QueueResource = CreatableMappedResource[QueueInstance]
  type RecordingTranscriptionResource = ListableResource
  type RequestCallback = js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]
  type SMSMessageInstance = Resource
  type SMSMessageResource = CreatableMappedResource[SMSMessageInstance]
  type ServiceChannelMemberInstance = InstanceResource
  type ServiceChannelMessageInstance = InstanceResource
  type ServiceRoleInstance = Resource
  type ServiceUserInstance = InstanceResource
  type TranscriptionInstance = DeletableResource
  type TwimlCallback = js.Function1[/* node */ Node, Unit]
  type UsageRecordInstance = Resource
  type UsageRecordRange = ListableResource
  type UsageTriggerInstance = InstanceResource
  type UsageTriggerResource = CreatableMappedResource[UsageTriggerInstance]
  type WorkspaceActivityInstance = InstanceResource
  type WorkspaceEventInstance = Resource
  type WorkspaceInstanceStatisticResource = Resource
  type WorkspaceResource = CreatableMappedResource[WorkspaceInstance]
  type WorkspaceStatisticResource = ListableResource
  type twilio = js.Function3[
    /* sid */ js.UndefOr[String], 
    /* tkn */ js.UndefOr[String], 
    /* options */ js.UndefOr[ClientOptions], 
    RestClient
  ]
}
