package typings.vite.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.nodeColonfsMod.Stats
import typings.vite.viteStrings.add
import typings.vite.viteStrings.addDir
import typings.vite.viteStrings.all
import typings.vite.viteStrings.change
import typings.vite.viteStrings.error
import typings.vite.viteStrings.raw
import typings.vite.viteStrings.ready
import typings.vite.viteStrings.unlink
import typings.vite.viteStrings.unlinkDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vite", "FSWatcher")
@js.native
/**
  * Constructs a new FSWatcher instance with optional WatchOptions parameter.
  */
open class FSWatcher ()
  extends EventEmitter
     with typings.node.fsMod.FSWatcher {
  def this(options: WatchOptions) = this()
  
  /**
    * Add files, directories, or glob patterns for tracking. Takes an array of strings or just one
    * string.
    */
  def add(paths: String): this.type = js.native
  def add(paths: js.Array[String]): this.type = js.native
  
  /**
    * Alias for `emitter.on(eventName, listener)`.
    * @since v0.1.26
    */
  /* InferMemberOverrides */
  override def addListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Returns an object representing all the paths on the file system being watched by this
    * `FSWatcher` instance. The object's keys are all the directories (using absolute paths unless
    * the `cwd` option was used), and the values are arrays of the names of the items contained in
    * each directory.
    */
  def getWatched(): StringDictionary[js.Array[String]] = js.native
  
  /**
    * Adds the `listener` function to the end of the listeners array for the
    * event named `eventName`. No checks are made to see if the `listener` has
    * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
    * times.
    *
    * ```js
    * server.on('connection', (stream) => {
    *   console.log('someone connected!');
    * });
    * ```
    *
    * Returns a reference to the `EventEmitter`, so that calls can be chained.
    *
    * By default, event listeners are invoked in the order they are added. The`emitter.prependListener()` method can be used as an alternative to add the
    * event listener to the beginning of the listeners array.
    *
    * ```js
    * const myEE = new EventEmitter();
    * myEE.on('foo', () => console.log('a'));
    * myEE.prependListener('foo', () => console.log('b'));
    * myEE.emit('foo');
    * // Prints:
    * //   b
    * //   a
    * ```
    * @since v0.1.101
    * @param eventName The name of the event.
    * @param listener The callback function
    */
  /* InferMemberOverrides */
  override def on(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: unlink | unlinkDir, listener: js.Function1[/* path */ String, Unit]): this.type = js.native
  def on(
    event: add | addDir | change,
    listener: js.Function2[/* path */ String, /* stats */ js.UndefOr[Stats], Unit]
  ): this.type = js.native
  def on(
    event: all,
    listener: js.Function3[
      /* eventName */ add | addDir | change | unlink | unlinkDir, 
      /* path */ String, 
      /* stats */ js.UndefOr[Stats], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Error occurred
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  /**
    * Exposes the native Node `fs.FSWatcher events`
    */
  @JSName("on")
  def on_raw(
    event: raw,
    listener: js.Function3[/* eventName */ String, /* path */ String, /* details */ Any, Unit]
  ): this.type = js.native
  /**
    * Fires when the initial scan is complete
    */
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Adds a **one-time**`listener` function for the event named `eventName`. The
    * next time `eventName` is triggered, this listener is removed and then invoked.
    *
    * ```js
    * server.once('connection', (stream) => {
    *   console.log('Ah, we have our first user!');
    * });
    * ```
    *
    * Returns a reference to the `EventEmitter`, so that calls can be chained.
    *
    * By default, event listeners are invoked in the order they are added. The`emitter.prependOnceListener()` method can be used as an alternative to add the
    * event listener to the beginning of the listeners array.
    *
    * ```js
    * const myEE = new EventEmitter();
    * myEE.once('foo', () => console.log('a'));
    * myEE.prependOnceListener('foo', () => console.log('b'));
    * myEE.emit('foo');
    * // Prints:
    * //   b
    * //   a
    * ```
    * @since v0.3.0
    * @param eventName The name of the event.
    * @param listener The callback function
    */
  /* InferMemberOverrides */
  override def once(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  var options: WatchOptions = js.native
  
  /**
    * Adds the `listener` function to the _beginning_ of the listeners array for the
    * event named `eventName`. No checks are made to see if the `listener` has
    * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
    * times.
    *
    * ```js
    * server.prependListener('connection', (stream) => {
    *   console.log('someone connected!');
    * });
    * ```
    *
    * Returns a reference to the `EventEmitter`, so that calls can be chained.
    * @since v6.0.0
    * @param eventName The name of the event.
    * @param listener The callback function
    */
  /* InferMemberOverrides */
  override def prependListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Adds a **one-time**`listener` function for the event named `eventName` to the _beginning_ of the listeners array. The next time `eventName` is triggered, this
    * listener is removed, and then invoked.
    *
    * ```js
    * server.prependOnceListener('connection', (stream) => {
    *   console.log('Ah, we have our first user!');
    * });
    * ```
    *
    * Returns a reference to the `EventEmitter`, so that calls can be chained.
    * @since v6.0.0
    * @param eventName The name of the event.
    * @param listener The callback function
    */
  /* InferMemberOverrides */
  override def prependOnceListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Stop watching files, directories, or glob patterns. Takes an array of strings or just one
    * string.
    */
  def unwatch(paths: String): this.type = js.native
  def unwatch(paths: js.Array[String]): this.type = js.native
}
