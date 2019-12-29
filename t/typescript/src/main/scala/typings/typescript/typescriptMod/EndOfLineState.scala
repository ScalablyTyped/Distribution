package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndOfLineState extends js.Object

@JSImport("typescript", "EndOfLineState")
@js.native
object EndOfLineState extends js.Object {
  @js.native
  sealed trait InDoubleQuoteStringLiteral extends EndOfLineState
  
  @js.native
  sealed trait InMultiLineCommentTrivia extends EndOfLineState
  
  @js.native
  sealed trait InSingleQuoteStringLiteral extends EndOfLineState
  
  @js.native
  sealed trait InTemplateHeadOrNoSubstitutionTemplate extends EndOfLineState
  
  @js.native
  sealed trait InTemplateMiddleOrTail extends EndOfLineState
  
  @js.native
  sealed trait InTemplateSubstitutionPosition extends EndOfLineState
  
  @js.native
  sealed trait None extends EndOfLineState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLineState with Double] = js.native
  /* 3 */ @js.native
  object InDoubleQuoteStringLiteral extends TopLevel[InDoubleQuoteStringLiteral with Double]
  
  /* 1 */ @js.native
  object InMultiLineCommentTrivia extends TopLevel[InMultiLineCommentTrivia with Double]
  
  /* 2 */ @js.native
  object InSingleQuoteStringLiteral extends TopLevel[InSingleQuoteStringLiteral with Double]
  
  /* 4 */ @js.native
  object InTemplateHeadOrNoSubstitutionTemplate extends TopLevel[InTemplateHeadOrNoSubstitutionTemplate with Double]
  
  /* 5 */ @js.native
  object InTemplateMiddleOrTail extends TopLevel[InTemplateMiddleOrTail with Double]
  
  /* 6 */ @js.native
  object InTemplateSubstitutionPosition extends TopLevel[InTemplateSubstitutionPosition with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

