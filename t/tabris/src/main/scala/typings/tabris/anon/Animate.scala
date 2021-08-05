package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animate extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
}
object Animate {
  
  inline def apply(): Animate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animate]
  }
  
  extension [Self <: Animate](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
  }
}
