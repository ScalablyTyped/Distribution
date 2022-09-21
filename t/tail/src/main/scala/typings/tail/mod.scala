package typings.tail

import typings.std.Record
import typings.tail.tailStrings.error
import typings.tail.tailStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tail", "Tail")
  @js.native
  open class Tail protected () extends StObject {
    /** Creates a new Tail object that starts watching the specified file immediately. */
    def this(filename: String) = this()
    def this(filename: String, options: TailOptions) = this()
    
    /** Error callback */
    @JSName("on")
    def on_error(eventType: error, cb: js.Function1[/* error */ Any, Unit]): Unit = js.native
    /** Callback to listen for newlines appended to file */
    @JSName("on")
    def on_line(eventType: line, cb: js.Function1[/* data */ Any, Unit]): Unit = js.native
    
    /** Stop watching file */
    def unwatch(): Unit = js.native
    
    /** Start watching file if previously stopped */
    def watch(): Unit = js.native
  }
  
  trait TailOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var flushAtEOF: js.UndefOr[Boolean] = js.undefined
    
    var follow: js.UndefOr[Boolean] = js.undefined
    
    var fromBeginning: js.UndefOr[Boolean] = js.undefined
    
    var fsWatchOptions: js.UndefOr[Record[String, Any]] = js.undefined
    
    var logger: js.UndefOr[Any] = js.undefined
    
    var nLines: js.UndefOr[Double] = js.undefined
    
    var separator: js.UndefOr[String | js.RegExp | Null] = js.undefined
    
    var useWatchFile: js.UndefOr[Boolean] = js.undefined
  }
  object TailOptions {
    
    inline def apply(): TailOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TailOptions]
    }
    
    extension [Self <: TailOptions](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlushAtEOF(value: Boolean): Self = StObject.set(x, "flushAtEOF", value.asInstanceOf[js.Any])
      
      inline def setFlushAtEOFUndefined: Self = StObject.set(x, "flushAtEOF", js.undefined)
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setFromBeginning(value: Boolean): Self = StObject.set(x, "fromBeginning", value.asInstanceOf[js.Any])
      
      inline def setFromBeginningUndefined: Self = StObject.set(x, "fromBeginning", js.undefined)
      
      inline def setFsWatchOptions(value: Record[String, Any]): Self = StObject.set(x, "fsWatchOptions", value.asInstanceOf[js.Any])
      
      inline def setFsWatchOptionsUndefined: Self = StObject.set(x, "fsWatchOptions", js.undefined)
      
      inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setNLines(value: Double): Self = StObject.set(x, "nLines", value.asInstanceOf[js.Any])
      
      inline def setNLinesUndefined: Self = StObject.set(x, "nLines", js.undefined)
      
      inline def setSeparator(value: String | js.RegExp): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorNull: Self = StObject.set(x, "separator", null)
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setUseWatchFile(value: Boolean): Self = StObject.set(x, "useWatchFile", value.asInstanceOf[js.Any])
      
      inline def setUseWatchFileUndefined: Self = StObject.set(x, "useWatchFile", js.undefined)
    }
  }
}
