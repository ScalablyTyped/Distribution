package typings.uifabricUtilities.asAsyncMod

import typings.react.mod.ElementType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsAsyncOptions[TProps] extends js.Object {
  /**
    * Callback when async loading fails.
    */
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  /**
    * Callback executed when async loading is complete.
    */
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback which returns a promise resolving an object which exports the component.
    */
  def load(): js.Promise[ElementType[TProps]] = js.native
}

object IAsAsyncOptions {
  @scala.inline
  def apply[TProps](load: () => js.Promise[ElementType[TProps]]): IAsAsyncOptions[TProps] = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[IAsAsyncOptions[TProps]]
  }
  @scala.inline
  implicit class IAsAsyncOptionsOps[Self <: IAsAsyncOptions[_], TProps] (val x: Self with IAsAsyncOptions[TProps]) extends AnyVal {
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
    def setLoad(value: () => js.Promise[ElementType[TProps]]): Self = this.set("load", js.Any.fromFunction0(value))
    @scala.inline
    def setOnError(value: /* error */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
  }
  
}

