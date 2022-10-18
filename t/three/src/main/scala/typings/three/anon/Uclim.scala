package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uclim extends StObject {
  
  var u_clim: IUniform[Any]
  
  var u_cmdata: IUniform[Any]
  
  var u_data: IUniform[Any]
  
  var u_renderstyle: IUniform[Any]
  
  var u_renderthreshold: IUniform[Any]
  
  var u_size: IUniform[Any]
}
object Uclim {
  
  inline def apply(
    u_clim: IUniform[Any],
    u_cmdata: IUniform[Any],
    u_data: IUniform[Any],
    u_renderstyle: IUniform[Any],
    u_renderthreshold: IUniform[Any],
    u_size: IUniform[Any]
  ): Uclim = {
    val __obj = js.Dynamic.literal(u_clim = u_clim.asInstanceOf[js.Any], u_cmdata = u_cmdata.asInstanceOf[js.Any], u_data = u_data.asInstanceOf[js.Any], u_renderstyle = u_renderstyle.asInstanceOf[js.Any], u_renderthreshold = u_renderthreshold.asInstanceOf[js.Any], u_size = u_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uclim]
  }
  
  extension [Self <: Uclim](x: Self) {
    
    inline def setU_clim(value: IUniform[Any]): Self = StObject.set(x, "u_clim", value.asInstanceOf[js.Any])
    
    inline def setU_cmdata(value: IUniform[Any]): Self = StObject.set(x, "u_cmdata", value.asInstanceOf[js.Any])
    
    inline def setU_data(value: IUniform[Any]): Self = StObject.set(x, "u_data", value.asInstanceOf[js.Any])
    
    inline def setU_renderstyle(value: IUniform[Any]): Self = StObject.set(x, "u_renderstyle", value.asInstanceOf[js.Any])
    
    inline def setU_renderthreshold(value: IUniform[Any]): Self = StObject.set(x, "u_renderthreshold", value.asInstanceOf[js.Any])
    
    inline def setU_size(value: IUniform[Any]): Self = StObject.set(x, "u_size", value.asInstanceOf[js.Any])
  }
}
