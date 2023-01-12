package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinksOneHopDoesNotContain extends StObject {
  
  var linksOneHopDoesNotContain: scala.Double
  
  var linksOneHopMayContain: scala.Double
  
  var linksOneHopMustContain: scala.Double
  
  var linksRecursiveDoesNotContain: scala.Double
  
  var linksRecursiveMayContain: scala.Double
  
  var linksRecursiveMustContain: scala.Double
  
  var workItems: scala.Double
}
object LinksOneHopDoesNotContain {
  
  inline def apply(
    linksOneHopDoesNotContain: scala.Double,
    linksOneHopMayContain: scala.Double,
    linksOneHopMustContain: scala.Double,
    linksRecursiveDoesNotContain: scala.Double,
    linksRecursiveMayContain: scala.Double,
    linksRecursiveMustContain: scala.Double,
    workItems: scala.Double
  ): LinksOneHopDoesNotContain = {
    val __obj = js.Dynamic.literal(linksOneHopDoesNotContain = linksOneHopDoesNotContain.asInstanceOf[js.Any], linksOneHopMayContain = linksOneHopMayContain.asInstanceOf[js.Any], linksOneHopMustContain = linksOneHopMustContain.asInstanceOf[js.Any], linksRecursiveDoesNotContain = linksRecursiveDoesNotContain.asInstanceOf[js.Any], linksRecursiveMayContain = linksRecursiveMayContain.asInstanceOf[js.Any], linksRecursiveMustContain = linksRecursiveMustContain.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinksOneHopDoesNotContain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinksOneHopDoesNotContain] (val x: Self) extends AnyVal {
    
    inline def setLinksOneHopDoesNotContain(value: scala.Double): Self = StObject.set(x, "linksOneHopDoesNotContain", value.asInstanceOf[js.Any])
    
    inline def setLinksOneHopMayContain(value: scala.Double): Self = StObject.set(x, "linksOneHopMayContain", value.asInstanceOf[js.Any])
    
    inline def setLinksOneHopMustContain(value: scala.Double): Self = StObject.set(x, "linksOneHopMustContain", value.asInstanceOf[js.Any])
    
    inline def setLinksRecursiveDoesNotContain(value: scala.Double): Self = StObject.set(x, "linksRecursiveDoesNotContain", value.asInstanceOf[js.Any])
    
    inline def setLinksRecursiveMayContain(value: scala.Double): Self = StObject.set(x, "linksRecursiveMayContain", value.asInstanceOf[js.Any])
    
    inline def setLinksRecursiveMustContain(value: scala.Double): Self = StObject.set(x, "linksRecursiveMustContain", value.asInstanceOf[js.Any])
    
    inline def setWorkItems(value: scala.Double): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
  }
}
