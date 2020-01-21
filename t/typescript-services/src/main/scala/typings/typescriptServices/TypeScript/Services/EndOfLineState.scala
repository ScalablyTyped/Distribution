package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndOfLineState extends js.Object

@JSGlobal("TypeScript.Services.EndOfLineState")
@js.native
object EndOfLineState extends js.Object {
  @js.native
  sealed trait InDoubleQuoteStringLiteral extends EndOfLineState
  
  @js.native
  sealed trait InMultiLineCommentTrivia extends EndOfLineState
  
  @js.native
  sealed trait InSingleQuoteStringLiteral extends EndOfLineState
  
  @js.native
  sealed trait Start extends EndOfLineState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLineState with Double] = js.native
  /* 3 */ @js.native
  object InDoubleQuoteStringLiteral extends TopLevel[InDoubleQuoteStringLiteral with Double]
  
  /* 1 */ @js.native
  object InMultiLineCommentTrivia extends TopLevel[InMultiLineCommentTrivia with Double]
  
  /* 2 */ @js.native
  object InSingleQuoteStringLiteral extends TopLevel[InSingleQuoteStringLiteral with Double]
  
  /* 0 */ @js.native
  object Start extends TopLevel[Start with Double]
  
}

