package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InferencePriority extends js.Object
@JSImport("typescript", "InferencePriority")
@js.native
object InferencePriority extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InferencePriority with Double] = js.native
  
  @js.native
  sealed trait AlwaysStrict extends InferencePriority
  /* 512 */ @js.native
  object AlwaysStrict extends TopLevel[AlwaysStrict with Double]
  
  @js.native
  sealed trait Circularity extends InferencePriority
  /* -1 */ @js.native
  object Circularity extends TopLevel[Circularity with Double]
  
  @js.native
  sealed trait ContravariantConditional extends InferencePriority
  /* 32 */ @js.native
  object ContravariantConditional extends TopLevel[ContravariantConditional with Double]
  
  @js.native
  sealed trait HomomorphicMappedType extends InferencePriority
  /* 4 */ @js.native
  object HomomorphicMappedType extends TopLevel[HomomorphicMappedType with Double]
  
  @js.native
  sealed trait LiteralKeyof extends InferencePriority
  /* 128 */ @js.native
  object LiteralKeyof extends TopLevel[LiteralKeyof with Double]
  
  @js.native
  sealed trait MappedTypeConstraint extends InferencePriority
  /* 16 */ @js.native
  object MappedTypeConstraint extends TopLevel[MappedTypeConstraint with Double]
  
  @js.native
  sealed trait MaxValue extends InferencePriority
  /* 1024 */ @js.native
  object MaxValue extends TopLevel[MaxValue with Double]
  
  @js.native
  sealed trait NakedTypeVariable extends InferencePriority
  /* 1 */ @js.native
  object NakedTypeVariable extends TopLevel[NakedTypeVariable with Double]
  
  @js.native
  sealed trait NoConstraints extends InferencePriority
  /* 256 */ @js.native
  object NoConstraints extends TopLevel[NoConstraints with Double]
  
  @js.native
  sealed trait PartialHomomorphicMappedType extends InferencePriority
  /* 8 */ @js.native
  object PartialHomomorphicMappedType extends TopLevel[PartialHomomorphicMappedType with Double]
  
  @js.native
  sealed trait PriorityImpliesCombination extends InferencePriority
  /* 208 */ @js.native
  object PriorityImpliesCombination extends TopLevel[PriorityImpliesCombination with Double]
  
  @js.native
  sealed trait ReturnType extends InferencePriority
  /* 64 */ @js.native
  object ReturnType extends TopLevel[ReturnType with Double]
  
  @js.native
  sealed trait SpeculativeTuple extends InferencePriority
  /* 2 */ @js.native
  object SpeculativeTuple extends TopLevel[SpeculativeTuple with Double]
}
