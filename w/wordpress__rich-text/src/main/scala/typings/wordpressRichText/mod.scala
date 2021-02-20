package typings.wordpressRichText

import typings.react.mod.ComponentType
import typings.std.Record
import typings.std.RegExp
import typings.wordpressRichText.anon.Element
import typings.wordpressRichText.anon.Html
import typings.wordpressRichText.anon.MultilineTag
import typings.wordpressRichText.anon.Text
import typings.wordpressRichText.anon.TypeofimportedActions
import typings.wordpressRichText.anon.TypeofimportedSelectors
import typings.wordpressRichText.wordpressRichTextStrings.`coreSlashrich-text`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/rich-text", "applyFormat")
  @js.native
  def applyFormat(value: Value, format: Format): Value = js.native
  @JSImport("@wordpress/rich-text", "applyFormat")
  @js.native
  def applyFormat(value: Value, format: Format, startIndex: js.UndefOr[scala.Nothing], endIndex: Double): Value = js.native
  @JSImport("@wordpress/rich-text", "applyFormat")
  @js.native
  def applyFormat(value: Value, format: Format, startIndex: Double): Value = js.native
  @JSImport("@wordpress/rich-text", "applyFormat")
  @js.native
  def applyFormat(value: Value, format: Format, startIndex: Double, endIndex: Double): Value = js.native
  
  @JSImport("@wordpress/rich-text", "concat")
  @js.native
  def concat(values: Value*): Value = js.native
  
  @JSImport("@wordpress/rich-text", "create")
  @js.native
  def create(): Value = js.native
  @JSImport("@wordpress/rich-text", "create")
  @js.native
  def create(args: Element): Value = js.native
  @JSImport("@wordpress/rich-text", "create")
  @js.native
  def create(args: Html): Value = js.native
  @JSImport("@wordpress/rich-text", "create")
  @js.native
  def create(args: Text): Value = js.native
  
  @JSImport("@wordpress/rich-text", "getActiveFormat")
  @js.native
  def getActiveFormat(value: Value, formatType: String): js.UndefOr[Format] = js.native
  
  @JSImport("@wordpress/rich-text", "getActiveObject")
  @js.native
  def getActiveObject(value: Value): js.UndefOr[js.Object] = js.native
  
  @JSImport("@wordpress/rich-text", "getTextContent")
  @js.native
  def getTextContent(value: Value): String = js.native
  
  @JSImport("@wordpress/rich-text", "insert")
  @js.native
  def insert(value: Value, valueToInsert: Value): Value = js.native
  @JSImport("@wordpress/rich-text", "insert")
  @js.native
  def insert(value: Value, valueToInsert: Value, startIndex: js.UndefOr[scala.Nothing], endIndex: Double): Value = js.native
  @JSImport("@wordpress/rich-text", "insert")
  @js.native
  def insert(value: Value, valueToInsert: Value, startIndex: Double): Value = js.native
  @JSImport("@wordpress/rich-text", "insert")
  @js.native
  def insert(value: Value, valueToInsert: Value, startIndex: Double, endIndex: Double): Value = js.native
  
  @JSImport("@wordpress/rich-text", "insertObject")
  @js.native
  def insertObject(value: Value, formatToInsert: Format): Value = js.native
  
  @JSImport("@wordpress/rich-text", "isCollapsed")
  @js.native
  def isCollapsed(value: Value): js.UndefOr[Boolean] = js.native
  
  @JSImport("@wordpress/rich-text", "isEmpty")
  @js.native
  def isEmpty(value: Value): Boolean = js.native
  
  @JSImport("@wordpress/rich-text", "join")
  @js.native
  def join(values: js.Array[Value]): Value = js.native
  @JSImport("@wordpress/rich-text", "join")
  @js.native
  def join(values: js.Array[Value], separator: String): Value = js.native
  @JSImport("@wordpress/rich-text", "join")
  @js.native
  def join(values: js.Array[Value], separator: Value): Value = js.native
  
  @JSImport("@wordpress/rich-text", "registerFormatType")
  @js.native
  def registerFormatType(name: String, config: FormatConfiguration): js.UndefOr[NamedFormatConfiguration] = js.native
  
  @JSImport("@wordpress/rich-text", "remove")
  @js.native
  def remove(value: Value): Value = js.native
  @JSImport("@wordpress/rich-text", "remove")
  @js.native
  def remove(value: Value, startIndex: js.UndefOr[scala.Nothing], endIndex: Double): Value = js.native
  @JSImport("@wordpress/rich-text", "remove")
  @js.native
  def remove(value: Value, startIndex: Double): Value = js.native
  @JSImport("@wordpress/rich-text", "remove")
  @js.native
  def remove(value: Value, startIndex: Double, endIndex: Double): Value = js.native
  
  @JSImport("@wordpress/rich-text", "removeFormat")
  @js.native
  def removeFormat(value: Value, formatType: String): Value = js.native
  @JSImport("@wordpress/rich-text", "removeFormat")
  @js.native
  def removeFormat(value: Value, formatType: String, startIndex: js.UndefOr[scala.Nothing], endIndex: Double): Value = js.native
  @JSImport("@wordpress/rich-text", "removeFormat")
  @js.native
  def removeFormat(value: Value, formatType: String, startIndex: Double): Value = js.native
  @JSImport("@wordpress/rich-text", "removeFormat")
  @js.native
  def removeFormat(value: Value, formatType: String, startIndex: Double, endIndex: Double): Value = js.native
  
  @JSImport("@wordpress/rich-text", "replace")
  @js.native
  def replace(value: Value, pattern: String, replacement: String): Value = js.native
  @JSImport("@wordpress/rich-text", "replace")
  @js.native
  def replace(
    value: Value,
    pattern: String,
    replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String]
  ): Value = js.native
  @JSImport("@wordpress/rich-text", "replace")
  @js.native
  def replace(value: Value, pattern: RegExp, replacement: String): Value = js.native
  @JSImport("@wordpress/rich-text", "replace")
  @js.native
  def replace(
    value: Value,
    pattern: RegExp,
    replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String]
  ): Value = js.native
  
  @JSImport("@wordpress/rich-text", "slice")
  @js.native
  def slice(value: Value): Value = js.native
  @JSImport("@wordpress/rich-text", "slice")
  @js.native
  def slice(value: Value, startIndex: js.UndefOr[scala.Nothing], endIndex: Double): Value = js.native
  @JSImport("@wordpress/rich-text", "slice")
  @js.native
  def slice(value: Value, startIndex: Double): Value = js.native
  @JSImport("@wordpress/rich-text", "slice")
  @js.native
  def slice(value: Value, startIndex: Double, endIndex: Double): Value = js.native
  
  @JSImport("@wordpress/rich-text", "split")
  @js.native
  def split(value: Value): js.Array[Value] = js.native
  @JSImport("@wordpress/rich-text", "split")
  @js.native
  def split(value: Value, separator: js.UndefOr[scala.Nothing], limit: Double): js.Array[Value] = js.native
  @JSImport("@wordpress/rich-text", "split")
  @js.native
  def split(value: Value, separator: String): js.Array[Value] = js.native
  @JSImport("@wordpress/rich-text", "split")
  @js.native
  def split(value: Value, separator: String, limit: Double): js.Array[Value] = js.native
  @JSImport("@wordpress/rich-text", "split")
  @js.native
  def split(value: Value, separator: Double): js.Array[Value] = js.native
  @JSImport("@wordpress/rich-text", "split")
  @js.native
  def split(value: Value, separator: Double, limit: Double): js.Array[Value] = js.native
  
  @JSImport("@wordpress/rich-text", "toHTMLString")
  @js.native
  def toHTMLString(args: MultilineTag): String = js.native
  
  @JSImport("@wordpress/rich-text", "toggleFormat")
  @js.native
  def toggleFormat(value: Value, format: Format): Value = js.native
  
  @JSImport("@wordpress/rich-text", "unregisterFormatType")
  @js.native
  def unregisterFormatType(name: String): js.UndefOr[NamedFormatConfiguration] = js.native
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", "dispatch")
    @js.native
    def dispatch_corerichtext(key: `coreSlashrich-text`): TypeofimportedActions = js.native
    
    @JSImport("@wordpress/data", "select")
    @js.native
    def select_corerichtext(key: `coreSlashrich-text`): TypeofimportedSelectors = js.native
  }
  
  @js.native
  trait Format extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.native
    
    var `object`: js.UndefOr[Boolean] = js.native
    
    var `type`: String = js.native
    
    var unregisteredAttributes: js.UndefOr[Record[String, String]] = js.native
  }
  object Format {
    
    @scala.inline
    def apply(`type`: String): Format = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setObject(value: Boolean): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnregisteredAttributes(value: Record[String, String]): Self = StObject.set(x, "unregisteredAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnregisteredAttributesUndefined: Self = StObject.set(x, "unregisteredAttributes", js.undefined)
    }
  }
  
  @js.native
  trait FormatConfiguration extends StObject {
    
    /**
      * Maps react prop name to html attribute name.
      *
      * { className: 'class' } => <tag class={<className attr here>}></tag>
      */
    var attributes: js.UndefOr[Record[String, String]] = js.native
    
    var className: String | Null = js.native
    
    var edit: ComponentType[FormatProps] = js.native
    
    var keywords: js.UndefOr[
        js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String])
      ] = js.native
    
    var `object`: js.UndefOr[Boolean] = js.native
    
    var tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) with String = js.native
    
    var title: String = js.native
  }
  object FormatConfiguration {
    
    @scala.inline
    def apply(
      edit: ComponentType[FormatProps],
      tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) with String,
      title: String
    ): FormatConfiguration = {
      val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatConfiguration]
    }
    
    @scala.inline
    implicit class FormatConfigurationMutableBuilder[Self <: FormatConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameNull: Self = StObject.set(x, "className", null)
      
      @scala.inline
      def setEdit(value: ComponentType[FormatProps]): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywords(value: js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String])): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setObject(value: Boolean): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setTagName(
        value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) with String
      ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FormatProps extends StObject {
    
    var activeAttributes: Record[String, String] = js.native
    
    var isActive: Boolean = js.native
    
    def onChange(value: Value): Unit = js.native
    
    var value: Value = js.native
  }
  object FormatProps {
    
    @scala.inline
    def apply(activeAttributes: Record[String, String], isActive: Boolean, onChange: Value => Unit, value: Value): FormatProps = {
      val __obj = js.Dynamic.literal(activeAttributes = activeAttributes.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatProps]
    }
    
    @scala.inline
    implicit class FormatPropsMutableBuilder[Self <: FormatProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveAttributes(value: Record[String, String]): Self = StObject.set(x, "activeAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NamedFormatConfiguration extends FormatConfiguration {
    
    var name: String = js.native
  }
  object NamedFormatConfiguration {
    
    @scala.inline
    def apply(
      edit: ComponentType[FormatProps],
      name: String,
      tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) with String,
      title: String
    ): NamedFormatConfiguration = {
      val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedFormatConfiguration]
    }
    
    @scala.inline
    implicit class NamedFormatConfigurationMutableBuilder[Self <: NamedFormatConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var activeFormats: js.UndefOr[js.Array[Format]] = js.native
    
    var end: js.UndefOr[Double] = js.native
    
    var formats: js.Array[js.UndefOr[js.Array[Format]]] = js.native
    
    var replacements: js.Array[js.UndefOr[js.Array[Format]]] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var text: String = js.native
  }
  object Value {
    
    @scala.inline
    def apply(
      formats: js.Array[js.UndefOr[js.Array[Format]]],
      replacements: js.Array[js.UndefOr[js.Array[Format]]],
      text: String
    ): Value = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], replacements = replacements.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveFormats(value: js.Array[Format]): Self = StObject.set(x, "activeFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveFormatsUndefined: Self = StObject.set(x, "activeFormats", js.undefined)
      
      @scala.inline
      def setActiveFormatsVarargs(value: Format*): Self = StObject.set(x, "activeFormats", js.Array(value :_*))
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFormats(value: js.Array[js.UndefOr[js.Array[Format]]]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsVarargs(value: js.UndefOr[js.Array[Format]]*): Self = StObject.set(x, "formats", js.Array(value :_*))
      
      @scala.inline
      def setReplacements(value: js.Array[js.UndefOr[js.Array[Format]]]): Self = StObject.set(x, "replacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacementsVarargs(value: js.UndefOr[js.Array[Format]]*): Self = StObject.set(x, "replacements", js.Array(value :_*))
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
