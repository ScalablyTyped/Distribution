package typings.three.srcLoadersLoadingManagerMod

import typings.std.RegExp
import typings.three.srcLoadersLoaderMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/LoadingManager", "LoadingManager")
@js.native
class LoadingManager () extends js.Object {
  def this(onLoad: js.Function0[Unit]) = this()
  def this(
    onLoad: js.Function0[Unit],
    onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit]
  ) = this()
  def this(
    onLoad: js.Function0[Unit],
    onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit],
    onError: js.Function1[/* url */ String, Unit]
  ) = this()
  var onStart: js.UndefOr[js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit]] = js.native
  // handlers
  def addHandler(regex: RegExp, loader: Loader): this.type = js.native
  def getHandler(file: String): Loader | Null = js.native
  def itemEnd(url: String): Unit = js.native
  def itemError(url: String): Unit = js.native
  def itemStart(url: String): Unit = js.native
  /**
  	 * Will be called when each element in the scene completes loading.
  	 * The default is a function with empty body.
  	 */
  def onError(url: String): Unit = js.native
  /**
  	 * Will be called when load starts.
  	 * The default is a function with empty body.
  	 */
  def onLoad(): Unit = js.native
  /**
  	 * Will be called while load progresses.
  	 * The default is a function with empty body.
  	 */
  def onProgress(item: js.Any, loaded: Double, total: Double): Unit = js.native
  def removeHandler(regex: RegExp): this.type = js.native
  /**
  	 * Given a URL, uses the URL modifier callback (if any) and returns a resolved URL.
  	 * If no URL modifier is set, returns the original URL.
  	 * @param url the url to load
  	 */
  def resolveURL(url: String): String = js.native
  /**
  	 * If provided, the callback will be passed each resource URL before a request is sent.
  	 * The callback may return the original URL, or a new URL to override loading behavior.
  	 * This behavior can be used to load assets from .ZIP files, drag-and-drop APIs, and Data URIs.
  	 * @param callback URL modifier callback. Called with url argument, and must return resolvedURL.
  	 */
  def setURLModifier(): this.type = js.native
  def setURLModifier(callback: js.Function1[/* url */ String, String]): this.type = js.native
}

