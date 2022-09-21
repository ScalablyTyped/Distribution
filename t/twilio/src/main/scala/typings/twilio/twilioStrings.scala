package typings.twilio

import typings.twilio.accountMod.AccountStatus
import typings.twilio.accountMod.AccountType
import typings.twilio.accountRecordingMod.RecordingSource
import typings.twilio.accountRecordingMod.RecordingStatus
import typings.twilio.addOnResultMod.AddOnResultStatus
import typings.twilio.addressConfigurationMod.AddressConfigurationAutoCreationType
import typings.twilio.addressConfigurationMod.AddressConfigurationMethod
import typings.twilio.addressConfigurationMod.AddressConfigurationType
import typings.twilio.allTimeMod.AllTimeCategory
import typings.twilio.annotationMod.AnnotationAnsweredBy
import typings.twilio.annotationMod.AnnotationConnectivityIssue
import typings.twilio.annotationMod.AnnotationQualityIssues
import typings.twilio.assetVersionMod.AssetVersionVisibility
import typings.twilio.authorizationDocumentMod.AuthorizationDocumentStatus
import typings.twilio.authorizedConnectAppMod.AuthorizedConnectAppPermission
import typings.twilio.billingPeriodMod.BillingPeriodBpType
import typings.twilio.brandRegistrationMod.BrandRegistrationBrandFeedback
import typings.twilio.brandRegistrationMod.BrandRegistrationIdentityStatus
import typings.twilio.brandRegistrationMod.BrandRegistrationStatus
import typings.twilio.buildMod.BuildRuntime
import typings.twilio.buildMod.BuildStatus
import typings.twilio.buildStatusMod.BuildStatusStatus
import typings.twilio.bundleCopyMod.BundleCopyEndUserType
import typings.twilio.bundleCopyMod.BundleCopyStatus
import typings.twilio.bundleMod.BundleEndUserType
import typings.twilio.bundleMod.BundleSortBy
import typings.twilio.bundleMod.BundleSortDirection
import typings.twilio.bundleMod.BundleStatus
import typings.twilio.callEventMod.EventLevel
import typings.twilio.callEventMod.EventTwilioEdge
import typings.twilio.callMod.CallEvent
import typings.twilio.callMod.CallStatus
import typings.twilio.callMod.CallUpdateStatus
import typings.twilio.callSummariesMod.CallSummariesCallDirection
import typings.twilio.callSummariesMod.CallSummariesCallState
import typings.twilio.callSummariesMod.CallSummariesCallType
import typings.twilio.callSummariesMod.CallSummariesProcessingState
import typings.twilio.callSummariesMod.CallSummariesProcessingStateRequest
import typings.twilio.callSummariesMod.CallSummariesSortBy
import typings.twilio.challengeMod.ChallengeChallengeReasons
import typings.twilio.challengeMod.ChallengeChallengeStatuses
import typings.twilio.challengeMod.ChallengeFactorTypes
import typings.twilio.challengeMod.ChallengeListOrders
import typings.twilio.compositionHookMod.CompositionHookFormat
import typings.twilio.compositionMod.CompositionFormat
import typings.twilio.compositionMod.CompositionStatus
import typings.twilio.conferenceMod.ConferenceReasonConferenceEnded
import typings.twilio.conferenceMod.ConferenceStatus
import typings.twilio.conferenceParticipantMod.ConferenceParticipantCallDirection
import typings.twilio.conferenceParticipantMod.ConferenceParticipantCallStatus
import typings.twilio.conferenceParticipantMod.ConferenceParticipantCallType
import typings.twilio.conferenceParticipantMod.ConferenceParticipantJitterBufferSize
import typings.twilio.conferenceParticipantMod.ConferenceParticipantProcessingState
import typings.twilio.conferenceParticipantMod.ConferenceParticipantRegion
import typings.twilio.configurationWebhookMod.WebhookTarget
import typings.twilio.connectAppMod.ConnectAppPermission
import typings.twilio.conversationMessageMod.MessageOrderType
import typings.twilio.conversationMessageMod.MessageWebhookEnabledType
import typings.twilio.conversationParticipantMod.ParticipantWebhookEnabledType
import typings.twilio.conversationWebhookMod.WebhookMethod
import typings.twilio.conversationsV1CredentialMod.CredentialPushType
import typings.twilio.customerProfilesEvaluationsMod.CustomerProfilesEvaluationsStatus
import typings.twilio.customerProfilesMod.CustomerProfilesEndUserType
import typings.twilio.customerProfilesMod.CustomerProfilesStatus
import typings.twilio.dailyMod.DailyCategory
import typings.twilio.deliveryReceiptMod.DeliveryReceiptDeliveryStatus
import typings.twilio.dependentHostedNumberOrderMod.DependentHostedNumberOrderStatus
import typings.twilio.dependentHostedNumberOrderMod.DependentHostedNumberOrderVerificationType
import typings.twilio.dependentPhoneNumberMod.DependentPhoneNumberAddressRequirement
import typings.twilio.dependentPhoneNumberMod.DependentPhoneNumberEmergencyStatus
import typings.twilio.endUserMod.EndUserType
import typings.twilio.engagementMod.EngagementStatus
import typings.twilio.esimProfileMod.EsimProfileStatus
import typings.twilio.evaluationMod.EvaluationStatus
import typings.twilio.executionMod.ExecutionStatus
import typings.twilio.exportCustomJobMod.ExportCustomJobStatus
import typings.twilio.factorMod.FactorFactorStatuses
import typings.twilio.factorMod.FactorFactorTypes
import typings.twilio.factorMod.FactorNotificationPlatforms
import typings.twilio.factorMod.FactorTotpAlgorithms
import typings.twilio.faxResponseMod.ReceiveMediaType
import typings.twilio.faxResponseMod.ReceivePageSize
import typings.twilio.feedbackMod.FeedbackIssues
import typings.twilio.feedbackSummaryMod.FeedbackSummaryStatus
import typings.twilio.flexFlowMod.FlexFlowChannelType
import typings.twilio.flexFlowMod.FlexFlowIntegrationType
import typings.twilio.flowMod.FlowStatus
import typings.twilio.flowRevisionMod.FlowRevisionStatus
import typings.twilio.flowValidateMod.FlowValidateStatus
import typings.twilio.frontlineApiV1UserMod.UserStateType
import typings.twilio.functionVersionMod.FunctionVersionVisibility
import typings.twilio.hostedNumberOrderMod.HostedNumberOrderStatus
import typings.twilio.hostedNumberOrderMod.HostedNumberOrderVerificationType
import typings.twilio.incomingPhoneNumberLocalMod.LocalAddressRequirement
import typings.twilio.incomingPhoneNumberLocalMod.LocalEmergencyAddressStatus
import typings.twilio.incomingPhoneNumberLocalMod.LocalEmergencyStatus
import typings.twilio.incomingPhoneNumberLocalMod.LocalVoiceReceiveMode
import typings.twilio.incomingPhoneNumberMobileMod.MobileAddressRequirement
import typings.twilio.incomingPhoneNumberMobileMod.MobileEmergencyAddressStatus
import typings.twilio.incomingPhoneNumberMobileMod.MobileEmergencyStatus
import typings.twilio.incomingPhoneNumberMobileMod.MobileVoiceReceiveMode
import typings.twilio.incomingPhoneNumberMod.IncomingPhoneNumberAddressRequirement
import typings.twilio.incomingPhoneNumberMod.IncomingPhoneNumberEmergencyAddressStatus
import typings.twilio.incomingPhoneNumberMod.IncomingPhoneNumberEmergencyStatus
import typings.twilio.incomingPhoneNumberMod.IncomingPhoneNumberVoiceReceiveMode
import typings.twilio.incomingPhoneNumberTollFreeMod.TollFreeAddressRequirement
import typings.twilio.incomingPhoneNumberTollFreeMod.TollFreeEmergencyAddressStatus
import typings.twilio.incomingPhoneNumberTollFreeMod.TollFreeEmergencyStatus
import typings.twilio.incomingPhoneNumberTollFreeMod.TollFreeVoiceReceiveMode
import typings.twilio.interactionChannelInviteMod.InteractionChannelInviteAction
import typings.twilio.interactionChannelMod.InteractionChannelChannelStatus
import typings.twilio.interactionChannelMod.InteractionChannelStatus
import typings.twilio.interactionChannelMod.InteractionChannelType
import typings.twilio.interactionChannelParticipantMod.InteractionChannelParticipantStatus
import typings.twilio.interactionChannelParticipantMod.InteractionChannelParticipantType
import typings.twilio.interfacesMod.HttpMethod
import typings.twilio.ipCommandMod.IpCommandDirection
import typings.twilio.ipCommandMod.IpCommandPayloadType
import typings.twilio.ipCommandMod.IpCommandStatus
import typings.twilio.ipMessagingV2CredentialMod.CredentialPushService
import typings.twilio.jobMod.JobStatus
import typings.twilio.lastMonthMod.LastMonthCategory
import typings.twilio.logMod.LogLevel
import typings.twilio.mediaProcessorMod.MediaProcessorOrder
import typings.twilio.mediaProcessorMod.MediaProcessorStatus
import typings.twilio.mediaRecordingMod.MediaRecordingFormat
import typings.twilio.mediaRecordingMod.MediaRecordingOrder
import typings.twilio.mediaRecordingMod.MediaRecordingStatus
import typings.twilio.messageFeedbackMod.FeedbackOutcome
import typings.twilio.messageInteractionMod.MessageInteractionResourceStatus
import typings.twilio.messageInteractionMod.MessageInteractionType
import typings.twilio.messageMod.MessageDirection
import typings.twilio.messageMod.MessageStatus
import typings.twilio.messagingV1ServiceMod.ServiceScanMessageContent
import typings.twilio.metricMod.MetricStreamDirection
import typings.twilio.metricMod.MetricTwilioEdge
import typings.twilio.modelBuildMod.ModelBuildStatus
import typings.twilio.monthlyMod.MonthlyCategory
import typings.twilio.newFactorMod.NewFactorFactorStatuses
import typings.twilio.newFactorMod.NewFactorFactorTypes
import typings.twilio.newFactorMod.NewFactorNotificationPlatforms
import typings.twilio.newFactorMod.NewFactorTotpAlgorithms
import typings.twilio.participantMod.ParticipantStatus
import typings.twilio.paymentMod.PaymentBankAccountType
import typings.twilio.paymentMod.PaymentCapture
import typings.twilio.paymentMod.PaymentPaymentMethod
import typings.twilio.paymentMod.PaymentStatus
import typings.twilio.paymentMod.PaymentTokenType
import typings.twilio.playerStreamerMod.PlayerStreamerEndedReason
import typings.twilio.playerStreamerMod.PlayerStreamerOrder
import typings.twilio.playerStreamerMod.PlayerStreamerStatus
import typings.twilio.policiesMod.PoliciesEndUserType
import typings.twilio.proxyV1ServiceMod.ServiceGeoMatchLevel
import typings.twilio.proxyV1ServiceMod.ServiceNumberSelectionBehavior
import typings.twilio.recordMod.RecordCategory
import typings.twilio.regulationMod.RegulationEndUserType
import typings.twilio.replaceItemsMod.ReplaceItemsEndUserType
import typings.twilio.replaceItemsMod.ReplaceItemsStatus
import typings.twilio.reservationMod.ReservationCallStatus
import typings.twilio.reservationMod.ReservationConferenceEvent
import typings.twilio.reservationMod.ReservationStatus
import typings.twilio.reservationMod.ReservationSupervisorMode
import typings.twilio.roleMod.RoleRoleType
import typings.twilio.roomMod.RoomCodec
import typings.twilio.roomMod.RoomCreatedMethod
import typings.twilio.roomMod.RoomEdgeLocation
import typings.twilio.roomMod.RoomEndReason
import typings.twilio.roomMod.RoomProcessingState
import typings.twilio.roomMod.RoomRoomStatus
import typings.twilio.roomMod.RoomRoomType
import typings.twilio.roomMod.RoomTwilioRealm
import typings.twilio.roomParticipantAnonymizeMod.AnonymizeStatus
import typings.twilio.roomParticipantMod.ParticipantCodec
import typings.twilio.roomParticipantMod.ParticipantEdgeLocation
import typings.twilio.roomParticipantMod.ParticipantRoomStatus
import typings.twilio.roomParticipantMod.ParticipantTwilioRealm
import typings.twilio.roomParticipantPublishedTrackMod.PublishedTrackKind
import typings.twilio.roomParticipantSubscribedTrackMod.SubscribedTrackKind
import typings.twilio.roomRecordingMod.RoomRecordingCodec
import typings.twilio.roomRecordingMod.RoomRecordingFormat
import typings.twilio.roomRecordingMod.RoomRecordingStatus
import typings.twilio.roomRecordingMod.RoomRecordingType
import typings.twilio.serviceChannelMemberMod.MemberWebhookEnabledType
import typings.twilio.serviceChannelWebhookMod.WebhookType
import typings.twilio.serviceConversationMod.ConversationState
import typings.twilio.serviceConversationMod.ConversationWebhookEnabledType
import typings.twilio.serviceNotificationMod.NotificationPriority
import typings.twilio.serviceParticipantConversationMod.ParticipantConversationState
import typings.twilio.serviceUserMod.UserWebhookEnabledType
import typings.twilio.serviceUserUserChannelMod.UserChannelChannelStatus
import typings.twilio.serviceWebhookMod.WebhookMethods
import typings.twilio.serviceWebhookMod.WebhookStatus
import typings.twilio.serviceWebhookMod.WebhookVersion
import typings.twilio.sessionInteractionMod.InteractionResourceStatus
import typings.twilio.sessionInteractionMod.InteractionType
import typings.twilio.sessionMod.SessionMode
import typings.twilio.sessionMod.SessionStatus
import typings.twilio.simIpAddressMod.SimIpAddressIpAddressVersion
import typings.twilio.sinkMod.SinkSinkType
import typings.twilio.sinkMod.SinkStatus
import typings.twilio.siprecMod.SiprecStatus
import typings.twilio.smsCommandMod.SmsCommandDirection
import typings.twilio.smsCommandMod.SmsCommandStatus
import typings.twilio.streamMod.StreamStatus
import typings.twilio.streamMod.StreamTrack
import typings.twilio.summaryMod.CallSummaryCallState
import typings.twilio.summaryMod.CallSummaryCallType
import typings.twilio.summaryMod.CallSummaryProcessingState
import typings.twilio.supportingDocumentMod.SupportingDocumentStatus
import typings.twilio.syncListSyncListItemMod.SyncListItemQueryFromBoundType
import typings.twilio.syncListSyncListItemMod.SyncListItemQueryResultOrder
import typings.twilio.syncMapSyncMapItemMod.SyncMapItemQueryFromBoundType
import typings.twilio.syncMapSyncMapItemMod.SyncMapItemQueryResultOrder
import typings.twilio.taskQueueMod.TaskQueueTaskOrder
import typings.twilio.thisMonthMod.ThisMonthCategory
import typings.twilio.todayMod.TodayCategory
import typings.twilio.tollfreeVerificationMod.TollfreeVerificationOptInType
import typings.twilio.tollfreeVerificationMod.TollfreeVerificationStatus
import typings.twilio.transcriptionMod.TranscriptionStatus
import typings.twilio.triggerMod.TriggerRecurring
import typings.twilio.triggerMod.TriggerTriggerField
import typings.twilio.triggerMod.TriggerUsageCategory
import typings.twilio.trunkPhoneNumberMod.PhoneNumberAddressRequirement
import typings.twilio.trunkRecordingMod.RecordingRecordingMode
import typings.twilio.trunkRecordingMod.RecordingRecordingTrim
import typings.twilio.trustProductsEvaluationsMod.TrustProductsEvaluationsStatus
import typings.twilio.trustProductsMod.TrustProductsEndUserType
import typings.twilio.trustProductsMod.TrustProductsStatus
import typings.twilio.usageRecordMod.UsageRecordGranularity
import typings.twilio.usageRecordMod.UsageRecordGroup
import typings.twilio.userBindingMod.UserBindingBindingType
import typings.twilio.userConversationMod.UserConversationNotificationLevel
import typings.twilio.userConversationMod.UserConversationState
import typings.twilio.userUserChannelMod.UserChannelNotificationLevel
import typings.twilio.userUserChannelMod.UserChannelWebhookEnabledType
import typings.twilio.v1CommandMod.CommandCommandMode
import typings.twilio.v1CommandMod.CommandDirection
import typings.twilio.v1CommandMod.CommandStatus
import typings.twilio.v1CommandMod.CommandTransport
import typings.twilio.v1ConferenceMod.ConferenceConferenceEndReason
import typings.twilio.v1ConferenceMod.ConferenceConferenceStatus
import typings.twilio.v1ConferenceMod.ConferenceProcessingState
import typings.twilio.v1ConferenceMod.ConferenceRegion
import typings.twilio.v1ConferenceMod.ConferenceTag
import typings.twilio.v1ConfigurationMod.ConfigurationStatus
import typings.twilio.v1RatePlanMod.RatePlanDataLimitStrategy
import typings.twilio.v1RecordingMod.RecordingCodec
import typings.twilio.v1RecordingMod.RecordingFormat
import typings.twilio.v1RecordingMod.RecordingType
import typings.twilio.v1RoomMod.RoomVideoCodec
import typings.twilio.v1ServiceBindingMod.BindingBindingType
import typings.twilio.v1SimMod.SimStatus
import typings.twilio.v1SimMod.SimStatusUpdate
import typings.twilio.v1TrunkMod.TrunkTransferCallerId
import typings.twilio.v1TrunkMod.TrunkTransferSetting
import typings.twilio.v2PhoneNumberMod.PhoneNumberType
import typings.twilio.v2PhoneNumberMod.PhoneNumberValidationError
import typings.twilio.v3ChannelMod.ChannelChannelType
import typings.twilio.v3ChannelMod.ChannelWebhookEnabledType
import typings.twilio.verificationAttemptMod.VerificationAttemptAttemptStatus
import typings.twilio.verificationAttemptMod.VerificationAttemptCallStatus
import typings.twilio.verificationAttemptMod.VerificationAttemptChannels
import typings.twilio.verificationAttemptMod.VerificationAttemptConversionStatus
import typings.twilio.verificationAttemptMod.VerificationAttemptMessageStatus
import typings.twilio.verificationAttemptsSummaryMod.VerificationAttemptsSummaryChannels
import typings.twilio.verificationCheckMod.VerificationCheckChannel
import typings.twilio.verificationMod.VerificationChannel
import typings.twilio.verificationMod.VerificationStatus
import typings.twilio.voiceResponseMod.ClientEvent
import typings.twilio.voiceResponseMod.ConferenceBeep
import typings.twilio.voiceResponseMod.ConferenceEvent
import typings.twilio.voiceResponseMod.ConferenceJitterBufferSize
import typings.twilio.voiceResponseMod.ConferenceRecord
import typings.twilio.voiceResponseMod.ConferenceRecordingEvent
import typings.twilio.voiceResponseMod.ConferenceTrim
import typings.twilio.voiceResponseMod.ConversationEvent
import typings.twilio.voiceResponseMod.ConversationRecord
import typings.twilio.voiceResponseMod.ConversationRecordingEvent
import typings.twilio.voiceResponseMod.ConversationTrim
import typings.twilio.voiceResponseMod.DialRecord
import typings.twilio.voiceResponseMod.DialRecordingEvent
import typings.twilio.voiceResponseMod.DialRecordingTrack
import typings.twilio.voiceResponseMod.DialRingTone
import typings.twilio.voiceResponseMod.DialTrim
import typings.twilio.voiceResponseMod.GatherInput
import typings.twilio.voiceResponseMod.GatherLanguage
import typings.twilio.voiceResponseMod.GatherSpeechModel
import typings.twilio.voiceResponseMod.NumberEvent
import typings.twilio.voiceResponseMod.PayBankAccountType
import typings.twilio.voiceResponseMod.PayLanguage
import typings.twilio.voiceResponseMod.PayPaymentMethod
import typings.twilio.voiceResponseMod.PayStatusCallbackMethod
import typings.twilio.voiceResponseMod.PayTokenType
import typings.twilio.voiceResponseMod.PayValidCardTypes
import typings.twilio.voiceResponseMod.PromptCardType
import typings.twilio.voiceResponseMod.PromptErrorType
import typings.twilio.voiceResponseMod.PromptFor
import typings.twilio.voiceResponseMod.RecordRecordingEvent
import typings.twilio.voiceResponseMod.RecordTrim
import typings.twilio.voiceResponseMod.RejectReason
import typings.twilio.voiceResponseMod.SayLanguage
import typings.twilio.voiceResponseMod.SayVoice
import typings.twilio.voiceResponseMod.SipEvent
import typings.twilio.voiceResponseMod.SiprecTrack
import typings.twilio.voiceResponseMod.SsmlBreakStrength
import typings.twilio.voiceResponseMod.SsmlEmphasisLevel
import typings.twilio.voiceResponseMod.SsmlLangXmlLang
import typings.twilio.voiceResponseMod.SsmlPhonemeAlphabet
import typings.twilio.voiceResponseMod.SsmlSayAsInterpretAs
import typings.twilio.voiceResponseMod.SsmlSayAsRole
import typings.twilio.voiceResponseMod.StreamStatusCallbackMethod
import typings.twilio.workspaceMod.WorkspaceQueueOrder
import typings.twilio.workspaceTaskMod.TaskStatus
import typings.twilio.yearlyMod.YearlyCategory
import typings.twilio.yesterdayMod.YesterdayCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilioStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with AddressConfigurationAutoCreationType
       with GatherSpeechModel
       with UserChannelNotificationLevel
       with typings.twilio.v2ServiceUserUserChannelMod.UserChannelNotificationLevel
       with UserConversationNotificationLevel
       with typings.twilio.userUserConversationMod.UserConversationNotificationLevel
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait APPROVED
    extends StObject
       with BrandRegistrationStatus
  inline def APPROVED: APPROVED = "APPROVED".asInstanceOf[APPROVED]
  
  @js.native
  sealed trait ASC
    extends StObject
       with BundleSortDirection
  inline def ASC: ASC = "ASC".asInstanceOf[ASC]
  
  @js.native
  sealed trait Active
    extends StObject
       with DependentPhoneNumberEmergencyStatus
       with IncomingPhoneNumberEmergencyStatus
       with LocalEmergencyStatus
       with MobileEmergencyStatus
       with TollFreeEmergencyStatus
  inline def Active: Active = "Active".asInstanceOf[Active]
  
  @js.native
  sealed trait Asterisk extends StObject
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait Completed
    extends StObject
       with ExportCustomJobStatus
       with JobStatus
  inline def Completed: Completed = "Completed".asInstanceOf[Completed]
  
  @js.native
  sealed trait CompletedEmptyRecords
    extends StObject
       with ExportCustomJobStatus
       with JobStatus
  inline def CompletedEmptyRecords: CompletedEmptyRecords = "CompletedEmptyRecords".asInstanceOf[CompletedEmptyRecords]
  
  @js.native
  sealed trait Conference
    extends StObject
       with RecordingSource
       with typings.twilio.recordingMod.RecordingSource
       with typings.twilio.conferenceRecordingMod.RecordingSource
  inline def Conference: Conference = "Conference".asInstanceOf[Conference]
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with EventLevel
  inline def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait DELETED
    extends StObject
       with BrandRegistrationStatus
  inline def DELETED: DELETED = "DELETED".asInstanceOf[DELETED]
  
  @js.native
  sealed trait DESC
    extends StObject
       with BundleSortDirection
  inline def DESC: DESC = "DESC".asInstanceOf[DESC]
  
  @js.native
  sealed trait DeletedByUserRequest
    extends StObject
       with ExportCustomJobStatus
       with JobStatus
  inline def DeletedByUserRequest: DeletedByUserRequest = "DeletedByUserRequest".asInstanceOf[DeletedByUserRequest]
  
  @js.native
  sealed trait DialVerb
    extends StObject
       with RecordingSource
       with typings.twilio.recordingMod.RecordingSource
       with typings.twilio.conferenceRecordingMod.RecordingSource
  inline def DialVerb: DialVerb = "DialVerb".asInstanceOf[DialVerb]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with EventLevel
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait ErrorDuringRun
    extends StObject
       with ExportCustomJobStatus
       with JobStatus
  inline def ErrorDuringRun: ErrorDuringRun = "ErrorDuringRun".asInstanceOf[ErrorDuringRun]
  
  @js.native
  sealed trait FAILED
    extends StObject
       with BrandRegistrationStatus
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait FIFO
    extends StObject
       with TaskQueueTaskOrder
       with WorkspaceQueueOrder
  inline def FIFO: FIFO = "FIFO".asInstanceOf[FIFO]
  
  @js.native
  sealed trait Failed_
    extends StObject
       with ExportCustomJobStatus
       with JobStatus
  inline def Failed_ : Failed_ = "Failed".asInstanceOf[Failed_]
  
  @js.native
  sealed trait Full
    extends StObject
       with AccountType
  inline def Full: Full = "Full".asInstanceOf[Full]
  
  @js.native
  sealed trait GET
    extends StObject
       with AddressConfigurationMethod
       with PayStatusCallbackMethod
       with StreamStatusCallbackMethod
       with WebhookMethod
       with typings.twilio.serviceChannelWebhookMod.WebhookMethod
       with typings.twilio.channelWebhookMod.WebhookMethod
       with typings.twilio.configurationWebhookMod.WebhookMethod
       with typings.twilio.serviceConfigurationWebhookMod.WebhookMethod
       with typings.twilio.serviceConversationWebhookMod.WebhookMethod
       with WebhookMethods
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait GOVERNMENT_ENTITY
    extends StObject
       with BrandRegistrationBrandFeedback
  inline def GOVERNMENT_ENTITY: GOVERNMENT_ENTITY = "GOVERNMENT_ENTITY".asInstanceOf[GOVERNMENT_ENTITY]
  
  @js.native
  sealed trait H264
    extends StObject
       with ParticipantCodec
       with RecordingCodec
       with RoomCodec
       with RoomRecordingCodec
       with RoomVideoCodec
  inline def H264: H264 = "H264".asInstanceOf[H264]
  
  @js.native
  sealed trait HS256 extends StObject
  inline def HS256: HS256 = "HS256".asInstanceOf[HS256]
  
  @js.native
  sealed trait HS384 extends StObject
  inline def HS384: HS384 = "HS384".asInstanceOf[HS384]
  
  @js.native
  sealed trait HS512 extends StObject
  inline def HS512: HS512 = "HS512".asInstanceOf[HS512]
  
  @js.native
  sealed trait INFO
    extends StObject
       with EventLevel
  inline def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait INVALID_BUT_POSSIBLE
    extends StObject
       with PhoneNumberValidationError
  inline def INVALID_BUT_POSSIBLE: INVALID_BUT_POSSIBLE = "INVALID_BUT_POSSIBLE".asInstanceOf[INVALID_BUT_POSSIBLE]
  
  @js.native
  sealed trait INVALID_COUNTRY_CODE
    extends StObject
       with PhoneNumberValidationError
  inline def INVALID_COUNTRY_CODE: INVALID_COUNTRY_CODE = "INVALID_COUNTRY_CODE".asInstanceOf[INVALID_COUNTRY_CODE]
  
  @js.native
  sealed trait INVALID_LENGTH
    extends StObject
       with PhoneNumberValidationError
  inline def INVALID_LENGTH: INVALID_LENGTH = "INVALID_LENGTH".asInstanceOf[INVALID_LENGTH]
  
  @js.native
  sealed trait IN_REVIEW
    extends StObject
       with BrandRegistrationStatus
       with TollfreeVerificationStatus
  inline def IN_REVIEW: IN_REVIEW = "IN_REVIEW".asInstanceOf[IN_REVIEW]
  
  @js.native
  sealed trait IPv4
    extends StObject
       with SimIpAddressIpAddressVersion
  inline def IPv4: IPv4 = "IPv4".asInstanceOf[IPv4]
  
  @js.native
  sealed trait IPv6
    extends StObject
       with SimIpAddressIpAddressVersion
  inline def IPv6: IPv6 = "IPv6".asInstanceOf[IPv6]
  
  @js.native
  sealed trait Inactive
    extends StObject
       with DependentPhoneNumberEmergencyStatus
       with IncomingPhoneNumberEmergencyStatus
       with LocalEmergencyStatus
       with MobileEmergencyStatus
       with TollFreeEmergencyStatus
  inline def Inactive: Inactive = "Inactive".asInstanceOf[Inactive]
  
  @js.native
  sealed trait LIFO
    extends StObject
       with TaskQueueTaskOrder
       with WorkspaceQueueOrder
  inline def LIFO: LIFO = "LIFO".asInstanceOf[LIFO]
  
  @js.native
  sealed trait MOBILE_QR_CODE
    extends StObject
       with TollfreeVerificationOptInType
  inline def MOBILE_QR_CODE: MOBILE_QR_CODE = "MOBILE_QR_CODE".asInstanceOf[MOBILE_QR_CODE]
  
  @js.native
  sealed trait NONPROFIT
    extends StObject
       with BrandRegistrationBrandFeedback
  inline def NONPROFIT: NONPROFIT = "NONPROFIT".asInstanceOf[NONPROFIT]
  
  @js.native
  sealed trait NOT_A_NUMBER
    extends StObject
       with PhoneNumberValidationError
  inline def NOT_A_NUMBER: NOT_A_NUMBER = "NOT_A_NUMBER".asInstanceOf[NOT_A_NUMBER]
  
  @js.native
  sealed trait OPUS
    extends StObject
       with RecordingCodec
       with RoomRecordingCodec
  inline def OPUS: OPUS = "OPUS".asInstanceOf[OPUS]
  
  @js.native
  sealed trait OTHERS
    extends StObject
       with BrandRegistrationBrandFeedback
  inline def OTHERS: OTHERS = "OTHERS".asInstanceOf[OTHERS]
  
  @js.native
  sealed trait OutboundAPI
    extends StObject
       with RecordingSource
       with typings.twilio.recordingMod.RecordingSource
       with typings.twilio.conferenceRecordingMod.RecordingSource
  inline def OutboundAPI: OutboundAPI = "OutboundAPI".asInstanceOf[OutboundAPI]
  
  @js.native
  sealed trait PAPER_FORM
    extends StObject
       with TollfreeVerificationOptInType
  inline def PAPER_FORM: PAPER_FORM = "PAPER_FORM".asInstanceOf[PAPER_FORM]
  
  @js.native
  sealed trait PCMU
    extends StObject
       with RecordingCodec
       with RoomRecordingCodec
  inline def PCMU: PCMU = "PCMU".asInstanceOf[PCMU]
  
  @js.native
  sealed trait PENDING
    extends StObject
       with BrandRegistrationStatus
  inline def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @js.native
  sealed trait PENDING_REVIEW
    extends StObject
       with TollfreeVerificationStatus
  inline def PENDING_REVIEW: PENDING_REVIEW = "PENDING_REVIEW".asInstanceOf[PENDING_REVIEW]
  
  @js.native
  sealed trait POST
    extends StObject
       with AddressConfigurationMethod
       with PayStatusCallbackMethod
       with StreamStatusCallbackMethod
       with WebhookMethod
       with typings.twilio.serviceChannelWebhookMod.WebhookMethod
       with typings.twilio.channelWebhookMod.WebhookMethod
       with typings.twilio.configurationWebhookMod.WebhookMethod
       with typings.twilio.serviceConfigurationWebhookMod.WebhookMethod
       with typings.twilio.serviceConversationWebhookMod.WebhookMethod
       with WebhookMethods
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PollyDotAditi
    extends StObject
       with SayVoice
  inline def PollyDotAditi: PollyDotAditi = "Polly.Aditi".asInstanceOf[PollyDotAditi]
  
  @js.native
  sealed trait PollyDotAmy
    extends StObject
       with SayVoice
  inline def PollyDotAmy: PollyDotAmy = "Polly.Amy".asInstanceOf[PollyDotAmy]
  
  @js.native
  sealed trait `PollyDotAmy-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotAmy-Neural`: `PollyDotAmy-Neural` = "Polly.Amy-Neural".asInstanceOf[`PollyDotAmy-Neural`]
  
  @js.native
  sealed trait `PollyDotAria-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotAria-Neural`: `PollyDotAria-Neural` = "Polly.Aria-Neural".asInstanceOf[`PollyDotAria-Neural`]
  
  @js.native
  sealed trait `PollyDotArlet-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotArlet-Neural`: `PollyDotArlet-Neural` = "Polly.Arlet-Neural".asInstanceOf[`PollyDotArlet-Neural`]
  
  @js.native
  sealed trait `PollyDotArthur-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotArthur-Neural`: `PollyDotArthur-Neural` = "Polly.Arthur-Neural".asInstanceOf[`PollyDotArthur-Neural`]
  
  @js.native
  sealed trait PollyDotAstrid
    extends StObject
       with SayVoice
  inline def PollyDotAstrid: PollyDotAstrid = "Polly.Astrid".asInstanceOf[PollyDotAstrid]
  
  @js.native
  sealed trait `PollyDotAyanda-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotAyanda-Neural`: `PollyDotAyanda-Neural` = "Polly.Ayanda-Neural".asInstanceOf[`PollyDotAyanda-Neural`]
  
  @js.native
  sealed trait PollyDotBianca
    extends StObject
       with SayVoice
  inline def PollyDotBianca: PollyDotBianca = "Polly.Bianca".asInstanceOf[PollyDotBianca]
  
  @js.native
  sealed trait `PollyDotBianca-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotBianca-Neural`: `PollyDotBianca-Neural` = "Polly.Bianca-Neural".asInstanceOf[`PollyDotBianca-Neural`]
  
  @js.native
  sealed trait PollyDotBrian
    extends StObject
       with SayVoice
  inline def PollyDotBrian: PollyDotBrian = "Polly.Brian".asInstanceOf[PollyDotBrian]
  
  @js.native
  sealed trait `PollyDotBrian-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotBrian-Neural`: `PollyDotBrian-Neural` = "Polly.Brian-Neural".asInstanceOf[`PollyDotBrian-Neural`]
  
  @js.native
  sealed trait PollyDotCamila
    extends StObject
       with SayVoice
  inline def PollyDotCamila: PollyDotCamila = "Polly.Camila".asInstanceOf[PollyDotCamila]
  
  @js.native
  sealed trait `PollyDotCamila-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotCamila-Neural`: `PollyDotCamila-Neural` = "Polly.Camila-Neural".asInstanceOf[`PollyDotCamila-Neural`]
  
  @js.native
  sealed trait PollyDotCarla
    extends StObject
       with SayVoice
  inline def PollyDotCarla: PollyDotCarla = "Polly.Carla".asInstanceOf[PollyDotCarla]
  
  @js.native
  sealed trait PollyDotCarmen
    extends StObject
       with SayVoice
  inline def PollyDotCarmen: PollyDotCarmen = "Polly.Carmen".asInstanceOf[PollyDotCarmen]
  
  @js.native
  sealed trait PollyDotCeline
    extends StObject
       with SayVoice
  inline def PollyDotCeline: PollyDotCeline = "Polly.Celine".asInstanceOf[PollyDotCeline]
  
  @js.native
  sealed trait PollyDotChantal
    extends StObject
       with SayVoice
  inline def PollyDotChantal: PollyDotChantal = "Polly.Chantal".asInstanceOf[PollyDotChantal]
  
  @js.native
  sealed trait PollyDotConchita
    extends StObject
       with SayVoice
  inline def PollyDotConchita: PollyDotConchita = "Polly.Conchita".asInstanceOf[PollyDotConchita]
  
  @js.native
  sealed trait PollyDotCristiano
    extends StObject
       with SayVoice
  inline def PollyDotCristiano: PollyDotCristiano = "Polly.Cristiano".asInstanceOf[PollyDotCristiano]
  
  @js.native
  sealed trait `PollyDotDaniel-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotDaniel-Neural`: `PollyDotDaniel-Neural` = "Polly.Daniel-Neural".asInstanceOf[`PollyDotDaniel-Neural`]
  
  @js.native
  sealed trait PollyDotDora
    extends StObject
       with SayVoice
  inline def PollyDotDora: PollyDotDora = "Polly.Dora".asInstanceOf[PollyDotDora]
  
  @js.native
  sealed trait PollyDotEmma
    extends StObject
       with SayVoice
  inline def PollyDotEmma: PollyDotEmma = "Polly.Emma".asInstanceOf[PollyDotEmma]
  
  @js.native
  sealed trait `PollyDotEmma-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotEmma-Neural`: `PollyDotEmma-Neural` = "Polly.Emma-Neural".asInstanceOf[`PollyDotEmma-Neural`]
  
  @js.native
  sealed trait PollyDotEnrique
    extends StObject
       with SayVoice
  inline def PollyDotEnrique: PollyDotEnrique = "Polly.Enrique".asInstanceOf[PollyDotEnrique]
  
  @js.native
  sealed trait PollyDotEwa
    extends StObject
       with SayVoice
  inline def PollyDotEwa: PollyDotEwa = "Polly.Ewa".asInstanceOf[PollyDotEwa]
  
  @js.native
  sealed trait PollyDotFiliz
    extends StObject
       with SayVoice
  inline def PollyDotFiliz: PollyDotFiliz = "Polly.Filiz".asInstanceOf[PollyDotFiliz]
  
  @js.native
  sealed trait `PollyDotGabrielle-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotGabrielle-Neural`: `PollyDotGabrielle-Neural` = "Polly.Gabrielle-Neural".asInstanceOf[`PollyDotGabrielle-Neural`]
  
  @js.native
  sealed trait PollyDotGeraint
    extends StObject
       with SayVoice
  inline def PollyDotGeraint: PollyDotGeraint = "Polly.Geraint".asInstanceOf[PollyDotGeraint]
  
  @js.native
  sealed trait PollyDotGiorgio
    extends StObject
       with SayVoice
  inline def PollyDotGiorgio: PollyDotGiorgio = "Polly.Giorgio".asInstanceOf[PollyDotGiorgio]
  
  @js.native
  sealed trait PollyDotGwyneth
    extends StObject
       with SayVoice
  inline def PollyDotGwyneth: PollyDotGwyneth = "Polly.Gwyneth".asInstanceOf[PollyDotGwyneth]
  
  @js.native
  sealed trait `PollyDotHannah-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotHannah-Neural`: `PollyDotHannah-Neural` = "Polly.Hannah-Neural".asInstanceOf[`PollyDotHannah-Neural`]
  
  @js.native
  sealed trait PollyDotHans
    extends StObject
       with SayVoice
  inline def PollyDotHans: PollyDotHans = "Polly.Hans".asInstanceOf[PollyDotHans]
  
  @js.native
  sealed trait PollyDotInes
    extends StObject
       with SayVoice
  inline def PollyDotInes: PollyDotInes = "Polly.Ines".asInstanceOf[PollyDotInes]
  
  @js.native
  sealed trait `PollyDotInes-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotInes-Neural`: `PollyDotInes-Neural` = "Polly.Ines-Neural".asInstanceOf[`PollyDotInes-Neural`]
  
  @js.native
  sealed trait PollyDotIvy
    extends StObject
       with SayVoice
  inline def PollyDotIvy: PollyDotIvy = "Polly.Ivy".asInstanceOf[PollyDotIvy]
  
  @js.native
  sealed trait `PollyDotIvy-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotIvy-Neural`: `PollyDotIvy-Neural` = "Polly.Ivy-Neural".asInstanceOf[`PollyDotIvy-Neural`]
  
  @js.native
  sealed trait PollyDotJacek
    extends StObject
       with SayVoice
  inline def PollyDotJacek: PollyDotJacek = "Polly.Jacek".asInstanceOf[PollyDotJacek]
  
  @js.native
  sealed trait PollyDotJan
    extends StObject
       with SayVoice
  inline def PollyDotJan: PollyDotJan = "Polly.Jan".asInstanceOf[PollyDotJan]
  
  @js.native
  sealed trait PollyDotJoanna
    extends StObject
       with SayVoice
  inline def PollyDotJoanna: PollyDotJoanna = "Polly.Joanna".asInstanceOf[PollyDotJoanna]
  
  @js.native
  sealed trait `PollyDotJoanna-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotJoanna-Neural`: `PollyDotJoanna-Neural` = "Polly.Joanna-Neural".asInstanceOf[`PollyDotJoanna-Neural`]
  
  @js.native
  sealed trait PollyDotJoey
    extends StObject
       with SayVoice
  inline def PollyDotJoey: PollyDotJoey = "Polly.Joey".asInstanceOf[PollyDotJoey]
  
  @js.native
  sealed trait `PollyDotJoey-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotJoey-Neural`: `PollyDotJoey-Neural` = "Polly.Joey-Neural".asInstanceOf[`PollyDotJoey-Neural`]
  
  @js.native
  sealed trait PollyDotJustin
    extends StObject
       with SayVoice
  inline def PollyDotJustin: PollyDotJustin = "Polly.Justin".asInstanceOf[PollyDotJustin]
  
  @js.native
  sealed trait `PollyDotJustin-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotJustin-Neural`: `PollyDotJustin-Neural` = "Polly.Justin-Neural".asInstanceOf[`PollyDotJustin-Neural`]
  
  @js.native
  sealed trait `PollyDotKajal-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotKajal-Neural`: `PollyDotKajal-Neural` = "Polly.Kajal-Neural".asInstanceOf[`PollyDotKajal-Neural`]
  
  @js.native
  sealed trait PollyDotKarl
    extends StObject
       with SayVoice
  inline def PollyDotKarl: PollyDotKarl = "Polly.Karl".asInstanceOf[PollyDotKarl]
  
  @js.native
  sealed trait PollyDotKendra
    extends StObject
       with SayVoice
  inline def PollyDotKendra: PollyDotKendra = "Polly.Kendra".asInstanceOf[PollyDotKendra]
  
  @js.native
  sealed trait `PollyDotKendra-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotKendra-Neural`: `PollyDotKendra-Neural` = "Polly.Kendra-Neural".asInstanceOf[`PollyDotKendra-Neural`]
  
  @js.native
  sealed trait `PollyDotKevin-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotKevin-Neural`: `PollyDotKevin-Neural` = "Polly.Kevin-Neural".asInstanceOf[`PollyDotKevin-Neural`]
  
  @js.native
  sealed trait PollyDotKimberly
    extends StObject
       with SayVoice
  inline def PollyDotKimberly: PollyDotKimberly = "Polly.Kimberly".asInstanceOf[PollyDotKimberly]
  
  @js.native
  sealed trait `PollyDotKimberly-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotKimberly-Neural`: `PollyDotKimberly-Neural` = "Polly.Kimberly-Neural".asInstanceOf[`PollyDotKimberly-Neural`]
  
  @js.native
  sealed trait PollyDotLea
    extends StObject
       with SayVoice
  inline def PollyDotLea: PollyDotLea = "Polly.Lea".asInstanceOf[PollyDotLea]
  
  @js.native
  sealed trait `PollyDotLea-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotLea-Neural`: `PollyDotLea-Neural` = "Polly.Lea-Neural".asInstanceOf[`PollyDotLea-Neural`]
  
  @js.native
  sealed trait `PollyDotLiam-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotLiam-Neural`: `PollyDotLiam-Neural` = "Polly.Liam-Neural".asInstanceOf[`PollyDotLiam-Neural`]
  
  @js.native
  sealed trait PollyDotLiv
    extends StObject
       with SayVoice
  inline def PollyDotLiv: PollyDotLiv = "Polly.Liv".asInstanceOf[PollyDotLiv]
  
  @js.native
  sealed trait PollyDotLotte
    extends StObject
       with SayVoice
  inline def PollyDotLotte: PollyDotLotte = "Polly.Lotte".asInstanceOf[PollyDotLotte]
  
  @js.native
  sealed trait PollyDotLucia
    extends StObject
       with SayVoice
  inline def PollyDotLucia: PollyDotLucia = "Polly.Lucia".asInstanceOf[PollyDotLucia]
  
  @js.native
  sealed trait `PollyDotLucia-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotLucia-Neural`: `PollyDotLucia-Neural` = "Polly.Lucia-Neural".asInstanceOf[`PollyDotLucia-Neural`]
  
  @js.native
  sealed trait PollyDotLupe
    extends StObject
       with SayVoice
  inline def PollyDotLupe: PollyDotLupe = "Polly.Lupe".asInstanceOf[PollyDotLupe]
  
  @js.native
  sealed trait `PollyDotLupe-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotLupe-Neural`: `PollyDotLupe-Neural` = "Polly.Lupe-Neural".asInstanceOf[`PollyDotLupe-Neural`]
  
  @js.native
  sealed trait PollyDotMads
    extends StObject
       with SayVoice
  inline def PollyDotMads: PollyDotMads = "Polly.Mads".asInstanceOf[PollyDotMads]
  
  @js.native
  sealed trait PollyDotMaja
    extends StObject
       with SayVoice
  inline def PollyDotMaja: PollyDotMaja = "Polly.Maja".asInstanceOf[PollyDotMaja]
  
  @js.native
  sealed trait PollyDotMarlene
    extends StObject
       with SayVoice
  inline def PollyDotMarlene: PollyDotMarlene = "Polly.Marlene".asInstanceOf[PollyDotMarlene]
  
  @js.native
  sealed trait PollyDotMathieu
    extends StObject
       with SayVoice
  inline def PollyDotMathieu: PollyDotMathieu = "Polly.Mathieu".asInstanceOf[PollyDotMathieu]
  
  @js.native
  sealed trait PollyDotMatthew
    extends StObject
       with SayVoice
  inline def PollyDotMatthew: PollyDotMatthew = "Polly.Matthew".asInstanceOf[PollyDotMatthew]
  
  @js.native
  sealed trait `PollyDotMatthew-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotMatthew-Neural`: `PollyDotMatthew-Neural` = "Polly.Matthew-Neural".asInstanceOf[`PollyDotMatthew-Neural`]
  
  @js.native
  sealed trait PollyDotMaxim
    extends StObject
       with SayVoice
  inline def PollyDotMaxim: PollyDotMaxim = "Polly.Maxim".asInstanceOf[PollyDotMaxim]
  
  @js.native
  sealed trait PollyDotMia
    extends StObject
       with SayVoice
  inline def PollyDotMia: PollyDotMia = "Polly.Mia".asInstanceOf[PollyDotMia]
  
  @js.native
  sealed trait `PollyDotMia-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotMia-Neural`: `PollyDotMia-Neural` = "Polly.Mia-Neural".asInstanceOf[`PollyDotMia-Neural`]
  
  @js.native
  sealed trait PollyDotMiguel
    extends StObject
       with SayVoice
  inline def PollyDotMiguel: PollyDotMiguel = "Polly.Miguel".asInstanceOf[PollyDotMiguel]
  
  @js.native
  sealed trait PollyDotMizuki
    extends StObject
       with SayVoice
  inline def PollyDotMizuki: PollyDotMizuki = "Polly.Mizuki".asInstanceOf[PollyDotMizuki]
  
  @js.native
  sealed trait PollyDotNaja
    extends StObject
       with SayVoice
  inline def PollyDotNaja: PollyDotNaja = "Polly.Naja".asInstanceOf[PollyDotNaja]
  
  @js.native
  sealed trait PollyDotNicole
    extends StObject
       with SayVoice
  inline def PollyDotNicole: PollyDotNicole = "Polly.Nicole".asInstanceOf[PollyDotNicole]
  
  @js.native
  sealed trait `PollyDotOlivia-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotOlivia-Neural`: `PollyDotOlivia-Neural` = "Polly.Olivia-Neural".asInstanceOf[`PollyDotOlivia-Neural`]
  
  @js.native
  sealed trait `PollyDotPedro-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotPedro-Neural`: `PollyDotPedro-Neural` = "Polly.Pedro-Neural".asInstanceOf[`PollyDotPedro-Neural`]
  
  @js.native
  sealed trait PollyDotPenelope
    extends StObject
       with SayVoice
  inline def PollyDotPenelope: PollyDotPenelope = "Polly.Penelope".asInstanceOf[PollyDotPenelope]
  
  @js.native
  sealed trait PollyDotRaveena
    extends StObject
       with SayVoice
  inline def PollyDotRaveena: PollyDotRaveena = "Polly.Raveena".asInstanceOf[PollyDotRaveena]
  
  @js.native
  sealed trait PollyDotRicardo
    extends StObject
       with SayVoice
  inline def PollyDotRicardo: PollyDotRicardo = "Polly.Ricardo".asInstanceOf[PollyDotRicardo]
  
  @js.native
  sealed trait PollyDotRuben
    extends StObject
       with SayVoice
  inline def PollyDotRuben: PollyDotRuben = "Polly.Ruben".asInstanceOf[PollyDotRuben]
  
  @js.native
  sealed trait PollyDotRussell
    extends StObject
       with SayVoice
  inline def PollyDotRussell: PollyDotRussell = "Polly.Russell".asInstanceOf[PollyDotRussell]
  
  @js.native
  sealed trait PollyDotSalli
    extends StObject
       with SayVoice
  inline def PollyDotSalli: PollyDotSalli = "Polly.Salli".asInstanceOf[PollyDotSalli]
  
  @js.native
  sealed trait `PollyDotSalli-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotSalli-Neural`: `PollyDotSalli-Neural` = "Polly.Salli-Neural".asInstanceOf[`PollyDotSalli-Neural`]
  
  @js.native
  sealed trait PollyDotSeoyeon
    extends StObject
       with SayVoice
  inline def PollyDotSeoyeon: PollyDotSeoyeon = "Polly.Seoyeon".asInstanceOf[PollyDotSeoyeon]
  
  @js.native
  sealed trait `PollyDotSeoyeon-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotSeoyeon-Neural`: `PollyDotSeoyeon-Neural` = "Polly.Seoyeon-Neural".asInstanceOf[`PollyDotSeoyeon-Neural`]
  
  @js.native
  sealed trait PollyDotTakumi
    extends StObject
       with SayVoice
  inline def PollyDotTakumi: PollyDotTakumi = "Polly.Takumi".asInstanceOf[PollyDotTakumi]
  
  @js.native
  sealed trait `PollyDotTakumi-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotTakumi-Neural`: `PollyDotTakumi-Neural` = "Polly.Takumi-Neural".asInstanceOf[`PollyDotTakumi-Neural`]
  
  @js.native
  sealed trait PollyDotTatyana
    extends StObject
       with SayVoice
  inline def PollyDotTatyana: PollyDotTatyana = "Polly.Tatyana".asInstanceOf[PollyDotTatyana]
  
  @js.native
  sealed trait PollyDotVicki
    extends StObject
       with SayVoice
  inline def PollyDotVicki: PollyDotVicki = "Polly.Vicki".asInstanceOf[PollyDotVicki]
  
  @js.native
  sealed trait `PollyDotVicki-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotVicki-Neural`: `PollyDotVicki-Neural` = "Polly.Vicki-Neural".asInstanceOf[`PollyDotVicki-Neural`]
  
  @js.native
  sealed trait PollyDotVitoria
    extends StObject
       with SayVoice
  inline def PollyDotVitoria: PollyDotVitoria = "Polly.Vitoria".asInstanceOf[PollyDotVitoria]
  
  @js.native
  sealed trait `PollyDotVitoria-Neural`
    extends StObject
       with SayVoice
  inline def `PollyDotVitoria-Neural`: `PollyDotVitoria-Neural` = "Polly.Vitoria-Neural".asInstanceOf[`PollyDotVitoria-Neural`]
  
  @js.native
  sealed trait PollyDotZeina
    extends StObject
       with SayVoice
  inline def PollyDotZeina: PollyDotZeina = "Polly.Zeina".asInstanceOf[PollyDotZeina]
  
  @js.native
  sealed trait PollyDotZhiyu
    extends StObject
       with SayVoice
  inline def PollyDotZhiyu: PollyDotZhiyu = "Polly.Zhiyu".asInstanceOf[PollyDotZhiyu]
  
  @js.native
  sealed trait RecordVerb
    extends StObject
       with RecordingSource
       with typings.twilio.recordingMod.RecordingSource
       with typings.twilio.conferenceRecordingMod.RecordingSource
  inline def RecordVerb: RecordVerb = "RecordVerb".asInstanceOf[RecordVerb]
  
  @js.native
  sealed trait Running
    extends StObject
       with ExportCustomJobStatus
       with JobStatus
  inline def Running: Running = "Running".asInstanceOf[Running]
  
  @js.native
  sealed trait RunningToBeDeleted
    extends StObject
       with ExportCustomJobStatus
       with JobStatus
  inline def RunningToBeDeleted: RunningToBeDeleted = "RunningToBeDeleted".asInstanceOf[RunningToBeDeleted]
  
  @js.native
  sealed trait SELF_DECLARED
    extends StObject
       with BrandRegistrationIdentityStatus
  inline def SELF_DECLARED: SELF_DECLARED = "SELF_DECLARED".asInstanceOf[SELF_DECLARED]
  
  @js.native
  sealed trait STOCK_SYMBOL
    extends StObject
       with BrandRegistrationBrandFeedback
  inline def STOCK_SYMBOL: STOCK_SYMBOL = "STOCK_SYMBOL".asInstanceOf[STOCK_SYMBOL]
  
  @js.native
  sealed trait StartCallRecordingAPI
    extends StObject
       with RecordingSource
       with typings.twilio.recordingMod.RecordingSource
       with typings.twilio.conferenceRecordingMod.RecordingSource
  inline def StartCallRecordingAPI: StartCallRecordingAPI = "StartCallRecordingAPI".asInstanceOf[StartCallRecordingAPI]
  
  @js.native
  sealed trait StartConferenceRecordingAPI
    extends StObject
       with RecordingSource
       with typings.twilio.recordingMod.RecordingSource
       with typings.twilio.conferenceRecordingMod.RecordingSource
  inline def StartConferenceRecordingAPI: StartConferenceRecordingAPI = "StartConferenceRecordingAPI".asInstanceOf[StartConferenceRecordingAPI]
  
  @js.native
  sealed trait Submitted
    extends StObject
       with ExportCustomJobStatus
       with JobStatus
  inline def Submitted: Submitted = "Submitted".asInstanceOf[Submitted]
  
  @js.native
  sealed trait TAX_ID
    extends StObject
       with BrandRegistrationBrandFeedback
  inline def TAX_ID: TAX_ID = "TAX_ID".asInstanceOf[TAX_ID]
  
  @js.native
  sealed trait TOO_LONG
    extends StObject
       with PhoneNumberValidationError
  inline def TOO_LONG: TOO_LONG = "TOO_LONG".asInstanceOf[TOO_LONG]
  
  @js.native
  sealed trait TOO_SHORT
    extends StObject
       with PhoneNumberValidationError
  inline def TOO_SHORT: TOO_SHORT = "TOO_SHORT".asInstanceOf[TOO_SHORT]
  
  @js.native
  sealed trait TWILIO_APPROVED
    extends StObject
       with TollfreeVerificationStatus
  inline def TWILIO_APPROVED: TWILIO_APPROVED = "TWILIO_APPROVED".asInstanceOf[TWILIO_APPROVED]
  
  @js.native
  sealed trait TWILIO_REJECTED
    extends StObject
       with TollfreeVerificationStatus
  inline def TWILIO_REJECTED: TWILIO_REJECTED = "TWILIO_REJECTED".asInstanceOf[TWILIO_REJECTED]
  
  @js.native
  sealed trait Trial
    extends StObject
       with AccountType
  inline def Trial: Trial = "Trial".asInstanceOf[Trial]
  
  @js.native
  sealed trait Trunking
    extends StObject
       with RecordingSource
       with typings.twilio.recordingMod.RecordingSource
       with typings.twilio.conferenceRecordingMod.RecordingSource
  inline def Trunking: Trunking = "Trunking".asInstanceOf[Trunking]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with EventLevel
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait UNVERIFIED
    extends StObject
       with BrandRegistrationIdentityStatus
  inline def UNVERIFIED: UNVERIFIED = "UNVERIFIED".asInstanceOf[UNVERIFIED]
  
  @js.native
  sealed trait VERBAL
    extends StObject
       with TollfreeVerificationOptInType
  inline def VERBAL: VERBAL = "VERBAL".asInstanceOf[VERBAL]
  
  @js.native
  sealed trait VERIFIED
    extends StObject
       with BrandRegistrationIdentityStatus
  inline def VERIFIED: VERIFIED = "VERIFIED".asInstanceOf[VERIFIED]
  
  @js.native
  sealed trait VETTED_VERIFIED
    extends StObject
       with BrandRegistrationIdentityStatus
  inline def VETTED_VERIFIED: VETTED_VERIFIED = "VETTED_VERIFIED".asInstanceOf[VETTED_VERIFIED]
  
  @js.native
  sealed trait VIA_TEXT
    extends StObject
       with TollfreeVerificationOptInType
  inline def VIA_TEXT: VIA_TEXT = "VIA_TEXT".asInstanceOf[VIA_TEXT]
  
  @js.native
  sealed trait VP8
    extends StObject
       with ParticipantCodec
       with RecordingCodec
       with RoomCodec
       with RoomRecordingCodec
       with RoomVideoCodec
  inline def VP8: VP8 = "VP8".asInstanceOf[VP8]
  
  @js.native
  sealed trait VP9
    extends StObject
       with ParticipantCodec
       with RoomCodec
  inline def VP9: VP9 = "VP9".asInstanceOf[VP9]
  
  @js.native
  sealed trait WARNING
    extends StObject
       with EventLevel
  inline def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
  
  @js.native
  sealed trait WEB_FORM
    extends StObject
       with TollfreeVerificationOptInType
  inline def WEB_FORM: WEB_FORM = "WEB_FORM".asInstanceOf[WEB_FORM]
  
  @js.native
  sealed trait `a2p-registration-fees`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `a2p-registration-fees`: `a2p-registration-fees` = "a2p-registration-fees".asInstanceOf[`a2p-registration-fees`]
  
  @js.native
  sealed trait a4
    extends StObject
       with ReceivePageSize
  inline def a4: a4 = "a4".asInstanceOf[a4]
  
  @js.native
  sealed trait absent
    extends StObject
       with ConferenceRecordingEvent
       with ConversationRecordingEvent
       with DialRecordingEvent
       with RecordRecordingEvent
       with RecordingStatus
       with typings.twilio.recordingMod.RecordingStatus
       with typings.twilio.conferenceRecordingMod.RecordingStatus
  inline def absent: absent = "absent".asInstanceOf[absent]
  
  @js.native
  sealed trait accept
    extends StObject
       with InteractionChannelInviteAction
  inline def accept: accept = "accept".asInstanceOf[accept]
  
  @js.native
  sealed trait accepted
    extends StObject
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with MessageStatus
       with ReservationStatus
       with typings.twilio.workerReservationMod.ReservationStatus
       with VerificationAttemptMessageStatus
  inline def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait `ach-debit`
    extends StObject
       with PayPaymentMethod
       with PaymentPaymentMethod
  inline def `ach-debit`: `ach-debit` = "ach-debit".asInstanceOf[`ach-debit`]
  
  @js.native
  sealed trait `action-required`
    extends StObject
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
  inline def `action-required`: `action-required` = "action-required".asInstanceOf[`action-required`]
  
  @js.native
  sealed trait active_
    extends StObject
       with AccountStatus
       with BillingPeriodBpType
       with ConversationState
       with typings.twilio.conversationMod.ConversationState
       with EngagementStatus
       with ExecutionStatus
       with typings.twilio.flowExecutionMod.ExecutionStatus
       with InteractionChannelChannelStatus
       with ParticipantConversationState
       with typings.twilio.participantConversationMod.ParticipantConversationState
       with SimStatus
       with typings.twilio.wirelessV1SimMod.SimStatus
       with SimStatusUpdate
       with SinkStatus
       with UserConversationState
       with typings.twilio.userUserConversationMod.UserConversationState
       with UserStateType
  inline def active_ : active_ = "active".asInstanceOf[active_]
  
  @js.native
  sealed trait ad_hoc
    extends StObject
       with RoomCreatedMethod
  inline def ad_hoc: ad_hoc = "ad_hoc".asInstanceOf[ad_hoc]
  
  @js.native
  sealed trait address
    extends StObject
       with SsmlSayAsInterpretAs
  inline def address: address = "address".asInstanceOf[address]
  
  @js.native
  sealed trait `af-ZA`
    extends StObject
       with GatherLanguage
  inline def `af-ZA`: `af-ZA` = "af-ZA".asInstanceOf[`af-ZA`]
  
  @js.native
  sealed trait agent
    extends StObject
       with InteractionChannelParticipantType
  inline def agent: agent = "agent".asInstanceOf[agent]
  
  @js.native
  sealed trait `agent-conference`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `agent-conference`: `agent-conference` = "agent-conference".asInstanceOf[`agent-conference`]
  
  @js.native
  sealed trait alexa
    extends StObject
       with BindingBindingType
  inline def alexa: alexa = "alexa".asInstanceOf[alexa]
  
  @js.native
  sealed trait alice
    extends StObject
       with SayVoice
  inline def alice: alice = "alice".asInstanceOf[alice]
  
  @js.native
  sealed trait all
    extends StObject
       with CallSummariesProcessingStateRequest
       with UsageRecordGranularity
       with typings.twilio.simUsageRecordMod.UsageRecordGranularity
       with typings.twilio.v1UsageRecordMod.UsageRecordGranularity
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait alltime
    extends StObject
       with TriggerRecurring
  inline def alltime: alltime = "alltime".asInstanceOf[alltime]
  
  @js.native
  sealed trait `am-ET`
    extends StObject
       with GatherLanguage
  inline def `am-ET`: `am-ET` = "am-ET".asInstanceOf[`am-ET`]
  
  @js.native
  sealed trait `amazon-polly`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `amazon-polly`: `amazon-polly` = "amazon-polly".asInstanceOf[`amazon-polly`]
  
  @js.native
  sealed trait amex
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def amex: amex = "amex".asInstanceOf[amex]
  
  @js.native
  sealed trait announcement
    extends StObject
       with ConferenceEvent
  inline def announcement: announcement = "announcement".asInstanceOf[announcement]
  
  @js.native
  sealed trait answered
    extends StObject
       with CallEvent
       with CallSummariesCallState
       with CallSummaryCallState
       with ClientEvent
       with ConferenceParticipantCallStatus
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with NumberEvent
       with ReservationCallStatus
       with typings.twilio.workerReservationMod.ReservationCallStatus
       with SipEvent
  inline def answered: answered = "answered".asInstanceOf[answered]
  
  @js.native
  sealed trait `answering-machine-detection`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `answering-machine-detection`: `answering-machine-detection` = "answering-machine-detection".asInstanceOf[`answering-machine-detection`]
  
  @js.native
  sealed trait any
    extends StObject
       with DependentPhoneNumberAddressRequirement
       with IncomingPhoneNumberAddressRequirement
       with LocalAddressRequirement
       with MobileAddressRequirement
       with PhoneNumberAddressRequirement
       with TollFreeAddressRequirement
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait api
    extends StObject
       with RoomCreatedMethod
  inline def api: api = "api".asInstanceOf[api]
  
  @js.native
  sealed trait apn
    extends StObject
       with typings.twilio.bindingMod.BindingBindingType
       with BindingBindingType
       with typings.twilio.v2ServiceBindingMod.BindingBindingType
       with typings.twilio.serviceBindingMod.BindingBindingType
       with CredentialPushService
       with typings.twilio.v1CredentialMod.CredentialPushService
       with typings.twilio.v2CredentialMod.CredentialPushService
       with typings.twilio.notifyV1CredentialMod.CredentialPushService
       with typings.twilio.ipMessagingV1CredentialMod.CredentialPushService
       with CredentialPushType
       with FactorNotificationPlatforms
       with NewFactorNotificationPlatforms
       with UserBindingBindingType
       with typings.twilio.userUserBindingMod.UserBindingBindingType
  inline def apn: apn = "apn".asInstanceOf[apn]
  
  @js.native
  sealed trait applicationSlashpdf
    extends StObject
       with ReceiveMediaType
  inline def applicationSlashpdf: applicationSlashpdf = "application/pdf".asInstanceOf[applicationSlashpdf]
  
  @js.native
  sealed trait approved_
    extends StObject
       with ChallengeChallengeStatuses
       with SupportingDocumentStatus
       with typings.twilio.v1SupportingDocumentMod.SupportingDocumentStatus
       with VerificationStatus
  inline def approved_ : approved_ = "approved".asInstanceOf[approved_]
  
  @js.native
  sealed trait `ar-AE`
    extends StObject
       with GatherLanguage
  inline def `ar-AE`: `ar-AE` = "ar-AE".asInstanceOf[`ar-AE`]
  
  @js.native
  sealed trait `ar-BH`
    extends StObject
       with GatherLanguage
  inline def `ar-BH`: `ar-BH` = "ar-BH".asInstanceOf[`ar-BH`]
  
  @js.native
  sealed trait `ar-DZ`
    extends StObject
       with GatherLanguage
  inline def `ar-DZ`: `ar-DZ` = "ar-DZ".asInstanceOf[`ar-DZ`]
  
  @js.native
  sealed trait `ar-EG`
    extends StObject
       with GatherLanguage
  inline def `ar-EG`: `ar-EG` = "ar-EG".asInstanceOf[`ar-EG`]
  
  @js.native
  sealed trait `ar-IL`
    extends StObject
       with GatherLanguage
  inline def `ar-IL`: `ar-IL` = "ar-IL".asInstanceOf[`ar-IL`]
  
  @js.native
  sealed trait `ar-IQ`
    extends StObject
       with GatherLanguage
  inline def `ar-IQ`: `ar-IQ` = "ar-IQ".asInstanceOf[`ar-IQ`]
  
  @js.native
  sealed trait `ar-JO`
    extends StObject
       with GatherLanguage
  inline def `ar-JO`: `ar-JO` = "ar-JO".asInstanceOf[`ar-JO`]
  
  @js.native
  sealed trait `ar-KW`
    extends StObject
       with GatherLanguage
  inline def `ar-KW`: `ar-KW` = "ar-KW".asInstanceOf[`ar-KW`]
  
  @js.native
  sealed trait `ar-LB`
    extends StObject
       with GatherLanguage
  inline def `ar-LB`: `ar-LB` = "ar-LB".asInstanceOf[`ar-LB`]
  
  @js.native
  sealed trait `ar-MA`
    extends StObject
       with GatherLanguage
  inline def `ar-MA`: `ar-MA` = "ar-MA".asInstanceOf[`ar-MA`]
  
  @js.native
  sealed trait `ar-OM`
    extends StObject
       with GatherLanguage
  inline def `ar-OM`: `ar-OM` = "ar-OM".asInstanceOf[`ar-OM`]
  
  @js.native
  sealed trait `ar-PS`
    extends StObject
       with GatherLanguage
  inline def `ar-PS`: `ar-PS` = "ar-PS".asInstanceOf[`ar-PS`]
  
  @js.native
  sealed trait `ar-QA`
    extends StObject
       with GatherLanguage
  inline def `ar-QA`: `ar-QA` = "ar-QA".asInstanceOf[`ar-QA`]
  
  @js.native
  sealed trait `ar-SA`
    extends StObject
       with GatherLanguage
  inline def `ar-SA`: `ar-SA` = "ar-SA".asInstanceOf[`ar-SA`]
  
  @js.native
  sealed trait `ar-TN`
    extends StObject
       with GatherLanguage
  inline def `ar-TN`: `ar-TN` = "ar-TN".asInstanceOf[`ar-TN`]
  
  @js.native
  sealed trait arb
    extends StObject
       with SayLanguage
       with SsmlLangXmlLang
  inline def arb: arb = "arb".asInstanceOf[arb]
  
  @js.native
  sealed trait `area-code`
    extends StObject
       with ServiceGeoMatchLevel
  inline def `area-code`: `area-code` = "area-code".asInstanceOf[`area-code`]
  
  @js.native
  sealed trait asc_
    extends StObject
       with ChallengeListOrders
       with MediaProcessorOrder
       with MediaRecordingOrder
       with MessageOrderType
       with typings.twilio.serviceChannelMessageMod.MessageOrderType
       with typings.twilio.v1ServiceChannelMessageMod.MessageOrderType
       with typings.twilio.serviceConversationMessageMod.MessageOrderType
       with typings.twilio.v2ServiceChannelMessageMod.MessageOrderType
       with typings.twilio.channelMessageMod.MessageOrderType
       with PlayerStreamerOrder
       with SyncListItemQueryResultOrder
       with typings.twilio.syncListItemMod.SyncListItemQueryResultOrder
       with SyncMapItemQueryResultOrder
       with typings.twilio.syncMapItemMod.SyncMapItemQueryResultOrder
  inline def asc_ : asc_ = "asc".asInstanceOf[asc_]
  
  @js.native
  sealed trait ashburn
    extends StObject
       with ParticipantEdgeLocation
       with RoomEdgeLocation
  inline def ashburn: ashburn = "ashburn".asInstanceOf[ashburn]
  
  @js.native
  sealed trait assigned
    extends StObject
       with TaskStatus
  inline def assigned: assigned = "assigned".asInstanceOf[assigned]
  
  @js.native
  sealed trait at
    extends StObject
       with DialRingTone
  inline def at: at = "at".asInstanceOf[at]
  
  @js.native
  sealed trait au
    extends StObject
       with DialRingTone
  inline def au: au = "au".asInstanceOf[au]
  
  @js.native
  sealed trait au1
    extends StObject
       with ConferenceParticipantRegion
       with ConferenceRegion
       with typings.twilio.voiceResponseMod.ConferenceRegion
       with ParticipantTwilioRealm
       with RoomTwilioRealm
  inline def au1: au1 = "au1".asInstanceOf[au1]
  
  @js.native
  sealed trait audio
    extends StObject
       with PublishedTrackKind
       with RecordingType
       with RoomRecordingType
       with SubscribedTrackKind
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait `audio-latency`
    extends StObject
       with FeedbackIssues
  inline def `audio-latency`: `audio-latency` = "audio-latency".asInstanceOf[`audio-latency`]
  
  @js.native
  sealed trait `authy-authentications`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `authy-authentications`: `authy-authentications` = "authy-authentications".asInstanceOf[`authy-authentications`]
  
  @js.native
  sealed trait `authy-calls-outbound`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `authy-calls-outbound`: `authy-calls-outbound` = "authy-calls-outbound".asInstanceOf[`authy-calls-outbound`]
  
  @js.native
  sealed trait `authy-monthly-fees`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `authy-monthly-fees`: `authy-monthly-fees` = "authy-monthly-fees".asInstanceOf[`authy-monthly-fees`]
  
  @js.native
  sealed trait `authy-phone-intelligence`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `authy-phone-intelligence`: `authy-phone-intelligence` = "authy-phone-intelligence".asInstanceOf[`authy-phone-intelligence`]
  
  @js.native
  sealed trait `authy-phone-verifications`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `authy-phone-verifications`: `authy-phone-verifications` = "authy-phone-verifications".asInstanceOf[`authy-phone-verifications`]
  
  @js.native
  sealed trait `authy-sms-outbound`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `authy-sms-outbound`: `authy-sms-outbound` = "authy-sms-outbound".asInstanceOf[`authy-sms-outbound`]
  
  @js.native
  sealed trait available
    extends StObject
       with EsimProfileStatus
  inline def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait `avoid-sticky`
    extends StObject
       with ServiceNumberSelectionBehavior
  inline def `avoid-sticky`: `avoid-sticky` = "avoid-sticky".asInstanceOf[`avoid-sticky`]
  
  @js.native
  sealed trait `az-AZ`
    extends StObject
       with GatherLanguage
  inline def `az-AZ`: `az-AZ` = "az-AZ".asInstanceOf[`az-AZ`]
  
  @js.native
  sealed trait `bank-account-number`
    extends StObject
       with PaymentCapture
       with PromptFor
  inline def `bank-account-number`: `bank-account-number` = "bank-account-number".asInstanceOf[`bank-account-number`]
  
  @js.native
  sealed trait `bank-routing-number`
    extends StObject
       with PaymentCapture
       with PromptFor
  inline def `bank-routing-number`: `bank-routing-number` = "bank-routing-number".asInstanceOf[`bank-routing-number`]
  
  @js.native
  sealed trait barge
    extends StObject
       with ReservationSupervisorMode
  inline def barge: barge = "barge".asInstanceOf[barge]
  
  @js.native
  sealed trait be
    extends StObject
       with DialRingTone
  inline def be: be = "be".asInstanceOf[be]
  
  @js.native
  sealed trait bg
    extends StObject
       with DialRingTone
  inline def bg: bg = "bg".asInstanceOf[bg]
  
  @js.native
  sealed trait `bg-BG`
    extends StObject
       with GatherLanguage
  inline def `bg-BG`: `bg-BG` = "bg-BG".asInstanceOf[`bg-BG`]
  
  @js.native
  sealed trait binary
    extends StObject
       with CommandCommandMode
       with IpCommandPayloadType
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait block
    extends StObject
       with RatePlanDataLimitStrategy
  inline def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait `bn-BD`
    extends StObject
       with GatherLanguage
  inline def `bn-BD`: `bn-BD` = "bn-BD".asInstanceOf[`bn-BD`]
  
  @js.native
  sealed trait `bn-IN`
    extends StObject
       with GatherLanguage
  inline def `bn-IN`: `bn-IN` = "bn-IN".asInstanceOf[`bn-IN`]
  
  @js.native
  sealed trait both
    extends StObject
       with DialRecordingTrack
       with MetricStreamDirection
  inline def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait both_tracks
    extends StObject
       with SiprecTrack
       with typings.twilio.siprecMod.SiprecTrack
       with StreamTrack
       with typings.twilio.voiceResponseMod.StreamTrack
  inline def both_tracks: both_tracks = "both_tracks".asInstanceOf[both_tracks]
  
  @js.native
  sealed trait br
    extends StObject
       with DialRingTone
  inline def br: br = "br".asInstanceOf[br]
  
  @js.native
  sealed trait br1
    extends StObject
       with ConferenceParticipantRegion
       with ConferenceRegion
       with typings.twilio.voiceResponseMod.ConferenceRegion
       with ParticipantTwilioRealm
       with RoomTwilioRealm
  inline def br1: br1 = "br1".asInstanceOf[br1]
  
  @js.native
  sealed trait building
    extends StObject
       with BuildStatus
       with BuildStatusStatus
       with ModelBuildStatus
       with typings.twilio.assistantModelBuildMod.ModelBuildStatus
  inline def building: building = "building".asInstanceOf[building]
  
  @js.native
  sealed trait business
    extends StObject
       with BundleCopyEndUserType
       with BundleEndUserType
       with CustomerProfilesEndUserType
       with EndUserType
       with PoliciesEndUserType
       with RegulationEndUserType
       with ReplaceItemsEndUserType
       with TrustProductsEndUserType
  inline def business: business = "business".asInstanceOf[business]
  
  @js.native
  sealed trait busy
    extends StObject
       with CallStatus
       with CallSummariesCallState
       with CallSummaryCallState
       with ConferenceParticipantCallStatus
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with RejectReason
       with VerificationAttemptCallStatus
  inline def busy: busy = "busy".asInstanceOf[busy]
  
  @js.native
  sealed trait `ca-ES`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `ca-ES`: `ca-ES` = "ca-ES".asInstanceOf[`ca-ES`]
  
  @js.native
  sealed trait call
    extends StObject
       with VerificationAttemptChannels
       with VerificationAttemptsSummaryChannels
       with VerificationChannel
       with VerificationCheckChannel
  inline def call: call = "call".asInstanceOf[call]
  
  @js.native
  sealed trait `call-answered`
    extends StObject
       with ConversationEvent
  inline def `call-answered`: `call-answered` = "call-answered".asInstanceOf[`call-answered`]
  
  @js.native
  sealed trait `call-completed`
    extends StObject
       with ConversationEvent
  inline def `call-completed`: `call-completed` = "call-completed".asInstanceOf[`call-completed`]
  
  @js.native
  sealed trait `call-initiated`
    extends StObject
       with ConversationEvent
  inline def `call-initiated`: `call-initiated` = "call-initiated".asInstanceOf[`call-initiated`]
  
  @js.native
  sealed trait `call-progess-events`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `call-progess-events`: `call-progess-events` = "call-progess-events".asInstanceOf[`call-progess-events`]
  
  @js.native
  sealed trait `call-ringing`
    extends StObject
       with ConversationEvent
  inline def `call-ringing`: `call-ringing` = "call-ringing".asInstanceOf[`call-ringing`]
  
  @js.native
  sealed trait caller_id
    extends StObject
       with AnnotationConnectivityIssue
  inline def caller_id: caller_id = "caller_id".asInstanceOf[caller_id]
  
  @js.native
  sealed trait calleridlookups
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def calleridlookups: calleridlookups = "calleridlookups".asInstanceOf[calleridlookups]
  
  @js.native
  sealed trait calls
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def calls: calls = "calls".asInstanceOf[calls]
  
  @js.native
  sealed trait `calls-client`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-client`: `calls-client` = "calls-client".asInstanceOf[`calls-client`]
  
  @js.native
  sealed trait `calls-globalconference`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-globalconference`: `calls-globalconference` = "calls-globalconference".asInstanceOf[`calls-globalconference`]
  
  @js.native
  sealed trait `calls-inbound`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-inbound`: `calls-inbound` = "calls-inbound".asInstanceOf[`calls-inbound`]
  
  @js.native
  sealed trait `calls-inbound-local`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-inbound-local`: `calls-inbound-local` = "calls-inbound-local".asInstanceOf[`calls-inbound-local`]
  
  @js.native
  sealed trait `calls-inbound-mobile`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-inbound-mobile`: `calls-inbound-mobile` = "calls-inbound-mobile".asInstanceOf[`calls-inbound-mobile`]
  
  @js.native
  sealed trait `calls-inbound-tollfree`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-inbound-tollfree`: `calls-inbound-tollfree` = "calls-inbound-tollfree".asInstanceOf[`calls-inbound-tollfree`]
  
  @js.native
  sealed trait `calls-outbound`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-outbound`: `calls-outbound` = "calls-outbound".asInstanceOf[`calls-outbound`]
  
  @js.native
  sealed trait `calls-pay-verb-transactions`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-pay-verb-transactions`: `calls-pay-verb-transactions` = "calls-pay-verb-transactions".asInstanceOf[`calls-pay-verb-transactions`]
  
  @js.native
  sealed trait `calls-recordings`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-recordings`: `calls-recordings` = "calls-recordings".asInstanceOf[`calls-recordings`]
  
  @js.native
  sealed trait `calls-sip`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-sip`: `calls-sip` = "calls-sip".asInstanceOf[`calls-sip`]
  
  @js.native
  sealed trait `calls-sip-inbound`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-sip-inbound`: `calls-sip-inbound` = "calls-sip-inbound".asInstanceOf[`calls-sip-inbound`]
  
  @js.native
  sealed trait `calls-sip-outbound`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-sip-outbound`: `calls-sip-outbound` = "calls-sip-outbound".asInstanceOf[`calls-sip-outbound`]
  
  @js.native
  sealed trait `calls-transfers`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `calls-transfers`: `calls-transfers` = "calls-transfers".asInstanceOf[`calls-transfers`]
  
  @js.native
  sealed trait `campaign-verify` extends StObject
  inline def `campaign-verify`: `campaign-verify` = "campaign-verify".asInstanceOf[`campaign-verify`]
  
  @js.native
  sealed trait cancel
    extends StObject
       with PaymentStatus
  inline def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait canceled
    extends StObject
       with AddOnResultStatus
       with AuthorizationDocumentStatus
       with CallStatus
       with CallSummariesCallState
       with CallSummaryCallState
       with CallUpdateStatus
       with ConferenceParticipantCallStatus
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with MessageStatus
       with ModelBuildStatus
       with typings.twilio.assistantModelBuildMod.ModelBuildStatus
       with ReservationStatus
       with typings.twilio.workerReservationMod.ReservationStatus
       with typings.twilio.wirelessV1SimMod.SimStatus
       with TaskStatus
       with VerificationAttemptCallStatus
       with VerificationAttemptMessageStatus
       with VerificationStatus
  inline def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait cardinal
    extends StObject
       with SsmlSayAsInterpretAs
  inline def cardinal: cardinal = "cardinal".asInstanceOf[cardinal]
  
  @js.native
  sealed trait carrier
    extends StObject
       with CallSummariesCallType
       with CallSummaryCallType
       with ConferenceParticipantCallType
  inline def carrier: carrier = "carrier".asInstanceOf[carrier]
  
  @js.native
  sealed trait `carrier-lookups`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `carrier-lookups`: `carrier-lookups` = "carrier-lookups".asInstanceOf[`carrier-lookups`]
  
  @js.native
  sealed trait `carrier-processing`
    extends StObject
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
  inline def `carrier-processing`: `carrier-processing` = "carrier-processing".asInstanceOf[`carrier-processing`]
  
  @js.native
  sealed trait carrier_edge
    extends StObject
       with EventTwilioEdge
       with MetricTwilioEdge
  inline def carrier_edge: carrier_edge = "carrier_edge".asInstanceOf[carrier_edge]
  
  @js.native
  sealed trait ch
    extends StObject
       with DialRingTone
  inline def ch: ch = "ch".asInstanceOf[ch]
  
  @js.native
  sealed trait channel
    extends StObject
       with RoleRoleType
       with typings.twilio.v2ServiceRoleMod.RoleRoleType
       with typings.twilio.ipMessagingV1ServiceRoleMod.RoleRoleType
       with typings.twilio.serviceRoleMod.RoleRoleType
  inline def channel: channel = "channel".asInstanceOf[channel]
  
  @js.native
  sealed trait character
    extends StObject
       with SsmlSayAsInterpretAs
  inline def character: character = "character".asInstanceOf[character]
  
  @js.native
  sealed trait chat
    extends StObject
       with InteractionChannelType
  inline def chat: chat = "chat".asInstanceOf[chat]
  
  @js.native
  sealed trait choppy_robotic
    extends StObject
       with AnnotationQualityIssues
  inline def choppy_robotic: choppy_robotic = "choppy_robotic".asInstanceOf[choppy_robotic]
  
  @js.native
  sealed trait cl
    extends StObject
       with DialRingTone
  inline def cl: cl = "cl".asInstanceOf[cl]
  
  @js.native
  sealed trait client
    extends StObject
       with CallSummariesCallType
       with CallSummaryCallType
       with ConferenceParticipantCallType
  inline def client: client = "client".asInstanceOf[client]
  
  @js.native
  sealed trait client_edge
    extends StObject
       with EventTwilioEdge
       with MetricTwilioEdge
  inline def client_edge: client_edge = "client_edge".asInstanceOf[client_edge]
  
  @js.native
  sealed trait closed
    extends StObject
       with AccountStatus
       with ConversationState
       with typings.twilio.conversationMod.ConversationState
       with InteractionChannelChannelStatus
       with InteractionChannelParticipantStatus
       with InteractionChannelStatus
       with ParticipantConversationState
       with typings.twilio.participantConversationMod.ParticipantConversationState
       with SessionStatus
       with UserConversationState
       with typings.twilio.userUserConversationMod.UserConversationState
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait `cmn-CN`
    extends StObject
       with SsmlLangXmlLang
  inline def `cmn-CN`: `cmn-CN` = "cmn-CN".asInstanceOf[`cmn-CN`]
  
  @js.native
  sealed trait `cmn-Hans-CN`
    extends StObject
       with GatherLanguage
  inline def `cmn-Hans-CN`: `cmn-Hans-CN` = "cmn-Hans-CN".asInstanceOf[`cmn-Hans-CN`]
  
  @js.native
  sealed trait `cmn-Hant-TW`
    extends StObject
       with GatherLanguage
  inline def `cmn-Hant-TW`: `cmn-Hant-TW` = "cmn-Hant-TW".asInstanceOf[`cmn-Hant-TW`]
  
  @js.native
  sealed trait cn
    extends StObject
       with DialRingTone
  inline def cn: cn = "cn".asInstanceOf[cn]
  
  @js.native
  sealed trait `commercial-checking`
    extends StObject
       with PayBankAccountType
       with PaymentBankAccountType
  inline def `commercial-checking`: `commercial-checking` = "commercial-checking".asInstanceOf[`commercial-checking`]
  
  @js.native
  sealed trait `commercial-savings`
    extends StObject
       with PayBankAccountType
  inline def `commercial-savings`: `commercial-savings` = "commercial-savings".asInstanceOf[`commercial-savings`]
  
  @js.native
  sealed trait complete
    extends StObject
       with CallSummariesProcessingState
       with CallSummaryProcessingState
       with ConferenceParticipantProcessingState
       with ConferenceProcessingState
       with ParticipantStatus
       with PaymentStatus
       with RoomProcessingState
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait completed_
    extends StObject
       with AddOnResultStatus
       with BuildStatus
       with BuildStatusStatus
       with CallEvent
       with CallStatus
       with CallSummariesCallState
       with CallSummariesProcessingStateRequest
       with CallSummaryCallState
       with CallUpdateStatus
       with ClientEvent
       with CompositionStatus
       with ConferenceConferenceStatus
       with ConferenceParticipantCallStatus
       with ConferenceRecordingEvent
       with ConferenceStatus
       with ConversationRecordingEvent
       with DependentHostedNumberOrderStatus
       with DialRecordingEvent
       with FeedbackSummaryStatus
       with HostedNumberOrderStatus
       with InteractionResourceStatus
       with MediaRecordingStatus
       with MessageInteractionResourceStatus
       with ModelBuildStatus
       with typings.twilio.assistantModelBuildMod.ModelBuildStatus
       with NumberEvent
       with ParticipantRoomStatus
       with RecordRecordingEvent
       with typings.twilio.v1RecordingMod.RecordingStatus
       with RecordingStatus
       with typings.twilio.recordingMod.RecordingStatus
       with typings.twilio.conferenceRecordingMod.RecordingStatus
       with ReservationCallStatus
       with typings.twilio.workerReservationMod.ReservationCallStatus
       with ReservationStatus
       with typings.twilio.workerReservationMod.ReservationStatus
       with RoomRecordingStatus
       with RoomRoomStatus
       with typings.twilio.v1RoomMod.RoomRoomStatus
       with SipEvent
       with TaskStatus
       with TranscriptionStatus
       with typings.twilio.accountTranscriptionMod.TranscriptionStatus
       with VerificationAttemptCallStatus
  inline def completed_ : completed_ = "completed".asInstanceOf[completed_]
  
  @js.native
  sealed trait compliant
    extends StObject
       with CustomerProfilesEvaluationsStatus
       with EvaluationStatus
       with TrustProductsEvaluationsStatus
  inline def compliant: compliant = "compliant".asInstanceOf[compliant]
  
  @js.native
  sealed trait `conference-ended-via-api`
    extends StObject
       with ConferenceReasonConferenceEnded
  inline def `conference-ended-via-api`: `conference-ended-via-api` = "conference-ended-via-api".asInstanceOf[`conference-ended-via-api`]
  
  @js.native
  sealed trait conference_ended_via_api
    extends StObject
       with ConferenceConferenceEndReason
  inline def conference_ended_via_api: conference_ended_via_api = "conference_ended_via_api".asInstanceOf[conference_ended_via_api]
  
  @js.native
  sealed trait confirmed
    extends StObject
       with FeedbackOutcome
       with VerificationAttemptAttemptStatus
  inline def confirmed: confirmed = "confirmed".asInstanceOf[confirmed]
  
  @js.native
  sealed trait connected
    extends StObject
       with AnonymizeStatus
       with ParticipantStatus
       with typings.twilio.roomRoomParticipantMod.ParticipantStatus
  inline def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting
    extends StObject
       with ParticipantStatus
  inline def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait `consumer-checking`
    extends StObject
       with PayBankAccountType
       with PaymentBankAccountType
  inline def `consumer-checking`: `consumer-checking` = "consumer-checking".asInstanceOf[`consumer-checking`]
  
  @js.native
  sealed trait `consumer-savings`
    extends StObject
       with PayBankAccountType
       with PaymentBankAccountType
  inline def `consumer-savings`: `consumer-savings` = "consumer-savings".asInstanceOf[`consumer-savings`]
  
  @js.native
  sealed trait conversation
    extends StObject
       with typings.twilio.v1RoleMod.RoleRoleType
       with typings.twilio.v1ServiceRoleMod.RoleRoleType
  inline def conversation: conversation = "conversation".asInstanceOf[conversation]
  
  @js.native
  sealed trait conversations
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def conversations: conversations = "conversations".asInstanceOf[conversations]
  
  @js.native
  sealed trait `conversations-api-requests`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `conversations-api-requests`: `conversations-api-requests` = "conversations-api-requests".asInstanceOf[`conversations-api-requests`]
  
  @js.native
  sealed trait `conversations-conversation-events`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `conversations-conversation-events`: `conversations-conversation-events` = "conversations-conversation-events".asInstanceOf[`conversations-conversation-events`]
  
  @js.native
  sealed trait `conversations-endpoint-connectivity`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `conversations-endpoint-connectivity`: `conversations-endpoint-connectivity` = "conversations-endpoint-connectivity".asInstanceOf[`conversations-endpoint-connectivity`]
  
  @js.native
  sealed trait `conversations-events`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `conversations-events`: `conversations-events` = "conversations-events".asInstanceOf[`conversations-events`]
  
  @js.native
  sealed trait `conversations-participant-events`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `conversations-participant-events`: `conversations-participant-events` = "conversations-participant-events".asInstanceOf[`conversations-participant-events`]
  
  @js.native
  sealed trait `conversations-participants`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `conversations-participants`: `conversations-participants` = "conversations-participants".asInstanceOf[`conversations-participants`]
  
  @js.native
  sealed trait converted
    extends StObject
       with VerificationAttemptConversionStatus
  inline def converted: converted = "converted".asInstanceOf[converted]
  
  @js.native
  sealed trait count
    extends StObject
       with TriggerTriggerField
  inline def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait country
    extends StObject
       with ServiceGeoMatchLevel
  inline def country: country = "country".asInstanceOf[country]
  
  @js.native
  sealed trait cps
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def cps: cps = "cps".asInstanceOf[cps]
  
  @js.native
  sealed trait created
    extends StObject
       with PlayerStreamerStatus
  inline def created: created = "created".asInstanceOf[created]
  
  @js.native
  sealed trait `credit-card`
    extends StObject
       with PayPaymentMethod
       with PaymentPaymentMethod
  inline def `credit-card`: `credit-card` = "credit-card".asInstanceOf[`credit-card`]
  
  @js.native
  sealed trait `cs-CZ`
    extends StObject
       with GatherLanguage
  inline def `cs-CZ`: `cs-CZ` = "cs-CZ".asInstanceOf[`cs-CZ`]
  
  @js.native
  sealed trait custom
    extends StObject
       with FlexFlowChannelType
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait customer
    extends StObject
       with InteractionChannelParticipantType
  inline def customer: customer = "customer".asInstanceOf[customer]
  
  @js.native
  sealed trait `cy-GB`
    extends StObject
       with SayLanguage
       with SsmlLangXmlLang
  inline def `cy-GB`: `cy-GB` = "cy-GB".asInstanceOf[`cy-GB`]
  
  @js.native
  sealed trait cz
    extends StObject
       with DialRingTone
  inline def cz: cz = "cz".asInstanceOf[cz]
  
  @js.native
  sealed trait d
    extends StObject
       with SsmlSayAsRole
  inline def d: d = "d".asInstanceOf[d]
  
  @js.native
  sealed trait `da-DK`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `da-DK`: `da-DK` = "da-DK".asInstanceOf[`da-DK`]
  
  @js.native
  sealed trait daily
    extends StObject
       with TriggerRecurring
       with typings.twilio.simUsageRecordMod.UsageRecordGranularity
       with typings.twilio.v1UsageRecordMod.UsageRecordGranularity
  inline def daily: daily = "daily".asInstanceOf[daily]
  
  @js.native
  sealed trait data
    extends StObject
       with PublishedTrackKind
       with RecordingType
       with RoomRecordingType
       with SubscribedTrackKind
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait data_sync extends StObject
  inline def data_sync: data_sync = "data_sync".asInstanceOf[data_sync]
  
  @js.native
  sealed trait date
    extends StObject
       with SsmlSayAsInterpretAs
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait `date-updated`
    extends StObject
       with BundleSortBy
  inline def `date-updated`: `date-updated` = "date-updated".asInstanceOf[`date-updated`]
  
  @js.native
  sealed trait day
    extends StObject
       with UsageRecordGranularity
  inline def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait de
    extends StObject
       with DialRingTone
  inline def de: de = "de".asInstanceOf[de]
  
  @js.native
  sealed trait `de-AT`
    extends StObject
       with SayLanguage
       with SsmlLangXmlLang
  inline def `de-AT`: `de-AT` = "de-AT".asInstanceOf[`de-AT`]
  
  @js.native
  sealed trait `de-DE`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `de-DE`: `de-DE` = "de-DE".asInstanceOf[`de-DE`]
  
  @js.native
  sealed trait de1
    extends StObject
       with ConferenceParticipantRegion
       with ConferenceRegion
       with typings.twilio.voiceResponseMod.ConferenceRegion
       with ParticipantTwilioRealm
       with RoomTwilioRealm
  inline def de1: de1 = "de1".asInstanceOf[de1]
  
  @js.native
  sealed trait deactivated
    extends StObject
       with typings.twilio.wirelessV1SimMod.SimStatus
       with UserStateType
  inline def deactivated: deactivated = "deactivated".asInstanceOf[deactivated]
  
  @js.native
  sealed trait decline
    extends StObject
       with InteractionChannelInviteAction
  inline def decline: decline = "decline".asInstanceOf[decline]
  
  @js.native
  sealed trait delete
    extends StObject
       with HttpMethod
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait deleted_
    extends StObject
       with AddOnResultStatus
       with CompositionStatus
       with InteractionResourceStatus
       with MediaRecordingStatus
       with MessageInteractionResourceStatus
       with typings.twilio.v1RecordingMod.RecordingStatus
       with RecordingStatus
       with RoomRecordingStatus
  inline def deleted_ : deleted_ = "deleted".asInstanceOf[deleted_]
  
  @js.native
  sealed trait delivered
    extends StObject
       with CommandStatus
       with DeliveryReceiptDeliveryStatus
       with typings.twilio.messageDeliveryReceiptMod.DeliveryReceiptDeliveryStatus
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with MessageStatus
       with SmsCommandStatus
       with VerificationAttemptMessageStatus
  inline def delivered: delivered = "delivered".asInstanceOf[delivered]
  
  @js.native
  sealed trait `delivery-unknown`
    extends StObject
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
  inline def `delivery-unknown`: `delivery-unknown` = "delivery-unknown".asInstanceOf[`delivery-unknown`]
  
  @js.native
  sealed trait denied
    extends StObject
       with ChallengeChallengeStatuses
  inline def denied: denied = "denied".asInstanceOf[denied]
  
  @js.native
  sealed trait deployment
    extends StObject
       with RoleRoleType
       with typings.twilio.v2ServiceRoleMod.RoleRoleType
       with typings.twilio.ipMessagingV1ServiceRoleMod.RoleRoleType
       with typings.twilio.serviceRoleMod.RoleRoleType
  inline def deployment: deployment = "deployment".asInstanceOf[deployment]
  
  @js.native
  sealed trait desc_
    extends StObject
       with ChallengeListOrders
       with MediaProcessorOrder
       with MediaRecordingOrder
       with MessageOrderType
       with typings.twilio.serviceChannelMessageMod.MessageOrderType
       with typings.twilio.v1ServiceChannelMessageMod.MessageOrderType
       with typings.twilio.serviceConversationMessageMod.MessageOrderType
       with typings.twilio.v2ServiceChannelMessageMod.MessageOrderType
       with typings.twilio.channelMessageMod.MessageOrderType
       with PlayerStreamerOrder
       with SyncListItemQueryResultOrder
       with typings.twilio.syncListItemMod.SyncListItemQueryResultOrder
       with SyncMapItemQueryResultOrder
       with typings.twilio.syncMapItemMod.SyncMapItemQueryResultOrder
  inline def desc_ : desc_ = "desc".asInstanceOf[desc_]
  
  @js.native
  sealed trait detected_silence
    extends StObject
       with ConferenceTag
  inline def detected_silence: detected_silence = "detected_silence".asInstanceOf[detected_silence]
  
  @js.native
  sealed trait digits
    extends StObject
       with SsmlSayAsInterpretAs
  inline def digits: digits = "digits".asInstanceOf[digits]
  
  @js.native
  sealed trait `digits-not-captured`
    extends StObject
       with FeedbackIssues
  inline def `digits-not-captured`: `digits-not-captured` = "digits-not-captured".asInstanceOf[`digits-not-captured`]
  
  @js.native
  sealed trait `diners-club`
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def `diners-club`: `diners-club` = "diners-club".asInstanceOf[`diners-club`]
  
  @js.native
  sealed trait disable
    extends StObject
       with ServiceScanMessageContent
  inline def disable: disable = "disable".asInstanceOf[disable]
  
  @js.native
  sealed trait `disable-all`
    extends StObject
       with TrunkTransferSetting
  inline def `disable-all`: `disable-all` = "disable-all".asInstanceOf[`disable-all`]
  
  @js.native
  sealed trait disabled
    extends StObject
       with WebhookStatus
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with AnonymizeStatus
       with typings.twilio.roomRoomParticipantMod.ParticipantStatus
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait discover
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def discover: discover = "discover".asInstanceOf[discover]
  
  @js.native
  sealed trait dk
    extends StObject
       with DialRingTone
  inline def dk: dk = "dk".asInstanceOf[dk]
  
  @js.native
  sealed trait dm
    extends StObject
       with SsmlSayAsRole
  inline def dm: dm = "dm".asInstanceOf[dm]
  
  @js.native
  sealed trait dmy
    extends StObject
       with SsmlSayAsRole
  inline def dmy: dmy = "dmy".asInstanceOf[dmy]
  
  @js.native
  sealed trait `do-not-record`
    extends StObject
       with ConferenceRecord
       with ConversationRecord
       with DialRecord
       with RecordingRecordingMode
  inline def `do-not-record`: `do-not-record` = "do-not-record".asInstanceOf[`do-not-record`]
  
  @js.native
  sealed trait `do-not-trim`
    extends StObject
       with ConferenceTrim
       with ConversationTrim
       with DialTrim
       with RecordTrim
       with RecordingRecordingTrim
  inline def `do-not-trim`: `do-not-trim` = "do-not-trim".asInstanceOf[`do-not-trim`]
  
  @js.native
  sealed trait downloaded
    extends StObject
       with EsimProfileStatus
  inline def downloaded: downloaded = "downloaded".asInstanceOf[downloaded]
  
  @js.native
  sealed trait draft
    extends StObject
       with BundleCopyStatus
       with BundleStatus
       with CustomerProfilesStatus
       with FlowRevisionStatus
       with FlowStatus
       with typings.twilio.v2FlowMod.FlowStatus
       with FlowValidateStatus
       with ReplaceItemsStatus
       with SupportingDocumentStatus
       with typings.twilio.v1SupportingDocumentMod.SupportingDocumentStatus
       with TrustProductsStatus
  inline def draft: draft = "draft".asInstanceOf[draft]
  
  @js.native
  sealed trait `dropped-call`
    extends StObject
       with FeedbackIssues
  inline def `dropped-call`: `dropped-call` = "dropped-call".asInstanceOf[`dropped-call`]
  
  @js.native
  sealed trait dropped_call
    extends StObject
       with AnnotationConnectivityIssue
  inline def dropped_call: dropped_call = "dropped_call".asInstanceOf[dropped_call]
  
  @js.native
  sealed trait dtmf
    extends StObject
       with AnnotationQualityIssues
       with GatherInput
  inline def dtmf: dtmf = "dtmf".asInstanceOf[dtmf]
  
  @js.native
  sealed trait dublin
    extends StObject
       with ParticipantEdgeLocation
       with RoomEdgeLocation
  inline def dublin: dublin = "dublin".asInstanceOf[dublin]
  
  @js.native
  sealed trait duplicate_identity
    extends StObject
       with ConferenceTag
  inline def duplicate_identity: duplicate_identity = "duplicate_identity".asInstanceOf[duplicate_identity]
  
  @js.native
  sealed trait echo
    extends StObject
       with AnnotationQualityIssues
  inline def echo: echo = "echo".asInstanceOf[echo]
  
  @js.native
  sealed trait ee
    extends StObject
       with DialRingTone
  inline def ee: ee = "ee".asInstanceOf[ee]
  
  @js.native
  sealed trait `el-GR`
    extends StObject
       with GatherLanguage
  inline def `el-GR`: `el-GR` = "el-GR".asInstanceOf[`el-GR`]
  
  @js.native
  sealed trait email
    extends StObject
       with InteractionChannelType
       with VerificationAttemptChannels
       with VerificationAttemptsSummaryChannels
       with VerificationChannel
       with VerificationCheckChannel
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait `en-AU`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-AU`: `en-AU` = "en-AU".asInstanceOf[`en-AU`]
  
  @js.native
  sealed trait `en-CA`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
  inline def `en-CA`: `en-CA` = "en-CA".asInstanceOf[`en-CA`]
  
  @js.native
  sealed trait `en-GB`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-GB`: `en-GB` = "en-GB".asInstanceOf[`en-GB`]
  
  @js.native
  sealed trait `en-GB-WLS`
    extends StObject
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-GB-WLS`: `en-GB-WLS` = "en-GB-WLS".asInstanceOf[`en-GB-WLS`]
  
  @js.native
  sealed trait `en-GH`
    extends StObject
       with GatherLanguage
  inline def `en-GH`: `en-GH` = "en-GH".asInstanceOf[`en-GH`]
  
  @js.native
  sealed trait `en-IE`
    extends StObject
       with GatherLanguage
       with PayLanguage
  inline def `en-IE`: `en-IE` = "en-IE".asInstanceOf[`en-IE`]
  
  @js.native
  sealed trait `en-IN`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-IN`: `en-IN` = "en-IN".asInstanceOf[`en-IN`]
  
  @js.native
  sealed trait `en-KE`
    extends StObject
       with GatherLanguage
  inline def `en-KE`: `en-KE` = "en-KE".asInstanceOf[`en-KE`]
  
  @js.native
  sealed trait `en-NG`
    extends StObject
       with GatherLanguage
  inline def `en-NG`: `en-NG` = "en-NG".asInstanceOf[`en-NG`]
  
  @js.native
  sealed trait `en-NZ`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-NZ`: `en-NZ` = "en-NZ".asInstanceOf[`en-NZ`]
  
  @js.native
  sealed trait `en-PH`
    extends StObject
       with GatherLanguage
       with PayLanguage
  inline def `en-PH`: `en-PH` = "en-PH".asInstanceOf[`en-PH`]
  
  @js.native
  sealed trait `en-SG`
    extends StObject
       with GatherLanguage
  inline def `en-SG`: `en-SG` = "en-SG".asInstanceOf[`en-SG`]
  
  @js.native
  sealed trait `en-TZ`
    extends StObject
       with GatherLanguage
  inline def `en-TZ`: `en-TZ` = "en-TZ".asInstanceOf[`en-TZ`]
  
  @js.native
  sealed trait `en-US`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-US`: `en-US` = "en-US".asInstanceOf[`en-US`]
  
  @js.native
  sealed trait `en-ZA`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `en-ZA`: `en-ZA` = "en-ZA".asInstanceOf[`en-ZA`]
  
  @js.native
  sealed trait enable
    extends StObject
       with ServiceScanMessageContent
  inline def enable: enable = "enable".asInstanceOf[enable]
  
  @js.native
  sealed trait `enable-all`
    extends StObject
       with TrunkTransferSetting
  inline def `enable-all`: `enable-all` = "enable-all".asInstanceOf[`enable-all`]
  
  @js.native
  sealed trait enabled
    extends StObject
       with WebhookStatus
  inline def enabled: enabled = "enabled".asInstanceOf[enabled]
  
  @js.native
  sealed trait end
    extends StObject
       with ConferenceEvent
       with ReservationConferenceEvent
       with typings.twilio.workerReservationMod.ReservationConferenceEvent
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait end_time
    extends StObject
       with CallSummariesSortBy
  inline def end_time: end_time = "end_time".asInstanceOf[end_time]
  
  @js.native
  sealed trait ended
    extends StObject
       with EngagementStatus
       with ExecutionStatus
       with typings.twilio.flowExecutionMod.ExecutionStatus
       with MediaProcessorStatus
       with PlayerStreamerStatus
  inline def ended: ended = "ended".asInstanceOf[ended]
  
  @js.native
  sealed trait `ended-via-api`
    extends StObject
       with PlayerStreamerEndedReason
  inline def `ended-via-api`: `ended-via-api` = "ended-via-api".asInstanceOf[`ended-via-api`]
  
  @js.native
  sealed trait enqueued
    extends StObject
       with CompositionStatus
       with ModelBuildStatus
       with typings.twilio.assistantModelBuildMod.ModelBuildStatus
  inline def enqueued: enqueued = "enqueued".asInstanceOf[enqueued]
  
  @js.native
  sealed trait enroute
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def enroute: enroute = "enroute".asInstanceOf[enroute]
  
  @js.native
  sealed trait error_
    extends StObject
       with LogLevel
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait es
    extends StObject
       with DialRingTone
  inline def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait `es-AR`
    extends StObject
       with GatherLanguage
  inline def `es-AR`: `es-AR` = "es-AR".asInstanceOf[`es-AR`]
  
  @js.native
  sealed trait `es-BO`
    extends StObject
       with GatherLanguage
  inline def `es-BO`: `es-BO` = "es-BO".asInstanceOf[`es-BO`]
  
  @js.native
  sealed trait `es-CL`
    extends StObject
       with GatherLanguage
  inline def `es-CL`: `es-CL` = "es-CL".asInstanceOf[`es-CL`]
  
  @js.native
  sealed trait `es-CO`
    extends StObject
       with GatherLanguage
  inline def `es-CO`: `es-CO` = "es-CO".asInstanceOf[`es-CO`]
  
  @js.native
  sealed trait `es-CR`
    extends StObject
       with GatherLanguage
  inline def `es-CR`: `es-CR` = "es-CR".asInstanceOf[`es-CR`]
  
  @js.native
  sealed trait `es-DO`
    extends StObject
       with GatherLanguage
  inline def `es-DO`: `es-DO` = "es-DO".asInstanceOf[`es-DO`]
  
  @js.native
  sealed trait `es-EC`
    extends StObject
       with GatherLanguage
  inline def `es-EC`: `es-EC` = "es-EC".asInstanceOf[`es-EC`]
  
  @js.native
  sealed trait `es-ES`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `es-ES`: `es-ES` = "es-ES".asInstanceOf[`es-ES`]
  
  @js.native
  sealed trait `es-GT`
    extends StObject
       with GatherLanguage
  inline def `es-GT`: `es-GT` = "es-GT".asInstanceOf[`es-GT`]
  
  @js.native
  sealed trait `es-HN`
    extends StObject
       with GatherLanguage
  inline def `es-HN`: `es-HN` = "es-HN".asInstanceOf[`es-HN`]
  
  @js.native
  sealed trait `es-MX`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `es-MX`: `es-MX` = "es-MX".asInstanceOf[`es-MX`]
  
  @js.native
  sealed trait `es-NI`
    extends StObject
       with GatherLanguage
  inline def `es-NI`: `es-NI` = "es-NI".asInstanceOf[`es-NI`]
  
  @js.native
  sealed trait `es-PA`
    extends StObject
       with GatherLanguage
  inline def `es-PA`: `es-PA` = "es-PA".asInstanceOf[`es-PA`]
  
  @js.native
  sealed trait `es-PE`
    extends StObject
       with GatherLanguage
  inline def `es-PE`: `es-PE` = "es-PE".asInstanceOf[`es-PE`]
  
  @js.native
  sealed trait `es-PR`
    extends StObject
       with GatherLanguage
  inline def `es-PR`: `es-PR` = "es-PR".asInstanceOf[`es-PR`]
  
  @js.native
  sealed trait `es-PY`
    extends StObject
       with GatherLanguage
  inline def `es-PY`: `es-PY` = "es-PY".asInstanceOf[`es-PY`]
  
  @js.native
  sealed trait `es-SV`
    extends StObject
       with GatherLanguage
  inline def `es-SV`: `es-SV` = "es-SV".asInstanceOf[`es-SV`]
  
  @js.native
  sealed trait `es-US`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `es-US`: `es-US` = "es-US".asInstanceOf[`es-US`]
  
  @js.native
  sealed trait `es-UY`
    extends StObject
       with GatherLanguage
  inline def `es-UY`: `es-UY` = "es-UY".asInstanceOf[`es-UY`]
  
  @js.native
  sealed trait `es-VE`
    extends StObject
       with GatherLanguage
  inline def `es-VE`: `es-VE` = "es-VE".asInstanceOf[`es-VE`]
  
  @js.native
  sealed trait `et-EE`
    extends StObject
       with GatherLanguage
  inline def `et-EE`: `et-EE` = "et-EE".asInstanceOf[`et-EE`]
  
  @js.native
  sealed trait `eu-ES`
    extends StObject
       with GatherLanguage
  inline def `eu-ES`: `eu-ES` = "eu-ES".asInstanceOf[`eu-ES`]
  
  @js.native
  sealed trait exclusive
    extends StObject
       with SyncListItemQueryFromBoundType
       with typings.twilio.syncListItemMod.SyncListItemQueryFromBoundType
       with SyncMapItemQueryFromBoundType
       with typings.twilio.syncMapItemMod.SyncMapItemQueryFromBoundType
  inline def exclusive: exclusive = "exclusive".asInstanceOf[exclusive]
  
  @js.native
  sealed trait `expiration-date`
    extends StObject
       with PaymentCapture
       with PromptFor
  inline def `expiration-date`: `expiration-date` = "expiration-date".asInstanceOf[`expiration-date`]
  
  @js.native
  sealed trait expired
    extends StObject
       with ChallengeChallengeStatuses
       with SupportingDocumentStatus
       with typings.twilio.v1SupportingDocumentMod.SupportingDocumentStatus
       with VerificationAttemptAttemptStatus
  inline def expired: expired = "expired".asInstanceOf[expired]
  
  @js.native
  sealed trait expletive
    extends StObject
       with SsmlSayAsInterpretAs
  inline def expletive: expletive = "expletive".asInstanceOf[expletive]
  
  @js.native
  sealed trait external
    extends StObject
       with FlexFlowIntegrationType
       with InteractionChannelParticipantType
  inline def external: external = "external".asInstanceOf[external]
  
  @js.native
  sealed trait `fa-IR`
    extends StObject
       with GatherLanguage
  inline def `fa-IR`: `fa-IR` = "fa-IR".asInstanceOf[`fa-IR`]
  
  @js.native
  sealed trait facebook
    extends StObject
       with FlexFlowChannelType
  inline def facebook: facebook = "facebook".asInstanceOf[facebook]
  
  @js.native
  sealed trait `facebook-messenger`
    extends StObject
       with BindingBindingType
  inline def `facebook-messenger`: `facebook-messenger` = "facebook-messenger".asInstanceOf[`facebook-messenger`]
  
  @js.native
  sealed trait fail
    extends StObject
       with CallSummariesCallState
       with CallSummaryCallState
       with ConferenceParticipantCallStatus
  inline def fail: fail = "fail".asInstanceOf[fail]
  
  @js.native
  sealed trait failed__
    extends StObject
       with AddOnResultStatus
       with AuthorizationDocumentStatus
       with BuildStatus
       with BuildStatusStatus
       with CallStatus
       with CommandStatus
       with CompositionStatus
       with DeliveryReceiptDeliveryStatus
       with typings.twilio.messageDeliveryReceiptMod.DeliveryReceiptDeliveryStatus
       with DependentHostedNumberOrderStatus
       with EsimProfileStatus
       with FeedbackSummaryStatus
       with HostedNumberOrderStatus
       with InteractionChannelChannelStatus
       with InteractionResourceStatus
       with IpCommandStatus
       with MediaProcessorStatus
       with MediaRecordingStatus
       with MessageInteractionResourceStatus
       with MessageStatus
       with ModelBuildStatus
       with typings.twilio.assistantModelBuildMod.ModelBuildStatus
       with ParticipantStatus
       with PlayerStreamerStatus
       with typings.twilio.v1RecordingMod.RecordingStatus
       with RoomRecordingStatus
       with typings.twilio.v1RoomMod.RoomRoomStatus
       with SessionStatus
       with SinkStatus
       with SmsCommandStatus
       with TranscriptionStatus
       with typings.twilio.accountTranscriptionMod.TranscriptionStatus
       with VerificationAttemptCallStatus
       with VerificationAttemptMessageStatus
  inline def failed__ : failed__ = "failed".asInstanceOf[failed__]
  
  @js.native
  sealed trait `false`
    extends StObject
       with ChannelWebhookEnabledType
       with typings.twilio.v2ServiceChannelMod.ChannelWebhookEnabledType
       with typings.twilio.serviceChannelMod.ChannelWebhookEnabledType
       with ConferenceBeep
       with ConversationRecord
       with ConversationWebhookEnabledType
       with typings.twilio.conversationMod.ConversationWebhookEnabledType
       with MemberWebhookEnabledType
       with typings.twilio.v2ServiceChannelMemberMod.MemberWebhookEnabledType
       with MessageWebhookEnabledType
       with typings.twilio.serviceChannelMessageMod.MessageWebhookEnabledType
       with typings.twilio.serviceConversationMessageMod.MessageWebhookEnabledType
       with typings.twilio.v2ServiceChannelMessageMod.MessageWebhookEnabledType
       with ParticipantWebhookEnabledType
       with typings.twilio.serviceConversationParticipantMod.ParticipantWebhookEnabledType
       with UserChannelWebhookEnabledType
       with UserWebhookEnabledType
       with typings.twilio.v1UserMod.UserWebhookEnabledType
       with typings.twilio.v2ServiceUserMod.UserWebhookEnabledType
       with typings.twilio.v1ServiceUserMod.UserWebhookEnabledType
  inline def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait fax
    extends StObject
       with IncomingPhoneNumberVoiceReceiveMode
       with LocalVoiceReceiveMode
       with MobileVoiceReceiveMode
       with TollFreeVoiceReceiveMode
  inline def fax: fax = "fax".asInstanceOf[fax]
  
  @js.native
  sealed trait fcm
    extends StObject
       with typings.twilio.bindingMod.BindingBindingType
       with BindingBindingType
       with typings.twilio.v2ServiceBindingMod.BindingBindingType
       with typings.twilio.serviceBindingMod.BindingBindingType
       with CredentialPushService
       with typings.twilio.v1CredentialMod.CredentialPushService
       with typings.twilio.v2CredentialMod.CredentialPushService
       with typings.twilio.notifyV1CredentialMod.CredentialPushService
       with typings.twilio.ipMessagingV1CredentialMod.CredentialPushService
       with CredentialPushType
       with FactorNotificationPlatforms
       with NewFactorNotificationPlatforms
       with UserBindingBindingType
       with typings.twilio.userUserBindingMod.UserBindingBindingType
  inline def fcm: fcm = "fcm".asInstanceOf[fcm]
  
  @js.native
  sealed trait fi
    extends StObject
       with DialRingTone
  inline def fi: fi = "fi".asInstanceOf[fi]
  
  @js.native
  sealed trait `fi-FI`
    extends StObject
       with GatherLanguage
       with SayLanguage
  inline def `fi-FI`: `fi-FI` = "fi-FI".asInstanceOf[`fi-FI`]
  
  @js.native
  sealed trait `fil-PH`
    extends StObject
       with GatherLanguage
  inline def `fil-PH`: `fil-PH` = "fil-PH".asInstanceOf[`fil-PH`]
  
  @js.native
  sealed trait first_page_uri extends StObject
  inline def first_page_uri: first_page_uri = "first_page_uri".asInstanceOf[first_page_uri]
  
  @js.native
  sealed trait fixed extends StObject
  inline def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait fleet
    extends StObject
       with UsageRecordGroup
  inline def fleet: fleet = "fleet".asInstanceOf[fleet]
  
  @js.native
  sealed trait flex
    extends StObject
       with WebhookTarget
  inline def flex: flex = "flex".asInstanceOf[flex]
  
  @js.native
  sealed trait `flex-usage`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `flex-usage`: `flex-usage` = "flex-usage".asInstanceOf[`flex-usage`]
  
  @js.native
  sealed trait foreign
    extends StObject
       with DependentPhoneNumberAddressRequirement
       with IncomingPhoneNumberAddressRequirement
       with LocalAddressRequirement
       with MobileAddressRequirement
       with PhoneNumberAddressRequirement
       with TollFreeAddressRequirement
  inline def foreign: foreign = "foreign".asInstanceOf[foreign]
  
  @js.native
  sealed trait `form-push` extends StObject
  inline def `form-push`: `form-push` = "form-push".asInstanceOf[`form-push`]
  
  @js.native
  sealed trait fr
    extends StObject
       with DialRingTone
  inline def fr: fr = "fr".asInstanceOf[fr]
  
  @js.native
  sealed trait `fr-CA`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `fr-CA`: `fr-CA` = "fr-CA".asInstanceOf[`fr-CA`]
  
  @js.native
  sealed trait `fr-FR`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `fr-FR`: `fr-FR` = "fr-FR".asInstanceOf[`fr-FR`]
  
  @js.native
  sealed trait fraction
    extends StObject
       with SsmlSayAsInterpretAs
  inline def fraction: fraction = "fraction".asInstanceOf[fraction]
  
  @js.native
  sealed trait frankfurt
    extends StObject
       with ParticipantEdgeLocation
       with RoomEdgeLocation
  inline def frankfurt: frankfurt = "frankfurt".asInstanceOf[frankfurt]
  
  @js.native
  sealed trait `fraud-lookups`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `fraud-lookups`: `fraud-lookups` = "fraud-lookups".asInstanceOf[`fraud-lookups`]
  
  @js.native
  sealed trait free extends StObject
  inline def free: free = "free".asInstanceOf[free]
  
  @js.native
  sealed trait `from-transferee`
    extends StObject
       with TrunkTransferCallerId
  inline def `from-transferee`: `from-transferee` = "from-transferee".asInstanceOf[`from-transferee`]
  
  @js.native
  sealed trait `from-transferor`
    extends StObject
       with TrunkTransferCallerId
  inline def `from-transferor`: `from-transferor` = "from-transferor".asInstanceOf[`from-transferor`]
  
  @js.native
  sealed trait from_sim
    extends StObject
       with CommandDirection
       with IpCommandDirection
       with SmsCommandDirection
  inline def from_sim: from_sim = "from_sim".asInstanceOf[from_sim]
  
  @js.native
  sealed trait gbm
    extends StObject
       with AddressConfigurationType
       with InteractionChannelType
  inline def gbm: gbm = "gbm".asInstanceOf[gbm]
  
  @js.native
  sealed trait gcm
    extends StObject
       with typings.twilio.bindingMod.BindingBindingType
       with BindingBindingType
       with typings.twilio.v2ServiceBindingMod.BindingBindingType
       with typings.twilio.serviceBindingMod.BindingBindingType
       with CredentialPushService
       with typings.twilio.v1CredentialMod.CredentialPushService
       with typings.twilio.v2CredentialMod.CredentialPushService
       with typings.twilio.notifyV1CredentialMod.CredentialPushService
       with typings.twilio.ipMessagingV1CredentialMod.CredentialPushService
       with CredentialPushType
       with UserBindingBindingType
       with typings.twilio.userUserBindingMod.UserBindingBindingType
  inline def gcm: gcm = "gcm".asInstanceOf[gcm]
  
  @js.native
  sealed trait `get-all`
    extends StObject
       with AuthorizedConnectAppPermission
       with ConnectAppPermission
  inline def `get-all`: `get-all` = "get-all".asInstanceOf[`get-all`]
  
  @js.native
  sealed trait get_
    extends StObject
       with HttpMethod
  inline def get_ : get_ = "get".asInstanceOf[get_]
  
  @js.native
  sealed trait `gl-ES`
    extends StObject
       with GatherLanguage
  inline def `gl-ES`: `gl-ES` = "gl-ES".asInstanceOf[`gl-ES`]
  
  @js.native
  sealed trait gll
    extends StObject
       with ParticipantTwilioRealm
       with RoomTwilioRealm
  inline def gll: gll = "gll".asInstanceOf[gll]
  
  @js.native
  sealed trait go
    extends StObject
       with RoomRoomType
       with typings.twilio.v1RoomMod.RoomRoomType
  inline def go: go = "go".asInstanceOf[go]
  
  @js.native
  sealed trait gr
    extends StObject
       with DialRingTone
  inline def gr: gr = "gr".asInstanceOf[gr]
  
  @js.native
  sealed trait group
    extends StObject
       with RoomRoomType
       with typings.twilio.v1RoomMod.RoomRoomType
  inline def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait `group-rooms`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `group-rooms`: `group-rooms` = "group-rooms".asInstanceOf[`group-rooms`]
  
  @js.native
  sealed trait `group-rooms-data-track`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `group-rooms-data-track`: `group-rooms-data-track` = "group-rooms-data-track".asInstanceOf[`group-rooms-data-track`]
  
  @js.native
  sealed trait `group-rooms-encrypted-media-recorded`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `group-rooms-encrypted-media-recorded`: `group-rooms-encrypted-media-recorded` = "group-rooms-encrypted-media-recorded".asInstanceOf[`group-rooms-encrypted-media-recorded`]
  
  @js.native
  sealed trait `group-rooms-media-downloaded`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `group-rooms-media-downloaded`: `group-rooms-media-downloaded` = "group-rooms-media-downloaded".asInstanceOf[`group-rooms-media-downloaded`]
  
  @js.native
  sealed trait `group-rooms-media-recorded`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `group-rooms-media-recorded`: `group-rooms-media-recorded` = "group-rooms-media-recorded".asInstanceOf[`group-rooms-media-recorded`]
  
  @js.native
  sealed trait `group-rooms-media-routed`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `group-rooms-media-routed`: `group-rooms-media-routed` = "group-rooms-media-routed".asInstanceOf[`group-rooms-media-routed`]
  
  @js.native
  sealed trait `group-rooms-media-stored`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `group-rooms-media-stored`: `group-rooms-media-stored` = "group-rooms-media-stored".asInstanceOf[`group-rooms-media-stored`]
  
  @js.native
  sealed trait `group-rooms-participant-minutes`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `group-rooms-participant-minutes`: `group-rooms-participant-minutes` = "group-rooms-participant-minutes".asInstanceOf[`group-rooms-participant-minutes`]
  
  @js.native
  sealed trait `group-rooms-recorded-minutes`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `group-rooms-recorded-minutes`: `group-rooms-recorded-minutes` = "group-rooms-recorded-minutes".asInstanceOf[`group-rooms-recorded-minutes`]
  
  @js.native
  sealed trait `group-small`
    extends StObject
       with typings.twilio.v1RoomMod.RoomRoomType
  inline def `group-small`: `group-small` = "group-small".asInstanceOf[`group-small`]
  
  @js.native
  sealed trait group_small
    extends StObject
       with RoomRoomType
  inline def group_small: group_small = "group_small".asInstanceOf[group_small]
  
  @js.native
  sealed trait `gu-IN`
    extends StObject
       with GatherLanguage
  inline def `gu-IN`: `gu-IN` = "gu-IN".asInstanceOf[`gu-IN`]
  
  @js.native
  sealed trait `he-IL`
    extends StObject
       with GatherLanguage
  inline def `he-IL`: `he-IL` = "he-IL".asInstanceOf[`he-IL`]
  
  @js.native
  sealed trait `hi-IN`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `hi-IN`: `hi-IN` = "hi-IN".asInstanceOf[`hi-IN`]
  
  @js.native
  sealed trait high
    extends StObject
       with NotificationPriority
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait high_jitter
    extends StObject
       with ConferenceTag
  inline def high_jitter: high_jitter = "high_jitter".asInstanceOf[high_jitter]
  
  @js.native
  sealed trait high_latency
    extends StObject
       with ConferenceTag
  inline def high_latency: high_latency = "high_latency".asInstanceOf[high_latency]
  
  @js.native
  sealed trait high_packet_loss
    extends StObject
       with ConferenceTag
  inline def high_packet_loss: high_packet_loss = "high_packet_loss".asInstanceOf[high_packet_loss]
  
  @js.native
  sealed trait hold
    extends StObject
       with ConferenceEvent
       with ReservationConferenceEvent
       with typings.twilio.workerReservationMod.ReservationConferenceEvent
  inline def hold: hold = "hold".asInstanceOf[hold]
  
  @js.native
  sealed trait hour
    extends StObject
       with UsageRecordGranularity
  inline def hour: hour = "hour".asInstanceOf[hour]
  
  @js.native
  sealed trait hourly
    extends StObject
       with typings.twilio.simUsageRecordMod.UsageRecordGranularity
       with typings.twilio.v1UsageRecordMod.UsageRecordGranularity
  inline def hourly: hourly = "hourly".asInstanceOf[hourly]
  
  @js.native
  sealed trait `hr-HR`
    extends StObject
       with GatherLanguage
  inline def `hr-HR`: `hr-HR` = "hr-HR".asInstanceOf[`hr-HR`]
  
  @js.native
  sealed trait hu
    extends StObject
       with DialRingTone
  inline def hu: hu = "hu".asInstanceOf[hu]
  
  @js.native
  sealed trait `hu-HU`
    extends StObject
       with GatherLanguage
  inline def `hu-HU`: `hu-HU` = "hu-HU".asInstanceOf[`hu-HU`]
  
  @js.native
  sealed trait human
    extends StObject
       with AnnotationAnsweredBy
  inline def human: human = "human".asInstanceOf[human]
  
  @js.native
  sealed trait `hy-AM`
    extends StObject
       with GatherLanguage
  inline def `hy-AM`: `hy-AM` = "hy-AM".asInstanceOf[`hy-AM`]
  
  @js.native
  sealed trait `id-ID`
    extends StObject
       with GatherLanguage
  inline def `id-ID`: `id-ID` = "id-ID".asInstanceOf[`id-ID`]
  
  @js.native
  sealed trait ie1
    extends StObject
       with ConferenceParticipantRegion
       with ConferenceRegion
       with typings.twilio.voiceResponseMod.ConferenceRegion
       with ParticipantTwilioRealm
       with RoomTwilioRealm
  inline def ie1: ie1 = "ie1".asInstanceOf[ie1]
  
  @js.native
  sealed trait il
    extends StObject
       with DialRingTone
  inline def il: il = "il".asInstanceOf[il]
  
  @js.native
  sealed trait imageSlashtiff
    extends StObject
       with ReceiveMediaType
  inline def imageSlashtiff: imageSlashtiff = "image/tiff".asInstanceOf[imageSlashtiff]
  
  @js.native
  sealed trait `imp-v1-usage`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `imp-v1-usage`: `imp-v1-usage` = "imp-v1-usage".asInstanceOf[`imp-v1-usage`]
  
  @js.native
  sealed trait `imperfect-audio`
    extends StObject
       with FeedbackIssues
  inline def `imperfect-audio`: `imperfect-audio` = "imperfect-audio".asInstanceOf[`imperfect-audio`]
  
  @js.native
  sealed trait in
    extends StObject
       with DialRingTone
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait `in-progress`
    extends StObject
       with AddOnResultStatus
       with CallStatus
       with ConferenceRecordingEvent
       with ConferenceStatus
       with ConversationRecordingEvent
       with DialRecordingEvent
       with FeedbackSummaryStatus
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with RecordRecordingEvent
       with RecordingStatus
       with typings.twilio.recordingMod.RecordingStatus
       with typings.twilio.conferenceRecordingMod.RecordingStatus
       with typings.twilio.v1RoomMod.RoomRoomStatus
       with SessionStatus
       with SiprecStatus
       with StreamStatus
       with TranscriptionStatus
       with typings.twilio.accountTranscriptionMod.TranscriptionStatus
       with VerificationAttemptCallStatus
  inline def `in-progress`: `in-progress` = "in-progress".asInstanceOf[`in-progress`]
  
  @js.native
  sealed trait `in-review`
    extends StObject
       with BundleCopyStatus
       with BundleStatus
       with CustomerProfilesStatus
       with ReplaceItemsStatus
       with TrustProductsStatus
  inline def `in-review`: `in-review` = "in-review".asInstanceOf[`in-review`]
  
  @js.native
  sealed trait in1
    extends StObject
       with ParticipantTwilioRealm
       with RoomTwilioRealm
  inline def in1: in1 = "in1".asInstanceOf[in1]
  
  @js.native
  sealed trait in_progress
    extends StObject
       with ConferenceConferenceStatus
       with ConferenceParticipantProcessingState
       with ConferenceProcessingState
       with ParticipantRoomStatus
       with RoomProcessingState
       with RoomRoomStatus
  inline def in_progress: in_progress = "in_progress".asInstanceOf[in_progress]
  
  @js.native
  sealed trait inactive_
    extends StObject
       with ConversationState
       with typings.twilio.conversationMod.ConversationState
       with ParticipantConversationState
       with typings.twilio.participantConversationMod.ParticipantConversationState
       with SimStatus
       with SimStatusUpdate
       with UserConversationState
       with typings.twilio.userUserConversationMod.UserConversationState
  inline def inactive_ : inactive_ = "inactive".asInstanceOf[inactive_]
  
  @js.native
  sealed trait inbound
    extends StObject
       with CallSummariesCallDirection
       with ConferenceParticipantCallDirection
       with DialRecordingTrack
       with MessageDirection
       with MetricStreamDirection
  inline def inbound: inbound = "inbound".asInstanceOf[inbound]
  
  @js.native
  sealed trait inbound_track
    extends StObject
       with SiprecTrack
       with typings.twilio.siprecMod.SiprecTrack
       with StreamTrack
       with typings.twilio.voiceResponseMod.StreamTrack
  inline def inbound_track: inbound_track = "inbound_track".asInstanceOf[inbound_track]
  
  @js.native
  sealed trait inclusive
    extends StObject
       with SyncListItemQueryFromBoundType
       with typings.twilio.syncListItemMod.SyncListItemQueryFromBoundType
       with SyncMapItemQueryFromBoundType
       with typings.twilio.syncMapItemMod.SyncMapItemQueryFromBoundType
  inline def inclusive: inclusive = "inclusive".asInstanceOf[inclusive]
  
  @js.native
  sealed trait `incorrect-caller-id`
    extends StObject
       with FeedbackIssues
  inline def `incorrect-caller-id`: `incorrect-caller-id` = "incorrect-caller-id".asInstanceOf[`incorrect-caller-id`]
  
  @js.native
  sealed trait individual
    extends StObject
       with BundleCopyEndUserType
       with BundleEndUserType
       with CustomerProfilesEndUserType
       with EndUserType
       with PoliciesEndUserType
       with RegulationEndUserType
       with ReplaceItemsEndUserType
       with TrustProductsEndUserType
  inline def individual: individual = "individual".asInstanceOf[individual]
  
  @js.native
  sealed trait info_
    extends StObject
       with LogLevel
  inline def info_ : info_ = "info".asInstanceOf[info_]
  
  @js.native
  sealed trait inherit
    extends StObject
       with ServiceScanMessageContent
  inline def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait init
    extends StObject
       with AddOnResultStatus
       with ConferenceStatus
  inline def init: init = "init".asInstanceOf[init]
  
  @js.native
  sealed trait initialized
    extends StObject
       with SinkStatus
  inline def initialized: initialized = "initialized".asInstanceOf[initialized]
  
  @js.native
  sealed trait initiated
    extends StObject
       with CallEvent
       with ClientEvent
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with NumberEvent
       with ReservationCallStatus
       with typings.twilio.workerReservationMod.ReservationCallStatus
       with SipEvent
  inline def initiated: initiated = "initiated".asInstanceOf[initiated]
  
  @js.native
  sealed trait inprogress
    extends StObject
       with ConfigurationStatus
  inline def inprogress: inprogress = "inprogress".asInstanceOf[inprogress]
  
  @js.native
  sealed trait installed
    extends StObject
       with EsimProfileStatus
  inline def installed: installed = "installed".asInstanceOf[installed]
  
  @js.native
  sealed trait `internal-error`
    extends StObject
       with PromptErrorType
  inline def `internal-error`: `internal-error` = "internal-error".asInstanceOf[`internal-error`]
  
  @js.native
  sealed trait `invalid-card-number`
    extends StObject
       with PromptErrorType
  inline def `invalid-card-number`: `invalid-card-number` = "invalid-card-number".asInstanceOf[`invalid-card-number`]
  
  @js.native
  sealed trait `invalid-card-type`
    extends StObject
       with PromptErrorType
  inline def `invalid-card-type`: `invalid-card-type` = "invalid-card-type".asInstanceOf[`invalid-card-type`]
  
  @js.native
  sealed trait `invalid-date`
    extends StObject
       with PromptErrorType
  inline def `invalid-date`: `invalid-date` = "invalid-date".asInstanceOf[`invalid-date`]
  
  @js.native
  sealed trait `invalid-security-code`
    extends StObject
       with PromptErrorType
  inline def `invalid-security-code`: `invalid-security-code` = "invalid-security-code".asInstanceOf[`invalid-security-code`]
  
  @js.native
  sealed trait invalid_number
    extends StObject
       with AnnotationConnectivityIssue
  inline def invalid_number: invalid_number = "invalid_number".asInstanceOf[invalid_number]
  
  @js.native
  sealed trait invalid_requested_region
    extends StObject
       with ConferenceTag
  inline def invalid_requested_region: invalid_requested_region = "invalid_requested_region".asInstanceOf[invalid_requested_region]
  
  @js.native
  sealed trait invited
    extends StObject
       with UserChannelChannelStatus
       with typings.twilio.userChannelMod.UserChannelChannelStatus
       with typings.twilio.userUserChannelMod.UserChannelChannelStatus
       with typings.twilio.v2ServiceUserUserChannelMod.UserChannelChannelStatus
  inline def invited: invited = "invited".asInstanceOf[invited]
  
  @js.native
  sealed trait ip
    extends StObject
       with CommandTransport
  inline def ip: ip = "ip".asInstanceOf[ip]
  
  @js.native
  sealed trait ip_messaging extends StObject
  inline def ip_messaging: ip_messaging = "ip_messaging".asInstanceOf[ip_messaging]
  
  @js.native
  sealed trait ipa
    extends StObject
       with SsmlPhonemeAlphabet
  inline def ipa: ipa = "ipa".asInstanceOf[ipa]
  
  @js.native
  sealed trait `is-IS`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `is-IS`: `is-IS` = "is-IS".asInstanceOf[`is-IS`]
  
  @js.native
  sealed trait isoCountry
    extends StObject
       with UsageRecordGroup
  inline def isoCountry: isoCountry = "isoCountry".asInstanceOf[isoCountry]
  
  @js.native
  sealed trait it
    extends StObject
       with DialRingTone
  inline def it: it = "it".asInstanceOf[it]
  
  @js.native
  sealed trait `it-IT`
    extends StObject
       with GatherLanguage
       with PayLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `it-IT`: `it-IT` = "it-IT".asInstanceOf[`it-IT`]
  
  @js.native
  sealed trait `ja-JP`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `ja-JP`: `ja-JP` = "ja-JP".asInstanceOf[`ja-JP`]
  
  @js.native
  sealed trait jcb
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def jcb: jcb = "jcb".asInstanceOf[jcb]
  
  @js.native
  sealed trait join
    extends StObject
       with ConferenceEvent
       with ReservationConferenceEvent
       with typings.twilio.workerReservationMod.ReservationConferenceEvent
  inline def join: join = "join".asInstanceOf[join]
  
  @js.native
  sealed trait joined
    extends StObject
       with UserChannelChannelStatus
       with typings.twilio.userChannelMod.UserChannelChannelStatus
       with typings.twilio.userUserChannelMod.UserChannelChannelStatus
       with typings.twilio.v2ServiceUserUserChannelMod.UserChannelChannelStatus
  inline def joined: joined = "joined".asInstanceOf[joined]
  
  @js.native
  sealed trait jp
    extends StObject
       with DialRingTone
  inline def jp: jp = "jp".asInstanceOf[jp]
  
  @js.native
  sealed trait jp1
    extends StObject
       with ConferenceParticipantRegion
       with ConferenceRegion
       with typings.twilio.voiceResponseMod.ConferenceRegion
       with ParticipantTwilioRealm
       with RoomTwilioRealm
  inline def jp1: jp1 = "jp1".asInstanceOf[jp1]
  
  @js.native
  sealed trait `jv-ID`
    extends StObject
       with GatherLanguage
  inline def `jv-ID`: `jv-ID` = "jv-ID".asInstanceOf[`jv-ID`]
  
  @js.native
  sealed trait `ka-GE`
    extends StObject
       with GatherLanguage
  inline def `ka-GE`: `ka-GE` = "ka-GE".asInstanceOf[`ka-GE`]
  
  @js.native
  sealed trait kinesis
    extends StObject
       with SinkSinkType
  inline def kinesis: kinesis = "kinesis".asInstanceOf[kinesis]
  
  @js.native
  sealed trait `km-KH`
    extends StObject
       with GatherLanguage
  inline def `km-KH`: `km-KH` = "km-KH".asInstanceOf[`km-KH`]
  
  @js.native
  sealed trait `kn-IN`
    extends StObject
       with GatherLanguage
  inline def `kn-IN`: `kn-IN` = "kn-IN".asInstanceOf[`kn-IN`]
  
  @js.native
  sealed trait `ko-KR`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `ko-KR`: `ko-KR` = "ko-KR".asInstanceOf[`ko-KR`]
  
  @js.native
  sealed trait landline
    extends StObject
       with PhoneNumberType
       with typings.twilio.phoneNumberMod.PhoneNumberType
  inline def landline: landline = "landline".asInstanceOf[landline]
  
  @js.native
  sealed trait large
    extends StObject
       with ConferenceJitterBufferSize
       with ConferenceParticipantJitterBufferSize
  inline def large: large = "large".asInstanceOf[large]
  
  @js.native
  sealed trait `last-participant-kicked`
    extends StObject
       with ConferenceReasonConferenceEnded
  inline def `last-participant-kicked`: `last-participant-kicked` = "last-participant-kicked".asInstanceOf[`last-participant-kicked`]
  
  @js.native
  sealed trait `last-participant-left`
    extends StObject
       with ConferenceReasonConferenceEnded
  inline def `last-participant-left`: `last-participant-left` = "last-participant-left".asInstanceOf[`last-participant-left`]
  
  @js.native
  sealed trait last_page_uri extends StObject
  inline def last_page_uri: last_page_uri = "last_page_uri".asInstanceOf[last_page_uri]
  
  @js.native
  sealed trait last_participant_kicked
    extends StObject
       with ConferenceConferenceEndReason
  inline def last_participant_kicked: last_participant_kicked = "last_participant_kicked".asInstanceOf[last_participant_kicked]
  
  @js.native
  sealed trait last_participant_left
    extends StObject
       with ConferenceConferenceEndReason
  inline def last_participant_left: last_participant_left = "last_participant_left".asInstanceOf[last_participant_left]
  
  @js.native
  sealed trait latency
    extends StObject
       with AnnotationQualityIssues
  inline def latency: latency = "latency".asInstanceOf[latency]
  
  @js.native
  sealed trait leave
    extends StObject
       with ConferenceEvent
       with ReservationConferenceEvent
       with typings.twilio.workerReservationMod.ReservationConferenceEvent
  inline def leave: leave = "leave".asInstanceOf[leave]
  
  @js.native
  sealed trait legal
    extends StObject
       with ReceivePageSize
  inline def legal: legal = "legal".asInstanceOf[legal]
  
  @js.native
  sealed trait letter
    extends StObject
       with ReceivePageSize
  inline def letter: letter = "letter".asInstanceOf[letter]
  
  @js.native
  sealed trait line
    extends StObject
       with FlexFlowChannelType
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait `lo-LA`
    extends StObject
       with GatherLanguage
  inline def `lo-LA`: `lo-LA` = "lo-LA".asInstanceOf[`lo-LA`]
  
  @js.native
  sealed trait local
    extends StObject
       with DependentPhoneNumberAddressRequirement
       with IncomingPhoneNumberAddressRequirement
       with LocalAddressRequirement
       with MobileAddressRequirement
       with PhoneNumberAddressRequirement
       with TollFreeAddressRequirement
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait lookups
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def lookups: lookups = "lookups".asInstanceOf[lookups]
  
  @js.native
  sealed trait low
    extends StObject
       with NotificationPriority
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait low_mos
    extends StObject
       with ConferenceTag
  inline def low_mos: low_mos = "low_mos".asInstanceOf[low_mos]
  
  @js.native
  sealed trait low_volume
    extends StObject
       with AnnotationQualityIssues
  inline def low_volume: low_volume = "low_volume".asInstanceOf[low_volume]
  
  @js.native
  sealed trait lt
    extends StObject
       with DialRingTone
  inline def lt: lt = "lt".asInstanceOf[lt]
  
  @js.native
  sealed trait `lt-LT`
    extends StObject
       with GatherLanguage
  inline def `lt-LT`: `lt-LT` = "lt-LT".asInstanceOf[`lt-LT`]
  
  @js.native
  sealed trait `lv-LV`
    extends StObject
       with GatherLanguage
  inline def `lv-LV`: `lv-LV` = "lv-LV".asInstanceOf[`lv-LV`]
  
  @js.native
  sealed trait m
    extends StObject
       with SsmlSayAsRole
  inline def m: m = "m".asInstanceOf[m]
  
  @js.native
  sealed trait machine
    extends StObject
       with AnnotationAnsweredBy
  inline def machine: machine = "machine".asInstanceOf[machine]
  
  @js.native
  sealed trait maestro
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def maestro: maestro = "maestro".asInstanceOf[maestro]
  
  @js.native
  sealed trait man
    extends StObject
       with SayVoice
  inline def man: man = "man".asInstanceOf[man]
  
  @js.native
  sealed trait marketplace
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def marketplace: marketplace = "marketplace".asInstanceOf[marketplace]
  
  @js.native
  sealed trait `marketplace-algorithmia-named-entity-recognition`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-algorithmia-named-entity-recognition`: `marketplace-algorithmia-named-entity-recognition` = "marketplace-algorithmia-named-entity-recognition".asInstanceOf[`marketplace-algorithmia-named-entity-recognition`]
  
  @js.native
  sealed trait `marketplace-cadence-transcription`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-cadence-transcription`: `marketplace-cadence-transcription` = "marketplace-cadence-transcription".asInstanceOf[`marketplace-cadence-transcription`]
  
  @js.native
  sealed trait `marketplace-cadence-translation`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-cadence-translation`: `marketplace-cadence-translation` = "marketplace-cadence-translation".asInstanceOf[`marketplace-cadence-translation`]
  
  @js.native
  sealed trait `marketplace-capio-speech-to-text`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-capio-speech-to-text`: `marketplace-capio-speech-to-text` = "marketplace-capio-speech-to-text".asInstanceOf[`marketplace-capio-speech-to-text`]
  
  @js.native
  sealed trait `marketplace-convriza-ababa`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-convriza-ababa`: `marketplace-convriza-ababa` = "marketplace-convriza-ababa".asInstanceOf[`marketplace-convriza-ababa`]
  
  @js.native
  sealed trait `marketplace-deepgram-phrase-detector`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-deepgram-phrase-detector`: `marketplace-deepgram-phrase-detector` = "marketplace-deepgram-phrase-detector".asInstanceOf[`marketplace-deepgram-phrase-detector`]
  
  @js.native
  sealed trait `marketplace-digital-segment-business-info`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-digital-segment-business-info`: `marketplace-digital-segment-business-info` = "marketplace-digital-segment-business-info".asInstanceOf[`marketplace-digital-segment-business-info`]
  
  @js.native
  sealed trait `marketplace-facebook-offline-conversions`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-facebook-offline-conversions`: `marketplace-facebook-offline-conversions` = "marketplace-facebook-offline-conversions".asInstanceOf[`marketplace-facebook-offline-conversions`]
  
  @js.native
  sealed trait `marketplace-google-speech-to-text`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-google-speech-to-text`: `marketplace-google-speech-to-text` = "marketplace-google-speech-to-text".asInstanceOf[`marketplace-google-speech-to-text`]
  
  @js.native
  sealed trait `marketplace-ibm-watson-message-insights`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-ibm-watson-message-insights`: `marketplace-ibm-watson-message-insights` = "marketplace-ibm-watson-message-insights".asInstanceOf[`marketplace-ibm-watson-message-insights`]
  
  @js.native
  sealed trait `marketplace-ibm-watson-message-sentiment`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-ibm-watson-message-sentiment`: `marketplace-ibm-watson-message-sentiment` = "marketplace-ibm-watson-message-sentiment".asInstanceOf[`marketplace-ibm-watson-message-sentiment`]
  
  @js.native
  sealed trait `marketplace-ibm-watson-recording-analysis`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-ibm-watson-recording-analysis`: `marketplace-ibm-watson-recording-analysis` = "marketplace-ibm-watson-recording-analysis".asInstanceOf[`marketplace-ibm-watson-recording-analysis`]
  
  @js.native
  sealed trait `marketplace-ibm-watson-tone-analyzer`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-ibm-watson-tone-analyzer`: `marketplace-ibm-watson-tone-analyzer` = "marketplace-ibm-watson-tone-analyzer".asInstanceOf[`marketplace-ibm-watson-tone-analyzer`]
  
  @js.native
  sealed trait `marketplace-icehook-systems-scout`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-icehook-systems-scout`: `marketplace-icehook-systems-scout` = "marketplace-icehook-systems-scout".asInstanceOf[`marketplace-icehook-systems-scout`]
  
  @js.native
  sealed trait `marketplace-infogroup-dataaxle-bizinfo`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-infogroup-dataaxle-bizinfo`: `marketplace-infogroup-dataaxle-bizinfo` = "marketplace-infogroup-dataaxle-bizinfo".asInstanceOf[`marketplace-infogroup-dataaxle-bizinfo`]
  
  @js.native
  sealed trait `marketplace-keen-io-contact-center-analytics`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-keen-io-contact-center-analytics`: `marketplace-keen-io-contact-center-analytics` = "marketplace-keen-io-contact-center-analytics".asInstanceOf[`marketplace-keen-io-contact-center-analytics`]
  
  @js.native
  sealed trait `marketplace-marchex-cleancall`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-marchex-cleancall`: `marketplace-marchex-cleancall` = "marketplace-marchex-cleancall".asInstanceOf[`marketplace-marchex-cleancall`]
  
  @js.native
  sealed trait `marketplace-marchex-sentiment-analysis-for-sms`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-marchex-sentiment-analysis-for-sms`: `marketplace-marchex-sentiment-analysis-for-sms` = "marketplace-marchex-sentiment-analysis-for-sms".asInstanceOf[`marketplace-marchex-sentiment-analysis-for-sms`]
  
  @js.native
  sealed trait `marketplace-marketplace-nextcaller-social-id`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-marketplace-nextcaller-social-id`: `marketplace-marketplace-nextcaller-social-id` = "marketplace-marketplace-nextcaller-social-id".asInstanceOf[`marketplace-marketplace-nextcaller-social-id`]
  
  @js.native
  sealed trait `marketplace-mobile-commons-opt-out-classifier`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-mobile-commons-opt-out-classifier`: `marketplace-mobile-commons-opt-out-classifier` = "marketplace-mobile-commons-opt-out-classifier".asInstanceOf[`marketplace-mobile-commons-opt-out-classifier`]
  
  @js.native
  sealed trait `marketplace-nexiwave-voicemail-to-text`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-nexiwave-voicemail-to-text`: `marketplace-nexiwave-voicemail-to-text` = "marketplace-nexiwave-voicemail-to-text".asInstanceOf[`marketplace-nexiwave-voicemail-to-text`]
  
  @js.native
  sealed trait `marketplace-nextcaller-advanced-caller-identification`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-nextcaller-advanced-caller-identification`: `marketplace-nextcaller-advanced-caller-identification` = "marketplace-nextcaller-advanced-caller-identification".asInstanceOf[`marketplace-nextcaller-advanced-caller-identification`]
  
  @js.native
  sealed trait `marketplace-nomorobo-spam-score`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-nomorobo-spam-score`: `marketplace-nomorobo-spam-score` = "marketplace-nomorobo-spam-score".asInstanceOf[`marketplace-nomorobo-spam-score`]
  
  @js.native
  sealed trait `marketplace-payfone-tcpa-compliance`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-payfone-tcpa-compliance`: `marketplace-payfone-tcpa-compliance` = "marketplace-payfone-tcpa-compliance".asInstanceOf[`marketplace-payfone-tcpa-compliance`]
  
  @js.native
  sealed trait `marketplace-remeeting-automatic-speech-recognition`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-remeeting-automatic-speech-recognition`: `marketplace-remeeting-automatic-speech-recognition` = "marketplace-remeeting-automatic-speech-recognition".asInstanceOf[`marketplace-remeeting-automatic-speech-recognition`]
  
  @js.native
  sealed trait `marketplace-tcpa-defense-solutions-blacklist-feed`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-tcpa-defense-solutions-blacklist-feed`: `marketplace-tcpa-defense-solutions-blacklist-feed` = "marketplace-tcpa-defense-solutions-blacklist-feed".asInstanceOf[`marketplace-tcpa-defense-solutions-blacklist-feed`]
  
  @js.native
  sealed trait `marketplace-telo-opencnam`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-telo-opencnam`: `marketplace-telo-opencnam` = "marketplace-telo-opencnam".asInstanceOf[`marketplace-telo-opencnam`]
  
  @js.native
  sealed trait `marketplace-truecnam-true-spam`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-truecnam-true-spam`: `marketplace-truecnam-true-spam` = "marketplace-truecnam-true-spam".asInstanceOf[`marketplace-truecnam-true-spam`]
  
  @js.native
  sealed trait `marketplace-twilio-caller-name-lookup-us`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-twilio-caller-name-lookup-us`: `marketplace-twilio-caller-name-lookup-us` = "marketplace-twilio-caller-name-lookup-us".asInstanceOf[`marketplace-twilio-caller-name-lookup-us`]
  
  @js.native
  sealed trait `marketplace-twilio-carrier-information-lookup`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-twilio-carrier-information-lookup`: `marketplace-twilio-carrier-information-lookup` = "marketplace-twilio-carrier-information-lookup".asInstanceOf[`marketplace-twilio-carrier-information-lookup`]
  
  @js.native
  sealed trait `marketplace-voicebase-pci`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-voicebase-pci`: `marketplace-voicebase-pci` = "marketplace-voicebase-pci".asInstanceOf[`marketplace-voicebase-pci`]
  
  @js.native
  sealed trait `marketplace-voicebase-transcription`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-voicebase-transcription`: `marketplace-voicebase-transcription` = "marketplace-voicebase-transcription".asInstanceOf[`marketplace-voicebase-transcription`]
  
  @js.native
  sealed trait `marketplace-voicebase-transcription-custom-vocabulary`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-voicebase-transcription-custom-vocabulary`: `marketplace-voicebase-transcription-custom-vocabulary` = "marketplace-voicebase-transcription-custom-vocabulary".asInstanceOf[`marketplace-voicebase-transcription-custom-vocabulary`]
  
  @js.native
  sealed trait `marketplace-whitepages-pro-caller-identification`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-whitepages-pro-caller-identification`: `marketplace-whitepages-pro-caller-identification` = "marketplace-whitepages-pro-caller-identification".asInstanceOf[`marketplace-whitepages-pro-caller-identification`]
  
  @js.native
  sealed trait `marketplace-whitepages-pro-phone-intelligence`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-whitepages-pro-phone-intelligence`: `marketplace-whitepages-pro-phone-intelligence` = "marketplace-whitepages-pro-phone-intelligence".asInstanceOf[`marketplace-whitepages-pro-phone-intelligence`]
  
  @js.native
  sealed trait `marketplace-whitepages-pro-phone-reputation`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-whitepages-pro-phone-reputation`: `marketplace-whitepages-pro-phone-reputation` = "marketplace-whitepages-pro-phone-reputation".asInstanceOf[`marketplace-whitepages-pro-phone-reputation`]
  
  @js.native
  sealed trait `marketplace-wolfarm-spoken-results`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-wolfarm-spoken-results`: `marketplace-wolfarm-spoken-results` = "marketplace-wolfarm-spoken-results".asInstanceOf[`marketplace-wolfarm-spoken-results`]
  
  @js.native
  sealed trait `marketplace-wolfram-short-answer`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-wolfram-short-answer`: `marketplace-wolfram-short-answer` = "marketplace-wolfram-short-answer".asInstanceOf[`marketplace-wolfram-short-answer`]
  
  @js.native
  sealed trait `marketplace-ytica-contact-center-reporting-analytics`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `marketplace-ytica-contact-center-reporting-analytics`: `marketplace-ytica-contact-center-reporting-analytics` = "marketplace-ytica-contact-center-reporting-analytics".asInstanceOf[`marketplace-ytica-contact-center-reporting-analytics`]
  
  @js.native
  sealed trait mastercard
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def mastercard: mastercard = "mastercard".asInstanceOf[mastercard]
  
  @js.native
  sealed trait `max-duration-exceeded`
    extends StObject
       with PlayerStreamerEndedReason
  inline def `max-duration-exceeded`: `max-duration-exceeded` = "max-duration-exceeded".asInstanceOf[`max-duration-exceeded`]
  
  @js.native
  sealed trait md
    extends StObject
       with SsmlSayAsRole
  inline def md: md = "md".asInstanceOf[md]
  
  @js.native
  sealed trait mdy
    extends StObject
       with SsmlSayAsRole
  inline def mdy: mdy = "mdy".asInstanceOf[mdy]
  
  @js.native
  sealed trait mediastorage
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def mediastorage: mediastorage = "mediastorage".asInstanceOf[mediastorage]
  
  @js.native
  sealed trait medium
    extends StObject
       with ConferenceJitterBufferSize
       with ConferenceParticipantJitterBufferSize
       with SsmlBreakStrength
  inline def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait message
    extends StObject
       with InteractionType
       with MessageInteractionType
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait `message-only`
    extends StObject
       with SessionMode
  inline def `message-only`: `message-only` = "message-only".asInstanceOf[`message-only`]
  
  @js.native
  sealed trait messenger
    extends StObject
       with AddressConfigurationType
       with InteractionChannelType
  inline def messenger: messenger = "messenger".asInstanceOf[messenger]
  
  @js.native
  sealed trait `mk-MK`
    extends StObject
       with GatherLanguage
  inline def `mk-MK`: `mk-MK` = "mk-MK".asInstanceOf[`mk-MK`]
  
  @js.native
  sealed trait mka
    extends StObject
       with RecordingFormat
       with RoomRecordingFormat
  inline def mka: mka = "mka".asInstanceOf[mka]
  
  @js.native
  sealed trait mkv
    extends StObject
       with RecordingFormat
       with RoomRecordingFormat
  inline def mkv: mkv = "mkv".asInstanceOf[mkv]
  
  @js.native
  sealed trait `ml-IN`
    extends StObject
       with GatherLanguage
  inline def `ml-IN`: `ml-IN` = "ml-IN".asInstanceOf[`ml-IN`]
  
  @js.native
  sealed trait mms
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def mms: mms = "mms".asInstanceOf[mms]
  
  @js.native
  sealed trait `mms-inbound`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `mms-inbound`: `mms-inbound` = "mms-inbound".asInstanceOf[`mms-inbound`]
  
  @js.native
  sealed trait `mms-inbound-longcode`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `mms-inbound-longcode`: `mms-inbound-longcode` = "mms-inbound-longcode".asInstanceOf[`mms-inbound-longcode`]
  
  @js.native
  sealed trait `mms-inbound-shortcode`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `mms-inbound-shortcode`: `mms-inbound-shortcode` = "mms-inbound-shortcode".asInstanceOf[`mms-inbound-shortcode`]
  
  @js.native
  sealed trait `mms-messages-carrierfees`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `mms-messages-carrierfees`: `mms-messages-carrierfees` = "mms-messages-carrierfees".asInstanceOf[`mms-messages-carrierfees`]
  
  @js.native
  sealed trait `mms-outbound`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `mms-outbound`: `mms-outbound` = "mms-outbound".asInstanceOf[`mms-outbound`]
  
  @js.native
  sealed trait `mms-outbound-longcode`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `mms-outbound-longcode`: `mms-outbound-longcode` = "mms-outbound-longcode".asInstanceOf[`mms-outbound-longcode`]
  
  @js.native
  sealed trait `mms-outbound-shortcode`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `mms-outbound-shortcode`: `mms-outbound-shortcode` = "mms-outbound-shortcode".asInstanceOf[`mms-outbound-shortcode`]
  
  @js.native
  sealed trait `mn-MN`
    extends StObject
       with GatherLanguage
  inline def `mn-MN`: `mn-MN` = "mn-MN".asInstanceOf[`mn-MN`]
  
  @js.native
  sealed trait mobile
    extends StObject
       with PhoneNumberType
       with typings.twilio.phoneNumberMod.PhoneNumberType
  inline def mobile: mobile = "mobile".asInstanceOf[mobile]
  
  @js.native
  sealed trait moderate
    extends StObject
       with SsmlEmphasisLevel
  inline def moderate: moderate = "moderate".asInstanceOf[moderate]
  
  @js.native
  sealed trait modify
    extends StObject
       with ConferenceEvent
  inline def modify: modify = "modify".asInstanceOf[modify]
  
  @js.native
  sealed trait monitor
    extends StObject
       with ReservationSupervisorMode
  inline def monitor: monitor = "monitor".asInstanceOf[monitor]
  
  @js.native
  sealed trait `monitor-reads`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `monitor-reads`: `monitor-reads` = "monitor-reads".asInstanceOf[`monitor-reads`]
  
  @js.native
  sealed trait `monitor-storage`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `monitor-storage`: `monitor-storage` = "monitor-storage".asInstanceOf[`monitor-storage`]
  
  @js.native
  sealed trait `monitor-writes`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `monitor-writes`: `monitor-writes` = "monitor-writes".asInstanceOf[`monitor-writes`]
  
  @js.native
  sealed trait monthly
    extends StObject
       with TriggerRecurring
  inline def monthly: monthly = "monthly".asInstanceOf[monthly]
  
  @js.native
  sealed trait mp4
    extends StObject
       with CompositionFormat
       with CompositionHookFormat
       with MediaRecordingFormat
  inline def mp4: mp4 = "mp4".asInstanceOf[mp4]
  
  @js.native
  sealed trait `mr-IN`
    extends StObject
       with GatherLanguage
  inline def `mr-IN`: `mr-IN` = "mr-IN".asInstanceOf[`mr-IN`]
  
  @js.native
  sealed trait `ms-MY`
    extends StObject
       with GatherLanguage
  inline def `ms-MY`: `ms-MY` = "ms-MY".asInstanceOf[`ms-MY`]
  
  @js.native
  sealed trait mute
    extends StObject
       with ConferenceEvent
       with ReservationConferenceEvent
       with typings.twilio.workerReservationMod.ReservationConferenceEvent
  inline def mute: mute = "mute".asInstanceOf[mute]
  
  @js.native
  sealed trait muted
    extends StObject
       with UserChannelNotificationLevel
       with typings.twilio.v2ServiceUserUserChannelMod.UserChannelNotificationLevel
       with UserConversationNotificationLevel
       with typings.twilio.userUserConversationMod.UserConversationNotificationLevel
  inline def muted: muted = "muted".asInstanceOf[muted]
  
  @js.native
  sealed trait mx
    extends StObject
       with DialRingTone
  inline def mx: mx = "mx".asInstanceOf[mx]
  
  @js.native
  sealed trait my
    extends StObject
       with DialRingTone
       with SsmlSayAsRole
  inline def my: my = "my".asInstanceOf[my]
  
  @js.native
  sealed trait `my-MM`
    extends StObject
       with GatherLanguage
  inline def `my-MM`: `my-MM` = "my-MM".asInstanceOf[`my-MM`]
  
  @js.native
  sealed trait `nar-IQ`
    extends StObject
       with GatherLanguage
  inline def `nar-IQ`: `nar-IQ` = "nar-IQ".asInstanceOf[`nar-IQ`]
  
  @js.native
  sealed trait `nb-NO`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `nb-NO`: `nb-NO` = "nb-NO".asInstanceOf[`nb-NO`]
  
  @js.native
  sealed trait `ne-NP`
    extends StObject
       with GatherLanguage
  inline def `ne-NP`: `ne-NP` = "ne-NP".asInstanceOf[`ne-NP`]
  
  @js.native
  sealed trait network
    extends StObject
       with UsageRecordGroup
  inline def network: network = "network".asInstanceOf[network]
  
  @js.native
  sealed trait `new`
    extends StObject
       with EsimProfileStatus
       with SimStatus
       with typings.twilio.wirelessV1SimMod.SimStatus
  inline def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait next_page_uri extends StObject
  inline def next_page_uri: next_page_uri = "next_page_uri".asInstanceOf[next_page_uri]
  
  @js.native
  sealed trait nl
    extends StObject
       with DialRingTone
  inline def nl: nl = "nl".asInstanceOf[nl]
  
  @js.native
  sealed trait `nl-BE`
    extends StObject
       with GatherLanguage
  inline def `nl-BE`: `nl-BE` = "nl-BE".asInstanceOf[`nl-BE`]
  
  @js.native
  sealed trait `nl-NL`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `nl-NL`: `nl-NL` = "nl-NL".asInstanceOf[`nl-NL`]
  
  @js.native
  sealed trait no
    extends StObject
       with DialRingTone
  inline def no: no = "no".asInstanceOf[no]
  
  @js.native
  sealed trait `no-answer`
    extends StObject
       with CallStatus
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with VerificationAttemptCallStatus
  inline def `no-answer`: `no-answer` = "no-answer".asInstanceOf[`no-answer`]
  
  @js.native
  sealed trait no_connectivity_issue
    extends StObject
       with AnnotationConnectivityIssue
  inline def no_connectivity_issue: no_connectivity_issue = "no_connectivity_issue".asInstanceOf[no_connectivity_issue]
  
  @js.native
  sealed trait no_quality_issue
    extends StObject
       with AnnotationQualityIssues
  inline def no_quality_issue: no_quality_issue = "no_quality_issue".asInstanceOf[no_quality_issue]
  
  @js.native
  sealed trait noanswer
    extends StObject
       with CallSummariesCallState
       with CallSummaryCallState
       with ConferenceParticipantCallStatus
  inline def noanswer: noanswer = "noanswer".asInstanceOf[noanswer]
  
  @js.native
  sealed trait node10
    extends StObject
       with BuildRuntime
  inline def node10: node10 = "node10".asInstanceOf[node10]
  
  @js.native
  sealed trait node12
    extends StObject
       with BuildRuntime
  inline def node12: node12 = "node12".asInstanceOf[node12]
  
  @js.native
  sealed trait node14
    extends StObject
       with BuildRuntime
  inline def node14: node14 = "node14".asInstanceOf[node14]
  
  @js.native
  sealed trait node8
    extends StObject
       with BuildRuntime
  inline def node8: node8 = "node8".asInstanceOf[node8]
  
  @js.native
  sealed trait noncompliant
    extends StObject
       with CustomerProfilesEvaluationsStatus
       with EvaluationStatus
       with TrustProductsEvaluationsStatus
  inline def noncompliant: noncompliant = "noncompliant".asInstanceOf[noncompliant]
  
  @js.native
  sealed trait none
    extends StObject
       with ChallengeChallengeReasons
       with DependentPhoneNumberAddressRequirement
       with FactorNotificationPlatforms
       with IncomingPhoneNumberAddressRequirement
       with LocalAddressRequirement
       with MobileAddressRequirement
       with NewFactorNotificationPlatforms
       with PhoneNumberAddressRequirement
       with SsmlBreakStrength
       with TollFreeAddressRequirement
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait not_needed
    extends StObject
       with ChallengeChallengeReasons
  inline def not_needed: not_needed = "not_needed".asInstanceOf[not_needed]
  
  @js.native
  sealed trait not_participating
    extends StObject
       with UserChannelChannelStatus
       with typings.twilio.userChannelMod.UserChannelChannelStatus
       with typings.twilio.userUserChannelMod.UserChannelChannelStatus
       with typings.twilio.v2ServiceUserUserChannelMod.UserChannelChannelStatus
  inline def not_participating: not_participating = "not_participating".asInstanceOf[not_participating]
  
  @js.native
  sealed trait not_requested
    extends StObject
       with ChallengeChallengeReasons
  inline def not_requested: not_requested = "not_requested".asInstanceOf[not_requested]
  
  @js.native
  sealed trait not_started
    extends StObject
       with ConferenceConferenceStatus
  inline def not_started: not_started = "not_started".asInstanceOf[not_started]
  
  @js.native
  sealed trait notify
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  
  @js.native
  sealed trait `notify-actions-attempts`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `notify-actions-attempts`: `notify-actions-attempts` = "notify-actions-attempts".asInstanceOf[`notify-actions-attempts`]
  
  @js.native
  sealed trait `notify-channels`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `notify-channels`: `notify-channels` = "notify-channels".asInstanceOf[`notify-channels`]
  
  @js.native
  sealed trait notstarted
    extends StObject
       with ConfigurationStatus
  inline def notstarted: notstarted = "notstarted".asInstanceOf[notstarted]
  
  @js.native
  sealed trait num_pages extends StObject
  inline def num_pages: num_pages = "num_pages".asInstanceOf[num_pages]
  
  @js.native
  sealed trait number
    extends StObject
       with SsmlSayAsInterpretAs
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `number-format-lookups`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `number-format-lookups`: `number-format-lookups` = "number-format-lookups".asInstanceOf[`number-format-lookups`]
  
  @js.native
  sealed trait number_reachability
    extends StObject
       with AnnotationConnectivityIssue
  inline def number_reachability: number_reachability = "number_reachability".asInstanceOf[number_reachability]
  
  @js.native
  sealed trait numbers_and_commands
    extends StObject
       with GatherSpeechModel
  inline def numbers_and_commands: numbers_and_commands = "numbers_and_commands".asInstanceOf[numbers_and_commands]
  
  @js.native
  sealed trait nz
    extends StObject
       with DialRingTone
  inline def nz: nz = "nz".asInstanceOf[nz]
  
  @js.native
  sealed trait off
    extends StObject
       with ConferenceJitterBufferSize
       with ConferenceParticipantJitterBufferSize
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait ok
    extends StObject
       with ConfigurationStatus
  inline def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait onEnter
    extends StObject
       with ConferenceBeep
  inline def onEnter: onEnter = "onEnter".asInstanceOf[onEnter]
  
  @js.native
  sealed trait onExit
    extends StObject
       with ConferenceBeep
  inline def onExit: onExit = "onExit".asInstanceOf[onExit]
  
  @js.native
  sealed trait `one-time`
    extends StObject
       with PayTokenType
       with PaymentTokenType
  inline def `one-time`: `one-time` = "one-time".asInstanceOf[`one-time`]
  
  @js.native
  sealed trait `one-way-audio`
    extends StObject
       with FeedbackIssues
  inline def `one-way-audio`: `one-way-audio` = "one-way-audio".asInstanceOf[`one-way-audio`]
  
  @js.native
  sealed trait open
    extends StObject
       with SessionStatus
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait opened
    extends StObject
       with AuthorizationDocumentStatus
  inline def opened: opened = "opened".asInstanceOf[opened]
  
  @js.native
  sealed trait optima
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def optima: optima = "optima".asInstanceOf[optima]
  
  @js.native
  sealed trait ordinal
    extends StObject
       with SsmlSayAsInterpretAs
  inline def ordinal: ordinal = "ordinal".asInstanceOf[ordinal]
  
  @js.native
  sealed trait outbound
    extends StObject
       with ConferenceParticipantCallDirection
       with DialRecordingTrack
       with MetricStreamDirection
  inline def outbound: outbound = "outbound".asInstanceOf[outbound]
  
  @js.native
  sealed trait `outbound-api`
    extends StObject
       with MessageDirection
  inline def `outbound-api`: `outbound-api` = "outbound-api".asInstanceOf[`outbound-api`]
  
  @js.native
  sealed trait `outbound-call`
    extends StObject
       with MessageDirection
  inline def `outbound-call`: `outbound-call` = "outbound-call".asInstanceOf[`outbound-call`]
  
  @js.native
  sealed trait `outbound-reply`
    extends StObject
       with MessageDirection
  inline def `outbound-reply`: `outbound-reply` = "outbound-reply".asInstanceOf[`outbound-reply`]
  
  @js.native
  sealed trait outbound_api
    extends StObject
       with CallSummariesCallDirection
  inline def outbound_api: outbound_api = "outbound_api".asInstanceOf[outbound_api]
  
  @js.native
  sealed trait outbound_dial
    extends StObject
       with CallSummariesCallDirection
  inline def outbound_dial: outbound_dial = "outbound_dial".asInstanceOf[outbound_dial]
  
  @js.native
  sealed trait outbound_track
    extends StObject
       with SiprecTrack
       with typings.twilio.siprecMod.SiprecTrack
       with StreamTrack
       with typings.twilio.voiceResponseMod.StreamTrack
  inline def outbound_track: outbound_track = "outbound_track".asInstanceOf[outbound_track]
  
  @js.native
  sealed trait overlay
    extends StObject
       with ServiceGeoMatchLevel
  inline def overlay: overlay = "overlay".asInstanceOf[overlay]
  
  @js.native
  sealed trait owa
    extends StObject
       with AnnotationQualityIssues
  inline def owa: owa = "owa".asInstanceOf[owa]
  
  @js.native
  sealed trait `pa-guru-IN`
    extends StObject
       with GatherLanguage
  inline def `pa-guru-IN`: `pa-guru-IN` = "pa-guru-IN".asInstanceOf[`pa-guru-IN`]
  
  @js.native
  sealed trait page extends StObject
  inline def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait page_size extends StObject
  inline def page_size: page_size = "page_size".asInstanceOf[page_size]
  
  @js.native
  sealed trait partial
    extends StObject
       with CallSummariesProcessingState
       with CallSummariesProcessingStateRequest
       with CallSummaryProcessingState
  inline def partial: partial = "partial".asInstanceOf[partial]
  
  @js.native
  sealed trait partially_delivered
    extends StObject
       with MessageStatus
       with VerificationAttemptMessageStatus
  inline def partially_delivered: partially_delivered = "partially_delivered".asInstanceOf[partially_delivered]
  
  @js.native
  sealed trait `participant-with-end-conference-on-exit-kicked`
    extends StObject
       with ConferenceReasonConferenceEnded
  inline def `participant-with-end-conference-on-exit-kicked`: `participant-with-end-conference-on-exit-kicked` = "participant-with-end-conference-on-exit-kicked".asInstanceOf[`participant-with-end-conference-on-exit-kicked`]
  
  @js.native
  sealed trait `participant-with-end-conference-on-exit-left`
    extends StObject
       with ConferenceReasonConferenceEnded
  inline def `participant-with-end-conference-on-exit-left`: `participant-with-end-conference-on-exit-left` = "participant-with-end-conference-on-exit-left".asInstanceOf[`participant-with-end-conference-on-exit-left`]
  
  @js.native
  sealed trait participant_behavior_issues
    extends StObject
       with ConferenceTag
  inline def participant_behavior_issues: participant_behavior_issues = "participant_behavior_issues".asInstanceOf[participant_behavior_issues]
  
  @js.native
  sealed trait participant_with_end_conference_on_exit_kicked
    extends StObject
       with ConferenceConferenceEndReason
  inline def participant_with_end_conference_on_exit_kicked: participant_with_end_conference_on_exit_kicked = "participant_with_end_conference_on_exit_kicked".asInstanceOf[participant_with_end_conference_on_exit_kicked]
  
  @js.native
  sealed trait participant_with_end_conference_on_exit_left
    extends StObject
       with ConferenceConferenceEndReason
  inline def participant_with_end_conference_on_exit_left: participant_with_end_conference_on_exit_left = "participant_with_end_conference_on_exit_left".asInstanceOf[participant_with_end_conference_on_exit_left]
  
  @js.native
  sealed trait patch
    extends StObject
       with HttpMethod
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait paused
    extends StObject
       with RecordingStatus
       with typings.twilio.recordingMod.RecordingStatus
       with typings.twilio.conferenceRecordingMod.RecordingStatus
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait payg extends StObject
  inline def payg: payg = "payg".asInstanceOf[payg]
  
  @js.native
  sealed trait `payment-card-number`
    extends StObject
       with PaymentCapture
       with PromptFor
  inline def `payment-card-number`: `payment-card-number` = "payment-card-number".asInstanceOf[`payment-card-number`]
  
  @js.native
  sealed trait `payment-processing`
    extends StObject
       with PromptFor
  inline def `payment-processing`: `payment-processing` = "payment-processing".asInstanceOf[`payment-processing`]
  
  @js.native
  sealed trait pchat
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def pchat: pchat = "pchat".asInstanceOf[pchat]
  
  @js.native
  sealed trait `pchat-users`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pchat-users`: `pchat-users` = "pchat-users".asInstanceOf[`pchat-users`]
  
  @js.native
  sealed trait `peer-to-peer`
    extends StObject
       with typings.twilio.v1RoomMod.RoomRoomType
  inline def `peer-to-peer`: `peer-to-peer` = "peer-to-peer".asInstanceOf[`peer-to-peer`]
  
  @js.native
  sealed trait `peer-to-peer-rooms-participant-minutes`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `peer-to-peer-rooms-participant-minutes`: `peer-to-peer-rooms-participant-minutes` = "peer-to-peer-rooms-participant-minutes".asInstanceOf[`peer-to-peer-rooms-participant-minutes`]
  
  @js.native
  sealed trait peer_to_peer
    extends StObject
       with RoomRoomType
  inline def peer_to_peer: peer_to_peer = "peer_to_peer".asInstanceOf[peer_to_peer]
  
  @js.native
  sealed trait `pending-loa`
    extends StObject
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
  inline def `pending-loa`: `pending-loa` = "pending-loa".asInstanceOf[`pending-loa`]
  
  @js.native
  sealed trait `pending-registration`
    extends StObject
       with IncomingPhoneNumberEmergencyAddressStatus
       with LocalEmergencyAddressStatus
       with MobileEmergencyAddressStatus
       with TollFreeEmergencyAddressStatus
  inline def `pending-registration`: `pending-registration` = "pending-registration".asInstanceOf[`pending-registration`]
  
  @js.native
  sealed trait `pending-review`
    extends StObject
       with BundleCopyStatus
       with BundleStatus
       with CustomerProfilesStatus
       with ReplaceItemsStatus
       with SupportingDocumentStatus
       with typings.twilio.v1SupportingDocumentMod.SupportingDocumentStatus
       with TrustProductsStatus
  inline def `pending-review`: `pending-review` = "pending-review".asInstanceOf[`pending-review`]
  
  @js.native
  sealed trait `pending-unregistration`
    extends StObject
       with IncomingPhoneNumberEmergencyAddressStatus
       with LocalEmergencyAddressStatus
       with MobileEmergencyAddressStatus
       with TollFreeEmergencyAddressStatus
  inline def `pending-unregistration`: `pending-unregistration` = "pending-unregistration".asInstanceOf[`pending-unregistration`]
  
  @js.native
  sealed trait `pending-verification`
    extends StObject
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
  inline def `pending-verification`: `pending-verification` = "pending-verification".asInstanceOf[`pending-verification`]
  
  @js.native
  sealed trait pending_
    extends StObject
       with ChallengeChallengeStatuses
       with ReservationStatus
       with typings.twilio.workerReservationMod.ReservationStatus
       with TaskStatus
  inline def pending_ : pending_ = "pending".asInstanceOf[pending_]
  
  @js.native
  sealed trait pfax
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def pfax: pfax = "pfax".asInstanceOf[pfax]
  
  @js.native
  sealed trait `pfax-minutes`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pfax-minutes`: `pfax-minutes` = "pfax-minutes".asInstanceOf[`pfax-minutes`]
  
  @js.native
  sealed trait `pfax-minutes-inbound`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pfax-minutes-inbound`: `pfax-minutes-inbound` = "pfax-minutes-inbound".asInstanceOf[`pfax-minutes-inbound`]
  
  @js.native
  sealed trait `pfax-minutes-outbound`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pfax-minutes-outbound`: `pfax-minutes-outbound` = "pfax-minutes-outbound".asInstanceOf[`pfax-minutes-outbound`]
  
  @js.native
  sealed trait `pfax-pages`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pfax-pages`: `pfax-pages` = "pfax-pages".asInstanceOf[`pfax-pages`]
  
  @js.native
  sealed trait ph
    extends StObject
       with DialRingTone
  inline def ph: ph = "ph".asInstanceOf[ph]
  
  @js.native
  sealed trait `phone-bill`
    extends StObject
       with DependentHostedNumberOrderVerificationType
       with HostedNumberOrderVerificationType
  inline def `phone-bill`: `phone-bill` = "phone-bill".asInstanceOf[`phone-bill`]
  
  @js.native
  sealed trait `phone-call`
    extends StObject
       with DependentHostedNumberOrderVerificationType
       with HostedNumberOrderVerificationType
  inline def `phone-call`: `phone-call` = "phone-call".asInstanceOf[`phone-call`]
  
  @js.native
  sealed trait phone_call
    extends StObject
       with GatherSpeechModel
  inline def phone_call: phone_call = "phone_call".asInstanceOf[phone_call]
  
  @js.native
  sealed trait phonenumbers
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def phonenumbers: phonenumbers = "phonenumbers".asInstanceOf[phonenumbers]
  
  @js.native
  sealed trait `phonenumbers-cps`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `phonenumbers-cps`: `phonenumbers-cps` = "phonenumbers-cps".asInstanceOf[`phonenumbers-cps`]
  
  @js.native
  sealed trait `phonenumbers-emergency`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `phonenumbers-emergency`: `phonenumbers-emergency` = "phonenumbers-emergency".asInstanceOf[`phonenumbers-emergency`]
  
  @js.native
  sealed trait `phonenumbers-local`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `phonenumbers-local`: `phonenumbers-local` = "phonenumbers-local".asInstanceOf[`phonenumbers-local`]
  
  @js.native
  sealed trait `phonenumbers-mobile`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `phonenumbers-mobile`: `phonenumbers-mobile` = "phonenumbers-mobile".asInstanceOf[`phonenumbers-mobile`]
  
  @js.native
  sealed trait `phonenumbers-setups`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `phonenumbers-setups`: `phonenumbers-setups` = "phonenumbers-setups".asInstanceOf[`phonenumbers-setups`]
  
  @js.native
  sealed trait `phonenumbers-tollfree`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `phonenumbers-tollfree`: `phonenumbers-tollfree` = "phonenumbers-tollfree".asInstanceOf[`phonenumbers-tollfree`]
  
  @js.native
  sealed trait pl
    extends StObject
       with DialRingTone
  inline def pl: pl = "pl".asInstanceOf[pl]
  
  @js.native
  sealed trait `pl-PL`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `pl-PL`: `pl-PL` = "pl-PL".asInstanceOf[`pl-PL`]
  
  @js.native
  sealed trait player extends StObject
  inline def player: player = "player".asInstanceOf[player]
  
  @js.native
  sealed trait `post-all`
    extends StObject
       with AuthorizedConnectAppPermission
       with ConnectAppPermission
  inline def `post-all`: `post-all` = "post-all".asInstanceOf[`post-all`]
  
  @js.native
  sealed trait `post-dial-delay`
    extends StObject
       with FeedbackIssues
  inline def `post-dial-delay`: `post-dial-delay` = "post-dial-delay".asInstanceOf[`post-dial-delay`]
  
  @js.native
  sealed trait post_
    extends StObject
       with HttpMethod
  inline def post_ : post_ = "post".asInstanceOf[post_]
  
  @js.native
  sealed trait `postal-code`
    extends StObject
       with PaymentCapture
       with PromptFor
  inline def `postal-code`: `postal-code` = "postal-code".asInstanceOf[`postal-code`]
  
  @js.native
  sealed trait `prefer-sticky`
    extends StObject
       with ServiceNumberSelectionBehavior
  inline def `prefer-sticky`: `prefer-sticky` = "prefer-sticky".asInstanceOf[`prefer-sticky`]
  
  @js.native
  sealed trait premiumsupport
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def premiumsupport: premiumsupport = "premiumsupport".asInstanceOf[premiumsupport]
  
  @js.native
  sealed trait previous_page_uri extends StObject
  inline def previous_page_uri: previous_page_uri = "previous_page_uri".asInstanceOf[previous_page_uri]
  
  @js.native
  sealed trait price
    extends StObject
       with TriggerTriggerField
  inline def price: price = "price".asInstanceOf[price]
  
  @js.native
  sealed trait `private`
    extends StObject
       with AssetVersionVisibility
       with ChannelChannelType
       with typings.twilio.channelMod.ChannelChannelType
       with typings.twilio.v2ServiceChannelMod.ChannelChannelType
       with typings.twilio.serviceChannelMod.ChannelChannelType
       with typings.twilio.v1ServiceChannelMod.ChannelChannelType
       with FunctionVersionVisibility
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait processing
    extends StObject
       with AddOnResultStatus
       with CompositionStatus
       with MediaRecordingStatus
       with typings.twilio.v1RecordingMod.RecordingStatus
       with RecordingStatus
       with typings.twilio.recordingMod.RecordingStatus
       with typings.twilio.conferenceRecordingMod.RecordingStatus
       with RoomRecordingStatus
  inline def processing: processing = "processing".asInstanceOf[processing]
  
  @js.native
  sealed trait `protected`
    extends StObject
       with AssetVersionVisibility
       with FunctionVersionVisibility
  inline def `protected`: `protected` = "protected".asInstanceOf[`protected`]
  
  @js.native
  sealed trait `provisionally-approved`
    extends StObject
       with BundleCopyStatus
       with BundleStatus
       with ReplaceItemsStatus
       with SupportingDocumentStatus
       with typings.twilio.v1SupportingDocumentMod.SupportingDocumentStatus
  inline def `provisionally-approved`: `provisionally-approved` = "provisionally-approved".asInstanceOf[`provisionally-approved`]
  
  @js.native
  sealed trait proxy
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def proxy: proxy = "proxy".asInstanceOf[proxy]
  
  @js.native
  sealed trait `proxy-active-sessions`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `proxy-active-sessions`: `proxy-active-sessions` = "proxy-active-sessions".asInstanceOf[`proxy-active-sessions`]
  
  @js.native
  sealed trait pstnconnectivity
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def pstnconnectivity: pstnconnectivity = "pstnconnectivity".asInstanceOf[pstnconnectivity]
  
  @js.native
  sealed trait pt
    extends StObject
       with DialRingTone
  inline def pt: pt = "pt".asInstanceOf[pt]
  
  @js.native
  sealed trait `pt-BR`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `pt-BR`: `pt-BR` = "pt-BR".asInstanceOf[`pt-BR`]
  
  @js.native
  sealed trait `pt-PT`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `pt-PT`: `pt-PT` = "pt-PT".asInstanceOf[`pt-PT`]
  
  @js.native
  sealed trait public
    extends StObject
       with AssetVersionVisibility
       with ChannelChannelType
       with typings.twilio.channelMod.ChannelChannelType
       with typings.twilio.v2ServiceChannelMod.ChannelChannelType
       with typings.twilio.serviceChannelMod.ChannelChannelType
       with typings.twilio.v1ServiceChannelMod.ChannelChannelType
       with FunctionVersionVisibility
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait published
    extends StObject
       with FlowRevisionStatus
       with FlowStatus
       with typings.twilio.v2FlowMod.FlowStatus
       with FlowValidateStatus
  inline def published: published = "published".asInstanceOf[published]
  
  @js.native
  sealed trait push
    extends StObject
       with ChallengeFactorTypes
       with FactorFactorTypes
       with NewFactorFactorTypes
  inline def push: push = "push".asInstanceOf[push]
  
  @js.native
  sealed trait put
    extends StObject
       with HttpMethod
  inline def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait pv
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def pv: pv = "pv".asInstanceOf[pv]
  
  @js.native
  sealed trait `pv-composition-media-downloaded`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-composition-media-downloaded`: `pv-composition-media-downloaded` = "pv-composition-media-downloaded".asInstanceOf[`pv-composition-media-downloaded`]
  
  @js.native
  sealed trait `pv-composition-media-encrypted`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-composition-media-encrypted`: `pv-composition-media-encrypted` = "pv-composition-media-encrypted".asInstanceOf[`pv-composition-media-encrypted`]
  
  @js.native
  sealed trait `pv-composition-media-stored`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-composition-media-stored`: `pv-composition-media-stored` = "pv-composition-media-stored".asInstanceOf[`pv-composition-media-stored`]
  
  @js.native
  sealed trait `pv-composition-minutes`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-composition-minutes`: `pv-composition-minutes` = "pv-composition-minutes".asInstanceOf[`pv-composition-minutes`]
  
  @js.native
  sealed trait `pv-recording-compositions`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-recording-compositions`: `pv-recording-compositions` = "pv-recording-compositions".asInstanceOf[`pv-recording-compositions`]
  
  @js.native
  sealed trait `pv-room-participants`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-room-participants`: `pv-room-participants` = "pv-room-participants".asInstanceOf[`pv-room-participants`]
  
  @js.native
  sealed trait `pv-room-participants-au1`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-room-participants-au1`: `pv-room-participants-au1` = "pv-room-participants-au1".asInstanceOf[`pv-room-participants-au1`]
  
  @js.native
  sealed trait `pv-room-participants-br1`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-room-participants-br1`: `pv-room-participants-br1` = "pv-room-participants-br1".asInstanceOf[`pv-room-participants-br1`]
  
  @js.native
  sealed trait `pv-room-participants-ie1`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-room-participants-ie1`: `pv-room-participants-ie1` = "pv-room-participants-ie1".asInstanceOf[`pv-room-participants-ie1`]
  
  @js.native
  sealed trait `pv-room-participants-jp1`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-room-participants-jp1`: `pv-room-participants-jp1` = "pv-room-participants-jp1".asInstanceOf[`pv-room-participants-jp1`]
  
  @js.native
  sealed trait `pv-room-participants-sg1`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-room-participants-sg1`: `pv-room-participants-sg1` = "pv-room-participants-sg1".asInstanceOf[`pv-room-participants-sg1`]
  
  @js.native
  sealed trait `pv-room-participants-us1`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-room-participants-us1`: `pv-room-participants-us1` = "pv-room-participants-us1".asInstanceOf[`pv-room-participants-us1`]
  
  @js.native
  sealed trait `pv-room-participants-us2`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-room-participants-us2`: `pv-room-participants-us2` = "pv-room-participants-us2".asInstanceOf[`pv-room-participants-us2`]
  
  @js.native
  sealed trait `pv-rooms`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-rooms`: `pv-rooms` = "pv-rooms".asInstanceOf[`pv-rooms`]
  
  @js.native
  sealed trait `pv-sip-endpoint-registrations`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `pv-sip-endpoint-registrations`: `pv-sip-endpoint-registrations` = "pv-sip-endpoint-registrations".asInstanceOf[`pv-sip-endpoint-registrations`]
  
  @js.native
  sealed trait quality_warnings
    extends StObject
       with ConferenceTag
  inline def quality_warnings: quality_warnings = "quality_warnings".asInstanceOf[quality_warnings]
  
  @js.native
  sealed trait queued
    extends StObject
       with AddOnResultStatus
       with CallStatus
       with CommandStatus
       with FeedbackSummaryStatus
       with InteractionResourceStatus
       with IpCommandStatus
       with MessageInteractionResourceStatus
       with MessageStatus
       with ParticipantStatus
       with SmsCommandStatus
       with VerificationAttemptCallStatus
       with VerificationAttemptMessageStatus
  inline def queued: queued = "queued".asInstanceOf[queued]
  
  @js.native
  sealed trait radius
    extends StObject
       with ServiceGeoMatchLevel
  inline def radius: radius = "radius".asInstanceOf[radius]
  
  @js.native
  sealed trait read
    extends StObject
       with DeliveryReceiptDeliveryStatus
       with typings.twilio.messageDeliveryReceiptMod.DeliveryReceiptDeliveryStatus
       with MessageStatus
       with VerificationAttemptMessageStatus
  inline def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait ready
    extends StObject
       with BillingPeriodBpType
       with SimStatus
       with typings.twilio.wirelessV1SimMod.SimStatus
       with SimStatusUpdate
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait received
    extends StObject
       with CommandStatus
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
       with InteractionResourceStatus
       with IpCommandStatus
       with MessageInteractionResourceStatus
       with MessageStatus
       with SmsCommandStatus
       with VerificationAttemptMessageStatus
  inline def received: received = "received".asInstanceOf[received]
  
  @js.native
  sealed trait receiving
    extends StObject
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with MessageStatus
       with VerificationAttemptMessageStatus
  inline def receiving: receiving = "receiving".asInstanceOf[receiving]
  
  @js.native
  sealed trait `record-from-answer`
    extends StObject
       with ConversationRecord
       with DialRecord
       with RecordingRecordingMode
  inline def `record-from-answer`: `record-from-answer` = "record-from-answer".asInstanceOf[`record-from-answer`]
  
  @js.native
  sealed trait `record-from-answer-dual`
    extends StObject
       with ConversationRecord
       with DialRecord
       with RecordingRecordingMode
  inline def `record-from-answer-dual`: `record-from-answer-dual` = "record-from-answer-dual".asInstanceOf[`record-from-answer-dual`]
  
  @js.native
  sealed trait `record-from-ringing`
    extends StObject
       with ConversationRecord
       with DialRecord
       with RecordingRecordingMode
  inline def `record-from-ringing`: `record-from-ringing` = "record-from-ringing".asInstanceOf[`record-from-ringing`]
  
  @js.native
  sealed trait `record-from-ringing-dual`
    extends StObject
       with ConversationRecord
       with DialRecord
       with RecordingRecordingMode
  inline def `record-from-ringing-dual`: `record-from-ringing-dual` = "record-from-ringing-dual".asInstanceOf[`record-from-ringing-dual`]
  
  @js.native
  sealed trait `record-from-start`
    extends StObject
       with ConferenceRecord
  inline def `record-from-start`: `record-from-start` = "record-from-start".asInstanceOf[`record-from-start`]
  
  @js.native
  sealed trait recordings
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def recordings: recordings = "recordings".asInstanceOf[recordings]
  
  @js.native
  sealed trait recordingstorage
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def recordingstorage: recordingstorage = "recordingstorage".asInstanceOf[recordingstorage]
  
  @js.native
  sealed trait reduced
    extends StObject
       with SsmlEmphasisLevel
  inline def reduced: reduced = "reduced".asInstanceOf[reduced]
  
  @js.native
  sealed trait region_configuration_issues
    extends StObject
       with ConferenceTag
  inline def region_configuration_issues: region_configuration_issues = "region_configuration_issues".asInstanceOf[region_configuration_issues]
  
  @js.native
  sealed trait registered
    extends StObject
       with IncomingPhoneNumberEmergencyAddressStatus
       with LocalEmergencyAddressStatus
       with MobileEmergencyAddressStatus
       with TollFreeEmergencyAddressStatus
  inline def registered: registered = "registered".asInstanceOf[registered]
  
  @js.native
  sealed trait `registration-failure`
    extends StObject
       with IncomingPhoneNumberEmergencyAddressStatus
       with LocalEmergencyAddressStatus
       with MobileEmergencyAddressStatus
       with TollFreeEmergencyAddressStatus
  inline def `registration-failure`: `registration-failure` = "registration-failure".asInstanceOf[`registration-failure`]
  
  @js.native
  sealed trait rejected
    extends StObject
       with RejectReason
       with ReservationStatus
       with typings.twilio.workerReservationMod.ReservationStatus
       with SupportingDocumentStatus
       with typings.twilio.v1SupportingDocumentMod.SupportingDocumentStatus
  inline def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait rescinded
    extends StObject
       with ReservationStatus
       with typings.twilio.workerReservationMod.ReservationStatus
  inline def rescinded: rescinded = "rescinded".asInstanceOf[rescinded]
  
  @js.native
  sealed trait reserved
    extends StObject
       with TaskStatus
  inline def reserved: reserved = "reserved".asInstanceOf[reserved]
  
  @js.native
  sealed trait reserving
    extends StObject
       with EsimProfileStatus
  inline def reserving: reserving = "reserving".asInstanceOf[reserving]
  
  @js.native
  sealed trait resetting extends StObject
  inline def resetting: resetting = "resetting".asInstanceOf[resetting]
  
  @js.native
  sealed trait retain extends StObject
  inline def retain: retain = "retain".asInstanceOf[retain]
  
  @js.native
  sealed trait reusable
    extends StObject
       with PayTokenType
       with PaymentTokenType
  inline def reusable: reusable = "reusable".asInstanceOf[reusable]
  
  @js.native
  sealed trait ringing
    extends StObject
       with CallEvent
       with CallStatus
       with CallSummariesCallState
       with CallSummaryCallState
       with ClientEvent
       with ConferenceParticipantCallStatus
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with NumberEvent
       with ParticipantStatus
       with ReservationCallStatus
       with typings.twilio.workerReservationMod.ReservationCallStatus
       with SipEvent
       with VerificationAttemptCallStatus
  inline def ringing: ringing = "ringing".asInstanceOf[ringing]
  
  @js.native
  sealed trait `ro-RO`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `ro-RO`: `ro-RO` = "ro-RO".asInstanceOf[`ro-RO`]
  
  @js.native
  sealed trait roaming
    extends StObject
       with ParticipantEdgeLocation
       with RoomEdgeLocation
  inline def roaming: roaming = "roaming".asInstanceOf[roaming]
  
  @js.native
  sealed trait room_ended_via_api
    extends StObject
       with RoomEndReason
  inline def room_ended_via_api: room_ended_via_api = "room_ended_via_api".asInstanceOf[room_ended_via_api]
  
  @js.native
  sealed trait `rooms-group-bandwidth`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `rooms-group-bandwidth`: `rooms-group-bandwidth` = "rooms-group-bandwidth".asInstanceOf[`rooms-group-bandwidth`]
  
  @js.native
  sealed trait `rooms-group-minutes`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `rooms-group-minutes`: `rooms-group-minutes` = "rooms-group-minutes".asInstanceOf[`rooms-group-minutes`]
  
  @js.native
  sealed trait `rooms-peer-to-peer-minutes`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `rooms-peer-to-peer-minutes`: `rooms-peer-to-peer-minutes` = "rooms-peer-to-peer-minutes".asInstanceOf[`rooms-peer-to-peer-minutes`]
  
  @js.native
  sealed trait rtc extends StObject
  inline def rtc: rtc = "rtc".asInstanceOf[rtc]
  
  @js.native
  sealed trait ru
    extends StObject
       with DialRingTone
  inline def ru: ru = "ru".asInstanceOf[ru]
  
  @js.native
  sealed trait `ru-RU`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `ru-RU`: `ru-RU` = "ru-RU".asInstanceOf[`ru-RU`]
  
  @js.native
  sealed trait sao_paulo
    extends StObject
       with ParticipantEdgeLocation
       with RoomEdgeLocation
  inline def sao_paulo: sao_paulo = "sao_paulo".asInstanceOf[sao_paulo]
  
  @js.native
  sealed trait scheduled
    extends StObject
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with MessageStatus
       with SimStatus
       with typings.twilio.wirelessV1SimMod.SimStatus
       with VerificationAttemptMessageStatus
  inline def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
  
  @js.native
  sealed trait scopeColonclientColonincoming extends StObject
  inline def scopeColonclientColonincoming: scopeColonclientColonincoming = "scope:client:incoming".asInstanceOf[scopeColonclientColonincoming]
  
  @js.native
  sealed trait scopeColonclientColonoutgoing extends StObject
  inline def scopeColonclientColonoutgoing: scopeColonclientColonoutgoing = "scope:client:outgoing".asInstanceOf[scopeColonclientColonoutgoing]
  
  @js.native
  sealed trait scopeColonstreamColonsubscribe extends StObject
  inline def scopeColonstreamColonsubscribe: scopeColonstreamColonsubscribe = "scope:stream:subscribe".asInstanceOf[scopeColonstreamColonsubscribe]
  
  @js.native
  sealed trait sdk
    extends StObject
       with RoomCreatedMethod
  inline def sdk: sdk = "sdk".asInstanceOf[sdk]
  
  @js.native
  sealed trait sdk_edge
    extends StObject
       with EventTwilioEdge
       with MetricTwilioEdge
  inline def sdk_edge: sdk_edge = "sdk_edge".asInstanceOf[sdk_edge]
  
  @js.native
  sealed trait se
    extends StObject
       with DialRingTone
  inline def se: se = "se".asInstanceOf[se]
  
  @js.native
  sealed trait `security-code`
    extends StObject
       with PaymentCapture
       with PromptFor
  inline def `security-code`: `security-code` = "security-code".asInstanceOf[`security-code`]
  
  @js.native
  sealed trait segment
    extends StObject
       with SinkSinkType
  inline def segment: segment = "segment".asInstanceOf[segment]
  
  @js.native
  sealed trait sending
    extends StObject
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with MessageStatus
       with VerificationAttemptMessageStatus
  inline def sending: sending = "sending".asInstanceOf[sending]
  
  @js.native
  sealed trait sent
    extends StObject
       with CommandStatus
       with DeliveryReceiptDeliveryStatus
       with typings.twilio.messageDeliveryReceiptMod.DeliveryReceiptDeliveryStatus
       with InteractionResourceStatus
       with IpCommandStatus
       with MessageInteractionResourceStatus
       with MessageStatus
       with SmsCommandStatus
       with VerificationAttemptMessageStatus
  inline def sent: sent = "sent".asInstanceOf[sent]
  
  @js.native
  sealed trait service
    extends StObject
       with typings.twilio.v1RoleMod.RoleRoleType
       with typings.twilio.v1ServiceRoleMod.RoleRoleType
  inline def service: service = "service".asInstanceOf[service]
  
  @js.native
  sealed trait setup
    extends StObject
       with InteractionChannelChannelStatus
  inline def setup: setup = "setup".asInstanceOf[setup]
  
  @js.native
  sealed trait sg
    extends StObject
       with DialRingTone
  inline def sg: sg = "sg".asInstanceOf[sg]
  
  @js.native
  sealed trait sg1
    extends StObject
       with ConferenceParticipantRegion
       with ConferenceRegion
       with typings.twilio.voiceResponseMod.ConferenceRegion
       with ParticipantTwilioRealm
       with RoomTwilioRealm
  inline def sg1: sg1 = "sg1".asInstanceOf[sg1]
  
  @js.native
  sealed trait sha1
    extends StObject
       with FactorTotpAlgorithms
       with NewFactorTotpAlgorithms
  inline def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @js.native
  sealed trait sha256
    extends StObject
       with FactorTotpAlgorithms
       with NewFactorTotpAlgorithms
  inline def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait sha512
    extends StObject
       with FactorTotpAlgorithms
       with NewFactorTotpAlgorithms
  inline def sha512: sha512 = "sha512".asInstanceOf[sha512]
  
  @js.native
  sealed trait shortcodes
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def shortcodes: shortcodes = "shortcodes".asInstanceOf[shortcodes]
  
  @js.native
  sealed trait `shortcodes-customerowned`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `shortcodes-customerowned`: `shortcodes-customerowned` = "shortcodes-customerowned".asInstanceOf[`shortcodes-customerowned`]
  
  @js.native
  sealed trait `shortcodes-mms-enablement`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `shortcodes-mms-enablement`: `shortcodes-mms-enablement` = "shortcodes-mms-enablement".asInstanceOf[`shortcodes-mms-enablement`]
  
  @js.native
  sealed trait `shortcodes-mps`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `shortcodes-mps`: `shortcodes-mps` = "shortcodes-mps".asInstanceOf[`shortcodes-mps`]
  
  @js.native
  sealed trait `shortcodes-random`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `shortcodes-random`: `shortcodes-random` = "shortcodes-random".asInstanceOf[`shortcodes-random`]
  
  @js.native
  sealed trait `shortcodes-uk`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `shortcodes-uk`: `shortcodes-uk` = "shortcodes-uk".asInstanceOf[`shortcodes-uk`]
  
  @js.native
  sealed trait `shortcodes-vanity`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `shortcodes-vanity`: `shortcodes-vanity` = "shortcodes-vanity".asInstanceOf[`shortcodes-vanity`]
  
  @js.native
  sealed trait `si-LK`
    extends StObject
       with GatherLanguage
  inline def `si-LK`: `si-LK` = "si-LK".asInstanceOf[`si-LK`]
  
  @js.native
  sealed trait signed
    extends StObject
       with AuthorizationDocumentStatus
  inline def signed: signed = "signed".asInstanceOf[signed]
  
  @js.native
  sealed trait signing
    extends StObject
       with AuthorizationDocumentStatus
  inline def signing: signing = "signing".asInstanceOf[signing]
  
  @js.native
  sealed trait sim
    extends StObject
       with UsageRecordGroup
  inline def sim: sim = "sim".asInstanceOf[sim]
  
  @js.native
  sealed trait singapore
    extends StObject
       with ParticipantEdgeLocation
       with RoomEdgeLocation
  inline def singapore: singapore = "singapore".asInstanceOf[singapore]
  
  @js.native
  sealed trait sip
    extends StObject
       with CallSummariesCallType
       with CallSummaryCallType
       with ConferenceParticipantCallType
  inline def sip: sip = "sip".asInstanceOf[sip]
  
  @js.native
  sealed trait `sip-only`
    extends StObject
       with TrunkTransferSetting
  inline def `sip-only`: `sip-only` = "sip-only".asInstanceOf[`sip-only`]
  
  @js.native
  sealed trait sip_edge
    extends StObject
       with EventTwilioEdge
       with MetricTwilioEdge
  inline def sip_edge: sip_edge = "sip_edge".asInstanceOf[sip_edge]
  
  @js.native
  sealed trait `sk-SK`
    extends StObject
       with GatherLanguage
  inline def `sk-SK`: `sk-SK` = "sk-SK".asInstanceOf[`sk-SK`]
  
  @js.native
  sealed trait `sl-SI`
    extends StObject
       with GatherLanguage
  inline def `sl-SI`: `sl-SI` = "sl-SI".asInstanceOf[`sl-SI`]
  
  @js.native
  sealed trait small
    extends StObject
       with ConferenceJitterBufferSize
       with ConferenceParticipantJitterBufferSize
  inline def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait `small-group-rooms`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `small-group-rooms`: `small-group-rooms` = "small-group-rooms".asInstanceOf[`small-group-rooms`]
  
  @js.native
  sealed trait `small-group-rooms-data-track`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `small-group-rooms-data-track`: `small-group-rooms-data-track` = "small-group-rooms-data-track".asInstanceOf[`small-group-rooms-data-track`]
  
  @js.native
  sealed trait `small-group-rooms-participant-minutes`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `small-group-rooms-participant-minutes`: `small-group-rooms-participant-minutes` = "small-group-rooms-participant-minutes".asInstanceOf[`small-group-rooms-participant-minutes`]
  
  @js.native
  sealed trait sms
    extends StObject
       with AddressConfigurationType
       with AllTimeCategory
       with BindingBindingType
       with CommandTransport
       with DailyCategory
       with FlexFlowChannelType
       with InteractionChannelType
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with VerificationAttemptChannels
       with VerificationAttemptsSummaryChannels
       with VerificationChannel
       with VerificationCheckChannel
       with YearlyCategory
       with YesterdayCategory
  inline def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait `sms-inbound`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sms-inbound`: `sms-inbound` = "sms-inbound".asInstanceOf[`sms-inbound`]
  
  @js.native
  sealed trait `sms-inbound-longcode`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sms-inbound-longcode`: `sms-inbound-longcode` = "sms-inbound-longcode".asInstanceOf[`sms-inbound-longcode`]
  
  @js.native
  sealed trait `sms-inbound-shortcode`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sms-inbound-shortcode`: `sms-inbound-shortcode` = "sms-inbound-shortcode".asInstanceOf[`sms-inbound-shortcode`]
  
  @js.native
  sealed trait `sms-messages-carrierfees`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sms-messages-carrierfees`: `sms-messages-carrierfees` = "sms-messages-carrierfees".asInstanceOf[`sms-messages-carrierfees`]
  
  @js.native
  sealed trait `sms-messages-features`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sms-messages-features`: `sms-messages-features` = "sms-messages-features".asInstanceOf[`sms-messages-features`]
  
  @js.native
  sealed trait `sms-messages-features-senderid`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sms-messages-features-senderid`: `sms-messages-features-senderid` = "sms-messages-features-senderid".asInstanceOf[`sms-messages-features-senderid`]
  
  @js.native
  sealed trait `sms-outbound`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sms-outbound`: `sms-outbound` = "sms-outbound".asInstanceOf[`sms-outbound`]
  
  @js.native
  sealed trait `sms-outbound-content-inspection`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sms-outbound-content-inspection`: `sms-outbound-content-inspection` = "sms-outbound-content-inspection".asInstanceOf[`sms-outbound-content-inspection`]
  
  @js.native
  sealed trait `sms-outbound-longcode`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sms-outbound-longcode`: `sms-outbound-longcode` = "sms-outbound-longcode".asInstanceOf[`sms-outbound-longcode`]
  
  @js.native
  sealed trait `sms-outbound-shortcode`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sms-outbound-shortcode`: `sms-outbound-shortcode` = "sms-outbound-shortcode".asInstanceOf[`sms-outbound-shortcode`]
  
  @js.native
  sealed trait sna
    extends StObject
       with VerificationChannel
       with VerificationCheckChannel
  inline def sna: sna = "sna".asInstanceOf[sna]
  
  @js.native
  sealed trait speaker
    extends StObject
       with ConferenceEvent
       with ReservationConferenceEvent
       with typings.twilio.workerReservationMod.ReservationConferenceEvent
  inline def speaker: speaker = "speaker".asInstanceOf[speaker]
  
  @js.native
  sealed trait speech
    extends StObject
       with GatherInput
  inline def speech: speech = "speech".asInstanceOf[speech]
  
  @js.native
  sealed trait `speech-recognition`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `speech-recognition`: `speech-recognition` = "speech-recognition".asInstanceOf[`speech-recognition`]
  
  @js.native
  sealed trait `spell-out`
    extends StObject
       with SsmlSayAsInterpretAs
  inline def `spell-out`: `spell-out` = "spell-out".asInstanceOf[`spell-out`]
  
  @js.native
  sealed trait `sq-AL`
    extends StObject
       with GatherLanguage
  inline def `sq-AL`: `sq-AL` = "sq-AL".asInstanceOf[`sq-AL`]
  
  @js.native
  sealed trait `sr-RS`
    extends StObject
       with GatherLanguage
  inline def `sr-RS`: `sr-RS` = "sr-RS".asInstanceOf[`sr-RS`]
  
  @js.native
  sealed trait start
    extends StObject
       with ConferenceEvent
       with ReservationConferenceEvent
       with typings.twilio.workerReservationMod.ReservationConferenceEvent
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait start_failure
    extends StObject
       with ConferenceTag
  inline def start_failure: start_failure = "start_failure".asInstanceOf[start_failure]
  
  @js.native
  sealed trait start_time
    extends StObject
       with CallSummariesSortBy
  inline def start_time: start_time = "start_time".asInstanceOf[start_time]
  
  @js.native
  sealed trait started
    extends StObject
       with CallSummariesProcessingStateRequest
       with MediaProcessorStatus
       with PlayerStreamerStatus
  inline def started: started = "started".asInstanceOf[started]
  
  @js.native
  sealed trait static_noise
    extends StObject
       with AnnotationQualityIssues
  inline def static_noise: static_noise = "static_noise".asInstanceOf[static_noise]
  
  @js.native
  sealed trait stopped
    extends StObject
       with RecordingStatus
       with typings.twilio.recordingMod.RecordingStatus
       with typings.twilio.conferenceRecordingMod.RecordingStatus
       with SiprecStatus
       with StreamStatus
  inline def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait `stream-disconnected-by-source`
    extends StObject
       with PlayerStreamerEndedReason
  inline def `stream-disconnected-by-source`: `stream-disconnected-by-source` = "stream-disconnected-by-source".asInstanceOf[`stream-disconnected-by-source`]
  
  @js.native
  sealed trait strong
    extends StObject
       with SsmlBreakStrength
       with SsmlEmphasisLevel
  inline def strong: strong = "strong".asInstanceOf[strong]
  
  @js.native
  sealed trait studio
    extends StObject
       with AddressConfigurationAutoCreationType
       with FlexFlowIntegrationType
       with typings.twilio.conversationWebhookMod.WebhookTarget
       with typings.twilio.serviceConversationWebhookMod.WebhookTarget
       with WebhookType
       with typings.twilio.channelWebhookMod.WebhookType
  inline def studio: studio = "studio".asInstanceOf[studio]
  
  @js.native
  sealed trait `studio-engagements`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `studio-engagements`: `studio-engagements` = "studio-engagements".asInstanceOf[`studio-engagements`]
  
  @js.native
  sealed trait `su-ID`
    extends StObject
       with GatherLanguage
  inline def `su-ID`: `su-ID` = "su-ID".asInstanceOf[`su-ID`]
  
  @js.native
  sealed trait summary_timeout
    extends StObject
       with ConferenceConferenceStatus
  inline def summary_timeout: summary_timeout = "summary_timeout".asInstanceOf[summary_timeout]
  
  @js.native
  sealed trait supervisor
    extends StObject
       with InteractionChannelParticipantType
  inline def supervisor: supervisor = "supervisor".asInstanceOf[supervisor]
  
  @js.native
  sealed trait suspended
    extends StObject
       with AccountStatus
       with typings.twilio.wirelessV1SimMod.SimStatus
  inline def suspended: suspended = "suspended".asInstanceOf[suspended]
  
  @js.native
  sealed trait `sv-SE`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `sv-SE`: `sv-SE` = "sv-SE".asInstanceOf[`sv-SE`]
  
  @js.native
  sealed trait `sw-KE`
    extends StObject
       with GatherLanguage
  inline def `sw-KE`: `sw-KE` = "sw-KE".asInstanceOf[`sw-KE`]
  
  @js.native
  sealed trait `sw-TZ`
    extends StObject
       with GatherLanguage
  inline def `sw-TZ`: `sw-TZ` = "sw-TZ".asInstanceOf[`sw-TZ`]
  
  @js.native
  sealed trait sydney
    extends StObject
       with ParticipantEdgeLocation
       with RoomEdgeLocation
  inline def sydney: sydney = "sydney".asInstanceOf[sydney]
  
  @js.native
  sealed trait sync
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait `sync-actions`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sync-actions`: `sync-actions` = "sync-actions".asInstanceOf[`sync-actions`]
  
  @js.native
  sealed trait `sync-endpoint-hours`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sync-endpoint-hours`: `sync-endpoint-hours` = "sync-endpoint-hours".asInstanceOf[`sync-endpoint-hours`]
  
  @js.native
  sealed trait `sync-endpoint-hours-above-daily-cap`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `sync-endpoint-hours-above-daily-cap`: `sync-endpoint-hours-above-daily-cap` = "sync-endpoint-hours-above-daily-cap".asInstanceOf[`sync-endpoint-hours-above-daily-cap`]
  
  @js.native
  sealed trait `ta-IN`
    extends StObject
       with GatherLanguage
  inline def `ta-IN`: `ta-IN` = "ta-IN".asInstanceOf[`ta-IN`]
  
  @js.native
  sealed trait `ta-LK`
    extends StObject
       with GatherLanguage
  inline def `ta-LK`: `ta-LK` = "ta-LK".asInstanceOf[`ta-LK`]
  
  @js.native
  sealed trait `ta-MY`
    extends StObject
       with GatherLanguage
  inline def `ta-MY`: `ta-MY` = "ta-MY".asInstanceOf[`ta-MY`]
  
  @js.native
  sealed trait `ta-SG`
    extends StObject
       with GatherLanguage
  inline def `ta-SG`: `ta-SG` = "ta-SG".asInstanceOf[`ta-SG`]
  
  @js.native
  sealed trait task
    extends StObject
       with FlexFlowIntegrationType
  inline def task: task = "task".asInstanceOf[task]
  
  @js.native
  sealed trait task_router extends StObject
  inline def task_router: task_router = "task_router".asInstanceOf[task_router]
  
  @js.native
  sealed trait taskrouter extends StObject
  inline def taskrouter: taskrouter = "taskrouter".asInstanceOf[taskrouter]
  
  @js.native
  sealed trait `taskrouter-tasks`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `taskrouter-tasks`: `taskrouter-tasks` = "taskrouter-tasks".asInstanceOf[`taskrouter-tasks`]
  
  @js.native
  sealed trait `te-IN`
    extends StObject
       with GatherLanguage
  inline def `te-IN`: `te-IN` = "te-IN".asInstanceOf[`te-IN`]
  
  @js.native
  sealed trait telephone
    extends StObject
       with SsmlSayAsInterpretAs
  inline def telephone: telephone = "telephone".asInstanceOf[telephone]
  
  @js.native
  sealed trait testing
    extends StObject
       with DependentHostedNumberOrderStatus
       with HostedNumberOrderStatus
  inline def testing: testing = "testing".asInstanceOf[testing]
  
  @js.native
  sealed trait text
    extends StObject
       with CommandCommandMode
       with IpCommandPayloadType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait th
    extends StObject
       with DialRingTone
  inline def th: th = "th".asInstanceOf[th]
  
  @js.native
  sealed trait `th-TH`
    extends StObject
       with GatherLanguage
  inline def `th-TH`: `th-TH` = "th-TH".asInstanceOf[`th-TH`]
  
  @js.native
  sealed trait throttle
    extends StObject
       with RatePlanDataLimitStrategy
  inline def throttle: throttle = "throttle".asInstanceOf[throttle]
  
  @js.native
  sealed trait time
    extends StObject
       with SsmlSayAsInterpretAs
  inline def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait timeout
    extends StObject
       with ConferenceParticipantProcessingState
       with ConferenceProcessingState
       with PromptErrorType
       with ReservationStatus
       with typings.twilio.workerReservationMod.ReservationStatus
       with RoomEndReason
  inline def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @js.native
  sealed trait to_sim
    extends StObject
       with CommandDirection
       with IpCommandDirection
       with SmsCommandDirection
  inline def to_sim: to_sim = "to_sim".asInstanceOf[to_sim]
  
  @js.native
  sealed trait tokyo
    extends StObject
       with ParticipantEdgeLocation
       with RoomEdgeLocation
  inline def tokyo: tokyo = "tokyo".asInstanceOf[tokyo]
  
  @js.native
  sealed trait total extends StObject
  inline def total: total = "total".asInstanceOf[total]
  
  @js.native
  sealed trait totalprice
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def totalprice: totalprice = "totalprice".asInstanceOf[totalprice]
  
  @js.native
  sealed trait totp
    extends StObject
       with ChallengeFactorTypes
       with FactorFactorTypes
       with NewFactorFactorTypes
  inline def totp: totp = "totp".asInstanceOf[totp]
  
  @js.native
  sealed trait `tr-TR`
    extends StObject
       with GatherLanguage
       with SayLanguage
       with SsmlLangXmlLang
  inline def `tr-TR`: `tr-TR` = "tr-TR".asInstanceOf[`tr-TR`]
  
  @js.native
  sealed trait transcriptions
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def transcriptions: transcriptions = "transcriptions".asInstanceOf[transcriptions]
  
  @js.native
  sealed trait trigger
    extends StObject
       with typings.twilio.conversationWebhookMod.WebhookTarget
       with typings.twilio.serviceConversationWebhookMod.WebhookTarget
       with WebhookType
       with typings.twilio.channelWebhookMod.WebhookType
  inline def trigger: trigger = "trigger".asInstanceOf[trigger]
  
  @js.native
  sealed trait `trim-silence`
    extends StObject
       with ConferenceTrim
       with ConversationTrim
       with DialTrim
       with RecordTrim
       with RecordingRecordingTrim
  inline def `trim-silence`: `trim-silence` = "trim-silence".asInstanceOf[`trim-silence`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with ChannelWebhookEnabledType
       with typings.twilio.v2ServiceChannelMod.ChannelWebhookEnabledType
       with typings.twilio.serviceChannelMod.ChannelWebhookEnabledType
       with ConferenceBeep
       with ConversationRecord
       with ConversationWebhookEnabledType
       with typings.twilio.conversationMod.ConversationWebhookEnabledType
       with MemberWebhookEnabledType
       with typings.twilio.v2ServiceChannelMemberMod.MemberWebhookEnabledType
       with MessageWebhookEnabledType
       with typings.twilio.serviceChannelMessageMod.MessageWebhookEnabledType
       with typings.twilio.serviceConversationMessageMod.MessageWebhookEnabledType
       with typings.twilio.v2ServiceChannelMessageMod.MessageWebhookEnabledType
       with ParticipantWebhookEnabledType
       with typings.twilio.serviceConversationParticipantMod.ParticipantWebhookEnabledType
       with UserChannelWebhookEnabledType
       with UserWebhookEnabledType
       with typings.twilio.v1UserMod.UserWebhookEnabledType
       with typings.twilio.v2ServiceUserMod.UserWebhookEnabledType
       with typings.twilio.v1ServiceUserMod.UserWebhookEnabledType
  inline def `true`: `true` = "true".asInstanceOf[`true`]
  
  @js.native
  sealed trait `trunking-cps`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `trunking-cps`: `trunking-cps` = "trunking-cps".asInstanceOf[`trunking-cps`]
  
  @js.native
  sealed trait `trunking-emergency-calls`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `trunking-emergency-calls`: `trunking-emergency-calls` = "trunking-emergency-calls".asInstanceOf[`trunking-emergency-calls`]
  
  @js.native
  sealed trait `trunking-origination`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `trunking-origination`: `trunking-origination` = "trunking-origination".asInstanceOf[`trunking-origination`]
  
  @js.native
  sealed trait `trunking-origination-local`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `trunking-origination-local`: `trunking-origination-local` = "trunking-origination-local".asInstanceOf[`trunking-origination-local`]
  
  @js.native
  sealed trait `trunking-origination-mobile`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `trunking-origination-mobile`: `trunking-origination-mobile` = "trunking-origination-mobile".asInstanceOf[`trunking-origination-mobile`]
  
  @js.native
  sealed trait `trunking-origination-tollfree`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `trunking-origination-tollfree`: `trunking-origination-tollfree` = "trunking-origination-tollfree".asInstanceOf[`trunking-origination-tollfree`]
  
  @js.native
  sealed trait `trunking-recordings`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `trunking-recordings`: `trunking-recordings` = "trunking-recordings".asInstanceOf[`trunking-recordings`]
  
  @js.native
  sealed trait `trunking-secure`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `trunking-secure`: `trunking-secure` = "trunking-secure".asInstanceOf[`trunking-secure`]
  
  @js.native
  sealed trait `trunking-termination`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `trunking-termination`: `trunking-termination` = "trunking-termination".asInstanceOf[`trunking-termination`]
  
  @js.native
  sealed trait trunking_
    extends StObject
       with CallSummariesCallType
       with CallSummaryCallType
  inline def trunking_ : trunking_ = "trunking".asInstanceOf[trunking_]
  
  @js.native
  sealed trait trunking_originating
    extends StObject
       with CallSummariesCallDirection
  inline def trunking_originating: trunking_originating = "trunking_originating".asInstanceOf[trunking_originating]
  
  @js.native
  sealed trait trunking_terminating
    extends StObject
       with CallSummariesCallDirection
  inline def trunking_terminating: trunking_terminating = "trunking_terminating".asInstanceOf[trunking_terminating]
  
  @js.native
  sealed trait turnmegabytes
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def turnmegabytes: turnmegabytes = "turnmegabytes".asInstanceOf[turnmegabytes]
  
  @js.native
  sealed trait `turnmegabytes-australia`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `turnmegabytes-australia`: `turnmegabytes-australia` = "turnmegabytes-australia".asInstanceOf[`turnmegabytes-australia`]
  
  @js.native
  sealed trait `turnmegabytes-brasil`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `turnmegabytes-brasil`: `turnmegabytes-brasil` = "turnmegabytes-brasil".asInstanceOf[`turnmegabytes-brasil`]
  
  @js.native
  sealed trait `turnmegabytes-germany`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `turnmegabytes-germany`: `turnmegabytes-germany` = "turnmegabytes-germany".asInstanceOf[`turnmegabytes-germany`]
  
  @js.native
  sealed trait `turnmegabytes-india`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `turnmegabytes-india`: `turnmegabytes-india` = "turnmegabytes-india".asInstanceOf[`turnmegabytes-india`]
  
  @js.native
  sealed trait `turnmegabytes-ireland`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `turnmegabytes-ireland`: `turnmegabytes-ireland` = "turnmegabytes-ireland".asInstanceOf[`turnmegabytes-ireland`]
  
  @js.native
  sealed trait `turnmegabytes-japan`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `turnmegabytes-japan`: `turnmegabytes-japan` = "turnmegabytes-japan".asInstanceOf[`turnmegabytes-japan`]
  
  @js.native
  sealed trait `turnmegabytes-singapore`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `turnmegabytes-singapore`: `turnmegabytes-singapore` = "turnmegabytes-singapore".asInstanceOf[`turnmegabytes-singapore`]
  
  @js.native
  sealed trait `turnmegabytes-useast`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `turnmegabytes-useast`: `turnmegabytes-useast` = "turnmegabytes-useast".asInstanceOf[`turnmegabytes-useast`]
  
  @js.native
  sealed trait `turnmegabytes-uswest`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `turnmegabytes-uswest`: `turnmegabytes-uswest` = "turnmegabytes-uswest".asInstanceOf[`turnmegabytes-uswest`]
  
  @js.native
  sealed trait tw
    extends StObject
       with DialRingTone
  inline def tw: tw = "tw".asInstanceOf[tw]
  
  @js.native
  sealed trait `twilio-approved`
    extends StObject
       with BundleCopyStatus
       with BundleStatus
       with CustomerProfilesStatus
       with ReplaceItemsStatus
       with TrustProductsStatus
  inline def `twilio-approved`: `twilio-approved` = "twilio-approved".asInstanceOf[`twilio-approved`]
  
  @js.native
  sealed trait `twilio-interconnect`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `twilio-interconnect`: `twilio-interconnect` = "twilio-interconnect".asInstanceOf[`twilio-interconnect`]
  
  @js.native
  sealed trait `twilio-rejected`
    extends StObject
       with BundleCopyStatus
       with BundleStatus
       with CustomerProfilesStatus
       with ReplaceItemsStatus
       with TrustProductsStatus
  inline def `twilio-rejected`: `twilio-rejected` = "twilio-rejected".asInstanceOf[`twilio-rejected`]
  
  @js.native
  sealed trait uk
    extends StObject
       with DialRingTone
  inline def uk: uk = "uk".asInstanceOf[uk]
  
  @js.native
  sealed trait `uk-UA`
    extends StObject
       with GatherLanguage
  inline def `uk-UA`: `uk-UA` = "uk-UA".asInstanceOf[`uk-UA`]
  
  @js.native
  sealed trait umatilla
    extends StObject
       with ParticipantEdgeLocation
       with RoomEdgeLocation
  inline def umatilla: umatilla = "umatilla".asInstanceOf[umatilla]
  
  @js.native
  sealed trait unconfirmed
    extends StObject
       with FeedbackOutcome
       with VerificationAttemptAttemptStatus
  inline def unconfirmed: unconfirmed = "unconfirmed".asInstanceOf[unconfirmed]
  
  @js.native
  sealed trait unconverted
    extends StObject
       with VerificationAttemptConversionStatus
  inline def unconverted: unconverted = "unconverted".asInstanceOf[unconverted]
  
  @js.native
  sealed trait undelivered
    extends StObject
       with DeliveryReceiptDeliveryStatus
       with typings.twilio.messageDeliveryReceiptMod.DeliveryReceiptDeliveryStatus
       with InteractionResourceStatus
       with MessageInteractionResourceStatus
       with MessageStatus
       with VerificationAttemptMessageStatus
  inline def undelivered: undelivered = "undelivered".asInstanceOf[undelivered]
  
  @js.native
  sealed trait undialed
    extends StObject
       with CallSummariesCallState
       with CallSummaryCallState
  inline def undialed: undialed = "undialed".asInstanceOf[undialed]
  
  @js.native
  sealed trait `unexpected-failure`
    extends StObject
       with PlayerStreamerEndedReason
  inline def `unexpected-failure`: `unexpected-failure` = "unexpected-failure".asInstanceOf[`unexpected-failure`]
  
  @js.native
  sealed trait unit
    extends StObject
       with SsmlSayAsInterpretAs
  inline def unit: unit = "unit".asInstanceOf[unit]
  
  @js.native
  sealed trait unknown_
    extends StObject
       with InteractionChannelParticipantType
       with InteractionResourceStatus
       with InteractionType
       with MessageInteractionResourceStatus
       with MessageInteractionType
       with MetricStreamDirection
       with SessionStatus
  inline def unknown_ : unknown_ = "unknown".asInstanceOf[unknown_]
  
  @js.native
  sealed trait unknown_answered_by
    extends StObject
       with AnnotationAnsweredBy
  inline def unknown_answered_by: unknown_answered_by = "unknown_answered_by".asInstanceOf[unknown_answered_by]
  
  @js.native
  sealed trait unknown_connectivity_issue
    extends StObject
       with AnnotationConnectivityIssue
  inline def unknown_connectivity_issue: unknown_connectivity_issue = "unknown_connectivity_issue".asInstanceOf[unknown_connectivity_issue]
  
  @js.native
  sealed trait unknown_edge
    extends StObject
       with EventTwilioEdge
       with MetricTwilioEdge
  inline def unknown_edge: unknown_edge = "unknown_edge".asInstanceOf[unknown_edge]
  
  @js.native
  sealed trait unknown_quality_issue
    extends StObject
       with AnnotationQualityIssues
  inline def unknown_quality_issue: unknown_quality_issue = "unknown_quality_issue".asInstanceOf[unknown_quality_issue]
  
  @js.native
  sealed trait unregistered
    extends StObject
       with IncomingPhoneNumberEmergencyAddressStatus
       with LocalEmergencyAddressStatus
       with MobileEmergencyAddressStatus
       with TollFreeEmergencyAddressStatus
  inline def unregistered: unregistered = "unregistered".asInstanceOf[unregistered]
  
  @js.native
  sealed trait `unregistration-failure`
    extends StObject
       with IncomingPhoneNumberEmergencyAddressStatus
       with LocalEmergencyAddressStatus
       with MobileEmergencyAddressStatus
       with TollFreeEmergencyAddressStatus
  inline def `unregistration-failure`: `unregistration-failure` = "unregistration-failure".asInstanceOf[`unregistration-failure`]
  
  @js.native
  sealed trait `unsolicited-call`
    extends StObject
       with FeedbackIssues
  inline def `unsolicited-call`: `unsolicited-call` = "unsolicited-call".asInstanceOf[`unsolicited-call`]
  
  @js.native
  sealed trait unverified_
    extends StObject
       with FactorFactorStatuses
       with NewFactorFactorStatuses
  inline def unverified_ : unverified_ = "unverified".asInstanceOf[unverified_]
  
  @js.native
  sealed trait updating
    extends StObject
       with typings.twilio.wirelessV1SimMod.SimStatus
  inline def updating: updating = "updating".asInstanceOf[updating]
  
  @js.native
  sealed trait `ur-IN`
    extends StObject
       with GatherLanguage
  inline def `ur-IN`: `ur-IN` = "ur-IN".asInstanceOf[`ur-IN`]
  
  @js.native
  sealed trait `ur-PK`
    extends StObject
       with GatherLanguage
  inline def `ur-PK`: `ur-PK` = "ur-PK".asInstanceOf[`ur-PK`]
  
  @js.native
  sealed trait uri extends StObject
  inline def uri: uri = "uri".asInstanceOf[uri]
  
  @js.native
  sealed trait us
    extends StObject
       with DialRingTone
  inline def us: us = "us".asInstanceOf[us]
  
  @js.native
  sealed trait `us-old`
    extends StObject
       with DialRingTone
  inline def `us-old`: `us-old` = "us-old".asInstanceOf[`us-old`]
  
  @js.native
  sealed trait us1
    extends StObject
       with ConferenceParticipantRegion
       with ConferenceRegion
       with typings.twilio.voiceResponseMod.ConferenceRegion
       with ParticipantTwilioRealm
       with RoomTwilioRealm
  inline def us1: us1 = "us1".asInstanceOf[us1]
  
  @js.native
  sealed trait us2
    extends StObject
       with ConferenceParticipantRegion
       with ParticipantTwilioRealm
       with RoomTwilioRealm
  inline def us2: us2 = "us2".asInstanceOf[us2]
  
  @js.native
  sealed trait usage
    extends StObject
       with TriggerTriggerField
  inline def usage: usage = "usage".asInstanceOf[usage]
  
  @js.native
  sealed trait `uz-UZ`
    extends StObject
       with GatherLanguage
  inline def `uz-UZ`: `uz-UZ` = "uz-UZ".asInstanceOf[`uz-UZ`]
  
  @js.native
  sealed trait v1
    extends StObject
       with WebhookVersion
  inline def v1: v1 = "v1".asInstanceOf[v1]
  
  @js.native
  sealed trait v2
    extends StObject
       with WebhookVersion
  inline def v2: v2 = "v2".asInstanceOf[v2]
  
  @js.native
  sealed trait `valid-until`
    extends StObject
       with BundleSortBy
  inline def `valid-until`: `valid-until` = "valid-until".asInstanceOf[`valid-until`]
  
  @js.native
  sealed trait validating
    extends StObject
       with SinkStatus
  inline def validating: validating = "validating".asInstanceOf[validating]
  
  @js.native
  sealed trait ve
    extends StObject
       with DialRingTone
  inline def ve: ve = "ve".asInstanceOf[ve]
  
  @js.native
  sealed trait verified_
    extends StObject
       with DependentHostedNumberOrderStatus
       with FactorFactorStatuses
       with HostedNumberOrderStatus
       with NewFactorFactorStatuses
  inline def verified_ : verified_ = "verified".asInstanceOf[verified_]
  
  @js.native
  sealed trait `verify-push`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `verify-push`: `verify-push` = "verify-push".asInstanceOf[`verify-push`]
  
  @js.native
  sealed trait `verify-totp`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `verify-totp`: `verify-totp` = "verify-totp".asInstanceOf[`verify-totp`]
  
  @js.native
  sealed trait `verify-whatsapp-conversations-business-initiated`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `verify-whatsapp-conversations-business-initiated`: `verify-whatsapp-conversations-business-initiated` = "verify-whatsapp-conversations-business-initiated".asInstanceOf[`verify-whatsapp-conversations-business-initiated`]
  
  @js.native
  sealed trait `vi-VN`
    extends StObject
       with GatherLanguage
  inline def `vi-VN`: `vi-VN` = "vi-VN".asInstanceOf[`vi-VN`]
  
  @js.native
  sealed trait video
    extends StObject
       with PublishedTrackKind
       with RecordingType
       with RoomRecordingType
       with SubscribedTrackKind
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait `video-recordings`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `video-recordings`: `video-recordings` = "video-recordings".asInstanceOf[`video-recordings`]
  
  @js.native
  sealed trait visa
    extends StObject
       with PayValidCardTypes
       with PromptCardType
  inline def visa: visa = "visa".asInstanceOf[visa]
  
  @js.native
  sealed trait voice
    extends StObject
       with IncomingPhoneNumberVoiceReceiveMode
       with InteractionChannelType
       with InteractionType
       with LocalVoiceReceiveMode
       with MessageInteractionType
       with MobileVoiceReceiveMode
       with TollFreeVoiceReceiveMode
  inline def voice: voice = "voice".asInstanceOf[voice]
  
  @js.native
  sealed trait `voice-and-message`
    extends StObject
       with SessionMode
  inline def `voice-and-message`: `voice-and-message` = "voice-and-message".asInstanceOf[`voice-and-message`]
  
  @js.native
  sealed trait `voice-insights`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `voice-insights`: `voice-insights` = "voice-insights".asInstanceOf[`voice-insights`]
  
  @js.native
  sealed trait `voice-insights-client-insights-on-demand-minute`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `voice-insights-client-insights-on-demand-minute`: `voice-insights-client-insights-on-demand-minute` = "voice-insights-client-insights-on-demand-minute".asInstanceOf[`voice-insights-client-insights-on-demand-minute`]
  
  @js.native
  sealed trait `voice-insights-ptsn-insights-on-demand-minute`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `voice-insights-ptsn-insights-on-demand-minute`: `voice-insights-ptsn-insights-on-demand-minute` = "voice-insights-ptsn-insights-on-demand-minute".asInstanceOf[`voice-insights-ptsn-insights-on-demand-minute`]
  
  @js.native
  sealed trait `voice-insights-sip-interface-insights-on-demand-minute`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `voice-insights-sip-interface-insights-on-demand-minute`: `voice-insights-sip-interface-insights-on-demand-minute` = "voice-insights-sip-interface-insights-on-demand-minute".asInstanceOf[`voice-insights-sip-interface-insights-on-demand-minute`]
  
  @js.native
  sealed trait `voice-insights-sip-trunking-insights-on-demand-minute`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `voice-insights-sip-trunking-insights-on-demand-minute`: `voice-insights-sip-trunking-insights-on-demand-minute` = "voice-insights-sip-trunking-insights-on-demand-minute".asInstanceOf[`voice-insights-sip-trunking-insights-on-demand-minute`]
  
  @js.native
  sealed trait `voice-only`
    extends StObject
       with SessionMode
  inline def `voice-only`: `voice-only` = "voice-only".asInstanceOf[`voice-only`]
  
  @js.native
  sealed trait voip
    extends StObject
       with PhoneNumberType
       with typings.twilio.phoneNumberMod.PhoneNumberType
  inline def voip: voip = "voip".asInstanceOf[voip]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait weak
    extends StObject
       with SsmlBreakStrength
  inline def weak: weak = "weak".asInstanceOf[weak]
  
  @js.native
  sealed trait web
    extends StObject
       with FlexFlowChannelType
       with InteractionChannelType
  inline def web: web = "web".asInstanceOf[web]
  
  @js.native
  sealed trait webhook
    extends StObject
       with AddressConfigurationAutoCreationType
       with SinkSinkType
       with typings.twilio.conversationWebhookMod.WebhookTarget
       with WebhookTarget
       with typings.twilio.serviceConversationWebhookMod.WebhookTarget
       with WebhookType
       with typings.twilio.channelWebhookMod.WebhookType
  inline def webhook: webhook = "webhook".asInstanceOf[webhook]
  
  @js.native
  sealed trait webm
    extends StObject
       with CompositionFormat
       with CompositionHookFormat
       with MediaRecordingFormat
  inline def webm: webm = "webm".asInstanceOf[webm]
  
  @js.native
  sealed trait whatsapp
    extends StObject
       with AddressConfigurationType
       with FlexFlowChannelType
       with InteractionChannelType
       with VerificationAttemptChannels
       with VerificationAttemptsSummaryChannels
       with VerificationChannel
       with VerificationCheckChannel
  inline def whatsapp: whatsapp = "whatsapp".asInstanceOf[whatsapp]
  
  @js.native
  sealed trait whisper
    extends StObject
       with ReservationSupervisorMode
  inline def whisper: whisper = "whisper".asInstanceOf[whisper]
  
  @js.native
  sealed trait wireless
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def wireless: wireless = "wireless".asInstanceOf[wireless]
  
  @js.native
  sealed trait `wireless-orders`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-orders`: `wireless-orders` = "wireless-orders".asInstanceOf[`wireless-orders`]
  
  @js.native
  sealed trait `wireless-orders-artwork`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-orders-artwork`: `wireless-orders-artwork` = "wireless-orders-artwork".asInstanceOf[`wireless-orders-artwork`]
  
  @js.native
  sealed trait `wireless-orders-bulk`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-orders-bulk`: `wireless-orders-bulk` = "wireless-orders-bulk".asInstanceOf[`wireless-orders-bulk`]
  
  @js.native
  sealed trait `wireless-orders-esim`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-orders-esim`: `wireless-orders-esim` = "wireless-orders-esim".asInstanceOf[`wireless-orders-esim`]
  
  @js.native
  sealed trait `wireless-orders-starter`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-orders-starter`: `wireless-orders-starter` = "wireless-orders-starter".asInstanceOf[`wireless-orders-starter`]
  
  @js.native
  sealed trait `wireless-usage`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage`: `wireless-usage` = "wireless-usage".asInstanceOf[`wireless-usage`]
  
  @js.native
  sealed trait `wireless-usage-commands`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-commands`: `wireless-usage-commands` = "wireless-usage-commands".asInstanceOf[`wireless-usage-commands`]
  
  @js.native
  sealed trait `wireless-usage-commands-africa`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-commands-africa`: `wireless-usage-commands-africa` = "wireless-usage-commands-africa".asInstanceOf[`wireless-usage-commands-africa`]
  
  @js.native
  sealed trait `wireless-usage-commands-asia`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-commands-asia`: `wireless-usage-commands-asia` = "wireless-usage-commands-asia".asInstanceOf[`wireless-usage-commands-asia`]
  
  @js.native
  sealed trait `wireless-usage-commands-centralandsouthamerica`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-commands-centralandsouthamerica`: `wireless-usage-commands-centralandsouthamerica` = "wireless-usage-commands-centralandsouthamerica".asInstanceOf[`wireless-usage-commands-centralandsouthamerica`]
  
  @js.native
  sealed trait `wireless-usage-commands-europe`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-commands-europe`: `wireless-usage-commands-europe` = "wireless-usage-commands-europe".asInstanceOf[`wireless-usage-commands-europe`]
  
  @js.native
  sealed trait `wireless-usage-commands-home`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-commands-home`: `wireless-usage-commands-home` = "wireless-usage-commands-home".asInstanceOf[`wireless-usage-commands-home`]
  
  @js.native
  sealed trait `wireless-usage-commands-northamerica`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-commands-northamerica`: `wireless-usage-commands-northamerica` = "wireless-usage-commands-northamerica".asInstanceOf[`wireless-usage-commands-northamerica`]
  
  @js.native
  sealed trait `wireless-usage-commands-oceania`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-commands-oceania`: `wireless-usage-commands-oceania` = "wireless-usage-commands-oceania".asInstanceOf[`wireless-usage-commands-oceania`]
  
  @js.native
  sealed trait `wireless-usage-commands-roaming`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-commands-roaming`: `wireless-usage-commands-roaming` = "wireless-usage-commands-roaming".asInstanceOf[`wireless-usage-commands-roaming`]
  
  @js.native
  sealed trait `wireless-usage-data`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data`: `wireless-usage-data` = "wireless-usage-data".asInstanceOf[`wireless-usage-data`]
  
  @js.native
  sealed trait `wireless-usage-data-africa`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-africa`: `wireless-usage-data-africa` = "wireless-usage-data-africa".asInstanceOf[`wireless-usage-data-africa`]
  
  @js.native
  sealed trait `wireless-usage-data-asia`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-asia`: `wireless-usage-data-asia` = "wireless-usage-data-asia".asInstanceOf[`wireless-usage-data-asia`]
  
  @js.native
  sealed trait `wireless-usage-data-centralandsouthamerica`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-centralandsouthamerica`: `wireless-usage-data-centralandsouthamerica` = "wireless-usage-data-centralandsouthamerica".asInstanceOf[`wireless-usage-data-centralandsouthamerica`]
  
  @js.native
  sealed trait `wireless-usage-data-custom-additionalmb`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-custom-additionalmb`: `wireless-usage-data-custom-additionalmb` = "wireless-usage-data-custom-additionalmb".asInstanceOf[`wireless-usage-data-custom-additionalmb`]
  
  @js.native
  sealed trait `wireless-usage-data-custom-first5mb`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-custom-first5mb`: `wireless-usage-data-custom-first5mb` = "wireless-usage-data-custom-first5mb".asInstanceOf[`wireless-usage-data-custom-first5mb`]
  
  @js.native
  sealed trait `wireless-usage-data-domestic-roaming`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-domestic-roaming`: `wireless-usage-data-domestic-roaming` = "wireless-usage-data-domestic-roaming".asInstanceOf[`wireless-usage-data-domestic-roaming`]
  
  @js.native
  sealed trait `wireless-usage-data-europe`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-europe`: `wireless-usage-data-europe` = "wireless-usage-data-europe".asInstanceOf[`wireless-usage-data-europe`]
  
  @js.native
  sealed trait `wireless-usage-data-individual-additionalgb`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-individual-additionalgb`: `wireless-usage-data-individual-additionalgb` = "wireless-usage-data-individual-additionalgb".asInstanceOf[`wireless-usage-data-individual-additionalgb`]
  
  @js.native
  sealed trait `wireless-usage-data-individual-firstgb`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-individual-firstgb`: `wireless-usage-data-individual-firstgb` = "wireless-usage-data-individual-firstgb".asInstanceOf[`wireless-usage-data-individual-firstgb`]
  
  @js.native
  sealed trait `wireless-usage-data-international-roaming-canada`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-international-roaming-canada`: `wireless-usage-data-international-roaming-canada` = "wireless-usage-data-international-roaming-canada".asInstanceOf[`wireless-usage-data-international-roaming-canada`]
  
  @js.native
  sealed trait `wireless-usage-data-international-roaming-india`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-international-roaming-india`: `wireless-usage-data-international-roaming-india` = "wireless-usage-data-international-roaming-india".asInstanceOf[`wireless-usage-data-international-roaming-india`]
  
  @js.native
  sealed trait `wireless-usage-data-international-roaming-mexico`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-international-roaming-mexico`: `wireless-usage-data-international-roaming-mexico` = "wireless-usage-data-international-roaming-mexico".asInstanceOf[`wireless-usage-data-international-roaming-mexico`]
  
  @js.native
  sealed trait `wireless-usage-data-northamerica`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-northamerica`: `wireless-usage-data-northamerica` = "wireless-usage-data-northamerica".asInstanceOf[`wireless-usage-data-northamerica`]
  
  @js.native
  sealed trait `wireless-usage-data-oceania`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-oceania`: `wireless-usage-data-oceania` = "wireless-usage-data-oceania".asInstanceOf[`wireless-usage-data-oceania`]
  
  @js.native
  sealed trait `wireless-usage-data-pooled`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-pooled`: `wireless-usage-data-pooled` = "wireless-usage-data-pooled".asInstanceOf[`wireless-usage-data-pooled`]
  
  @js.native
  sealed trait `wireless-usage-data-pooled-downlink`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-pooled-downlink`: `wireless-usage-data-pooled-downlink` = "wireless-usage-data-pooled-downlink".asInstanceOf[`wireless-usage-data-pooled-downlink`]
  
  @js.native
  sealed trait `wireless-usage-data-pooled-uplink`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-data-pooled-uplink`: `wireless-usage-data-pooled-uplink` = "wireless-usage-data-pooled-uplink".asInstanceOf[`wireless-usage-data-pooled-uplink`]
  
  @js.native
  sealed trait `wireless-usage-mrc`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-mrc`: `wireless-usage-mrc` = "wireless-usage-mrc".asInstanceOf[`wireless-usage-mrc`]
  
  @js.native
  sealed trait `wireless-usage-mrc-custom`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-mrc-custom`: `wireless-usage-mrc-custom` = "wireless-usage-mrc-custom".asInstanceOf[`wireless-usage-mrc-custom`]
  
  @js.native
  sealed trait `wireless-usage-mrc-individual`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-mrc-individual`: `wireless-usage-mrc-individual` = "wireless-usage-mrc-individual".asInstanceOf[`wireless-usage-mrc-individual`]
  
  @js.native
  sealed trait `wireless-usage-mrc-pooled`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-mrc-pooled`: `wireless-usage-mrc-pooled` = "wireless-usage-mrc-pooled".asInstanceOf[`wireless-usage-mrc-pooled`]
  
  @js.native
  sealed trait `wireless-usage-mrc-suspended`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-mrc-suspended`: `wireless-usage-mrc-suspended` = "wireless-usage-mrc-suspended".asInstanceOf[`wireless-usage-mrc-suspended`]
  
  @js.native
  sealed trait `wireless-usage-sms`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-sms`: `wireless-usage-sms` = "wireless-usage-sms".asInstanceOf[`wireless-usage-sms`]
  
  @js.native
  sealed trait `wireless-usage-voice`
    extends StObject
       with AllTimeCategory
       with DailyCategory
       with LastMonthCategory
       with MonthlyCategory
       with RecordCategory
       with ThisMonthCategory
       with TodayCategory
       with TriggerUsageCategory
       with YearlyCategory
       with YesterdayCategory
  inline def `wireless-usage-voice`: `wireless-usage-voice` = "wireless-usage-voice".asInstanceOf[`wireless-usage-voice`]
  
  @js.native
  sealed trait woman
    extends StObject
       with SayVoice
  inline def woman: woman = "woman".asInstanceOf[woman]
  
  @js.native
  sealed trait wrapping
    extends StObject
       with ReservationStatus
       with typings.twilio.workerReservationMod.ReservationStatus
       with TaskStatus
  inline def wrapping: wrapping = "wrapping".asInstanceOf[wrapping]
  
  @js.native
  sealed trait wrapup
    extends StObject
       with InteractionChannelParticipantStatus
       with InteractionChannelStatus
  inline def wrapup: wrapup = "wrapup".asInstanceOf[wrapup]
  
  @js.native
  sealed trait `x-sampa`
    extends StObject
       with SsmlPhonemeAlphabet
  inline def `x-sampa`: `x-sampa` = "x-sampa".asInstanceOf[`x-sampa`]
  
  @js.native
  sealed trait `x-strong`
    extends StObject
       with SsmlBreakStrength
  inline def `x-strong`: `x-strong` = "x-strong".asInstanceOf[`x-strong`]
  
  @js.native
  sealed trait `x-weak`
    extends StObject
       with SsmlBreakStrength
  inline def `x-weak`: `x-weak` = "x-weak".asInstanceOf[`x-weak`]
  
  @js.native
  sealed trait y
    extends StObject
       with SsmlSayAsRole
  inline def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait yearly
    extends StObject
       with TriggerRecurring
  inline def yearly: yearly = "yearly".asInstanceOf[yearly]
  
  @js.native
  sealed trait ym
    extends StObject
       with SsmlSayAsRole
  inline def ym: ym = "ym".asInstanceOf[ym]
  
  @js.native
  sealed trait ymd
    extends StObject
       with SsmlSayAsRole
  inline def ymd: ymd = "ymd".asInstanceOf[ymd]
  
  @js.native
  sealed trait `yue-Hant-HK`
    extends StObject
       with GatherLanguage
  inline def `yue-Hant-HK`: `yue-Hant-HK` = "yue-Hant-HK".asInstanceOf[`yue-Hant-HK`]
  
  @js.native
  sealed trait yyyymmdd
    extends StObject
       with SsmlSayAsRole
  inline def yyyymmdd: yyyymmdd = "yyyymmdd".asInstanceOf[yyyymmdd]
  
  @js.native
  sealed trait za
    extends StObject
       with DialRingTone
  inline def za: za = "za".asInstanceOf[za]
  
  @js.native
  sealed trait zh
    extends StObject
       with GatherLanguage
  inline def zh: zh = "zh".asInstanceOf[zh]
  
  @js.native
  sealed trait `zh-CN`
    extends StObject
       with SayLanguage
  inline def `zh-CN`: `zh-CN` = "zh-CN".asInstanceOf[`zh-CN`]
  
  @js.native
  sealed trait `zh-HK`
    extends StObject
       with SayLanguage
  inline def `zh-HK`: `zh-HK` = "zh-HK".asInstanceOf[`zh-HK`]
  
  @js.native
  sealed trait `zh-TW`
    extends StObject
       with GatherLanguage
       with SayLanguage
  inline def `zh-TW`: `zh-TW` = "zh-TW".asInstanceOf[`zh-TW`]
  
  @js.native
  sealed trait `zu-ZA`
    extends StObject
       with GatherLanguage
  inline def `zu-ZA`: `zu-ZA` = "zu-ZA".asInstanceOf[`zu-ZA`]
}
