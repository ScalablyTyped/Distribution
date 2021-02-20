package typings.winrtUwp.global.Windows.Security.Cryptography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a class that enables you to easily encrypt and decrypt static data or a data stream. */
object DataProtection {
  
  /** Represents a cryptographic provider that can be used to asynchronously encrypt and decrypt static data or a data stream. */
  @JSGlobal("Windows.Security.Cryptography.DataProtection.DataProtectionProvider")
  @js.native
  /** Constructor used for decryption operations. Use this constructor before calling the UnprotectAsync or UnprotectStreamAsync methods. */
  class DataProtectionProvider ()
    extends typings.winrtUwp.Windows.Security.Cryptography.DataProtection.DataProtectionProvider {
    /**
      * Constructor used for encryption operations. Use this constructor before calling the ProtectAsync or ProtectStreamAsync methods.
      * @param protectionDescriptor Contains the protection descriptor that determines the entity to which the data will be encrypted. For more information, see Remarks.
      */
    def this(protectionDescriptor: String) = this()
  }
}
