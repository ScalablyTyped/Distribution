package typings.traceEventLib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Labels extends StObject {
  
  /**
    * TODO: probably, comma-separated values string?
    */
  var labels: Any
}
object Labels {
  
  inline def apply(labels: Any): Labels = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
  
  extension [Self <: Labels](x: Self) {
    
    inline def setLabels(value: Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
  }
}
