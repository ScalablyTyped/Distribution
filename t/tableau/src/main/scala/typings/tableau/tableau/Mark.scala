package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Marks Selection
/**
  * A mark represents a single data point on the visualization.
  * It is independent of the type of visualization (bar, line, pie, etc.).
  */
@js.native
trait Mark extends StObject {
  
  /** Gets a collection of field name/value pairs associated with the mark. */
  def getPairs(): js.Array[Pair] = js.native
}
object Mark {
  
  @scala.inline
  def apply(getPairs: () => js.Array[Pair]): Mark = {
    val __obj = js.Dynamic.literal(getPairs = js.Any.fromFunction0(getPairs))
    __obj.asInstanceOf[Mark]
  }
  
  @scala.inline
  implicit class MarkMutableBuilder[Self <: Mark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPairs(value: () => js.Array[Pair]): Self = StObject.set(x, "getPairs", js.Any.fromFunction0(value))
  }
}
