package typings.vegaTypings.anon

import typings.vegaTypings.markMod._Clip
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sphere
  extends StObject
     with _Clip {
  
  var sphere: String | SignalRef
}
object Sphere {
  
  @scala.inline
  def apply(sphere: String | SignalRef): Sphere = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sphere]
  }
  
  @scala.inline
  implicit class SphereMutableBuilder[Self <: Sphere] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSphere(value: String | SignalRef): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
  }
}
