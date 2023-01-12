package typings.wordpressRichText

import typings.std.Range
import typings.wordpressRichText.mod.NamedFormatConfiguration
import typings.wordpressRichText.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Element extends StObject {
    
    var element: typings.std.Element
    
    var multilineTag: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any
      ] = js.undefined
    
    var multilineWrapperTags: js.UndefOr[
        js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any
        ]
      ] = js.undefined
    
    var range: js.UndefOr[Range] = js.undefined
  }
  object Element {
    
    inline def apply(element: typings.std.Element): Element = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setMultilineTag(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any
      ): Self = StObject.set(x, "multilineTag", value.asInstanceOf[js.Any])
      
      inline def setMultilineTagUndefined: Self = StObject.set(x, "multilineTag", js.undefined)
      
      inline def setMultilineWrapperTags(
        value: js.Array[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any
            ]
      ): Self = StObject.set(x, "multilineWrapperTags", value.asInstanceOf[js.Any])
      
      inline def setMultilineWrapperTagsUndefined: Self = StObject.set(x, "multilineWrapperTags", js.undefined)
      
      inline def setMultilineWrapperTagsVarargs(
        value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any)*
      ): Self = StObject.set(x, "multilineWrapperTags", js.Array(value*))
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  trait Html extends StObject {
    
    var html: String
  }
  object Html {
    
    inline def apply(html: String): Html = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultilineTag extends StObject {
    
    var multilineTag: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any
      ] = js.undefined
    
    var value: Value
  }
  object MultilineTag {
    
    inline def apply(value: Value): MultilineTag = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultilineTag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultilineTag] (val x: Self) extends AnyVal {
      
      inline def setMultilineTag(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any
      ): Self = StObject.set(x, "multilineTag", value.asInstanceOf[js.Any])
      
      inline def setMultilineTagUndefined: Self = StObject.set(x, "multilineTag", js.undefined)
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var text: String
  }
  object Text {
    
    inline def apply(text: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofimportedActions extends StObject {
    
    def addFormatTypes(configs: js.Array[NamedFormatConfiguration]): Unit = js.native
    def addFormatTypes(configs: NamedFormatConfiguration): Unit = js.native
    
    def removeFormatTypes(names: String): Unit = js.native
    def removeFormatTypes(names: js.Array[String]): Unit = js.native
  }
  
  trait TypeofimportedSelectors extends StObject {
    
    def getFormatType(name: String): js.UndefOr[NamedFormatConfiguration]
    
    def getFormatTypeForBareElement(
      bareElementTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any
    ): js.UndefOr[NamedFormatConfiguration]
    
    def getFormatTypeForClassName(elementClassName: String): js.UndefOr[NamedFormatConfiguration]
    
    def getFormatTypes(): js.Array[NamedFormatConfiguration]
  }
  object TypeofimportedSelectors {
    
    inline def apply(
      getFormatType: String => js.UndefOr[NamedFormatConfiguration],
      getFormatTypeForBareElement: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any => js.UndefOr[NamedFormatConfiguration],
      getFormatTypeForClassName: String => js.UndefOr[NamedFormatConfiguration],
      getFormatTypes: () => js.Array[NamedFormatConfiguration]
    ): TypeofimportedSelectors = {
      val __obj = js.Dynamic.literal(getFormatType = js.Any.fromFunction1(getFormatType), getFormatTypeForBareElement = js.Any.fromFunction1(getFormatTypeForBareElement), getFormatTypeForClassName = js.Any.fromFunction1(getFormatTypeForClassName), getFormatTypes = js.Any.fromFunction0(getFormatTypes))
      __obj.asInstanceOf[TypeofimportedSelectors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofimportedSelectors] (val x: Self) extends AnyVal {
      
      inline def setGetFormatType(value: String => js.UndefOr[NamedFormatConfiguration]): Self = StObject.set(x, "getFormatType", js.Any.fromFunction1(value))
      
      inline def setGetFormatTypeForBareElement(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any => js.UndefOr[NamedFormatConfiguration]
      ): Self = StObject.set(x, "getFormatTypeForBareElement", js.Any.fromFunction1(value))
      
      inline def setGetFormatTypeForClassName(value: String => js.UndefOr[NamedFormatConfiguration]): Self = StObject.set(x, "getFormatTypeForClassName", js.Any.fromFunction1(value))
      
      inline def setGetFormatTypes(value: () => js.Array[NamedFormatConfiguration]): Self = StObject.set(x, "getFormatTypes", js.Any.fromFunction0(value))
    }
  }
}
