package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenClass extends StObject
@JSImport("typescript", "TokenClass")
@js.native
object TokenClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenClass with Double] = js.native
  
  @js.native
  sealed trait BigIntLiteral extends TokenClass
  /* 7 */ val BigIntLiteral: typings.typescript.mod.TokenClass.BigIntLiteral with Double = js.native
  
  @js.native
  sealed trait Comment extends TokenClass
  /* 3 */ val Comment: typings.typescript.mod.TokenClass.Comment with Double = js.native
  
  @js.native
  sealed trait Identifier extends TokenClass
  /* 5 */ val Identifier: typings.typescript.mod.TokenClass.Identifier with Double = js.native
  
  @js.native
  sealed trait Keyword extends TokenClass
  /* 1 */ val Keyword: typings.typescript.mod.TokenClass.Keyword with Double = js.native
  
  @js.native
  sealed trait NumberLiteral extends TokenClass
  /* 6 */ val NumberLiteral: typings.typescript.mod.TokenClass.NumberLiteral with Double = js.native
  
  @js.native
  sealed trait Operator extends TokenClass
  /* 2 */ val Operator: typings.typescript.mod.TokenClass.Operator with Double = js.native
  
  @js.native
  sealed trait Punctuation extends TokenClass
  /* 0 */ val Punctuation: typings.typescript.mod.TokenClass.Punctuation with Double = js.native
  
  @js.native
  sealed trait RegExpLiteral extends TokenClass
  /* 9 */ val RegExpLiteral: typings.typescript.mod.TokenClass.RegExpLiteral with Double = js.native
  
  @js.native
  sealed trait StringLiteral extends TokenClass
  /* 8 */ val StringLiteral: typings.typescript.mod.TokenClass.StringLiteral with Double = js.native
  
  @js.native
  sealed trait Whitespace extends TokenClass
  /* 4 */ val Whitespace: typings.typescript.mod.TokenClass.Whitespace with Double = js.native
}
