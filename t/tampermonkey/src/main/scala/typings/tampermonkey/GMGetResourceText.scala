package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_getResourceText")
@js.native
object GMGetResourceText extends js.Object {
  // Resources
  /** Get the content of a predefined `@resource` tag at the script header */
  def apply(name: String): String = js.native
}

