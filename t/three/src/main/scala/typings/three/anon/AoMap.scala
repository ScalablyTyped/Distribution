package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AoMap extends StObject {
  
  var aoMap: IUniform = js.native
  
  var aoMapIntensity: IUniform = js.native
}
object AoMap {
  
  @scala.inline
  def apply(aoMap: IUniform, aoMapIntensity: IUniform): AoMap = {
    val __obj = js.Dynamic.literal(aoMap = aoMap.asInstanceOf[js.Any], aoMapIntensity = aoMapIntensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AoMap]
  }
  
  @scala.inline
  implicit class AoMapMutableBuilder[Self <: AoMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAoMap(value: IUniform): Self = StObject.set(x, "aoMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAoMapIntensity(value: IUniform): Self = StObject.set(x, "aoMapIntensity", value.asInstanceOf[js.Any])
  }
}
