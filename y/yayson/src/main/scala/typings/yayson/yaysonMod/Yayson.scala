package typings.yayson.yaysonMod

import org.scalablytyped.runtime.Instantiable0
import typings.yayson.TypeofClassPresenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Yayson extends js.Object {
  var Adapter: typings.yayson.yaysonMod.Adapter
  var Presenter: TypeofClassPresenter
  var Store: Instantiable0[typings.yayson.yaysonMod.Store]
}

object Yayson {
  @scala.inline
  def apply(Adapter: Adapter, Presenter: TypeofClassPresenter, Store: Instantiable0[Store]): Yayson = {
    val __obj = js.Dynamic.literal(Adapter = Adapter.asInstanceOf[js.Any], Presenter = Presenter.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Yayson]
  }
}

