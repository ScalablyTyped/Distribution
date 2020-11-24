package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenClass extends js.Object
@JSImport("typescript", "TokenClass")
@js.native
object TokenClass extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenClass with Double] = js.native
  
  @js.native
  sealed trait BigIntLiteral extends TokenClass
  /* 7 */ @js.native
  object BigIntLiteral
    extends TopLevel[typings.typescript.mod.TokenClass.BigIntLiteral with Double]
  
  @js.native
  sealed trait Comment extends TokenClass
  /* 3 */ @js.native
  object Comment extends TopLevel[Comment with Double]
  
  @js.native
  sealed trait Identifier extends TokenClass
  /* 5 */ @js.native
  object Identifier
    extends TopLevel[typings.typescript.mod.TokenClass.Identifier with Double]
  
  @js.native
  sealed trait Keyword extends TokenClass
  /* 1 */ @js.native
  object Keyword extends TopLevel[Keyword with Double]
  
  @js.native
  sealed trait NumberLiteral extends TokenClass
  /* 6 */ @js.native
  object NumberLiteral extends TopLevel[NumberLiteral with Double]
  
  @js.native
  sealed trait Operator extends TokenClass
  /* 2 */ @js.native
  object Operator extends TopLevel[Operator with Double]
  
  @js.native
  sealed trait Punctuation extends TokenClass
  /* 0 */ @js.native
  object Punctuation extends TopLevel[Punctuation with Double]
  
  @js.native
  sealed trait RegExpLiteral extends TokenClass
  /* 9 */ @js.native
  object RegExpLiteral extends TopLevel[RegExpLiteral with Double]
  
  @js.native
  sealed trait StringLiteral extends TokenClass
  /* 8 */ @js.native
  object StringLiteral
    extends TopLevel[typings.typescript.mod.TokenClass.StringLiteral with Double]
  
  @js.native
  sealed trait Whitespace extends TokenClass
  /* 4 */ @js.native
  object Whitespace extends TopLevel[Whitespace with Double]
}
