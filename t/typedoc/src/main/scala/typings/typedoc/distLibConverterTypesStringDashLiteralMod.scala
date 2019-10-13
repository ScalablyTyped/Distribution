package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.TypeTypeConverter
import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsTypesAbstractMod.Type
import typings.typescript.typescriptMod.LiteralType
import typings.typescript.typescriptMod.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/string-literal", JSImport.Namespace)
@js.native
object distLibConverterTypesStringDashLiteralMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedoc.distLibUtilsComponentMod.ComponentHost because Already inherited
  - typings.typedoc.distLibUtilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.distLibUtilsComponentMod.AbstractComponent because Already inherited
  - typings.typedoc.distLibConverterComponentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.distLibConverterComponentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class StringLiteralConverter () extends TypeTypeConverter[LiteralType] {
    def convertNode(context: Context, node: StringLiteral): js.UndefOr[Type] = js.native
    def convertNode(context: Context, node: StringLiteral, `type`: LiteralType): js.UndefOr[Type] = js.native
    @JSName("convertNode")
    def convertNode_Type(context: Context, node: StringLiteral): typings.typedoc.distLibModelsTypesMod.Type = js.native
    def supportsNode(context: Context, node: StringLiteral): Boolean = js.native
    def supportsNode(context: Context, node: StringLiteral, `type`: LiteralType): Boolean = js.native
  }
  
}

