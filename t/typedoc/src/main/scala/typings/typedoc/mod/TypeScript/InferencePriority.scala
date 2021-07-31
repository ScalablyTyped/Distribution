package typings.typedoc.mod.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.InferencePriority")
@js.native
object InferencePriority extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.typescript.mod.InferencePriority & Double] = js.native
  
  /* 512 */ val AlwaysStrict: typings.typescript.mod.InferencePriority.AlwaysStrict & Double = js.native
  
  /* -1 */ val Circularity: typings.typescript.mod.InferencePriority.Circularity & Double = js.native
  
  /* 32 */ val ContravariantConditional: typings.typescript.mod.InferencePriority.ContravariantConditional & Double = js.native
  
  /* 4 */ val HomomorphicMappedType: typings.typescript.mod.InferencePriority.HomomorphicMappedType & Double = js.native
  
  /* 128 */ val LiteralKeyof: typings.typescript.mod.InferencePriority.LiteralKeyof & Double = js.native
  
  /* 16 */ val MappedTypeConstraint: typings.typescript.mod.InferencePriority.MappedTypeConstraint & Double = js.native
  
  /* 1024 */ val MaxValue: typings.typescript.mod.InferencePriority.MaxValue & Double = js.native
  
  /* 1 */ val NakedTypeVariable: typings.typescript.mod.InferencePriority.NakedTypeVariable & Double = js.native
  
  /* 256 */ val NoConstraints: typings.typescript.mod.InferencePriority.NoConstraints & Double = js.native
  
  /* 8 */ val PartialHomomorphicMappedType: typings.typescript.mod.InferencePriority.PartialHomomorphicMappedType & Double = js.native
  
  /* 208 */ val PriorityImpliesCombination: typings.typescript.mod.InferencePriority.PriorityImpliesCombination & Double = js.native
  
  /* 64 */ val ReturnType: typings.typescript.mod.InferencePriority.ReturnType & Double = js.native
  
  /* 2 */ val SpeculativeTuple: typings.typescript.mod.InferencePriority.SpeculativeTuple & Double = js.native
}
