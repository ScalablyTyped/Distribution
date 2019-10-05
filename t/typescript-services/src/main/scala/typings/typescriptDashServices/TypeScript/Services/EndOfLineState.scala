package typings.typescriptDashServices.TypeScript.Services

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
  
  /* 3 */ val InDoubleQuoteStringLiteral: typings.typescriptDashServices.TypeScript.Services.EndOfLineState.InDoubleQuoteStringLiteral with Double = js.native
  /* 1 */ val InMultiLineCommentTrivia: typings.typescriptDashServices.TypeScript.Services.EndOfLineState.InMultiLineCommentTrivia with Double = js.native
  /* 2 */ val InSingleQuoteStringLiteral: typings.typescriptDashServices.TypeScript.Services.EndOfLineState.InSingleQuoteStringLiteral with Double = js.native
  /* 0 */ val Start: typings.typescriptDashServices.TypeScript.Services.EndOfLineState.Start with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLineState with Double] = js.native
}

