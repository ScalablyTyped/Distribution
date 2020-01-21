package typings.videoJs.mod.default

import typings.videoJs.mod.videojs.Hook.BeforeSetup
import typings.videoJs.videoJsStrings.beforesetup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "hook")
@js.native
object hook_beforesetup extends js.Object {
  def apply(`type`: beforesetup, fn: js.Array[BeforeSetup]): Unit = js.native
  def apply(`type`: beforesetup, fn: BeforeSetup): Unit = js.native
}

