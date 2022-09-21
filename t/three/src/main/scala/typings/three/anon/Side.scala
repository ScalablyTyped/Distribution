package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Side extends StObject {
  
  var side: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object Side {
  
  inline def apply(side: IUniform[Any], tDiffuse: IUniform[Any]): Side = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Side]
  }
  
  extension [Self <: Side](x: Self) {
    
    inline def setSide(value: IUniform[Any]): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
