package typings.yaml.typesMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.yaml.anon.MAP
import typings.yaml.mod.Document
import typings.yaml.typesMod.Schema.CreateNodeContext
import typings.yaml.typesMod.Schema.Name
import typings.yaml.typesMod.Schema.Options
import typings.yaml.typesMod.Schema.Tag
import typings.yaml.yamlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml/types", "Schema")
@js.native
class Schema protected () extends StObject {
  def this(options: Options) = this()
  
  /**
    * Convert any value into a `Node` using this schema, recursively turning
    * objects into collections.
    *
    * @param wrapScalars If `true`, also wraps plain values in `Scalar` objects;
    *   if undefined or `false` and `value` is not an object, it will be returned
    *   directly.
    * @param tag Use to specify the collection type, e.g. `"!!omap"`. Note that
    *   this requires the corresponding tag to be available in this schema.
    */
  def createNode(value: js.Any): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean, tag: String): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean, tag: String, ctx: CreateNodeContext): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean, tag: Unit, ctx: CreateNodeContext): Node = js.native
  def createNode(value: js.Any, wrapScalars: Unit, tag: String): Node = js.native
  def createNode(value: js.Any, wrapScalars: Unit, tag: String, ctx: CreateNodeContext): Node = js.native
  def createNode(value: js.Any, wrapScalars: Unit, tag: Unit, ctx: CreateNodeContext): Node = js.native
  
  /**
    * Convert a key and a value into a `Pair` using this schema, recursively
    * wrapping all values as `Scalar` or `Collection` nodes.
    *
    * @param ctx To not wrap scalars, use a context `{ wrapScalars: false }`
    */
  def createPair(key: js.Any, value: js.Any): Pair = js.native
  def createPair(key: js.Any, value: js.Any, ctx: CreateNodeContext): Pair = js.native
  
  var merge: Boolean = js.native
  
  var name: Name = js.native
  
  var sortMapEntries: (js.Function2[/* a */ Pair, /* b */ Pair, Double]) | Null = js.native
  
  var tags: js.Array[Tag] = js.native
}
/* static members */
object Schema {
  
  @JSImport("yaml/types", "Schema")
  @js.native
  val ^ : js.Any = js.native
  
  /** Default: `'tag:yaml.org,2002:'` */
  @JSImport("yaml/types", "Schema.defaultPrefix")
  @js.native
  def defaultPrefix: String = js.native
  @scala.inline
  def defaultPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPrefix")(x.asInstanceOf[js.Any])
  
