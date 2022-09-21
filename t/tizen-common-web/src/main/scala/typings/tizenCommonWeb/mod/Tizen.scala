package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tizen extends StObject {
  
  val AlarmAbsolute: AlarmAbsoluteConstructor
  
  val AlarmRelative: AlarmRelativeConstructor
  
  val ApplicationControl: ApplicationControlConstructor
  
  val ApplicationControlData: ApplicationControlDataConstructor
  
  val AttributeFilter: AttributeFilterConstructor
  
  val AttributeRangeFilter: AttributeRangeFilterConstructor
  
  val Bundle: BundleConstructor
  
  val CompositeFilter: CompositeFilterConstructor
  
  val DownloadRequest: DownloadRequestConstructor
  
  val ExifInformation: ExifInformationConstructor
  
  val IotconOption: IotconOptionConstructor
  
  val Query: typings.tizenCommonWeb.mod.Query
  
  val Representation: RepresentationConstructor
  
  val Response: ResponseConstructor
  
  val SimpleCoordinates: SimpleCoordinatesConstructor
  
  val SortMode: SortModeConstructor
  
  val TZDate: TZDateConstructor
  
  val TimeDuration: TimeDurationConstructor
  
  val VoiceControlCommand: VoiceControlCommandConstructor
  
  /**
    * This API provides functionalities to install or uninstall packages, and retrieve information about installed packages.
    * It also provides a listener method so that an application can be notified when there is a change on the installed packages.
    *
    * **Remark:** In order to access files, a proper privilege has to be defined additionally:
    *
    * *   for accessing only internal storage using this API, a privilege [http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) must be provided,
    * *   for accessing only external storage using this API, a privilege [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage) must be provided,
    * *   for accessing internal and external storage using this API, privileges ([http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) and [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage)) must be provided.
    *
    *
    * For more information on the Package features, see [Package Guide](/application/web/guides/app-management/packages).
    * @since 2.1
    */
  @JSName("package")
  val _package: PackageManager
  
  /* tslint:disable:no-irregular-whitespace */
  /**
    * The Account API provides functionality for using existing configured
    * online accounts and providers, and for creating accounts of known types.
    *
    * The basic concepts are:
    *
    * *   **Provider** is an online service provider entity, such as
    * Google, Vodafone or Facebook. A service provider is identified by its applicationId.
    * Account provider will be registered while the application is installed.
    * The information will be used in the "Add account" screen in Settings.
    * *   **Account** collects all the data (user name, credential, settings)
    * needed for connecting to services. An account is always bound to a single provider,
    * and has a list of service instances bound to the account. The services can be
    * individually enabled and disabled on the given account. For instance,
    * account1@gmail.com can identify a Google account, giving access to services such as
    * gmail, gtalk, Picasa, and Youtube with each service having a separate service
    * instance bound to the account.
    *
    *
    * To use _add(), remove(), and update()_ methods of AccountManager can be invoked only
    * by account provider application. A web application is an account provider when its _config.xml_
    * contains [Account provider section](/application/tizen-studio/web-tools/config-editor#mw_account). For example:
    *
    * ```xml
    * <tizen:account multiple-account-support="true">
    *    <tizen:icon section="Account">icon.png</tizen:icon>
    *    <tizen:icon section="AccountSmall">icon.png</tizen:icon>
    *    <tizen:display-name xml:lang="en-gb">Test</tizen:display-name>
    *    <tizen:capability>http://tizen.org/account/capability/contact</tizen:capability>
    * </tizen:account>
    * ```
    * For more information about how to use Account API, see [Account Guide](/application/web/guides/personal/account).
    *
    * @since 5.0
    *
    * @defApiFeature http://tizen.org/feature/account
    * To guarantee the running of the application on a device with Account feature.
    */
  /* tslint:enable:no-irregular-whitespace */
  val account: AccountManager
  
  /**
    * The Alarm API provides functionality for scheduling the system alarm.
    * It allows you to run other applications and have them perform operations at a specific time.
    * You can schedule an alarm to go off once or to repeat at specific intervals.
    *
    * Each application has its own individual alarm storage, that is, applications cannot view or edit alarms set by other applications.
    *
    * Once an alarm goes off, it will be removed from the alarm storage automatically.
    * _AlarmManager_ provides methods to manage alarms such as adding and removing.
    *
    * **Remark:** In order to access files, a proper privilege has to be defined additionally:
    *
    * *   for accessing only internal storage using this API, a privilege [http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) must be provided,
    * *   for accessing only external storage using this API, a privilege [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage) must be provided,
    * *   for accessing internal and external storage using this API, privileges ([http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) and [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage)) must be provided.
    *
    *
    * For more information on the Alarm features, see [Alarm Guide](/application/web/guides/alarm/alarms).
    *
    * @since 1.0
    */
  val alarm: AlarmManager
  
  /**
    * This API provides a way to launch other applications and access
    * application management.
    *
    * The _ApplicationManager_ interface also provides methods to launch other applications
    * explicitly and implicitly through the _ApplicationControl_ interface.
    * The _ApplicationControl_ interface consists of an operation, URI, and MIME type
    * and also describes an action to be performed by other
    * applications and can carry the result from the subsequent application.
    * The _ApplicationManager_ interface also provides methods to handle the application
    * lifecycle, to access the installed applications on the device, and to let
    * an application be notified of a change in the application list.
    *
    * The _Application_ interface defines the current application's information and
    * the basic operations for the current application such as exit or hide.
    *
    * Since Tizen 2.4 the _Application_ interface provides application event broadcasting and listening features. An application can broadcast user events to other listening applications and listen to broadcasted user events from other applications. In a future Tizen release, applications will also be able to receive pre-defined system events from the platform.
    *
    * For more information on the Application features, see [Application Guide](/application/web/guides/applications/overview), [Application Group Guide](/application/web/guides/app-management/app-group) or [Application Control Guide](/application/web/guides/app-management/app-controls).
    *
    * @since 1.0
    *
    * @defApiFeature http://tizen.org/feature/battery
    * To guarantee the running of the application on a device which has battery.
    */
  val application: ApplicationManager
  
  /**
    * The Archive API provides functions to create and manage archive files.
    * You can extract files, add a file to an archive file, and so on.
    *
    * **Remark:** In order to access files, a proper privilege has to be defined additionally:
    *
    * *   for accessing only internal storage using this API, a privilege [http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) must be provided,
    * *   for accessing only external storage using this API, a privilege [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage) must be provided,
    * *   for accessing internal and external storage using this API, privileges ([http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) and [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage)) must be provided.
    *
    *
    * For more information about how to use Archive API, see [File Archiving Guide](/application/web/guides/data/file-archiving).
    *
    * @since 2.3
    */
  val archive: ArchiveManager
  
  /**
    * The Content API provides functionality to discover content such as images, videos, music, or others.
    *
    * It is possible to search for specific content using filters.
    * The API also supports setting the attributes of specific content.
    *
    * **Remark:** In order to access files, a proper privilege has to be defined additionally:
    *
    * *   for accessing only internal storage using this API, a privilege [http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) must be provided,
    * *   for accessing only external storage using this API, a privilege [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage) must be provided,
    * *   for accessing internal and external storage using this API, privileges ([http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) and [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage)) must be provided.
    *
    *
    * For more information on the Content features, see [Stored Content Management](/application/web/guides/data/stored-content).
    *
    * Playlist functionality has been added in Tizen 2.3.
    *
    * @since 2.0
    */
  val content: ContentManager
  
  /**
    * This specification defines a Data Control API for applications.
    *
    * The Data Control functionality provides a way to access specific data that is exported by other applications.
    *
    * Please read the [Data Control guide](/application/web/guides/app-management/data-control) to know how to share own application data with other applications.
    *
    * @since 2.4
    */
  val datacontrol: DataControlManager
  
  /**
    * This API provides methods to asynchronously download the contents of a URL to a storage.
    *
    * **Remark:** In order to access files, a proper privilege has to be defined additionally:
    *
    * *   for accessing only internal storage using this API, a privilege [http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) must be provided,
    * *   for accessing only external storage using this API, a privilege [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage) must be provided,
    * *   for accessing internal and external storage using this API, privileges ([http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) and [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage)) must be provided.
    *
    *
    * For more information on the Download features, see [Download Guide](/application/web/guides/connectivity/download).
    *
    * @since 2.0
    *
    * @defApiFeature http://tizen.org/feature/network.wifi
    * DownloadNetworkType WIFI can be available on a Wi-Fi enabled device. To guarantee that the download application runs on a device with the Wi-Fi feature, declare the following feature requirements in the config file:
    * @defApiFeature http://tizen.org/feature/network.telephony
    * DownloadNetworkType _CELLULAR_ can be available on a cellular-enabled device. To guarantee that the download application runs on a device with the cellular feature, declare the following feature requirements in the config file:
    * @defApiFeature http://tizen.org/feature/network.ethernet
    * DownloadNetworkType _ALL_ can be available on a ethernet-enabled device. To guarantee that the download application runs on a device with the ethernet network feature.
    */
  val download: DownloadManager
  
  /**
    * The Exif API provides interfaces and methods for manipulating [Exif](http://en.wikipedia.org/wiki/Exchangeable_image_file_format) data from a JPEG file.
    * The _ExifManager_ object provides methods to retrieve the _ExifInformation_ object from a JPEG file
    * and save the Exif data from the _ExifInformation_ object in the JPEG file.
    * The _ExifInformation_ object provides functionality to get and set the Exif attributes corresponding to the Exif tag.
    * Changing the value of the attribute in the _ExifInformation_ object stores the Exif data in the _ExifInformation_ object. It does not change data in the JPEG file.
    * For applying the modified Exif data to the JPEG file,
    * the saveExifInfo() method of the _ExifManager_ object should be called with the _ExifInformation_ object that has the modified Exif data.
    *
    * **Remark:** In order to access files, a proper privilege has to be defined additionally:
    *
    * *   for accessing only internal storage using this API, a privilege [http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) must be provided,
    * *   for accessing only external storage using this API, a privilege [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage) must be provided,
    * *   for accessing internal and external storage using this API, privileges ([http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) and [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage)) must be provided.
    *
    *
    * For more information about how to use Exif API, see [Exif Guide](/application/web/guides/multimedia/jpeg-exif).
    *
    * @since 2.3
    */
  val exif: ExifManager
  
  /**
    * The Filesystem API provides access to a device's filesystem.
    *
    * The filesystem is represented as an abstract collection of disjointed filesystem virtual
    * root locations, each corresponding to a specific location in the device
    * filesystem. The filesystem API exposes the hierarchies below these root
    * locations as autonomous virtual filesystems.
    *
    * Each virtual root has a string name. Each file or directory within the virtual
    * filesystem is addressed using a fully-qualified path of the form:
    * _root name/path_ where _rootname_ is
    * the name of the virtual root and _path_ is the path to the file or
    * directory relative to that root.
    *
    * The following virtual roots must be supported:
    *
    *
    * *   images - the location for images
    * *   videos - the location for videos
    * *   music - the location for sounds
    * *   documents - the location for documents
    * *   downloads - the location for downloaded items
    * *   camera - the location for the pictures and videos taken by a device (supported since Tizen 2.3)
    * *   wgt-package - the location for widget package which is read-only
    * *   wgt-private - the location for a widget's private storage
    * *   wgt-private-tmp - the location for a widget's private volatile storage
    * *   removable\__..._ - the location for external storages. The _"..."_ suffix is a unique identifier of an external storage.
    * To obtain list of available external storages use [listStorages](#FileSystemManager::listStorages).
    *
    *
    * The file URI path is also supported. To access paths out of virtual root, for example "file:///tmp" can be used as location parameter.
    *
    * The implementation must support the use of the following characters in file names:
    *
    * *   Letters (a-z, A-Z)
    * *   Digits (0-9)
    * *   Blank space
    * *   Underscore ("\_")
    * *   Hyphen ("-")
    * *   Period (".")
    *
    *
    * The implementation may support additional characters in file names, depending on platform support.
    *
    * The implementation may forbid the use of additional characters in file names, depending on the platform.
    * The use of the path (component) separator "/" and null character "\\\\x00" should not be allowed in file names.
    *
    * Some other file name and path characteristics are platform-dependent,
    * for example, maximum path length, file name length, case sensitivity, additional
    * character support, etc. Therefore, it is recommended to avoid any dependency
    * on aspects that cannot be supported across multiple platforms.
    *
    * The encoding used for the file path should be UTF-16 (default for ECMAScript String).
    *
    * **Remark:** In order to access files, a proper privilege has to be defined additionally:
    *
    * *   for accessing only internal storage using this API, a privilege [http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) must be provided,
    * *   for accessing only external storage using this API, a privilege [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage) must be provided,
    * *   for accessing internal and external storage using this API, privileges ([http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) and [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage)) must be provided.
    *
    *
    * **Remark:** Methods, which names end with NonBlocking are asynchronous and are executed in background in the order in which they were called. Corresponding methods without NonBlocking at the end are synchronous and will block further instructions execution, until they are finished.
    *
    * For more information on the Filesystem features, see [File System Guide](/application/web/guides/data/file-system).
    *
    * @since 1.0
    */
  val filesystem: FileSystemManager
  
  /**
    * The Iotcon API provides functions for IoT connectivity.
    *
    * It allows to register, discover and access to resources via RESTful API.
    *
    * **Remark:** In order to access files, a proper privilege has to be defined additionally:
    *
    * *   for accessing only internal storage using this API, a privilege [http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) must be provided,
    * *   for accessing only external storage using this API, a privilege [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage) must be provided,
    * *   for accessing internal and external storage using this API, privileges ([http://tizen.org/privilege/mediastorage](http://tizen.org/privilege/mediastorage) and [http://tizen.org/privilege/externalstorage](http://tizen.org/privilege/externalstorage)) must be provided.
    *
    *
    * For more information on the IoT features, see [IoT Guide](/application/web/guides/connectivity/iotcon).
    *
    * @since 3.0
    *
    * @defApiFeature http://tizen.org/feature/iot.ocf
    *
    * To guarantee this application will run on a device with a Iotcon, add the below feature declaration to the config file
    */
  val iotcon: Iotcon_
  
  /**
    * The Key Manager API provides a secure repository for storing, retrieving and removing the sensitive data of users and their applications. Users can protect the data with passwords.
    *
    * For more information on the Key Manager features, see [Key Manager Guide](/application/web/guides/security/secure-key).
    *
    * @since 2.4
    */
  val keymanager: KeyManager_
  
  /**
    * The Media Controller API provides functions for communication between the media
    * controller server and the media controller client.
    *
    * It helps to transfer the information like playback info, shuffle/repeat mode
    * and metadata from media controller server to client. Allows to control server state
    * by sending commands from client.
    *
    * For more information on the Media Controller features, see [Media Controller Guide](/application/web/guides/multimedia/media-controller).
    *
    * @since 5.0
    */
  val mediacontroller: MediaControllerManager
  
  /**
    * The Message Port API provides the functionality for communicating with other applications.
    *
    * For more information on the Message Port features, see [Message Port Guide](/application/web/guides/app-management/message-port).
    *
    * @since 2.1
    */
  val messageport: MessagePortManager
  
  /**
    * The Push API provides functionality for receiving push notifications
    * from the Tizen push server.
    * The push service is a client daemon that maintains a permanent connection
    * between your device and the Tizen push server. Connection with push service is used to deliver push notifications
    * to the application, and process the registration and deregistration requests.
    *
    * To receive push notifications, follow the steps below:
    *
    * *   Connecting to the push service
    * *   Registering your application, if the application has not been registered yet
    * *   Getting notification data
    *
    *
    * For more information on the Push features, see [Push Guide](/application/web/guides/messaging/push).
    *
    * To use Push features the application needs the permission to access the Tizen Push servers.
    *
    * **Service Limitation:**
    *
    * *   Size of a push message is limited: _alertMessage_ up to 127 bytes, and _appData_ (payload data) less than 1 KB.
    * *   Push service does not guarantee delivery and order of push messages.
    *
    *
    * @since 3.0
    * @defApiFeature http://tizen.org/feature/network.push
    * To guarantee that the push application runs on a device with the push feature.
    */
  val push: PushManager
  
  /**
    * This specification defines interfaces and methods that provide web applications with access to various properties of a system.
    *
    * This API also provides interfaces and methods that can retrieve statuses of hardware devices, get the value of selected properties, and subscribe to asynchronous notifications of changes for selected values.
    *
    * Web applications can use this API to access the following system properties:
    *
    * *   ADS (**Since**: 3.0)
    * *   BATTERY
    * *   BUILD
    * *   CAMERA\_FLASH (**Since**: 2.4)
    * *   CELLULAR\_NETWORK
    * *   CPU
    * *   DEVICE\_ORIENTATION
    * *   DISPLAY
    * *   ETHERNET\_NETWORK (**Since**: 2.4)
    * *   LOCALE (**Since**: 2.1)
    * *   MEMORY (**Since**: 2.3)
    * *   NET\_PROXY\_NETWORK (**Since**: 3.0)
    * *   NETWORK
    * *   PERIPHERAL (**Since**: 2.1)
    * *   SERVICE\_COUNTRY (**Since**: 5.5)
    * *   SIM
    * *   STORAGE
    * *   VIDEOSOURCE (**Since**: 2.3)
    * *   WIFI\_NETWORK
    *
    *
    * Not all above properties may be available on every Tizen device. For instance, a device may not support the telephony feature. In that case, CELLULAR\_NETWORK and SIM are not available.
    * To check the available [SystemInfoPropertyId](#SystemInfoPropertyId), [getCapability()](#SystemInfo::getCapability) method can be used.
    *
    *
    * *   BATTERY - tizen.systeminfo.getCapability(_"http://tizen.org/feature/battery"_)
    * *   CAMERA\_FLASH - tizen.systeminfo.getCapability(_"http://tizen.org/feature/camera.back.flash"_)
    * *   CELLULAR\_NETWORK - tizen.systeminfo.getCapability(_"http://tizen.org/feature/network.telephony"_)
    * *   DISPLAY - tizen.systeminfo.getCapability(_"http://tizen.org/feature/screen"_)
    * *   ETHERNET\_NETWORK - tizen.systeminfo.getCapability(_"http://tizen.org/feature/network.ethernet"_)
    * *   NET\_PROXY\_NETWORK - tizen.systeminfo.getCapability(_"http://tizen.org/feature/network.net\_proxy"_)
    * *   SIM - tizen.systeminfo.getCapability(_"http://tizen.org/feature/network.telephony"_)
    * *   WIFI\_NETWORK - tizen.systeminfo.getCapability(_"http://tizen.org/feature/network.wifi"_)
    *
    *
    * For more information on the System Information features, see [System Information Guide](/application/web/guides/device/system-information).
    * @since 1.0
    *
    * @defApiFeature http://tizen.org/feature/battery
    * To guarantee the running of the application (e.g. track the battery usage) on a device which has a battery, declare the following feature requirements in the config file:
    * @defApiFeature http://tizen.org/feature/camera.back.flash
    * To guarantee the running of the application on a device which has camera back flash and control it, declare the following feature requirements in the config file:
    * @defApiFeature http://tizen.org/feature/network.ethernet
    * To guarantee the running of the application on a device which supports Ethernet network feature, declare the following feature requirements in the config file:
    * @defApiFeature http://tizen.org/feature/network.net\_proxy
    * To guarantee the running of the application on a device which supports network proxy for internet connection, declare the following feature requirements in the config file:
    * @defApiFeature http://tizen.org/feature/network.telephony
    * To guarantee the running of the application on a device which supports telephony feature, declare the following feature requirements in the config file:
    * @defApiFeature http://tizen.org/feature/network.wifi
    * To guarantee the running of the application on a device which supports Wi-Fi.
    */
  val systeminfo: SystemInfo_
  
  /**
    * The Time API provides information regarding date/time and time zones.
    *
    * @since 1.0
    *
    * The JavaScript Date object does not have full timezone support.
    * Date objects allow only simple representations to denote a particular location's
    * offset from Universal Coordinated Time (UTC). This is typically provided as a +/-
    * offset from UTC-0 (also known as Greenwich Mean Time, or GMT) for example, +05:30 denotes
    * that a location is 5 hours and 30 minutes ahead of UTC +00:00.
    * The issue with this method is not getting the correct
    * local time for a given date. The existing methods are sufficient for this purpose.
    * The issue is correctly converting to and from local time and UTC for all points in
    * time - in any of the past, present, and future - based on an initial time provided.
    * This is important for defining relative dates, where a time in a given location may
    * observe different UTC offsets, according to any Daylight Savings Rules (DST) in effect
    * or any other changes that may occur to a location's time zone over time.
    * Without the communication of the explicit time zone rules governing a given date and
    * time, the ability to effectively calculate the offset of the local time to UTC or to
    * any other time zone at any point in the past or future is lost.
    *
    * This API can be used to get TZDate objects with full time zone support, convert them
    * between timezones, retrieve available timezones.
    *
    * For more information on the Time features, see [Time Guide](/application/web/guides/device/time).
    */
  val time: TimeUtil
  
  /**
    * This API provides the audio control features (such as volume and mute) on the TV associated device.
    * There will be a _tizen.tvaudiocontrol_ object that allows access to the functionality of the TV Audio Control API.
    *
    * @since 2.3
    *
    * @defApiFeature http://tizen.org/feature/tv.audio
    * To guarantee the running of this application on a device with a TV audio control support.
    */
  val tvaudiocontrol: AudioControlManager
  
  /**
    * This API provides interfaces for managing stereoscopic 3D effects
    * for television signals.
    *
    * Modern TVs and projectors can display two images, a left image and a right image,
    * which are displayed to the left and right eyes respectively. This technique creates
    * an illusion of depth, which is perceived by users as a 3D image.
    *
    * For more information about stereoscopy, see this
    * [Wikipedia article](http://en.wikipedia.org/wiki/Stereoscopy).
    *
    * There are several formats of input images supported by the stereoscopy
    * plugin:
    *
    * *   Side-by-side: Left and right images are merged into one
    * picture. The left image is at the left side and the right image is at the right
    * side. Both images are scaled to fit in the original
    * image ratio.
    * *   Top-bottom: Left and right images are merged into one
    * picture. The left image is at the top and the right image is at the bottom.
    * Both images are scaled to fit in the original image ratio.
    * *   Line-by-line: Left and right images are interlaced by row.
    * The first row belongs to the left image and the second row
    * belongs to the right image, and so on.
    * *   Vertical-strip: Left and right images are interlaced by column.
    * The first column belongs to the left image and the second column
    * belongs to the right image, and so on.
    * *   Frame-sequence: Left and right images are interlaced by frames.
    *
    *
    * Advanced devices are able to computationally generate depth
    * data by processing non-stereoscopic images. Depth data is used
    * to render left and right stereoscopic images from a source image which lacks
    * this information. The quality of such stereoscopic images depends
    * on the computational power used for processing, the algorithms used and the properties
    * of the source data. For more information see this
    * [](http://en.wikipedia.org/wiki/2D_to_3D_conversion)
    * Wikipedia article.
    *
    * There will be a _tizen.tvdisplaycontrol_ object that allows accessing the
    * functionality of the display control API.
    *
    * @since 2.3
    *
    * @defApiFeature http://tizen.org/feature/tv.display
    * To guarantee the running of this application on a device with a TV display control support.
    */
  val tvdisplaycontrol: DisplayControlManager
  
  /**
    * The TVInfo API provides functions to get settings values that are provided by the Tizen TV.
    *
    * @since 2.4
    *
    * @defApiFeature http://tizen.org/feature/tv.information
    * To guarantee the running of this application on a device with a caption and so on.
    */
  val tvinfo: TVInfoManager
  
  /**
    * The TV Input Device API provides functions to subscribe key events of the input device.
    *
    * The following remote control keys are mandatory input device keys. They are available to an application on any Tizen TV.
    *
    * *   ArrowLeft, ArrowUp, ArrowRight, ArrowDown
    * *   Enter
    * *   Back
    *
    *
    * The Tizen TV may provide additional keys depending on a particular input device.
    * An application can handle device dependent key events after registration.
    *
    * @since 2.3
    *
    * @defApiFeature http://tizen.org/feature/tv.inputdevice
    * To guarantee the running of this application on a device with a TV input device support.
    */
  val tvinputdevice: TVInputDeviceManager
  
  /**
    * This API provides a way to embed a video source in a Tizen Web Application running on a device associated with the TV.
    * It allows an available video source to be selected and shown on or hidden from the display in a Tizen Web Application.
    * There will be a _tizen.tvwindow_ object that allows access to the functionality of the TV Window API.
    * To show a TV signal, execute the
    * _show_ function.
    * A TV source is controlled by the user or
    * by you with the Tizen Web Device APIs. You do not have to implement any routines if you
    * do not want to interact with the TV image.
    *
    *
    *
    * @since 2.3
    *
    * @defApiFeature http://tizen.org/feature/tv.pip
    * To guarantee the running of this application on a device with a TV picture-in-picture support.
    */
  val tvwindow: TVWindowManager
  
  /**
    * The Voice Control API provides interfaces and methods for recognizing voice command.
    *
    * Voice Control API offers functionality to recognize the voice and to send the result as predefined command.
    *
    * @since 4.0
    *
    * @defApiFeature http://tizen.org/feature/speech.control
    * To guarantee that the voice control application runs on a device with speech control feature, declare the following feature requirements in the config file:
    * @defApiFeature http://tizen.org/feature/microphone
    * To guarantee that the voice control application runs on a device with microphone feature.
    */
  val voicecontrol: VoiceControlClientManager
  
  /**
    * This Web Setting API defines a set of APIs that manages the setting states of the Web view in your Web application.
    *
    * A Tizen Web application includes a web view and the properties below of the web view can be managed via the Web Setting API:
    *
    *
    * *   Delete all the cookies saved for the web view in the Web application.
    * *   Set a custom user agent string of the web view in the Web application.
    *
    *
    * Note that all the settings using the Web Setting API is bound to your application; thus, no other applications are affected via the Web Setting API calls within your application.
    *
    * For more information on the Web Setting features, see [Web Setting Guide](/application/web/guides/device/web-view).
    *
    * @since 2.2
    */
  val websetting: WebSettingManager
}
object Tizen {
  
