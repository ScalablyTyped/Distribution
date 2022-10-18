package typings.victoryCore.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRequireable extends StObject {
  
  var x: Requireable[js.UndefOr[Double]]
  
  var y: Requireable[js.UndefOr[Double]]
}
object XRequireable {
  
  inline def apply(x: Requireable[js.UndefOr[Double]], y: Requireable[js.UndefOr[Double]]): XRequireable = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRequireable]
  }
  
  extension [Self <: XRequireable](x: Self) {
    
    inline def setX(value: Requireable[js.UndefOr[Double]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Requireable[js.UndefOr[Double]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
