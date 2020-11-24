package typings.vfileLocation.mod

import typings.vfileLocation.anon.Column
import typings.vfileLocation.anon.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends js.Object {
  
  /**
    * Get the `offset` (`number`) for a line and column-based `position` in the bound file.
    * Returns `-1` when given invalid or out of bounds input.
    */
  def toOffset(position: Column): Double = js.native
  
  /**
    * Get the line and column-based `position` for `offset` in the bound file.
    */
  def toPosition(offset: Double): Line = js.native
}
object Location {
  
  @scala.inline
  def apply(toOffset: Column => Double, toPosition: Double => Line): Location = {
    val __obj = js.Dynamic.literal(toOffset = js.Any.fromFunction1(toOffset), toPosition = js.Any.fromFunction1(toPosition))
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    
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
    def setToOffset(value: Column => Double): Self = this.set("toOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToPosition(value: Double => Line): Self = this.set("toPosition", js.Any.fromFunction1(value))
  }
}
