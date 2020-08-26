package typings.webgme.Gme

import typings.webgme.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerMeta extends js.Object {
  var items: js.Array[Id] = js.native
  /**
    * the maximum allowed targets for a pointer is 1.
    * more than 1 requires a set.
    */
  var max: Double = js.native
}

object PointerMeta {
  @scala.inline
  def apply(items: js.Array[Id], max: Double): PointerMeta = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerMeta]
  }
  @scala.inline
  implicit class PointerMetaOps[Self <: PointerMeta] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Id*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Id]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
  }
  
}

