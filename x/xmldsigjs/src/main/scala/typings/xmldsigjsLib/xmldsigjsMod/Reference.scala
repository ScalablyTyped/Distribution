package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "Reference")
@js.native
class Reference () extends XmlSignatureObject {
  def this(uri: java.lang.String) = this()
  /**
    * Gets or sets the digest method Uniform Resource Identifier (URI) of the current
    */
  var DigestMethod: xmldsigjsLib.xmldsigjsMod.DigestMethod = js.native
  /**
    * Gets or sets the digest value of the current Reference.
    */
  var DigestValue: stdLib.Uint8Array = js.native
  /**
    * Gets or sets the ID of the current Reference.
    */
  var Id: java.lang.String = js.native
  var Transforms: xmldsigjsLib.xmldsigjsMod.Transforms = js.native
  /**
    * Gets or sets the type of the object being signed.
    */
  var Type: java.lang.String = js.native
  /**
    * Gets or sets the Uri of the current Reference.
    */
  var Uri: js.UndefOr[java.lang.String] = js.native
}

