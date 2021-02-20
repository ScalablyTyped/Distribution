package typings.xsockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object XSockets {
    
    object Events {
      
      @JSGlobal("XSockets.Events")
      @js.native
      val ^ : js.Any = js.native
      
      object bindings {
        
        @JSGlobal("XSockets.Events.bindings")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("XSockets.Events.bindings.completed")
        @js.native
        def completed: String = js.native
        @scala.inline
        def completed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completed")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("XSockets.Events.close")
      @js.native
      def close: String = js.native
      @scala.inline
      def close_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("close")(x.asInstanceOf[js.Any])
      
      @JSGlobal("XSockets.Events.onBlob")
      @js.native
      def onBlob: String = js.native
      @scala.inline
      def onBlob_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlob")(x.asInstanceOf[js.Any])
      
      @JSGlobal("XSockets.Events.onError")
      @js.native
      def onError: String = js.native
      @scala.inline
      def onError_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
      
      @JSGlobal("XSockets.Events.open")
      @js.native
      def open: String = js.native
      @scala.inline
      def open_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("open")(x.asInstanceOf[js.Any])
      
      object pubSub {
        
        @JSGlobal("XSockets.Events.pubSub")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("XSockets.Events.pubSub.subscribe")
        @js.native
        def subscribe: String = js.native
        @scala.inline
        def subscribe_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(x.asInstanceOf[js.Any])
        
        @JSGlobal("XSockets.Events.pubSub.unsubscribe")
        @js.native
        def unsubscribe: String = js.native
        @scala.inline
        def unsubscribe_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(x.asInstanceOf[js.Any])
      }
      
      object storage {
        
        @JSGlobal("XSockets.Events.storage")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("XSockets.Events.storage.get")
        @js.native
        def get: String = js.native
        
        @JSGlobal("XSockets.Events.storage.getAll")
        @js.native
        def getAll: String = js.native
        @scala.inline
        def getAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAll")(x.asInstanceOf[js.Any])
        
        @scala.inline
        def get_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
        
        @JSGlobal("XSockets.Events.storage.remove")
        @js.native
        def remove: String = js.native
        @scala.inline
        def remove_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
        
        @JSGlobal("XSockets.Events.storage.set")
        @js.native
        def set: String = js.native
        @scala.inline
        def set_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
      }
    }
    
    @JSGlobal("XSockets.WebSocket")
    @js.native
    class WebSocket protected ()
      extends typings.xsockets.XSockets.WebSocket {
      def this(url: String) = this()
      def this(url: String, subprotocol: String) = this()
      def this(url: String, subprotocol: js.UndefOr[scala.Nothing], settings: js.Any) = this()
      def this(url: String, subprotocol: String, settings: js.Any) = this()
    }
  }
}
