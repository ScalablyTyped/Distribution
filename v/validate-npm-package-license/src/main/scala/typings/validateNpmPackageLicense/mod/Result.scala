package typings.validateNpmPackageLicense.mod

import typings.validateNpmPackageLicense.validateNpmPackageLicenseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var inFile: js.UndefOr[String] = js.native
  
  var spdx: js.UndefOr[`true`] = js.native
  
  var unlicensed: js.UndefOr[`true`] = js.native
  
  var validForNewPackages: Boolean = js.native
  
  var validForOldPackages: Boolean = js.native
  
  var warnings: js.UndefOr[js.Array[String]] = js.native
}
object Result {
  
  @scala.inline
  def apply(validForNewPackages: Boolean, validForOldPackages: Boolean): Result = {
    val __obj = js.Dynamic.literal(validForNewPackages = validForNewPackages.asInstanceOf[js.Any], validForOldPackages = validForOldPackages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setValidForNewPackages(value: Boolean): Self = this.set("validForNewPackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidForOldPackages(value: Boolean): Self = this.set("validForOldPackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInFile(value: String): Self = this.set("inFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInFile: Self = this.set("inFile", js.undefined)
    
    @scala.inline
    def setSpdx(value: `true`): Self = this.set("spdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpdx: Self = this.set("spdx", js.undefined)
    
    @scala.inline
    def setUnlicensed(value: `true`): Self = this.set("unlicensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnlicensed: Self = this.set("unlicensed", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
