package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICryptographicEngineStatics extends js.Object {
  def decrypt(
    key: CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    iv: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def decryptAndAuthenticate(
    key: CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    nonce: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    authenticationTag: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    authenticatedData: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def deriveKeyMaterial(key: CryptographicKey, parameters: KeyDerivationParameters, desiredKeySize: scala.Double): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def encrypt(
    key: CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    iv: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def encryptAndAuthenticate(
    key: CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    nonce: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    authenticatedData: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): EncryptedAndAuthenticatedData
  def sign(key: CryptographicKey, data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def verifySignature(
    key: CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    signature: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): scala.Boolean
}

object ICryptographicEngineStatics {
  @scala.inline
  def apply(
    decrypt: js.Function3[
      CryptographicKey, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
    ],
    decryptAndAuthenticate: js.Function5[
      CryptographicKey, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
    ],
    deriveKeyMaterial: js.Function3[
      CryptographicKey, 
      KeyDerivationParameters, 
      scala.Double, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
    ],
    encrypt: js.Function3[
      CryptographicKey, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
    ],
    encryptAndAuthenticate: js.Function4[
      CryptographicKey, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      EncryptedAndAuthenticatedData
    ],
    sign: js.Function2[
      CryptographicKey, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
    ],
    verifySignature: js.Function3[
      CryptographicKey, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      scala.Boolean
    ]
  ): ICryptographicEngineStatics = {
    val __obj = js.Dynamic.literal(decrypt = decrypt, decryptAndAuthenticate = decryptAndAuthenticate, deriveKeyMaterial = deriveKeyMaterial, encrypt = encrypt, encryptAndAuthenticate = encryptAndAuthenticate, sign = sign, verifySignature = verifySignature)
  
    __obj.asInstanceOf[ICryptographicEngineStatics]
  }
}

