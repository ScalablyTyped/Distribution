package typings.webpackMerge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomizeOptions extends js.Object {
  var customizeArray: js.UndefOr[CustomizeArrayFunction | UniqueFunction] = js.native
  var customizeObject: js.UndefOr[CustomizeObjectFunction] = js.native
}

object CustomizeOptions {
  @scala.inline
  def apply(): CustomizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizeOptions]
  }
  @scala.inline
  implicit class CustomizeOptionsOps[Self <: CustomizeOptions] (val x: Self) extends AnyVal {
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
    def setCustomizeArray(
      value: ((/* a */ js.Array[js.Any]) | (/* field */ String), /* b */ js.Array[js.Any | String], (/* keyFn */ js.Function1[/* field */ js.Any, String]) | (/* key */ String)) => js.UndefOr[js.Array[js.Any] | CustomizeArrayFunction | Null]
    ): Self = this.set("customizeArray", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCustomizeArray: Self = this.set("customizeArray", js.undefined)
    @scala.inline
    def setCustomizeObject(value: (/* a */ js.Object, /* b */ js.Object, /* key */ String) => js.UndefOr[js.Object | Null]): Self = this.set("customizeObject", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCustomizeObject: Self = this.set("customizeObject", js.undefined)
  }
  
}

