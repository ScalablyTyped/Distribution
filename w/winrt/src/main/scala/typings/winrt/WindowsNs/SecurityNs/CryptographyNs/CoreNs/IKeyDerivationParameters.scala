package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyDerivationParameters extends js.Object {
  var iterationCount: Double
  var kdfGenericBinary: IBuffer
}

object IKeyDerivationParameters {
  @scala.inline
  def apply(iterationCount: Double, kdfGenericBinary: IBuffer): IKeyDerivationParameters = {
    val __obj = js.Dynamic.literal(iterationCount = iterationCount, kdfGenericBinary = kdfGenericBinary)
  
    __obj.asInstanceOf[IKeyDerivationParameters]
  }
}

