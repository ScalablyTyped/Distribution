package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait locale extends StObject {
  
  var pager: js.Any = js.native
}
object locale {
  
  @scala.inline
  def apply(pager: js.Any): locale = {
    val __obj = js.Dynamic.literal(pager = pager.asInstanceOf[js.Any])
    __obj.asInstanceOf[locale]
  }
  
  @scala.inline
  implicit class localeMutableBuilder[Self <: locale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPager(value: js.Any): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
  }
}
