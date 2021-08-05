package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Marks Selection
/**
  * A mark represents a single data point on the visualization.
  * It is independent of the type of visualization (bar, line, pie, etc.).
  */
trait Mark extends StObject {
  
  /** Gets a collection of field name/value pairs associated with the mark. */
  def getPairs(): js.Array[Pair]
}
object Mark {
  
  inline def apply(getPairs: () => js.Array[Pair]): Mark = {
    val __obj = js.Dynamic.literal(getPairs = js.Any.fromFunction0(getPairs))
    __obj.asInstanceOf[Mark]
  }
  
  extension [Self <: Mark](x: Self) {
    
    inline def setGetPairs(value: () => js.Array[Pair]): Self = StObject.set(x, "getPairs", js.Any.fromFunction0(value))
  }
}
