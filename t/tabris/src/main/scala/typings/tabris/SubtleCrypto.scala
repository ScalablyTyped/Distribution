package typings.tabris

import typings.tabris.tabrisStrings.`SHA-1`
import typings.tabris.tabrisStrings.`SHA-256`
import typings.tabris.tabrisStrings.`SHA-384`
import typings.tabris.tabrisStrings.`SHA-512`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// SubtleCrypto
/**
  * Provides a subset of the [cryptographic
  * functions](https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto) in the SubtleCrypto W3C
  * standard.
  */
@js.native
trait SubtleCrypto extends StObject {
  
  def digest(algorithm: `SHA-1` | `SHA-256` | `SHA-384` | `SHA-512`, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /**
    * Provides the digest value of the given data as an ArrayBuffer. Fo this the method uses the hashing
    * algorithms provided by the operating system.
    * @param algorithm A string defining the hash function to use.
    * @param data The data to be digested.
    */
  def digest(algorithm: `SHA-1` | `SHA-256` | `SHA-384` | `SHA-512`, data: TypedArray): js.Promise[js.typedarray.ArrayBuffer] = js.native
}
