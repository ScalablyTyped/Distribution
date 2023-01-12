package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactiveGeom extends StObject {
  
  var reactiveGeom: js.UndefOr[Boolean] = js.undefined
}
object ReactiveGeom {
  
  inline def apply(): ReactiveGeom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactiveGeom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReactiveGeom] (val x: Self) extends AnyVal {
    
    inline def setReactiveGeom(value: Boolean): Self = StObject.set(x, "reactiveGeom", value.asInstanceOf[js.Any])
    
    inline def setReactiveGeomUndefined: Self = StObject.set(x, "reactiveGeom", js.undefined)
  }
}
