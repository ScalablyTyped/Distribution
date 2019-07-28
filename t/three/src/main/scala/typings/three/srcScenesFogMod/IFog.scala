package typings.three.srcScenesFogMod

import typings.three.srcMathColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFog extends js.Object {
  var color: Color
  var name: String
  def toJSON(): js.Any
}

object IFog {
  @scala.inline
  def apply(clone: () => IFog, color: Color, name: String, toJSON: () => js.Any): IFog = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), color = color, name = name, toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[IFog]
  }
}

