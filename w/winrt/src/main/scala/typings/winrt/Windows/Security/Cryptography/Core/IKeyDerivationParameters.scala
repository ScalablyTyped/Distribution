package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
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
    val __obj = js.Dynamic.literal(iterationCount = iterationCount.asInstanceOf[js.Any], kdfGenericBinary = kdfGenericBinary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKeyDerivationParameters]
  }
}

