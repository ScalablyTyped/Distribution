package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialInteractionSource extends StObject {
  
  var id: js.Any = js.native
  
  /* unmapped type */
  var kind: js.Any = js.native
}
object SpatialInteractionSource {
  
  @scala.inline
  def apply(id: js.Any, kind: js.Any): SpatialInteractionSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSource]
  }
  
  @scala.inline
  implicit class SpatialInteractionSourceMutableBuilder[Self <: SpatialInteractionSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: js.Any): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
