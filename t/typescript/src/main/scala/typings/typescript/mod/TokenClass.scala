package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenClass extends StObject
@JSImport("typescript", "TokenClass")
@js.native
object TokenClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenClass & Double] = js.native
  
  @js.native
  sealed trait BigIntLiteral
    extends StObject
       with TokenClass
  /* 7 */ val BigIntLiteral: typings.typescript.mod.TokenClass.BigIntLiteral & Double = js.native
  
  @js.native
  sealed trait Comment
    extends StObject
       with TokenClass
  /* 3 */ val Comment: typings.typescript.mod.TokenClass.Comment & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with TokenClass
  /* 5 */ val Identifier: typings.typescript.mod.TokenClass.Identifier & Double = js.native
  
  @js.native
  sealed trait Keyword
    extends StObject
       with TokenClass
  /* 1 */ val Keyword: typings.typescript.mod.TokenClass.Keyword & Double = js.native
  
  @js.native
  sealed trait NumberLiteral
    extends StObject
       with TokenClass
  /* 6 */ val NumberLiteral: typings.typescript.mod.TokenClass.NumberLiteral & Double = js.native
  
  @js.native
  sealed trait Operator
    extends StObject
       with TokenClass
  /* 2 */ val Operator: typings.typescript.mod.TokenClass.Operator & Double = js.native
  
  @js.native
  sealed trait Punctuation
    extends StObject
       with TokenClass
  /* 0 */ val Punctuation: typings.typescript.mod.TokenClass.Punctuation & Double = js.native
  
  @js.native
  sealed trait RegExpLiteral
    extends StObject
       with TokenClass
  /* 9 */ val RegExpLiteral: typings.typescript.mod.TokenClass.RegExpLiteral & Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends StObject
       with TokenClass
  /* 8 */ val StringLiteral: typings.typescript.mod.TokenClass.StringLiteral & Double = js.native
  
  @js.native
  sealed trait Whitespace
    extends StObject
       with TokenClass
  /* 4 */ val Whitespace: typings.typescript.mod.TokenClass.Whitespace & Double = js.native
}
