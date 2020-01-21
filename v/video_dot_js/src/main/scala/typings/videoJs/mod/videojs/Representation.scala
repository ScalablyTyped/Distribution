package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Representation extends js.Object {
  var bitrate: Double = js.native
  var height: Double = js.native
  var id: String = js.native
  var width: Double = js.native
  def enabled(): Boolean = js.native
  def enabled(enabled: Boolean): Unit = js.native
}

