package typings.typescriptDashServices.TypeScriptNs.TextUtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICharacterSequence extends js.Object {
  var length: Double
  def charCodeAt(index: Double): Double
}

object ICharacterSequence {
  @scala.inline
  def apply(charCodeAt: Double => Double, length: Double): ICharacterSequence = {
    val __obj = js.Dynamic.literal(charCodeAt = js.Any.fromFunction1(charCodeAt), length = length)
  
    __obj.asInstanceOf[ICharacterSequence]
  }
}

