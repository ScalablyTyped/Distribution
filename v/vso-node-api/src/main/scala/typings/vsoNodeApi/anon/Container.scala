package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: scala.Double
  
  var job: scala.Double
}
object Container {
  
  @scala.inline
  def apply(container: scala.Double, job: scala.Double): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: scala.Double): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob(value: scala.Double): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
