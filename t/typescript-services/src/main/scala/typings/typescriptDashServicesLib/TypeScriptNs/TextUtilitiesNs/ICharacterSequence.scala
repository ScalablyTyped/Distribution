package typings
package typescriptDashServicesLib.TypeScriptNs.TextUtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICharacterSequence extends js.Object {
  var length: scala.Double
  def charCodeAt(index: scala.Double): scala.Double
}

object ICharacterSequence {
  @scala.inline
  def apply(charCodeAt: js.Function1[scala.Double, scala.Double], length: scala.Double): ICharacterSequence = {
    val __obj = js.Dynamic.literal(charCodeAt = charCodeAt, length = length)
  
    __obj.asInstanceOf[ICharacterSequence]
  }
}

