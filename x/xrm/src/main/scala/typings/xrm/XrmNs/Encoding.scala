package typings.xrm.XrmNs

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
  def xmlAttributeEncode(arg: String): String
  /**
    * Applies XML encoding to a string.
    * @param arg String to be encoded.
    * @returns Encoded string.
    */
  def xmlEncode(arg: String): String
}

object Encoding {
  @scala.inline
  def apply(xmlAttributeEncode: String => String, xmlEncode: String => String): Encoding = {
    val __obj = js.Dynamic.literal(xmlAttributeEncode = js.Any.fromFunction1(xmlAttributeEncode), xmlEncode = js.Any.fromFunction1(xmlEncode))
  
    __obj.asInstanceOf[Encoding]
  }
}

