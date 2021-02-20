package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectOptions extends StObject {
  
  var topLeft: js.UndefOr[Boolean] = js.native
}
object ProjectOptions {
  
  @scala.inline
  def apply(): ProjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectOptions]
  }
  
  @scala.inline
  implicit class ProjectOptionsMutableBuilder[Self <: ProjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopLeft(value: Boolean): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
  }
}
