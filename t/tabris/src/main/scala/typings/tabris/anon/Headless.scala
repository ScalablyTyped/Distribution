package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headless extends StObject {
  
  var headless: js.UndefOr[Boolean] = js.undefined
}
object Headless {
  
  inline def apply(): Headless = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headless]
  }
  
  extension [Self <: Headless](x: Self) {
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
  }
}
