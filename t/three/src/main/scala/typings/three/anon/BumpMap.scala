package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BumpMap extends StObject {
  
  var bumpMap: IUniform
  
  var bumpScale: IUniform
}
object BumpMap {
  
  inline def apply(bumpMap: IUniform, bumpScale: IUniform): BumpMap = {
    val __obj = js.Dynamic.literal(bumpMap = bumpMap.asInstanceOf[js.Any], bumpScale = bumpScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpMap]
  }
  
  extension [Self <: BumpMap](x: Self) {
    
    inline def setBumpMap(value: IUniform): Self = StObject.set(x, "bumpMap", value.asInstanceOf[js.Any])
    
    inline def setBumpScale(value: IUniform): Self = StObject.set(x, "bumpScale", value.asInstanceOf[js.Any])
  }
}
