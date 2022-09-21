package typings.tizenCommonWeb.mod

import typings.std.Blob
import typings.tizenCommonWeb.mod.^
import typings.tizenCommonWeb.tizenCommonWebStrings.FOREGROUND
import typings.tizenCommonWeb.tizenCommonWebStrings.MAIN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def _package: PackageManager = ^.asInstanceOf[js.Dynamic].selectDynamic("package").asInstanceOf[PackageManager]

inline def account: AccountManager = ^.asInstanceOf[js.Dynamic].selectDynamic("account").asInstanceOf[AccountManager]

inline def alarm: AlarmManager = ^.asInstanceOf[js.Dynamic].selectDynamic("alarm").asInstanceOf[AlarmManager]

inline def application: ApplicationManager = ^.asInstanceOf[js.Dynamic].selectDynamic("application").asInstanceOf[ApplicationManager]

inline def archive: ArchiveManager = ^.asInstanceOf[js.Dynamic].selectDynamic("archive").asInstanceOf[ArchiveManager]

inline def content: ContentManager = ^.asInstanceOf[js.Dynamic].selectDynamic("content").asInstanceOf[ContentManager]

inline def datacontrol: DataControlManager = ^.asInstanceOf[js.Dynamic].selectDynamic("datacontrol").asInstanceOf[DataControlManager]

inline def download: DownloadManager = ^.asInstanceOf[js.Dynamic].selectDynamic("download").asInstanceOf[DownloadManager]

inline def exif: ExifManager = ^.asInstanceOf[js.Dynamic].selectDynamic("exif").asInstanceOf[ExifManager]

inline def filesystem: FileSystemManager = ^.asInstanceOf[js.Dynamic].selectDynamic("filesystem").asInstanceOf[FileSystemManager]

inline def iotcon: Iotcon_ = ^.asInstanceOf[js.Dynamic].selectDynamic("iotcon").asInstanceOf[Iotcon_]

inline def keymanager: KeyManager_ = ^.asInstanceOf[js.Dynamic].selectDynamic("keymanager").asInstanceOf[KeyManager_]

inline def mediacontroller: MediaControllerManager = ^.asInstanceOf[js.Dynamic].selectDynamic("mediacontroller").asInstanceOf[MediaControllerManager]

inline def messageport: MessagePortManager = ^.asInstanceOf[js.Dynamic].selectDynamic("messageport").asInstanceOf[MessagePortManager]

inline def push: PushManager = ^.asInstanceOf[js.Dynamic].selectDynamic("push").asInstanceOf[PushManager]

inline def systeminfo: SystemInfo_ = ^.asInstanceOf[js.Dynamic].selectDynamic("systeminfo").asInstanceOf[SystemInfo_]

inline def time: TimeUtil = ^.asInstanceOf[js.Dynamic].selectDynamic("time").asInstanceOf[TimeUtil]

inline def tvaudiocontrol: AudioControlManager = ^.asInstanceOf[js.Dynamic].selectDynamic("tvaudiocontrol").asInstanceOf[AudioControlManager]

inline def tvdisplaycontrol: DisplayControlManager = ^.asInstanceOf[js.Dynamic].selectDynamic("tvdisplaycontrol").asInstanceOf[DisplayControlManager]

inline def tvinfo: TVInfoManager = ^.asInstanceOf[js.Dynamic].selectDynamic("tvinfo").asInstanceOf[TVInfoManager]

inline def tvinputdevice: TVInputDeviceManager = ^.asInstanceOf[js.Dynamic].selectDynamic("tvinputdevice").asInstanceOf[TVInputDeviceManager]

inline def tvwindow: TVWindowManager = ^.asInstanceOf[js.Dynamic].selectDynamic("tvwindow").asInstanceOf[TVWindowManager]

inline def voicecontrol: VoiceControlClientManager = ^.asInstanceOf[js.Dynamic].selectDynamic("voicecontrol").asInstanceOf[VoiceControlClientManager]

inline def websetting: WebSettingManager = ^.asInstanceOf[js.Dynamic].selectDynamic("websetting").asInstanceOf[WebSettingManager]

type AccountArraySuccessCallback = js.Function1[/* accounts */ js.Array[Account_], Unit]

type AccountExtendedDataArraySuccessCallback = js.Function1[/* extendedDataArray */ js.Array[AccountExtendedData], Unit]

type AccountId = Double

type AccountProviderArraySuccessCallback = js.Function1[/* providers */ js.Array[AccountProvider], Unit]

type AlarmId = String

type ApplicationContextArraySuccessCallback = js.Function1[/* contexts */ js.Array[ApplicationContext], Unit]

type ApplicationContextId = String

type ApplicationId = String

