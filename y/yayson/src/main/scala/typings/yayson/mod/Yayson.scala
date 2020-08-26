package typings.yayson.mod

import org.scalablytyped.runtime.Instantiable0
import typings.yayson.anon.TypeofPresenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Yayson extends js.Object {
  var Adapter: typings.yayson.mod.Adapter = js.native
  var Presenter: TypeofPresenter = js.native
  var Store: Instantiable0[typings.yayson.mod.Store] = js.native
}

object Yayson {
  @scala.inline
  def apply(Adapter: Adapter, Presenter: TypeofPresenter, Store: Instantiable0[Store]): Yayson = {
    val __obj = js.Dynamic.literal(Adapter = Adapter.asInstanceOf[js.Any], Presenter = Presenter.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Yayson]
  }
  @scala.inline
  implicit class YaysonOps[Self <: Yayson] (val x: Self) extends AnyVal {
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
    def setAdapter(value: Adapter): Self = this.set("Adapter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPresenter(value: TypeofPresenter): Self = this.set("Presenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore(value: Instantiable0[Store]): Self = this.set("Store", value.asInstanceOf[js.Any])
  }
  
}

