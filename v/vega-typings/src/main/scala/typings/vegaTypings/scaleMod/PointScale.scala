package typings.vegaTypings.scaleMod

import typings.vegaTypings.vegaTypingsStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointScale
  extends BaseBandScale
     with Scale {
  
  @JSName("type")
  var type_PointScale: point = js.native
}
object PointScale {
  
  @scala.inline
  def apply(name: String, `type`: point): PointScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointScale]
  }
  
  @scala.inline
  implicit class PointScaleMutableBuilder[Self <: PointScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
