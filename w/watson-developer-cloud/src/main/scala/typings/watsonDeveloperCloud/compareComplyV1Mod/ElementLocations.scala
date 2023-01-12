package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of `begin` and `end` indexes that indicate the locations of the elements in the input document. */
trait ElementLocations extends StObject {
  
  /** An integer that indicates the starting position of the element in the input document. */
  var begin: js.UndefOr[Double] = js.undefined
  
  /** An integer that indicates the ending position of the element in the input document. */
  var end: js.UndefOr[Double] = js.undefined
}
object ElementLocations {
  
  inline def apply(): ElementLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementLocations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementLocations] (val x: Self) extends AnyVal {
    
    inline def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
  }
}
