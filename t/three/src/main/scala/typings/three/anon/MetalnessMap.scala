package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetalnessMap extends StObject {
  
  var metalnessMap: IUniform
}
object MetalnessMap {
  
  @scala.inline
  def apply(metalnessMap: IUniform): MetalnessMap = {
    val __obj = js.Dynamic.literal(metalnessMap = metalnessMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetalnessMap]
  }
  
  @scala.inline
  implicit class MetalnessMapMutableBuilder[Self <: MetalnessMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetalnessMap(value: IUniform): Self = StObject.set(x, "metalnessMap", value.asInstanceOf[js.Any])
  }
}
