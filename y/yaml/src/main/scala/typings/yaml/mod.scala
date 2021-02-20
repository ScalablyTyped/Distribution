package typings.yaml

import typings.yaml.anon.JsonEncoding
import typings.yaml.anon.LineWidth
import typings.yaml.mod.Document.Anchors
import typings.yaml.mod.Document.Parsed
import typings.yaml.mod.Document.TagPrefix
import typings.yaml.parseCstMod.ParsedCST
import typings.yaml.typesMod.Alias
import typings.yaml.typesMod.Collection
import typings.yaml.typesMod.Merge
import typings.yaml.typesMod.Node
import typings.yaml.typesMod.Scalar
import typings.yaml.typesMod.Scalar.Type
import typings.yaml.typesMod.Schema
import typings.yaml.typesMod.Schema.Name
import typings.yaml.typesMod.Schema.Tag
import typings.yaml.typesMod.Schema.TagId
import typings.yaml.typesMod.YAMLMap
import typings.yaml.typesMod.YAMLSeq
import typings.yaml.utilMod.Type.DOCUMENT
import typings.yaml.utilMod.YAMLError
import typings.yaml.utilMod.YAMLWarning
import typings.yaml.yamlBooleans.`false`
import typings.yaml.yamlBooleans.`true`
import typings.yaml.yamlStrings.`1Dot0`
import typings.yaml.yamlStrings.`1Dot1`
import typings.yaml.yamlStrings.`1Dot2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yaml", "Document")
  @js.native
  class Document () extends Collection {
    def this(options: Options) = this()
    
    /**
      * Anchors associated with the document's nodes;
      * also provides alias & merge node creators.
      */
    var anchors: Anchors = js.native
    
    /** The document contents. */
    var contents: js.Any = js.native
    
    @JSName("cstNode")
    var cstNode_Document: js.UndefOr[typings.yaml.parseCstMod.CST.Document] = js.native
    
    var directivesEndMarker: js.UndefOr[Boolean] = js.native
    
    /** Errors encountered during parsing. */
    var errors: js.Array[YAMLError] = js.native
    
    /**
      * List the tags used in the document that are not in the default
      * `tag:yaml.org,2002:` namespace.
      */
    def listNonDefaultTags(): js.Array[String] = js.native
    
    /** Parse a CST into this document */
    def parse(cst: typings.yaml.parseCstMod.CST.Document): this.type = js.native
    
    /**
      * When a document is created with `new YAML.Document()`, the schema object is
      * not set as it may be influenced by parsed directives; call this with no
      * arguments to set it manually, or with arguments to change the schema used
      * by the document.
      **/
    def setSchema(): Unit = js.native
    def setSchema(id: js.UndefOr[`1Dot0` | `1Dot1` | `1Dot2`]): Unit = js.native
    def setSchema(id: js.UndefOr[`1Dot0` | `1Dot1` | `1Dot2`], customTags: js.Array[Tag | TagId]): Unit = js.native
    def setSchema(id: Name): Unit = js.native
    def setSchema(id: Name, customTags: js.Array[TagId | Tag]): Unit = js.native
    
    /** Set `handle` as a shorthand string for the `prefix` tag namespace. */
    def setTagPrefix(handle: String, prefix: String): Unit = js.native
    
    /**
      * Array of prefixes; each will have a string `handle` that
      * starts and ends with `!` and a string `prefix` that the handle will be replaced by.
      */
    var tagPrefixes: js.Array[TagPrefix] = js.native
    
    def toJSON(
      arg: js.UndefOr[scala.Nothing],
      onAnchor: js.Function2[/* value */ js.Any, /* count */ Double, Unit]
    ): js.Any = js.native
    def toJSON(arg: String): js.Any = js.native
    def toJSON(arg: String, onAnchor: js.Function2[/* value */ js.Any, /* count */ Double, Unit]): js.Any = js.native
    
    @JSName("type")
    var type_Document: DOCUMENT = js.native
    
    /**
      * The parsed version of the source document;
      * if true-ish, stringified output will include a `%YAML` directive.
      */
    var version: js.UndefOr[String] = js.native
    
    /** Warnings encountered during parsing. */
    var warnings: js.Array[YAMLWarning] = js.native
  }
  object Document {
    
    @js.native
    trait Anchors extends StObject {
      
      /**
        * Create a new `Alias` node, adding the required anchor for `node`.
        * If `name` is empty, a new anchor name will be generated.
        */
      def createAlias(node: Node): Alias = js.native
      def createAlias(node: Node, name: String): Alias = js.native
      
      /**
        * Create a new `Merge` node with the given source nodes.
        * Non-`Alias` sources will be automatically wrapped.
        */
      def createMergePair(nodes: Node*): Merge = js.native
      
      /** The anchor name associated with `node`, if set. */
      def getName(node: Node): js.UndefOr[String] = js.native
      
      /** List of all defined anchor names. */
      def getNames(): js.Array[String] = js.native
      
      /** The node associated with the anchor `name`, if set. */
      def getNode(name: String): js.UndefOr[Node] = js.native
      
      /**
        * Find an available anchor name with the given `prefix` and a
        * numerical suffix.
        */
      def newName(prefix: String): String = js.native
      
      /**
        * Associate an anchor with `node`. If `name` is empty, a new name will be generated.
        * To remove an anchor, use `setAnchor(null, name)`.
        */
      def setAnchor(): Unit | String = js.native
      def setAnchor(node: Null, name: String): Unit | String = js.native
      def setAnchor(node: Node): Unit | String = js.native
      def setAnchor(node: Node, name: String): Unit | String = js.native
    }
    
    @js.native
    trait Parsed extends Document {
      
      @JSName("contents")
      var contents_Parsed: Node | Null = js.native
      
      /** The schema used with the document. */
      @JSName("schema")
      var schema_Parsed: Schema = js.native
    }
    
    @js.native
    trait TagPrefix extends StObject {
      
      var handle: String = js.native
      
      var prefix: String = js.native
    }
    object TagPrefix {
      
      @scala.inline
      def apply(handle: String, prefix: String): TagPrefix = {
        val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
        __obj.asInstanceOf[TagPrefix]
      }
      
      @scala.inline
      implicit class TagPrefixMutableBuilder[Self <: TagPrefix] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("yaml", "createNode")
  @js.native
  def createNode(value: js.Any): YAMLMap | YAMLSeq | Scalar = js.native
  @JSImport("yaml", "createNode")
  @js.native
  def createNode(value: js.Any, wrapScalars: js.UndefOr[scala.Nothing], tag: String): YAMLMap | YAMLSeq | Scalar = js.native
  @JSImport("yaml", "createNode")
  @js.native
  def createNode_false(value: js.Any, wrapScalars: `false`): YAMLMap | YAMLSeq | String | Double | Boolean | Null = js.native
  @JSImport("yaml", "createNode")
  @js.native
  def createNode_false(value: js.Any, wrapScalars: `false`, tag: String): YAMLMap | YAMLSeq | String | Double | Boolean | Null = js.native
  @JSImport("yaml", "createNode")
  @js.native
  def createNode_true(value: js.Any, wrapScalars: `true`): YAMLMap | YAMLSeq | Scalar = js.native
  @JSImport("yaml", "createNode")
  @js.native
  def createNode_true(value: js.Any, wrapScalars: `true`, tag: String): YAMLMap | YAMLSeq | Scalar = js.native
  
  @JSImport("yaml", "defaultOptions")
  @js.native
  val defaultOptions: Options = js.native
  
  @JSImport("yaml", "parse")
  @js.native
  def parse(str: String): js.Any = js.native
  @JSImport("yaml", "parse")
  @js.native
  def parse(str: String, options: Options): js.Any = js.native
  
  @JSImport("yaml", "parseAllDocuments")
  @js.native
  def parseAllDocuments(str: String): js.Array[Parsed] = js.native
  @JSImport("yaml", "parseAllDocuments")
  @js.native
  def parseAllDocuments(str: String, options: Options): js.Array[Parsed] = js.native
  
  @JSImport("yaml", "parseCST")
  @js.native
  def parseCST(str: String): ParsedCST = js.native
  
  @JSImport("yaml", "parseDocument")
  @js.native
  def parseDocument(str: String): Parsed = js.native
  @JSImport("yaml", "parseDocument")
  @js.native
  def parseDocument(str: String, options: Options): Parsed = js.native
  
  object scalarOptions {
    
    @JSImport("yaml", "scalarOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml", "scalarOptions.binary")
    @js.native
    def binary: Binary = js.native
    @scala.inline
    def binary_=(x: Binary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("binary")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml", "scalarOptions.bool")
    @js.native
    def bool: Bool = js.native
    @scala.inline
    def bool_=(x: Bool): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml", "scalarOptions.int")
    @js.native
    def int: Int = js.native
    @scala.inline
    def int_=(x: Int): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml", "scalarOptions.str")
    @js.native
    def str: Str = js.native
    @scala.inline
    def str_=(x: Str): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("str")(x.asInstanceOf[js.Any])
    
    @js.native
    trait Binary extends StObject {
      
      /**
        * The type of string literal used to stringify `!!binary` values.
        *
        * Default: `'BLOCK_LITERAL'`
        */
      var defaultType: Type = js.native
      
      /**
        * Maximum line width for `!!binary`.
        *
        * Default: `76`
        */
      var lineWidth: Double = js.native
    }
    object Binary {
      
      @scala.inline
      def apply(defaultType: Type, lineWidth: Double): Binary = {
        val __obj = js.Dynamic.literal(defaultType = defaultType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any])
        __obj.asInstanceOf[Binary]
      }
      
      @scala.inline
      implicit class BinaryMutableBuilder[Self <: Binary] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaultType(value: Type): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Bool extends StObject {
      
      /**
        * String representation for `false`. With the core schema, use `'false' | 'False' | 'FALSE'`.
        *
        * Default: `'false'`
        */
      var falseStr: String = js.native
      
      /**
        * String representation for `true`. With the core schema, use `'true' | 'True' | 'TRUE'`.
        *
        * Default: `'true'`
        */
      var trueStr: String = js.native
    }
    object Bool {
      
      @scala.inline
      def apply(falseStr: String, trueStr: String): Bool = {
        val __obj = js.Dynamic.literal(falseStr = falseStr.asInstanceOf[js.Any], trueStr = trueStr.asInstanceOf[js.Any])
        __obj.asInstanceOf[Bool]
      }
      
      @scala.inline
      implicit class BoolMutableBuilder[Self <: Bool] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFalseStr(value: String): Self = StObject.set(x, "falseStr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrueStr(value: String): Self = StObject.set(x, "trueStr", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Int extends StObject {
      
      /**
        * Whether integers should be parsed into BigInt values.
        *
        * Default: `false`
        */
      var asBigInt: `false` = js.native
    }
    object Int {
      
      @scala.inline
      def apply(asBigInt: `false`): Int = {
        val __obj = js.Dynamic.literal(asBigInt = asBigInt.asInstanceOf[js.Any])
        __obj.asInstanceOf[Int]
      }
      
      @scala.inline
      implicit class IntMutableBuilder[Self <: Int] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAsBigInt(value: `false`): Self = StObject.set(x, "asBigInt", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Null extends StObject {
      
      /**
        * String representation for `null`. With the core schema, use `'null' | 'Null' | 'NULL' | '~' | ''`.
        *
        * Default: `'null'`
        */
      var nullStr: String = js.native
    }
    object Null {
      
      @scala.inline
      def apply(nullStr: String): typings.yaml.mod.scalarOptions.Null = {
        val __obj = js.Dynamic.literal(nullStr = nullStr.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.yaml.mod.scalarOptions.Null]
      }
      
      @scala.inline
      implicit class NullMutableBuilder[Self <: typings.yaml.mod.scalarOptions.Null] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNullStr(value: String): Self = StObject.set(x, "nullStr", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Str extends StObject {
      
      /**
        * The default type of string literal used to stringify values
        *
        * Default: `'PLAIN'`
        */
      var defaultType: Type = js.native
      
      var doubleQuoted: JsonEncoding = js.native
      
      var fold: LineWidth = js.native
    }
    object Str {
      
      @scala.inline
      def apply(defaultType: Type, doubleQuoted: JsonEncoding, fold: LineWidth): Str = {
        val __obj = js.Dynamic.literal(defaultType = defaultType.asInstanceOf[js.Any], doubleQuoted = doubleQuoted.asInstanceOf[js.Any], fold = fold.asInstanceOf[js.Any])
        __obj.asInstanceOf[Str]
      }
      
      @scala.inline
      implicit class StrMutableBuilder[Self <: Str] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaultType(value: Type): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDoubleQuoted(value: JsonEncoding): Self = StObject.set(x, "doubleQuoted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFold(value: LineWidth): Self = StObject.set(x, "fold", value.asInstanceOf[js.Any])
      }
    }
    
    @JSImport("yaml", "scalarOptions.null")
    @js.native
    val `null`: typings.yaml.mod.scalarOptions.Null = js.native
  }
  
  @JSImport("yaml", "stringify")
  @js.native
  def stringify(value: js.Any): String = js.native
  @JSImport("yaml", "stringify")
  @js.native
  def stringify(value: js.Any, options: Options): String = js.native
  
  @js.native
  trait Options
    extends typings.yaml.typesMod.Schema.Options {
    
    /**
      * Default prefix for anchors.
      *
      * Default: `'a'`, resulting in anchors `a1`, `a2`, etc.
      */
    var anchorPrefix: js.UndefOr[String] = js.native
    
    /**
      * The number of spaces to use when indenting code.
      *
      * Default: `2`
      */
    var indent: js.UndefOr[Double] = js.native
    
    /**
      * Whether block sequences should be indented.
      *
      * Default: `true`
      */
    var indentSeq: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow non-JSON JavaScript objects to remain in the `toJSON` output.
      * Relevant with the YAML 1.1 `!!timestamp` and `!!binary` tags as well as BigInts.
      *
      * Default: `true`
      */
    var keepBlobsInJSON: js.UndefOr[Boolean] = js.native
    
    /**
      * Include references in the AST to each node's corresponding CST node.
      *
      * Default: `false`
      */
    var keepCstNodes: js.UndefOr[Boolean] = js.native
    
    /**
      * Store the original node type when parsing documents.
      *
      * Default: `true`
      */
    var keepNodeTypes: js.UndefOr[Boolean] = js.native
    
    /**
      * When outputting JS, use Map rather than Object to represent mappings.
      *
      * Default: `false`
      */
    var mapAsMap: js.UndefOr[Boolean] = js.native
    
    /**
      * Prevent exponential entity expansion attacks by limiting data aliasing count;
      * set to `-1` to disable checks; `0` disallows all alias nodes.
      *
      * Default: `100`
      */
    var maxAliasCount: js.UndefOr[Double] = js.native
    
    /**
      * Include line position & node type directly in errors; drop their verbose source and context.
      *
      * Default: `false`
      */
    var prettyErrors: js.UndefOr[Boolean] = js.native
    
    /**
      * When stringifying, require keys to be scalars and to use implicit rather than explicit notation.
      *
      * Default: `false`
      */
    var simpleKeys: js.UndefOr[Boolean] = js.native
    
    /**
      * The YAML version used by documents without a `%YAML` directive.
      *
      * Default: `"1.2"`
      */
    var version: js.UndefOr[`1Dot0` | `1Dot1` | `1Dot2`] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorPrefix(value: String): Self = StObject.set(x, "anchorPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorPrefixUndefined: Self = StObject.set(x, "anchorPrefix", js.undefined)
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentSeq(value: Boolean): Self = StObject.set(x, "indentSeq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentSeqUndefined: Self = StObject.set(x, "indentSeq", js.undefined)
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setKeepBlobsInJSON(value: Boolean): Self = StObject.set(x, "keepBlobsInJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepBlobsInJSONUndefined: Self = StObject.set(x, "keepBlobsInJSON", js.undefined)
      
      @scala.inline
      def setKeepCstNodes(value: Boolean): Self = StObject.set(x, "keepCstNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepCstNodesUndefined: Self = StObject.set(x, "keepCstNodes", js.undefined)
      
      @scala.inline
      def setKeepNodeTypes(value: Boolean): Self = StObject.set(x, "keepNodeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepNodeTypesUndefined: Self = StObject.set(x, "keepNodeTypes", js.undefined)
      
      @scala.inline
      def setMapAsMap(value: Boolean): Self = StObject.set(x, "mapAsMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapAsMapUndefined: Self = StObject.set(x, "mapAsMap", js.undefined)
      
      @scala.inline
      def setMaxAliasCount(value: Double): Self = StObject.set(x, "maxAliasCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAliasCountUndefined: Self = StObject.set(x, "maxAliasCount", js.undefined)
      
      @scala.inline
      def setPrettyErrors(value: Boolean): Self = StObject.set(x, "prettyErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyErrorsUndefined: Self = StObject.set(x, "prettyErrors", js.undefined)
      
      @scala.inline
      def setSimpleKeys(value: Boolean): Self = StObject.set(x, "simpleKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleKeysUndefined: Self = StObject.set(x, "simpleKeys", js.undefined)
      
      @scala.inline
      def setVersion(value: `1Dot0` | `1Dot1` | `1Dot2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
