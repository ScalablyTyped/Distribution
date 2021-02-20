package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Viz Classes
@js.native
trait VizManager extends StObject {
  
  def getVizs(): js.Array[Viz] = js.native
}
object VizManager {
  
  @scala.inline
  def apply(getVizs: () => js.Array[Viz]): VizManager = {
    val __obj = js.Dynamic.literal(getVizs = js.Any.fromFunction0(getVizs))
    __obj.asInstanceOf[VizManager]
  }
  
  @scala.inline
  implicit class VizManagerMutableBuilder[Self <: VizManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetVizs(value: () => js.Array[Viz]): Self = StObject.set(x, "getVizs", js.Any.fromFunction0(value))
  }
}
