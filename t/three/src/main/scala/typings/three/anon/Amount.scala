package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amount extends StObject {
  
  var amount: IUniform[Any]
  
  var angle: IUniform[Any]
  
  var byp: IUniform[Any]
  
  var col_s: IUniform[Any]
  
  var distortion_x: IUniform[Any]
  
  var distortion_y: IUniform[Any]
  
  var seed: IUniform[Any]
  
  var seed_x: IUniform[Any]
  
  var seed_y: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
  
  var tDisp: IUniform[Any]
}
object Amount {
  
  inline def apply(
    amount: IUniform[Any],
    angle: IUniform[Any],
    byp: IUniform[Any],
    col_s: IUniform[Any],
    distortion_x: IUniform[Any],
    distortion_y: IUniform[Any],
    seed: IUniform[Any],
    seed_x: IUniform[Any],
    seed_y: IUniform[Any],
    tDiffuse: IUniform[Any],
    tDisp: IUniform[Any]
  ): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], byp = byp.asInstanceOf[js.Any], col_s = col_s.asInstanceOf[js.Any], distortion_x = distortion_x.asInstanceOf[js.Any], distortion_y = distortion_y.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], seed_x = seed_x.asInstanceOf[js.Any], seed_y = seed_y.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any], tDisp = tDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  
  extension [Self <: Amount](x: Self) {
    
    inline def setAmount(value: IUniform[Any]): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAngle(value: IUniform[Any]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setByp(value: IUniform[Any]): Self = StObject.set(x, "byp", value.asInstanceOf[js.Any])
    
    inline def setCol_s(value: IUniform[Any]): Self = StObject.set(x, "col_s", value.asInstanceOf[js.Any])
    
    inline def setDistortion_x(value: IUniform[Any]): Self = StObject.set(x, "distortion_x", value.asInstanceOf[js.Any])
    
    inline def setDistortion_y(value: IUniform[Any]): Self = StObject.set(x, "distortion_y", value.asInstanceOf[js.Any])
    
    inline def setSeed(value: IUniform[Any]): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeed_x(value: IUniform[Any]): Self = StObject.set(x, "seed_x", value.asInstanceOf[js.Any])
    
    inline def setSeed_y(value: IUniform[Any]): Self = StObject.set(x, "seed_y", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setTDisp(value: IUniform[Any]): Self = StObject.set(x, "tDisp", value.asInstanceOf[js.Any])
  }
}
