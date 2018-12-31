package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "LoadingManager")
@js.native
class LoadingManager () extends js.Object {
  def this(onLoad: js.Function0[scala.Unit]) = this()
  def this(onLoad: js.Function0[scala.Unit], onProgress: js.Function3[
      /* url */ java.lang.String, 
      /* loaded */ scala.Double, 
      /* total */ scala.Double, 
      scala.Unit
    ]) = this()
  def this(onLoad: js.Function0[scala.Unit], onProgress: js.Function3[
      /* url */ java.lang.String, 
      /* loaded */ scala.Double, 
      /* total */ scala.Double, 
      scala.Unit
    ], onError: js.Function0[scala.Unit]) = this()
  var onStart: js.UndefOr[
    js.Function3[
      /* url */ java.lang.String, 
      /* loaded */ scala.Double, 
      /* total */ scala.Double, 
      scala.Unit
    ]
  ] = js.native
  def itemEnd(url: java.lang.String): scala.Unit = js.native
  def itemError(url: java.lang.String): scala.Unit = js.native
  def itemStart(url: java.lang.String): scala.Unit = js.native
  /**
    * Will be called when each element in the scene completes loading.
    * The default is a function with empty body.
    */
  def onError(url: java.lang.String): scala.Unit = js.native
  /**
    * Will be called when load starts.
    * The default is a function with empty body.
    */
  def onLoad(): scala.Unit = js.native
  /**
    * Will be called while load progresses.
    * The default is a function with empty body.
    */
  def onProgress(item: js.Any, loaded: scala.Double, total: scala.Double): scala.Unit = js.native
  /**
    * Given a URL, uses the URL modifier callback (if any) and returns a resolved URL.
    * If no URL modifier is set, returns the original URL.
    * @param url the url to load
    */
  def resolveURL(url: java.lang.String): java.lang.String = js.native
  /**
    * If provided, the callback will be passed each resource URL before a request is sent.
    * The callback may return the original URL, or a new URL to override loading behavior.
    * This behavior can be used to load assets from .ZIP files, drag-and-drop APIs, and Data URIs.
    * @param callback URL modifier callback. Called with url argument, and must return resolvedURL.
    */
  def setURLModifier(): scala.Unit = js.native
  def setURLModifier(callback: js.Function1[/* url */ java.lang.String, java.lang.String]): scala.Unit = js.native
}

