package typings.twig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  var async: js.UndefOr[js.Any] = js.native
  var base: js.UndefOr[js.Any] = js.native
  var blocks: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var href: js.UndefOr[js.Any] = js.native
  var id: js.UndefOr[js.Any] = js.native
  var load: js.UndefOr[js.Function1[/* template */ Template, Unit]] = js.native
  var macros: js.UndefOr[js.Any] = js.native
  var method: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[js.Any] = js.native
  var options: js.UndefOr[js.Any] = js.native
  var path: js.UndefOr[js.Any] = js.native
}

object Parameters {
  @scala.inline
  def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
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
    def setAsync(value: js.Any): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setBase(value: js.Any): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setBlocks(value: js.Any): Self = this.set("blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlocks: Self = this.set("blocks", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHref(value: js.Any): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLoad(value: /* template */ Template => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setMacros(value: js.Any): Self = this.set("macros", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacros: Self = this.set("macros", js.undefined)
    @scala.inline
    def setMethod(value: js.Any): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPath(value: js.Any): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

