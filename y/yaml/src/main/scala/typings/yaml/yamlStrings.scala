package typings.yaml

import typings.yaml.distErrorsMod.ErrorCode
import typings.yaml.distLogMod.LogLevelId
import typings.yaml.distParseCstMod.TokenType_
import typings.yaml.distSchemaTagsMod.TagId
import typings.yaml.distStringifyFoldFlowLinesMod.FoldMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yamlStrings {
  
  @js.native
  sealed trait `1Dot1` extends StObject
  inline def `1Dot1`: `1Dot1` = "1.1".asInstanceOf[`1Dot1`]
  
  @js.native
  sealed trait `1Dot2` extends StObject
  inline def `1Dot2`: `1Dot2` = "1.2".asInstanceOf[`1Dot2`]
  
  @js.native
  sealed trait ALIAS_PROPS
    extends StObject
       with ErrorCode
  inline def ALIAS_PROPS: ALIAS_PROPS = "ALIAS_PROPS".asInstanceOf[ALIAS_PROPS]
  
  @js.native
  sealed trait BAD_ALIAS
    extends StObject
       with ErrorCode
  inline def BAD_ALIAS: BAD_ALIAS = "BAD_ALIAS".asInstanceOf[BAD_ALIAS]
  
  @js.native
  sealed trait BAD_DIRECTIVE
    extends StObject
       with ErrorCode
  inline def BAD_DIRECTIVE: BAD_DIRECTIVE = "BAD_DIRECTIVE".asInstanceOf[BAD_DIRECTIVE]
  
  @js.native
  sealed trait BAD_DQ_ESCAPE
    extends StObject
       with ErrorCode
  inline def BAD_DQ_ESCAPE: BAD_DQ_ESCAPE = "BAD_DQ_ESCAPE".asInstanceOf[BAD_DQ_ESCAPE]
  
  @js.native
  sealed trait BAD_INDENT
    extends StObject
       with ErrorCode
  inline def BAD_INDENT: BAD_INDENT = "BAD_INDENT".asInstanceOf[BAD_INDENT]
  
  @js.native
  sealed trait BAD_PROP_ORDER
    extends StObject
       with ErrorCode
  inline def BAD_PROP_ORDER: BAD_PROP_ORDER = "BAD_PROP_ORDER".asInstanceOf[BAD_PROP_ORDER]
  
  @js.native
  sealed trait BAD_SCALAR_START
    extends StObject
       with ErrorCode
  inline def BAD_SCALAR_START: BAD_SCALAR_START = "BAD_SCALAR_START".asInstanceOf[BAD_SCALAR_START]
  
  @js.native
  sealed trait BLOCK_AS_IMPLICIT_KEY
    extends StObject
       with ErrorCode
  inline def BLOCK_AS_IMPLICIT_KEY: BLOCK_AS_IMPLICIT_KEY = "BLOCK_AS_IMPLICIT_KEY".asInstanceOf[BLOCK_AS_IMPLICIT_KEY]
  
  @js.native
  sealed trait BLOCK_FOLDED extends StObject
  inline def BLOCK_FOLDED: BLOCK_FOLDED = "BLOCK_FOLDED".asInstanceOf[BLOCK_FOLDED]
  
  @js.native
  sealed trait BLOCK_IN_FLOW
    extends StObject
       with ErrorCode
  inline def BLOCK_IN_FLOW: BLOCK_IN_FLOW = "BLOCK_IN_FLOW".asInstanceOf[BLOCK_IN_FLOW]
  
  @js.native
  sealed trait BLOCK_LITERAL extends StObject
  inline def BLOCK_LITERAL: BLOCK_LITERAL = "BLOCK_LITERAL".asInstanceOf[BLOCK_LITERAL]
  
  @js.native
  sealed trait DUPLICATE_KEY
    extends StObject
       with ErrorCode
  inline def DUPLICATE_KEY: DUPLICATE_KEY = "DUPLICATE_KEY".asInstanceOf[DUPLICATE_KEY]
  
  @js.native
  sealed trait IMPOSSIBLE
    extends StObject
       with ErrorCode
  inline def IMPOSSIBLE: IMPOSSIBLE = "IMPOSSIBLE".asInstanceOf[IMPOSSIBLE]
  
  @js.native
  sealed trait KEY_OVER_1024_CHARS
    extends StObject
       with ErrorCode
  inline def KEY_OVER_1024_CHARS: KEY_OVER_1024_CHARS = "KEY_OVER_1024_CHARS".asInstanceOf[KEY_OVER_1024_CHARS]
  
  @js.native
  sealed trait Leftcurlybracket extends StObject
  inline def Leftcurlybracket: Leftcurlybracket = "{".asInstanceOf[Leftcurlybracket]
  
  @js.native
  sealed trait MISSING_CHAR
    extends StObject
       with ErrorCode
  inline def MISSING_CHAR: MISSING_CHAR = "MISSING_CHAR".asInstanceOf[MISSING_CHAR]
  
  @js.native
  sealed trait MULTILINE_IMPLICIT_KEY
    extends StObject
       with ErrorCode
  inline def MULTILINE_IMPLICIT_KEY: MULTILINE_IMPLICIT_KEY = "MULTILINE_IMPLICIT_KEY".asInstanceOf[MULTILINE_IMPLICIT_KEY]
  
  @js.native
  sealed trait MULTIPLE_ANCHORS
    extends StObject
       with ErrorCode
  inline def MULTIPLE_ANCHORS: MULTIPLE_ANCHORS = "MULTIPLE_ANCHORS".asInstanceOf[MULTIPLE_ANCHORS]
  
  @js.native
  sealed trait MULTIPLE_DOCS
    extends StObject
       with ErrorCode
  inline def MULTIPLE_DOCS: MULTIPLE_DOCS = "MULTIPLE_DOCS".asInstanceOf[MULTIPLE_DOCS]
  
  @js.native
  sealed trait MULTIPLE_TAGS
    extends StObject
       with ErrorCode
  inline def MULTIPLE_TAGS: MULTIPLE_TAGS = "MULTIPLE_TAGS".asInstanceOf[MULTIPLE_TAGS]
  
  @js.native
  sealed trait PLAIN extends StObject
  inline def PLAIN: PLAIN = "PLAIN".asInstanceOf[PLAIN]
  
  @js.native
  sealed trait QUOTE_DOUBLE extends StObject
  inline def QUOTE_DOUBLE: QUOTE_DOUBLE = "QUOTE_DOUBLE".asInstanceOf[QUOTE_DOUBLE]
  
  @js.native
  sealed trait QUOTE_SINGLE extends StObject
  inline def QUOTE_SINGLE: QUOTE_SINGLE = "QUOTE_SINGLE".asInstanceOf[QUOTE_SINGLE]
  
  @js.native
  sealed trait Rightcurlybracket extends StObject
  inline def Rightcurlybracket: Rightcurlybracket = "}".asInstanceOf[Rightcurlybracket]
  
  @js.native
  sealed trait TAB_AS_INDENT
    extends StObject
       with ErrorCode
  inline def TAB_AS_INDENT: TAB_AS_INDENT = "TAB_AS_INDENT".asInstanceOf[TAB_AS_INDENT]
  
  @js.native
  sealed trait TAG_RESOLVE_FAILED
    extends StObject
       with ErrorCode
  inline def TAG_RESOLVE_FAILED: TAG_RESOLVE_FAILED = "TAG_RESOLVE_FAILED".asInstanceOf[TAG_RESOLVE_FAILED]
  
  @js.native
  sealed trait UNEXPECTED_TOKEN
    extends StObject
       with ErrorCode
  inline def UNEXPECTED_TOKEN: UNEXPECTED_TOKEN = "UNEXPECTED_TOKEN".asInstanceOf[UNEXPECTED_TOKEN]
  
  @js.native
  sealed trait YAMLParseError extends StObject
  inline def YAMLParseError: YAMLParseError = "YAMLParseError".asInstanceOf[YAMLParseError]
  
  @js.native
  sealed trait YAMLWarning extends StObject
  inline def YAMLWarning: YAMLWarning = "YAMLWarning".asInstanceOf[YAMLWarning]
  
  @js.native
  sealed trait `[` extends StObject
  inline def `[`: `[` = "[".asInstanceOf[`[`]
  
  @js.native
  sealed trait `]` extends StObject
  inline def `]`: `]` = "]".asInstanceOf[`]`]
  
  @js.native
  sealed trait alias
    extends StObject
       with TokenType_
  inline def alias: alias = "alias".asInstanceOf[alias]
  
  @js.native
  sealed trait anchor
    extends StObject
       with TokenType_
  inline def anchor: anchor = "anchor".asInstanceOf[anchor]
  
  @js.native
  sealed trait any extends StObject
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait array
    extends StObject
       with JsonType
  inline def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait binary
    extends StObject
       with TagId
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait block
    extends StObject
       with FoldMode
  inline def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait `block-map` extends StObject
  inline def `block-map`: `block-map` = "block-map".asInstanceOf[`block-map`]
  
  @js.native
  sealed trait `block-scalar` extends StObject
  inline def `block-scalar`: `block-scalar` = "block-scalar".asInstanceOf[`block-scalar`]
  
  @js.native
  sealed trait `block-scalar-header`
    extends StObject
       with TokenType_
  inline def `block-scalar-header`: `block-scalar-header` = "block-scalar-header".asInstanceOf[`block-scalar-header`]
  
  @js.native
  sealed trait `block-seq` extends StObject
  inline def `block-seq`: `block-seq` = "block-seq".asInstanceOf[`block-seq`]
  
  @js.native
  sealed trait bool
    extends StObject
       with TagId
  inline def bool: bool = "bool".asInstanceOf[bool]
  
  @js.native
  sealed trait boolean
    extends StObject
       with JsonType
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait `byte-order-mark`
    extends StObject
       with TokenType_
  inline def `byte-order-mark`: `byte-order-mark` = "byte-order-mark".asInstanceOf[`byte-order-mark`]
  
  @js.native
  sealed trait comma
    extends StObject
       with TokenType_
  inline def comma: comma = "comma".asInstanceOf[comma]
  
  @js.native
  sealed trait comment
    extends StObject
       with TokenType_
  inline def comment: comment = "comment".asInstanceOf[comment]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevelId
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait directive extends StObject
  inline def directive: directive = "directive".asInstanceOf[directive]
  
  @js.native
  sealed trait `directive-line`
    extends StObject
       with TokenType_
  inline def `directive-line`: `directive-line` = "directive-line".asInstanceOf[`directive-line`]
  
  @js.native
  sealed trait `doc-end`
    extends StObject
       with TokenType_
  inline def `doc-end`: `doc-end` = "doc-end".asInstanceOf[`doc-end`]
  
  @js.native
  sealed trait `doc-mode`
    extends StObject
       with TokenType_
  inline def `doc-mode`: `doc-mode` = "doc-mode".asInstanceOf[`doc-mode`]
  
  @js.native
  sealed trait `doc-start`
    extends StObject
       with TokenType_
  inline def `doc-start`: `doc-start` = "doc-start".asInstanceOf[`doc-start`]
  
  @js.native
  sealed trait document extends StObject
  inline def document: document = "document".asInstanceOf[document]
  
  @js.native
  sealed trait `double-quoted-scalar`
    extends StObject
       with TokenType_
  inline def `double-quoted-scalar`: `double-quoted-scalar` = "double-quoted-scalar".asInstanceOf[`double-quoted-scalar`]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevelId
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait `explicit-key-ind`
    extends StObject
       with TokenType_
  inline def `explicit-key-ind`: `explicit-key-ind` = "explicit-key-ind".asInstanceOf[`explicit-key-ind`]
  
  @js.native
  sealed trait float
    extends StObject
       with TagId
  inline def float: float = "float".asInstanceOf[float]
  
  @js.native
  sealed trait floatExp
    extends StObject
       with TagId
  inline def floatExp: floatExp = "floatExp".asInstanceOf[floatExp]
  
  @js.native
  sealed trait floatNaN
    extends StObject
       with TagId
  inline def floatNaN: floatNaN = "floatNaN".asInstanceOf[floatNaN]
  
  @js.native
  sealed trait floatTime
    extends StObject
       with TagId
  inline def floatTime: floatTime = "floatTime".asInstanceOf[floatTime]
  
  @js.native
  sealed trait flow
    extends StObject
       with FoldMode
  inline def flow: flow = "flow".asInstanceOf[flow]
  
  @js.native
  sealed trait `flow map` extends StObject
  inline def `flow map`: `flow map` = ("flow map").asInstanceOf[`flow map`]
  
  @js.native
  sealed trait `flow sequence` extends StObject
  inline def `flow sequence`: `flow sequence` = ("flow sequence").asInstanceOf[`flow sequence`]
  
  @js.native
  sealed trait `flow-collection` extends StObject
  inline def `flow-collection`: `flow-collection` = "flow-collection".asInstanceOf[`flow-collection`]
  
  @js.native
  sealed trait `flow-error-end`
    extends StObject
       with TokenType_
  inline def `flow-error-end`: `flow-error-end` = "flow-error-end".asInstanceOf[`flow-error-end`]
  
  @js.native
  sealed trait `flow-map-end`
    extends StObject
       with TokenType_
  inline def `flow-map-end`: `flow-map-end` = "flow-map-end".asInstanceOf[`flow-map-end`]
  
  @js.native
  sealed trait `flow-map-start`
    extends StObject
       with TokenType_
  inline def `flow-map-start`: `flow-map-start` = "flow-map-start".asInstanceOf[`flow-map-start`]
  
  @js.native
  sealed trait `flow-seq-end`
    extends StObject
       with TokenType_
  inline def `flow-seq-end`: `flow-seq-end` = "flow-seq-end".asInstanceOf[`flow-seq-end`]
  
  @js.native
  sealed trait `flow-seq-start`
    extends StObject
       with TokenType_
  inline def `flow-seq-start`: `flow-seq-start` = "flow-seq-start".asInstanceOf[`flow-seq-start`]
  
  @js.native
  sealed trait folded extends StObject
  inline def folded: folded = "folded".asInstanceOf[folded]
  
  @js.native
  sealed trait int
    extends StObject
       with TagId
  inline def int: int = "int".asInstanceOf[int]
  
  @js.native
  sealed trait intHex
    extends StObject
       with TagId
  inline def intHex: intHex = "intHex".asInstanceOf[intHex]
  
  @js.native
  sealed trait intOct
    extends StObject
       with TagId
  inline def intOct: intOct = "intOct".asInstanceOf[intOct]
  
  @js.native
  sealed trait intTime
    extends StObject
       with TagId
  inline def intTime: intTime = "intTime".asInstanceOf[intTime]
  
  @js.native
  sealed trait integer
    extends StObject
       with JsonType
  inline def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait key extends StObject
  inline def key: key = "key".asInstanceOf[key]
  
  @js.native
  sealed trait literal extends StObject
  inline def literal: literal = "literal".asInstanceOf[literal]
  
  @js.native
  sealed trait map
    extends StObject
       with TagId
  inline def map: map = "map".asInstanceOf[map]
  
  @js.native
  sealed trait `map-value-ind`
    extends StObject
       with TokenType_
  inline def `map-value-ind`: `map-value-ind` = "map-value-ind".asInstanceOf[`map-value-ind`]
  
  @js.native
  sealed trait newline
    extends StObject
       with TokenType_
  inline def newline: newline = "newline".asInstanceOf[newline]
  
  @js.native
  sealed trait next extends StObject
  inline def next: next = "next".asInstanceOf[next]
  
  @js.native
  sealed trait `null`
    extends StObject
       with JsonType
       with TagId
  inline def `null`: `null` = "null".asInstanceOf[`null`]
  
  @js.native
  sealed trait number
    extends StObject
       with JsonType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object`
    extends StObject
       with JsonType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait omap
    extends StObject
       with TagId
  inline def omap: omap = "omap".asInstanceOf[omap]
  
  @js.native
  sealed trait pairs
    extends StObject
       with TagId
  inline def pairs: pairs = "pairs".asInstanceOf[pairs]
  
  @js.native
  sealed trait quoted
    extends StObject
       with FoldMode
  inline def quoted: quoted = "quoted".asInstanceOf[quoted]
  
  @js.native
  sealed trait scalar
    extends StObject
       with TokenType_
  inline def scalar: scalar = "scalar".asInstanceOf[scalar]
  
  @js.native
  sealed trait seq
    extends StObject
       with TagId
  inline def seq: seq = "seq".asInstanceOf[seq]
  
  @js.native
  sealed trait `seq-item-ind`
    extends StObject
       with TokenType_
  inline def `seq-item-ind`: `seq-item-ind` = "seq-item-ind".asInstanceOf[`seq-item-ind`]
  
  @js.native
  sealed trait set
    extends StObject
       with TagId
  inline def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogLevelId
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait `single-quoted-scalar`
    extends StObject
       with TokenType_
  inline def `single-quoted-scalar`: `single-quoted-scalar` = "single-quoted-scalar".asInstanceOf[`single-quoted-scalar`]
  
  @js.native
  sealed trait space
    extends StObject
       with TokenType_
  inline def space: space = "space".asInstanceOf[space]
  
  @js.native
  sealed trait string
    extends StObject
       with JsonType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait tag
    extends StObject
       with TokenType_
  inline def tag: tag = "tag".asInstanceOf[tag]
  
  @js.native
  sealed trait timestamp
    extends StObject
       with TagId
  inline def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  
  @js.native
  sealed trait value extends StObject
  inline def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevelId
  inline def warn: warn = "warn".asInstanceOf[warn]
}
