package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.TypeTypeConverter
import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsTypesAbstractMod.Type
import typings.typedoc.distLibModelsTypesMod.TupleType
import typings.typescript.typescriptMod.TupleTypeNode
import typings.typescript.typescriptMod.TypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/tuple", JSImport.Namespace)
@js.native
object distLibConverterTypesTupleMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedoc.distLibUtilsComponentMod.ComponentHost because Already inherited
  - typings.typedoc.distLibUtilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.distLibUtilsComponentMod.AbstractComponent because Already inherited
  - typings.typedoc.distLibConverterComponentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.distLibConverterComponentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class TupleConverter () extends TypeTypeConverter[TypeReference] {
    def convertNode(context: Context, node: TupleTypeNode): js.UndefOr[Type] = js.native
    def convertNode(context: Context, node: TupleTypeNode, `type`: TypeReference): js.UndefOr[Type] = js.native
    @JSName("convertNode")
    def convertNode_TupleType(context: Context, node: TupleTypeNode): TupleType = js.native
    def supportsNode(context: Context, node: TupleTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: TupleTypeNode, `type`: TypeReference): Boolean = js.native
  }
  
}