  @JSImport("yaml/types", "Schema.defaultTags")
  @js.native
  def defaultTags: MAP = js.native
  @scala.inline
  def defaultTags_=(x: MAP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTags")(x.asInstanceOf[js.Any])
  
  trait BaseTag extends StObject {
    
    /**
      * An optional factory function, used e.g. by collections when wrapping JS objects as AST nodes.
      */
    var createNode: js.UndefOr[
        js.Function3[
          /* schema */ Schema, 
          /* value */ js.Any, 
          /* ctx */ CreateNodeContext, 
          YAMLMap | YAMLSeq | Scalar
        ]
      ] = js.undefined
    
    /**
      * If a tag has multiple forms that should be parsed and/or stringified differently, use `format` to identify them.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Used by `YAML.createNode` to detect your data type, e.g. using `typeof` or
      * `instanceof`.
      */
    def identify(value: js.Any): Boolean
    
    /**
      * The `Node` child class that implements this tag. Required for collections and tags that have overlapping JS representations.
      */
    var nodeClass: js.UndefOr[Instantiable0[js.Any]] = js.undefined
    
    /**
      * Used by some tags to configure their stringification, where applicable.
      */
    var options: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Optional function stringifying the AST node in the current context. If your
      * data includes a suitable `.toString()` method, you can probably leave this
      * undefined and use the default stringifier.
      *
      * @param item The node being stringified.
      * @param ctx Contains the stringifying context variables.
      * @param onComment Callback to signal that the stringifier includes the
      *   item's comment in its output.
      * @param onChompKeep Callback to signal that the output uses a block scalar
      *   type with the `+` chomping indicator.
      */
    var stringify: js.UndefOr[
        js.Function4[
          /* item */ Node, 
          /* ctx */ StringifyContext, 
          /* onComment */ js.UndefOr[js.Function0[Unit]], 
          /* onChompKeep */ js.UndefOr[js.Function0[Unit]], 
          String
        ]
      ] = js.undefined
    
    /**
      * The identifier for your data type, with which its stringified form will be
      * prefixed. Should either be a !-prefixed local `!tag`, or a fully qualified
      * `tag:domain,date:foo`.
      */
    var tag: String
  }
  object BaseTag {
    
    @scala.inline
    def apply(identify: js.Any => Boolean, tag: String): BaseTag = {
      val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTag]
    }
    
    @scala.inline
    implicit class BaseTagMutableBuilder[Self <: BaseTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateNode(
        value: (/* schema */ Schema, /* value */ js.Any, /* ctx */ CreateNodeContext) => YAMLMap | YAMLSeq | Scalar
      ): Self = StObject.set(x, "createNode", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateNodeUndefined: Self = StObject.set(x, "createNode", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIdentify(value: js.Any => Boolean): Self = StObject.set(x, "identify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeClass(value: Instantiable0[js.Any]): Self = StObject.set(x, "nodeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeClassUndefined: Self = StObject.set(x, "nodeClass", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setStringify(
        value: (/* item */ Node, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String
      ): Self = StObject.set(x, "stringify", js.Any.fromFunction4(value))
      
      @scala.inline
      def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateNodeContext
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var wrapScalars: js.UndefOr[Boolean] = js.undefined
  }
  object CreateNodeContext {
    
    @scala.inline
    def apply(): CreateNodeContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateNodeContext]
    }
    
    @scala.inline
    implicit class CreateNodeContextMutableBuilder[Self <: CreateNodeContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWrapScalars(value: Boolean): Self = StObject.set(x, "wrapScalars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapScalarsUndefined: Self = StObject.set(x, "wrapScalars", js.undefined)
    }
  }
  
  trait CustomTag
    extends StObject
       with BaseTag
       with Tag {
    
    /**
      * A JavaScript class that should be matched to this tag, e.g. `Date` for `!!timestamp`.
      * @deprecated Use `Tag.identify` instead
      */
    var `class`: js.UndefOr[Instantiable0[js.Any]] = js.undefined
    
    /**
      * Turns a CST node into an AST node. If returning a non-`Node` value, the
      * output will be wrapped as a `Scalar`.
      */
    def resolve(doc: Document, cstNode: typings.yaml.parseCstMod.CST.Node): Node | js.Any
  }
  object CustomTag {
    
    @scala.inline
    def apply(
      identify: js.Any => Boolean,
      resolve: (Document, typings.yaml.parseCstMod.CST.Node) => Node | js.Any,
      tag: String
    ): CustomTag = {
      val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction2(resolve), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTag]
    }
    
    @scala.inline
    implicit class CustomTagMutableBuilder[Self <: CustomTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: Instantiable0[js.Any]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setResolve(value: (Document, typings.yaml.parseCstMod.CST.Node) => Node | js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
    }
  }
  
  trait DefaultTag
    extends StObject
       with BaseTag
       with Tag {
    
    /**
      * If `true`, together with `test` allows for values to be stringified without
      * an explicit tag. For most cases, it's unlikely that you'll actually want to
      * use this, even if you first think you do.
      */
    var default: `true`
    
    /**
      * Alternative form used by default tags; called with `test` match results.
      */
    def resolve(`match`: String*): Node | js.Any
    
    /**
      * Together with `default` allows for values to be stringified without an
      * explicit tag and detected using a regular expression. For most cases, it's
      * unlikely that you'll actually want to use these, even if you first think
      * you do.
      */
    var test: RegExp
  }
  object DefaultTag {
    
    @scala.inline
    def apply(
      identify: js.Any => Boolean,
      resolve: /* repeated */ String => Node | js.Any,
      tag: String,
      test: RegExp
    ): DefaultTag = {
      val __obj = js.Dynamic.literal(default = true, identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction1(resolve), tag = tag.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultTag]
    }
    
    @scala.inline
    implicit class DefaultTagMutableBuilder[Self <: DefaultTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: `true`): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve(value: /* repeated */ String => Node | js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTest(value: RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.yaml.yamlStrings.core
    - typings.yaml.yamlStrings.failsafe
    - typings.yaml.yamlStrings.json
    - typings.yaml.yamlStrings.`yaml-1Dot1`
  */
  trait Name extends StObject
  object Name {
    
    @scala.inline
    def core: typings.yaml.yamlStrings.core = "core".asInstanceOf[typings.yaml.yamlStrings.core]
    
    @scala.inline
    def failsafe: typings.yaml.yamlStrings.failsafe = "failsafe".asInstanceOf[typings.yaml.yamlStrings.failsafe]
    
    @scala.inline
    def json: typings.yaml.yamlStrings.json = "json".asInstanceOf[typings.yaml.yamlStrings.json]
    
    @scala.inline
    def `yaml-1Dot1`: typings.yaml.yamlStrings.`yaml-1Dot1` = "yaml-1.1".asInstanceOf[typings.yaml.yamlStrings.`yaml-1Dot1`]
  }
  
  trait Options extends StObject {
    
    /**
      * Array of additional tags to include in the schema, or a function that may
      * modify the schema's base tag array.
      */
    var customTags: js.UndefOr[
        (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])
      ] = js.undefined
    
    /**
      * Enable support for `<<` merge keys.
      *
      * Default: `false` for YAML 1.2, `true` for earlier versions
      */
    var merge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The base schema to use.
      *
      * Default: `"core"` for YAML 1.2, `"yaml-1.1"` for earlier versions
      */
    var schema: js.UndefOr[Name] = js.undefined
    
    /**
      * When stringifying, sort map entries. If `true`, sort by comparing key values with `<`.
      *
      * Default: `false`
      */
    var sortMapEntries: js.UndefOr[Boolean | (js.Function2[/* a */ Pair, /* b */ Pair, Double])] = js.undefined
    
    /**
      * @deprecated Use `customTags` instead.
      */
    var tags: js.UndefOr[
        (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])
      ] = js.undefined
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
      def setCustomTags(value: (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])): Self = StObject.set(x, "customTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomTagsFunction1(value: /* tags */ js.Array[Tag] => js.Array[Tag]): Self = StObject.set(x, "customTags", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomTagsUndefined: Self = StObject.set(x, "customTags", js.undefined)
      
      @scala.inline
      def setCustomTagsVarargs(value: (TagId | Tag)*): Self = StObject.set(x, "customTags", js.Array(value :_*))
      
      @scala.inline
      def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      @scala.inline
      def setSchema(value: Name): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSortMapEntries(value: Boolean | (js.Function2[/* a */ Pair, /* b */ Pair, Double])): Self = StObject.set(x, "sortMapEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortMapEntriesFunction2(value: (/* a */ Pair, /* b */ Pair) => Double): Self = StObject.set(x, "sortMapEntries", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortMapEntriesUndefined: Self = StObject.set(x, "sortMapEntries", js.undefined)
      
      @scala.inline
      def setTags(value: (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsFunction1(value: /* tags */ js.Array[Tag] => js.Array[Tag]): Self = StObject.set(x, "tags", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: (TagId | Tag)*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  trait StringifyContext
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var forceBlockIndent: js.UndefOr[Boolean] = js.undefined
    
    var implicitKey: js.UndefOr[Boolean] = js.undefined
    
    var inFlow: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[String] = js.undefined
    
    var indentAtStart: js.UndefOr[Double] = js.undefined
  }
  object StringifyContext {
    
    @scala.inline
    def apply(): StringifyContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyContext]
    }
    
    @scala.inline
    implicit class StringifyContextMutableBuilder[Self <: StringifyContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceBlockIndent(value: Boolean): Self = StObject.set(x, "forceBlockIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceBlockIndentUndefined: Self = StObject.set(x, "forceBlockIndent", js.undefined)
      
      @scala.inline
      def setImplicitKey(value: Boolean): Self = StObject.set(x, "implicitKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplicitKeyUndefined: Self = StObject.set(x, "implicitKey", js.undefined)
      
      @scala.inline
      def setInFlow(value: Boolean): Self = StObject.set(x, "inFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInFlowUndefined: Self = StObject.set(x, "inFlow", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentAtStart(value: Double): Self = StObject.set(x, "indentAtStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentAtStartUndefined: Self = StObject.set(x, "indentAtStart", js.undefined)
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.yaml.typesMod.Schema.CustomTag
    - typings.yaml.typesMod.Schema.DefaultTag
  */
  trait Tag extends StObject
  object Tag {
    
    @scala.inline
    def CustomTag(
      identify: js.Any => Boolean,
      resolve: (Document, typings.yaml.parseCstMod.CST.Node) => Node | js.Any,
      tag: String
    ): typings.yaml.typesMod.Schema.CustomTag = {
      val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction2(resolve), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yaml.typesMod.Schema.CustomTag]
    }
    
    @scala.inline
    def DefaultTag(
      identify: js.Any => Boolean,
      resolve: /* repeated */ String => Node | js.Any,
      tag: String,
      test: RegExp
    ): typings.yaml.typesMod.Schema.DefaultTag = {
      val __obj = js.Dynamic.literal(default = true, identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction1(resolve), tag = tag.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.yaml.typesMod.Schema.DefaultTag]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.yaml.yamlStrings.binary
    - typings.yaml.yamlStrings.bool
    - typings.yaml.yamlStrings.float
    - typings.yaml.yamlStrings.floatExp
    - typings.yaml.yamlStrings.floatNaN
    - typings.yaml.yamlStrings.floatTime
    - typings.yaml.yamlStrings.int
    - typings.yaml.yamlStrings.intHex
    - typings.yaml.yamlStrings.intOct
    - typings.yaml.yamlStrings.intTime
    - typings.yaml.yamlStrings.`null`
    - typings.yaml.yamlStrings.omap
    - typings.yaml.yamlStrings.pairs
    - typings.yaml.yamlStrings.set
    - typings.yaml.yamlStrings.timestamp
  */
  trait TagId extends StObject
  object TagId {
    
    @scala.inline
    def binary: typings.yaml.yamlStrings.binary = "binary".asInstanceOf[typings.yaml.yamlStrings.binary]
    
    @scala.inline
    def bool: typings.yaml.yamlStrings.bool = "bool".asInstanceOf[typings.yaml.yamlStrings.bool]
    
    @scala.inline
    def float: typings.yaml.yamlStrings.float = "float".asInstanceOf[typings.yaml.yamlStrings.float]
    
    @scala.inline
    def floatExp: typings.yaml.yamlStrings.floatExp = "floatExp".asInstanceOf[typings.yaml.yamlStrings.floatExp]
    
    @scala.inline
    def floatNaN: typings.yaml.yamlStrings.floatNaN = "floatNaN".asInstanceOf[typings.yaml.yamlStrings.floatNaN]
    
    @scala.inline
    def floatTime: typings.yaml.yamlStrings.floatTime = "floatTime".asInstanceOf[typings.yaml.yamlStrings.floatTime]
    
    @scala.inline
    def int: typings.yaml.yamlStrings.int = "int".asInstanceOf[typings.yaml.yamlStrings.int]
    
    @scala.inline
    def intHex: typings.yaml.yamlStrings.intHex = "intHex".asInstanceOf[typings.yaml.yamlStrings.intHex]
    
    @scala.inline
    def intOct: typings.yaml.yamlStrings.intOct = "intOct".asInstanceOf[typings.yaml.yamlStrings.intOct]
    
    @scala.inline
    def intTime: typings.yaml.yamlStrings.intTime = "intTime".asInstanceOf[typings.yaml.yamlStrings.intTime]
    
    @scala.inline
    def `null`: typings.yaml.yamlStrings.`null` = "null".asInstanceOf[typings.yaml.yamlStrings.`null`]
    
    @scala.inline
    def omap: typings.yaml.yamlStrings.omap = "omap".asInstanceOf[typings.yaml.yamlStrings.omap]
    
    @scala.inline
    def pairs: typings.yaml.yamlStrings.pairs = "pairs".asInstanceOf[typings.yaml.yamlStrings.pairs]
    
    @scala.inline
    def set: typings.yaml.yamlStrings.set = "set".asInstanceOf[typings.yaml.yamlStrings.set]
    
    @scala.inline
    def timestamp: typings.yaml.yamlStrings.timestamp = "timestamp".asInstanceOf[typings.yaml.yamlStrings.timestamp]
  }
}
