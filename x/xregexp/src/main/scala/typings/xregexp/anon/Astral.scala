package typings.xregexp.anon

import typings.xregexp.mod.FeatureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Astral extends FeatureOptions {
  var astral: js.UndefOr[Boolean] = js.native
  var namespacing: js.UndefOr[Boolean] = js.native
}

object Astral {
  @scala.inline
  def apply(): Astral = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Astral]
  }
  @scala.inline
  implicit class AstralOps[Self <: Astral] (val x: Self) extends AnyVal {
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
    def setAstral(value: Boolean): Self = this.set("astral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstral: Self = this.set("astral", js.undefined)
    @scala.inline
    def setNamespacing(value: Boolean): Self = this.set("namespacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespacing: Self = this.set("namespacing", js.undefined)
  }
  
}

