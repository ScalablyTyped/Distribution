package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameInfoOptions extends js.Object {
  val allowRenameOfImportPath: js.UndefOr[Boolean] = js.native
}

object RenameInfoOptions {
  @scala.inline
  def apply(): RenameInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameInfoOptions]
  }
  @scala.inline
  implicit class RenameInfoOptionsOps[Self <: RenameInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowRenameOfImportPath(value: Boolean): Self = this.set("allowRenameOfImportPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRenameOfImportPath: Self = this.set("allowRenameOfImportPath", js.undefined)
  }
  
}

