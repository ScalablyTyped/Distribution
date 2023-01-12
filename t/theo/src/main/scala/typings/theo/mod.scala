package typings.theo

import typings.immutable.mod.Map
import typings.immutable.mod.OrderedMap
import typings.theo.theoStrings.aliases
import typings.theo.theoStrings.global
import typings.theo.theoStrings.imports
import typings.theo.theoStrings.meta
import typings.theo.theoStrings.options
import typings.theo.theoStrings.props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("theo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(options: ConvertOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def convertSync(options: ConvertOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertSync")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def registerFormat[T /* <: String */](name: T, format: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFormat")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerFormat[T /* <: String */](name: T, format: FormatResultFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFormat")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerFormat[T /* <: String */](name: Format, format: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFormat")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerFormat[T /* <: String */](name: Format, format: FormatResultFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFormat")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerTransform[T /* <: String */, V /* <: String */](name: T, valueTransforms: js.Array[V | ValueTransform]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTransform")(name.asInstanceOf[js.Any], valueTransforms.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerTransform[T /* <: String */, V /* <: String */](name: Transform, valueTransforms: js.Array[V | ValueTransform]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTransform")(name.asInstanceOf[js.Any], valueTransforms.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerValueTransform[T /* <: String */](
    name: T,
    predicate: js.Function1[/* prop */ Prop, Boolean],
    transform: js.Function1[/* prop */ Prop, String | Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerValueTransform")(name.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerValueTransform[T /* <: String */](
    name: ValueTransform,
    predicate: js.Function1[/* prop */ Prop, Boolean],
    transform: js.Function1[/* prop */ Prop, String | Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerValueTransform")(name.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Aliases = OrderedMap[String, Map[String, String | Double]]
  
  trait ConvertOptions extends StObject {
    
    var format: FormatOptions
    
    var resolveAliases: js.UndefOr[Boolean] = js.undefined
    
    var resolveMetaAliases: js.UndefOr[Boolean] = js.undefined
    
    var transform: TransformOptions[scala.Nothing]
  }
  object ConvertOptions {
    
    inline def apply(format: FormatOptions, transform: TransformOptions[scala.Nothing]): ConvertOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvertOptions] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: FormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setResolveAliases(value: Boolean): Self = StObject.set(x, "resolveAliases", value.asInstanceOf[js.Any])
      
      inline def setResolveAliasesUndefined: Self = StObject.set(x, "resolveAliases", js.undefined)
      
      inline def setResolveMetaAliases(value: Boolean): Self = StObject.set(x, "resolveMetaAliases", value.asInstanceOf[js.Any])
      
      inline def setResolveMetaAliasesUndefined: Self = StObject.set(x, "resolveMetaAliases", js.undefined)
      
      inline def setTransform(value: TransformOptions[scala.Nothing]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
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
    
    inline def androidDotxml: typings.theo.theoStrings.androidDotxml = "android.xml".asInstanceOf[typings.theo.theoStrings.androidDotxml]
    
    inline def auraDottokens: typings.theo.theoStrings.auraDottokens = "aura.tokens".asInstanceOf[typings.theo.theoStrings.auraDottokens]
    
    inline def commonDotjs: typings.theo.theoStrings.commonDotjs = "common.js".asInstanceOf[typings.theo.theoStrings.commonDotjs]
    
    inline def cssmodulesDotcss: typings.theo.theoStrings.cssmodulesDotcss = "cssmodules.css".asInstanceOf[typings.theo.theoStrings.cssmodulesDotcss]
    
    inline def `custom-propertiesDotcss`: typings.theo.theoStrings.`custom-propertiesDotcss` = "custom-properties.css".asInstanceOf[typings.theo.theoStrings.`custom-propertiesDotcss`]
    
    inline def html: typings.theo.theoStrings.html = "html".asInstanceOf[typings.theo.theoStrings.html]
    
    inline def iosDotjson: typings.theo.theoStrings.iosDotjson = "ios.json".asInstanceOf[typings.theo.theoStrings.iosDotjson]
    
    inline def json: typings.theo.theoStrings.json = "json".asInstanceOf[typings.theo.theoStrings.json]
    
    inline def less: typings.theo.theoStrings.less = "less".asInstanceOf[typings.theo.theoStrings.less]
    
    inline def listDotscss: typings.theo.theoStrings.listDotscss = "list.scss".asInstanceOf[typings.theo.theoStrings.listDotscss]
    
    inline def mapDotcss: typings.theo.theoStrings.mapDotcss = "map.css".asInstanceOf[typings.theo.theoStrings.mapDotcss]
    
    inline def mapDotvariableDotscss: typings.theo.theoStrings.mapDotvariableDotscss = "map.variable.scss".asInstanceOf[typings.theo.theoStrings.mapDotvariableDotscss]
    
    inline def moduleDotjs: typings.theo.theoStrings.moduleDotjs = "module.js".asInstanceOf[typings.theo.theoStrings.moduleDotjs]
    
    inline def rawDotjson: typings.theo.theoStrings.rawDotjson = "raw.json".asInstanceOf[typings.theo.theoStrings.rawDotjson]
    
    inline def sass: typings.theo.theoStrings.sass = "sass".asInstanceOf[typings.theo.theoStrings.sass]
    
    inline def scss: typings.theo.theoStrings.scss = "scss".asInstanceOf[typings.theo.theoStrings.scss]
    
    inline def styl: typings.theo.theoStrings.styl = "styl".asInstanceOf[typings.theo.theoStrings.styl]
  }
  
  trait FormatOptions extends StObject {
    
    var options: js.UndefOr[
        js.Function2[
          /* options */ js.Object, 
          /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]], 
          Unit
        ]
      ] = js.undefined
    
    var `type`: Format
  }
  object FormatOptions {
    
    inline def apply(`type`: Format): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      inline def setOptions(
        value: (/* options */ js.Object, /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]]) => Unit
      ): Self = StObject.set(x, "options", js.Any.fromFunction2(value))
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: Format): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type FormatResultFn = js.Function1[/* result */ ImmutableStyleMap, String]
  
  @js.native
  trait ImmutableStyleMap
    extends StObject
       with Map[String, Any] {
    
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
  
  type Props = typings.immutable.mod.List[Prop]
  
  trait StyleMap extends StObject {
    
    var aliases: Aliases
    
    var global: js.UndefOr[Props] = js.undefined
    
    var imports: js.UndefOr[js.Array[String]] = js.undefined
    
    var meta: Meta
    
    var options: js.Object
    
    var props: Props
  }
  object StyleMap {
    
    inline def apply(aliases: Aliases, meta: Meta, options: js.Object, props: Props): StyleMap = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleMap] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: Aliases): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setGlobal(value: Props): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
      
      inline def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value*))
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
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
    
    inline def category: typings.theo.theoStrings.category = "category".asInstanceOf[typings.theo.theoStrings.category]
    
    inline def comment: typings.theo.theoStrings.comment = "comment".asInstanceOf[typings.theo.theoStrings.comment]
    
    inline def meta: typings.theo.theoStrings.meta = "meta".asInstanceOf[typings.theo.theoStrings.meta]
    
    inline def name: typings.theo.theoStrings.name = "name".asInstanceOf[typings.theo.theoStrings.name]
    
    inline def originalValue: typings.theo.theoStrings.originalValue = "originalValue".asInstanceOf[typings.theo.theoStrings.originalValue]
    
    inline def `type`: typings.theo.theoStrings.`type` = "type".asInstanceOf[typings.theo.theoStrings.`type`]
    
    inline def value: typings.theo.theoStrings.value = "value".asInstanceOf[typings.theo.theoStrings.value]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.theo.theoStrings.raw
    - typings.theo.theoStrings.ios
    - typings.theo.theoStrings.android
    - typings.theo.theoStrings.web
  */
  trait Transform extends StObject
  object Transform {
    
    inline def android: typings.theo.theoStrings.android = "android".asInstanceOf[typings.theo.theoStrings.android]
    
    inline def ios: typings.theo.theoStrings.ios = "ios".asInstanceOf[typings.theo.theoStrings.ios]
    
    inline def raw: typings.theo.theoStrings.raw = "raw".asInstanceOf[typings.theo.theoStrings.raw]
    
    inline def web: typings.theo.theoStrings.web = "web".asInstanceOf[typings.theo.theoStrings.web]
  }
  
  trait TransformOptions[T /* <: String */] extends StObject {
    
    var data: js.UndefOr[String] = js.undefined
    
    var file: String
    
    var `type`: js.UndefOr[Transform | T] = js.undefined
  }
  object TransformOptions {
    
    inline def apply[T /* <: String */](file: String): TransformOptions[T] = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformOptions[?], T /* <: String */] (val x: Self & TransformOptions[T]) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setType(value: Transform | T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    inline def colorSlashhex: typings.theo.theoStrings.colorSlashhex = "color/hex".asInstanceOf[typings.theo.theoStrings.colorSlashhex]
    
    inline def colorSlashhex8argb: typings.theo.theoStrings.colorSlashhex8argb = "color/hex8argb".asInstanceOf[typings.theo.theoStrings.colorSlashhex8argb]
    
    inline def colorSlashhex8rgba: typings.theo.theoStrings.colorSlashhex8rgba = "color/hex8rgba".asInstanceOf[typings.theo.theoStrings.colorSlashhex8rgba]
    
    inline def colorSlashrgb: typings.theo.theoStrings.colorSlashrgb = "color/rgb".asInstanceOf[typings.theo.theoStrings.colorSlashrgb]
    
    inline def percentageSlashfloat: typings.theo.theoStrings.percentageSlashfloat = "percentage/float".asInstanceOf[typings.theo.theoStrings.percentageSlashfloat]
    
    inline def relativeSlashpixel: typings.theo.theoStrings.relativeSlashpixel = "relative/pixel".asInstanceOf[typings.theo.theoStrings.relativeSlashpixel]
    
    inline def relativeSlashpixelValue: typings.theo.theoStrings.relativeSlashpixelValue = "relative/pixelValue".asInstanceOf[typings.theo.theoStrings.relativeSlashpixelValue]
  }
}
