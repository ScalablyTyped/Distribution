package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NeedsUpdate extends StObject {
  
  var needsUpdate: Boolean = js.native
  
  var value: js.Any = js.native
}
object NeedsUpdate {
  
  @scala.inline
  def apply(needsUpdate: Boolean, value: js.Any): NeedsUpdate = {
    val __obj = js.Dynamic.literal(needsUpdate = needsUpdate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsUpdate]
  }
  
  @scala.inline
  implicit class NeedsUpdateMutableBuilder[Self <: NeedsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNeedsUpdate(value: Boolean): Self = StObject.set(x, "needsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
