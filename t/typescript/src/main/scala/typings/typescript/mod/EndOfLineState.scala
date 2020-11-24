package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EndOfLineState extends js.Object
@JSImport("typescript", "EndOfLineState")
@js.native
object EndOfLineState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLineState with Double] = js.native
  
  @js.native
  sealed trait InDoubleQuoteStringLiteral extends EndOfLineState
  /* 3 */ @js.native
  object InDoubleQuoteStringLiteral extends TopLevel[InDoubleQuoteStringLiteral with Double]
  
  @js.native
  sealed trait InMultiLineCommentTrivia extends EndOfLineState
  /* 1 */ @js.native
  object InMultiLineCommentTrivia extends TopLevel[InMultiLineCommentTrivia with Double]
  
  @js.native
  sealed trait InSingleQuoteStringLiteral extends EndOfLineState
  /* 2 */ @js.native
  object InSingleQuoteStringLiteral extends TopLevel[InSingleQuoteStringLiteral with Double]
  
  @js.native
  sealed trait InTemplateHeadOrNoSubstitutionTemplate extends EndOfLineState
  /* 4 */ @js.native
  object InTemplateHeadOrNoSubstitutionTemplate extends TopLevel[InTemplateHeadOrNoSubstitutionTemplate with Double]
  
  @js.native
  sealed trait InTemplateMiddleOrTail extends EndOfLineState
  /* 5 */ @js.native
  object InTemplateMiddleOrTail extends TopLevel[InTemplateMiddleOrTail with Double]
  
  @js.native
  sealed trait InTemplateSubstitutionPosition extends EndOfLineState
  /* 6 */ @js.native
  object InTemplateSubstitutionPosition extends TopLevel[InTemplateSubstitutionPosition with Double]
  
  @js.native
  sealed trait None extends EndOfLineState
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
