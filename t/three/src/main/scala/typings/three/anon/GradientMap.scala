package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradientMap extends StObject {
  
  var gradientMap: IUniform = js.native
}
object GradientMap {
  
  @scala.inline
  def apply(gradientMap: IUniform): GradientMap = {
    val __obj = js.Dynamic.literal(gradientMap = gradientMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientMap]
  }
  
  @scala.inline
  implicit class GradientMapMutableBuilder[Self <: GradientMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGradientMap(value: IUniform): Self = StObject.set(x, "gradientMap", value.asInstanceOf[js.Any])
  }
}
