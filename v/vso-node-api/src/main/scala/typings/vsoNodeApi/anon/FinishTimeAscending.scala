package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishTimeAscending extends StObject {
  
  var finishTimeAscending: scala.Double
  
  var finishTimeDescending: scala.Double
  
  var queueTimeAscending: scala.Double
  
  var queueTimeDescending: scala.Double
  
  var startTimeAscending: scala.Double
  
  var startTimeDescending: scala.Double
}
object FinishTimeAscending {
  
  inline def apply(
    finishTimeAscending: scala.Double,
    finishTimeDescending: scala.Double,
    queueTimeAscending: scala.Double,
    queueTimeDescending: scala.Double,
    startTimeAscending: scala.Double,
    startTimeDescending: scala.Double
  ): FinishTimeAscending = {
    val __obj = js.Dynamic.literal(finishTimeAscending = finishTimeAscending.asInstanceOf[js.Any], finishTimeDescending = finishTimeDescending.asInstanceOf[js.Any], queueTimeAscending = queueTimeAscending.asInstanceOf[js.Any], queueTimeDescending = queueTimeDescending.asInstanceOf[js.Any], startTimeAscending = startTimeAscending.asInstanceOf[js.Any], startTimeDescending = startTimeDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishTimeAscending]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FinishTimeAscending] (val x: Self) extends AnyVal {
    
    inline def setFinishTimeAscending(value: scala.Double): Self = StObject.set(x, "finishTimeAscending", value.asInstanceOf[js.Any])
    
    inline def setFinishTimeDescending(value: scala.Double): Self = StObject.set(x, "finishTimeDescending", value.asInstanceOf[js.Any])
    
    inline def setQueueTimeAscending(value: scala.Double): Self = StObject.set(x, "queueTimeAscending", value.asInstanceOf[js.Any])
    
    inline def setQueueTimeDescending(value: scala.Double): Self = StObject.set(x, "queueTimeDescending", value.asInstanceOf[js.Any])
    
    inline def setStartTimeAscending(value: scala.Double): Self = StObject.set(x, "startTimeAscending", value.asInstanceOf[js.Any])
    
    inline def setStartTimeDescending(value: scala.Double): Self = StObject.set(x, "startTimeDescending", value.asInstanceOf[js.Any])
  }
}
