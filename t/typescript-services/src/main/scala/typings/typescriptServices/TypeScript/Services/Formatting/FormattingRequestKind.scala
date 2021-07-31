package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FormattingRequestKind extends StObject
@JSGlobal("TypeScript.Services.Formatting.FormattingRequestKind")
@js.native
object FormattingRequestKind extends StObject {
  
  @js.native
  sealed trait FormatDocument
    extends StObject
       with FormattingRequestKind
  
  @js.native
  sealed trait FormatOnClosingCurlyBrace
    extends StObject
       with FormattingRequestKind
  
  @js.native
  sealed trait FormatOnEnter
    extends StObject
       with FormattingRequestKind
  
  @js.native
  sealed trait FormatOnPaste
    extends StObject
       with FormattingRequestKind
  
  @js.native
  sealed trait FormatOnSemicolon
    extends StObject
       with FormattingRequestKind
  
  @js.native
  sealed trait FormatSelection
    extends StObject
       with FormattingRequestKind
}
