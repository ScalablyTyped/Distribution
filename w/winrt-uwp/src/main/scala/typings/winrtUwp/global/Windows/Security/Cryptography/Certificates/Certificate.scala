package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a cryptography certificate. */
@JSGlobal("Windows.Security.Cryptography.Certificates.Certificate")
@js.native
class Certificate protected ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate {
  /**
    * Create a new instance of the Certificate class using the specified certificate data.
    * @param certBlob The certificate data as an ASN.1 DER encoded certificate blob (.cer or .p7b).
    */
  def this(certBlob: IBuffer) = this()
}
