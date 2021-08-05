package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanOptOut extends StObject {
  
  var canOptOut: scala.Double
  
  var contributedSubscription: scala.Double
  
  var groupSubscription: scala.Double
  
  var none: scala.Double
  
  var teamSubscription: scala.Double
}
object CanOptOut {
  
  inline def apply(
    canOptOut: scala.Double,
    contributedSubscription: scala.Double,
    groupSubscription: scala.Double,
    none: scala.Double,
    teamSubscription: scala.Double
  ): CanOptOut = {
    val __obj = js.Dynamic.literal(canOptOut = canOptOut.asInstanceOf[js.Any], contributedSubscription = contributedSubscription.asInstanceOf[js.Any], groupSubscription = groupSubscription.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], teamSubscription = teamSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanOptOut]
  }
  
  extension [Self <: CanOptOut](x: Self) {
    
    inline def setCanOptOut(value: scala.Double): Self = StObject.set(x, "canOptOut", value.asInstanceOf[js.Any])
    
    inline def setContributedSubscription(value: scala.Double): Self = StObject.set(x, "contributedSubscription", value.asInstanceOf[js.Any])
    
    inline def setGroupSubscription(value: scala.Double): Self = StObject.set(x, "groupSubscription", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setTeamSubscription(value: scala.Double): Self = StObject.set(x, "teamSubscription", value.asInstanceOf[js.Any])
  }
}
