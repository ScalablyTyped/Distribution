package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.Reflection
import typings.typescript.mod.BindingElement
import typings.typescript.mod.ImportEqualsDeclaration
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.PropertyAssignment
import typings.typescript.mod.PropertyDeclaration
import typings.typescript.mod.PropertySignature
import typings.typescript.mod.ShorthandPropertyAssignment
import typings.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/variable", JSImport.Namespace)
@js.native
object variableMod extends js.Object {
  @js.native
  class VariableConverter () extends ConverterNodeComponent[VariableDeclaration] {
    def convert(context: Context, node: VarNodeType): js.UndefOr[Reflection] = js.native
    def isSimpleObjectLiteral(objectLiteral: ObjectLiteralExpression): Boolean = js.native
  }
  
  type VarNodeType = PropertySignature | PropertyDeclaration | PropertyAssignment | ShorthandPropertyAssignment | VariableDeclaration | ImportEqualsDeclaration | BindingElement
}

