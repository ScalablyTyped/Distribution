package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecMarkMod._Clip
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sphere
  extends StObject
     with _Clip {
  
  var sphere: String | SignalRef
}
object Sphere {
  
  inline def apply(sphere: String | SignalRef): Sphere = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sphere]
  }
  
  extension [Self <: Sphere](x: Self) {
    
    inline def setSphere(value: String | SignalRef): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
  }
}
