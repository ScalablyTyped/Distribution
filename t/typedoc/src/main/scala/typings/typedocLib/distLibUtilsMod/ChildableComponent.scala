package typings
package typedocLib.distLibUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils", "ChildableComponent")
@js.native
abstract class ChildableComponent[O /* <: typedocLib.distLibUtilsComponentMod.ComponentHost */, C /* <: typedocLib.distLibUtilsComponentMod.Component */] protected ()
  extends typedocLib.distLibUtilsComponentMod.ChildableComponent[O, C] {
  def this(owner: O) = this()
  def this(owner: js.Symbol) = this()
}

