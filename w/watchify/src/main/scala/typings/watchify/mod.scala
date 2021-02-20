package typings.watchify

import org.scalablytyped.runtime.Shortcut
import typings.browserify.mod.BrowserifyObject
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.RegExp
import typings.watchify.anon.Cache
import typings.watchify.watchifyStrings.bytes
import typings.watchify.watchifyStrings.log
import typings.watchify.watchifyStrings.time
import typings.watchify.watchifyStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("watchify", JSImport.Namespace)
  @js.native
  val ^ : Constructor = js.native
  
  /**
    * Watch mode for browserify builds.
    * Update any source file and your browserify bundle will be recompiled on the spot
    */
  @js.native
  trait Constructor extends StObject {
    
    def apply(b: BrowserifyObject): BrowserifyObject = js.native
    def apply(b: BrowserifyObject, opts: Options): BrowserifyObject = js.native
    def apply[T /* <: BrowserifyObject */](b: T): T = js.native
    def apply[T /* <: BrowserifyObject */](b: T, opts: Options): T = js.native
    
    var args: Cache = js.native
    
    /** Close all the open watch handles. */
    def close(): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The amount of time in milliseconds to wait before emitting an "update" event after a change.
      * @default 100
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Ignores monitoring files for changes. If set to `true`, then ** /node_modules/ ** will be ignored.
      * For other possible values see Chokidar's documentation on "ignored"
      * Also see anymatch package: https://github.com/es128/anymatch#usage
      */
    var ignoreWatch: js.UndefOr[
        Boolean | String | RegExp | (js.Function1[/* repeated */ js.Any, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* repeated */ _, Boolean])])
      ] = js.native
    
    /**
      * Enables polling to monitor for changes. If set to `true`, then a polling interval of 100 ms is used.
      * If set to a number, then that amount of milliseconds will be the polling interval. For more info see
      * Chokidar's documentation on "usePolling" and "interval".
      * This option is useful if you're watching an NFS volume
      * Also see chokidar package: https://github.com/paulmillr/chokidar#path-filtering
      */
    var poll: js.UndefOr[Boolean | Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setIgnoreWatch(
        value: Boolean | String | RegExp | (js.Function1[/* repeated */ js.Any, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* repeated */ _, Boolean])])
      ): Self = StObject.set(x, "ignoreWatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreWatchFunction1(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "ignoreWatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIgnoreWatchUndefined: Self = StObject.set(x, "ignoreWatch", js.undefined)
      
      @scala.inline
      def setIgnoreWatchVarargs(value: (String | RegExp | (js.Function1[js.Any, Boolean]))*): Self = StObject.set(x, "ignoreWatch", js.Array(value :_*))
      
      @scala.inline
      def setPoll(value: Boolean | Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Constructor = ^
  
  /* augmented module */
  object browserifyAugmentingMod {
    
    @js.native
    trait BrowserifyObject extends EventEmitter {
      
      /**
        * When a bundle is generated, this event fires with the number of bytes
        */
      @JSName("on")
      def on_bytes(event: bytes, listener: js.Function1[/* bytes */ Double, _]): this.type = js.native
      /**
        * This event fires after a bundle was created with messages of the form:
        * ```text
        * X bytes written (Y seconds)
        * ```
        * with the number of bytes in the bundle X and the time in seconds Y.
        */
      @JSName("on")
      def on_log(event: log, listener: js.Function1[/* msg */ String, _]): this.type = js.native
      /**
        * When a bundle is generated, this event fires with the time it took to create the bundle in milliseconds.
        */
      @JSName("on")
      def on_time(event: time, listener: js.Function1[/* time */ Double, _]): this.type = js.native
      /**
        * When the bundle changes, emit the array of bundle ids that changed.
        */
      @JSName("on")
      def on_update(event: update, listener: js.Function1[/* ids */ js.Array[String], _]): this.type = js.native
    }
  }
}
