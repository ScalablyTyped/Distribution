package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V extends StObject {
  
  var tDiffuse: IUniform[Any]
  
  var v: IUniform[Any]
}
object V {
  
  inline def apply(tDiffuse: IUniform[Any], v: IUniform[Any]): V = {
    val __obj = js.Dynamic.literal(tDiffuse = tDiffuse.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[V]
  }
  
  extension [Self <: V](x: Self) {
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setV(value: IUniform[Any]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
