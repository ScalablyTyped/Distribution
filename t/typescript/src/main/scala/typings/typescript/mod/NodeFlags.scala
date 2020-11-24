package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeFlags extends js.Object
@JSImport("typescript", "NodeFlags")
@js.native
object NodeFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeFlags with Double] = js.native
  
  @js.native
  sealed trait AwaitContext extends NodeFlags
  /* 32768 */ @js.native
  object AwaitContext extends TopLevel[AwaitContext with Double]
  
  @js.native
  sealed trait BlockScoped extends NodeFlags
  /* 3 */ @js.native
  object BlockScoped extends TopLevel[BlockScoped with Double]
  
  @js.native
  sealed trait Const extends NodeFlags
  /* 2 */ @js.native
  object Const extends TopLevel[Const with Double]
  
  @js.native
  sealed trait ContainsThis extends NodeFlags
  /* 128 */ @js.native
  object ContainsThis extends TopLevel[ContainsThis with Double]
  
  @js.native
  sealed trait ContextFlags extends NodeFlags
  /* 25358336 */ @js.native
  object ContextFlags extends TopLevel[ContextFlags with Double]
  
  @js.native
  sealed trait DecoratorContext extends NodeFlags
  /* 16384 */ @js.native
  object DecoratorContext extends TopLevel[DecoratorContext with Double]
  
  @js.native
  sealed trait DisallowInContext extends NodeFlags
  /* 4096 */ @js.native
  object DisallowInContext extends TopLevel[DisallowInContext with Double]
  
  @js.native
  sealed trait ExportContext extends NodeFlags
  /* 64 */ @js.native
  object ExportContext extends TopLevel[ExportContext with Double]
  
  @js.native
  sealed trait GlobalAugmentation extends NodeFlags
  /* 1024 */ @js.native
  object GlobalAugmentation extends TopLevel[GlobalAugmentation with Double]
  
  @js.native
  sealed trait HasAggregatedChildData extends NodeFlags
  /* 524288 */ @js.native
  object HasAggregatedChildData extends TopLevel[HasAggregatedChildData with Double]
  
  @js.native
  sealed trait HasAsyncFunctions extends NodeFlags
  /* 2048 */ @js.native
  object HasAsyncFunctions extends TopLevel[HasAsyncFunctions with Double]
  
  @js.native
  sealed trait HasExplicitReturn extends NodeFlags
  /* 512 */ @js.native
  object HasExplicitReturn extends TopLevel[HasExplicitReturn with Double]
  
  @js.native
  sealed trait HasImplicitReturn extends NodeFlags
  /* 256 */ @js.native
  object HasImplicitReturn extends TopLevel[HasImplicitReturn with Double]
  
  @js.native
  sealed trait JSDoc extends NodeFlags
  /* 4194304 */ @js.native
  object JSDoc
    extends TopLevel[typings.typescript.mod.NodeFlags.JSDoc with Double]
  
  @js.native
  sealed trait JavaScriptFile extends NodeFlags
  /* 131072 */ @js.native
  object JavaScriptFile extends TopLevel[JavaScriptFile with Double]
  
  @js.native
  sealed trait JsonFile extends NodeFlags
  /* 33554432 */ @js.native
  object JsonFile extends TopLevel[JsonFile with Double]
  
  @js.native
  sealed trait Let extends NodeFlags
  /* 1 */ @js.native
  object Let extends TopLevel[Let with Double]
  
  @js.native
  sealed trait Namespace extends NodeFlags
  /* 16 */ @js.native
  object Namespace extends TopLevel[Namespace with Double]
  
  @js.native
  sealed trait NestedNamespace extends NodeFlags
  /* 4 */ @js.native
  object NestedNamespace extends TopLevel[NestedNamespace with Double]
  
  @js.native
  sealed trait None extends NodeFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait OptionalChain extends NodeFlags
  /* 32 */ @js.native
  object OptionalChain
    extends TopLevel[typings.typescript.mod.NodeFlags.OptionalChain with Double]
  
  @js.native
  sealed trait ReachabilityAndEmitFlags extends NodeFlags
  /* 2816 */ @js.native
  object ReachabilityAndEmitFlags extends TopLevel[ReachabilityAndEmitFlags with Double]
  
  @js.native
  sealed trait ReachabilityCheckFlags extends NodeFlags
  /* 768 */ @js.native
  object ReachabilityCheckFlags extends TopLevel[ReachabilityCheckFlags with Double]
  
  @js.native
  sealed trait Synthesized extends NodeFlags
  /* 8 */ @js.native
  object Synthesized extends TopLevel[Synthesized with Double]
  
  @js.native
  sealed trait ThisNodeHasError extends NodeFlags
  /* 65536 */ @js.native
  object ThisNodeHasError extends TopLevel[ThisNodeHasError with Double]
  
  @js.native
  sealed trait ThisNodeOrAnySubNodesHasError extends NodeFlags
  /* 262144 */ @js.native
  object ThisNodeOrAnySubNodesHasError extends TopLevel[ThisNodeOrAnySubNodesHasError with Double]
  
  @js.native
  sealed trait TypeExcludesFlags extends NodeFlags
  /* 40960 */ @js.native
  object TypeExcludesFlags extends TopLevel[TypeExcludesFlags with Double]
  
  @js.native
  sealed trait YieldContext extends NodeFlags
  /* 8192 */ @js.native
  object YieldContext extends TopLevel[YieldContext with Double]
}
