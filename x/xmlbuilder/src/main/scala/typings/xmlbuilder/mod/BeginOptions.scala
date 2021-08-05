package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the options used while creating an XML document with the `begin`
  * function.
  */
trait BeginOptions extends StObject {
  
  /** 
    * Whether decorator strings will be ignored when converting JS 
    * objects
    */
  var ignoreDecorators: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A character to replace invalid characters in all values. This also
    * disables character validation.
    */
  var invalidCharReplacement: js.UndefOr[String] = js.undefined
  
  /**
    * Whether attributes with null values will be kept or ignored
    */
  var keepNullAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether nodes with null values will be kept or ignored
    */
  var keepNullNodes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether existing html entities are encoded
    */
  var noDoubleEncoding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether values will be validated and escaped or returned as is
    */
  var noValidation: js.UndefOr[Boolean] = js.undefined
  
  /** 
    * Whether array items are created as separate nodes when passed 
    * as an object value
    */
  var separateArrayItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A set of functions to use for converting values to strings
    */
  var stringify: js.UndefOr[XMLStringifier] = js.undefined
  
  /** 
    * The default XML writer to use for converting nodes to string. 
    * If the default writer is not set, the built-in XMLStringWriter 
    * will be used instead. 
    */
  var writer: js.UndefOr[XMLWriter | WriterOptions] = js.undefined
}
object BeginOptions {
  
  inline def apply(): BeginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginOptions]
  }
  
  extension [Self <: BeginOptions](x: Self) {
    
    inline def setIgnoreDecorators(value: Boolean): Self = StObject.set(x, "ignoreDecorators", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDecoratorsUndefined: Self = StObject.set(x, "ignoreDecorators", js.undefined)
    
    inline def setInvalidCharReplacement(value: String): Self = StObject.set(x, "invalidCharReplacement", value.asInstanceOf[js.Any])
    
    inline def setInvalidCharReplacementUndefined: Self = StObject.set(x, "invalidCharReplacement", js.undefined)
    
    inline def setKeepNullAttributes(value: Boolean): Self = StObject.set(x, "keepNullAttributes", value.asInstanceOf[js.Any])
    
    inline def setKeepNullAttributesUndefined: Self = StObject.set(x, "keepNullAttributes", js.undefined)
    
    inline def setKeepNullNodes(value: Boolean): Self = StObject.set(x, "keepNullNodes", value.asInstanceOf[js.Any])
    
    inline def setKeepNullNodesUndefined: Self = StObject.set(x, "keepNullNodes", js.undefined)
    
    inline def setNoDoubleEncoding(value: Boolean): Self = StObject.set(x, "noDoubleEncoding", value.asInstanceOf[js.Any])
    
    inline def setNoDoubleEncodingUndefined: Self = StObject.set(x, "noDoubleEncoding", js.undefined)
    
    inline def setNoValidation(value: Boolean): Self = StObject.set(x, "noValidation", value.asInstanceOf[js.Any])
    
    inline def setNoValidationUndefined: Self = StObject.set(x, "noValidation", js.undefined)
    
    inline def setSeparateArrayItems(value: Boolean): Self = StObject.set(x, "separateArrayItems", value.asInstanceOf[js.Any])
    
    inline def setSeparateArrayItemsUndefined: Self = StObject.set(x, "separateArrayItems", js.undefined)
    
    inline def setStringify(value: XMLStringifier): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    
    inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    
    inline def setWriter(value: XMLWriter | WriterOptions): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    
    inline def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
  }
}
