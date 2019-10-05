package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_getResourceURL")
@js.native
object GM_getResourceURL extends js.Object {
  /**
    * Get the base64 encoded URI of a predefined `@resource` tag at the script
    * header
    */
  def apply(name: String): String = js.native
}

