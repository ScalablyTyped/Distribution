package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InferencePriority extends StObject
@JSImport("typescript", "InferencePriority")
@js.native
object InferencePriority extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InferencePriority with Double] = js.native
  
  @js.native
  sealed trait AlwaysStrict extends InferencePriority
  /* 512 */ val AlwaysStrict: typings.typescript.mod.InferencePriority.AlwaysStrict with Double = js.native
  
  @js.native
  sealed trait Circularity extends InferencePriority
  /* -1 */ val Circularity: typings.typescript.mod.InferencePriority.Circularity with Double = js.native
  
  @js.native
  sealed trait ContravariantConditional extends InferencePriority
  /* 32 */ val ContravariantConditional: typings.typescript.mod.InferencePriority.ContravariantConditional with Double = js.native
  
  @js.native
  sealed trait HomomorphicMappedType extends InferencePriority
  /* 4 */ val HomomorphicMappedType: typings.typescript.mod.InferencePriority.HomomorphicMappedType with Double = js.native
  
  @js.native
  sealed trait LiteralKeyof extends InferencePriority
  /* 128 */ val LiteralKeyof: typings.typescript.mod.InferencePriority.LiteralKeyof with Double = js.native
  
  @js.native
  sealed trait MappedTypeConstraint extends InferencePriority
  /* 16 */ val MappedTypeConstraint: typings.typescript.mod.InferencePriority.MappedTypeConstraint with Double = js.native
  
  @js.native
  sealed trait MaxValue extends InferencePriority
  /* 1024 */ val MaxValue: typings.typescript.mod.InferencePriority.MaxValue with Double = js.native
  
  @js.native
  sealed trait NakedTypeVariable extends InferencePriority
  /* 1 */ val NakedTypeVariable: typings.typescript.mod.InferencePriority.NakedTypeVariable with Double = js.native
  
  @js.native
  sealed trait NoConstraints extends InferencePriority
  /* 256 */ val NoConstraints: typings.typescript.mod.InferencePriority.NoConstraints with Double = js.native
  
  @js.native
  sealed trait PartialHomomorphicMappedType extends InferencePriority
  /* 8 */ val PartialHomomorphicMappedType: typings.typescript.mod.InferencePriority.PartialHomomorphicMappedType with Double = js.native
  
  @js.native
  sealed trait PriorityImpliesCombination extends InferencePriority
  /* 208 */ val PriorityImpliesCombination: typings.typescript.mod.InferencePriority.PriorityImpliesCombination with Double = js.native
  
  @js.native
  sealed trait ReturnType extends InferencePriority
  /* 64 */ val ReturnType: typings.typescript.mod.InferencePriority.ReturnType with Double = js.native
  
  @js.native
  sealed trait SpeculativeTuple extends InferencePriority
  /* 2 */ val SpeculativeTuple: typings.typescript.mod.InferencePriority.SpeculativeTuple with Double = js.native
}
