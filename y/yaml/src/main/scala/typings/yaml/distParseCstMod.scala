package typings.yaml

import typings.yaml.anon.AfterKey
import typings.yaml.anon.End
import typings.yaml.anon.KeySep
import typings.yaml.anon.Sep
import typings.yaml.anon.Start
import typings.yaml.anon.Value
import typings.yaml.distErrorsMod.ErrorCode
import typings.yaml.distParseCstVisitMod.VisitPath
import typings.yaml.distParseCstVisitMod.Visitor
import typings.yaml.yamlStrings.`block-map`
import typings.yaml.yamlStrings.`block-scalar-header`
import typings.yaml.yamlStrings.`block-scalar`
import typings.yaml.yamlStrings.`block-seq`
import typings.yaml.yamlStrings.`byte-order-mark`
import typings.yaml.yamlStrings.`directive-line`
import typings.yaml.yamlStrings.`doc-end`
import typings.yaml.yamlStrings.`doc-mode`
import typings.yaml.yamlStrings.`doc-start`
import typings.yaml.yamlStrings.`double-quoted-scalar`
import typings.yaml.yamlStrings.`explicit-key-ind`
import typings.yaml.yamlStrings.`flow-collection`
import typings.yaml.yamlStrings.`flow-error-end`
import typings.yaml.yamlStrings.`flow-map-end`
import typings.yaml.yamlStrings.`flow-map-start`
import typings.yaml.yamlStrings.`flow-seq-end`
import typings.yaml.yamlStrings.`flow-seq-start`
import typings.yaml.yamlStrings.`map-value-ind`
import typings.yaml.yamlStrings.`seq-item-ind`
import typings.yaml.yamlStrings.`single-quoted-scalar`
import typings.yaml.yamlStrings.alias
import typings.yaml.yamlStrings.anchor
import typings.yaml.yamlStrings.comma
import typings.yaml.yamlStrings.comment
import typings.yaml.yamlStrings.directive
import typings.yaml.yamlStrings.document
import typings.yaml.yamlStrings.error
import typings.yaml.yamlStrings.newline
import typings.yaml.yamlStrings.scalar
import typings.yaml.yamlStrings.space
import typings.yaml.yamlStrings.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseCstMod {
  
  @JSImport("yaml/dist/parse/cst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml/dist/parse/cst", "BOM")
  @js.native
  val BOM: /* "\\uFEFF" */ String = js.native
  
  @JSImport("yaml/dist/parse/cst", "DOCUMENT")
  @js.native
  val DOCUMENT_ : /* "\\u0002" */ String = js.native
  
  @JSImport("yaml/dist/parse/cst", "FLOW_END")
  @js.native
  val FLOW_END: /* "\\u0018" */ String = js.native
  
  @JSImport("yaml/dist/parse/cst", "SCALAR")
  @js.native
  val SCALAR: /* "\\u001F" */ String = js.native
  
  inline def createScalarToken(value: String, context: End): BlockScalar | FlowScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("createScalarToken")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[BlockScalar | FlowScalar]
  
  inline def isCollection(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")().asInstanceOf[Boolean]
  inline def isCollection(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isScalar(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScalar")().asInstanceOf[Boolean]
  inline def isScalar(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def prettyToken(token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyToken")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolveAsScalar(): Value | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")().asInstanceOf[Value | Null]
  inline def resolveAsScalar(token: Null, strict: Boolean): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(
    token: Null,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(
    token: Null,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(token: Unit, strict: Boolean): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(
    token: Unit,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(
    token: Unit,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(token: BlockScalar): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def resolveAsScalar(token: BlockScalar, strict: Boolean): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def resolveAsScalar(
    token: BlockScalar,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def resolveAsScalar(
    token: BlockScalar,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def resolveAsScalar(token: FlowScalar): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def resolveAsScalar(token: FlowScalar, strict: Boolean): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def resolveAsScalar(
    token: FlowScalar,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def resolveAsScalar(
    token: FlowScalar,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def resolveAsScalar(token: Token): Value | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Value | Null]
  inline def resolveAsScalar(token: Token, strict: Boolean): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(
    token: Token,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(
    token: Token,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  
  inline def setScalarValue(token: Token, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScalarValue")(token.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setScalarValue(token: Token, value: String, context: AfterKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScalarValue")(token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stringify(cst: CollectionItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(cst.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(cst: Token): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(cst.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tokenType(source: String): TokenType_ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenType")(source.asInstanceOf[js.Any]).asInstanceOf[TokenType_ | Null]
  
  object visit {
    
    inline def apply(cst: CollectionItem, visitor: Visitor): Unit = (^.asInstanceOf[js.Dynamic].apply(cst.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(cst: Document, visitor: Visitor): Unit = (^.asInstanceOf[js.Dynamic].apply(cst.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("yaml/dist/parse/cst", "visit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist/parse/cst", "visit.BREAK")
    @js.native
    def BREAK: js.Symbol = js.native
    inline def BREAK_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BREAK")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/parse/cst", "visit.REMOVE")
    @js.native
    def REMOVE: js.Symbol = js.native
    inline def REMOVE_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/parse/cst", "visit.SKIP")
    @js.native
    def SKIP: js.Symbol = js.native
    inline def SKIP_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIP")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/parse/cst", "visit.itemAtPath")
    @js.native
    def itemAtPath: js.Function2[
        /* cst */ Document | CollectionItem, 
        /* path */ VisitPath, 
        js.UndefOr[CollectionItem]
      ] = js.native
    inline def itemAtPath_=(
      x: js.Function2[
          /* cst */ Document | CollectionItem, 
          /* path */ VisitPath, 
          js.UndefOr[CollectionItem]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemAtPath")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/parse/cst", "visit.parentCollection")
    @js.native
    def parentCollection: js.Function2[
        /* cst */ Document | CollectionItem, 
        /* path */ VisitPath, 
        BlockMap | BlockSequence | FlowCollection
      ] = js.native
    inline def parentCollection_=(
      x: js.Function2[
          /* cst */ Document | CollectionItem, 
          /* path */ VisitPath, 
          BlockMap | BlockSequence | FlowCollection
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentCollection")(x.asInstanceOf[js.Any])
  }
  
  trait BlockMap
    extends StObject
       with Token {
    
    var indent: Double
    
    var items: js.Array[Sep | Start]
    
    var offset: Double
    
    var `type`: `block-map`
  }
  object BlockMap {
    
    inline def apply(indent: Double, items: js.Array[Sep | Start], offset: Double): BlockMap = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("block-map")
      __obj.asInstanceOf[BlockMap]
    }
    
    extension [Self <: BlockMap](x: Self) {
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Sep | Start]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: (Sep | Start)*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setType(value: `block-map`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlockScalar
    extends StObject
       with Token {
    
    var indent: Double
    
    var offset: Double
    
    var props: js.Array[Token]
    
    var source: String
    
    var `type`: `block-scalar`
  }
  object BlockScalar {
    
    inline def apply(indent: Double, offset: Double, props: js.Array[Token], source: String): BlockScalar = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("block-scalar")
      __obj.asInstanceOf[BlockScalar]
    }
    
    extension [Self <: BlockScalar](x: Self) {
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setProps(value: js.Array[Token]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsVarargs(value: Token*): Self = StObject.set(x, "props", js.Array(value*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: `block-scalar`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlockSequence
    extends StObject
       with Token {
    
    var indent: Double
    
    var items: js.Array[KeySep]
    
    var offset: Double
    
    var `type`: `block-seq`
  }
  object BlockSequence {
    
    inline def apply(indent: Double, items: js.Array[KeySep], offset: Double): BlockSequence = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("block-seq")
      __obj.asInstanceOf[BlockSequence]
    }
    
    extension [Self <: BlockSequence](x: Self) {
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[KeySep]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: KeySep*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setType(value: `block-seq`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollectionItem extends StObject {
    
    var key: js.UndefOr[Token | Null] = js.undefined
    
    var sep: js.UndefOr[js.Array[SourceToken]] = js.undefined
    
    var start: js.Array[SourceToken]
    
    var value: js.UndefOr[Token] = js.undefined
  }
  object CollectionItem {
    
    inline def apply(start: js.Array[SourceToken]): CollectionItem = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionItem]
    }
    
    extension [Self <: CollectionItem](x: Self) {
      
      inline def setKey(value: Token): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setSep(value: js.Array[SourceToken]): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      inline def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
      
      inline def setSepVarargs(value: SourceToken*): Self = StObject.set(x, "sep", js.Array(value*))
      
      inline def setStart(value: js.Array[SourceToken]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartVarargs(value: SourceToken*): Self = StObject.set(x, "start", js.Array(value*))
      
      inline def setValue(value: Token): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Directive
    extends StObject
       with Token {
    
    var offset: Double
    
    var source: String
    
    var `type`: directive
  }
  object Directive {
    
    inline def apply(offset: Double, source: String): Directive = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("directive")
      __obj.asInstanceOf[Directive]
    }
    
    extension [Self <: Directive](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: directive): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Document
    extends StObject
       with Token {
    
    var end: js.UndefOr[js.Array[SourceToken]] = js.undefined
    
    var offset: Double
    
    var start: js.Array[SourceToken]
    
    var `type`: document
    
    var value: js.UndefOr[Token] = js.undefined
  }
  object Document {
    
    inline def apply(offset: Double, start: js.Array[SourceToken]): Document = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("document")
      __obj.asInstanceOf[Document]
    }
    
    extension [Self <: Document](x: Self) {
      
      inline def setEnd(value: js.Array[SourceToken]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: SourceToken*): Self = StObject.set(x, "end", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setStart(value: js.Array[SourceToken]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartVarargs(value: SourceToken*): Self = StObject.set(x, "start", js.Array(value*))
      
      inline def setType(value: document): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Token): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DocumentEnd
    extends StObject
       with Token {
    
    var end: js.UndefOr[js.Array[SourceToken]] = js.undefined
    
    var offset: Double
    
    var source: String
    
    var `type`: `doc-end`
  }
  object DocumentEnd {
    
    inline def apply(offset: Double, source: String): DocumentEnd = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("doc-end")
      __obj.asInstanceOf[DocumentEnd]
    }
    
    extension [Self <: DocumentEnd](x: Self) {
      
      inline def setEnd(value: js.Array[SourceToken]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: SourceToken*): Self = StObject.set(x, "end", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: `doc-end`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorToken
    extends StObject
       with Token {
    
    var message: String
    
    var offset: Double
    
    var source: String
    
    var `type`: error
  }
  object ErrorToken {
    
    inline def apply(message: String, offset: Double, source: String): ErrorToken = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[ErrorToken]
    }
    
    extension [Self <: ErrorToken](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowCollection
    extends StObject
       with Token {
    
    var end: js.Array[SourceToken]
    
    var indent: Double
    
    var items: js.Array[CollectionItem]
    
    var offset: Double
    
    var start: SourceToken
    
    var `type`: `flow-collection`
  }
  object FlowCollection {
    
    inline def apply(
      end: js.Array[SourceToken],
      indent: Double,
      items: js.Array[CollectionItem],
      offset: Double,
      start: SourceToken
    ): FlowCollection = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("flow-collection")
      __obj.asInstanceOf[FlowCollection]
    }
    
    extension [Self <: FlowCollection](x: Self) {
      
      inline def setEnd(value: js.Array[SourceToken]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndVarargs(value: SourceToken*): Self = StObject.set(x, "end", js.Array(value*))
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[CollectionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: CollectionItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setStart(value: SourceToken): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: `flow-collection`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowScalar
    extends StObject
       with Token {
    
    var end: js.UndefOr[js.Array[SourceToken]] = js.undefined
    
    var indent: Double
    
    var offset: Double
    
    var source: String
    
    var `type`: alias | scalar | `single-quoted-scalar` | `double-quoted-scalar`
  }
  object FlowScalar {
    
    inline def apply(
      indent: Double,
      offset: Double,
      source: String,
      `type`: alias | scalar | `single-quoted-scalar` | `double-quoted-scalar`
    ): FlowScalar = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowScalar]
    }
    
    extension [Self <: FlowScalar](x: Self) {
      
      inline def setEnd(value: js.Array[SourceToken]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: SourceToken*): Self = StObject.set(x, "end", js.Array(value*))
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: alias | scalar | `single-quoted-scalar` | `double-quoted-scalar`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceToken
    extends StObject
       with Token {
    
    var indent: Double
    
    var offset: Double
    
    var source: String
    
    var `type`: `byte-order-mark` | `doc-mode` | `doc-start` | space | comment | newline | `directive-line` | anchor | tag | `seq-item-ind` | `explicit-key-ind` | `map-value-ind` | `flow-map-start` | `flow-map-end` | `flow-seq-start` | `flow-seq-end` | `flow-error-end` | comma | `block-scalar-header`
  }
  object SourceToken {
    
    inline def apply(
      indent: Double,
      offset: Double,
      source: String,
      `type`: `byte-order-mark` | `doc-mode` | `doc-start` | space | comment | newline | `directive-line` | anchor | tag | `seq-item-ind` | `explicit-key-ind` | `map-value-ind` | `flow-map-start` | `flow-map-end` | `flow-seq-start` | `flow-seq-end` | `flow-error-end` | comma | `block-scalar-header`
    ): SourceToken = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceToken]
    }
    
    extension [Self <: SourceToken](x: Self) {
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: `byte-order-mark` | `doc-mode` | `doc-start` | space | comment | newline | `directive-line` | anchor | tag | `seq-item-ind` | `explicit-key-ind` | `map-value-ind` | `flow-map-start` | `flow-map-end` | `flow-seq-start` | `flow-seq-end` | `flow-error-end` | comma | `block-scalar-header`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.yaml.distParseCstMod.SourceToken
    - typings.yaml.distParseCstMod.ErrorToken
    - typings.yaml.distParseCstMod.Directive
    - typings.yaml.distParseCstMod.Document
    - typings.yaml.distParseCstMod.DocumentEnd
    - typings.yaml.distParseCstMod.FlowScalar
    - typings.yaml.distParseCstMod.BlockScalar
    - typings.yaml.distParseCstMod.BlockMap
    - typings.yaml.distParseCstMod.BlockSequence
    - typings.yaml.distParseCstMod.FlowCollection
  */
  trait Token extends StObject
  object Token {
    
    inline def BlockMap(indent: Double, items: js.Array[Sep | Start], offset: Double): typings.yaml.distParseCstMod.BlockMap = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("block-map")
      __obj.asInstanceOf[typings.yaml.distParseCstMod.BlockMap]
    }
    
    inline def BlockScalar(indent: Double, offset: Double, props: js.Array[Token], source: String): typings.yaml.distParseCstMod.BlockScalar = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("block-scalar")
      __obj.asInstanceOf[typings.yaml.distParseCstMod.BlockScalar]
    }
    
    inline def BlockSequence(indent: Double, items: js.Array[KeySep], offset: Double): typings.yaml.distParseCstMod.BlockSequence = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("block-seq")
      __obj.asInstanceOf[typings.yaml.distParseCstMod.BlockSequence]
    }
    
    inline def Directive(offset: Double, source: String): typings.yaml.distParseCstMod.Directive = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("directive")
      __obj.asInstanceOf[typings.yaml.distParseCstMod.Directive]
    }
    
    inline def Document(offset: Double, start: js.Array[SourceToken]): typings.yaml.distParseCstMod.Document = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("document")
      __obj.asInstanceOf[typings.yaml.distParseCstMod.Document]
    }
    
    inline def DocumentEnd(offset: Double, source: String): typings.yaml.distParseCstMod.DocumentEnd = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("doc-end")
      __obj.asInstanceOf[typings.yaml.distParseCstMod.DocumentEnd]
    }
    
    inline def ErrorToken(message: String, offset: Double, source: String): typings.yaml.distParseCstMod.ErrorToken = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[typings.yaml.distParseCstMod.ErrorToken]
    }
    
    inline def FlowCollection(
      end: js.Array[SourceToken],
      indent: Double,
      items: js.Array[CollectionItem],
      offset: Double,
      start: SourceToken
    ): typings.yaml.distParseCstMod.FlowCollection = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("flow-collection")
      __obj.asInstanceOf[typings.yaml.distParseCstMod.FlowCollection]
    }
    
    inline def FlowScalar(
      indent: Double,
      offset: Double,
      source: String,
      `type`: alias | scalar | `single-quoted-scalar` | `double-quoted-scalar`
    ): typings.yaml.distParseCstMod.FlowScalar = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yaml.distParseCstMod.FlowScalar]
    }
    
    inline def SourceToken(
      indent: Double,
      offset: Double,
      source: String,
      `type`: `byte-order-mark` | `doc-mode` | `doc-start` | space | comment | newline | `directive-line` | anchor | tag | `seq-item-ind` | `explicit-key-ind` | `map-value-ind` | `flow-map-start` | `flow-map-end` | `flow-seq-start` | `flow-seq-end` | `flow-error-end` | comma | `block-scalar-header`
    ): typings.yaml.distParseCstMod.SourceToken = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yaml.distParseCstMod.SourceToken]
    }
  }
  
  /* Inlined yaml.yaml/dist/parse/cst.SourceToken['type'] | yaml.yaml/dist/parse/cst.DocumentEnd['type'] | yaml.yaml/dist/parse/cst.FlowScalar['type'] */
  /* Rewritten from type alias, can be one of: 
    - typings.yaml.yamlStrings.newline
    - typings.yaml.yamlStrings.`map-value-ind`
    - typings.yaml.yamlStrings.`double-quoted-scalar`
    - typings.yaml.yamlStrings.`seq-item-ind`
    - typings.yaml.yamlStrings.`flow-seq-start`
    - typings.yaml.yamlStrings.`flow-error-end`
    - typings.yaml.yamlStrings.`flow-map-end`
    - typings.yaml.yamlStrings.comment
    - typings.yaml.yamlStrings.`flow-map-start`
    - typings.yaml.yamlStrings.`byte-order-mark`
    - typings.yaml.yamlStrings.`directive-line`
    - typings.yaml.yamlStrings.alias
    - typings.yaml.yamlStrings.`explicit-key-ind`
    - typings.yaml.yamlStrings.`block-scalar-header`
    - typings.yaml.yamlStrings.`flow-seq-end`
    - typings.yaml.yamlStrings.anchor
    - typings.yaml.yamlStrings.comma
    - typings.yaml.yamlStrings.space
    - typings.yaml.yamlStrings.tag
    - typings.yaml.yamlStrings.`single-quoted-scalar`
    - typings.yaml.yamlStrings.`doc-end`
    - typings.yaml.yamlStrings.scalar
    - typings.yaml.yamlStrings.`doc-mode`
    - typings.yaml.yamlStrings.`doc-start`
  */
  trait TokenType_ extends StObject
  object TokenType_ {
    
    inline def alias: typings.yaml.yamlStrings.alias = "alias".asInstanceOf[typings.yaml.yamlStrings.alias]
    
    inline def anchor: typings.yaml.yamlStrings.anchor = "anchor".asInstanceOf[typings.yaml.yamlStrings.anchor]
    
    inline def `block-scalar-header`: typings.yaml.yamlStrings.`block-scalar-header` = "block-scalar-header".asInstanceOf[typings.yaml.yamlStrings.`block-scalar-header`]
    
    inline def `byte-order-mark`: typings.yaml.yamlStrings.`byte-order-mark` = "byte-order-mark".asInstanceOf[typings.yaml.yamlStrings.`byte-order-mark`]
    
    inline def comma: typings.yaml.yamlStrings.comma = "comma".asInstanceOf[typings.yaml.yamlStrings.comma]
    
    inline def comment: typings.yaml.yamlStrings.comment = "comment".asInstanceOf[typings.yaml.yamlStrings.comment]
    
    inline def `directive-line`: typings.yaml.yamlStrings.`directive-line` = "directive-line".asInstanceOf[typings.yaml.yamlStrings.`directive-line`]
    
    inline def `doc-end`: typings.yaml.yamlStrings.`doc-end` = "doc-end".asInstanceOf[typings.yaml.yamlStrings.`doc-end`]
    
    inline def `doc-mode`: typings.yaml.yamlStrings.`doc-mode` = "doc-mode".asInstanceOf[typings.yaml.yamlStrings.`doc-mode`]
    
    inline def `doc-start`: typings.yaml.yamlStrings.`doc-start` = "doc-start".asInstanceOf[typings.yaml.yamlStrings.`doc-start`]
    
    inline def `double-quoted-scalar`: typings.yaml.yamlStrings.`double-quoted-scalar` = "double-quoted-scalar".asInstanceOf[typings.yaml.yamlStrings.`double-quoted-scalar`]
    
    inline def `explicit-key-ind`: typings.yaml.yamlStrings.`explicit-key-ind` = "explicit-key-ind".asInstanceOf[typings.yaml.yamlStrings.`explicit-key-ind`]
    
    inline def `flow-error-end`: typings.yaml.yamlStrings.`flow-error-end` = "flow-error-end".asInstanceOf[typings.yaml.yamlStrings.`flow-error-end`]
    
    inline def `flow-map-end`: typings.yaml.yamlStrings.`flow-map-end` = "flow-map-end".asInstanceOf[typings.yaml.yamlStrings.`flow-map-end`]
    
    inline def `flow-map-start`: typings.yaml.yamlStrings.`flow-map-start` = "flow-map-start".asInstanceOf[typings.yaml.yamlStrings.`flow-map-start`]
    
    inline def `flow-seq-end`: typings.yaml.yamlStrings.`flow-seq-end` = "flow-seq-end".asInstanceOf[typings.yaml.yamlStrings.`flow-seq-end`]
    
    inline def `flow-seq-start`: typings.yaml.yamlStrings.`flow-seq-start` = "flow-seq-start".asInstanceOf[typings.yaml.yamlStrings.`flow-seq-start`]
    
    inline def `map-value-ind`: typings.yaml.yamlStrings.`map-value-ind` = "map-value-ind".asInstanceOf[typings.yaml.yamlStrings.`map-value-ind`]
    
    inline def newline: typings.yaml.yamlStrings.newline = "newline".asInstanceOf[typings.yaml.yamlStrings.newline]
    
    inline def scalar: typings.yaml.yamlStrings.scalar = "scalar".asInstanceOf[typings.yaml.yamlStrings.scalar]
    
    inline def `seq-item-ind`: typings.yaml.yamlStrings.`seq-item-ind` = "seq-item-ind".asInstanceOf[typings.yaml.yamlStrings.`seq-item-ind`]
    
    inline def `single-quoted-scalar`: typings.yaml.yamlStrings.`single-quoted-scalar` = "single-quoted-scalar".asInstanceOf[typings.yaml.yamlStrings.`single-quoted-scalar`]
    
    inline def space: typings.yaml.yamlStrings.space = "space".asInstanceOf[typings.yaml.yamlStrings.space]
    
    inline def tag: typings.yaml.yamlStrings.tag = "tag".asInstanceOf[typings.yaml.yamlStrings.tag]
  }
}
