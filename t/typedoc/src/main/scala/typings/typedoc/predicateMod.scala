package typings.typedoc

import typings.typedoc.componentsMod.ConverterTypeComponent
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsTypesMod.PredicateType
import typings.typescript.mod.Node
import typings.typescript.mod.TypePredicateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/predicate", JSImport.Namespace)
@js.native
object predicateMod extends js.Object {
  @js.native
  class PredicateConverter () extends ConverterTypeComponent {
    def convertNode(context: Context, node: TypePredicateNode): PredicateType = js.native
    def supportsNode(_context: Context, node: Node): Boolean = js.native
  }
  
}

