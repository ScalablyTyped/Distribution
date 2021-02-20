package typings.tail

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.std.Record
import typings.std.RegExp
import typings.tail.tailStrings.error
import typings.tail.tailStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tail", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tail", "Tail")
  @js.native
  class TailCls protected () extends Tail {
    /** Creates a new Tail object that starts watching the specified file immediately. */
    def this(filename: String) = this()
    def this(filename: String, options: TailOptions) = this()
  }
  
  @js.native
  trait Static extends StObject {
    
    var Tail: TailConstructor = js.native
  }
  object Static {
    
    @scala.inline
    def apply(Tail: TailConstructor): Static = {
      val __obj = js.Dynamic.literal(Tail = Tail.asInstanceOf[js.Any])
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit class StaticMutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTail(value: TailConstructor): Self = StObject.set(x, "Tail", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tail extends StObject {
    
    /** Error callback */
    @JSName("on")
    def on_error(eventType: error, cb: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    /** Callback to listen for newlines appended to file */
    @JSName("on")
    def on_line(eventType: line, cb: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
    
    /** Stop watching file */
    def unwatch(): Unit = js.native
    
    /** Start watching file if previously stopped */
    def watch(): Unit = js.native
  }
  
  @js.native
  trait TailConstructor
    extends /** Creates a new Tail object that starts watching the specified file immediately. */
  Instantiable1[/* filename */ String, Tail]
       with Instantiable2[/* filename */ String, /* options */ TailOptions, Tail]
  
  @js.native
  trait TailOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.native
    
    var flushAtEOF: js.UndefOr[Boolean] = js.native
    
    var follow: js.UndefOr[Boolean] = js.native
    
    var fromBeginning: js.UndefOr[Boolean] = js.native
    
    var fsWatchOptions: js.UndefOr[Record[String, _]] = js.native
    
    var logger: js.UndefOr[js.Any] = js.native
    
    var separator: js.UndefOr[String | RegExp | Null] = js.native
    
    var useWatchFile: js.UndefOr[Boolean] = js.native
  }
  object TailOptions {
    
    @scala.inline
    def apply(): TailOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TailOptions]
    }
    
    @scala.inline
    implicit class TailOptionsMutableBuilder[Self <: TailOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFlushAtEOF(value: Boolean): Self = StObject.set(x, "flushAtEOF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushAtEOFUndefined: Self = StObject.set(x, "flushAtEOF", js.undefined)
      
      @scala.inline
      def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setFromBeginning(value: Boolean): Self = StObject.set(x, "fromBeginning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromBeginningUndefined: Self = StObject.set(x, "fromBeginning", js.undefined)
      
      @scala.inline
      def setFsWatchOptions(value: Record[String, _]): Self = StObject.set(x, "fsWatchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsWatchOptionsUndefined: Self = StObject.set(x, "fsWatchOptions", js.undefined)
      
      @scala.inline
      def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setSeparator(value: String | RegExp): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorNull: Self = StObject.set(x, "separator", null)
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setUseWatchFile(value: Boolean): Self = StObject.set(x, "useWatchFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWatchFileUndefined: Self = StObject.set(x, "useWatchFile", js.undefined)
    }
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
