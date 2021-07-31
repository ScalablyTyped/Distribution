package typings.winrtUwp.global.Windows.Devices

import typings.std.Date
import typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism
import typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState
import typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason
import typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType
import typings.winrtUwp.Windows.Devices.AllJoyn.IAllJoynAcceptSessionJoiner
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Globalization.Language
import typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** AllJoyn is an open source, cross-platform, DCOM-like framework, and protocol for making remotable method calls, remotely reading or writing properties, and sending one-way "signals" between applications (called "nodes") on a distributed bus. It is intended to be used primarily for Internet of Things scenarios such as turning on/off lights or reading temperatures. */
object AllJoyn {
  
  /** Used to set descriptive information about the app and the device it is running on. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynAboutData")
  @js.native
  abstract class AllJoynAboutData ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutData {
    
    /** A globally unique identifier associated with the app. */
    /* CompleteClass */
    var appId: String = js.native
    
    /** A collection of language-specific app names. */
    /* CompleteClass */
    var appNames: IMap[String, String] = js.native
    
    /** The date of manufacture. */
    /* CompleteClass */
    var dateOfManufacture: Date = js.native
    
    /** The default app name assigned by the manufacturer- either the developer or the OEM. This property is a shortcut to the entry in the AppNames property for the DefaultLanguage . */
    /* CompleteClass */
    var defaultAppName: String = js.native
    
    /** The default description of the app. This property is a shortcut to the entry in the Descriptions property for the DefaultLanguage . */
    /* CompleteClass */
    var defaultDescription: String = js.native
    
    /** The name of the manufacturer of the app. This property is a shortcut to the entry in the Manufacturers property for the DefaultLanguage . */
    /* CompleteClass */
    var defaultManufacturer: String = js.native
    
    /** A collection of language-specific app description strings. */
    /* CompleteClass */
    var descriptions: IMap[String, String] = js.native
    
    /** Indicates if the service should advertise the provided AllJoynAboutData values. */
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /** A collection of language-specific manufacturer name strings. */
    /* CompleteClass */
    var manufacturers: IMap[String, String] = js.native
    
    /** The model number of the device running the app. */
    /* CompleteClass */
    var modelNumber: String = js.native
    
    /** The version number of the app. Use of this property applies to Producer apps. */
    /* CompleteClass */
    var softwareVersion: String = js.native
    
