package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instances extends StObject {
  
  var count: Double
  
  var instances: Double
  
  var start: Double
}
object Instances {
  
  @scala.inline
  def apply(count: Double, instances: Double, start: Double): Instances = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instances]
  }
  
  @scala.inline
  implicit class InstancesMutableBuilder[Self <: Instances] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstances(value: Double): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
