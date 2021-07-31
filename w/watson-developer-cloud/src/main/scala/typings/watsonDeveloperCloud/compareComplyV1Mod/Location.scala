package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
trait Location extends StObject {
  
  /** The element's `begin` index. */
  var begin: Double
  
  /** The element's `end` index. */
  var end: Double
}
object Location {
  
  @scala.inline
  def apply(begin: Double, end: Double): Location = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
  }
}
