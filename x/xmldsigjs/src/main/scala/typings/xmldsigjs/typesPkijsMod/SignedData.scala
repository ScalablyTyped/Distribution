package typings.xmldsigjs.typesPkijsMod

import typings.std.ArrayBuffer
import typings.std.BufferSource
import typings.std.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "SignedData")
@js.native
class SignedData () extends js.Object {
  def this(params: js.Any) = this()
  var certificates: js.UndefOr[js.Array[Certificate | OtherCertificateFormat]] = js.native
  var crls: js.UndefOr[js.Array[CertificateRevocationList | OtherRevocationInfoFormat]] = js.native
  var digestAlgorithms: js.Array[AlgorithmIdentifier] = js.native
  var encapContentInfo: EncapsulatedContentInfo = js.native
  var signerInfos: js.Array[SignerInfo] = js.native
  var version: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Signing current SignedData
    * 
    * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
    * @param {number} signerIndex Index number (starting from 0) of signer index to make signature for
    * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
    * @param {BufferSource} [data] Detached data
    * @returns {ArrayBuffer}
    * 
    * @memberOf SignedData
    */
  def sign(privateKey: CryptoKey, signerIndex: Double): ArrayBuffer = js.native
  def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: String): ArrayBuffer = js.native
  def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: String, data: BufferSource): ArrayBuffer = js.native
  def toJSON(): js.Any = js.native
  /**
    * Convert current object to asn1js object and set correct values
    * 
    * @param {boolean} [encodeFlag]
    * @returns {*}
    */
  def toSchema(): js.Any = js.native
  def toSchema(encodeFlag: Boolean): js.Any = js.native
  def verify(options: VerifyParams): js.Thenable[VerifyResult] = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "SignedData")
@js.native
object SignedData extends js.Object {
  /**
    * Compare values with default values for all class members
    * @param {string} memberName String name for a class member
    * @param {*} memberValue Value to compare with default value
    */
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

