package typings.styledComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuppressMultiMountWarning extends StObject {
  
  var suppressMultiMountWarning: js.UndefOr[Boolean] = js.native
}
object SuppressMultiMountWarning {
  
  @scala.inline
  def apply(): SuppressMultiMountWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuppressMultiMountWarning]
  }
  
  @scala.inline
  implicit class SuppressMultiMountWarningMutableBuilder[Self <: SuppressMultiMountWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuppressMultiMountWarning(value: Boolean): Self = StObject.set(x, "suppressMultiMountWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressMultiMountWarningUndefined: Self = StObject.set(x, "suppressMultiMountWarning", js.undefined)
  }
}
