package typings.yaml

import typings.yaml.distDocCreateNodeMod.CreateNodeContext
import typings.yaml.distLogMod.LogLevelId
import typings.yaml.distNodesAliasMod.Alias
import typings.yaml.distNodesNodeMod.Node
import typings.yaml.distNodesPairMod.Pair
import typings.yaml.distNodesScalarMod.Scalar
import typings.yaml.distNodesToJSMod.ToJSContext
import typings.yaml.distNodesYamlmapMod.YAMLMap
import typings.yaml.distNodesYamlseqMod.YAMLSeq
import typings.yaml.distSchemaTypesMod.CollectionTag
import typings.yaml.distSchemaTypesMod.ScalarTag
import typings.yaml.distStringifyFoldFlowLinesMod.FoldMode
import typings.yaml.distStringifyFoldFlowLinesMod.FoldOptions
import typings.yaml.distStringifyStringifyMod.StringifyContext
import typings.yaml.distStringifyStringifyStringMod.StringifyScalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object utilMod {
  
  @JSImport("yaml/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNode(value: Any, tagName: String, ctx: CreateNodeContext): Node[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(value.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Node[Any]]
  inline def createNode(value: Any, tagName: Unit, ctx: CreateNodeContext): Node[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(value.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Node[Any]]
  
  inline def createPair(key: Any, value: Any, ctx: CreateNodeContext): Pair[Node[Any], (YAMLMap[Any, Any]) | Scalar[Any] | Alias | YAMLSeq[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPair")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Pair[Node[Any], (YAMLMap[Any, Any]) | Scalar[Any] | Alias | YAMLSeq[Any]]]
  
  inline def debug(logLevel: LogLevelId, messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(logLevel.asInstanceOf[js.Any]).`++`(messages.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def findPair[K, V](items: js.Iterable[Pair[K, V]], key: Any): js.UndefOr[Pair[K, V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPair")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Pair[K, V]]]
  
  inline def foldFlowLines(text: String, indent: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldFlowLines")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldFlowLines(text: String, indent: String, mode: Unit, param3: FoldOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldFlowLines")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldFlowLines(text: String, indent: String, mode: FoldMode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldFlowLines")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldFlowLines(text: String, indent: String, mode: FoldMode, param3: FoldOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldFlowLines")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("yaml/util", "mapTag")
  @js.native
  val mapTag: CollectionTag = js.native
  
  @JSImport("yaml/util", "seqTag")
  @js.native
  val seqTag: CollectionTag = js.native
  
  @JSImport("yaml/util", "stringTag")
  @js.native
  val stringTag: ScalarTag = js.native
  
  inline def stringifyNumber(param0: Scalar[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyNumber")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyString(item: Scalar[Any], ctx: StringifyContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(item: Scalar[Any], ctx: StringifyContext, onComment: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(
    item: Scalar[Any],
    ctx: StringifyContext,
    onComment: js.Function0[Unit],
    onChompKeep: js.Function0[Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any], onChompKeep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(item: Scalar[Any], ctx: StringifyContext, onComment: Unit, onChompKeep: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any], onChompKeep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(item: StringifyScalar, ctx: StringifyContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(item: StringifyScalar, ctx: StringifyContext, onComment: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(
    item: StringifyScalar,
    ctx: StringifyContext,
    onComment: js.Function0[Unit],
    onChompKeep: js.Function0[Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any], onChompKeep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(item: StringifyScalar, ctx: StringifyContext, onComment: Unit, onChompKeep: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any], onChompKeep.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toJS(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toJS(value: Any, arg: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toJS(value: Any, arg: String, ctx: ToJSContext): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toJS(value: Any, arg: Null, ctx: ToJSContext): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def warn(logLevel: LogLevelId, warning: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(logLevel.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warn(logLevel: LogLevelId, warning: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(logLevel.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
