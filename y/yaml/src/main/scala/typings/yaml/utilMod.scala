package typings.yaml

import typings.std.Error
import typings.yaml.anon.End
import typings.yaml.mod.Document
import typings.yaml.parseCstMod.CST.FlowMap
import typings.yaml.parseCstMod.CST.FlowSeq
import typings.yaml.parseCstMod.CST.Map
import typings.yaml.parseCstMod.CST.Node
import typings.yaml.parseCstMod.CST.Range
import typings.yaml.parseCstMod.CST.Seq
import typings.yaml.typesMod.AST.BlockMap
import typings.yaml.typesMod.AST.BlockSeq
import typings.yaml.typesMod.Pair
import typings.yaml.typesMod.Scalar
import typings.yaml.typesMod.Schema.CreateNodeContext
import typings.yaml.typesMod.Schema.StringifyContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("yaml/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Type extends StObject
  @JSImport("yaml/util", "Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Type & String] = js.native
    
    @js.native
    sealed trait ALIAS
      extends StObject
         with Type
    /* "ALIAS" */ val ALIAS: typings.yaml.utilMod.Type.ALIAS & String = js.native
    
    @js.native
    sealed trait BLANK_LINE
      extends StObject
         with Type
    /* "BLANK_LINE" */ val BLANK_LINE: typings.yaml.utilMod.Type.BLANK_LINE & String = js.native
    
    @js.native
    sealed trait BLOCK_FOLDED
      extends StObject
         with Type
         with typings.yaml.typesMod.Scalar.Type
    /* "BLOCK_FOLDED" */ val BLOCK_FOLDED: typings.yaml.utilMod.Type.BLOCK_FOLDED & String = js.native
    
    @js.native
    sealed trait BLOCK_LITERAL
      extends StObject
         with Type
         with typings.yaml.typesMod.Scalar.Type
    /* "BLOCK_LITERAL" */ val BLOCK_LITERAL: typings.yaml.utilMod.Type.BLOCK_LITERAL & String = js.native
    
    @js.native
    sealed trait COMMENT
      extends StObject
         with Type
    /* "COMMENT" */ val COMMENT: typings.yaml.utilMod.Type.COMMENT & String = js.native
    
    @js.native
    sealed trait DIRECTIVE
      extends StObject
         with Type
    /* "DIRECTIVE" */ val DIRECTIVE: typings.yaml.utilMod.Type.DIRECTIVE & String = js.native
    
    @js.native
    sealed trait DOCUMENT
      extends StObject
         with Type
    /* "DOCUMENT" */ val DOCUMENT: typings.yaml.utilMod.Type.DOCUMENT & String = js.native
    
    @js.native
    sealed trait FLOW_MAP
      extends StObject
         with Type
    /* "FLOW_MAP" */ val FLOW_MAP: typings.yaml.utilMod.Type.FLOW_MAP & String = js.native
    
    @js.native
    sealed trait FLOW_SEQ
      extends StObject
         with Type
    /* "FLOW_SEQ" */ val FLOW_SEQ: typings.yaml.utilMod.Type.FLOW_SEQ & String = js.native
    
    @js.native
    sealed trait MAP
      extends StObject
         with Type
    /* "MAP" */ val MAP: typings.yaml.utilMod.Type.MAP & String = js.native
    
    @js.native
    sealed trait MAP_KEY
      extends StObject
         with Type
    /* "MAP_KEY" */ val MAP_KEY: typings.yaml.utilMod.Type.MAP_KEY & String = js.native
    
    @js.native
    sealed trait MAP_VALUE
      extends StObject
         with Type
    /* "MAP_VALUE" */ val MAP_VALUE: typings.yaml.utilMod.Type.MAP_VALUE & String = js.native
    
    @js.native
    sealed trait PLAIN
      extends StObject
         with Type
         with typings.yaml.typesMod.Scalar.Type
    /* "PLAIN" */ val PLAIN: typings.yaml.utilMod.Type.PLAIN & String = js.native
    
    @js.native
    sealed trait QUOTE_DOUBLE
      extends StObject
         with Type
         with typings.yaml.typesMod.Scalar.Type
    /* "QUOTE_DOUBLE" */ val QUOTE_DOUBLE: typings.yaml.utilMod.Type.QUOTE_DOUBLE & String = js.native
    
    @js.native
    sealed trait QUOTE_SINGLE
      extends StObject
         with Type
         with typings.yaml.typesMod.Scalar.Type
    /* "QUOTE_SINGLE" */ val QUOTE_SINGLE: typings.yaml.utilMod.Type.QUOTE_SINGLE & String = js.native
    
    @js.native
    sealed trait SEQ
      extends StObject
         with Type
    /* "SEQ" */ val SEQ: typings.yaml.utilMod.Type.SEQ & String = js.native
    
    @js.native
    sealed trait SEQ_ITEM
      extends StObject
         with Type
    /* "SEQ_ITEM" */ val SEQ_ITEM: typings.yaml.utilMod.Type.SEQ_ITEM & String = js.native
  }
  
  @JSImport("yaml/util", "YAMLError")
  @js.native
  class YAMLError ()
    extends StObject
       with Error {
    
    var linePos: js.UndefOr[End] = js.native
    
    /**
      * Drops `source` and adds `nodeType`, `range` and `linePos`, as well as
      * adding details to `message`. Run automatically for document errors if
      * the `prettyErrors` option is set.
      */
    def makePretty(): Unit = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_YAMLError: typings.yaml.yamlStrings.YAMLReferenceError | typings.yaml.yamlStrings.YAMLSemanticError | typings.yaml.yamlStrings.YAMLSyntaxError | typings.yaml.yamlStrings.YAMLWarning = js.native
    
    var nodeType: js.UndefOr[Type] = js.native
    
    var range: js.UndefOr[Range] = js.native
    
    var source: js.UndefOr[Node] = js.native
  }
  
  @JSImport("yaml/util", "YAMLReferenceError")
  @js.native
  class YAMLReferenceError () extends YAMLError {
    
    @JSName("name")
    var name_YAMLReferenceError: typings.yaml.yamlStrings.YAMLReferenceError = js.native
  }
  
  @JSImport("yaml/util", "YAMLSemanticError")
  @js.native
  class YAMLSemanticError () extends YAMLError {
    
    @JSName("name")
    var name_YAMLSemanticError: typings.yaml.yamlStrings.YAMLSemanticError = js.native
  }
  
  @JSImport("yaml/util", "YAMLSyntaxError")
  @js.native
  class YAMLSyntaxError () extends YAMLError {
    
    @JSName("name")
    var name_YAMLSyntaxError: typings.yaml.yamlStrings.YAMLSyntaxError = js.native
  }
  
  @JSImport("yaml/util", "YAMLWarning")
  @js.native
  class YAMLWarning () extends YAMLError {
    
    @JSName("name")
    var name_YAMLWarning: typings.yaml.yamlStrings.YAMLWarning = js.native
  }
  
  inline def findPair(items: js.Array[js.Any], key: js.Any): js.UndefOr[Pair] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPair")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Pair]]
  inline def findPair(items: js.Array[js.Any], key: Scalar): js.UndefOr[Pair] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPair")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Pair]]
  
  inline def parseMap(doc: Document, cst: FlowMap): typings.yaml.typesMod.AST.FlowMap = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMap")(doc.asInstanceOf[js.Any], cst.asInstanceOf[js.Any])).asInstanceOf[typings.yaml.typesMod.AST.FlowMap]
  inline def parseMap(doc: Document, cst: Map): BlockMap = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMap")(doc.asInstanceOf[js.Any], cst.asInstanceOf[js.Any])).asInstanceOf[BlockMap]
  
  inline def parseSeq(doc: Document, cst: FlowSeq): typings.yaml.typesMod.AST.FlowSeq = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSeq")(doc.asInstanceOf[js.Any], cst.asInstanceOf[js.Any])).asInstanceOf[typings.yaml.typesMod.AST.FlowSeq]
  inline def parseSeq(doc: Document, cst: Seq): BlockSeq = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSeq")(doc.asInstanceOf[js.Any], cst.asInstanceOf[js.Any])).asInstanceOf[BlockSeq]
  
  inline def stringifyNumber(item: Scalar): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyNumber")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyString(item: Scalar, ctx: StringifyContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(item: Scalar, ctx: StringifyContext, onComment: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(
    item: Scalar,
    ctx: StringifyContext,
    onComment: js.Function0[Unit],
    onChompKeep: js.Function0[Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any], onChompKeep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyString(item: Scalar, ctx: StringifyContext, onComment: Unit, onChompKeep: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyString")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any], onChompKeep.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toJSON(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def toJSON(value: js.Any, arg: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def toJSON(value: js.Any, arg: js.Any, ctx: CreateNodeContext): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def toJSON(value: js.Any, arg: Unit, ctx: CreateNodeContext): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait LinePos extends StObject {
    
    var col: Double
    
    var line: Double
  }
  object LinePos {
    
    inline def apply(col: Double, line: Double): LinePos = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinePos]
    }
    
    extension [Self <: LinePos](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
