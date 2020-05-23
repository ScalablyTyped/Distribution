package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents parameters used when deriving a key. */
trait KeyDerivationParameters extends js.Object {
  /** Gets or sets the Capi1KdfTargetAlgorithm . */
  var capi1KdfTargetAlgorithm: Capi1KdfTargetAlgorithm
  /** Retrieves the number of iterations used to derive the key. For more information, see BuildForPbkdf2 . */
  var iterationCount: Double
  /** Gets or sets the parameters used by the key derivation algorithm. */
  var kdfGenericBinary: IBuffer
}

object KeyDerivationParameters {
  @scala.inline
  def apply(
    capi1KdfTargetAlgorithm: Capi1KdfTargetAlgorithm,
    iterationCount: Double,
    kdfGenericBinary: IBuffer
  ): KeyDerivationParameters = {
    val __obj = js.Dynamic.literal(capi1KdfTargetAlgorithm = capi1KdfTargetAlgorithm.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], kdfGenericBinary = kdfGenericBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyDerivationParameters]
  }
}

