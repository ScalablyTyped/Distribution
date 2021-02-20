package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Enabled extends StObject {
  
  var enabled: Boolean = js.native
  
  var forceDirection: js.UndefOr[String | Boolean] = js.native
  
  var roundness: Double = js.native
  
  var `type`: String = js.native
}
object Enabled {
  
  @scala.inline
  def apply(enabled: Boolean, roundness: Double, `type`: String): Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], roundness = roundness.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDirection(value: String | Boolean): Self = StObject.set(x, "forceDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDirectionUndefined: Self = StObject.set(x, "forceDirection", js.undefined)
    
    @scala.inline
    def setRoundness(value: Double): Self = StObject.set(x, "roundness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
