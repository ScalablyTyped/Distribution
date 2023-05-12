package typings.three.anon

import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BumpMap extends StObject {
  
  var bumpMap: IUniform[Any]
  
  var bumpMapTransform: IUniform[Matrix3]
  
  var bumpScale: IUniform[Double]
}
object BumpMap {
  
  inline def apply(bumpMap: IUniform[Any], bumpMapTransform: IUniform[Matrix3], bumpScale: IUniform[Double]): BumpMap = {
    val __obj = js.Dynamic.literal(bumpMap = bumpMap.asInstanceOf[js.Any], bumpMapTransform = bumpMapTransform.asInstanceOf[js.Any], bumpScale = bumpScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BumpMap] (val x: Self) extends AnyVal {
    
    inline def setBumpMap(value: IUniform[Any]): Self = StObject.set(x, "bumpMap", value.asInstanceOf[js.Any])
    
    inline def setBumpMapTransform(value: IUniform[Matrix3]): Self = StObject.set(x, "bumpMapTransform", value.asInstanceOf[js.Any])
    
    inline def setBumpScale(value: IUniform[Double]): Self = StObject.set(x, "bumpScale", value.asInstanceOf[js.Any])
  }
}
