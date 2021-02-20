package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hosted extends StObject {
  
  var all: scala.Double = js.native
  
  var hosted: scala.Double = js.native
  
  var onPremises: scala.Double = js.native
}
object Hosted {
  
  @scala.inline
  def apply(all: scala.Double, hosted: scala.Double, onPremises: scala.Double): Hosted = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], hosted = hosted.asInstanceOf[js.Any], onPremises = onPremises.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hosted]
  }
  
  @scala.inline
  implicit class HostedMutableBuilder[Self <: Hosted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHosted(value: scala.Double): Self = StObject.set(x, "hosted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremises(value: scala.Double): Self = StObject.set(x, "onPremises", value.asInstanceOf[js.Any])
  }
}
