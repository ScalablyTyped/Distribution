package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the options used while creating an XML document with the `create`
  * function.
  */
trait CreateOptions extends StObject {
  
  /**
    * Encoding declaration, e.g. `UTF-8`
    */
  var encoding: js.UndefOr[String] = js.undefined
  
  /**
    * Whether XML declaration and doctype will be included
    */
  var headless: js.UndefOr[Boolean] = js.undefined
  
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
    * Whether attributes with `null` values will be kept or ignored
    */
  var keepNullAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether nodes with `null` values will be kept or ignored
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
    * Public identifier of the DTD
    */
  var pubID: js.UndefOr[String] = js.undefined
  
  /** 
    * Whether array items are created as separate nodes when passed 
    * as an object value
    */
  var separateArrayItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Standalone document declaration: `true` or `false`
    */
  var standalone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A set of functions to use for converting values to strings
    */
  var stringify: js.UndefOr[XMLStringifier] = js.undefined
  
  /**
    * System identifier of the DTD
    */
  var sysID: js.UndefOr[String] = js.undefined
  
  /**
    * A version number string, e.g. `1.0`
    */
  var version: js.UndefOr[String] = js.undefined
  
  /** 
    * The default XML writer to use for converting nodes to string. 
    * If the default writer is not set, the built-in `XMLStringWriter` 
    * will be used instead. 
    */
  var writer: js.UndefOr[XMLWriter] = js.undefined
}
object CreateOptions {
  
  inline def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
  
  extension [Self <: CreateOptions](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
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
    
    inline def setPubID(value: String): Self = StObject.set(x, "pubID", value.asInstanceOf[js.Any])
    
    inline def setPubIDUndefined: Self = StObject.set(x, "pubID", js.undefined)
    
    inline def setSeparateArrayItems(value: Boolean): Self = StObject.set(x, "separateArrayItems", value.asInstanceOf[js.Any])
    
    inline def setSeparateArrayItemsUndefined: Self = StObject.set(x, "separateArrayItems", js.undefined)
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    
    inline def setStringify(value: XMLStringifier): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    
    inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    
    inline def setSysID(value: String): Self = StObject.set(x, "sysID", value.asInstanceOf[js.Any])
    
    inline def setSysIDUndefined: Self = StObject.set(x, "sysID", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWriter(value: XMLWriter): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    
    inline def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
  }
}
