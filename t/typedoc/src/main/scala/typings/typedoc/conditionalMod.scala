package typings.typedoc

import typings.typedoc.componentsMod.TypeTypeConverter
import typings.typedoc.contextMod.Context
import typings.typedoc.typesAbstractMod.Type
import typings.typescript.mod.ConditionalType
import typings.typescript.mod.ConditionalTypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/conditional", JSImport.Namespace)
@js.native
object conditionalMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedoc.componentMod.ComponentHost because Already inherited
  - typings.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.componentMod.AbstractComponent because Already inherited
  - typings.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class ConditionalConverter () extends TypeTypeConverter[ConditionalType] {
    def convertNode(context: Context, node: ConditionalTypeNode): js.UndefOr[typings.typedoc.modelsTypesMod.ConditionalType] = js.native
    def convertNode(context: Context, node: ConditionalTypeNode, `type`: ConditionalType): js.UndefOr[Type] = js.native
    def supportsNode(context: Context, node: ConditionalTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: ConditionalTypeNode, `type`: ConditionalType): Boolean = js.native
  }
  
}

