package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashComputation extends js.Object {
  def append(data: IBuffer): Unit
  def getValueAndReset(): IBuffer
}

object IHashComputation {
  @scala.inline
  def apply(append: IBuffer => Unit, getValueAndReset: () => IBuffer): IHashComputation = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), getValueAndReset = js.Any.fromFunction0(getValueAndReset))
  
    __obj.asInstanceOf[IHashComputation]
  }
}

