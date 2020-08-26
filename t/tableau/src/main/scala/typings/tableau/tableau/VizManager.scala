package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Viz Classes
@js.native
trait VizManager extends js.Object {
  def getVizs(): js.Array[Viz] = js.native
}

object VizManager {
  @scala.inline
  def apply(getVizs: () => js.Array[Viz]): VizManager = {
    val __obj = js.Dynamic.literal(getVizs = js.Any.fromFunction0(getVizs))
    __obj.asInstanceOf[VizManager]
  }
  @scala.inline
  implicit class VizManagerOps[Self <: VizManager] (val x: Self) extends AnyVal {
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
    def setGetVizs(value: () => js.Array[Viz]): Self = this.set("getVizs", js.Any.fromFunction0(value))
  }
  
}

