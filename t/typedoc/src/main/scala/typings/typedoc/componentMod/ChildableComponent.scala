package typings.typedoc.componentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/component", "ChildableComponent")
@js.native
abstract class ChildableComponent[O /* <: ComponentHost */, C /* <: Component */] protected () extends AbstractComponent[O] {
  def this(owner: O) = this()
  def this(owner: js.Symbol) = this()
  var _componentChildren: js.Any = js.native
  var _defaultComponents: js.Any = js.native
  def addComponent[T /* <: C */](name: String, componentClass: T): T = js.native
  def addComponent[T /* <: C */](name: String, componentClass: ComponentClass[T, O]): T = js.native
  def getComponent(name: String): js.UndefOr[C] = js.native
  def getComponents(): js.Array[C] = js.native
  def hasComponent(name: String): Boolean = js.native
  def removeAllComponents(): Unit = js.native
  def removeComponent(name: String): js.UndefOr[C] = js.native
}

