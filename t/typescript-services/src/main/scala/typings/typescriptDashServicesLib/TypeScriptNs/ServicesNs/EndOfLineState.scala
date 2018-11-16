package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndOfLineState extends js.Object

@JSGlobal("TypeScript.Services.EndOfLineState")
@js.native
object EndOfLineState extends js.Object {
  @js.native
  sealed trait InDoubleQuoteStringLiteral
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.EndOfLineState
  
  @js.native
  sealed trait InMultiLineCommentTrivia
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.EndOfLineState
  
  @js.native
  sealed trait InSingleQuoteStringLiteral
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.EndOfLineState
  
  @js.native
  sealed trait Start
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.EndOfLineState
  
  /* 3 */ val InDoubleQuoteStringLiteral: InDoubleQuoteStringLiteral with scala.Double = js.native
  /* 1 */ val InMultiLineCommentTrivia: InMultiLineCommentTrivia with scala.Double = js.native
  /* 2 */ val InSingleQuoteStringLiteral: InSingleQuoteStringLiteral with scala.Double = js.native
  /* 0 */ val Start: Start with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    typescriptDashServicesLib.TypeScriptNs.ServicesNs.EndOfLineState with scala.Double
  ] = js.native
}

