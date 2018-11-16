package typings
package typedocLib.distLibUtilsComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/component", "AbstractComponent")
@js.native
abstract class AbstractComponent[O /* <: ComponentHost */] protected ()
  extends typedocLib.distLibUtilsEventsMod.EventDispatcher
     with ComponentHost {
  def this(owner: O) = this()
  var _componentOptions: js.Any = js.native
  var _componentOwner: js.Any = js.native
  /* CompleteClass */
  override var application: typedocLib.distLibApplicationMod.Application = js.native
  var componentName: java.lang.String = js.native
  val owner: O = js.native
  /* protected */ def bubble(name: java.lang.String, args: js.Any*): this.type = js.native
  /* protected */ def bubble(name: typedocLib.distLibUtilsEventsMod.EventMap, args: js.Any*): this.type = js.native
  /* protected */ def bubble(name: typedocLib.distLibUtilsEventsMod.Event, args: js.Any*): this.type = js.native
  def getOptionDeclarations(): js.Array[typedocLib.distLibUtilsOptionsDeclarationMod.DeclarationOption] = js.native
  /* protected */ def initialize(): scala.Unit = js.native
}

