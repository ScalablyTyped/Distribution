package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headless extends StObject {
  
  var headless: js.UndefOr[Boolean] = js.undefined
}
object Headless {
  
  @scala.inline
  def apply(): Headless = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headless]
  }
  
  @scala.inline
  implicit class HeadlessMutableBuilder[Self <: Headless] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
  }
}
