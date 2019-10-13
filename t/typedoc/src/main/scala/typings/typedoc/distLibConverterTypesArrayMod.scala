package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.TypeTypeConverter
import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsMod.Type
import typings.typescript.typescriptMod.ArrayTypeNode
import typings.typescript.typescriptMod.TypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/array", JSImport.Namespace)
@js.native
object distLibConverterTypesArrayMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedoc.distLibUtilsComponentMod.ComponentHost because Already inherited
  - typings.typedoc.distLibUtilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.distLibUtilsComponentMod.AbstractComponent because Already inherited
  - typings.typedoc.distLibConverterComponentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.distLibConverterComponentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class ArrayConverter () extends TypeTypeConverter[TypeReference] {
    def convertNode(context: Context, node: ArrayTypeNode): js.UndefOr[Type] = js.native
    def convertNode(context: Context, node: ArrayTypeNode, `type`: TypeReference): js.UndefOr[typings.typedoc.distLibModelsTypesAbstractMod.Type] = js.native
    def supportsNode(context: Context, node: ArrayTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: ArrayTypeNode, `type`: TypeReference): Boolean = js.native
  }
  
}

