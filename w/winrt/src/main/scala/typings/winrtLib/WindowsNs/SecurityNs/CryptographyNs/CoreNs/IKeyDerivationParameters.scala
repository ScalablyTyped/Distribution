package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyDerivationParameters extends js.Object {
  var iterationCount: scala.Double
  var kdfGenericBinary: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
}

object IKeyDerivationParameters {
  @scala.inline
  def apply(iterationCount: scala.Double, kdfGenericBinary: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): IKeyDerivationParameters = {
    val __obj = js.Dynamic.literal(iterationCount = iterationCount, kdfGenericBinary = kdfGenericBinary)
  
    __obj.asInstanceOf[IKeyDerivationParameters]
  }
}

