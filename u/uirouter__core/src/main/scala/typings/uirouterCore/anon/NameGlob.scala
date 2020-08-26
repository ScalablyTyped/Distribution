package typings.uirouterCore.anon

import typings.uirouterCore.globMod.Glob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameGlob extends js.Object {
  /** Might be null */
  var nameGlob: js.UndefOr[Glob] = js.native
}

object NameGlob {
  @scala.inline
  def apply(): NameGlob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameGlob]
  }
  @scala.inline
  implicit class NameGlobOps[Self <: NameGlob] (val x: Self) extends AnyVal {
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
    def setNameGlob(value: Glob): Self = this.set("nameGlob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameGlob: Self = this.set("nameGlob", js.undefined)
  }
  
}

