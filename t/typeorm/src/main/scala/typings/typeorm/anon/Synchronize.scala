package typings.typeorm.anon

import typings.typeorm.typeormBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Synchronize extends StObject {
  
  var synchronize: `false`
}
object Synchronize {
  
  inline def apply(): Synchronize = {
    val __obj = js.Dynamic.literal(synchronize = false)
    __obj.asInstanceOf[Synchronize]
  }
  
  extension [Self <: Synchronize](x: Self) {
    
    inline def setSynchronize(value: `false`): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
  }
}
