package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Xrm.Encoding API
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-encoding External Link: Xrm.Encoding (Client API reference)}
  */
trait Encoding extends js.Object {
  /**
    * Applies attribute encoding to a string.
    * @param arg String to be encoded.
    * @returns Encoded string.
    */
  def xmlAttributeEncode(arg: java.lang.String): java.lang.String
  /**
    * Applies XML encoding to a string.
    * @param arg String to be encoded.
    * @returns Encoded string.
    */
  def xmlEncode(arg: java.lang.String): java.lang.String
}

object Encoding {
  @scala.inline
  def apply(
    xmlAttributeEncode: js.Function1[java.lang.String, java.lang.String],
    xmlEncode: js.Function1[java.lang.String, java.lang.String]
  ): Encoding = {
    val __obj = js.Dynamic.literal(xmlAttributeEncode = xmlAttributeEncode, xmlEncode = xmlEncode)
  
    __obj.asInstanceOf[Encoding]
  }
}