    /** A URL to the manufacturer or developer support portal. */
    /* CompleteClass */
    var supportUrl: Uri = js.native
  }
  
  /** Used to view data about another app and the device it is running on. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynAboutDataView")
  @js.native
  abstract class AllJoynAboutDataView ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutDataView {
    
    /** The version number for the implemented AllJoyn platform software. */
    /* CompleteClass */
    var ajSoftwareVersion: String = js.native
    
    /** A globally unique identifier associated with the app. */
    /* CompleteClass */
    var appId: String = js.native
    
    /** The name of the app. */
    /* CompleteClass */
    var appName: String = js.native
    
    /** The date of manufacture. */
    /* CompleteClass */
    var dateOfManufacture: Date = js.native
    
    /** The default language of the app. */
    /* CompleteClass */
    var defaultLanguage: Language = js.native
    
    /** An app description provided by the manufacturer. */
    /* CompleteClass */
    var description: String = js.native
    
    /** The device ID used during advertising. */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /** Name of the device. */
    /* CompleteClass */
    var deviceName: String = js.native
    
    /** The current version of the hardware that the app is running on. This field is optional, presenting as an empty string if not set. */
    /* CompleteClass */
    var hardwareVersion: String = js.native
    
    /** The name of the manufacturer. */
    /* CompleteClass */
    var manufacturer: String = js.native
    
    /** The model number of the device running the app. */
    /* CompleteClass */
    var modelNumber: String = js.native
    
    /** This is a set of fields, where each other named AllJoynAboutDataView property is also accessible. For example, ModelNumber is Properties ["ModelNumber"]. Additionally, this property can be used to get custom properties. */
    /* CompleteClass */
    var properties: IMapView[String, js.Any] = js.native
    
    /** The version number of the app. */
    /* CompleteClass */
    var softwareVersion: String = js.native
    
    /** The status returned by the GetDataBySessionPortAsync operation that created the AllJoynAboutDataView object. */
    /* CompleteClass */
    var status: Double = js.native
    
    /** A URL to the manufacturer or developer support portal. */
    /* CompleteClass */
    var supportUrl: Uri = js.native
    
    /** A list of languages supported by the app and will always include the DefaultLanguage . */
    /* CompleteClass */
    var supportedLanguages: IVectorView[Language] = js.native
  }
  object AllJoynAboutDataView {
    
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynAboutDataView")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the About data for a session.
      * @param uniqueName The unique name.
      * @param busAttachment The bus attachment supporting the session.
      * @param sessionPort The port used to connect to the session.
      * @return An object containing About data for the session.
      */
    /* static member */
    @scala.inline
    def getDataBySessionPortAsync(
      uniqueName: String,
      busAttachment: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachment,
      sessionPort: Double
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutDataView] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataBySessionPortAsync")(uniqueName.asInstanceOf[js.Any], busAttachment.asInstanceOf[js.Any], sessionPort.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutDataView]]
    /**
      * Gets the About data for a session in a particular language.
      * @param uniqueName The unique name.
      * @param busAttachment The bus attachment supporting the session.
      * @param sessionPort The port used to connect to the session.
      * @param language The language to return the descriptive data in.
      * @return An object containing About data for the session in the set language.
      */
    /* static member */
    @scala.inline
    def getDataBySessionPortAsync(
      uniqueName: String,
      busAttachment: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachment,
      sessionPort: Double,
      language: Language
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutDataView] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataBySessionPortAsync")(uniqueName.asInstanceOf[js.Any], busAttachment.asInstanceOf[js.Any], sessionPort.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutDataView]]
  }
  
  /** Contains information about a join session request that is used to determine if the request will be accepted and initiate the session connection. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynAcceptSessionJoinerEventArgs")
  @js.native
  class AllJoynAcceptSessionJoinerEventArgs protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAcceptSessionJoinerEventArgs {
    /**
      * Generates an object containing information about the connection being accepted to the session and the method that completes the session join.
      * @param uniqueName The unique bus name.
      * @param sessionPort The session port used for the connection.
      * @param trafficType The type of traffic provided over the connection.
      * @param proximity Indicates network proximity.
      * @param acceptSessionJoiner The IAllJoynAcceptSessionJoiner object used to complete the session join.
      */
    def this(
      uniqueName: String,
      sessionPort: Double,
      trafficType: AllJoynTrafficType,
      proximity: Double,
      acceptSessionJoiner: IAllJoynAcceptSessionJoiner
    ) = this()
    
    /** Called to accept the session connection. */
    /* CompleteClass */
    override def accept(): Unit = js.native
    
    /** Indicates if the app joining the session is on the same network. */
    /* CompleteClass */
    var sameNetwork: Boolean = js.native
    
    /** The app joining the session is on the same physical node. */
    /* CompleteClass */
    var samePhysicalNode: Boolean = js.native
    
    /** The session port being used to connect to the session. */
    /* CompleteClass */
    var sessionPort: Double = js.native
    
    /** The traffic type supported during the session. */
    /* CompleteClass */
    var trafficType: AllJoynTrafficType = js.native
    
    /** The unique bus name of the app requesting a session connection. */
    /* CompleteClass */
    var uniqueName: String = js.native
  }
  
  /** Contains information about a successful or unsuccessful completion of an authentication operation. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynAuthenticationCompleteEventArgs")
  @js.native
  abstract class AllJoynAuthenticationCompleteEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationCompleteEventArgs {
    
    /** The mechanism used during authentication. */
    /* CompleteClass */
    var authenticationMechanism: AllJoynAuthenticationMechanism = js.native
    
    /** The unique bus name of the Consumer being authenticated. On the initiating side this will be the unique bus name of the remote app being authenticated. On the accepting side this will be the unique bus name for the remote app. */
    /* CompleteClass */
    var peerUniqueName: String = js.native
    
    /** Indicates if the remote app was authenticated. */
    /* CompleteClass */
    var succeeded: Boolean = js.native
  }
  
  /** Defines values used to indicate the mechanism used in authentication operations. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism")
  @js.native
  object AllJoynAuthenticationMechanism extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism & Double] = js.native
    
    /* 5 */ val ecdheEcdsa: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism.ecdheEcdsa & Double = js.native
    
    /* 3 */ val ecdheNull: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism.ecdheNull & Double = js.native
    
    /* 4 */ val ecdhePsk: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism.ecdhePsk & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism.none & Double = js.native
    
    /* 1 */ val srpAnonymous: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism.srpAnonymous & Double = js.native
    
    /* 2 */ val srpLogon: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism.srpLogon & Double = js.native
  }
  
  /** Represents a connection to the underlying communication pipeline (transport agnostic) that AllJoyn uses to communicate with other endpoints regardless of the transport. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynBusAttachment")
  @js.native
  /** Generates an AllJoynBusAttachment object using the default named pipe connection specification. */
  class AllJoynBusAttachment ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachment {
    /**
      * Generates an AllJoynBusAttachment object using the provided connection specification.
      * @param connectionSpecification Specification used to initiate and maintain connections to a router node (bus). Windows 10 supports the 'npipe:' transport, formatted according to the D-Bus Specification.
      */
    def this(connectionSpecification: String) = this()
  }
  
  /** Defines values used to indicate the state of a connection with an AllJoyn bus that is managed by an AllJoynBusAttachment object. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynBusAttachmentState")
  @js.native
  object AllJoynBusAttachmentState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState & Double] = js.native
    
    /* 2 */ val connected: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.connected & Double = js.native
    
    /* 1 */ val connecting: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.connecting & Double = js.native
    
    /* 0 */ val disconnected: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.disconnected & Double = js.native
    
    /* 3 */ val disconnecting: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.disconnecting & Double = js.native
  }
  
  /** Contains information about state and status changes to an AllJoyn bus connection managed by an AllJoynBusAttachment object. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynBusAttachmentStateChangedEventArgs")
  @js.native
  abstract class AllJoynBusAttachmentStateChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentStateChangedEventArgs {
    
    /** Indicates the current state of a connection to an AllJoyn bus. */
    /* CompleteClass */
    var state: AllJoynBusAttachmentState = js.native
    
    /** Contains a status code that provides status information for AllJoynBusAttachment change events. Properties used in the generation of possible values are defined by AllJoynStatus . */
    /* CompleteClass */
    var status: Double = js.native
  }
  
  /** Defines properties used when passing credentials during authentication. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynCredentials")
  @js.native
  abstract class AllJoynCredentials ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynCredentials {
    
    /** The mechanism used for credential authentication. */
    /* CompleteClass */
    var authenticationMechanism: AllJoynAuthenticationMechanism = js.native
    
    /** The cryptography certificate used for the Rsa and EcdheEcdsa authentication mechanisms. */
    /* CompleteClass */
    var certificate: Certificate = js.native
    
    /** The user name, if any, and password used for authentication. */
    /* CompleteClass */
    var passwordCredential: PasswordCredential = js.native
    
    /** The period of time before provided credentials expire. */
    /* CompleteClass */
    var timeout: Double = js.native
  }
  
  /** Contains information about a request for credentials in order to authenticate to a peer. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynCredentialsRequestedEventArgs")
  @js.native
  abstract class AllJoynCredentialsRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynCredentialsRequestedEventArgs {
    
    /** The number of times the credential request has been tried. */
    /* CompleteClass */
    var attemptCount: Double = js.native
    
    /** The authentication credentials to be filled in by the app. */
    /* CompleteClass */
    var credentials: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynCredentials = js.native
    
    /**
      * Allows JavaScript Windows Store apps to handle the verification of provided of credentials asynchronously.
      * @return The credential request deferral.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** The unique bus name of the remote app that provided the requested credentials. */
    /* CompleteClass */
    var peerUniqueName: String = js.native
    
    /** A user name value used by mechanisms that accept a user name/password pair. */
    /* CompleteClass */
    var requestedUserName: String = js.native
  }
  
  /** Used to allow the application to indicate whether the credentials provided by a peer are valid. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynCredentialsVerificationRequestedEventArgs")
  @js.native
  abstract class AllJoynCredentialsVerificationRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynCredentialsVerificationRequestedEventArgs {
    
    /** Calling this method indicates that the credentials provided for authentication are valid. */
    /* CompleteClass */
    override def accept(): Unit = js.native
    
    /** The mechanism used to authenticate credentials. */
    /* CompleteClass */
    var authenticationMechanism: AllJoynAuthenticationMechanism = js.native
    
    /**
      * Conducts verification of provided of credentials asynchronously.
      * @return The verification deferral.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** The cryptography certificate provided for authentication. */
    /* CompleteClass */
    var peerCertificate: Certificate = js.native
    
    /** The category of an errors encountered authenticating the cryptography certificate. */
    /* CompleteClass */
    var peerCertificateErrorSeverity: SocketSslErrorSeverity = js.native
    
    /** A list of errors that occurred during authentication of the provided cryptography certificate. */
    /* CompleteClass */
    var peerCertificateErrors: IVectorView[ChainValidationResult] = js.native
    
    /** Retrieves the intermediate certificates sent during authentication. */
    /* CompleteClass */
    var peerIntermediateCertificates: IVectorView[Certificate] = js.native
    
    /** The unique bus name of the remote app being authenticated. */
    /* CompleteClass */
    var peerUniqueName: String = js.native
  }
  
  /** Exposes information about the sender of a message being processed. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynMessageInfo")
  @js.native
  class AllJoynMessageInfo protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynMessageInfo {
    /**
      * Generates an AllJoynMessageInfo object that contains the unique name of the sender that sent the message being processed.
      * @param senderUniqueName The unique name of the sender.
      */
    def this(senderUniqueName: String) = this()
    
    /** The unique bus name of the message sender. */
    /* CompleteClass */
    var senderUniqueName: String = js.native
  }
  
  /** Contains status information that indicates why a Producer app was stopped. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynProducerStoppedEventArgs")
  @js.native
  class AllJoynProducerStoppedEventArgs protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynProducerStoppedEventArgs {
    /**
      * Generates an object containing status information for the stopped Producer app.
      * @param status An AllJoyn status code that indicates why the Producer was stopped.
      */
    def this(status: Double) = this()
    
    /** Returns an AllJoyn status code that indicates why the Producer was stopped. Common values are defined by AllJoynStatus . */
    /* CompleteClass */
    var status: Double = js.native
  }
  
  /** Exposes unique name and transport information for an advertising app. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynServiceInfo")
  @js.native
  class AllJoynServiceInfo protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynServiceInfo {
    /**
      * Generates an AllJoynServiceInfo object that represents an advertising app. This object provides the unique bus name, object path and transport information.
      * @param uniqueName The unique bus name.
      * @param objectPath The object path.
      * @param sessionPort The port for this session.
      */
    def this(uniqueName: String, objectPath: String, sessionPort: Double) = this()
    
    /** The path to the service object. This path is used to match communications with service objects connected to the session. */
    /* CompleteClass */
    var objectPath: String = js.native
    
    /** The port used to connect to the session. */
    /* CompleteClass */
    var sessionPort: Double = js.native
    
    /** The unique bus name associated with the advertising app. */
    /* CompleteClass */
    var uniqueName: String = js.native
  }
  
  /** Contains information that identifies an advertising app that is no longer available. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynServiceInfoRemovedEventArgs")
  @js.native
  class AllJoynServiceInfoRemovedEventArgs protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynServiceInfoRemovedEventArgs {
    /**
      * Generates an object containing information about an advertising app that is no longer available.
      * @param uniqueName The unique app name.
      */
    def this(uniqueName: String) = this()
    
    /** The unique bus name of the advertising app that is no longer available. */
    /* CompleteClass */
    var uniqueName: String = js.native
  }
  
  /** Contains information that identifies the reason for a lost session. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionLostEventArgs")
  @js.native
  class AllJoynSessionLostEventArgs protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostEventArgs {
    /**
      * Generates an AllJoynSessionLostEventArgs object containing information that identifies the reason for the lost session.
      * @param reason The reason the session was lost.
      */
    def this(reason: AllJoynSessionLostReason) = this()
    
    /** Retrieves a value that indicates the reason for a lost session. */
    /* CompleteClass */
    var reason: AllJoynSessionLostReason = js.native
  }
  
  /** Defines values used by AllJoynSessionLostEventArgs to indicate the reason for a lost session. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionLostReason")
  @js.native
  object AllJoynSessionLostReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason & Double] = js.native
    
    /* 4 */ val linkTimeout: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.linkTimeout & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.none & Double = js.native
    
    /* 5 */ val other: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.other & Double = js.native
    
    /* 2 */ val producerClosedAbruptly: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.producerClosedAbruptly & Double = js.native
    
    /* 1 */ val producerLeftSession: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.producerLeftSession & Double = js.native
    
    /* 3 */ val removedByProducer: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.removedByProducer & Double = js.native
  }
  
  /** Contains information about a peer that was added to a session. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionMemberAddedEventArgs")
  @js.native
  class AllJoynSessionMemberAddedEventArgs protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionMemberAddedEventArgs {
    /**
      * Generates an object that contains information about the remote app added to the session.
      * @param uniqueName The unique Consumer name.
      */
    def this(uniqueName: String) = this()
    
    /** The unique bus name of the remote app new to the session. */
    /* CompleteClass */
    var uniqueName: String = js.native
  }
  
  /** Contains information about a remote app removed from a session. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionMemberRemovedEventArgs")
  @js.native
  class AllJoynSessionMemberRemovedEventArgs protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionMemberRemovedEventArgs {
    /**
      * Generates an object containing information about a remote app removed from a session.
      * @param uniqueName The unique bus name of the remote app removed from the session.
      */
    def this(uniqueName: String) = this()
    
    /** The unique bus name of the remote app removed from the session. */
    /* CompleteClass */
    var uniqueName: String = js.native
  }
  
  /** Defines a collection of properties used to convey meaning for AllJoyn status codes. For possible status values, refer to the AllJoyn standard documentation. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus")
  @js.native
  abstract class AllJoynStatus ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynStatus
  object AllJoynStatus {
    
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus")
    @js.native
    val ^ : js.Any = js.native
    
    /** Indicates that authentication could not be completed. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.authenticationFailed")
    @js.native
    def authenticationFailed: Double = js.native
    @scala.inline
    def authenticationFailed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("authenticationFailed")(x.asInstanceOf[js.Any])
    
    /** Authentication was rejected by the advertising app. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.authenticationRejectedByUser")
    @js.native
    def authenticationRejectedByUser: Double = js.native
    @scala.inline
    def authenticationRejectedByUser_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("authenticationRejectedByUser")(x.asInstanceOf[js.Any])
    
    /** The connection to the session was refused. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.connectionRefused")
    @js.native
    def connectionRefused: Double = js.native
    @scala.inline
    def connectionRefused_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRefused")(x.asInstanceOf[js.Any])
    
    /** The operation has failed. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.fail")
    @js.native
    def fail: Double = js.native
    @scala.inline
    def fail_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fail")(x.asInstanceOf[js.Any])
    
    /** Insufficient security provided for session connections. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.insufficientSecurity")
    @js.native
    def insufficientSecurity: Double = js.native
    @scala.inline
    def insufficientSecurity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insufficientSecurity")(x.asInstanceOf[js.Any])
    
    /** Function call argument 1 is invalid. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.invalidArgument1")
    @js.native
    def invalidArgument1: Double = js.native
    @scala.inline
    def invalidArgument1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidArgument1")(x.asInstanceOf[js.Any])
    
    /** Function call argument 2 is invalid. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.invalidArgument2")
    @js.native
    def invalidArgument2: Double = js.native
    @scala.inline
    def invalidArgument2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidArgument2")(x.asInstanceOf[js.Any])
    
    /** Function call argument 3 is invalid. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.invalidArgument3")
    @js.native
    def invalidArgument3: Double = js.native
    @scala.inline
    def invalidArgument3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidArgument3")(x.asInstanceOf[js.Any])
    
    /** Function call argument 4 is invalid. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.invalidArgument4")
    @js.native
    def invalidArgument4: Double = js.native
    @scala.inline
    def invalidArgument4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidArgument4")(x.asInstanceOf[js.Any])
    
    /** Function call argument 5 is invalid. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.invalidArgument5")
    @js.native
    def invalidArgument5: Double = js.native
    @scala.inline
    def invalidArgument5_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidArgument5")(x.asInstanceOf[js.Any])
    
    /** Function call argument 6 is invalid. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.invalidArgument6")
    @js.native
    def invalidArgument6: Double = js.native
    @scala.inline
    def invalidArgument6_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidArgument6")(x.asInstanceOf[js.Any])
    
    /** Function call argument 7 is invalid. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.invalidArgument7")
    @js.native
    def invalidArgument7: Double = js.native
    @scala.inline
    def invalidArgument7_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidArgument7")(x.asInstanceOf[js.Any])
    
    /** Function call argument 8 is invalid. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.invalidArgument8")
    @js.native
    def invalidArgument8: Double = js.native
    @scala.inline
    def invalidArgument8_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidArgument8")(x.asInstanceOf[js.Any])
    
    /** Operation successful. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.ok")
    @js.native
    def ok: Double = js.native
    @scala.inline
    def ok_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ok")(x.asInstanceOf[js.Any])
    
    /** The operation timed out. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.operationTimedOut")
    @js.native
    def operationTimedOut: Double = js.native
    @scala.inline
    def operationTimedOut_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operationTimedOut")(x.asInstanceOf[js.Any])
    
    /** The Producer end of the session connection was closed. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.otherEndClosed")
    @js.native
    def otherEndClosed: Double = js.native
    @scala.inline
    def otherEndClosed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("otherEndClosed")(x.asInstanceOf[js.Any])
    
    /** The SSL connection has failed. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.sslConnectFailed")
    @js.native
    def sslConnectFailed: Double = js.native
    @scala.inline
    def sslConnectFailed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sslConnectFailed")(x.asInstanceOf[js.Any])
    
    /** The SSL verification failed. Review provided SSL credentials. */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus.sslIdentityVerificationFailed")
    @js.native
    def sslIdentityVerificationFailed: Double = js.native
    @scala.inline
    def sslIdentityVerificationFailed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sslIdentityVerificationFailed")(x.asInstanceOf[js.Any])
  }
  
  /** Defines values used to indicate the type of data carried in session traffic. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynTrafficType")
  @js.native
  object AllJoynTrafficType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType & Double] = js.native
    
    /* 1 */ val messages: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType.messages & Double = js.native
    
    /* 3 */ val rawReliable: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType.rawReliable & Double = js.native
    
    /* 2 */ val rawUnreliable: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType.rawUnreliable & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType.unknown & Double = js.native
  }
  
  /** Contains information about the stopped session watcher object. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynWatcherStoppedEventArgs")
  @js.native
  class AllJoynWatcherStoppedEventArgs protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynWatcherStoppedEventArgs {
    /**
      * Generates an AllJoynWatcherStoppedEventArgs object that contains status information that identifies the reason the watcher object was stopped.
      * @param status The AllJoyn status code.
      */
    def this(status: Double) = this()
    
    /** Returns a status code that was returned when the watcher object is stopped. This value is represented by AllJoynStatus . */
    /* CompleteClass */
    var status: Double = js.native
  }
}
