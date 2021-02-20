package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoNotRun extends StObject {
  
  var doNotRun: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object DoNotRun {
  
  @scala.inline
  def apply(doNotRun: scala.Double, none: scala.Double): DoNotRun = {
    val __obj = js.Dynamic.literal(doNotRun = doNotRun.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoNotRun]
  }
  
  @scala.inline
  implicit class DoNotRunMutableBuilder[Self <: DoNotRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoNotRun(value: scala.Double): Self = StObject.set(x, "doNotRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
