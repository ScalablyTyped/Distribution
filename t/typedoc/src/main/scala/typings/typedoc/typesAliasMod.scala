package typings.typedoc

import typings.typedoc.anon.TypealiasSymbolSymbol
import typings.typedoc.componentsMod.TypeTypeConverter
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.ReferenceType
import typings.typescript.mod.Type
import typings.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/alias", JSImport.Namespace)
@js.native
object typesAliasMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedoc.componentMod.ComponentHost because Already inherited
  - typings.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.componentMod.AbstractComponent because Already inherited
  - typings.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class AliasConverter () extends TypeTypeConverter[Type] {
    
    def convertNode(context: Context, node: TypeReferenceNode): js.UndefOr[typings.typedoc.typesAbstractMod.Type] = js.native
    def convertNode(context: Context, node: TypeReferenceNode, `type`: Type): js.UndefOr[typings.typedoc.typesAbstractMod.Type] = js.native
    @JSName("convertNode")
    def convertNode_ReferenceType(context: Context, node: TypeReferenceNode): ReferenceType = js.native
    
    def convertType(context: Context, `type`: TypealiasSymbolSymbol): ReferenceType = js.native
    
    def supportsNode(context: Context, node: TypeReferenceNode): Boolean = js.native
    def supportsNode(context: Context, node: TypeReferenceNode, `type`: Type): Boolean = js.native
  }
}
