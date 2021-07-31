package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenClass extends StObject
@JSGlobal("TypeScript.Services.TokenClass")
@js.native
object TokenClass extends StObject {
  
  @js.native
  sealed trait Comment
    extends StObject
       with TokenClass
  
  @js.native
  sealed trait Identifier
    extends StObject
       with TokenClass
  
  @js.native
  sealed trait Keyword
    extends StObject
       with TokenClass
  
  @js.native
  sealed trait NumberLiteral
    extends StObject
       with TokenClass
  
  @js.native
  sealed trait Operator
    extends StObject
       with TokenClass
  
  @js.native
  sealed trait Punctuation
    extends StObject
       with TokenClass
  
  @js.native
  sealed trait RegExpLiteral
    extends StObject
       with TokenClass
  
  @js.native
  sealed trait StringLiteral
    extends StObject
       with TokenClass
  
  @js.native
  sealed trait Whitespace
    extends StObject
       with TokenClass
}
