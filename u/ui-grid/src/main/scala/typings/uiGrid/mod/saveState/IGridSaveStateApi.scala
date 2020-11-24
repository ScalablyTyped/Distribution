package typings.uiGrid.mod.saveState

import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridSaveStateApi extends js.Object {
  
  // Methods
  /**
    * Restores the provided state into the grid
    * @param {ng.IScope} $scope A scope we can broadcast on
    * @param {IGridSavedState} state The state that should ve restored into the grid
    */
  def restore($scope: IScope, state: IGridSavedState): Unit = js.native
  
  /**
    * Packages the current state of the grid into an object, and provides it to the user for saving
    * @returns {IGridSavedState} Current grid state as a POJO
    */
  def save(): IGridSavedState = js.native
}
object IGridSaveStateApi {
  
  @scala.inline
  def apply(restore: (IScope, IGridSavedState) => Unit, save: () => IGridSavedState): IGridSaveStateApi = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction2(restore), save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[IGridSaveStateApi]
  }
  
  @scala.inline
  implicit class IGridSaveStateApiOps[Self <: IGridSaveStateApi] (val x: Self) extends AnyVal {
    
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
    def setRestore(value: (IScope, IGridSavedState) => Unit): Self = this.set("restore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSave(value: () => IGridSavedState): Self = this.set("save", js.Any.fromFunction0(value))
  }
}
