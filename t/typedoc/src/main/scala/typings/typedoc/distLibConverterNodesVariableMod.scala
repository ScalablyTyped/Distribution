package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.ConverterNodeComponent
import typings.typescript.typescriptMod.ObjectLiteralExpression
import typings.typescript.typescriptMod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/variable", JSImport.Namespace)
@js.native
object distLibConverterNodesVariableMod extends js.Object {
  @js.native
  class VariableConverter () extends ConverterNodeComponent[VariableDeclaration] {
    def isSimpleObjectLiteral(objectLiteral: ObjectLiteralExpression): Boolean = js.native
  }
  
}

