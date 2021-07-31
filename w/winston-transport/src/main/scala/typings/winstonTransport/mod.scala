package typings.winstonTransport

import typings.logform.mod.Format_
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("winston-transport", JSImport.Namespace)
  @js.native
  class ^ () extends TransportStream {
    def this(opts: TransportStreamOptions) = this()
  }
  
  @js.native
  trait TransportStream extends Writable {
    
    var close: js.UndefOr[js.Function0[Unit]] = js.native
    
    var format: js.UndefOr[Format_] = js.native
    
    var handleExceptions: js.UndefOr[Boolean] = js.native
    
    var level: js.UndefOr[String] = js.native
    
    var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], js.Any]] = js.native
    
    var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], js.Any]] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  
  trait TransportStreamOptions extends StObject {
    
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var format: js.UndefOr[Format_] = js.undefined
    
    var handleExceptions: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], js.Any]] = js.undefined
    
    var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], js.Any]] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object TransportStreamOptions {
    
    @scala.inline
    def apply(): TransportStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportStreamOptions]
    }
    
    @scala.inline
    implicit class TransportStreamOptionsMutableBuilder[Self <: TransportStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setFormat(value: Format_): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHandleExceptions(value: Boolean): Self = StObject.set(x, "handleExceptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleExceptionsUndefined: Self = StObject.set(x, "handleExceptions", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setLog(value: (/* info */ js.Any, /* next */ js.Function0[Unit]) => js.Any): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setLogv(value: (/* info */ js.Any, /* next */ js.Function0[Unit]) => js.Any): Self = StObject.set(x, "logv", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLogvUndefined: Self = StObject.set(x, "logv", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
