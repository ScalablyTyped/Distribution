package typings.xmlCore

import typings.xmlCore.typesMod.IConverter
import typings.xmlCore.typesMod.IXmlSerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined xml-core.xml-core/dist/types/types.XmlAttributeType<any> & {  type :string | undefined} */
  trait XmlAttributeTypeanytypest extends StObject {
    
    /**
      * Custom converter for item value
      *
      * @type {IConverter<T>}
      * @memberOf XmlAttributeType
      */
    var converter: js.UndefOr[IConverter[Any]] = js.undefined
    
    /**
      * Default value for item
      *
      * @type {(T |)}
      * @memberOf XmlSchemaItem
      */
    var defaultValue: js.UndefOr[Any | Null] = js.undefined
    
    /**
      * Local name of item
      *
      * @type {string}
      * @memberOf XmlSchemaItemBase
      */
    var localName: js.UndefOr[String] = js.undefined
    
    /**
      * Namespace URI of attribute
      *
      * @type {(string |)}
      * @memberOf XmlSchemaItemBase
      */
    var namespaceURI: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Default prefix for Xml element
      *
      * @type {(string |)}
      * @memberOf XmlSchemaItemBase
      */
    var prefix: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Determine where item is required
      *
      * @type {boolean}
      * @memberOf XmlSchemaItem
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object XmlAttributeTypeanytypest {
    
    inline def apply(): XmlAttributeTypeanytypest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlAttributeTypeanytypest]
    }
    
    extension [Self <: XmlAttributeTypeanytypest](x: Self) {
      
      inline def setConverter(value: IConverter[Any]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setLocalNameUndefined: Self = StObject.set(x, "localName", js.undefined)
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURINull: Self = StObject.set(x, "namespaceURI", null)
      
      inline def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined xml-core.xml-core/dist/types/types.XmlChildElementType<any> & {  type :string | undefined} */
  trait XmlChildElementTypeanytyp extends StObject {
    
    /**
      * Custom converter for item value
      *
      * @type {IConverter<T>}
      * @memberOf XmlAttributeType
      */
    var converter: js.UndefOr[IConverter[Any]] = js.undefined
    
    /**
      * Default value for item
      *
      * @type {(T |)}
      * @memberOf XmlSchemaItem
      */
    var defaultValue: js.UndefOr[Any | Null] = js.undefined
    
    /**
      * Local name of item
      *
      * @type {string}
      * @memberOf XmlSchemaItemBase
      */
    var localName: js.UndefOr[String] = js.undefined
    
    /**
      * max occurs of items in collection
      *
      * @type {number}
      * @memberOf XmlChildElementType
      */
    var maxOccurs: js.UndefOr[Double] = js.undefined
    
    /**
      * min occurs of items in collection
      *
      * @type {number}
      * @memberOf XmlChildElementType
      */
    var minOccurs: js.UndefOr[Double] = js.undefined
    
    /**
      * Namespace URI of attribute
      *
      * @type {(string |)}
      * @memberOf XmlSchemaItemBase
      */
    var namespaceURI: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Don't add root element of XmlCollection to compiled element
      *
      * @type {boolean}
      * @memberOf XmlChildElementType
      */
    var noRoot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Xml parser for item
      *
      * @type {*}
      * @memberOf XmlSchemaItemParser
      */
    var parser: js.UndefOr[IXmlSerializableConstructor] = js.undefined
    
    /**
      * Default prefix for Xml element
      *
      * @type {(string |)}
      * @memberOf XmlSchemaItemBase
      */
    var prefix: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Determine where item is required
      *
      * @type {boolean}
      * @memberOf XmlSchemaItem
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object XmlChildElementTypeanytyp {
    
    inline def apply(): XmlChildElementTypeanytyp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlChildElementTypeanytyp]
    }
    
    extension [Self <: XmlChildElementTypeanytyp](x: Self) {
      
      inline def setConverter(value: IConverter[Any]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setLocalNameUndefined: Self = StObject.set(x, "localName", js.undefined)
      
      inline def setMaxOccurs(value: Double): Self = StObject.set(x, "maxOccurs", value.asInstanceOf[js.Any])
      
      inline def setMaxOccursUndefined: Self = StObject.set(x, "maxOccurs", js.undefined)
      
      inline def setMinOccurs(value: Double): Self = StObject.set(x, "minOccurs", value.asInstanceOf[js.Any])
      
      inline def setMinOccursUndefined: Self = StObject.set(x, "minOccurs", js.undefined)
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURINull: Self = StObject.set(x, "namespaceURI", null)
      
      inline def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
      
      inline def setNoRoot(value: Boolean): Self = StObject.set(x, "noRoot", value.asInstanceOf[js.Any])
      
      inline def setNoRootUndefined: Self = StObject.set(x, "noRoot", js.undefined)
      
      inline def setParser(value: IXmlSerializableConstructor): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
