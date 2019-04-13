package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeFlags extends js.Object

@JSImport("typescript", "NodeFlags")
@js.native
object NodeFlags extends js.Object {
  @js.native
  sealed trait AwaitContext
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait BlockScoped
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait Const
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait ContainsThis
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait ContextFlags
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait DecoratorContext
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait DisallowInContext
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait ExportContext
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait GlobalAugmentation
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait HasAggregatedChildData
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait HasAsyncFunctions
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait HasExplicitReturn
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait HasImplicitReturn
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait JSDoc
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait JavaScriptFile
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait JsonFile
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait Let
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait Namespace
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait NestedNamespace
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait ReachabilityAndEmitFlags
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait ReachabilityCheckFlags
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait Synthesized
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait ThisNodeHasError
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait ThisNodeOrAnySubNodesHasError
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait TypeExcludesFlags
    extends typescriptLib.typescriptMod.NodeFlags
  
  @js.native
  sealed trait YieldContext
    extends typescriptLib.typescriptMod.NodeFlags
  
  /* 16384 */ val AwaitContext: AwaitContext with scala.Double = js.native
  /* 3 */ val BlockScoped: BlockScoped with scala.Double = js.native
  /* 2 */ val Const: Const with scala.Double = js.native
  /* 64 */ val ContainsThis: ContainsThis with scala.Double = js.native
  /* 12679168 */ val ContextFlags: ContextFlags with scala.Double = js.native
  /* 8192 */ val DecoratorContext: DecoratorContext with scala.Double = js.native
  /* 2048 */ val DisallowInContext: DisallowInContext with scala.Double = js.native
  /* 32 */ val ExportContext: ExportContext with scala.Double = js.native
  /* 512 */ val GlobalAugmentation: GlobalAugmentation with scala.Double = js.native
  /* 262144 */ val HasAggregatedChildData: HasAggregatedChildData with scala.Double = js.native
  /* 1024 */ val HasAsyncFunctions: HasAsyncFunctions with scala.Double = js.native
  /* 256 */ val HasExplicitReturn: HasExplicitReturn with scala.Double = js.native
  /* 128 */ val HasImplicitReturn: HasImplicitReturn with scala.Double = js.native
  /* 2097152 */ val JSDoc: JSDoc with scala.Double = js.native
  /* 65536 */ val JavaScriptFile: JavaScriptFile with scala.Double = js.native
  /* 16777216 */ val JsonFile: JsonFile with scala.Double = js.native
  /* 1 */ val Let: Let with scala.Double = js.native
  /* 16 */ val Namespace: Namespace with scala.Double = js.native
  /* 4 */ val NestedNamespace: NestedNamespace with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1408 */ val ReachabilityAndEmitFlags: ReachabilityAndEmitFlags with scala.Double = js.native
  /* 384 */ val ReachabilityCheckFlags: ReachabilityCheckFlags with scala.Double = js.native
  /* 8 */ val Synthesized: Synthesized with scala.Double = js.native
  /* 32768 */ val ThisNodeHasError: ThisNodeHasError with scala.Double = js.native
  /* 131072 */ val ThisNodeOrAnySubNodesHasError: ThisNodeOrAnySubNodesHasError with scala.Double = js.native
  /* 20480 */ val TypeExcludesFlags: TypeExcludesFlags with scala.Double = js.native
  /* 4096 */ val YieldContext: YieldContext with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.NodeFlags with scala.Double] = js.native
}

