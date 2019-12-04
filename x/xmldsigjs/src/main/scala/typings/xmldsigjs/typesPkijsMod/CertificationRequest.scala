package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.BitString
import typings.asn1js.asn1jsMod.Sequence
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "CertificationRequest")
@js.native
class CertificationRequest () extends js.Object {
  def this(params: js.Any) = this()
  var attributes: js.UndefOr[js.Array[Attribute]] = js.native
  var signatureAlgorithm: AlgorithmIdentifier = js.native
  var signatureValue: BitString = js.native
  var subject: RelativeDistinguishedNames = js.native
  var subjectPublicKeyInfo: PublicKeyInfo = js.native
  var tbs: ArrayBuffer = js.native
  var version: Double = js.native
  /**
    * Aux function making ASN1js Sequence from current TBS
    * 
    * @returns {Sequence}
    */
  def encodeTBS(): Sequence = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Makes signature for currect certification request
    * 
    * @param {CryptoKey} privateKey WebCrypto private key
    * @param {string} [hashAlgorithm] String representing current hashing algorithm
    * @returns {PromiseLike<ArrayBuffer>}
    * 
    * @memberOf CertificationRequest
    */
  def sign(privateKey: CryptoKey): js.Thenable[ArrayBuffer] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[ArrayBuffer] = js.native
  def toJSON(): js.Any = js.native
  /**
    * Convert current object to asn1js object and set correct values
    * 
    * @param {boolean} [encodeFlag]
    * @returns {*}
    */
  def toSchema(): js.Any = js.native
  def toSchema(encodeFlag: Boolean): js.Any = js.native
  /**
    * Verify existing certification request signature
    * 
    * @returns {PromiseLike<boolean>}
    * 
    * @memberOf CertificationRequest
    */
  def verify(): js.Thenable[Boolean] = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "CertificationRequest")
@js.native
object CertificationRequest extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

