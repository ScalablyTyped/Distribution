package typings
package typedocLib.distLibUtilsComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/component", "ChildableComponent")
@js.native
abstract class ChildableComponent[O /* <: ComponentHost */, C /* <: Component */] protected () extends AbstractComponent[O] {
  def this(owner: O) = this()
  var _componentChildren: js.Any = js.native
  var _defaultComponents: js.Any = js.native
  def addComponent[T /* <: C with Component */](name: java.lang.String, componentClass: T): T = js.native
  def addComponent[T /* <: C with Component */](name: java.lang.String, componentClass: ComponentClass[T, O]): T = js.native
  def getComponent(name: java.lang.String): C = js.native
  def getComponents(): js.Array[C] = js.native
  def hasComponent(name: java.lang.String): scala.Boolean = js.native
  def removeAllComponents(): scala.Unit = js.native
  def removeComponent(name: java.lang.String): C = js.native
}

