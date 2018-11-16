package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormattingRequestKind extends js.Object

@JSGlobal("TypeScript.Services.Formatting.FormattingRequestKind")
@js.native
object FormattingRequestKind extends js.Object {
  @js.native
  sealed trait FormatDocument
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind
  
  @js.native
  sealed trait FormatOnClosingCurlyBrace
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind
  
  @js.native
  sealed trait FormatOnEnter
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind
  
  @js.native
  sealed trait FormatOnPaste
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind
  
  @js.native
  sealed trait FormatOnSemicolon
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind
  
  @js.native
  sealed trait FormatSelection
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind
  
  /* 0 */ val FormatDocument: FormatDocument with scala.Double = js.native
  /* 4 */ val FormatOnClosingCurlyBrace: FormatOnClosingCurlyBrace with scala.Double = js.native
  /* 2 */ val FormatOnEnter: FormatOnEnter with scala.Double = js.native
  /* 5 */ val FormatOnPaste: FormatOnPaste with scala.Double = js.native
  /* 3 */ val FormatOnSemicolon: FormatOnSemicolon with scala.Double = js.native
  /* 1 */ val FormatSelection: FormatSelection with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind with scala.Double
  ] = js.native
}

