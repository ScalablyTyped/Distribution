package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactiveGeom extends StObject {
  
  var reactiveGeom: js.UndefOr[Boolean] = js.native
}
object ReactiveGeom {
  
  @scala.inline
  def apply(): ReactiveGeom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactiveGeom]
  }
  
  @scala.inline
  implicit class ReactiveGeomMutableBuilder[Self <: ReactiveGeom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReactiveGeom(value: Boolean): Self = StObject.set(x, "reactiveGeom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactiveGeomUndefined: Self = StObject.set(x, "reactiveGeom", js.undefined)
  }
}
