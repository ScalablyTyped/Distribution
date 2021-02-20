package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewContextEventMap extends ProxyEventMap {
  
  var peek: PreviewContextPeekEvent = js.native
  
  var pop: PreviewContextPopEvent = js.native
}
object PreviewContextEventMap {
  
  @scala.inline
  def apply(peek: PreviewContextPeekEvent, pop: PreviewContextPopEvent): PreviewContextEventMap = {
    val __obj = js.Dynamic.literal(peek = peek.asInstanceOf[js.Any], pop = pop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewContextEventMap]
  }
  
  @scala.inline
  implicit class PreviewContextEventMapMutableBuilder[Self <: PreviewContextEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeek(value: PreviewContextPeekEvent): Self = StObject.set(x, "peek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPop(value: PreviewContextPopEvent): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
  }
}
