package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents parameters used when deriving a key. */
@js.native
trait KeyDerivationParameters extends js.Object {
  
  /** Gets or sets the Capi1KdfTargetAlgorithm . */
  var capi1KdfTargetAlgorithm: Capi1KdfTargetAlgorithm = js.native
  
  /** Retrieves the number of iterations used to derive the key. For more information, see BuildForPbkdf2 . */
  var iterationCount: Double = js.native
  
  /** Gets or sets the parameters used by the key derivation algorithm. */
  var kdfGenericBinary: IBuffer = js.native
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
  
  @scala.inline
  implicit class KeyDerivationParametersOps[Self <: KeyDerivationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapi1KdfTargetAlgorithm(value: Capi1KdfTargetAlgorithm): Self = this.set("capi1KdfTargetAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationCount(value: Double): Self = this.set("iterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKdfGenericBinary(value: IBuffer): Self = this.set("kdfGenericBinary", value.asInstanceOf[js.Any])
  }
}
