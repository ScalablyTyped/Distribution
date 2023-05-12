package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InferencePriority extends StObject
@JSImport("typescript", "InferencePriority")
@js.native
object InferencePriority extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InferencePriority & Double] = js.native
  
  @js.native
  sealed trait AlwaysStrict
    extends StObject
       with InferencePriority
  /* 1024 */ val AlwaysStrict: typings.typescript.mod.InferencePriority.AlwaysStrict & Double = js.native
  
  @js.native
  sealed trait Circularity
    extends StObject
       with InferencePriority
  /* -1 */ val Circularity: typings.typescript.mod.InferencePriority.Circularity & Double = js.native
  
  @js.native
  sealed trait ContravariantConditional
    extends StObject
       with InferencePriority
  /* 64 */ val ContravariantConditional: typings.typescript.mod.InferencePriority.ContravariantConditional & Double = js.native
  
  @js.native
  sealed trait HomomorphicMappedType
    extends StObject
       with InferencePriority
  /* 8 */ val HomomorphicMappedType: typings.typescript.mod.InferencePriority.HomomorphicMappedType & Double = js.native
  
  @js.native
  sealed trait LiteralKeyof
    extends StObject
       with InferencePriority
  /* 256 */ val LiteralKeyof: typings.typescript.mod.InferencePriority.LiteralKeyof & Double = js.native
  
  @js.native
  sealed trait MappedTypeConstraint
    extends StObject
       with InferencePriority
  /* 32 */ val MappedTypeConstraint: typings.typescript.mod.InferencePriority.MappedTypeConstraint & Double = js.native
  
  @js.native
  sealed trait MaxValue
    extends StObject
       with InferencePriority
  /* 2048 */ val MaxValue: typings.typescript.mod.InferencePriority.MaxValue & Double = js.native
  
  @js.native
  sealed trait NakedTypeVariable
    extends StObject
       with InferencePriority
  /* 1 */ val NakedTypeVariable: typings.typescript.mod.InferencePriority.NakedTypeVariable & Double = js.native
  
  @js.native
  sealed trait NoConstraints
    extends StObject
       with InferencePriority
  /* 512 */ val NoConstraints: typings.typescript.mod.InferencePriority.NoConstraints & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with InferencePriority
  /* 0 */ val None: typings.typescript.mod.InferencePriority.None & Double = js.native
  
  @js.native
  sealed trait PartialHomomorphicMappedType
    extends StObject
       with InferencePriority
  /* 16 */ val PartialHomomorphicMappedType: typings.typescript.mod.InferencePriority.PartialHomomorphicMappedType & Double = js.native
  
  @js.native
  sealed trait PriorityImpliesCombination
    extends StObject
       with InferencePriority
  /* 416 */ val PriorityImpliesCombination: typings.typescript.mod.InferencePriority.PriorityImpliesCombination & Double = js.native
  
  @js.native
  sealed trait ReturnType
    extends StObject
       with InferencePriority
  /* 128 */ val ReturnType: typings.typescript.mod.InferencePriority.ReturnType & Double = js.native
  
  @js.native
  sealed trait SpeculativeTuple
    extends StObject
       with InferencePriority
  /* 2 */ val SpeculativeTuple: typings.typescript.mod.InferencePriority.SpeculativeTuple & Double = js.native
  
  @js.native
  sealed trait SubstituteSource
    extends StObject
       with InferencePriority
  /* 4 */ val SubstituteSource: typings.typescript.mod.InferencePriority.SubstituteSource & Double = js.native
}
