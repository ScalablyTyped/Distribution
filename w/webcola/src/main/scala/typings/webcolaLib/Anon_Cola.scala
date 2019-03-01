package typings
package webcolaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cola extends js.Object {
  var cola: webcolaLib.distSrcLayoutMod.Layout
  var powerGraph: js.Any
}

object Anon_Cola {
  @scala.inline
  def apply(cola: webcolaLib.distSrcLayoutMod.Layout, powerGraph: js.Any): Anon_Cola = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cola")(cola)
    __obj.updateDynamic("powerGraph")(powerGraph)
    __obj.asInstanceOf[Anon_Cola]
  }
}

