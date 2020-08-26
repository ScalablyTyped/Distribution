package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyDerivationParameters extends js.Object {
  var iterationCount: Double = js.native
  var kdfGenericBinary: IBuffer = js.native
}

object IKeyDerivationParameters {
  @scala.inline
  def apply(iterationCount: Double, kdfGenericBinary: IBuffer): IKeyDerivationParameters = {
    val __obj = js.Dynamic.literal(iterationCount = iterationCount.asInstanceOf[js.Any], kdfGenericBinary = kdfGenericBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyDerivationParameters]
  }
  @scala.inline
  implicit class IKeyDerivationParametersOps[Self <: IKeyDerivationParameters] (val x: Self) extends AnyVal {
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
    def setIterationCount(value: Double): Self = this.set("iterationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setKdfGenericBinary(value: IBuffer): Self = this.set("kdfGenericBinary", value.asInstanceOf[js.Any])
  }
  
}