  inline def apply(
    AlarmAbsolute: AlarmAbsoluteConstructor,
    AlarmRelative: AlarmRelativeConstructor,
    ApplicationControl: ApplicationControlConstructor,
    ApplicationControlData: ApplicationControlDataConstructor,
    AttributeFilter: AttributeFilterConstructor,
    AttributeRangeFilter: AttributeRangeFilterConstructor,
    Bundle: BundleConstructor,
    CompositeFilter: CompositeFilterConstructor,
    DownloadRequest: DownloadRequestConstructor,
    ExifInformation: ExifInformationConstructor,
    IotconOption: IotconOptionConstructor,
    Query: Query,
    Representation: RepresentationConstructor,
    Response: ResponseConstructor,
    SimpleCoordinates: SimpleCoordinatesConstructor,
    SortMode: SortModeConstructor,
    TZDate: TZDateConstructor,
    TimeDuration: TimeDurationConstructor,
    VoiceControlCommand: VoiceControlCommandConstructor,
    _package: PackageManager,
    account: AccountManager,
    alarm: AlarmManager,
    application: ApplicationManager,
    archive: ArchiveManager,
    content: ContentManager,
    datacontrol: DataControlManager,
    download: DownloadManager,
    exif: ExifManager,
    filesystem: FileSystemManager,
    iotcon: Iotcon_,
    keymanager: KeyManager_,
    mediacontroller: MediaControllerManager,
    messageport: MessagePortManager,
    push: PushManager,
    systeminfo: SystemInfo_,
    time: TimeUtil,
    tvaudiocontrol: AudioControlManager,
    tvdisplaycontrol: DisplayControlManager,
    tvinfo: TVInfoManager,
    tvinputdevice: TVInputDeviceManager,
    tvwindow: TVWindowManager,
    voicecontrol: VoiceControlClientManager,
    websetting: WebSettingManager
  ): Tizen = {
    val __obj = js.Dynamic.literal(AlarmAbsolute = AlarmAbsolute.asInstanceOf[js.Any], AlarmRelative = AlarmRelative.asInstanceOf[js.Any], ApplicationControl = ApplicationControl.asInstanceOf[js.Any], ApplicationControlData = ApplicationControlData.asInstanceOf[js.Any], AttributeFilter = AttributeFilter.asInstanceOf[js.Any], AttributeRangeFilter = AttributeRangeFilter.asInstanceOf[js.Any], Bundle = Bundle.asInstanceOf[js.Any], CompositeFilter = CompositeFilter.asInstanceOf[js.Any], DownloadRequest = DownloadRequest.asInstanceOf[js.Any], ExifInformation = ExifInformation.asInstanceOf[js.Any], IotconOption = IotconOption.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], Representation = Representation.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any], SimpleCoordinates = SimpleCoordinates.asInstanceOf[js.Any], SortMode = SortMode.asInstanceOf[js.Any], TZDate = TZDate.asInstanceOf[js.Any], TimeDuration = TimeDuration.asInstanceOf[js.Any], VoiceControlCommand = VoiceControlCommand.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], alarm = alarm.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], archive = archive.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], datacontrol = datacontrol.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], exif = exif.asInstanceOf[js.Any], filesystem = filesystem.asInstanceOf[js.Any], iotcon = iotcon.asInstanceOf[js.Any], keymanager = keymanager.asInstanceOf[js.Any], mediacontroller = mediacontroller.asInstanceOf[js.Any], messageport = messageport.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], systeminfo = systeminfo.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tvaudiocontrol = tvaudiocontrol.asInstanceOf[js.Any], tvdisplaycontrol = tvdisplaycontrol.asInstanceOf[js.Any], tvinfo = tvinfo.asInstanceOf[js.Any], tvinputdevice = tvinputdevice.asInstanceOf[js.Any], tvwindow = tvwindow.asInstanceOf[js.Any], voicecontrol = voicecontrol.asInstanceOf[js.Any], websetting = websetting.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tizen]
  }
  
  extension [Self <: Tizen](x: Self) {
    
    inline def setAccount(value: AccountManager): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAlarm(value: AlarmManager): Self = StObject.set(x, "alarm", value.asInstanceOf[js.Any])
    
    inline def setAlarmAbsolute(value: AlarmAbsoluteConstructor): Self = StObject.set(x, "AlarmAbsolute", value.asInstanceOf[js.Any])
    
    inline def setAlarmRelative(value: AlarmRelativeConstructor): Self = StObject.set(x, "AlarmRelative", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: ApplicationManager): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationControl(value: ApplicationControlConstructor): Self = StObject.set(x, "ApplicationControl", value.asInstanceOf[js.Any])
    
    inline def setApplicationControlData(value: ApplicationControlDataConstructor): Self = StObject.set(x, "ApplicationControlData", value.asInstanceOf[js.Any])
    
    inline def setArchive(value: ArchiveManager): Self = StObject.set(x, "archive", value.asInstanceOf[js.Any])
    
    inline def setAttributeFilter(value: AttributeFilterConstructor): Self = StObject.set(x, "AttributeFilter", value.asInstanceOf[js.Any])
    
    inline def setAttributeRangeFilter(value: AttributeRangeFilterConstructor): Self = StObject.set(x, "AttributeRangeFilter", value.asInstanceOf[js.Any])
    
    inline def setBundle(value: BundleConstructor): Self = StObject.set(x, "Bundle", value.asInstanceOf[js.Any])
    
    inline def setCompositeFilter(value: CompositeFilterConstructor): Self = StObject.set(x, "CompositeFilter", value.asInstanceOf[js.Any])
    
    inline def setContent(value: ContentManager): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDatacontrol(value: DataControlManager): Self = StObject.set(x, "datacontrol", value.asInstanceOf[js.Any])
    
    inline def setDownload(value: DownloadManager): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadRequest(value: DownloadRequestConstructor): Self = StObject.set(x, "DownloadRequest", value.asInstanceOf[js.Any])
    
    inline def setExif(value: ExifManager): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
    
    inline def setExifInformation(value: ExifInformationConstructor): Self = StObject.set(x, "ExifInformation", value.asInstanceOf[js.Any])
    
    inline def setFilesystem(value: FileSystemManager): Self = StObject.set(x, "filesystem", value.asInstanceOf[js.Any])
    
    inline def setIotcon(value: Iotcon_): Self = StObject.set(x, "iotcon", value.asInstanceOf[js.Any])
    
    inline def setIotconOption(value: IotconOptionConstructor): Self = StObject.set(x, "IotconOption", value.asInstanceOf[js.Any])
    
    inline def setKeymanager(value: KeyManager_): Self = StObject.set(x, "keymanager", value.asInstanceOf[js.Any])
    
    inline def setMediacontroller(value: MediaControllerManager): Self = StObject.set(x, "mediacontroller", value.asInstanceOf[js.Any])
    
    inline def setMessageport(value: MessagePortManager): Self = StObject.set(x, "messageport", value.asInstanceOf[js.Any])
    
    inline def setPush(value: PushManager): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Query): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setRepresentation(value: RepresentationConstructor): Self = StObject.set(x, "Representation", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: ResponseConstructor): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    
    inline def setSimpleCoordinates(value: SimpleCoordinatesConstructor): Self = StObject.set(x, "SimpleCoordinates", value.asInstanceOf[js.Any])
    
    inline def setSortMode(value: SortModeConstructor): Self = StObject.set(x, "SortMode", value.asInstanceOf[js.Any])
    
    inline def setSysteminfo(value: SystemInfo_): Self = StObject.set(x, "systeminfo", value.asInstanceOf[js.Any])
    
    inline def setTZDate(value: TZDateConstructor): Self = StObject.set(x, "TZDate", value.asInstanceOf[js.Any])
    
    inline def setTime(value: TimeUtil): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeDuration(value: TimeDurationConstructor): Self = StObject.set(x, "TimeDuration", value.asInstanceOf[js.Any])
    
    inline def setTvaudiocontrol(value: AudioControlManager): Self = StObject.set(x, "tvaudiocontrol", value.asInstanceOf[js.Any])
    
    inline def setTvdisplaycontrol(value: DisplayControlManager): Self = StObject.set(x, "tvdisplaycontrol", value.asInstanceOf[js.Any])
    
    inline def setTvinfo(value: TVInfoManager): Self = StObject.set(x, "tvinfo", value.asInstanceOf[js.Any])
    
    inline def setTvinputdevice(value: TVInputDeviceManager): Self = StObject.set(x, "tvinputdevice", value.asInstanceOf[js.Any])
    
    inline def setTvwindow(value: TVWindowManager): Self = StObject.set(x, "tvwindow", value.asInstanceOf[js.Any])
    
    inline def setVoiceControlCommand(value: VoiceControlCommandConstructor): Self = StObject.set(x, "VoiceControlCommand", value.asInstanceOf[js.Any])
    
    inline def setVoicecontrol(value: VoiceControlClientManager): Self = StObject.set(x, "voicecontrol", value.asInstanceOf[js.Any])
    
    inline def setWebsetting(value: WebSettingManager): Self = StObject.set(x, "websetting", value.asInstanceOf[js.Any])
    
    inline def set_package(value: PackageManager): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
