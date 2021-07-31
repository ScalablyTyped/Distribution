package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expanded extends StObject {
  
  var expanded: js.UndefOr[Boolean] = js.undefined
}
object Expanded {
  
  @scala.inline
  def apply(): Expanded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expanded]
  }
  
  @scala.inline
  implicit class ExpandedMutableBuilder[Self <: Expanded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
  }
}
