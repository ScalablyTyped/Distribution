package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeFlags extends js.Object

@JSImport("typescript", "NodeFlags")
@js.native
object NodeFlags extends js.Object {
  @js.native
  sealed trait AwaitContext extends NodeFlags
  
  @js.native
  sealed trait BlockScoped extends NodeFlags
  
  @js.native
  sealed trait Const extends NodeFlags
  
  @js.native
  sealed trait ContainsThis extends NodeFlags
  
  @js.native
  sealed trait ContextFlags extends NodeFlags
  
  @js.native
  sealed trait DecoratorContext extends NodeFlags
  
  @js.native
  sealed trait DisallowInContext extends NodeFlags
  
  @js.native
  sealed trait ExportContext extends NodeFlags
  
  @js.native
  sealed trait GlobalAugmentation extends NodeFlags
  
  @js.native
  sealed trait HasAggregatedChildData extends NodeFlags
  
  @js.native
  sealed trait HasAsyncFunctions extends NodeFlags
  
  @js.native
  sealed trait HasExplicitReturn extends NodeFlags
  
  @js.native
  sealed trait HasImplicitReturn extends NodeFlags
  
  @js.native
  sealed trait JSDoc extends NodeFlags
  
  @js.native
  sealed trait JavaScriptFile extends NodeFlags
  
  @js.native
  sealed trait JsonFile extends NodeFlags
  
  @js.native
  sealed trait Let extends NodeFlags
  
  @js.native
  sealed trait Namespace extends NodeFlags
  
  @js.native
  sealed trait NestedNamespace extends NodeFlags
  
  @js.native
  sealed trait None extends NodeFlags
  
  @js.native
  sealed trait ReachabilityAndEmitFlags extends NodeFlags
  
  @js.native
  sealed trait ReachabilityCheckFlags extends NodeFlags
  
  @js.native
  sealed trait Synthesized extends NodeFlags
  
  @js.native
  sealed trait ThisNodeHasError extends NodeFlags
  
  @js.native
  sealed trait ThisNodeOrAnySubNodesHasError extends NodeFlags
  
  @js.native
  sealed trait TypeExcludesFlags extends NodeFlags
  
  @js.native
  sealed trait YieldContext extends NodeFlags
  
  /* 16384 */ val AwaitContext: typings.typescript.typescriptMod.NodeFlags.AwaitContext with Double = js.native
  /* 3 */ val BlockScoped: typings.typescript.typescriptMod.NodeFlags.BlockScoped with Double = js.native
  /* 2 */ val Const: typings.typescript.typescriptMod.NodeFlags.Const with Double = js.native
  /* 64 */ val ContainsThis: typings.typescript.typescriptMod.NodeFlags.ContainsThis with Double = js.native
  /* 12679168 */ val ContextFlags: typings.typescript.typescriptMod.NodeFlags.ContextFlags with Double = js.native
  /* 8192 */ val DecoratorContext: typings.typescript.typescriptMod.NodeFlags.DecoratorContext with Double = js.native
  /* 2048 */ val DisallowInContext: typings.typescript.typescriptMod.NodeFlags.DisallowInContext with Double = js.native
  /* 32 */ val ExportContext: typings.typescript.typescriptMod.NodeFlags.ExportContext with Double = js.native
  /* 512 */ val GlobalAugmentation: typings.typescript.typescriptMod.NodeFlags.GlobalAugmentation with Double = js.native
  /* 262144 */ val HasAggregatedChildData: typings.typescript.typescriptMod.NodeFlags.HasAggregatedChildData with Double = js.native
  /* 1024 */ val HasAsyncFunctions: typings.typescript.typescriptMod.NodeFlags.HasAsyncFunctions with Double = js.native
  /* 256 */ val HasExplicitReturn: typings.typescript.typescriptMod.NodeFlags.HasExplicitReturn with Double = js.native
  /* 128 */ val HasImplicitReturn: typings.typescript.typescriptMod.NodeFlags.HasImplicitReturn with Double = js.native
  /* 2097152 */ val JSDoc: typings.typescript.typescriptMod.NodeFlags.JSDoc with Double = js.native
  /* 65536 */ val JavaScriptFile: typings.typescript.typescriptMod.NodeFlags.JavaScriptFile with Double = js.native
  /* 16777216 */ val JsonFile: typings.typescript.typescriptMod.NodeFlags.JsonFile with Double = js.native
  /* 1 */ val Let: typings.typescript.typescriptMod.NodeFlags.Let with Double = js.native
  /* 16 */ val Namespace: typings.typescript.typescriptMod.NodeFlags.Namespace with Double = js.native
  /* 4 */ val NestedNamespace: typings.typescript.typescriptMod.NodeFlags.NestedNamespace with Double = js.native
  /* 0 */ val None: typings.typescript.typescriptMod.NodeFlags.None with Double = js.native
  /* 1408 */ val ReachabilityAndEmitFlags: typings.typescript.typescriptMod.NodeFlags.ReachabilityAndEmitFlags with Double = js.native
  /* 384 */ val ReachabilityCheckFlags: typings.typescript.typescriptMod.NodeFlags.ReachabilityCheckFlags with Double = js.native
  /* 8 */ val Synthesized: typings.typescript.typescriptMod.NodeFlags.Synthesized with Double = js.native
  /* 32768 */ val ThisNodeHasError: typings.typescript.typescriptMod.NodeFlags.ThisNodeHasError with Double = js.native
  /* 131072 */ val ThisNodeOrAnySubNodesHasError: typings.typescript.typescriptMod.NodeFlags.ThisNodeOrAnySubNodesHasError with Double = js.native
  /* 20480 */ val TypeExcludesFlags: typings.typescript.typescriptMod.NodeFlags.TypeExcludesFlags with Double = js.native
  /* 4096 */ val YieldContext: typings.typescript.typescriptMod.NodeFlags.YieldContext with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeFlags with Double] = js.native
}

