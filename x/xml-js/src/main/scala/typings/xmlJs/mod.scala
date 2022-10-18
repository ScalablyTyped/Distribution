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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def js2xml(obj: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("js2xml")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def js2xml(obj: ElementCompact): String = ^.asInstanceOf[js.Dynamic].applyDynamic("js2xml")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def js2xml(obj: ElementCompact, options: JS2XML): String = (^.asInstanceOf[js.Dynamic].applyDynamic("js2xml")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def js2xml(obj: Element, options: JS2XML): String = (^.asInstanceOf[js.Dynamic].applyDynamic("js2xml")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def json2xml(json: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("json2xml")(json.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def json2xml(json: String, options: JS2XML): String = (^.asInstanceOf[js.Dynamic].applyDynamic("json2xml")(json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def xml2js(xml: String): Element | ElementCompact = ^.asInstanceOf[js.Dynamic].applyDynamic("xml2js")(xml.asInstanceOf[js.Any]).asInstanceOf[Element | ElementCompact]
  inline def xml2js(xml: String, options: XML2JS): Element | ElementCompact = (^.asInstanceOf[js.Dynamic].applyDynamic("xml2js")(xml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element | ElementCompact]
  
  inline def xml2json(xml: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xml2json")(xml.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def xml2json(xml: String, options: XML2JSON): String = (^.asInstanceOf[js.Dynamic].applyDynamic("xml2json")(xml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Attributes = StringDictionary[js.UndefOr[String | Double]]
  
  trait DeclarationAttributes extends StObject {
    
    var encoding: js.UndefOr[`utf-8` | String] = js.undefined
    
    var standalone: js.UndefOr[yes | no] = js.undefined
    
    var version: js.UndefOr[String | Double] = js.undefined
  }
  object DeclarationAttributes {
    
    inline def apply(): DeclarationAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeclarationAttributes]
    }
    
    extension [Self <: DeclarationAttributes](x: Self) {
      
      inline def setEncoding(value: `utf-8` | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setStandalone(value: yes | no): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setVersion(value: String | Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Element extends StObject {
    
    var attributes: js.UndefOr[Attributes] = js.undefined
    
    var cdata: js.UndefOr[String] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    var declaration: js.UndefOr[typings.xmlJs.anon.Attributes] = js.undefined
    
    var doctype: js.UndefOr[String] = js.undefined
    
    var elements: js.UndefOr[js.Array[Element]] = js.undefined
    
    var instruction: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String | Double | Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Element {
    
    inline def apply(): Element = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setCdata(value: String): Self = StObject.set(x, "cdata", value.asInstanceOf[js.Any])
      
      inline def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDeclaration(value: typings.xmlJs.anon.Attributes): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      inline def setDoctype(value: String): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      inline def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
      
      inline def setElements(value: js.Array[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
      
      inline def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setText(value: String | Double | Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ElementCompact
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var _attributes: js.UndefOr[Attributes] = js.undefined
    
    var _cdata: js.UndefOr[String] = js.undefined
    
    var _comment: js.UndefOr[String] = js.undefined
    
    var _declaration: js.UndefOr[`0`] = js.undefined
    
    var _doctype: js.UndefOr[String] = js.undefined
    
    var _instruction: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var _text: js.UndefOr[String | Double] = js.undefined
  }
  object ElementCompact {
    
    inline def apply(): ElementCompact = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementCompact]
    }
    
    extension [Self <: ElementCompact](x: Self) {
      
      inline def set_attributes(value: Attributes): Self = StObject.set(x, "_attributes", value.asInstanceOf[js.Any])
      
      inline def set_attributesUndefined: Self = StObject.set(x, "_attributes", js.undefined)
      
      inline def set_cdata(value: String): Self = StObject.set(x, "_cdata", value.asInstanceOf[js.Any])
      
      inline def set_cdataUndefined: Self = StObject.set(x, "_cdata", js.undefined)
      
      inline def set_comment(value: String): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
      
      inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
      
      inline def set_declaration(value: `0`): Self = StObject.set(x, "_declaration", value.asInstanceOf[js.Any])
      
      inline def set_declarationUndefined: Self = StObject.set(x, "_declaration", js.undefined)
      
      inline def set_doctype(value: String): Self = StObject.set(x, "_doctype", value.asInstanceOf[js.Any])
      
      inline def set_doctypeUndefined: Self = StObject.set(x, "_doctype", js.undefined)
      
      inline def set_instruction(value: StringDictionary[String]): Self = StObject.set(x, "_instruction", value.asInstanceOf[js.Any])
      
      inline def set_instructionUndefined: Self = StObject.set(x, "_instruction", js.undefined)
      
      inline def set_text(value: String | Double): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
      
      inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    }
  }
  
  object Options {
    
    trait ChangingKeyNames extends StObject {
      
      var attributesKey: js.UndefOr[String] = js.undefined
      
      var cdataKey: js.UndefOr[String] = js.undefined
      
      var commentKey: js.UndefOr[String] = js.undefined
      
      var declarationKey: js.UndefOr[String] = js.undefined
      
      var doctypeKey: js.UndefOr[String] = js.undefined
      
      var elementsKey: js.UndefOr[String] = js.undefined
      
      var instructionKey: js.UndefOr[String] = js.undefined
      
      var nameKey: js.UndefOr[String] = js.undefined
      
      var parentKey: js.UndefOr[String] = js.undefined
      
      var textKey: js.UndefOr[String] = js.undefined
      
      var typeKey: js.UndefOr[String] = js.undefined
    }
    object ChangingKeyNames {
      
      inline def apply(): ChangingKeyNames = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChangingKeyNames]
      }
      
      extension [Self <: ChangingKeyNames](x: Self) {
        
        inline def setAttributesKey(value: String): Self = StObject.set(x, "attributesKey", value.asInstanceOf[js.Any])
        
        inline def setAttributesKeyUndefined: Self = StObject.set(x, "attributesKey", js.undefined)
        
        inline def setCdataKey(value: String): Self = StObject.set(x, "cdataKey", value.asInstanceOf[js.Any])
        
        inline def setCdataKeyUndefined: Self = StObject.set(x, "cdataKey", js.undefined)
        
        inline def setCommentKey(value: String): Self = StObject.set(x, "commentKey", value.asInstanceOf[js.Any])
        
        inline def setCommentKeyUndefined: Self = StObject.set(x, "commentKey", js.undefined)
        
        inline def setDeclarationKey(value: String): Self = StObject.set(x, "declarationKey", value.asInstanceOf[js.Any])
        
        inline def setDeclarationKeyUndefined: Self = StObject.set(x, "declarationKey", js.undefined)
        
        inline def setDoctypeKey(value: String): Self = StObject.set(x, "doctypeKey", value.asInstanceOf[js.Any])
        
        inline def setDoctypeKeyUndefined: Self = StObject.set(x, "doctypeKey", js.undefined)
        
        inline def setElementsKey(value: String): Self = StObject.set(x, "elementsKey", value.asInstanceOf[js.Any])
        
        inline def setElementsKeyUndefined: Self = StObject.set(x, "elementsKey", js.undefined)
        
        inline def setInstructionKey(value: String): Self = StObject.set(x, "instructionKey", value.asInstanceOf[js.Any])
        
        inline def setInstructionKeyUndefined: Self = StObject.set(x, "instructionKey", js.undefined)
        
        inline def setNameKey(value: String): Self = StObject.set(x, "nameKey", value.asInstanceOf[js.Any])
        
        inline def setNameKeyUndefined: Self = StObject.set(x, "nameKey", js.undefined)
        
        inline def setParentKey(value: String): Self = StObject.set(x, "parentKey", value.asInstanceOf[js.Any])
        
        inline def setParentKeyUndefined: Self = StObject.set(x, "parentKey", js.undefined)
        
        inline def setTextKey(value: String): Self = StObject.set(x, "textKey", value.asInstanceOf[js.Any])
        
        inline def setTextKeyUndefined: Self = StObject.set(x, "textKey", js.undefined)
        
        inline def setTypeKey(value: String): Self = StObject.set(x, "typeKey", value.asInstanceOf[js.Any])
        
        inline def setTypeKeyUndefined: Self = StObject.set(x, "typeKey", js.undefined)
      }
    }
    
    trait IgnoreOptions extends StObject {
      
      var ignoreAttributes: js.UndefOr[Boolean] = js.undefined
      
      var ignoreCdata: js.UndefOr[Boolean] = js.undefined
      
      var ignoreComment: js.UndefOr[Boolean] = js.undefined
      
      var ignoreDeclaration: js.UndefOr[Boolean] = js.undefined
      
      var ignoreDoctype: js.UndefOr[Boolean] = js.undefined
      
      var ignoreInstruction: js.UndefOr[Boolean] = js.undefined
      
      var ignoreText: js.UndefOr[Boolean] = js.undefined
    }
    object IgnoreOptions {
      
      inline def apply(): IgnoreOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IgnoreOptions]
      }
      
      extension [Self <: IgnoreOptions](x: Self) {
        
        inline def setIgnoreAttributes(value: Boolean): Self = StObject.set(x, "ignoreAttributes", value.asInstanceOf[js.Any])
        
        inline def setIgnoreAttributesUndefined: Self = StObject.set(x, "ignoreAttributes", js.undefined)
        
        inline def setIgnoreCdata(value: Boolean): Self = StObject.set(x, "ignoreCdata", value.asInstanceOf[js.Any])
        
        inline def setIgnoreCdataUndefined: Self = StObject.set(x, "ignoreCdata", js.undefined)
        
        inline def setIgnoreComment(value: Boolean): Self = StObject.set(x, "ignoreComment", value.asInstanceOf[js.Any])
        
        inline def setIgnoreCommentUndefined: Self = StObject.set(x, "ignoreComment", js.undefined)
        
        inline def setIgnoreDeclaration(value: Boolean): Self = StObject.set(x, "ignoreDeclaration", value.asInstanceOf[js.Any])
        
        inline def setIgnoreDeclarationUndefined: Self = StObject.set(x, "ignoreDeclaration", js.undefined)
        
        inline def setIgnoreDoctype(value: Boolean): Self = StObject.set(x, "ignoreDoctype", value.asInstanceOf[js.Any])
        
        inline def setIgnoreDoctypeUndefined: Self = StObject.set(x, "ignoreDoctype", js.undefined)
        
        inline def setIgnoreInstruction(value: Boolean): Self = StObject.set(x, "ignoreInstruction", value.asInstanceOf[js.Any])
        
        inline def setIgnoreInstructionUndefined: Self = StObject.set(x, "ignoreInstruction", js.undefined)
        
        inline def setIgnoreText(value: Boolean): Self = StObject.set(x, "ignoreText", value.asInstanceOf[js.Any])
        
        inline def setIgnoreTextUndefined: Self = StObject.set(x, "ignoreText", js.undefined)
      }
    }
    
    trait JS2XML
      extends StObject
         with ChangingKeyNames
         with IgnoreOptions {
      
      var attributeNameFn: js.UndefOr[
            js.Function4[
              /* attributeName */ String, 
              /* attributeValue */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.undefined
      
      var attributeValueFn: js.UndefOr[
            js.Function4[
              /* attributeValue */ String, 
              /* attributeName */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.undefined
      
      var attributesFn: js.UndefOr[
            js.Function3[
              /* value */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.undefined
      
      var cdataFn: js.UndefOr[
            js.Function3[
              /* value */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.undefined
      
      var commentFn: js.UndefOr[
            js.Function3[
              /* value */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.undefined
      
      var compact: js.UndefOr[Boolean] = js.undefined
      
      var doctypeFn: js.UndefOr[
            js.Function3[
              /* value */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.undefined
      
      var elementNameFn: js.UndefOr[
            js.Function3[
              /* value */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.undefined
      
      var fullTagEmptyElement: js.UndefOr[Boolean] = js.undefined
      
      var fullTagEmptyElementFn: js.UndefOr[
            js.Function2[/* currentElementName */ String, /* currentElementObj */ js.Object, Unit]
          ] = js.undefined
      
      var indentAttributes: js.UndefOr[Boolean] = js.undefined
      
      var indentCdata: js.UndefOr[Boolean] = js.undefined
      
      var indentInstruction: js.UndefOr[Boolean] = js.undefined
      
      var indentText: js.UndefOr[Boolean] = js.undefined
      
      var instructionFn: js.UndefOr[
            js.Function4[
              /* instructionValue */ String, 
              /* instructionName */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.undefined
      
      var instructionNameFn: js.UndefOr[
            js.Function4[
              /* instructionName */ String, 
              /* instructionValue */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.undefined
      
      var noQuotesForNativeAttributes: js.UndefOr[Boolean] = js.undefined
      
      var spaces: js.UndefOr[Double | String] = js.undefined
      
      var textFn: js.UndefOr[
            js.Function3[
              /* value */ String, 
              /* currentElementName */ String, 
              /* currentElementObj */ js.Object, 
              Unit
            ]
          ] = js.undefined
    }
    object JS2XML {
      
      inline def apply(): JS2XML = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JS2XML]
      }
      
      extension [Self <: JS2XML](x: Self) {
        
        inline def setAttributeNameFn(
          value: (/* attributeName */ String, /* attributeValue */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "attributeNameFn", js.Any.fromFunction4(value))
        
        inline def setAttributeNameFnUndefined: Self = StObject.set(x, "attributeNameFn", js.undefined)
        
        inline def setAttributeValueFn(
          value: (/* attributeValue */ String, /* attributeName */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "attributeValueFn", js.Any.fromFunction4(value))
        
        inline def setAttributeValueFnUndefined: Self = StObject.set(x, "attributeValueFn", js.undefined)
        
        inline def setAttributesFn(
          value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "attributesFn", js.Any.fromFunction3(value))
        
        inline def setAttributesFnUndefined: Self = StObject.set(x, "attributesFn", js.undefined)
        
        inline def setCdataFn(
          value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "cdataFn", js.Any.fromFunction3(value))
        
        inline def setCdataFnUndefined: Self = StObject.set(x, "cdataFn", js.undefined)
        
        inline def setCommentFn(
          value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "commentFn", js.Any.fromFunction3(value))
        
        inline def setCommentFnUndefined: Self = StObject.set(x, "commentFn", js.undefined)
        
        inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
        
        inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
        
        inline def setDoctypeFn(
          value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "doctypeFn", js.Any.fromFunction3(value))
        
        inline def setDoctypeFnUndefined: Self = StObject.set(x, "doctypeFn", js.undefined)
        
        inline def setElementNameFn(
          value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "elementNameFn", js.Any.fromFunction3(value))
        
        inline def setElementNameFnUndefined: Self = StObject.set(x, "elementNameFn", js.undefined)
        
        inline def setFullTagEmptyElement(value: Boolean): Self = StObject.set(x, "fullTagEmptyElement", value.asInstanceOf[js.Any])
        
        inline def setFullTagEmptyElementFn(value: (/* currentElementName */ String, /* currentElementObj */ js.Object) => Unit): Self = StObject.set(x, "fullTagEmptyElementFn", js.Any.fromFunction2(value))
        
        inline def setFullTagEmptyElementFnUndefined: Self = StObject.set(x, "fullTagEmptyElementFn", js.undefined)
        
        inline def setFullTagEmptyElementUndefined: Self = StObject.set(x, "fullTagEmptyElement", js.undefined)
        
        inline def setIndentAttributes(value: Boolean): Self = StObject.set(x, "indentAttributes", value.asInstanceOf[js.Any])
        
        inline def setIndentAttributesUndefined: Self = StObject.set(x, "indentAttributes", js.undefined)
        
        inline def setIndentCdata(value: Boolean): Self = StObject.set(x, "indentCdata", value.asInstanceOf[js.Any])
        
        inline def setIndentCdataUndefined: Self = StObject.set(x, "indentCdata", js.undefined)
        
        inline def setIndentInstruction(value: Boolean): Self = StObject.set(x, "indentInstruction", value.asInstanceOf[js.Any])
        
        inline def setIndentInstructionUndefined: Self = StObject.set(x, "indentInstruction", js.undefined)
        
        inline def setIndentText(value: Boolean): Self = StObject.set(x, "indentText", value.asInstanceOf[js.Any])
        
        inline def setIndentTextUndefined: Self = StObject.set(x, "indentText", js.undefined)
        
        inline def setInstructionFn(
          value: (/* instructionValue */ String, /* instructionName */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "instructionFn", js.Any.fromFunction4(value))
        
        inline def setInstructionFnUndefined: Self = StObject.set(x, "instructionFn", js.undefined)
        
        inline def setInstructionNameFn(
          value: (/* instructionName */ String, /* instructionValue */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "instructionNameFn", js.Any.fromFunction4(value))
        
        inline def setInstructionNameFnUndefined: Self = StObject.set(x, "instructionNameFn", js.undefined)
        
        inline def setNoQuotesForNativeAttributes(value: Boolean): Self = StObject.set(x, "noQuotesForNativeAttributes", value.asInstanceOf[js.Any])
        
        inline def setNoQuotesForNativeAttributesUndefined: Self = StObject.set(x, "noQuotesForNativeAttributes", js.undefined)
        
        inline def setSpaces(value: Double | String): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
        
        inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
        
        inline def setTextFn(
          value: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Unit
        ): Self = StObject.set(x, "textFn", js.Any.fromFunction3(value))
        
        inline def setTextFnUndefined: Self = StObject.set(x, "textFn", js.undefined)
      }
    }
    
    trait XML2JS
      extends StObject
         with ChangingKeyNames
         with IgnoreOptions {
      
      var addParent: js.UndefOr[Boolean] = js.undefined
      
      var alwaysArray: js.UndefOr[Boolean | js.Array[String]] = js.undefined
      
      var alwaysChildren: js.UndefOr[Boolean] = js.undefined
      
      var attributeNameFn: js.UndefOr[
            js.Function3[
              /* attributeName */ String, 
              /* attributeValue */ String, 
              /* parentElement */ String, 
              Unit
            ]
          ] = js.undefined
      
      var attributeValueFn: js.UndefOr[
            js.Function3[
              /* attributeValue */ String, 
              /* attributeName */ String, 
              /* parentElement */ String, 
              Unit
            ]
          ] = js.undefined
      
      var attributesFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ String, Unit]] = js.undefined
      
      var captureSpacesBetweenElements: js.UndefOr[Boolean] = js.undefined
      
      var cdataFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.undefined
      
      var commentFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.undefined
      
      var compact: js.UndefOr[Boolean] = js.undefined
      
      var doctypeFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.undefined
      
      var elementNameFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.undefined
      
      var instructionFn: js.UndefOr[
            js.Function3[
              /* instructionValue */ String, 
              /* instructionName */ String, 
              /* parentElement */ String, 
              Unit
            ]
          ] = js.undefined
      
      var instructionHasAttributes: js.UndefOr[Boolean] = js.undefined
      
      var instructionNameFn: js.UndefOr[
            js.Function3[
              /* instructionName */ String, 
              /* instructionValue */ String, 
              /* parentElement */ String, 
              Unit
            ]
          ] = js.undefined
      
      var nativeType: js.UndefOr[Boolean] = js.undefined
      
      var sanitize: js.UndefOr[Boolean] = js.undefined
      
      var textFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.undefined
      
      var trim: js.UndefOr[Boolean] = js.undefined
    }
    object XML2JS {
      
      inline def apply(): XML2JS = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[XML2JS]
      }
      
      extension [Self <: XML2JS](x: Self) {
        
        inline def setAddParent(value: Boolean): Self = StObject.set(x, "addParent", value.asInstanceOf[js.Any])
        
        inline def setAddParentUndefined: Self = StObject.set(x, "addParent", js.undefined)
        
        inline def setAlwaysArray(value: Boolean | js.Array[String]): Self = StObject.set(x, "alwaysArray", value.asInstanceOf[js.Any])
        
        inline def setAlwaysArrayUndefined: Self = StObject.set(x, "alwaysArray", js.undefined)
        
        inline def setAlwaysArrayVarargs(value: String*): Self = StObject.set(x, "alwaysArray", js.Array(value*))
        
        inline def setAlwaysChildren(value: Boolean): Self = StObject.set(x, "alwaysChildren", value.asInstanceOf[js.Any])
        
        inline def setAlwaysChildrenUndefined: Self = StObject.set(x, "alwaysChildren", js.undefined)
        
        inline def setAttributeNameFn(
          value: (/* attributeName */ String, /* attributeValue */ String, /* parentElement */ String) => Unit
        ): Self = StObject.set(x, "attributeNameFn", js.Any.fromFunction3(value))
        
        inline def setAttributeNameFnUndefined: Self = StObject.set(x, "attributeNameFn", js.undefined)
        
        inline def setAttributeValueFn(
          value: (/* attributeValue */ String, /* attributeName */ String, /* parentElement */ String) => Unit
        ): Self = StObject.set(x, "attributeValueFn", js.Any.fromFunction3(value))
        
        inline def setAttributeValueFnUndefined: Self = StObject.set(x, "attributeValueFn", js.undefined)
        
        inline def setAttributesFn(value: (/* value */ String, /* parentElement */ String) => Unit): Self = StObject.set(x, "attributesFn", js.Any.fromFunction2(value))
        
        inline def setAttributesFnUndefined: Self = StObject.set(x, "attributesFn", js.undefined)
        
        inline def setCaptureSpacesBetweenElements(value: Boolean): Self = StObject.set(x, "captureSpacesBetweenElements", value.asInstanceOf[js.Any])
        
        inline def setCaptureSpacesBetweenElementsUndefined: Self = StObject.set(x, "captureSpacesBetweenElements", js.undefined)
        
        inline def setCdataFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = StObject.set(x, "cdataFn", js.Any.fromFunction2(value))
        
        inline def setCdataFnUndefined: Self = StObject.set(x, "cdataFn", js.undefined)
        
        inline def setCommentFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = StObject.set(x, "commentFn", js.Any.fromFunction2(value))
        
        inline def setCommentFnUndefined: Self = StObject.set(x, "commentFn", js.undefined)
        
        inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
        
        inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
        
        inline def setDoctypeFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = StObject.set(x, "doctypeFn", js.Any.fromFunction2(value))
        
        inline def setDoctypeFnUndefined: Self = StObject.set(x, "doctypeFn", js.undefined)
        
        inline def setElementNameFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = StObject.set(x, "elementNameFn", js.Any.fromFunction2(value))
        
        inline def setElementNameFnUndefined: Self = StObject.set(x, "elementNameFn", js.undefined)
        
        inline def setInstructionFn(
          value: (/* instructionValue */ String, /* instructionName */ String, /* parentElement */ String) => Unit
        ): Self = StObject.set(x, "instructionFn", js.Any.fromFunction3(value))
        
        inline def setInstructionFnUndefined: Self = StObject.set(x, "instructionFn", js.undefined)
        
        inline def setInstructionHasAttributes(value: Boolean): Self = StObject.set(x, "instructionHasAttributes", value.asInstanceOf[js.Any])
        
        inline def setInstructionHasAttributesUndefined: Self = StObject.set(x, "instructionHasAttributes", js.undefined)
        
        inline def setInstructionNameFn(
          value: (/* instructionName */ String, /* instructionValue */ String, /* parentElement */ String) => Unit
        ): Self = StObject.set(x, "instructionNameFn", js.Any.fromFunction3(value))
        
        inline def setInstructionNameFnUndefined: Self = StObject.set(x, "instructionNameFn", js.undefined)
        
        inline def setNativeType(value: Boolean): Self = StObject.set(x, "nativeType", value.asInstanceOf[js.Any])
        
        inline def setNativeTypeUndefined: Self = StObject.set(x, "nativeType", js.undefined)
        
        inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
        
        inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
        
        inline def setTextFn(value: (/* value */ String, /* parentElement */ js.Object) => Unit): Self = StObject.set(x, "textFn", js.Any.fromFunction2(value))
        
        inline def setTextFnUndefined: Self = StObject.set(x, "textFn", js.undefined)
        
        inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
        
        inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      }
    }
    
    trait XML2JSON
      extends StObject
         with XML2JS {
      
      var spaces: js.UndefOr[Double | String] = js.undefined
    }
    object XML2JSON {
      
      inline def apply(): XML2JSON = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[XML2JSON]
      }
      
      extension [Self <: XML2JSON](x: Self) {
        
        inline def setSpaces(value: Double | String): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
        
        inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
      }
    }
  }
}
