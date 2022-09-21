package typings.winrtUwp.global.Windows

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.System.User
import typings.winrtUwp.winrtUwpStrings.gamepadadded
import typings.winrtUwp.winrtUwpStrings.gamepadremoved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gaming {
  
  /** Provides access to game controller input. */
  object Input {
    
    /** Represents a game controller. */
    @JSGlobal("Windows.Gaming.Input.Gamepad")
    @js.native
    abstract class Gamepad ()
      extends StObject
         with typings.winrtUwp.Windows.Gaming.Input.Gamepad
    object Gamepad {
      
      @JSGlobal("Windows.Gaming.Input.Gamepad")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def addEventListener_gamepadadded(`type`: gamepadadded, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def addEventListener_gamepadremoved(`type`: gamepadremoved, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /** The list of all connected gamepads. */
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.gamepads")
      @js.native
      def gamepads: IVectorView[typings.winrtUwp.Windows.Gaming.Input.Gamepad] = js.native
      inline def gamepads_=(x: IVectorView[typings.winrtUwp.Windows.Gaming.Input.Gamepad]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gamepads")(x.asInstanceOf[js.Any])
      
      /** Signals when a new gamepad is connected. */
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.ongamepadadded")
      @js.native
      def ongamepadadded: EventHandler[Any] = js.native
      inline def ongamepadadded_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongamepadadded")(x.asInstanceOf[js.Any])
      
      /** Signals when a gamepad is disconnected. */
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.ongamepadremoved")
      @js.native
      def ongamepadremoved: EventHandler[Any] = js.native
      inline def ongamepadremoved_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongamepadremoved")(x.asInstanceOf[js.Any])
      
      /* static member */
      inline def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def removeEventListener_gamepadadded(`type`: gamepadadded, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def removeEventListener_gamepadremoved(`type`: gamepadremoved, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /** Specifies the button type. */
    @JSGlobal("Windows.Gaming.Input.GamepadButtons")
    @js.native
    object GamepadButtons extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Gaming.Input.GamepadButtons & Double] = js.native
      
      /* 3 */ val a: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.a & Double = js.native
      
      /* 4 */ val b: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.b & Double = js.native
      
      /* 8 */ val dpadDown: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadDown & Double = js.native
      
      /* 9 */ val dpadLeft: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadLeft & Double = js.native
      
      /* 10 */ val dpadRight: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadRight & Double = js.native
      
      /* 7 */ val dpadUp: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadUp & Double = js.native
      
      /* 11 */ val leftShoulder: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.leftShoulder & Double = js.native
      
      /* 13 */ val leftThumbstick: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.leftThumbstick & Double = js.native
      
      /* 1 */ val menu: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.menu & Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.none & Double = js.native
      
      /* 12 */ val rightShoulder: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.rightShoulder & Double = js.native
      
      /* 14 */ val rightThumbstick: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.rightThumbstick & Double = js.native
      
      /* 2 */ val view: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.view & Double = js.native
      
      /* 5 */ val x: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.x & Double = js.native
      
      /* 6 */ val y: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.y & Double = js.native
    }
    
    /** Contains information about an audio headset attached to a gamepad. */
    @JSGlobal("Windows.Gaming.Input.Headset")
    @js.native
    abstract class Headset ()
      extends StObject
         with typings.winrtUwp.Windows.Gaming.Input.Headset {
      
      /** The XAudio endpoint ID for the headset's audio capture device. */
      /* CompleteClass */
      var captureDeviceId: String = js.native
      
      /** The XAudio enpoint ID for the headset's audio render device. */
      /* CompleteClass */
      var renderDeviceId: String = js.native
    }
  }
  
  object Preview {
    
    object GamesEnumeration {
      
      @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList")
      @js.native
      abstract class GameList ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.Preview.GamesEnumeration.GameList
      object GameList {
        
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.addEventListener")
        @js.native
        def addEventListener: Any = js.native
        inline def addEventListener_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.findAllAsync")
        @js.native
        def findAllAsync: Any = js.native
        inline def findAllAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllAsync")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.ongameadded")
        @js.native
        def ongameadded: Any = js.native
        inline def ongameadded_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongameadded")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.ongameremoved")
        @js.native
        def ongameremoved: Any = js.native
        inline def ongameremoved_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongameremoved")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.ongameupdated")
        @js.native
        def ongameupdated: Any = js.native
        inline def ongameupdated_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongameupdated")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.removeEventListener")
        @js.native
        def removeEventListener: Any = js.native
        inline def removeEventListener_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(x.asInstanceOf[js.Any])
      }
      
      object GameListCategory {
        
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListCategory")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListCategory.candidate")
        @js.native
        def candidate: Any = js.native
        inline def candidate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("candidate")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListCategory.confirmedBySystem")
        @js.native
        def confirmedBySystem: Any = js.native
        inline def confirmedBySystem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("confirmedBySystem")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListCategory.confirmedByUser")
        @js.native
        def confirmedByUser: Any = js.native
        inline def confirmedByUser_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("confirmedByUser")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListEntry")
      @js.native
      abstract class GameListEntry ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.Preview.GamesEnumeration.GameListEntry {
        
        /* CompleteClass */
        var category: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var displayInfo: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var launchAsync: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var properties: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var setCategoryAsync: Any = js.native
      }
    }
  }
  
  object UI {
    
    @JSGlobal("Windows.Gaming.UI.GameBar")
    @js.native
    abstract class GameBar ()
      extends StObject
         with typings.winrtUwp.Windows.Gaming.UI.GameBar
    object GameBar {
      
      @JSGlobal("Windows.Gaming.UI.GameBar")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.addEventListener")
      @js.native
      def addEventListener: Any = js.native
      inline def addEventListener_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.isInputRedirected")
      @js.native
      def isInputRedirected: Any = js.native
      inline def isInputRedirected_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInputRedirected")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.onisinputredirectedchanged")
      @js.native
      def onisinputredirectedchanged: Any = js.native
      inline def onisinputredirectedchanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onisinputredirectedchanged")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.onvisibilitychanged")
      @js.native
      def onvisibilitychanged: Any = js.native
      inline def onvisibilitychanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onvisibilitychanged")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.removeEventListener")
      @js.native
      def removeEventListener: Any = js.native
      inline def removeEventListener_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.visible")
      @js.native
      def visible: Any = js.native
      inline def visible_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visible")(x.asInstanceOf[js.Any])
    }
  }
  
  object XboxLive {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    object Storage {
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobGetResult")
      @js.native
      abstract class GameSaveBlobGetResult ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobGetResult {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var status: GameSaveErrorStatus = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var value: IMapView[String, IBuffer] = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobInfo")
      @js.native
      abstract class GameSaveBlobInfo ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfo {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var name: String = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var size: Double = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoGetResult")
      @js.native
      abstract class GameSaveBlobInfoGetResult ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoGetResult {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var status: GameSaveErrorStatus = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var value: IVectorView[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfo] = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoQuery")
      @js.native
      abstract class GameSaveBlobInfoQuery ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoQuery
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainer")
      @js.native
      abstract class GameSaveContainer ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainer {
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobNamePrefix This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* CompleteClass */
        override def createBlobInfoQuery(blobNamePrefix: String): typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoQuery = js.native
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobsToRead This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* CompleteClass */
        override def getAsync(blobsToRead: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobGetResult] = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var name: String = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var provider: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProvider = js.native
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobsToRead This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* CompleteClass */
        override def readAsync(blobsToRead: IMapView[String, IBuffer]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult] = js.native
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobsToWrite This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobsToDelete This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param displayName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* CompleteClass */
        override def submitPropertySetUpdatesAsync(blobsToWrite: IPropertySet, blobsToDelete: IIterable[String], displayName: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult] = js.native
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobsToWrite This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param blobsToDelete This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param displayName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* CompleteClass */
        override def submitUpdatesAsync(blobsToWrite: IMapView[String, IBuffer], blobsToDelete: IIterable[String], displayName: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult] = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainerInfo")
      @js.native
      abstract class GameSaveContainerInfo ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfo {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var displayName: String = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var lastModifiedTime: js.Date = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var name: String = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var needsSync: Boolean = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var totalSize: Double = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoGetResult")
      @js.native
      abstract class GameSaveContainerInfoGetResult ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoGetResult {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var status: GameSaveErrorStatus = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var value: IVectorView[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfo] = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoQuery")
      @js.native
      abstract class GameSaveContainerInfoQuery ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoQuery
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus")
      @js.native
      object GameSaveErrorStatus extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus & Double] = js.native
        
        /* 1 */ val abort: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.abort & Double = js.native
        
        /* 9 */ val blobNotFound: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.blobNotFound & Double = js.native
        
        /* 11 */ val containerNotInSync: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.containerNotInSync & Double = js.native
        
        /* 12 */ val containerSyncFailed: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.containerSyncFailed & Double = js.native
        
        /* 2 */ val invalidContainerName: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.invalidContainerName & Double = js.native
        
        /* 3 */ val noAccess: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.noAccess & Double = js.native
        
        /* 10 */ val noXboxLiveInfo: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.noXboxLiveInfo & Double = js.native
        
        /* 14 */ val objectExpired: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.objectExpired & Double = js.native
        
        /* 0 */ val ok: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.ok & Double = js.native
        
        /* 4 */ val outOfLocalStorage: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.outOfLocalStorage & Double = js.native
        
        /* 8 */ val providedBufferTooSmall: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.providedBufferTooSmall & Double = js.native
        
        /* 7 */ val quotaExceeded: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.quotaExceeded & Double = js.native
        
        /* 6 */ val updateTooBig: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.updateTooBig & Double = js.native
        
        /* 5 */ val userCanceled: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.userCanceled & Double = js.native
        
        /* 13 */ val userHasNoXboxLiveInfo: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.userHasNoXboxLiveInfo & Double = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveOperationResult")
      @js.native
      abstract class GameSaveOperationResult ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var status: GameSaveErrorStatus = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveProvider")
      @js.native
      abstract class GameSaveProvider ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProvider
      object GameSaveProvider {
        
        @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveProvider")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param user This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param serviceConfigId This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* static member */
        inline def getForUserAsync(user: User, serviceConfigId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getForUserAsync")(user.asInstanceOf[js.Any], serviceConfigId.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult]]
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param user This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param serviceConfigId This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* static member */
        inline def getSyncOnDemandForUserAsync(user: User, serviceConfigId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSyncOnDemandForUserAsync")(user.asInstanceOf[js.Any], serviceConfigId.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult]]
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult")
      @js.native
      abstract class GameSaveProviderGetResult ()
        extends StObject
           with typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult {
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var status: GameSaveErrorStatus = js.native
        
        /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
        /* CompleteClass */
        var value: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProvider = js.native
      }
    }
  }
}
