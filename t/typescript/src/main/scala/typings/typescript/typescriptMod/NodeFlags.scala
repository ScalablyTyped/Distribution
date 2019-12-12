package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import typings.typescript.typescriptMod.NodeFlags.AwaitContext
import typings.typescript.typescriptMod.NodeFlags.BlockScoped
import typings.typescript.typescriptMod.NodeFlags.Const
import typings.typescript.typescriptMod.NodeFlags.ContainsThis
import typings.typescript.typescriptMod.NodeFlags.ContextFlags
import typings.typescript.typescriptMod.NodeFlags.DecoratorContext
import typings.typescript.typescriptMod.NodeFlags.DisallowInContext
import typings.typescript.typescriptMod.NodeFlags.ExportContext
import typings.typescript.typescriptMod.NodeFlags.GlobalAugmentation
import typings.typescript.typescriptMod.NodeFlags.HasAggregatedChildData
import typings.typescript.typescriptMod.NodeFlags.HasAsyncFunctions
import typings.typescript.typescriptMod.NodeFlags.HasExplicitReturn
import typings.typescript.typescriptMod.NodeFlags.HasImplicitReturn
import typings.typescript.typescriptMod.NodeFlags.JavaScriptFile
import typings.typescript.typescriptMod.NodeFlags.JsonFile
import typings.typescript.typescriptMod.NodeFlags.Let
import typings.typescript.typescriptMod.NodeFlags.Namespace
import typings.typescript.typescriptMod.NodeFlags.NestedNamespace
import typings.typescript.typescriptMod.NodeFlags.None
import typings.typescript.typescriptMod.NodeFlags.ReachabilityAndEmitFlags
import typings.typescript.typescriptMod.NodeFlags.ReachabilityCheckFlags
import typings.typescript.typescriptMod.NodeFlags.Synthesized
import typings.typescript.typescriptMod.NodeFlags.ThisNodeHasError
import typings.typescript.typescriptMod.NodeFlags.ThisNodeOrAnySubNodesHasError
import typings.typescript.typescriptMod.NodeFlags.TypeExcludesFlags
import typings.typescript.typescriptMod.NodeFlags.YieldContext
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
  sealed trait OptionalChain extends NodeFlags
  
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeFlags with Double] = js.native
  /* 32768 */ @js.native
  object AwaitContext extends TopLevel[AwaitContext with Double]
  
  /* 3 */ @js.native
  object BlockScoped extends TopLevel[BlockScoped with Double]
  
  /* 2 */ @js.native
  object Const extends TopLevel[Const with Double]
  
  /* 128 */ @js.native
  object ContainsThis extends TopLevel[ContainsThis with Double]
  
  /* 25358336 */ @js.native
  object ContextFlags extends TopLevel[ContextFlags with Double]
  
  /* 16384 */ @js.native
  object DecoratorContext extends TopLevel[DecoratorContext with Double]
  
  /* 4096 */ @js.native
  object DisallowInContext extends TopLevel[DisallowInContext with Double]
  
  /* 64 */ @js.native
  object ExportContext extends TopLevel[ExportContext with Double]
  
  /* 1024 */ @js.native
  object GlobalAugmentation extends TopLevel[GlobalAugmentation with Double]
  
  /* 524288 */ @js.native
  object HasAggregatedChildData extends TopLevel[HasAggregatedChildData with Double]
  
  /* 2048 */ @js.native
  object HasAsyncFunctions extends TopLevel[HasAsyncFunctions with Double]
  
  /* 512 */ @js.native
  object HasExplicitReturn extends TopLevel[HasExplicitReturn with Double]
  
  /* 256 */ @js.native
  object HasImplicitReturn extends TopLevel[HasImplicitReturn with Double]
  
  /* 4194304 */ @js.native
  object JSDoc
    extends TopLevel[typings.typescript.typescriptMod.NodeFlags.JSDoc with Double]
  
  /* 131072 */ @js.native
  object JavaScriptFile extends TopLevel[JavaScriptFile with Double]
  
  /* 33554432 */ @js.native
  object JsonFile extends TopLevel[JsonFile with Double]
  
  /* 1 */ @js.native
  object Let extends TopLevel[Let with Double]
  
  /* 16 */ @js.native
  object Namespace extends TopLevel[Namespace with Double]
  
  /* 4 */ @js.native
  object NestedNamespace extends TopLevel[NestedNamespace with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 32 */ @js.native
  object OptionalChain
    extends TopLevel[typings.typescript.typescriptMod.NodeFlags.OptionalChain with Double]
  
  /* 2816 */ @js.native
  object ReachabilityAndEmitFlags extends TopLevel[ReachabilityAndEmitFlags with Double]
  
  /* 768 */ @js.native
  object ReachabilityCheckFlags extends TopLevel[ReachabilityCheckFlags with Double]
  
  /* 8 */ @js.native
  object Synthesized extends TopLevel[Synthesized with Double]
  
  /* 65536 */ @js.native
  object ThisNodeHasError extends TopLevel[ThisNodeHasError with Double]
  
  /* 262144 */ @js.native
  object ThisNodeOrAnySubNodesHasError extends TopLevel[ThisNodeOrAnySubNodesHasError with Double]
  
  /* 40960 */ @js.native
  object TypeExcludesFlags extends TopLevel[TypeExcludesFlags with Double]
  
  /* 8192 */ @js.native
  object YieldContext extends TopLevel[YieldContext with Double]
  
}

