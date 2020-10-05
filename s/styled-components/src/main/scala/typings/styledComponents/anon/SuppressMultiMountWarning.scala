package typings.styledComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuppressMultiMountWarning extends js.Object {
  var suppressMultiMountWarning: js.UndefOr[Boolean] = js.native
}

object SuppressMultiMountWarning {
  @scala.inline
  def apply(): SuppressMultiMountWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuppressMultiMountWarning]
  }
  @scala.inline
  implicit class SuppressMultiMountWarningOps[Self <: SuppressMultiMountWarning] (val x: Self) extends AnyVal {
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
    def setSuppressMultiMountWarning(value: Boolean): Self = this.set("suppressMultiMountWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressMultiMountWarning: Self = this.set("suppressMultiMountWarning", js.undefined)
  }
  
}

