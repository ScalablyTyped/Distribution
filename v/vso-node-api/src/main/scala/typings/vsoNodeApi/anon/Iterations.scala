package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iterations extends StObject {
  
  var iterations: scala.Double
  
  var none: scala.Double
  
  var workItems: scala.Double
}
object Iterations {
  
  @scala.inline
  def apply(iterations: scala.Double, none: scala.Double, workItems: scala.Double): Iterations = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterations]
  }
  
  @scala.inline
  implicit class IterationsMutableBuilder[Self <: Iterations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIterations(value: scala.Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItems(value: scala.Double): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
  }
}
