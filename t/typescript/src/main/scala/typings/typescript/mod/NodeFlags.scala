package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeFlags extends StObject
@JSImport("typescript", "NodeFlags")
@js.native
object NodeFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeFlags & Double] = js.native
  
  @js.native
  sealed trait AwaitContext
    extends StObject
       with NodeFlags
  /* 32768 */ val AwaitContext: typings.typescript.mod.NodeFlags.AwaitContext & Double = js.native
  
  @js.native
  sealed trait BlockScoped
    extends StObject
       with NodeFlags
  /* 3 */ val BlockScoped: typings.typescript.mod.NodeFlags.BlockScoped & Double = js.native
  
  @js.native
  sealed trait Const
    extends StObject
       with NodeFlags
  /* 2 */ val Const: typings.typescript.mod.NodeFlags.Const & Double = js.native
  
  @js.native
  sealed trait ContainsThis
    extends StObject
       with NodeFlags
  /* 128 */ val ContainsThis: typings.typescript.mod.NodeFlags.ContainsThis & Double = js.native
  
  @js.native
  sealed trait ContextFlags
    extends StObject
       with NodeFlags
  /* 50720768 */ val ContextFlags: typings.typescript.mod.NodeFlags.ContextFlags & Double = js.native
  
  @js.native
  sealed trait DecoratorContext
    extends StObject
       with NodeFlags
  /* 16384 */ val DecoratorContext: typings.typescript.mod.NodeFlags.DecoratorContext & Double = js.native
  
  @js.native
  sealed trait DisallowConditionalTypesContext
    extends StObject
       with NodeFlags
  /* 65536 */ val DisallowConditionalTypesContext: typings.typescript.mod.NodeFlags.DisallowConditionalTypesContext & Double = js.native
  
  @js.native
  sealed trait DisallowInContext
    extends StObject
       with NodeFlags
  /* 4096 */ val DisallowInContext: typings.typescript.mod.NodeFlags.DisallowInContext & Double = js.native
  
  @js.native
  sealed trait ExportContext
    extends StObject
       with NodeFlags
  /* 64 */ val ExportContext: typings.typescript.mod.NodeFlags.ExportContext & Double = js.native
  
  @js.native
  sealed trait GlobalAugmentation
    extends StObject
       with NodeFlags
  /* 1024 */ val GlobalAugmentation: typings.typescript.mod.NodeFlags.GlobalAugmentation & Double = js.native
  
  @js.native
  sealed trait HasAggregatedChildData
    extends StObject
       with NodeFlags
  /* 1048576 */ val HasAggregatedChildData: typings.typescript.mod.NodeFlags.HasAggregatedChildData & Double = js.native
  
  @js.native
  sealed trait HasAsyncFunctions
    extends StObject
       with NodeFlags
  /* 2048 */ val HasAsyncFunctions: typings.typescript.mod.NodeFlags.HasAsyncFunctions & Double = js.native
  
  @js.native
  sealed trait HasExplicitReturn
    extends StObject
       with NodeFlags
  /* 512 */ val HasExplicitReturn: typings.typescript.mod.NodeFlags.HasExplicitReturn & Double = js.native
  
  @js.native
  sealed trait HasImplicitReturn
    extends StObject
       with NodeFlags
  /* 256 */ val HasImplicitReturn: typings.typescript.mod.NodeFlags.HasImplicitReturn & Double = js.native
  
  @js.native
  sealed trait JSDoc
    extends StObject
       with NodeFlags
  /* 8388608 */ val JSDoc: typings.typescript.mod.NodeFlags.JSDoc & Double = js.native
  
  @js.native
  sealed trait JavaScriptFile
    extends StObject
       with NodeFlags
  /* 262144 */ val JavaScriptFile: typings.typescript.mod.NodeFlags.JavaScriptFile & Double = js.native
  
  @js.native
  sealed trait JsonFile
    extends StObject
       with NodeFlags
  /* 67108864 */ val JsonFile: typings.typescript.mod.NodeFlags.JsonFile & Double = js.native
  
  @js.native
  sealed trait Let
    extends StObject
       with NodeFlags
  /* 1 */ val Let: typings.typescript.mod.NodeFlags.Let & Double = js.native
  
  @js.native
  sealed trait Namespace
    extends StObject
       with NodeFlags
  /* 16 */ val Namespace: typings.typescript.mod.NodeFlags.Namespace & Double = js.native
  
  @js.native
  sealed trait NestedNamespace
    extends StObject
       with NodeFlags
  /* 4 */ val NestedNamespace: typings.typescript.mod.NodeFlags.NestedNamespace & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with NodeFlags
  /* 0 */ val None: typings.typescript.mod.NodeFlags.None & Double = js.native
  
  @js.native
  sealed trait OptionalChain
    extends StObject
       with NodeFlags
  /* 32 */ val OptionalChain: typings.typescript.mod.NodeFlags.OptionalChain & Double = js.native
  
  @js.native
  sealed trait ReachabilityAndEmitFlags
    extends StObject
       with NodeFlags
  /* 2816 */ val ReachabilityAndEmitFlags: typings.typescript.mod.NodeFlags.ReachabilityAndEmitFlags & Double = js.native
  
  @js.native
  sealed trait ReachabilityCheckFlags
    extends StObject
       with NodeFlags
  /* 768 */ val ReachabilityCheckFlags: typings.typescript.mod.NodeFlags.ReachabilityCheckFlags & Double = js.native
  
  @js.native
  sealed trait Synthesized
    extends StObject
       with NodeFlags
  /* 8 */ val Synthesized: typings.typescript.mod.NodeFlags.Synthesized & Double = js.native
  
  @js.native
  sealed trait ThisNodeHasError
    extends StObject
       with NodeFlags
  /* 131072 */ val ThisNodeHasError: typings.typescript.mod.NodeFlags.ThisNodeHasError & Double = js.native
  
  @js.native
  sealed trait ThisNodeOrAnySubNodesHasError
    extends StObject
       with NodeFlags
  /* 524288 */ val ThisNodeOrAnySubNodesHasError: typings.typescript.mod.NodeFlags.ThisNodeOrAnySubNodesHasError & Double = js.native
  
  @js.native
  sealed trait TypeExcludesFlags
    extends StObject
       with NodeFlags
  /* 40960 */ val TypeExcludesFlags: typings.typescript.mod.NodeFlags.TypeExcludesFlags & Double = js.native
  
  @js.native
  sealed trait YieldContext
    extends StObject
       with NodeFlags
  /* 8192 */ val YieldContext: typings.typescript.mod.NodeFlags.YieldContext & Double = js.native
}
