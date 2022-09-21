package typings.webcryptoCore.mod

import typings.std.BufferSource
import typings.std.KeyUsage
import typings.webcryptoCore.webcryptoCoreStrings.pem
import typings.webcryptoCore.webcryptoCoreStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoCertificateStorage
  extends StObject
     with CryptoStorage[CryptoCertificate] {
  
  def exportCert(format: CryptoCertificateFormat, item: CryptoCertificate): js.Promise[js.typedarray.ArrayBuffer | String] = js.native
  @JSName("exportCert")
  def exportCert_pem(format: pem, item: CryptoCertificate): js.Promise[String] = js.native
  @JSName("exportCert")
  def exportCert_raw(format: raw, item: CryptoCertificate): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def getItem(index: String, algorithm: ImportAlgorithms, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoCertificate] = js.native
  
  def importCert(
    format: CryptoCertificateFormat,
    data: String,
    algorithm: ImportAlgorithms,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoCertificate] = js.native
  def importCert(
    format: CryptoCertificateFormat,
    data: BufferSource,
    algorithm: ImportAlgorithms,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoCertificate] = js.native
  @JSName("importCert")
  def importCert_pem(format: pem, data: String, algorithm: ImportAlgorithms, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoCertificate] = js.native
  @JSName("importCert")
  def importCert_raw(format: raw, data: BufferSource, algorithm: ImportAlgorithms, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoCertificate] = js.native
}
