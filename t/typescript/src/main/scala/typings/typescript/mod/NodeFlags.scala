package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeFlags extends StObject
@JSImport("typescript", "NodeFlags")
@js.native
object NodeFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeFlags with Double] = js.native
  
  @js.native
  sealed trait AwaitContext extends NodeFlags
  /* 32768 */ val AwaitContext: typings.typescript.mod.NodeFlags.AwaitContext with Double = js.native
  
  @js.native
  sealed trait BlockScoped extends NodeFlags
  /* 3 */ val BlockScoped: typings.typescript.mod.NodeFlags.BlockScoped with Double = js.native
  
  @js.native
  sealed trait Const extends NodeFlags
  /* 2 */ val Const: typings.typescript.mod.NodeFlags.Const with Double = js.native
  
  @js.native
  sealed trait ContainsThis extends NodeFlags
  /* 128 */ val ContainsThis: typings.typescript.mod.NodeFlags.ContainsThis with Double = js.native
  
  @js.native
  sealed trait ContextFlags extends NodeFlags
  /* 25358336 */ val ContextFlags: typings.typescript.mod.NodeFlags.ContextFlags with Double = js.native
  
  @js.native
  sealed trait DecoratorContext extends NodeFlags
  /* 16384 */ val DecoratorContext: typings.typescript.mod.NodeFlags.DecoratorContext with Double = js.native
  
  @js.native
  sealed trait DisallowInContext extends NodeFlags
  /* 4096 */ val DisallowInContext: typings.typescript.mod.NodeFlags.DisallowInContext with Double = js.native
  
  @js.native
  sealed trait ExportContext extends NodeFlags
  /* 64 */ val ExportContext: typings.typescript.mod.NodeFlags.ExportContext with Double = js.native
  
  @js.native
  sealed trait GlobalAugmentation extends NodeFlags
  /* 1024 */ val GlobalAugmentation: typings.typescript.mod.NodeFlags.GlobalAugmentation with Double = js.native
  
  @js.native
  sealed trait HasAggregatedChildData extends NodeFlags
  /* 524288 */ val HasAggregatedChildData: typings.typescript.mod.NodeFlags.HasAggregatedChildData with Double = js.native
  
  @js.native
  sealed trait HasAsyncFunctions extends NodeFlags
  /* 2048 */ val HasAsyncFunctions: typings.typescript.mod.NodeFlags.HasAsyncFunctions with Double = js.native
  
  @js.native
  sealed trait HasExplicitReturn extends NodeFlags
  /* 512 */ val HasExplicitReturn: typings.typescript.mod.NodeFlags.HasExplicitReturn with Double = js.native
  
  @js.native
  sealed trait HasImplicitReturn extends NodeFlags
  /* 256 */ val HasImplicitReturn: typings.typescript.mod.NodeFlags.HasImplicitReturn with Double = js.native
  
  @js.native
  sealed trait JSDoc extends NodeFlags
  /* 4194304 */ val JSDoc: typings.typescript.mod.NodeFlags.JSDoc with Double = js.native
  
  @js.native
  sealed trait JavaScriptFile extends NodeFlags
  /* 131072 */ val JavaScriptFile: typings.typescript.mod.NodeFlags.JavaScriptFile with Double = js.native
  
  @js.native
  sealed trait JsonFile extends NodeFlags
  /* 33554432 */ val JsonFile: typings.typescript.mod.NodeFlags.JsonFile with Double = js.native
  
  @js.native
  sealed trait Let extends NodeFlags
  /* 1 */ val Let: typings.typescript.mod.NodeFlags.Let with Double = js.native
  
  @js.native
  sealed trait Namespace extends NodeFlags
  /* 16 */ val Namespace: typings.typescript.mod.NodeFlags.Namespace with Double = js.native
  
  @js.native
  sealed trait NestedNamespace extends NodeFlags
  /* 4 */ val NestedNamespace: typings.typescript.mod.NodeFlags.NestedNamespace with Double = js.native
  
  @js.native
  sealed trait None extends NodeFlags
  /* 0 */ val None: typings.typescript.mod.NodeFlags.None with Double = js.native
  
  @js.native
  sealed trait OptionalChain extends NodeFlags
  /* 32 */ val OptionalChain: typings.typescript.mod.NodeFlags.OptionalChain with Double = js.native
  
  @js.native
  sealed trait ReachabilityAndEmitFlags extends NodeFlags
  /* 2816 */ val ReachabilityAndEmitFlags: typings.typescript.mod.NodeFlags.ReachabilityAndEmitFlags with Double = js.native
  
  @js.native
  sealed trait ReachabilityCheckFlags extends NodeFlags
  /* 768 */ val ReachabilityCheckFlags: typings.typescript.mod.NodeFlags.ReachabilityCheckFlags with Double = js.native
  
  @js.native
  sealed trait Synthesized extends NodeFlags
  /* 8 */ val Synthesized: typings.typescript.mod.NodeFlags.Synthesized with Double = js.native
  
  @js.native
  sealed trait ThisNodeHasError extends NodeFlags
  /* 65536 */ val ThisNodeHasError: typings.typescript.mod.NodeFlags.ThisNodeHasError with Double = js.native
  
  @js.native
  sealed trait ThisNodeOrAnySubNodesHasError extends NodeFlags
  /* 262144 */ val ThisNodeOrAnySubNodesHasError: typings.typescript.mod.NodeFlags.ThisNodeOrAnySubNodesHasError with Double = js.native
  
  @js.native
  sealed trait TypeExcludesFlags extends NodeFlags
  /* 40960 */ val TypeExcludesFlags: typings.typescript.mod.NodeFlags.TypeExcludesFlags with Double = js.native
  
  @js.native
  sealed trait YieldContext extends NodeFlags
  /* 8192 */ val YieldContext: typings.typescript.mod.NodeFlags.YieldContext with Double = js.native
}
