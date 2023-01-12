package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Viz Classes
trait VizManager extends StObject {
  
  def getVizs(): js.Array[Viz]
}
object VizManager {
  
  inline def apply(getVizs: () => js.Array[Viz]): VizManager = {
    val __obj = js.Dynamic.literal(getVizs = js.Any.fromFunction0(getVizs))
    __obj.asInstanceOf[VizManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VizManager] (val x: Self) extends AnyVal {
    
    inline def setGetVizs(value: () => js.Array[Viz]): Self = StObject.set(x, "getVizs", js.Any.fromFunction0(value))
  }
}
