package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait All extends StObject {
  
  var all: scala.Double
  
  var batchedCI: scala.Double
  
  var checkInShelveset: scala.Double
  
  var individualCI: scala.Double
  
  var manual: scala.Double
  
  var none: scala.Double
  
  var pullRequest: scala.Double
  
  var schedule: scala.Double
  
  var triggered: scala.Double
  
  var userCreated: scala.Double
  
  var validateShelveset: scala.Double
}
object All {
  
  inline def apply(
    all: scala.Double,
    batchedCI: scala.Double,
    checkInShelveset: scala.Double,
    individualCI: scala.Double,
    manual: scala.Double,
    none: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double,
    triggered: scala.Double,
    userCreated: scala.Double,
    validateShelveset: scala.Double
  ): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], batchedCI = batchedCI.asInstanceOf[js.Any], checkInShelveset = checkInShelveset.asInstanceOf[js.Any], individualCI = individualCI.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], triggered = triggered.asInstanceOf[js.Any], userCreated = userCreated.asInstanceOf[js.Any], validateShelveset = validateShelveset.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  
  extension [Self <: All](x: Self) {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setBatchedCI(value: scala.Double): Self = StObject.set(x, "batchedCI", value.asInstanceOf[js.Any])
    
    inline def setCheckInShelveset(value: scala.Double): Self = StObject.set(x, "checkInShelveset", value.asInstanceOf[js.Any])
    
    inline def setIndividualCI(value: scala.Double): Self = StObject.set(x, "individualCI", value.asInstanceOf[js.Any])
    
    inline def setManual(value: scala.Double): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setPullRequest(value: scala.Double): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: scala.Double): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setTriggered(value: scala.Double): Self = StObject.set(x, "triggered", value.asInstanceOf[js.Any])
    
    inline def setUserCreated(value: scala.Double): Self = StObject.set(x, "userCreated", value.asInstanceOf[js.Any])
    
    inline def setValidateShelveset(value: scala.Double): Self = StObject.set(x, "validateShelveset", value.asInstanceOf[js.Any])
  }
}
