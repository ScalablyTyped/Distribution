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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Headless] (val x: Self) extends AnyVal {
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
  }
}
