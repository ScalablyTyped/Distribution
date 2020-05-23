package typings.yayson.mod

import org.scalablytyped.runtime.Instantiable0
import typings.yayson.anon.TypeofPresenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Yayson extends js.Object {
  var Adapter: typings.yayson.mod.Adapter
  var Presenter: TypeofPresenter
  var Store: Instantiable0[typings.yayson.mod.Store]
}

object Yayson {
  @scala.inline
  def apply(Adapter: Adapter, Presenter: TypeofPresenter, Store: Instantiable0[Store]): Yayson = {
    val __obj = js.Dynamic.literal(Adapter = Adapter.asInstanceOf[js.Any], Presenter = Presenter.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Yayson]
  }
}

