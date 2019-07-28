package typings.typedoc.distLibUtilsComponentMod

import typings.typedoc.distLibApplicationMod.Application
import typings.typedoc.distLibUtilsEventsMod.Event
import typings.typedoc.distLibUtilsEventsMod.EventDispatcher
import typings.typedoc.distLibUtilsEventsMod.EventMap
import typings.typedoc.distLibUtilsOptionsDeclarationMod.DeclarationOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/component", "AbstractComponent")
@js.native
abstract class AbstractComponent[O /* <: ComponentHost */] protected ()
  extends EventDispatcher
     with ComponentHost {
  def this(owner: O) = this()
  def this(owner: js.Symbol) = this()
  var _componentOptions: js.UndefOr[js.Any] = js.native
  var _componentOwner: js.Any = js.native
  /* CompleteClass */
  override val application: Application = js.native
  var componentName: String = js.native
  val owner: O = js.native
  /* protected */ def bubble(name: String, args: js.Any*): this.type = js.native
  /* protected */ def bubble(name: EventMap, args: js.Any*): this.type = js.native
  /* protected */ def bubble(name: Event, args: js.Any*): this.type = js.native
  def getOptionDeclarations(): js.Array[DeclarationOption] = js.native
  /* protected */ def initialize(): Unit = js.native
}

