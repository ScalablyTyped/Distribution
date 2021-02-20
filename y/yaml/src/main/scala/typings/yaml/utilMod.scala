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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @js.native
  sealed trait Type extends StObject
  @JSImport("yaml/util", "Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Type with String] = js.native
    
    @js.native
    sealed trait ALIAS extends Type
    /* "ALIAS" */ val ALIAS: typings.yaml.utilMod.Type.ALIAS with String = js.native
    
    @js.native
    sealed trait BLANK_LINE extends Type
    /* "BLANK_LINE" */ val BLANK_LINE: typings.yaml.utilMod.Type.BLANK_LINE with String = js.native
    
    @js.native
    sealed trait BLOCK_FOLDED
      extends Type
         with typings.yaml.typesMod.Scalar.Type
    /* "BLOCK_FOLDED" */ val BLOCK_FOLDED: typings.yaml.utilMod.Type.BLOCK_FOLDED with String = js.native
    
    @js.native
    sealed trait BLOCK_LITERAL
      extends Type
         with typings.yaml.typesMod.Scalar.Type
    /* "BLOCK_LITERAL" */ val BLOCK_LITERAL: typings.yaml.utilMod.Type.BLOCK_LITERAL with String = js.native
    
    @js.native
    sealed trait COMMENT extends Type
    /* "COMMENT" */ val COMMENT: typings.yaml.utilMod.Type.COMMENT with String = js.native
    
    @js.native
    sealed trait DIRECTIVE extends Type
    /* "DIRECTIVE" */ val DIRECTIVE: typings.yaml.utilMod.Type.DIRECTIVE with String = js.native
    
    @js.native
    sealed trait DOCUMENT extends Type
    /* "DOCUMENT" */ val DOCUMENT: typings.yaml.utilMod.Type.DOCUMENT with String = js.native
    
    @js.native
    sealed trait FLOW_MAP extends Type
    /* "FLOW_MAP" */ val FLOW_MAP: typings.yaml.utilMod.Type.FLOW_MAP with String = js.native
    
    @js.native
    sealed trait FLOW_SEQ extends Type
    /* "FLOW_SEQ" */ val FLOW_SEQ: typings.yaml.utilMod.Type.FLOW_SEQ with String = js.native
    
    @js.native
    sealed trait MAP extends Type
    /* "MAP" */ val MAP: typings.yaml.utilMod.Type.MAP with String = js.native
    
    @js.native
    sealed trait MAP_KEY extends Type
    /* "MAP_KEY" */ val MAP_KEY: typings.yaml.utilMod.Type.MAP_KEY with String = js.native
    
    @js.native
    sealed trait MAP_VALUE extends Type
    /* "MAP_VALUE" */ val MAP_VALUE: typings.yaml.utilMod.Type.MAP_VALUE with String = js.native
    
    @js.native
    sealed trait PLAIN
      extends Type
         with typings.yaml.typesMod.Scalar.Type
    /* "PLAIN" */ val PLAIN: typings.yaml.utilMod.Type.PLAIN with String = js.native
    
    @js.native
    sealed trait QUOTE_DOUBLE
      extends Type
         with typings.yaml.typesMod.Scalar.Type
    /* "QUOTE_DOUBLE" */ val QUOTE_DOUBLE: typings.yaml.utilMod.Type.QUOTE_DOUBLE with String = js.native
    
    @js.native
    sealed trait QUOTE_SINGLE
      extends Type
         with typings.yaml.typesMod.Scalar.Type
    /* "QUOTE_SINGLE" */ val QUOTE_SINGLE: typings.yaml.utilMod.Type.QUOTE_SINGLE with String = js.native
    
    @js.native
    sealed trait SEQ extends Type
    /* "SEQ" */ val SEQ: typings.yaml.utilMod.Type.SEQ with String = js.native
    
    @js.native
    sealed trait SEQ_ITEM extends Type
    /* "SEQ_ITEM" */ val SEQ_ITEM: typings.yaml.utilMod.Type.SEQ_ITEM with String = js.native
  }
  
  @JSImport("yaml/util", "YAMLError")
  @js.native
  class YAMLError () extends Error {
    
    var linePos: js.UndefOr[End] = js.native
    
    /**
      * Drops `source` and adds `nodeType`, `range` and `linePos`, as well as
      * adding details to `message`. Run automatically for document errors if
      * the `prettyErrors` option is set.
      */
    def makePretty(): Unit = js.native
    
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
  
  @JSImport("yaml/util", "findPair")
  @js.native
  def findPair(items: js.Array[_], key: js.Any): js.UndefOr[Pair] = js.native
  @JSImport("yaml/util", "findPair")
  @js.native
  def findPair(items: js.Array[_], key: Scalar): js.UndefOr[Pair] = js.native
  
  @JSImport("yaml/util", "parseMap")
  @js.native
  def parseMap(doc: Document, cst: FlowMap): typings.yaml.typesMod.AST.FlowMap = js.native
  @JSImport("yaml/util", "parseMap")
  @js.native
  def parseMap(doc: Document, cst: Map): BlockMap = js.native
  
  @JSImport("yaml/util", "parseSeq")
  @js.native
  def parseSeq(doc: Document, cst: FlowSeq): typings.yaml.typesMod.AST.FlowSeq = js.native
  @JSImport("yaml/util", "parseSeq")
  @js.native
  def parseSeq(doc: Document, cst: Seq): BlockSeq = js.native
  
  @JSImport("yaml/util", "stringifyNumber")
  @js.native
  def stringifyNumber(item: Scalar): String = js.native
  
  @JSImport("yaml/util", "stringifyString")
  @js.native
  def stringifyString(item: Scalar, ctx: StringifyContext): String = js.native
  @JSImport("yaml/util", "stringifyString")
  @js.native
  def stringifyString(
    item: Scalar,
    ctx: StringifyContext,
    onComment: js.UndefOr[scala.Nothing],
    onChompKeep: js.Function0[Unit]
  ): String = js.native
  @JSImport("yaml/util", "stringifyString")
  @js.native
  def stringifyString(item: Scalar, ctx: StringifyContext, onComment: js.Function0[Unit]): String = js.native
  @JSImport("yaml/util", "stringifyString")
  @js.native
  def stringifyString(
    item: Scalar,
    ctx: StringifyContext,
    onComment: js.Function0[Unit],
    onChompKeep: js.Function0[Unit]
  ): String = js.native
  
  @JSImport("yaml/util", "toJSON")
  @js.native
  def toJSON(value: js.Any): js.Any = js.native
  @JSImport("yaml/util", "toJSON")
  @js.native
  def toJSON(value: js.Any, arg: js.UndefOr[scala.Nothing], ctx: CreateNodeContext): js.Any = js.native
  @JSImport("yaml/util", "toJSON")
  @js.native
  def toJSON(value: js.Any, arg: js.Any): js.Any = js.native
  @JSImport("yaml/util", "toJSON")
  @js.native
  def toJSON(value: js.Any, arg: js.Any, ctx: CreateNodeContext): js.Any = js.native
  
  @js.native
  trait LinePos extends StObject {
    
    var col: Double = js.native
    
    var line: Double = js.native
  }
  object LinePos {
    
    @scala.inline
    def apply(col: Double, line: Double): LinePos = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinePos]
    }
    
    @scala.inline
    implicit class LinePosMutableBuilder[Self <: LinePos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
