package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinksOneHopDoesNotContain extends StObject {
  
  var linksOneHopDoesNotContain: scala.Double = js.native
  
  var linksOneHopMayContain: scala.Double = js.native
  
  var linksOneHopMustContain: scala.Double = js.native
  
  var linksRecursiveDoesNotContain: scala.Double = js.native
  
  var linksRecursiveMayContain: scala.Double = js.native
  
  var linksRecursiveMustContain: scala.Double = js.native
  
  var workItems: scala.Double = js.native
}
object LinksOneHopDoesNotContain {
  
  @scala.inline
  def apply(
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
  implicit class LinksOneHopDoesNotContainMutableBuilder[Self <: LinksOneHopDoesNotContain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinksOneHopDoesNotContain(value: scala.Double): Self = StObject.set(x, "linksOneHopDoesNotContain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksOneHopMayContain(value: scala.Double): Self = StObject.set(x, "linksOneHopMayContain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksOneHopMustContain(value: scala.Double): Self = StObject.set(x, "linksOneHopMustContain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksRecursiveDoesNotContain(value: scala.Double): Self = StObject.set(x, "linksRecursiveDoesNotContain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksRecursiveMayContain(value: scala.Double): Self = StObject.set(x, "linksRecursiveMayContain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksRecursiveMustContain(value: scala.Double): Self = StObject.set(x, "linksRecursiveMustContain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItems(value: scala.Double): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
  }
}
