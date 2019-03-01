package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mesh extends js.Object {
  var mesh: js.UndefOr[vegaDashTypingsLib.vegaDashTypingsLibStrings.string] = js.undefined
}

object Anon_Mesh {
  @scala.inline
  def apply(mesh: vegaDashTypingsLib.vegaDashTypingsLibStrings.string = null): Anon_Mesh = {
    val __obj = js.Dynamic.literal()
    if (mesh != null) __obj.updateDynamic("mesh")(mesh)
    __obj.asInstanceOf[Anon_Mesh]
  }
}

