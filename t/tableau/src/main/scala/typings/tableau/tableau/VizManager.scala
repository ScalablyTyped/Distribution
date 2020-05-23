package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Viz Classes
trait VizManager extends js.Object {
  def getVizs(): js.Array[Viz]
}

object VizManager {
  @scala.inline
  def apply(getVizs: () => js.Array[Viz]): VizManager = {
    val __obj = js.Dynamic.literal(getVizs = js.Any.fromFunction0(getVizs))
    __obj.asInstanceOf[VizManager]
  }
}

