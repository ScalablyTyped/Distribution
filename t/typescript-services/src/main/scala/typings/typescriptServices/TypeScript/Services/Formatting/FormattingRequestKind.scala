package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FormattingRequestKind extends StObject
@JSGlobal("TypeScript.Services.Formatting.FormattingRequestKind")
@js.native
object FormattingRequestKind extends StObject {
  
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
}
