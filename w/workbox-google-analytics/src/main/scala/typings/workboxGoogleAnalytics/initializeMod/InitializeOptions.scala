package typings.workboxGoogleAnalytics.initializeMod

import typings.std.Record
import typings.std.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializeOptions extends js.Object {
  var cacheName: js.UndefOr[String] = js.native
  var hitFilter: js.UndefOr[js.Function1[/* params */ URLSearchParams, Unit]] = js.native
  var parameterOverrides: js.UndefOr[Record[String, String]] = js.native
}

object InitializeOptions {
  @scala.inline
  def apply(): InitializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializeOptions]
  }
  @scala.inline
  implicit class InitializeOptionsOps[Self <: InitializeOptions] (val x: Self) extends AnyVal {
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
    def setCacheName(value: String): Self = this.set("cacheName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheName: Self = this.set("cacheName", js.undefined)
    @scala.inline
    def setHitFilter(value: /* params */ URLSearchParams => Unit): Self = this.set("hitFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHitFilter: Self = this.set("hitFilter", js.undefined)
    @scala.inline
    def setParameterOverrides(value: Record[String, String]): Self = this.set("parameterOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterOverrides: Self = this.set("parameterOverrides", js.undefined)
  }
  
}

