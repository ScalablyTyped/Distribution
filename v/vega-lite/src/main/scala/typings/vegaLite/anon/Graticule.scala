package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graticule extends StObject {
  
  var graticule: Boolean
}
object Graticule {
  
  @scala.inline
  def apply(graticule: Boolean): Graticule = {
    val __obj = js.Dynamic.literal(graticule = graticule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graticule]
  }
  
  @scala.inline
  implicit class GraticuleMutableBuilder[Self <: Graticule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraticule(value: Boolean): Self = StObject.set(x, "graticule", value.asInstanceOf[js.Any])
  }
}
