package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for Xrm.Encoding API
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-encoding External Link: Xrm.Encoding (Client API reference)}
  */
trait Encoding extends StObject {
  
  /**
    * Encodes the specified string so that it can be used in HTML.
    * @param arg String to be encoded.
    * @returns Encoded string
    */
  def htmlAttributeEncode(arg: String): String
  
  /**
    * Converts a string that has been HTML-encoded into a decoded string.
    * @param arg HTML-encoded string to be decoded.
    * @returns Decoded string
    */
  def htmlDecode(arg: String): String
  
  /**
    * Converts a string to an HTML-encoded string.
    * @param arg String to be encoded.
    * @returns Encoded string
    */
  def htmlEncode(arg: String): String
  
  /**
    * Applies attribute encoding to a string.
    * @param arg String to be encoded.
    * @returns Encoded string.
    */
  def xmlAttributeEncode(arg: String): String
  
  /**
    * Applies XML encoding to a string.
    * @param arg String to be encoded.
    * @returns Encoded string.
    */
  def xmlEncode(arg: String): String
}
object Encoding {
  
  inline def apply(
    htmlAttributeEncode: String => String,
    htmlDecode: String => String,
    htmlEncode: String => String,
    xmlAttributeEncode: String => String,
    xmlEncode: String => String
  ): Encoding = {
    val __obj = js.Dynamic.literal(htmlAttributeEncode = js.Any.fromFunction1(htmlAttributeEncode), htmlDecode = js.Any.fromFunction1(htmlDecode), htmlEncode = js.Any.fromFunction1(htmlEncode), xmlAttributeEncode = js.Any.fromFunction1(xmlAttributeEncode), xmlEncode = js.Any.fromFunction1(xmlEncode))
    __obj.asInstanceOf[Encoding]
  }
  
  extension [Self <: Encoding](x: Self) {
    
    inline def setHtmlAttributeEncode(value: String => String): Self = StObject.set(x, "htmlAttributeEncode", js.Any.fromFunction1(value))
    
    inline def setHtmlDecode(value: String => String): Self = StObject.set(x, "htmlDecode", js.Any.fromFunction1(value))
    
    inline def setHtmlEncode(value: String => String): Self = StObject.set(x, "htmlEncode", js.Any.fromFunction1(value))
    
    inline def setXmlAttributeEncode(value: String => String): Self = StObject.set(x, "xmlAttributeEncode", js.Any.fromFunction1(value))
    
    inline def setXmlEncode(value: String => String): Self = StObject.set(x, "xmlEncode", js.Any.fromFunction1(value))
  }
}
