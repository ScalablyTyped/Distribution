package typings.winkJaroDistance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Distance extends StObject {
    
    var distance: Double
    
    var similarity: Double
  }
  object Distance {
    
    inline def apply(distance: Double, similarity: Double): Distance = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], similarity = similarity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Distance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Distance] (val x: Self) extends AnyVal {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setSimilarity(value: Double): Self = StObject.set(x, "similarity", value.asInstanceOf[js.Any])
    }
  }
}
