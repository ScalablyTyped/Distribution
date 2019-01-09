package typings
package typedocLib.distLibConverterComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typedocLib.distLibConverterComponentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
trait TypeConverter[T /* <: typescriptLib.typescriptMod.tsNs.Type */, N /* <: typescriptLib.typescriptMod.tsNs.Node */] extends TypeTypeConverter[T] {
  def convertNode(context: typedocLib.distLibConverterContextMod.Context, node: N): js.UndefOr[typedocLib.distLibModelsTypesAbstractMod.Type] = js.native
  def convertNode(context: typedocLib.distLibConverterContextMod.Context, node: N, `type`: T): js.UndefOr[typedocLib.distLibModelsTypesAbstractMod.Type] = js.native
  def supportsNode(context: typedocLib.distLibConverterContextMod.Context, node: N): scala.Boolean = js.native
  def supportsNode(context: typedocLib.distLibConverterContextMod.Context, node: N, `type`: T): scala.Boolean = js.native
}

