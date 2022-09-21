package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OuterExpressionKinds extends StObject
@JSImport("typescript", "OuterExpressionKinds")
@js.native
object OuterExpressionKinds extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OuterExpressionKinds & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with OuterExpressionKinds
  /* 15 */ val All: typings.typescript.mod.OuterExpressionKinds.All & Double = js.native
  
  @js.native
  sealed trait Assertions
    extends StObject
       with OuterExpressionKinds
  /* 6 */ val Assertions: typings.typescript.mod.OuterExpressionKinds.Assertions & Double = js.native
  
  @js.native
  sealed trait ExcludeJSDocTypeAssertion
    extends StObject
       with OuterExpressionKinds
  /* 16 */ val ExcludeJSDocTypeAssertion: typings.typescript.mod.OuterExpressionKinds.ExcludeJSDocTypeAssertion & Double = js.native
  
  @js.native
  sealed trait NonNullAssertions
    extends StObject
       with OuterExpressionKinds
  /* 4 */ val NonNullAssertions: typings.typescript.mod.OuterExpressionKinds.NonNullAssertions & Double = js.native
  
  @js.native
  sealed trait Parentheses
    extends StObject
       with OuterExpressionKinds
  /* 1 */ val Parentheses: typings.typescript.mod.OuterExpressionKinds.Parentheses & Double = js.native
  
  @js.native
  sealed trait PartiallyEmittedExpressions
    extends StObject
       with OuterExpressionKinds
  /* 8 */ val PartiallyEmittedExpressions: typings.typescript.mod.OuterExpressionKinds.PartiallyEmittedExpressions & Double = js.native
  
  @js.native
  sealed trait TypeAssertions
    extends StObject
       with OuterExpressionKinds
  /* 2 */ val TypeAssertions: typings.typescript.mod.OuterExpressionKinds.TypeAssertions & Double = js.native
}
