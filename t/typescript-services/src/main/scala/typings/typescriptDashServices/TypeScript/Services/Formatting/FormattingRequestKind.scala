package typings.typescriptDashServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormattingRequestKind with Double] = js.native
  /* 0 */ @js.native
  object FormatDocument extends TopLevel[FormatDocument with Double]
  
  /* 4 */ @js.native
  object FormatOnClosingCurlyBrace extends TopLevel[FormatOnClosingCurlyBrace with Double]
  
  /* 2 */ @js.native
  object FormatOnEnter extends TopLevel[FormatOnEnter with Double]
  
  /* 5 */ @js.native
  object FormatOnPaste extends TopLevel[FormatOnPaste with Double]
  
  /* 3 */ @js.native
  object FormatOnSemicolon extends TopLevel[FormatOnSemicolon with Double]
  
  /* 1 */ @js.native
  object FormatSelection extends TopLevel[FormatSelection with Double]
  
}