type ApplicationInformationArraySuccessCallback = js.Function1[/* informationArray */ js.Array[ApplicationInformation], Unit]

type ArchiveFileEntryArraySuccessCallback = js.Function1[/* entries */ js.Array[ArchiveFileEntry], Unit]

type ArchiveFileEntrySuccessCallback = js.Function1[/* entry */ ArchiveFileEntry, Unit]

type ArchiveFileProgressCallback = js.Function3[/* operationIdentifier */ Double, /* value */ Double, /* filename */ String, Unit]

type ArchiveFileSuccessCallback = js.Function1[/* archive */ ArchiveFile, Unit]

type AvailableWindowListCallback = js.Function1[/* type */ js.Array[WindowType], Unit]

type BundleItemCallback = js.Function3[/* key */ String, /* value */ Any, /* type */ BundleValueType, Unit]

type ByteStream = js.Array[Double]

type ByteStreamDataItemValue = ByteStream | js.Array[ByteStream]

type CacheUpdatedCallback = js.Function1[/* representation */ Representation, Unit]

type CaptionValueChangeCallback = js.Function2[/* key */ CaptionInfoKey, /* value */ CaptionValue, Unit]

type ContentArraySuccessCallback = js.Function1[/* contents */ js.Array[Content_], Unit]

type ContentDirectoryArraySuccessCallback = js.Function1[/* directories */ js.Array[ContentDirectory], Unit]

type ContentDirectoryId = String

type ContentId = String

type ContentScanSuccessCallback = js.Function1[/* uri */ String, Unit]

type DataControlChangeCallback = js.Function2[/* type */ EventType, /* data */ RowData, Unit]

type DataControlErrorCallback = js.Function2[/* reqId */ Double, /* error */ WebAPIError, Unit]

type DataControlGetValueSuccessCallback = js.Function2[/* values */ js.Array[String], /* reqid */ Double, Unit]

type DataControlInsertSuccessCallback = js.Function2[/* reqId */ Double, /* insertRowId */ Double, Unit]

type DataControlSelectSuccessCallback = js.Function2[/* rows */ js.Array[RowData], /* reqId */ Double, Unit]

type DataControlSuccessCallback = js.Function1[/* reqId */ Double, Unit]

type DownloadHTTPHeaderFields = Any

type ErrorCallback = js.Function1[/* error */ WebAPIError, Unit]

type EventCallback = js.Function2[/* event */ EventInfo, /* data */ EventData, Unit]

type EventData = SystemEventData | UserEventData

type ExifInformationSuccessCallback = js.Function1[/* exifInfo */ ExifInformation, Unit]

type ExifThumbnailSuccessCallback = js.Function1[/* uri */ String | Null, Unit]

type FileArraySuccessCallback = js.Function1[/* files */ js.Array[File], Unit]

type FileReference = String | File

type FileStreamSuccessCallback = js.Function1[/* filestream */ FileStream, Unit]

type FileStringSuccessCallback = js.Function1[/* fileStr */ String, Unit]

type FileSuccessCallback = js.Function1[/* file */ File, Unit]

type FileSystemStorageArraySuccessCallback = js.Function1[/* storages */ js.Array[FileSystemStorage], Unit]

type FileSystemStorageSuccessCallback = js.Function1[/* storage */ FileSystemStorage, Unit]

type FindAppControlSuccessCallback = js.Function2[
/* informationArray */ js.Array[ApplicationInformation], 
/* appControl */ ApplicationControl, 
Unit]

type FoundDeviceInfoSuccessCallback = js.Function1[/* info */ DeviceInfo, Unit]

type FoundPlatformInfoSuccessCallback = js.Function1[/* info */ PlatformInfo, Unit]

type FoundResourceSuccessCallback = js.Function1[/* remoteResource */ RemoteResource, Unit]

type GeneratedPinCallback = js.Function1[/* pin */ String, Unit]

type InputDeviceKeyName = String

type ListDirectorySuccessCallback = js.Function2[/* names */ js.Array[String], /* path */ Path, Unit]

type MediaControllerDisplayModeChangeCallback = js.Function1[/* mode */ MediaControllerDisplayModeType, Unit]

type MediaControllerDisplayModeChangeRequestCallback = js.Function2[/* clientName */ ApplicationId, /* mode */ MediaControllerDisplayModeType, Unit]

type MediaControllerDisplayRotationChangeCallback = js.Function1[/* displayRotation */ MediaControllerDisplayRotationType, Unit]

type MediaControllerDisplayRotationChangeRequestCallback = js.Function2[
/* clientName */ ApplicationId, 
/* displayRotation */ MediaControllerDisplayRotationType, 
Unit]

type MediaControllerEnabledChangeCallback = js.Function1[/* enabled */ Boolean, Unit]

