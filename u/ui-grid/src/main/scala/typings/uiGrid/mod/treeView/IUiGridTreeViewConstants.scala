package typings.uiGrid.mod.treeView

import typings.uiGrid.anon.AVG_
import typings.uiGrid.mod.ISharedTreeConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUiGridTreeViewConstants extends ISharedTreeConstants {
  
  var featureName: String = js.native
}
object IUiGridTreeViewConstants {
  
  @scala.inline
  def apply(
    COLLAPSED: String,
    EXPANDED: String,
    aggregation: AVG_,
    featureName: String,
    rowHeaderColName: String
  ): IUiGridTreeViewConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridTreeViewConstants]
  }
  
  @scala.inline
  implicit class IUiGridTreeViewConstantsOps[Self <: IUiGridTreeViewConstants] (val x: Self) extends AnyVal {
    
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
