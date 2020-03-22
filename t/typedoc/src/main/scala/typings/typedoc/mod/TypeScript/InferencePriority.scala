package typings.typedoc.mod.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.InferencePriority")
@js.native
object InferencePriority extends js.Object {
  /* 256 */ val AlwaysStrict: typings.typescript.mod.InferencePriority.AlwaysStrict with Double = js.native
  /* -1 */ val Circularity: typings.typescript.mod.InferencePriority.Circularity with Double = js.native
  /* 16 */ val ContravariantConditional: typings.typescript.mod.InferencePriority.ContravariantConditional with Double = js.native
  /* 2 */ val HomomorphicMappedType: typings.typescript.mod.InferencePriority.HomomorphicMappedType with Double = js.native
  /* 64 */ val LiteralKeyof: typings.typescript.mod.InferencePriority.LiteralKeyof with Double = js.native
  /* 8 */ val MappedTypeConstraint: typings.typescript.mod.InferencePriority.MappedTypeConstraint with Double = js.native
  /* 512 */ val MaxValue: typings.typescript.mod.InferencePriority.MaxValue with Double = js.native
  /* 1 */ val NakedTypeVariable: typings.typescript.mod.InferencePriority.NakedTypeVariable with Double = js.native
  /* 128 */ val NoConstraints: typings.typescript.mod.InferencePriority.NoConstraints with Double = js.native
  /* 4 */ val PartialHomomorphicMappedType: typings.typescript.mod.InferencePriority.PartialHomomorphicMappedType with Double = js.native
  /* 104 */ val PriorityImpliesCombination: typings.typescript.mod.InferencePriority.PriorityImpliesCombination with Double = js.native
  /* 32 */ val ReturnType: typings.typescript.mod.InferencePriority.ReturnType with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.typescript.mod.InferencePriority with Double] = js.native
}

