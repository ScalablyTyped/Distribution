package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxConstants with Double] = js.native
  /* -2147483648 */ @js.native
  object IsVariableWidthKeyword extends TopLevel[IsVariableWidthKeyword with Double]
  
  /* 1 */ @js.native
  object NodeDataComputed extends TopLevel[NodeDataComputed with Double]
  
  /* 3 */ @js.native
  object NodeFullWidthShift extends TopLevel[NodeFullWidthShift with Double]
  
  /* 2 */ @js.native
  object NodeIncrementallyUnusableMask extends TopLevel[NodeIncrementallyUnusableMask with Double]
  
  /* 4 */ @js.native
  object NodeParsedInStrictModeMask extends TopLevel[NodeParsedInStrictModeMask with Double]
  
  /* 2 */ @js.native
  object TriviaCommentMask extends TopLevel[TriviaCommentMask with Double]
  
  /* 2 */ @js.native
  object TriviaFullWidthShift extends TopLevel[TriviaFullWidthShift with Double]
  
  /* 1 */ @js.native
  object TriviaNewLineMask extends TopLevel[TriviaNewLineMask with Double]
  
}

