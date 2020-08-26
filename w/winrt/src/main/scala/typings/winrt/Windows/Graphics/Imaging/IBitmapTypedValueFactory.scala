package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.PropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBitmapTypedValueFactory extends js.Object {
  def create(value: js.Any, `type`: PropertyType): BitmapTypedValue = js.native
}

object IBitmapTypedValueFactory {
  @scala.inline
  def apply(create: (js.Any, PropertyType) => BitmapTypedValue): IBitmapTypedValueFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[IBitmapTypedValueFactory]
  }
  @scala.inline
  implicit class IBitmapTypedValueFactoryOps[Self <: IBitmapTypedValueFactory] (val x: Self) extends AnyVal {
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
    def setCreate(value: (js.Any, PropertyType) => BitmapTypedValue): Self = this.set("create", js.Any.fromFunction2(value))
  }
  
}

