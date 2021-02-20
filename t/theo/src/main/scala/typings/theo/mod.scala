package typings.theo

import typings.immutable.Immutable.List
import typings.immutable.Immutable.Map
import typings.immutable.Immutable.OrderedMap
import typings.theo.theoStrings.aliases
import typings.theo.theoStrings.global
import typings.theo.theoStrings.imports
import typings.theo.theoStrings.meta
import typings.theo.theoStrings.options
import typings.theo.theoStrings.props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("theo", "convert")
  @js.native
  def convert(options: ConvertOptions): js.Promise[String] = js.native
  
  @JSImport("theo", "convertSync")
  @js.native
  def convertSync(options: ConvertOptions): String = js.native
  
  @JSImport("theo", "registerFormat")
  @js.native
  def registerFormat[T /* <: String */](name: T, format: String): Unit = js.native
  @JSImport("theo", "registerFormat")
  @js.native
  def registerFormat[T /* <: String */](name: T, format: FormatResultFn): Unit = js.native
  @JSImport("theo", "registerFormat")
  @js.native
  def registerFormat[T /* <: String */](name: Format, format: String): Unit = js.native
  @JSImport("theo", "registerFormat")
  @js.native
  def registerFormat[T /* <: String */](name: Format, format: FormatResultFn): Unit = js.native
  
  @JSImport("theo", "registerTransform")
  @js.native
  def registerTransform[T /* <: String */, V /* <: String */](name: T, valueTransforms: js.Array[V | ValueTransform]): Unit = js.native
  @JSImport("theo", "registerTransform")
  @js.native
  def registerTransform[T /* <: String */, V /* <: String */](name: Transform, valueTransforms: js.Array[V | ValueTransform]): Unit = js.native
  
  @JSImport("theo", "registerValueTransform")
  @js.native
  def registerValueTransform[T /* <: String */](
    name: T,
    predicate: js.Function1[/* prop */ Prop, Boolean],
    transform: js.Function1[/* prop */ Prop, String | Double]
  ): Unit = js.native
  @JSImport("theo", "registerValueTransform")
  @js.native
  def registerValueTransform[T /* <: String */](
    name: ValueTransform,
    predicate: js.Function1[/* prop */ Prop, Boolean],
    transform: js.Function1[/* prop */ Prop, String | Double]
  ): Unit = js.native
  
  type Aliases = OrderedMap[String, Map[String, String | Double]]
  
  @js.native
  trait ConvertOptions extends StObject {
    
    var format: FormatOptions = js.native
    
    var resolveAliases: js.UndefOr[Boolean] = js.native
    
    var resolveMetaAliases: js.UndefOr[Boolean] = js.native
    
    var transform: TransformOptions[scala.Nothing] = js.native
  }
  object ConvertOptions {
    
    @scala.inline
    def apply(format: FormatOptions, transform: TransformOptions[scala.Nothing]): ConvertOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertOptions]
    }
    
    @scala.inline
    implicit class ConvertOptionsMutableBuilder[Self <: ConvertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: FormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveAliases(value: Boolean): Self = StObject.set(x, "resolveAliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveAliasesUndefined: Self = StObject.set(x, "resolveAliases", js.undefined)
      
      @scala.inline
      def setResolveMetaAliases(value: Boolean): Self = StObject.set(x, "resolveMetaAliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveMetaAliasesUndefined: Self = StObject.set(x, "resolveMetaAliases", js.undefined)
      
      @scala.inline
      def setTransform(value: TransformOptions[scala.Nothing]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.theo.theoStrings.`custom-propertiesDotcss`
    - typings.theo.theoStrings.cssmodulesDotcss
    - typings.theo.theoStrings.scss
    - typings.theo.theoStrings.sass
    - typings.theo.theoStrings.less
    - typings.theo.theoStrings.styl
    - typings.theo.theoStrings.mapDotcss
    - typings.theo.theoStrings.mapDotvariableDotscss
    - typings.theo.theoStrings.listDotscss
    - typings.theo.theoStrings.moduleDotjs
    - typings.theo.theoStrings.commonDotjs
    - typings.theo.theoStrings.html
    - typings.theo.theoStrings.json
    - typings.theo.theoStrings.rawDotjson
    - typings.theo.theoStrings.iosDotjson
    - typings.theo.theoStrings.androidDotxml
    - typings.theo.theoStrings.auraDottokens
  */
  trait Format extends StObject
  object Format {
    
    @scala.inline
    def androidDotxml: typings.theo.theoStrings.androidDotxml = "android.xml".asInstanceOf[typings.theo.theoStrings.androidDotxml]
    
    @scala.inline
    def auraDottokens: typings.theo.theoStrings.auraDottokens = "aura.tokens".asInstanceOf[typings.theo.theoStrings.auraDottokens]
    
    @scala.inline
    def commonDotjs: typings.theo.theoStrings.commonDotjs = "common.js".asInstanceOf[typings.theo.theoStrings.commonDotjs]
    
    @scala.inline
    def cssmodulesDotcss: typings.theo.theoStrings.cssmodulesDotcss = "cssmodules.css".asInstanceOf[typings.theo.theoStrings.cssmodulesDotcss]
    
    @scala.inline
    def `custom-propertiesDotcss`: typings.theo.theoStrings.`custom-propertiesDotcss` = "custom-properties.css".asInstanceOf[typings.theo.theoStrings.`custom-propertiesDotcss`]
    
    @scala.inline
    def html: typings.theo.theoStrings.html = "html".asInstanceOf[typings.theo.theoStrings.html]
    
    @scala.inline
    def iosDotjson: typings.theo.theoStrings.iosDotjson = "ios.json".asInstanceOf[typings.theo.theoStrings.iosDotjson]
    
    @scala.inline
    def json: typings.theo.theoStrings.json = "json".asInstanceOf[typings.theo.theoStrings.json]
    
    @scala.inline
    def less: typings.theo.theoStrings.less = "less".asInstanceOf[typings.theo.theoStrings.less]
    
    @scala.inline
    def listDotscss: typings.theo.theoStrings.listDotscss = "list.scss".asInstanceOf[typings.theo.theoStrings.listDotscss]
    
    @scala.inline
    def mapDotcss: typings.theo.theoStrings.mapDotcss = "map.css".asInstanceOf[typings.theo.theoStrings.mapDotcss]
    
    @scala.inline
    def mapDotvariableDotscss: typings.theo.theoStrings.mapDotvariableDotscss = "map.variable.scss".asInstanceOf[typings.theo.theoStrings.mapDotvariableDotscss]
    
    @scala.inline
    def moduleDotjs: typings.theo.theoStrings.moduleDotjs = "module.js".asInstanceOf[typings.theo.theoStrings.moduleDotjs]
    
    @scala.inline
    def rawDotjson: typings.theo.theoStrings.rawDotjson = "raw.json".asInstanceOf[typings.theo.theoStrings.rawDotjson]
    
    @scala.inline
    def sass: typings.theo.theoStrings.sass = "sass".asInstanceOf[typings.theo.theoStrings.sass]
    
    @scala.inline
    def scss: typings.theo.theoStrings.scss = "scss".asInstanceOf[typings.theo.theoStrings.scss]
    
    @scala.inline
    def styl: typings.theo.theoStrings.styl = "styl".asInstanceOf[typings.theo.theoStrings.styl]
  }
  
  @js.native
  trait FormatOptions extends StObject {
    
    var options: js.UndefOr[
        js.Function2[
          /* options */ js.Object, 
          /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]], 
          Unit
        ]
      ] = js.native
    
    var `type`: Format = js.native
  }
  object FormatOptions {
    
    @scala.inline
    def apply(`type`: Format): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit class FormatOptionsMutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(
        value: (/* options */ js.Object, /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]]) => Unit
      ): Self = StObject.set(x, "options", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setType(value: Format): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type FormatResultFn = js.Function1[/* result */ ImmutableStyleMap, String]
  
  @js.native
  trait ImmutableStyleMap
    extends Map[String, js.Any] {
    
    @JSName("get")
    def get_aliases(key: aliases): Aliases = js.native
    @JSName("get")
    def get_global(key: global): js.UndefOr[Props] = js.native
    @JSName("get")
    def get_imports(key: imports): js.UndefOr[js.Array[String]] = js.native
    @JSName("get")
    def get_meta(key: meta): Meta = js.native
    @JSName("get")
    def get_options(key: options): js.Object = js.native
    @JSName("get")
    def get_props(key: props): Props = js.native
  }
  
  type Meta = Map[String, String]
  
  type Prop = Map[StyleProperty, String | Double]
  
  type Props = List[Prop]
  
  @js.native
  trait StyleMap extends StObject {
    
    var aliases: Aliases = js.native
    
    var global: js.UndefOr[Props] = js.native
    
    var imports: js.UndefOr[js.Array[String]] = js.native
    
    var meta: Meta = js.native
    
    var options: js.Object = js.native
    
    var props: Props = js.native
  }
  object StyleMap {
    
    @scala.inline
    def apply(aliases: Aliases, meta: Meta, options: js.Object, props: Props): StyleMap = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleMap]
    }
    
    @scala.inline
    implicit class StyleMapMutableBuilder[Self <: StyleMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: Aliases): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobal(value: Props): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
      
      @scala.inline
      def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value :_*))
      
      @scala.inline
      def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.theo.theoStrings.name
    - typings.theo.theoStrings.value
    - typings.theo.theoStrings.`type`
    - typings.theo.theoStrings.originalValue
    - typings.theo.theoStrings.category
    - typings.theo.theoStrings.comment
    - typings.theo.theoStrings.meta
  */
  trait StyleProperty extends StObject
  object StyleProperty {
    
    @scala.inline
    def category: typings.theo.theoStrings.category = "category".asInstanceOf[typings.theo.theoStrings.category]
    
    @scala.inline
    def comment: typings.theo.theoStrings.comment = "comment".asInstanceOf[typings.theo.theoStrings.comment]
    
    @scala.inline
    def meta: typings.theo.theoStrings.meta = "meta".asInstanceOf[typings.theo.theoStrings.meta]
    
    @scala.inline
    def name: typings.theo.theoStrings.name = "name".asInstanceOf[typings.theo.theoStrings.name]
    
    @scala.inline
    def originalValue: typings.theo.theoStrings.originalValue = "originalValue".asInstanceOf[typings.theo.theoStrings.originalValue]
    
    @scala.inline
    def `type`: typings.theo.theoStrings.`type` = "type".asInstanceOf[typings.theo.theoStrings.`type`]
    
    @scala.inline
    def value: typings.theo.theoStrings.value = "value".asInstanceOf[typings.theo.theoStrings.value]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.theo.theoStrings.raw
    - typings.theo.theoStrings.ios
    - typings.theo.theoStrings.android
    - typings.theo.theoStrings.web
  */
  trait Transform extends StObject
  object Transform {
    
    @scala.inline
    def android: typings.theo.theoStrings.android = "android".asInstanceOf[typings.theo.theoStrings.android]
    
    @scala.inline
    def ios: typings.theo.theoStrings.ios = "ios".asInstanceOf[typings.theo.theoStrings.ios]
    
    @scala.inline
    def raw: typings.theo.theoStrings.raw = "raw".asInstanceOf[typings.theo.theoStrings.raw]
    
    @scala.inline
    def web: typings.theo.theoStrings.web = "web".asInstanceOf[typings.theo.theoStrings.web]
  }
  
  @js.native
  trait TransformOptions[T /* <: String */] extends StObject {
    
    var data: js.UndefOr[String] = js.native
    
    var file: String = js.native
    
    var `type`: js.UndefOr[Transform | T] = js.native
  }
  object TransformOptions {
    
    @scala.inline
    def apply[T /* <: String */](file: String): TransformOptions[T] = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformOptions[T]]
    }
    
    @scala.inline
    implicit class TransformOptionsMutableBuilder[Self <: TransformOptions[_], T /* <: String */] (val x: Self with TransformOptions[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Transform | T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.theo.theoStrings.colorSlashrgb
    - typings.theo.theoStrings.colorSlashhex
    - typings.theo.theoStrings.colorSlashhex8rgba
    - typings.theo.theoStrings.colorSlashhex8argb
    - typings.theo.theoStrings.percentageSlashfloat
    - typings.theo.theoStrings.relativeSlashpixel
    - typings.theo.theoStrings.relativeSlashpixelValue
  */
  trait ValueTransform extends StObject
  object ValueTransform {
    
    @scala.inline
    def colorSlashhex: typings.theo.theoStrings.colorSlashhex = "color/hex".asInstanceOf[typings.theo.theoStrings.colorSlashhex]
    
    @scala.inline
    def colorSlashhex8argb: typings.theo.theoStrings.colorSlashhex8argb = "color/hex8argb".asInstanceOf[typings.theo.theoStrings.colorSlashhex8argb]
    
    @scala.inline
    def colorSlashhex8rgba: typings.theo.theoStrings.colorSlashhex8rgba = "color/hex8rgba".asInstanceOf[typings.theo.theoStrings.colorSlashhex8rgba]
    
    @scala.inline
    def colorSlashrgb: typings.theo.theoStrings.colorSlashrgb = "color/rgb".asInstanceOf[typings.theo.theoStrings.colorSlashrgb]
    
    @scala.inline
    def percentageSlashfloat: typings.theo.theoStrings.percentageSlashfloat = "percentage/float".asInstanceOf[typings.theo.theoStrings.percentageSlashfloat]
    
    @scala.inline
    def relativeSlashpixel: typings.theo.theoStrings.relativeSlashpixel = "relative/pixel".asInstanceOf[typings.theo.theoStrings.relativeSlashpixel]
    
    @scala.inline
    def relativeSlashpixelValue: typings.theo.theoStrings.relativeSlashpixelValue = "relative/pixelValue".asInstanceOf[typings.theo.theoStrings.relativeSlashpixelValue]
  }
}
