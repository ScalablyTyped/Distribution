package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MFar extends StObject {
  
  var mFar: IUniform[Any]
  
  var mNear: IUniform[Any]
}
object MFar {
  
  inline def apply(mFar: IUniform[Any], mNear: IUniform[Any]): MFar = {
    val __obj = js.Dynamic.literal(mFar = mFar.asInstanceOf[js.Any], mNear = mNear.asInstanceOf[js.Any])
    __obj.asInstanceOf[MFar]
  }
  
  extension [Self <: MFar](x: Self) {
    
    inline def setMFar(value: IUniform[Any]): Self = StObject.set(x, "mFar", value.asInstanceOf[js.Any])
    
    inline def setMNear(value: IUniform[Any]): Self = StObject.set(x, "mNear", value.asInstanceOf[js.Any])
  }
}
