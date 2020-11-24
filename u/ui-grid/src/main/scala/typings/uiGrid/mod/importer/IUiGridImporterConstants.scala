package typings.uiGrid.mod.importer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUiGridImporterConstants extends js.Object {
  
  var featureName: String = js.native
}
object IUiGridImporterConstants {
  
  @scala.inline
  def apply(featureName: String): IUiGridImporterConstants = {
    val __obj = js.Dynamic.literal(featureName = featureName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridImporterConstants]
  }
  
  @scala.inline
  implicit class IUiGridImporterConstantsOps[Self <: IUiGridImporterConstants] (val x: Self) extends AnyVal {
    
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
    def setFeatureName(value: String): Self = this.set("featureName", value.asInstanceOf[js.Any])
  }
}
