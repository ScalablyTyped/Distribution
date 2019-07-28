package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormattingRequestKind extends js.Object

@JSGlobal("TypeScript.Services.Formatting.FormattingRequestKind")
@js.native
object FormattingRequestKind extends js.Object {
  @js.native
  sealed trait FormatDocument extends FormattingRequestKind
  
  @js.native
  sealed trait FormatOnClosingCurlyBrace extends FormattingRequestKind
  
  @js.native
  sealed trait FormatOnEnter extends FormattingRequestKind
  
  @js.native
  sealed trait FormatOnPaste extends FormattingRequestKind
  
  @js.native
  sealed trait FormatOnSemicolon extends FormattingRequestKind
  
  @js.native
  sealed trait FormatSelection extends FormattingRequestKind
  
  /* 0 */ val FormatDocument: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatDocument with Double = js.native
  /* 4 */ val FormatOnClosingCurlyBrace: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatOnClosingCurlyBrace with Double = js.native
  /* 2 */ val FormatOnEnter: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatOnEnter with Double = js.native
  /* 5 */ val FormatOnPaste: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatOnPaste with Double = js.native
  /* 3 */ val FormatOnSemicolon: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatOnSemicolon with Double = js.native
  /* 1 */ val FormatSelection: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatSelection with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormattingRequestKind with Double] = js.native
}

