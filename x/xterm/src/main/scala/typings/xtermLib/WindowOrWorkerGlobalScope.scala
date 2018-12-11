package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowOrWorkerGlobalScope extends js.Object {
  val caches: CacheStorage = js.native
  val crypto: Crypto = js.native
  val indexedDB: IDBFactory = js.native
  val origin: java.lang.String = js.native
  val performance: Performance = js.native
  def atob(data: java.lang.String): java.lang.String = js.native
  def btoa(data: java.lang.String): java.lang.String = js.native
  def clearInterval(): scala.Unit = js.native
  def clearInterval(handle: scala.Double): scala.Unit = js.native
  def clearTimeout(): scala.Unit = js.native
  def clearTimeout(handle: scala.Double): scala.Unit = js.native
  def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, sx: scala.Double, sy: scala.Double, sw: scala.Double, sh: scala.Double): js.Promise[ImageBitmap] = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def queueMicrotask(callback: js.Function): scala.Unit = js.native
  def setInterval(handler: TimerHandler): scala.Double = js.native
  def setInterval(handler: TimerHandler, timeout: scala.Double, arguments: js.Any*): scala.Double = js.native
  def setTimeout(handler: TimerHandler): scala.Double = js.native
  def setTimeout(handler: TimerHandler, timeout: scala.Double, arguments: js.Any*): scala.Double = js.native
}

