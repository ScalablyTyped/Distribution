package typings.tarFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractOptions extends Options {
  @JSName("filter")
  var filter_ExtractOptions: js.UndefOr[js.Function2[/* name */ String, /* header */ js.UndefOr[Headers], Boolean]] = js.native
  @JSName("ignore")
  var ignore_ExtractOptions: js.UndefOr[js.Function2[/* name */ String, /* header */ js.UndefOr[Headers], Boolean]] = js.native
  var strip: js.UndefOr[Double] = js.native
}

object ExtractOptions {
  @scala.inline
  def apply(): ExtractOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractOptions]
  }
  @scala.inline
  implicit class ExtractOptionsOps[Self <: ExtractOptions] (val x: Self) extends AnyVal {
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
    def setFilter(value: (/* name */ String, /* header */ js.UndefOr[Headers]) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setIgnore(value: (/* name */ String, /* header */ js.UndefOr[Headers]) => Boolean): Self = this.set("ignore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setStrip(value: Double): Self = this.set("strip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrip: Self = this.set("strip", js.undefined)
  }
  
}

