package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotSet extends StObject {
  
  var abandoned: scala.Double = js.native
  
  var active: scala.Double = js.native
  
  var all: scala.Double = js.native
  
  var completed: scala.Double = js.native
  
  var notSet: scala.Double = js.native
}
object NotSet {
  
  @scala.inline
  def apply(
    abandoned: scala.Double,
    active: scala.Double,
    all: scala.Double,
    completed: scala.Double,
    notSet: scala.Double
  ): NotSet = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotSet]
  }
  
  @scala.inline
  implicit class NotSetMutableBuilder[Self <: NotSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbandoned(value: scala.Double): Self = StObject.set(x, "abandoned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: scala.Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: scala.Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSet(value: scala.Double): Self = StObject.set(x, "notSet", value.asInstanceOf[js.Any])
  }
}
