package typings.tableau.tableau

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
trait Mark extends js.Object {
  
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
  implicit class MarkOps[Self <: Mark] (val x: Self) extends AnyVal {
    
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
    def setGetPairs(value: () => js.Array[Pair]): Self = this.set("getPairs", js.Any.fromFunction0(value))
  }
}
