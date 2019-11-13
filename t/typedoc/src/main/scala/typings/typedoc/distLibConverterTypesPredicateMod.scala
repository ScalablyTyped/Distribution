package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.ConverterTypeComponent
import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsTypesMod.PredicateType
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.TypePredicateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/predicate", JSImport.Namespace)
@js.native
object distLibConverterTypesPredicateMod extends js.Object {
  @js.native
  class PredicateConverter () extends ConverterTypeComponent {
    def convertNode(context: Context, node: TypePredicateNode): PredicateType = js.native
    def supportsNode(_context: Context, node: Node): Boolean = js.native
  }
  
}

