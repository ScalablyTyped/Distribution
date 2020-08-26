package typings.winrt.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataReaderStatics extends js.Object {
  def fromBuffer(buffer: IBuffer): DataReader = js.native
}

object IDataReaderStatics {
  @scala.inline
  def apply(fromBuffer: IBuffer => DataReader): IDataReaderStatics = {
    val __obj = js.Dynamic.literal(fromBuffer = js.Any.fromFunction1(fromBuffer))
    __obj.asInstanceOf[IDataReaderStatics]
  }
  @scala.inline
  implicit class IDataReaderStaticsOps[Self <: IDataReaderStatics] (val x: Self) extends AnyVal {
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
    def setFromBuffer(value: IBuffer => DataReader): Self = this.set("fromBuffer", js.Any.fromFunction1(value))
  }
  
}

