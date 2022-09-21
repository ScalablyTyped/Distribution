package typings.yaml

import typings.yaml.aliasMod.Alias
import typings.yaml.anon.RequiredOmitParseOptionsD
import typings.yaml.anon.ToJSOptionsignoredstringu
import typings.yaml.directivesMod.Directives
import typings.yaml.errorsMod.YAMLError
import typings.yaml.errorsMod.YAMLWarning
import typings.yaml.nodeMod.Node
import typings.yaml.nodeMod.NodeType
import typings.yaml.nodeMod.ParsedNode
import typings.yaml.nodeMod.Range
import typings.yaml.optionsMod.CreateNodeOptions
import typings.yaml.optionsMod.DocumentOptions
import typings.yaml.optionsMod.ParseOptions
import typings.yaml.optionsMod.SchemaOptions
import typings.yaml.optionsMod.ToStringOptions
import typings.yaml.pairMod.Pair
import typings.yaml.scalarMod.Scalar
import typings.yaml.schemaSchemaMod.Schema
import typings.yaml.yamlStrings.`1Dot1`
import typings.yaml.yamlStrings.`1Dot2`
import typings.yaml.yamlStrings.next
import typings.yaml.yamlmapMod.YAMLMap
import typings.yaml.yamlseqMod.YAMLSeq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentMod {
  
  @JSImport("yaml/dist/doc/Document", "Document")
  @js.native
  /**
    * @param value - The initial value for the document, which will be wrapped
    *   in a Node container.
    */
  open class Document[T /* <: Node[Any] */] () extends StObject {
    def this(value: Any) = this()
    def this(value: Any, options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions) = this()
    def this(value: Any, replacer: Replacer) = this()
    def this(value: Unit, options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions) = this()
    def this(
      value: Any,
      replacer: Null,
      options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions
    ) = this()
    def this(
      value: Any,
      replacer: Replacer,
      options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions
    ) = this()
    
    /** Adds a value to the document. */
    def add(value: Any): Unit = js.native
    
    /** Adds a value to the document. */
    def addIn(path: js.Iterable[Any], value: Any): Unit = js.native
    
    /** A comment immediately after this Document */
    var comment: String | Null = js.native
    
    /** A comment before this Document */
    var commentBefore: String | Null = js.native
    
    /** The document contents. */
    var contents: T | Null = js.native
    
    /**
      * Create a new `Alias` node, ensuring that the target `node` has the required anchor.
      *
      * If `node` already has an anchor, `name` is ignored.
      * Otherwise, the `node.anchor` value will be set to `name`,
      * or if an anchor with that name is already present in the document,
      * `name` will be used as a prefix for a new unique anchor.
      * If `name` is undefined, the generated anchor will use 'a' as a prefix.
      */
    def createAlias(node: Scalar[Any]): Alias = js.native
    def createAlias(node: Scalar[Any], name: String): Alias = js.native
    def createAlias(node: YAMLMap[Any, Any]): Alias = js.native
    def createAlias(node: YAMLMap[Any, Any], name: String): Alias = js.native
    def createAlias(node: YAMLSeq[Any]): Alias = js.native
    def createAlias(node: YAMLSeq[Any], name: String): Alias = js.native
    
    /**
      * Convert any value into a `Node` using the current schema, recursively
      * turning objects into collections.
      */
    def createNode[T](value: T): NodeType[T] = js.native
    def createNode[T](value: T, options: CreateNodeOptions): NodeType[T] = js.native
    def createNode[T](value: T, replacer: Null, options: CreateNodeOptions): NodeType[T] = js.native
    def createNode[T](value: T, replacer: Replacer): NodeType[T] = js.native
    def createNode[T](value: T, replacer: Replacer, options: CreateNodeOptions): NodeType[T] = js.native
    def createNode[T](value: T, replacer: CreateNodeOptions, options: CreateNodeOptions): NodeType[T] = js.native
    
    /**
      * Convert a key and a value into a `Pair` using the current schema,
      * recursively wrapping all values as `Scalar` or `Collection` nodes.
      */
    def createPair[K /* <: Node[Any] */, V /* <: Node[Any] */](key: Any, value: Any): Pair[K, V] = js.native
    def createPair[K /* <: Node[Any] */, V /* <: Node[Any] */](key: Any, value: Any, options: CreateNodeOptions): Pair[K, V] = js.native
    
    /**
      * Removes a value from the document.
      * @returns `true` if the item was found and removed.
      */
    def delete(key: Any): Boolean = js.native
    
    /**
      * Removes a value from the document.
      * @returns `true` if the item was found and removed.
      */
    def deleteIn(): Boolean = js.native
    def deleteIn(path: js.Iterable[Any]): Boolean = js.native
    
    var directives: js.UndefOr[Directives] = js.native
    
    /** Errors encountered during parsing. */
    var errors: js.Array[YAMLError] = js.native
    
    /**
      * Returns item at `key`, or `undefined` if not found. By default unwraps
      * scalar values from their surrounding node; to disable set `keepScalar` to
      * `true` (collections are always returned intact).
      */
    def get(key: Any): Any = js.native
    def get(key: Any, keepScalar: Boolean): Any = js.native
    
    /**
      * Returns item at `path`, or `undefined` if not found. By default unwraps
      * scalar values from their surrounding node; to disable set `keepScalar` to
      * `true` (collections are always returned intact).
      */
    def getIn(): Any = js.native
    def getIn(path: js.Iterable[Any]): Any = js.native
    def getIn(path: js.Iterable[Any], keepScalar: Boolean): Any = js.native
    def getIn(path: Null, keepScalar: Boolean): Any = js.native
    
    /**
      * Checks if the document includes a value with the key `key`.
      */
    def has(key: Any): Boolean = js.native
    
    /**
      * Checks if the document includes a value at `path`.
      */
    def hasIn(): Boolean = js.native
    def hasIn(path: js.Iterable[Any]): Boolean = js.native
    
    var options: RequiredOmitParseOptionsD = js.native
    
    /**
      * The `[start, value-end, node-end]` character offsets for the part of the
      * source parsed into this document (undefined if not parsed). The `value-end`
      * and `node-end` positions are themselves not included in their respective
      * ranges.
      */
    var range: js.UndefOr[Range] = js.native
    
    /** The schema used with the document. Use `setSchema()` to change. */
    var schema: Schema = js.native
    
    /**
      * Sets a value in this document. For `!!set`, `value` needs to be a
      * boolean to add/remove the item from the set.
      */
    def set(key: Any, value: Any): Unit = js.native
    
    /**
      * Sets a value in this document. For `!!set`, `value` needs to be a
      * boolean to add/remove the item from the set.
      */
    def setIn(path: js.Iterable[Any], value: Any): Unit = js.native
    def setIn(path: Null, value: Any): Unit = js.native
    
    /**
      * Change the YAML version and schema used by the document.
      * A `null` version disables support for directives, explicit tags, anchors, and aliases.
      * It also requires the `schema` option to be given as a `Schema` instance value.
      *
      * Overrides all previously set schema options.
      */
    def setSchema(): Unit = js.native
    def setSchema(version: `1Dot1` | `1Dot2` | next): Unit = js.native
    def setSchema(version: `1Dot1` | `1Dot2` | next, options: SchemaOptions): Unit = js.native
    def setSchema(version: Null, options: SchemaOptions): Unit = js.native
    
    /** A plain JavaScript representation of the document `contents`. */
    def toJS(): Any = js.native
    def toJS(opt: ToJSOptionsignoredstringu): Any = js.native
    
    /**
      * A JSON representation of the document `contents`.
      *
      * @param jsonArg Used by `JSON.stringify` to indicate the array index or
      *   property name.
      */
    def toJSON(): Any = js.native
    def toJSON(jsonArg: String): Any = js.native
    def toJSON(jsonArg: String, onAnchor: js.UndefOr[js.Function2[/* value */ Any, /* count */ Double, Unit]]): Any = js.native
    def toJSON(jsonArg: Null, onAnchor: js.UndefOr[js.Function2[/* value */ Any, /* count */ Double, Unit]]): Any = js.native
    def toJSON(jsonArg: Unit, onAnchor: js.UndefOr[js.Function2[/* value */ Any, /* count */ Double, Unit]]): Any = js.native
    
    def toString(options: ToStringOptions): String = js.native
    
    /** Warnings encountered during parsing. */
    var warnings: js.Array[YAMLWarning] = js.native
  }
  object Document {
    
    @js.native
    trait Parsed[T /* <: ParsedNode */] extends Document[T] {
      
      @JSName("directives")
      var directives_Parsed: Directives = js.native
      
      @JSName("range")
      var range_Parsed: Range = js.native
    }
  }
  
  type Replacer = js.Array[Any] | (js.Function2[/* key */ Any, /* value */ Any, Any])
}
