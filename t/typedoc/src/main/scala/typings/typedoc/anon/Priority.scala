package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Priority extends StObject {
  
  var priority: Double
}
object Priority {
  
  @scala.inline
  def apply(priority: Double): Priority = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Priority]
  }
  
  @scala.inline
  implicit class PriorityMutableBuilder[Self <: Priority] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
