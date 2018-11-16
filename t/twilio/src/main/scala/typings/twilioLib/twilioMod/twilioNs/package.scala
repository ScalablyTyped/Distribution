package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twilioNs {
  type AddressResource = ListMappedResource[AddressInstance]
  type AlertInstance = Resource
  type ApplicationInstance = InstanceResource
  type ApplicationResource = CreatableMappedResource[ApplicationInstance]
  type AuthorizedConnectAppInstance = Resource
  type AuthorizedConnectAppResource = MappedResource[AuthorizedConnectAppInstance]
  type AvailablePhoneNumberResource = BaseMappedResource[AvailablePhoneNumberInstance]
  type BaseMappedResource[T] = js.Function1[/* resourceSid */ java.lang.String, T]
  type CallFeedbackSummaryInstance = DeletableResource
  type CallNotificationResource = ListableResource
  type CallRecordingResource = ListableResource
  type ConnectAppResource = MappedResource[ConnectAppInstance]
  type CountryInstance = Resource
  type CredentialInstance = InstanceResource
  type CredentialListMappingInstance = DeletableResource
  type CredentialListMappingResource = ListMappedResource[CredentialListMappingInstance]
  type CredentialListResource = ListMappedResource[CredentialListInstance]
  type CredentialResource = ListMappedResource[CredentialInstance]
  type DependentPhoneNumberResource = ListableResource
  type DomainResource = ListMappedResource[DomainInstance]
  type EventInstance = Resource
  type IPAccessControlListMappingInstance = DeletableResource
  type IPAccessControlListMappingResource = ListMappedResource[IPAccessControlListMappingInstance]
  type IPAccessControlListResource = ListMappedResource[IPAccessControlListInstance]
  type IPAddressInstance = InstanceResource
  type IPAddressResource = ListMappedResource[IPAddressInstance]
  type KeyInstance = InstanceResource
  type KeyResource = CreatableMappedResource[KeyInstance]
  type MessageMediaInstance = DeletableResource
  type MessageResource = ListMappedResource[MessageInstance]
  type MiddlewareFunction = js.Function3[
    /* request */ nodeLib.httpMod.IncomingMessage, 
    /* response */ nodeLib.httpMod.ServerResponse, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    scala.Unit
  ]
  type NotificationInstance = DeletableResource
  type NotificationResource = MappedResource[NotificationInstance]
  type NumberInstance = Resource
  type OriginationURLInstance = InstanceResource
  type OriginationURLResource = ListMappedResource[OriginationURLInstance]
  type OutgoingCallerIdResource = CreatableMappedResource[OutgoingCallerIdInstance]
  type PhoneNumberInstance = Resource
  type PhoneNumberResource = BaseMappedResource[PhoneNumberInstance]
  type QueueResource = CreatableMappedResource[QueueInstance]
  type RecordingTranscriptionResource = ListableResource
  type RequestCallback = js.Function3[
    /* err */ js.Any, 
    /* data */ js.Any, 
    /* response */ nodeLib.httpMod.IncomingMessage, 
    scala.Unit
  ]
  type SMSMessageInstance = Resource
  type SMSMessageResource = CreatableMappedResource[SMSMessageInstance]
  type SMSShortCodeResource = MappedResource[SMSShortCodeInstance]
  type ServiceChannelMemberInstance = InstanceResource
  type ServiceChannelMemberResource = ListMappedResource[ServiceChannelMemberInstance]
  type ServiceChannelMessageInstance = InstanceResource
  type ServiceChannelMessageResource = ListMappedResource[ServiceChannelMessageInstance]
  type ServiceChannelResource = ListMappedResource[ServiceChannelInstance]
  type ServiceResource = ListMappedResource[ServiceInstance]
  type ServiceRoleInstance = Resource
  type ServiceUserInstance = InstanceResource
  type ServiceUserResource = ListMappedResource[ServiceUserInstance]
  type TranscriptionInstance = DeletableResource
  type TranscriptionResource = MappedResource[TranscriptionInstance]
  type TrunkResource = ListMappedResource[TrunkInstance]
  type TwimlCallback = js.Function1[/* node */ Node, scala.Unit]
  type TwimlResponse = Node
  type UsageRecordInstance = Resource
  type UsageRecordRange = ListableResource
  type UsageTriggerInstance = InstanceResource
  type UsageTriggerResource = CreatableMappedResource[UsageTriggerInstance]
  type WorkspaceActivityInstance = InstanceResource
  type WorkspaceActivityResource = ListMappedResource[WorkspaceActivityInstance]
  type WorkspaceEventInstance = Resource
  type WorkspaceInstanceStatisticResource = Resource
  type WorkspaceResource = CreatableMappedResource[WorkspaceInstance]
  type WorkspaceStatisticResource = ListableResource
  type WorkspaceTaskResource = ListMappedResource[WorkspaceTaskInstance]
}
