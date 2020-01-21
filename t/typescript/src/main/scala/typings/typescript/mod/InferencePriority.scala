package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InferencePriority extends js.Object

@JSImport("typescript", "InferencePriority")
@js.native
object InferencePriority extends js.Object {
  @js.native
  sealed trait AlwaysStrict extends InferencePriority
  
  @js.native
  sealed trait Circularity extends InferencePriority
  
  @js.native
  sealed trait HomomorphicMappedType extends InferencePriority
  
  @js.native
  sealed trait LiteralKeyof extends InferencePriority
  
  @js.native
  sealed trait MappedTypeConstraint extends InferencePriority
  
  @js.native
  sealed trait MaxValue extends InferencePriority
  
  @js.native
  sealed trait NakedTypeVariable extends InferencePriority
  
  @js.native
  sealed trait NoConstraints extends InferencePriority
  
  @js.native
  sealed trait PartialHomomorphicMappedType extends InferencePriority
  
  @js.native
  sealed trait PriorityImpliesCombination extends InferencePriority
  
  @js.native
  sealed trait ReturnType extends InferencePriority
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InferencePriority with Double] = js.native
  /* 128 */ @js.native
  object AlwaysStrict extends TopLevel[AlwaysStrict with Double]
  
  /* -1 */ @js.native
  object Circularity extends TopLevel[Circularity with Double]
  
  /* 2 */ @js.native
  object HomomorphicMappedType extends TopLevel[HomomorphicMappedType with Double]
  
  /* 32 */ @js.native
  object LiteralKeyof extends TopLevel[LiteralKeyof with Double]
  
  /* 8 */ @js.native
  object MappedTypeConstraint extends TopLevel[MappedTypeConstraint with Double]
  
  /* 256 */ @js.native
  object MaxValue extends TopLevel[MaxValue with Double]
  
  /* 1 */ @js.native
  object NakedTypeVariable extends TopLevel[NakedTypeVariable with Double]
  
  /* 64 */ @js.native
  object NoConstraints extends TopLevel[NoConstraints with Double]
  
  /* 4 */ @js.native
  object PartialHomomorphicMappedType extends TopLevel[PartialHomomorphicMappedType with Double]
  
  /* 56 */ @js.native
  object PriorityImpliesCombination extends TopLevel[PriorityImpliesCombination with Double]
  
  /* 16 */ @js.native
  object ReturnType extends TopLevel[ReturnType with Double]
  
}

