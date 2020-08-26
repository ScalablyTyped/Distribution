package typings.tarFs.mod

import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var dmode: js.UndefOr[Double] = js.native
  var filter: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.native
  var fmode: js.UndefOr[Double] = js.native
  var ignore: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.native
  var map: js.UndefOr[js.Function1[/* header */ Headers, Headers]] = js.native
  var mapStream: js.UndefOr[js.Function2[/* fileStream */ ReadStream, /* header */ Headers, ReadStream]] = js.native
  var readable: js.UndefOr[Boolean] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var writable: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDmode(value: Double): Self = this.set("dmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDmode: Self = this.set("dmode", js.undefined)
    @scala.inline
    def setFilter(value: /* name */ String => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFmode(value: Double): Self = this.set("fmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFmode: Self = this.set("fmode", js.undefined)
    @scala.inline
    def setIgnore(value: /* name */ String => Boolean): Self = this.set("ignore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setMap(value: /* header */ Headers => Headers): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapStream(value: (/* fileStream */ ReadStream, /* header */ Headers) => ReadStream): Self = this.set("mapStream", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMapStream: Self = this.set("mapStream", js.undefined)
    @scala.inline
    def setReadable(value: Boolean): Self = this.set("readable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadable: Self = this.set("readable", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritable: Self = this.set("writable", js.undefined)
  }
  
}

