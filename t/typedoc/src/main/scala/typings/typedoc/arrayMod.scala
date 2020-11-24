package typings.typedoc

import typings.typedoc.componentsMod.TypeTypeConverter
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.Type
import typings.typescript.mod.ArrayTypeNode
import typings.typescript.mod.TypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedoc.componentMod.ComponentHost because Already inherited
  - typings.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.componentMod.AbstractComponent because Already inherited
  - typings.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class ArrayConverter () extends TypeTypeConverter[TypeReference] {
    
    def convertNode(context: Context, node: ArrayTypeNode): js.UndefOr[Type] = js.native
    def convertNode(context: Context, node: ArrayTypeNode, `type`: TypeReference): js.UndefOr[typings.typedoc.typesAbstractMod.Type] = js.native
    
    def supportsNode(context: Context, node: ArrayTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: ArrayTypeNode, `type`: TypeReference): Boolean = js.native
  }
}
