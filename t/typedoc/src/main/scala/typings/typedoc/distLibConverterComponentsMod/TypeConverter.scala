package typings.typedoc.distLibConverterComponentsMod

import typings.typedoc.distLibConverterContextMod.Context
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedoc.distLibConverterComponentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
trait TypeConverter[T /* <: Type */, N /* <: Node */] extends TypeTypeConverter[T] {
  def convertNode(context: Context, node: N): js.UndefOr[typings.typedoc.distLibModelsTypesAbstractMod.Type] = js.native
  def convertNode(context: Context, node: N, `type`: T): js.UndefOr[typings.typedoc.distLibModelsTypesAbstractMod.Type] = js.native
  def supportsNode(context: Context, node: N): Boolean = js.native
  def supportsNode(context: Context, node: N, `type`: T): Boolean = js.native
}

