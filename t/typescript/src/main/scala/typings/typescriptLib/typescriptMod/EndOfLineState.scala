package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndOfLineState extends js.Object

@JSImport("typescript", "EndOfLineState")
@js.native
object EndOfLineState extends js.Object {
  @js.native
  sealed trait InDoubleQuoteStringLiteral
    extends typescriptLib.typescriptMod.EndOfLineState
  
  @js.native
  sealed trait InMultiLineCommentTrivia
    extends typescriptLib.typescriptMod.EndOfLineState
  
  @js.native
  sealed trait InSingleQuoteStringLiteral
    extends typescriptLib.typescriptMod.EndOfLineState
  
  @js.native
  sealed trait InTemplateHeadOrNoSubstitutionTemplate
    extends typescriptLib.typescriptMod.EndOfLineState
  
  @js.native
  sealed trait InTemplateMiddleOrTail
    extends typescriptLib.typescriptMod.EndOfLineState
  
  @js.native
  sealed trait InTemplateSubstitutionPosition
    extends typescriptLib.typescriptMod.EndOfLineState
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.EndOfLineState
  
  /* 3 */ val InDoubleQuoteStringLiteral: InDoubleQuoteStringLiteral with scala.Double = js.native
  /* 1 */ val InMultiLineCommentTrivia: InMultiLineCommentTrivia with scala.Double = js.native
  /* 2 */ val InSingleQuoteStringLiteral: InSingleQuoteStringLiteral with scala.Double = js.native
  /* 4 */ val InTemplateHeadOrNoSubstitutionTemplate: InTemplateHeadOrNoSubstitutionTemplate with scala.Double = js.native
  /* 5 */ val InTemplateMiddleOrTail: InTemplateMiddleOrTail with scala.Double = js.native
  /* 6 */ val InTemplateSubstitutionPosition: InTemplateSubstitutionPosition with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.EndOfLineState with scala.Double] = js.native
}

