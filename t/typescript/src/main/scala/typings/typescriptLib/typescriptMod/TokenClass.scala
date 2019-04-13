package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenClass extends js.Object

@JSImport("typescript", "TokenClass")
@js.native
object TokenClass extends js.Object {
  @js.native
  sealed trait BigIntLiteral
    extends typescriptLib.typescriptMod.TokenClass
  
  @js.native
  sealed trait Comment
    extends typescriptLib.typescriptMod.TokenClass
  
  @js.native
  sealed trait Identifier
    extends typescriptLib.typescriptMod.TokenClass
  
  @js.native
  sealed trait Keyword
    extends typescriptLib.typescriptMod.TokenClass
  
  @js.native
  sealed trait NumberLiteral
    extends typescriptLib.typescriptMod.TokenClass
  
  @js.native
  sealed trait Operator
    extends typescriptLib.typescriptMod.TokenClass
  
  @js.native
  sealed trait Punctuation
    extends typescriptLib.typescriptMod.TokenClass
  
  @js.native
  sealed trait RegExpLiteral
    extends typescriptLib.typescriptMod.TokenClass
  
  @js.native
  sealed trait StringLiteral
    extends typescriptLib.typescriptMod.TokenClass
  
  @js.native
  sealed trait Whitespace
    extends typescriptLib.typescriptMod.TokenClass
  
  /* 7 */ val BigIntLiteral: BigIntLiteral with scala.Double = js.native
  /* 3 */ val Comment: Comment with scala.Double = js.native
  /* 5 */ val Identifier: Identifier with scala.Double = js.native
  /* 1 */ val Keyword: Keyword with scala.Double = js.native
  /* 6 */ val NumberLiteral: NumberLiteral with scala.Double = js.native
  /* 2 */ val Operator: Operator with scala.Double = js.native
  /* 0 */ val Punctuation: Punctuation with scala.Double = js.native
  /* 9 */ val RegExpLiteral: RegExpLiteral with scala.Double = js.native
  /* 8 */ val StringLiteral: StringLiteral with scala.Double = js.native
  /* 4 */ val Whitespace: Whitespace with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.TokenClass with scala.Double] = js.native
}

