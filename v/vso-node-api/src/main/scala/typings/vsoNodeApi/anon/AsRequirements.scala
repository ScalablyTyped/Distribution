package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsRequirements extends StObject {
  
  var asRequirements: scala.Double = js.native
  
  var asTasks: scala.Double = js.native
  
  var off: scala.Double = js.native
}
object AsRequirements {
  
  @scala.inline
  def apply(asRequirements: scala.Double, asTasks: scala.Double, off: scala.Double): AsRequirements = {
    val __obj = js.Dynamic.literal(asRequirements = asRequirements.asInstanceOf[js.Any], asTasks = asTasks.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsRequirements]
  }
  
  @scala.inline
  implicit class AsRequirementsMutableBuilder[Self <: AsRequirements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsRequirements(value: scala.Double): Self = StObject.set(x, "asRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsTasks(value: scala.Double): Self = StObject.set(x, "asTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOff(value: scala.Double): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
  }
}
