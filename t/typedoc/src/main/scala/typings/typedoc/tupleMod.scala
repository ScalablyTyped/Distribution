package typings.typedoc

import typings.typedoc.componentsMod.TypeTypeConverter
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsTypesMod.TupleType
import typings.typedoc.typesAbstractMod.Type
import typings.typescript.mod.TupleTypeNode
import typings.typescript.mod.TypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/tuple", JSImport.Namespace)
@js.native
object tupleMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedoc.componentMod.ComponentHost because Already inherited
  - typings.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.componentMod.AbstractComponent because Already inherited
  - typings.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class TupleConverter () extends TypeTypeConverter[TypeReference] {
    def convertNode(context: Context, node: TupleTypeNode): js.UndefOr[Type] = js.native
    def convertNode(context: Context, node: TupleTypeNode, `type`: TypeReference): js.UndefOr[Type] = js.native
    @JSName("convertNode")
    def convertNode_TupleType(context: Context, node: TupleTypeNode): TupleType = js.native
    def supportsNode(context: Context, node: TupleTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: TupleTypeNode, `type`: TypeReference): Boolean = js.native
  }
  
}

