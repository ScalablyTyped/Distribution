package typings.typedoc

import typings.typescript.mod.EnumMember
import typings.typescript.mod.Expression
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.Program
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter", JSImport.Namespace)
@js.native
object converterMod extends js.Object {
  
  def convertDefaultValue(node: EnumMember): js.UndefOr[String] = js.native
  def convertDefaultValue(node: ParameterDeclaration): js.UndefOr[String] = js.native
  def convertDefaultValue(node: VariableDeclaration): js.UndefOr[String] = js.native
  
  def convertExpression(expression: Expression): String = js.native
  
  @js.native
  class Context protected ()
    extends typings.typedoc.contextMod.Context {
    def this(
      converter: typings.typedoc.converterConverterMod.Converter,
      fileNames: js.Array[String],
      checker: TypeChecker,
      program: Program
    ) = this()
  }
  
  @js.native
  class Converter ()
    extends typings.typedoc.converterConverterMod.Converter
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
