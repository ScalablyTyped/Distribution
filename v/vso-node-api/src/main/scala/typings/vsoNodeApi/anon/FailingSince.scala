package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailingSince extends StObject {
  
  var failingSince: scala.Double
  
  var regular: scala.Double
}
object FailingSince {
  
  @scala.inline
  def apply(failingSince: scala.Double, regular: scala.Double): FailingSince = {
    val __obj = js.Dynamic.literal(failingSince = failingSince.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailingSince]
  }
  
  @scala.inline
  implicit class FailingSinceMutableBuilder[Self <: FailingSince] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailingSince(value: scala.Double): Self = StObject.set(x, "failingSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegular(value: scala.Double): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
  }
}
