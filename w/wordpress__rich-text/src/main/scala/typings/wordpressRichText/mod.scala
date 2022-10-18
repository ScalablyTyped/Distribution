package typings.wordpressRichText

import typings.react.mod.ComponentType
import typings.std.Record
import typings.wordpressRichText.anon.Element
import typings.wordpressRichText.anon.Html
import typings.wordpressRichText.anon.MultilineTag
import typings.wordpressRichText.anon.Text
import typings.wordpressRichText.anon.TypeofimportedActions
import typings.wordpressRichText.anon.TypeofimportedSelectors
import typings.wordpressRichText.wordpressRichTextStrings.`coreSlashrich-text`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/rich-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyFormat(value: Value, format: Format): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFormat")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def applyFormat(value: Value, format: Format, startIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFormat")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def applyFormat(value: Value, format: Format, startIndex: Double, endIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFormat")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def applyFormat(value: Value, format: Format, startIndex: Unit, endIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFormat")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def concat(values: Value*): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Value]
  
  inline def create(): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Value]
  inline def create(args: Element): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def create(args: Html): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def create(args: Text): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  inline def getActiveFormat(value: Value, formatType: String): js.UndefOr[Format] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveFormat")(value.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Format]]
  
  inline def getActiveObject(value: Value): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveObject")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object]]
  
  inline def getTextContent(value: Value): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextContent")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def insert(value: Value, valueToInsert: Value): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(value.asInstanceOf[js.Any], valueToInsert.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def insert(value: Value, valueToInsert: Value, startIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(value.asInstanceOf[js.Any], valueToInsert.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def insert(value: Value, valueToInsert: Value, startIndex: Double, endIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(value.asInstanceOf[js.Any], valueToInsert.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def insert(value: Value, valueToInsert: Value, startIndex: Unit, endIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(value.asInstanceOf[js.Any], valueToInsert.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def insertObject(value: Value, formatToInsert: Format): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("insertObject")(value.asInstanceOf[js.Any], formatToInsert.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def isCollapsed(value: Value): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollapsed")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def isEmpty(value: Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def join(values: js.Array[Value]): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(values.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def join(values: js.Array[Value], separator: String): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(values.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def join(values: js.Array[Value], separator: Value): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(values.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def registerFormatType(name: String, config: FormatConfiguration): js.UndefOr[NamedFormatConfiguration] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFormatType")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NamedFormatConfiguration]]
  
  inline def remove(value: Value): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(value.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def remove(value: Value, startIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def remove(value: Value, startIndex: Double, endIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def remove(value: Value, startIndex: Unit, endIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def removeFormat(value: Value, formatType: String): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFormat")(value.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def removeFormat(value: Value, formatType: String, startIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFormat")(value.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def removeFormat(value: Value, formatType: String, startIndex: Double, endIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFormat")(value.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def removeFormat(value: Value, formatType: String, startIndex: Unit, endIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFormat")(value.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def replace(value: Value, pattern: String, replacement: String): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def replace(
    value: Value,
    pattern: String,
    replacement: js.Function2[/* match */ String, /* repeated */ Any, String]
  ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def replace(value: Value, pattern: js.RegExp, replacement: String): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def replace(
    value: Value,
    pattern: js.RegExp,
    replacement: js.Function2[/* match */ String, /* repeated */ Any, String]
  ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def slice(value: Value): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(value.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def slice(value: Value, startIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def slice(value: Value, startIndex: Double, endIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def slice(value: Value, startIndex: Unit, endIndex: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(value.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def split(value: Value): js.Array[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Value]]
  inline def split(value: Value, separator: String): js.Array[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
  inline def split(value: Value, separator: String, limit: Double): js.Array[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
  inline def split(value: Value, separator: Double): js.Array[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
  inline def split(value: Value, separator: Double, limit: Double): js.Array[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
  inline def split(value: Value, separator: Unit, limit: Double): js.Array[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
  
  inline def toHTMLString(args: MultilineTag): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLString")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toggleFormat(value: Value, format: Format): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleFormat")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def unregisterFormatType(name: String): js.UndefOr[NamedFormatConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterFormatType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NamedFormatConfiguration]]
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def dispatch_corerichtext(key: `coreSlashrich-text`): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
    
    inline def select_corerichtext(key: `coreSlashrich-text`): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
  }
  
  trait Format extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var `object`: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
    
    var unregisteredAttributes: js.UndefOr[Record[String, String]] = js.undefined
  }
  object Format {
    
    inline def apply(`type`: String): Format = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setObject(value: Boolean): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnregisteredAttributes(value: Record[String, String]): Self = StObject.set(x, "unregisteredAttributes", value.asInstanceOf[js.Any])
      
      inline def setUnregisteredAttributesUndefined: Self = StObject.set(x, "unregisteredAttributes", js.undefined)
    }
  }
  
  trait FormatConfiguration extends StObject {
    
    /**
      * Maps react prop name to html attribute name.
      *
      * { className: 'class' } => <tag class={<className attr here>}></tag>
      */
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var className: String | Null
    
    var edit: ComponentType[FormatProps]
    
    var keywords: js.UndefOr[
        js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String])
      ] = js.undefined
    
    var `object`: js.UndefOr[Boolean] = js.undefined
    
    var tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any) & String
    
    var title: String
  }
  object FormatConfiguration {
    
    inline def apply(
      edit: ComponentType[FormatProps],
      tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any) & String,
      title: String
    ): FormatConfiguration = {
      val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], className = null)
      __obj.asInstanceOf[FormatConfiguration]
    }
    
    extension [Self <: FormatConfiguration](x: Self) {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setEdit(value: ComponentType[FormatProps]): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      inline def setKeywords(value: js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String])): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setObject(value: Boolean): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setTagName(
        value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any) & String
      ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatProps extends StObject {
    
    var activeAttributes: Record[String, String]
    
    var isActive: Boolean
    
    def onChange(value: Value): Unit
    
    var value: Value
  }
  object FormatProps {
    
    inline def apply(activeAttributes: Record[String, String], isActive: Boolean, onChange: Value => Unit, value: Value): FormatProps = {
      val __obj = js.Dynamic.literal(activeAttributes = activeAttributes.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatProps]
    }
    
    extension [Self <: FormatProps](x: Self) {
      
      inline def setActiveAttributes(value: Record[String, String]): Self = StObject.set(x, "activeAttributes", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait NamedFormatConfiguration
    extends StObject
       with FormatConfiguration {
    
    var name: String
  }
  object NamedFormatConfiguration {
    
    inline def apply(
      edit: ComponentType[FormatProps],
      name: String,
      tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any) & String,
      title: String
    ): NamedFormatConfiguration = {
      val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], className = null)
      __obj.asInstanceOf[NamedFormatConfiguration]
    }
    
    extension [Self <: NamedFormatConfiguration](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var activeFormats: js.UndefOr[js.Array[Format]] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var formats: js.Array[js.UndefOr[js.Array[Format]]]
    
    var replacements: js.Array[js.UndefOr[js.Array[Format]]]
    
    var start: js.UndefOr[Double] = js.undefined
    
    var text: String
  }
  object Value {
    
    inline def apply(
      formats: js.Array[js.UndefOr[js.Array[Format]]],
      replacements: js.Array[js.UndefOr[js.Array[Format]]],
      text: String
    ): Value = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], replacements = replacements.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setActiveFormats(value: js.Array[Format]): Self = StObject.set(x, "activeFormats", value.asInstanceOf[js.Any])
      
      inline def setActiveFormatsUndefined: Self = StObject.set(x, "activeFormats", js.undefined)
      
      inline def setActiveFormatsVarargs(value: Format*): Self = StObject.set(x, "activeFormats", js.Array(value*))
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFormats(value: js.Array[js.UndefOr[js.Array[Format]]]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsVarargs(value: js.UndefOr[js.Array[Format]]*): Self = StObject.set(x, "formats", js.Array(value*))
      
      inline def setReplacements(value: js.Array[js.UndefOr[js.Array[Format]]]): Self = StObject.set(x, "replacements", value.asInstanceOf[js.Any])
      
      inline def setReplacementsVarargs(value: js.UndefOr[js.Array[Format]]*): Self = StObject.set(x, "replacements", js.Array(value*))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