type MediaControllerEnabledChangeRequestCallback = js.Function2[/* clientName */ ApplicationId, /* enabled */ Boolean, Unit]

type MediaControllerGetAllPlaylistsSuccessCallback = js.Function1[/* playlists */ js.Array[MediaControllerPlaylist], Unit]

type MediaControllerGetItemsSuccessCallback = js.Function1[/* items */ js.Array[MediaControllerPlaylistItem], Unit]

type MediaControllerReceiveCommandCallback = js.Function3[/* senderAppName */ ApplicationId, /* command */ String, /* data */ Any, Unit]

type MediaControllerSearchRequestCallback = js.Function2[/* clientName */ ApplicationId, /* request */ js.Array[SearchFilter], Unit]

type MediaControllerSearchRequestReplyCallback = js.Function1[/* reply */ RequestReply | Null, Unit]

type MediaControllerSendCommandSuccessCallback = js.Function2[/* data */ Any, /* code */ js.UndefOr[Double], Unit]

type MediaControllerServerInfoArraySuccessCallback = js.Function1[/* servers */ js.Array[MediaControllerServerInfo], Unit]

type MediaControllerServerStatusChangeCallback = js.Function1[/* status */ MediaControllerServerState, Unit]

type MessagePortCallback = js.Function2[
/* data */ js.Array[MessagePortDataItem], 
/* remoteMessagePort */ RemoteMessagePort | Null, 
Unit]

type Mode3DEffectListSupportCallback = js.Function1[/* mode3DEffects */ js.Array[Display3DEffectMode], Unit]

type PackageId = String

type PackageInformationArraySuccessCallback = js.Function1[/* informationArray */ js.Array[PackageInformation], Unit]

type Path = String

type PathSuccessCallback = js.Function1[/* path */ Path, Unit]

type PlaylistArraySuccessCallback = js.Function1[/* playlists */ js.Array[Playlist], Unit]

type PlaylistId = String

type PlaylistItemArraySuccessCallback = js.Function1[/* items */ js.Array[PlaylistItem], Unit]

type PlaylistSuccessCallback = js.Function1[/* playlist */ Playlist, Unit]

type PresenceEventCallback = js.Function1[/* presenceResponse */ PresenceResponse, Unit]

type PushNotificationCallback = js.Function1[/* message */ PushMessage, Unit]

type PushRegisterSuccessCallback = js.Function1[/* id */ PushRegistrationId, Unit]

type PushRegistrationId = String

type PushRegistrationStateChangeCallback = js.Function1[/* state */ PushRegistrationState, Unit]

type RawData = String

type ReadBlobSuccessCallback = js.Function1[/* blob */ Blob, Unit]

type ReadDataSuccessCallback = js.Function1[/* data */ js.typedarray.Uint8Array, Unit]

type ReadStringSuccessCallback = js.Function1[/* string */ String, Unit]

type RemoteResourceResponseCallback = js.Function1[/* response */ RemoteResponse, Unit]

type ResourceInterface = String

type ResourceStateChangeCallback = js.Function1[/* isAlive */ Boolean, Unit]

type ResourceType = String

type SeekSuccessCallback = js.Function1[/* position */ Double, Unit]

type SourceChangedSuccessCallback = js.Function2[/* source */ SystemInfoVideoSourceInfo, /* type */ WindowType, Unit]

type StatusEventCallback = js.Function2[/* appId */ ApplicationId, /* isActive */ Boolean, Unit]

type StringDataItemValue = String | js.Array[String]

type SuccessCallback = js.Function0[Unit]

type SystemInfoPropertyArraySuccessCallback = js.Function1[/* property */ js.Array[SystemInfoPropertyType], Unit]

type SystemInfoPropertySuccessCallback = js.Function1[/* property */ SystemInfoPropertyType, Unit]

type ThumbnailSuccessCallback = js.Function1[/* path */ String, Unit]

type UserEventData = Any

type VideoResolutionChangeCallback = js.Function2[/* resolution */ VideoResolution, /* type */ WindowType, Unit]

type VoiceControlCommandType = FOREGROUND

type VoiceControlLanguageChangeCallback = js.Function2[/* previous */ String, /* current */ String, Unit]

type VoiceControlResultCallback = js.Function3[
/* event */ VoiceControlResultEvent, 
/* list */ js.Array[VoiceControlCommand], 
/* results */ String, 
Unit]

type VolumeChangeCallback = js.Function1[/* volume */ Double, Unit]

type WindowRectangleSuccessCallback = js.Function2[/* windowRect */ js.Array[String], /* type */ WindowType, Unit]

type WindowType = MAIN

type WriteStringSuccessCallback = js.Function1[/* bytesCount */ Double, Unit]
