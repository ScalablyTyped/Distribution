package typings.uiDashGrid.uiDashGridMod.saveState

import typings.angular.angularMod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridSaveStateApi extends js.Object {
  // Methods
  /**
    * Restores the provided state into the grid
    * @param {ng.IScope} $scope A scope we can broadcast on
    * @param {IGridSavedState} state The state that should ve restored into the grid
    */
  def restore($scope: IScope, state: IGridSavedState): Unit
  /**
    * Packages the current state of the grid into an object, and provides it to the user for saving
    * @returns {IGridSavedState} Current grid state as a POJO
    */
  def save(): IGridSavedState
}

object IGridSaveStateApi {
  @scala.inline
  def apply(restore: (IScope, IGridSavedState) => Unit, save: () => IGridSavedState): IGridSaveStateApi = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction2(restore), save = js.Any.fromFunction0(save))
  
    __obj.asInstanceOf[IGridSaveStateApi]
  }
}

