package typings.toSemver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Clean versions. For example `v1.3.0` → `1.3.0`.
  		@default true
  		*/
  val clean: js.UndefOr[Boolean] = js.native
  /**
  		Include prereleases, like `1.2.3-alpha.3`.
  		@default true
  		*/
  val includePrereleases: js.UndefOr[Boolean] = js.native
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
    def setClean(value: Boolean): Self = this.set("clean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClean: Self = this.set("clean", js.undefined)
    @scala.inline
    def setIncludePrereleases(value: Boolean): Self = this.set("includePrereleases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePrereleases: Self = this.set("includePrereleases", js.undefined)
  }
  
}

