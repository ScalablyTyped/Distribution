package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Curve")
@js.native
class Curve[T /* <: threeLib.srcMathVector2Mod.Vector */] ()
  extends threeLib.srcExtrasCoreCurveMod.Curve[T]

/* static members */
@JSImport("three", "Curve")
@js.native
object Curve extends js.Object {
  /**
  	 * @deprecated since r84.
  	 */
  def create(constructorFunc: js.Function, getPointFunc: js.Function): js.Function = js.native
}

