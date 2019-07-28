package typings.typedoc.distLibUtilsMod

import typings.typedoc.distLibUtilsComponentMod.ComponentHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils", "AbstractComponent")
@js.native
abstract class AbstractComponent[O /* <: ComponentHost */] protected ()
  extends typings.typedoc.distLibUtilsComponentMod.AbstractComponent[O] {
  def this(owner: O) = this()
  def this(owner: js.Symbol) = this()
}

