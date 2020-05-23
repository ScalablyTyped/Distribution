package typings.typedoc

import typings.typedoc.componentsMod.TypeTypeConverter
import typings.typedoc.contextMod.Context
import typings.typedoc.typesAbstractMod.Type
import typings.typescript.mod.LiteralType
import typings.typescript.mod.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/string-literal", JSImport.Namespace)
@js.native
object stringLiteralMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedoc.componentMod.ComponentHost because Already inherited
  - typings.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.componentMod.AbstractComponent because Already inherited
  - typings.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class StringLiteralConverter () extends TypeTypeConverter[LiteralType] {
    def convertNode(context: Context, node: StringLiteral): js.UndefOr[Type] = js.native
    def convertNode(context: Context, node: StringLiteral, `type`: LiteralType): js.UndefOr[Type] = js.native
    @JSName("convertNode")
    def convertNode_Type(context: Context, node: StringLiteral): typings.typedoc.modelsTypesMod.Type = js.native
    def supportsNode(context: Context, node: StringLiteral): Boolean = js.native
    def supportsNode(context: Context, node: StringLiteral, `type`: LiteralType): Boolean = js.native
  }
  
}

