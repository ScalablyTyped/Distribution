package typings.typedoc.componentMod

import typings.typedoc.applicationMod.Application
import typings.typedoc.optionsDeclarationMod.DeclarationOption
import typings.typedoc.utilsEventsMod.Event
import typings.typedoc.utilsEventsMod.EventDispatcher
import typings.typedoc.utilsEventsMod.EventMap
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
  @JSName("application")
  def application_MAbstractComponent: Application = js.native
  /* protected */ def bubble(name: String, args: js.Any*): this.type = js.native
  /* protected */ def bubble(name: EventMap, args: js.Any*): this.type = js.native
  /* protected */ def bubble(name: Event, args: js.Any*): this.type = js.native
  def getOptionDeclarations(): js.Array[DeclarationOption] = js.native
  /* protected */ def initialize(): Unit = js.native
  def owner: O = js.native
}

