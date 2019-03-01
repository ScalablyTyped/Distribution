package typings
package uuidLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Random
  extends uuidLib.interfacesMod.V4Options {
  var random: js.Array[scala.Double]
}

object Anon_Random {
  @scala.inline
  def apply(random: js.Array[scala.Double]): Anon_Random = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("random")(random)
    __obj.asInstanceOf[Anon_Random]
  }
}

