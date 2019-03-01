package typings
package trianglifyLib.trianglifyMod.trianglifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGOptions extends js.Object {
  var includeNamespace: scala.Boolean
}

object SVGOptions {
  @scala.inline
  def apply(includeNamespace: scala.Boolean): SVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("includeNamespace")(includeNamespace)
    __obj.asInstanceOf[SVGOptions]
  }
}

