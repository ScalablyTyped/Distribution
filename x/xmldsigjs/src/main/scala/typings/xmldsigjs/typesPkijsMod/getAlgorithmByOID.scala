package typings.xmldsigjs.typesPkijsMod

import typings.std.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "getAlgorithmByOID")
@js.native
object getAlgorithmByOID extends js.Object {
  /**
    * Get WebCrypto algorithm by wel-known OID
    * 
    * @param {string} oid Wel-known OID to search for
    * @returns {Algorithm}
    */
  def apply(oid: String): Algorithm = js.native
}

