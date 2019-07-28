package typings.typedoc.distLibUtilsMod

import typings.typedoc.distLibUtilsComponentMod.Component
import typings.typedoc.distLibUtilsComponentMod.ComponentHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils", "ChildableComponent")
@js.native
abstract class ChildableComponent[O /* <: ComponentHost */, C /* <: Component */] protected ()
  extends typings.typedoc.distLibUtilsComponentMod.ChildableComponent[O, C] {
  def this(owner: O) = this()
  def this(owner: js.Symbol) = this()
}

