package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of `begin` and `end` indexes that indicate the locations of the elements in the input document. */
@js.native
trait ElementLocations extends StObject {
  
  /** An integer that indicates the starting position of the element in the input document. */
  var begin: js.UndefOr[Double] = js.native
  
  /** An integer that indicates the ending position of the element in the input document. */
  var end: js.UndefOr[Double] = js.native
}
object ElementLocations {
  
  @scala.inline
  def apply(): ElementLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementLocations]
  }
  
  @scala.inline
  implicit class ElementLocationsMutableBuilder[Self <: ElementLocations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
  }
}
