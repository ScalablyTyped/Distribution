package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenClass extends js.Object

@JSGlobal("TypeScript.Services.TokenClass")
@js.native
object TokenClass extends js.Object {
  @js.native
  sealed trait Comment
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass
  
  @js.native
  sealed trait Identifier
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass
  
  @js.native
  sealed trait Keyword
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass
  
  @js.native
  sealed trait NumberLiteral
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass
  
  @js.native
  sealed trait Operator
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass
  
  @js.native
  sealed trait Punctuation
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass
  
  @js.native
  sealed trait RegExpLiteral
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass
  
  @js.native
  sealed trait StringLiteral
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass
  
  @js.native
  sealed trait Whitespace
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass
  
  /* 3 */ val Comment: Comment with scala.Double = js.native
  /* 5 */ val Identifier: Identifier with scala.Double = js.native
  /* 1 */ val Keyword: Keyword with scala.Double = js.native
  /* 6 */ val NumberLiteral: NumberLiteral with scala.Double = js.native
  /* 2 */ val Operator: Operator with scala.Double = js.native
  /* 0 */ val Punctuation: Punctuation with scala.Double = js.native
  /* 8 */ val RegExpLiteral: RegExpLiteral with scala.Double = js.native
  /* 7 */ val StringLiteral: StringLiteral with scala.Double = js.native
  /* 4 */ val Whitespace: Whitespace with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass with scala.Double] = js.native
}

