package typings.xmlJs

import org.scalablytyped.runtime.StringDictionary
import typings.xmlJs.anon.`0`
import typings.xmlJs.mod.Options.JS2XML
import typings.xmlJs.mod.Options.XML2JS
import typings.xmlJs.mod.Options.XML2JSON
import typings.xmlJs.xmlJsStrings.`utf-8`
import typings.xmlJs.xmlJsStrings.no
import typings.xmlJs.xmlJsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml-js", "js2xml")
  @js.native
  def js2xml(obj: Element): String = js.native
  @JSImport("xml-js", "js2xml")
  @js.native
  def js2xml(obj: ElementCompact): String = js.native
  @JSImport("xml-js", "js2xml")
  @js.native
  def js2xml(obj: ElementCompact, options: JS2XML): String = js.native
  @JSImport("xml-js", "js2xml")
  @js.native
  def js2xml(obj: Element, options: JS2XML): String = js.native
  
  @JSImport("xml-js", "json2xml")
  @js.native
  def json2xml(json: String): String = js.native
  @JSImport("xml-js", "json2xml")
  @js.native
  def json2xml(json: String, options: JS2XML): String = js.native
  
  @JSImport("xml-js", "xml2js")
  @js.native
  def xml2js(xml: String): Element | ElementCompact = js.native
  @JSImport("xml-js", "xml2js")
  @js.native
  def xml2js(xml: String, options: XML2JS): Element | ElementCompact = js.native
  
  @JSImport("xml-js", "xml2json")
  @js.native
  def xml2json(xml: String): String = js.native
  @JSImport("xml-js", "xml2json")
  @js.native
  def xml2json(xml: String, options: XML2JSON): String = js.native
  
  type Attributes = StringDictionary[js.UndefOr[String | Double]]
  
  @js.native
  trait DeclarationAttributes extends StObject {
    
    var encoding: js.UndefOr[`utf-8` | String] = js.native
    
    var standalone: js.UndefOr[yes | no] = js.native
    
    var version: js.UndefOr[String | Double] = js.native
  }
  object DeclarationAttributes {
    
    @scala.inline
    def apply(): DeclarationAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeclarationAttributes]
    }
    
    @scala.inline
    implicit class DeclarationAttributesMutableBuilder[Self <: DeclarationAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: `utf-8` | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setStandalone(value: yes | no): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      @scala.inline
      def setVersion(value: String | Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Element extends StObject {
    
    var attributes: js.UndefOr[Attributes] = js.native
    
    var cdata: js.UndefOr[String] = js.native
    
    var comment: js.UndefOr[String] = js.native
    
    var declaration: js.UndefOr[`0`] = js.native
    
    var doctype: js.UndefOr[String] = js.native
    
    var elements: js.UndefOr[js.Array[Element]] = js.native
    
    var instruction: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var text: js.UndefOr[String | Double | Boolean] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object Element {
    
    @scala.inline
    def apply(): Element = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setCdata(value: String): Self = StObject.set(x, "cdata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDeclaration(value: `0`): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      @scala.inline
      def setDoctype(value: String): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
      
      @scala.inline
      def setElements(value: js.Array[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      @scala.inline
      def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      @scala.inline
      def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setText(value: String | Double | Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ElementCompact
    extends /* key */ StringDictionary[js.Any] {
    
    var _attributes: js.UndefOr[Attributes] = js.native
    
    var _cdata: js.UndefOr[String] = js.native
    
    var _comment: js.UndefOr[String] = js.native
    
    var _declaration: js.UndefOr[typings.xmlJs.anon.Attributes] = js.native
    
    var _doctype: js.UndefOr[String] = js.native
    
    var _instruction: js.UndefOr[StringDictionary[String]] = js.native
    
    var _text: js.UndefOr[String | Double] = js.native
  }
  object ElementCompact {
    
    @scala.inline
    def apply(): ElementCompact = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementCompact]
    }
    
    @scala.inline
    implicit class ElementCompactMutableBuilder[Self <: ElementCompact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_attributes(value: Attributes): Self = StObject.set(x, "_attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_attributesUndefined: Self = StObject.set(x, "_attributes", js.undefined)
      
      @scala.inline
      def set_cdata(value: String): Self = StObject.set(x, "_cdata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_cdataUndefined: Self = StObject.set(x, "_cdata", js.undefined)
      
      @scala.inline
      def set_comment(value: String): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
      
      @scala.inline
      def set_declaration(value: typings.xmlJs.anon.Attributes): Self = StObject.set(x, "_declaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_declarationUndefined: Self = StObject.set(x, "_declaration", js.undefined)
      
      @scala.inline
      def set_doctype(value: String): Self = StObject.set(x, "_doctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_doctypeUndefined: Self = StObject.set(x, "_doctype", js.undefined)
      
      @scala.inline
      def set_instruction(value: StringDictionary[String]): Self = StObject.set(x, "_instruction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_instructionUndefined: Self = StObject.set(x, "_instruction", js.undefined)
      
      @scala.inline
      def set_text(value: String | Double): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    }
  }
  
  object Options {
    
    @js.native
    trait ChangingKeyNames extends StObject {
      
      var attributesKey: js.UndefOr[String] = js.native
      
      var cdataKey: js.UndefOr[String] = js.native
      
      var commentKey: js.UndefOr[String] = js.native
      
      var declarationKey: js.UndefOr[String] = js.native
      
      var doctypeKey: js.UndefOr[String] = js.native
      
      var elementsKey: js.UndefOr[String] = js.native
      
      var instructionKey: js.UndefOr[String] = js.native
      
      var nameKey: js.UndefOr[String] = js.native
      
      var parentKey: js.UndefOr[String] = js.native
      
      var textKey: js.UndefOr[String] = js.native
      
      var typeKey: js.UndefOr[String] = js.native
    }
    object ChangingKeyNames {
      
      @scala.inline
      def apply(): ChangingKeyNames = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChangingKeyNames]
      }
      
      @scala.inline
      implicit class ChangingKeyNamesMutableBuilder[Self <: ChangingKeyNames] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttributesKey(value: String): Self = StObject.set(x, "attributesKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttributesKeyUndefined: Self = StObject.set(x, "attributesKey", js.undefined)
        
        @scala.inline
        def setCdataKey(value: String): Self = StObject.set(x, "cdataKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCdataKeyUndefined: Self = StObject.set(x, "cdataKey", js.undefined)
        
        @scala.inline
        def setCommentKey(value: String): Self = StObject.set(x, "commentKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCommentKeyUndefined: Self = StObject.set(x, "commentKey", js.undefined)
        
        @scala.inline
        def setDeclarationKey(value: String): Self = StObject.set(x, "declarationKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeclarationKeyUndefined: Self = StObject.set(x, "declarationKey", js.undefined)
        
        @scala.inline
        def setDoctypeKey(value: String): Self = StObject.set(x, "doctypeKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDoctypeKeyUndefined: Self = StObject.set(x, "doctypeKey", js.undefined)
        
        @scala.inline
        def setElementsKey(value: String): Self = StObject.set(x, "elementsKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementsKeyUndefined: Self = StObject.set(x, "elementsKey", js.undefined)
        
        @scala.inline
        def setInstructionKey(value: String): Self = StObject.set(x, "instructionKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInstructionKeyUndefined: Self = StObject.set(x, "instructionKey", js.undefined)
        
        @scala.inline
        def setNameKey(value: String): Self = StObject.set(x, "nameKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameKeyUndefined: Self = StObject.set(x, "nameKey", js.undefined)
        
        @scala.inline
        def setParentKey(value: String): Self = StObject.set(x, "parentKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentKeyUndefined: Self = StObject.set(x, "parentKey", js.undefined)
        
        @scala.inline
        def setTextKey(value: String): Self = StObject.set(x, "textKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextKeyUndefined: Self = StObject.set(x, "textKey", js.undefined)
        
        @scala.inline
        def setTypeKey(value: String): Self = StObject.set(x, "typeKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeKeyUndefined: Self = StObject.set(x, "typeKey", js.undefined)
      }
    }
    
    @js.native
    trait IgnoreOptions extends StObject {
      
      var ignoreAttributes: js.UndefOr[Boolean] = js.native
      
      var ignoreCdata: js.UndefOr[Boolean] = js.native
      
      var ignoreComment: js.UndefOr[Boolean] = js.native
      
      var ignoreDeclaration: js.UndefOr[Boolean] = js.native
      
      var ignoreDoctype: js.UndefOr[Boolean] = js.native
      
      var ignoreInstruction: js.UndefOr[Boolean] = js.native
      
      var ignoreText: js.UndefOr[Boolean] = js.native
    }
    object IgnoreOptions {
      
      @scala.inline
      def apply(): IgnoreOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IgnoreOptions]
      }
      
      @scala.inline
      implicit class IgnoreOptionsMutableBuilder[Self <: IgnoreOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIgnoreAttributes(value: Boolean): Self = StObject.set(x, "ignoreAttributes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreAttributesUndefined: Self = StObject.set(x, "ignoreAttributes", js.undefined)
        
        @scala.inline
        def setIgnoreCdata(value: Boolean): Self = StObject.set(x, "ignoreCdata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreCdataUndefined: Self = StObject.set(x, "ignoreCdata", js.undefined)
        
        @scala.inline
        def setIgnoreComment(value: Boolean): Self = StObject.set(x, "ignoreComment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreCommentUndefined: Self = StObject.set(x, "ignoreComment", js.undefined)
        
        @scala.inline
        def setIgnoreDeclaration(value: Boolean): Self = StObject.set(x, "ignoreDeclaration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreDeclarationUndefined: Self = StObject.set(x, "ignoreDeclaration", js.undefined)
        
        @scala.inline
        def setIgnoreDoctype(value: Boolean): Self = StObject.set(x, "ignoreDoctype", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreDoctypeUndefined: Self = StObject.set(x, "ignoreDoctype", js.undefined)
        
        @scala.inline
        def setIgnoreInstruction(value: Boolean): Self = StObject.set(x, "ignoreInstruction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreInstructionUndefined: Self = StObject.set(x, "ignoreInstruction", js.undefined)
        
        @scala.inline
        def setIgnoreText(value: Boolean): Self = StObject.set(x, "ignoreText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreTextUndefined: Self = StObject.set(x, "ignoreText", js.undefined)
      }
    }
    
    @js.native
    trait JS2XML
      extends ChangingKeyNames
         with IgnoreOptions {
      
      var attributeNameFn: js.UndefOr[
            js.Function4[
              /* attributeName */ String, 
              /* attributeValue */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.native
      
      var attributeValueFn: js.UndefOr[
            js.Function4[
              /* attributeValue */ String, 
              /* attributeName */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.native
      
      var attributesFn: js.UndefOr[
            js.Function3[
              /* value */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.native
      
      var cdataFn: js.UndefOr[
            js.Function3[
              /* value */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.native
      
      var commentFn: js.UndefOr[
            js.Function3[
              /* value */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.native
      
      var compact: js.UndefOr[Boolean] = js.native
      
      var doctypeFn: js.UndefOr[
            js.Function3[
              /* value */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.native
      
      var elementNameFn: js.UndefOr[
            js.Function3[
              /* value */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.native
      
      var fullTagEmptyElement: js.UndefOr[Boolean] = js.native
      
      var fullTagEmptyElementFn: js.UndefOr[
            js.Function2[/* currentElementName */ String, /* currentElementObj */ js.Object, Unit]
          ] = js.native
      
      var indentAttributes: js.UndefOr[Boolean] = js.native
      
      var indentCdata: js.UndefOr[Boolean] = js.native
      
      var indentInstruction: js.UndefOr[Boolean] = js.native
      
      var indentText: js.UndefOr[Boolean] = js.native
      
      var instructionFn: js.UndefOr[
            js.Function4[
              /* instructionValue */ String, 
              /* instructionName */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.native
      
      var instructionNameFn: js.UndefOr[
            js.Function4[
              /* instructionName */ String, 
              /* instructionValue */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.native
      
      var noQuotesForNativeAttributes: js.UndefOr[Boolean] = js.native
      
      var spaces: js.UndefOr[Double | String] = js.native
      
      var textFn: js.UndefOr[
            js.Function3[
              /* value */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.native
    }
    object JS2XML {
      
      @scala.inline
      def apply(): JS2XML = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JS2XML]
      }
      
      @scala.inline
      implicit class JS2XMLMutableBuilder[Self <: JS2XML] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttributeNameFn(
          value: (/* attributeName */ String, /* attributeValue */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "attributeNameFn", js.Any.fromFunction4(value))
        
        @scala.inline
        def setAttributeNameFnUndefined: Self = StObject.set(x, "attributeNameFn", js.undefined)
        
        @scala.inline
        def setAttributeValueFn(
          value: (/* attributeValue */ String, /* attributeName */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "attributeValueFn", js.Any.fromFunction4(value))
        
        @scala.inline
        def setAttributeValueFnUndefined: Self = StObject.set(x, "attributeValueFn", js.undefined)
        
        @scala.inline
        def setAttributesFn(
          value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "attributesFn", js.Any.fromFunction3(value))
        
        @scala.inline
        def setAttributesFnUndefined: Self = StObject.set(x, "attributesFn", js.undefined)
        
        @scala.inline
        def setCdataFn(
          value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "cdataFn", js.Any.fromFunction3(value))
        
        @scala.inline
        def setCdataFnUndefined: Self = StObject.set(x, "cdataFn", js.undefined)
        
        @scala.inline
        def setCommentFn(
          value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "commentFn", js.Any.fromFunction3(value))
        
        @scala.inline
        def setCommentFnUndefined: Self = StObject.set(x, "commentFn", js.undefined)
        
        @scala.inline
        def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
        
        @scala.inline
        def setDoctypeFn(
          value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "doctypeFn", js.Any.fromFunction3(value))
        
        @scala.inline
        def setDoctypeFnUndefined: Self = StObject.set(x, "doctypeFn", js.undefined)
        
        @scala.inline
        def setElementNameFn(
          value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "elementNameFn", js.Any.fromFunction3(value))
        
        @scala.inline
        def setElementNameFnUndefined: Self = StObject.set(x, "elementNameFn", js.undefined)
        
        @scala.inline
        def setFullTagEmptyElement(value: Boolean): Self = StObject.set(x, "fullTagEmptyElement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFullTagEmptyElementFn(value: (/* currentElementName */ String, /* currentElementObj */ js.Object) => Unit): Self = StObject.set(x, "fullTagEmptyElementFn", js.Any.fromFunction2(value))
        
        @scala.inline
        def setFullTagEmptyElementFnUndefined: Self = StObject.set(x, "fullTagEmptyElementFn", js.undefined)
        
        @scala.inline
        def setFullTagEmptyElementUndefined: Self = StObject.set(x, "fullTagEmptyElement", js.undefined)
        
        @scala.inline
        def setIndentAttributes(value: Boolean): Self = StObject.set(x, "indentAttributes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndentAttributesUndefined: Self = StObject.set(x, "indentAttributes", js.undefined)
        
        @scala.inline
        def setIndentCdata(value: Boolean): Self = StObject.set(x, "indentCdata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndentCdataUndefined: Self = StObject.set(x, "indentCdata", js.undefined)
        
        @scala.inline
        def setIndentInstruction(value: Boolean): Self = StObject.set(x, "indentInstruction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndentInstructionUndefined: Self = StObject.set(x, "indentInstruction", js.undefined)
        
        @scala.inline
        def setIndentText(value: Boolean): Self = StObject.set(x, "indentText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndentTextUndefined: Self = StObject.set(x, "indentText", js.undefined)
        
        @scala.inline
        def setInstructionFn(
          value: (/* instructionValue */ String, /* instructionName */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "instructionFn", js.Any.fromFunction4(value))
        
        @scala.inline
        def setInstructionFnUndefined: Self = StObject.set(x, "instructionFn", js.undefined)
        
        @scala.inline
        def setInstructionNameFn(
          value: (/* instructionName */ String, /* instructionValue */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "instructionNameFn", js.Any.fromFunction4(value))
        
        @scala.inline
        def setInstructionNameFnUndefined: Self = StObject.set(x, "instructionNameFn", js.undefined)
        
        @scala.inline
        def setNoQuotesForNativeAttributes(value: Boolean): Self = StObject.set(x, "noQuotesForNativeAttributes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoQuotesForNativeAttributesUndefined: Self = StObject.set(x, "noQuotesForNativeAttributes", js.undefined)
        
        @scala.inline
        def setSpaces(value: Double | String): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
        
        @scala.inline
        def setTextFn(
          value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "textFn", js.Any.fromFunction3(value))
        
        @scala.inline
        def setTextFnUndefined: Self = StObject.set(x, "textFn", js.undefined)
      }
    }
    
    @js.native
    trait XML2JS
      extends ChangingKeyNames
         with IgnoreOptions {
      
      var addParent: js.UndefOr[Boolean] = js.native
      
      var alwaysArray: js.UndefOr[Boolean | js.Array[String]] = js.native
      
      var alwaysChildren: js.UndefOr[Boolean] = js.native
      
      var attributeNameFn: js.UndefOr[
            js.Function3[
              /* attributeName */ String, 
              /* attributeValue */ String, 
              /* parentElement */ String, 
              Unit
            ]
          ] = js.native
      
      var attributeValueFn: js.UndefOr[
            js.Function3[
              /* attributeValue */ String, 
              /* attributeName */ String, 
              /* parentElement */ String, 
              Unit
            ]
          ] = js.native
      
      var attributesFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ String, Unit]] = js.native
      
      var captureSpacesBetweenElements: js.UndefOr[Boolean] = js.native
      
      var cdataFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
      
      var commentFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
      
      var compact: js.UndefOr[Boolean] = js.native
      
      var doctypeFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
      
      var elementNameFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
      
      var instructionFn: js.UndefOr[
            js.Function3[
              /* instructionValue */ String, 
              /* instructionName */ String, 
              /* parentElement */ String, 
              Unit
            ]
          ] = js.native
      
      var instructionHasAttributes: js.UndefOr[Boolean] = js.native
      
      var instructionNameFn: js.UndefOr[
            js.Function3[
              /* instructionName */ String, 
              /* instructionValue */ String, 
              /* parentElement */ String, 
              Unit
            ]
          ] = js.native
      
      var nativeType: js.UndefOr[Boolean] = js.native
      
      var sanitize: js.UndefOr[Boolean] = js.native
      
      var textFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.native
      
      var trim: js.UndefOr[Boolean] = js.native
    }
    object XML2JS {
      
      @scala.inline
      def apply(): XML2JS = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[XML2JS]
      }
      
      @scala.inline
      implicit class XML2JSMutableBuilder[Self <: XML2JS] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddParent(value: Boolean): Self = StObject.set(x, "addParent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddParentUndefined: Self = StObject.set(x, "addParent", js.undefined)
        
        @scala.inline
        def setAlwaysArray(value: Boolean | js.Array[String]): Self = StObject.set(x, "alwaysArray", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlwaysArrayUndefined: Self = StObject.set(x, "alwaysArray", js.undefined)
        
        @scala.inline
        def setAlwaysArrayVarargs(value: String*): Self = StObject.set(x, "alwaysArray", js.Array(value :_*))
        
        @scala.inline
        def setAlwaysChildren(value: Boolean): Self = StObject.set(x, "alwaysChildren", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlwaysChildrenUndefined: Self = StObject.set(x, "alwaysChildren", js.undefined)
        
        @scala.inline
        def setAttributeNameFn(
          value: (/* attributeName */ String, /* attributeValue */ String, /* parentElement */ String) => Unit
        ): Self = StObject.set(x, "attributeNameFn", js.Any.fromFunction3(value))
        
        @scala.inline
        def setAttributeNameFnUndefined: Self = StObject.set(x, "attributeNameFn", js.undefined)
        
        @scala.inline
        def setAttributeValueFn(
          value: (/* attributeValue */ String, /* attributeName */ String, /* parentElement */ String) => Unit
        ): Self = StObject.set(x, "attributeValueFn", js.Any.fromFunction3(value))
        
        @scala.inline
        def setAttributeValueFnUndefined: Self = StObject.set(x, "attributeValueFn", js.undefined)
        
        @scala.inline
        def setAttributesFn(value: (/* value */ String, /* parentElement */ String) => Unit): Self = StObject.set(x, "attributesFn", js.Any.fromFunction2(value))
        
        @scala.inline
        def setAttributesFnUndefined: Self = StObject.set(x, "attributesFn", js.undefined)
        
        @scala.inline
        def setCaptureSpacesBetweenElements(value: Boolean): Self = StObject.set(x, "captureSpacesBetweenElements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaptureSpacesBetweenElementsUndefined: Self = StObject.set(x, "captureSpacesBetweenElements", js.undefined)
        
        @scala.inline
        def setCdataFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = StObject.set(x, "cdataFn", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCdataFnUndefined: Self = StObject.set(x, "cdataFn", js.undefined)
        
        @scala.inline
        def setCommentFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = StObject.set(x, "commentFn", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCommentFnUndefined: Self = StObject.set(x, "commentFn", js.undefined)
        
        @scala.inline
        def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
        
        @scala.inline
        def setDoctypeFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = StObject.set(x, "doctypeFn", js.Any.fromFunction2(value))
        
        @scala.inline
        def setDoctypeFnUndefined: Self = StObject.set(x, "doctypeFn", js.undefined)
        
        @scala.inline
        def setElementNameFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = StObject.set(x, "elementNameFn", js.Any.fromFunction2(value))
        
        @scala.inline
        def setElementNameFnUndefined: Self = StObject.set(x, "elementNameFn", js.undefined)
        
        @scala.inline
        def setInstructionFn(
          value: (/* instructionValue */ String, /* instructionName */ String, /* parentElement */ String) => Unit
        ): Self = StObject.set(x, "instructionFn", js.Any.fromFunction3(value))
        
        @scala.inline
        def setInstructionFnUndefined: Self = StObject.set(x, "instructionFn", js.undefined)
        
        @scala.inline
        def setInstructionHasAttributes(value: Boolean): Self = StObject.set(x, "instructionHasAttributes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInstructionHasAttributesUndefined: Self = StObject.set(x, "instructionHasAttributes", js.undefined)
        
        @scala.inline
        def setInstructionNameFn(
          value: (/* instructionName */ String, /* instructionValue */ String, /* parentElement */ String) => Unit
        ): Self = StObject.set(x, "instructionNameFn", js.Any.fromFunction3(value))
        
        @scala.inline
        def setInstructionNameFnUndefined: Self = StObject.set(x, "instructionNameFn", js.undefined)
        
        @scala.inline
        def setNativeType(value: Boolean): Self = StObject.set(x, "nativeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNativeTypeUndefined: Self = StObject.set(x, "nativeType", js.undefined)
        
        @scala.inline
        def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
        
        @scala.inline
        def setTextFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = StObject.set(x, "textFn", js.Any.fromFunction2(value))
        
        @scala.inline
        def setTextFnUndefined: Self = StObject.set(x, "textFn", js.undefined)
        
        @scala.inline
        def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      }
    }
    
    @js.native
    trait XML2JSON extends XML2JS {
      
      var spaces: js.UndefOr[Double | String] = js.native
    }
    object XML2JSON {
      
      @scala.inline
      def apply(): XML2JSON = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[XML2JSON]
      }
      
      @scala.inline
      implicit class XML2JSONMutableBuilder[Self <: XML2JSON] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSpaces(value: Double | String): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
      }
    }
  }
}
