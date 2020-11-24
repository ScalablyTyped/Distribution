package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OuterExpressionKinds extends js.Object
@JSImport("typescript", "OuterExpressionKinds")
@js.native
object OuterExpressionKinds extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OuterExpressionKinds with Double] = js.native
  
  @js.native
  sealed trait All extends OuterExpressionKinds
  /* 15 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait Assertions extends OuterExpressionKinds
  /* 6 */ @js.native
  object Assertions extends TopLevel[Assertions with Double]
  
  @js.native
  sealed trait NonNullAssertions extends OuterExpressionKinds
  /* 4 */ @js.native
  object NonNullAssertions extends TopLevel[NonNullAssertions with Double]
  
  @js.native
  sealed trait Parentheses extends OuterExpressionKinds
  /* 1 */ @js.native
  object Parentheses extends TopLevel[Parentheses with Double]
  
  @js.native
  sealed trait PartiallyEmittedExpressions extends OuterExpressionKinds
  /* 8 */ @js.native
  object PartiallyEmittedExpressions extends TopLevel[PartiallyEmittedExpressions with Double]
  
  @js.native
  sealed trait TypeAssertions extends OuterExpressionKinds
  /* 2 */ @js.native
  object TypeAssertions extends TopLevel[TypeAssertions with Double]
}
