package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndOfLineState extends js.Object

@JSImport("typescript/ts", "EndOfLineState")
@js.native
object EndOfLineState extends js.Object {
  @js.native
  sealed trait InDoubleQuoteStringLiteral
    extends typescriptLib.typescriptMod.tsNs.EndOfLineState
  
  @js.native
  sealed trait InMultiLineCommentTrivia
    extends typescriptLib.typescriptMod.tsNs.EndOfLineState
  
  @js.native
  sealed trait InSingleQuoteStringLiteral
    extends typescriptLib.typescriptMod.tsNs.EndOfLineState
  
  @js.native
  sealed trait InTemplateHeadOrNoSubstitutionTemplate
    extends typescriptLib.typescriptMod.tsNs.EndOfLineState
  
  @js.native
  sealed trait InTemplateMiddleOrTail
    extends typescriptLib.typescriptMod.tsNs.EndOfLineState
  
  @js.native
  sealed trait InTemplateSubstitutionPosition
    extends typescriptLib.typescriptMod.tsNs.EndOfLineState
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.tsNs.EndOfLineState
  
}

