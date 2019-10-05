package typings.typedoc

import typings.typescript.typescriptMod.EnumMember
import typings.typescript.typescriptMod.Expression
import typings.typescript.typescriptMod.ParameterDeclaration
import typings.typescript.typescriptMod.Program
import typings.typescript.typescriptMod.TypeChecker
import typings.typescript.typescriptMod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter", JSImport.Namespace)
@js.native
object distLibConverterMod extends js.Object {
  @js.native
  class Context protected ()
    extends typings.typedoc.distLibConverterContextMod.Context {
    def this(
      converter: typings.typedoc.distLibConverterConverterMod.Converter,
      fileNames: js.Array[String],
      checker: TypeChecker,
      program: Program
    ) = this()
  }
  
  @js.native
  class Converter ()
    extends typings.typedoc.distLibConverterConverterMod.Converter
  
  def convertDefaultValue(node: EnumMember): js.UndefOr[String] = js.native
  def convertDefaultValue(node: ParameterDeclaration): js.UndefOr[String] = js.native
  def convertDefaultValue(node: VariableDeclaration): js.UndefOr[String] = js.native
  def convertExpression(expression: Expression): String = js.native
  /* static members */
  @js.native
  object Converter extends js.Object {
    var EVENT_BEGIN: String = js.native
    var EVENT_CREATE_DECLARATION: String = js.native
    var EVENT_CREATE_PARAMETER: String = js.native
    var EVENT_CREATE_SIGNATURE: String = js.native
    var EVENT_CREATE_TYPE_PARAMETER: String = js.native
    var EVENT_END: String = js.native
    var EVENT_FILE_BEGIN: String = js.native
    var EVENT_FUNCTION_IMPLEMENTATION: String = js.native
    var EVENT_RESOLVE: String = js.native
    var EVENT_RESOLVE_BEGIN: String = js.native
    var EVENT_RESOLVE_END: String = js.native
  }
  
}

