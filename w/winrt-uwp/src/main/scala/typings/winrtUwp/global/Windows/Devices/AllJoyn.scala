package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason
import typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType
import typings.winrtUwp.Windows.Devices.AllJoyn.IAllJoynAcceptSessionJoiner
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Globalization.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** AllJoyn is an open source, cross-platform, DCOM-like framework, and protocol for making remotable method calls, remotely reading or writing properties, and sending one-way "signals" between applications (called "nodes") on a distributed bus. It is intended to be used primarily for Internet of Things scenarios such as turning on/off lights or reading temperatures. */
object AllJoyn {
  
  /** Used to set descriptive information about the app and the device it is running on. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynAboutData")
  @js.native
  abstract class AllJoynAboutData ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutData
  
  /** Used to view data about another app and the device it is running on. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynAboutDataView")
  @js.native
  abstract class AllJoynAboutDataView ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutDataView
  object AllJoynAboutDataView {
    
    /**
      * Gets the About data for a session.
      * @param uniqueName The unique name.
      * @param busAttachment The bus attachment supporting the session.
      * @param sessionPort The port used to connect to the session.
      * @return An object containing About data for the session.
      */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynAboutDataView.getDataBySessionPortAsync")
    @js.native
    def getDataBySessionPortAsync(
      uniqueName: String,
      busAttachment: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachment,
      sessionPort: Double
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutDataView] = js.native
    /**
      * Gets the About data for a session in a particular language.
      * @param uniqueName The unique name.
      * @param busAttachment The bus attachment supporting the session.
      * @param sessionPort The port used to connect to the session.
      * @param language The language to return the descriptive data in.
      * @return An object containing About data for the session in the set language.
      */
    /* static member */
    @JSGlobal("Windows.Devices.AllJoyn.AllJoynAboutDataView.getDataBySessionPortAsync")
    @js.native
    def getDataBySessionPortAsync(
      uniqueName: String,
      busAttachment: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachment,
      sessionPort: Double,
      language: Language
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutDataView] = js.native
  }
  
  /** Contains information about a join session request that is used to determine if the request will be accepted and initiate the session connection. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynAcceptSessionJoinerEventArgs")
  @js.native
  class AllJoynAcceptSessionJoinerEventArgs protected ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAcceptSessionJoinerEventArgs {
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
  }
  
  /** Contains information about a successful or unsuccessful completion of an authentication operation. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynAuthenticationCompleteEventArgs")
  @js.native
  abstract class AllJoynAuthenticationCompleteEventArgs ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationCompleteEventArgs
  
  /** Defines values used to indicate the mechanism used in authentication operations. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism")
  @js.native
  object AllJoynAuthenticationMechanism extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism with Double
      ] = js.native
    
    /* 5 */ val ecdheEcdsa: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism.ecdheEcdsa with Double = js.native
    
    /* 3 */ val ecdheNull: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism.ecdheNull with Double = js.native
    
    /* 4 */ val ecdhePsk: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism.ecdhePsk with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism.none with Double = js.native
    
    /* 1 */ val srpAnonymous: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism.srpAnonymous with Double = js.native
    
    /* 2 */ val srpLogon: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism.srpLogon with Double = js.native
  }
  
  /** Represents a connection to the underlying communication pipeline (transport agnostic) that AllJoyn uses to communicate with other endpoints regardless of the transport. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynBusAttachment")
  @js.native
  /** Generates an AllJoynBusAttachment object using the default named pipe connection specification. */
  class AllJoynBusAttachment ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachment {
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
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState with Double] = js.native
    
    /* 2 */ val connected: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.connected with Double = js.native
    
    /* 1 */ val connecting: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.connecting with Double = js.native
    
    /* 0 */ val disconnected: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.disconnected with Double = js.native
    
    /* 3 */ val disconnecting: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentState.disconnecting with Double = js.native
  }
  
  /** Contains information about state and status changes to an AllJoyn bus connection managed by an AllJoynBusAttachment object. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynBusAttachmentStateChangedEventArgs")
  @js.native
  abstract class AllJoynBusAttachmentStateChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachmentStateChangedEventArgs
  
  /** Defines properties used when passing credentials during authentication. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynCredentials")
  @js.native
  abstract class AllJoynCredentials ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynCredentials
  
  /** Contains information about a request for credentials in order to authenticate to a peer. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynCredentialsRequestedEventArgs")
  @js.native
  abstract class AllJoynCredentialsRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynCredentialsRequestedEventArgs
  
  /** Used to allow the application to indicate whether the credentials provided by a peer are valid. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynCredentialsVerificationRequestedEventArgs")
  @js.native
  abstract class AllJoynCredentialsVerificationRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynCredentialsVerificationRequestedEventArgs
  
  /** Exposes information about the sender of a message being processed. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynMessageInfo")
  @js.native
  class AllJoynMessageInfo protected ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynMessageInfo {
    /**
      * Generates an AllJoynMessageInfo object that contains the unique name of the sender that sent the message being processed.
      * @param senderUniqueName The unique name of the sender.
      */
    def this(senderUniqueName: String) = this()
  }
  
  /** Contains status information that indicates why a Producer app was stopped. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynProducerStoppedEventArgs")
  @js.native
  class AllJoynProducerStoppedEventArgs protected ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynProducerStoppedEventArgs {
    /**
      * Generates an object containing status information for the stopped Producer app.
      * @param status An AllJoyn status code that indicates why the Producer was stopped.
      */
    def this(status: Double) = this()
  }
  
  /** Exposes unique name and transport information for an advertising app. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynServiceInfo")
  @js.native
  class AllJoynServiceInfo protected ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynServiceInfo {
    /**
      * Generates an AllJoynServiceInfo object that represents an advertising app. This object provides the unique bus name, object path and transport information.
      * @param uniqueName The unique bus name.
      * @param objectPath The object path.
      * @param sessionPort The port for this session.
      */
    def this(uniqueName: String, objectPath: String, sessionPort: Double) = this()
  }
  
  /** Contains information that identifies an advertising app that is no longer available. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynServiceInfoRemovedEventArgs")
  @js.native
  class AllJoynServiceInfoRemovedEventArgs protected ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynServiceInfoRemovedEventArgs {
    /**
      * Generates an object containing information about an advertising app that is no longer available.
      * @param uniqueName The unique app name.
      */
    def this(uniqueName: String) = this()
  }
  
  /** Contains information that identifies the reason for a lost session. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionLostEventArgs")
  @js.native
  class AllJoynSessionLostEventArgs protected ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostEventArgs {
    /**
      * Generates an AllJoynSessionLostEventArgs object containing information that identifies the reason for the lost session.
      * @param reason The reason the session was lost.
      */
    def this(reason: AllJoynSessionLostReason) = this()
  }
  
  /** Defines values used by AllJoynSessionLostEventArgs to indicate the reason for a lost session. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionLostReason")
  @js.native
  object AllJoynSessionLostReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason with Double] = js.native
    
    /* 4 */ val linkTimeout: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.linkTimeout with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.none with Double = js.native
    
    /* 5 */ val other: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.other with Double = js.native
    
    /* 2 */ val producerClosedAbruptly: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.producerClosedAbruptly with Double = js.native
    
    /* 1 */ val producerLeftSession: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.producerLeftSession with Double = js.native
    
    /* 3 */ val removedByProducer: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason.removedByProducer with Double = js.native
  }
  
  /** Contains information about a peer that was added to a session. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionMemberAddedEventArgs")
  @js.native
  class AllJoynSessionMemberAddedEventArgs protected ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionMemberAddedEventArgs {
    /**
      * Generates an object that contains information about the remote app added to the session.
      * @param uniqueName The unique Consumer name.
      */
    def this(uniqueName: String) = this()
  }
  
  /** Contains information about a remote app removed from a session. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionMemberRemovedEventArgs")
  @js.native
  class AllJoynSessionMemberRemovedEventArgs protected ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionMemberRemovedEventArgs {
    /**
      * Generates an object containing information about a remote app removed from a session.
      * @param uniqueName The unique bus name of the remote app removed from the session.
      */
    def this(uniqueName: String) = this()
  }
  
  /** Defines a collection of properties used to convey meaning for AllJoyn status codes. For possible status values, refer to the AllJoyn standard documentation. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynStatus")
  @js.native
  abstract class AllJoynStatus ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynStatus
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
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType with Double] = js.native
    
    /* 1 */ val messages: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType.messages with Double = js.native
    
    /* 3 */ val rawReliable: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType.rawReliable with Double = js.native
    
    /* 2 */ val rawUnreliable: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType.rawUnreliable with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynTrafficType.unknown with Double = js.native
  }
  
  /** Contains information about the stopped session watcher object. */
  @JSGlobal("Windows.Devices.AllJoyn.AllJoynWatcherStoppedEventArgs")
  @js.native
  class AllJoynWatcherStoppedEventArgs protected ()
    extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynWatcherStoppedEventArgs {
    /**
      * Generates an AllJoynWatcherStoppedEventArgs object that contains status information that identifies the reason the watcher object was stopped.
      * @param status The AllJoyn status code.
      */
    def this(status: Double) = this()
  }
}
