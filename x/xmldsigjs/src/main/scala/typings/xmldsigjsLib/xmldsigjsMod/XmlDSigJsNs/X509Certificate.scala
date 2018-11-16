package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X509Certificate extends js.Object {
  /**
           * Gets a issuer name of the certificate
           */
  val Issuer: java.lang.String = js.native
  /**
           * Gets the public key from the X509Certificate
           */
  val PublicKey: stdLib.CryptoKey | scala.Null = js.native
  /**
           * Gets a serial number of the certificate in HEX format
           */
  val SerialNumber: java.lang.String = js.native
  /**
           * Gets a subject name of the certificate
           */
  val Subject: java.lang.String = js.native
  var publicKey: stdLib.CryptoKey | scala.Null = js.native
  var raw: stdLib.Uint8Array = js.native
  /**
           * Returns DER raw of X509Certificate
           */
  def GetRaw(): stdLib.Uint8Array = js.native
  /**
           * Loads X509Certificate from DER data
           * @param  {Uint8Array} rawData
           */
  /* protected */ def LoadRaw(rawData: stdLib.BufferSource): scala.Unit = js.native
  /**
           * Returns a thumbprint of the certificate
           * @param  {DigestAlgorithm="SHA-1"} algName Digest algorithm name
           * @returns PromiseLike
           */
  def Thumbprint(): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  /**
           * Returns a thumbprint of the certificate
           * @param  {DigestAlgorithm="SHA-1"} algName Digest algorithm name
           * @returns PromiseLike
           */
  def Thumbprint(algName: DigestAlgorithm): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  /**
           * Returns public key from X509Certificate
           * @param  {Algorithm} algorithm
           * @returns Promise
           */
  def exportKey(algorithm: stdLib.Algorithm): stdLib.Promise[stdLib.CryptoKey] = js.native
}

