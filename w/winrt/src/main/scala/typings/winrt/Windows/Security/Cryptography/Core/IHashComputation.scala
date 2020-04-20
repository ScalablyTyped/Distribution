package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
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

