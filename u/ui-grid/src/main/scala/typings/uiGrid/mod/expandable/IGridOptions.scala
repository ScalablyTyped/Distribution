package typings.uiGrid.mod.expandable

import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridOptions extends js.Object {
  
  /**
    * Whether or not to use expandable feature.  Allows you to turn off expandable on specific grids within
    * your application, or in specific modes on this grid.
    * Defaults to true.
    */
  var enableExpandable: js.UndefOr[Boolean] = js.native
  
  /**
    * Show a rowHeader to provide the expandable buttons. If set to false then implies you're going to use a
    * custom method for expanding and collapsing the subgrids.
    * Defaults to true.
    */
  var enableExpandableRowHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Width in pixels of the expandable column. Defaults to 40
    */
  var expandableRowHeaderWidth: js.UndefOr[Double] = js.native
  
  /**
    * Height in pixels of the expanded subgrid.
    * Defaults to 150
    */
  var expandableRowHeight: js.UndefOr[Double] = js.native
  
  /**
    * reference to the parent grid scope (the parent scope of the sub-grid element)
    */
  var expandableRowScope: js.UndefOr[IScope | js.Object] = js.native
  
  /**
    * Mandatory. The template for your expanded row
    */
  var expandableRowTemplate: js.UndefOr[String] = js.native
}
object IGridOptions {
  
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableExpandable(value: Boolean): Self = this.set("enableExpandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableExpandable: Self = this.set("enableExpandable", js.undefined)
    
    @scala.inline
    def setEnableExpandableRowHeader(value: Boolean): Self = this.set("enableExpandableRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableExpandableRowHeader: Self = this.set("enableExpandableRowHeader", js.undefined)
    
    @scala.inline
    def setExpandableRowHeaderWidth(value: Double): Self = this.set("expandableRowHeaderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandableRowHeaderWidth: Self = this.set("expandableRowHeaderWidth", js.undefined)
    
    @scala.inline
    def setExpandableRowHeight(value: Double): Self = this.set("expandableRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandableRowHeight: Self = this.set("expandableRowHeight", js.undefined)
    
    @scala.inline
    def setExpandableRowScope(value: IScope | js.Object): Self = this.set("expandableRowScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandableRowScope: Self = this.set("expandableRowScope", js.undefined)
    
    @scala.inline
    def setExpandableRowTemplate(value: String): Self = this.set("expandableRowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandableRowTemplate: Self = this.set("expandableRowTemplate", js.undefined)
  }
}
