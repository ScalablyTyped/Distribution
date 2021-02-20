package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OuterExpressionKinds extends StObject
@JSImport("typescript", "OuterExpressionKinds")
@js.native
object OuterExpressionKinds extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OuterExpressionKinds with Double] = js.native
  
  @js.native
  sealed trait All extends OuterExpressionKinds
  /* 15 */ val All: typings.typescript.mod.OuterExpressionKinds.All with Double = js.native
  
  @js.native
  sealed trait Assertions extends OuterExpressionKinds
  /* 6 */ val Assertions: typings.typescript.mod.OuterExpressionKinds.Assertions with Double = js.native
  
  @js.native
  sealed trait NonNullAssertions extends OuterExpressionKinds
  /* 4 */ val NonNullAssertions: typings.typescript.mod.OuterExpressionKinds.NonNullAssertions with Double = js.native
  
  @js.native
  sealed trait Parentheses extends OuterExpressionKinds
  /* 1 */ val Parentheses: typings.typescript.mod.OuterExpressionKinds.Parentheses with Double = js.native
  
  @js.native
  sealed trait PartiallyEmittedExpressions extends OuterExpressionKinds
  /* 8 */ val PartiallyEmittedExpressions: typings.typescript.mod.OuterExpressionKinds.PartiallyEmittedExpressions with Double = js.native
  
  @js.native
  sealed trait TypeAssertions extends OuterExpressionKinds
  /* 2 */ val TypeAssertions: typings.typescript.mod.OuterExpressionKinds.TypeAssertions with Double = js.native
}
