package typings.typescriptDashServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenClass extends js.Object

@JSGlobal("TypeScript.Services.TokenClass")
@js.native
object TokenClass extends js.Object {
  @js.native
  sealed trait Comment extends TokenClass
  
  @js.native
  sealed trait Identifier extends TokenClass
  
  @js.native
  sealed trait Keyword extends TokenClass
  
  @js.native
  sealed trait NumberLiteral extends TokenClass
  
  @js.native
  sealed trait Operator extends TokenClass
  
  @js.native
  sealed trait Punctuation extends TokenClass
  
  @js.native
  sealed trait RegExpLiteral extends TokenClass
  
  @js.native
  sealed trait StringLiteral extends TokenClass
  
  @js.native
  sealed trait Whitespace extends TokenClass
  
  /* 3 */ val Comment: typings.typescriptDashServices.TypeScript.Services.TokenClass.Comment with Double = js.native
  /* 5 */ val Identifier: typings.typescriptDashServices.TypeScript.Services.TokenClass.Identifier with Double = js.native
  /* 1 */ val Keyword: typings.typescriptDashServices.TypeScript.Services.TokenClass.Keyword with Double = js.native
  /* 6 */ val NumberLiteral: typings.typescriptDashServices.TypeScript.Services.TokenClass.NumberLiteral with Double = js.native
  /* 2 */ val Operator: typings.typescriptDashServices.TypeScript.Services.TokenClass.Operator with Double = js.native
  /* 0 */ val Punctuation: typings.typescriptDashServices.TypeScript.Services.TokenClass.Punctuation with Double = js.native
  /* 8 */ val RegExpLiteral: typings.typescriptDashServices.TypeScript.Services.TokenClass.RegExpLiteral with Double = js.native
  /* 7 */ val StringLiteral: typings.typescriptDashServices.TypeScript.Services.TokenClass.StringLiteral with Double = js.native
  /* 4 */ val Whitespace: typings.typescriptDashServices.TypeScript.Services.TokenClass.Whitespace with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenClass with Double] = js.native
}

