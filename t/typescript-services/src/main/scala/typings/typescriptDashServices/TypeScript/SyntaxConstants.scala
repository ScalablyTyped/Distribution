package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyntaxConstants extends js.Object

@JSGlobal("TypeScript.SyntaxConstants")
@js.native
object SyntaxConstants extends js.Object {
  @js.native
  sealed trait IsVariableWidthKeyword extends SyntaxConstants
  
  @js.native
  sealed trait NodeDataComputed extends SyntaxConstants
  
  @js.native
  sealed trait NodeFullWidthShift extends SyntaxConstants
  
  @js.native
  sealed trait NodeIncrementallyUnusableMask extends SyntaxConstants
  
  @js.native
  sealed trait NodeParsedInStrictModeMask extends SyntaxConstants
  
  @js.native
  sealed trait TriviaCommentMask extends SyntaxConstants
  
  @js.native
  sealed trait TriviaFullWidthShift extends SyntaxConstants
  
  @js.native
  sealed trait TriviaNewLineMask extends SyntaxConstants
  
  /* -2147483648 */ val IsVariableWidthKeyword: typings.typescriptDashServices.TypeScript.SyntaxConstants.IsVariableWidthKeyword with Double = js.native
  /* 1 */ val NodeDataComputed: typings.typescriptDashServices.TypeScript.SyntaxConstants.NodeDataComputed with Double = js.native
  /* 3 */ val NodeFullWidthShift: typings.typescriptDashServices.TypeScript.SyntaxConstants.NodeFullWidthShift with Double = js.native
  /* 2 */ val NodeIncrementallyUnusableMask: typings.typescriptDashServices.TypeScript.SyntaxConstants.NodeIncrementallyUnusableMask with Double = js.native
  /* 4 */ val NodeParsedInStrictModeMask: typings.typescriptDashServices.TypeScript.SyntaxConstants.NodeParsedInStrictModeMask with Double = js.native
  /* 2 */ val TriviaCommentMask: typings.typescriptDashServices.TypeScript.SyntaxConstants.TriviaCommentMask with Double = js.native
  /* 2 */ val TriviaFullWidthShift: typings.typescriptDashServices.TypeScript.SyntaxConstants.TriviaFullWidthShift with Double = js.native
  /* 1 */ val TriviaNewLineMask: typings.typescriptDashServices.TypeScript.SyntaxConstants.TriviaNewLineMask with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxConstants with Double] = js.native
}

