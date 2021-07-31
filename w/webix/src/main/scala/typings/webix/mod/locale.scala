package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait locale extends StObject {
  
  var pager: js.Any
}
object locale {
  
  @JSImport("webix", "locale")
  @js.native
  val ^ : typings.webix.webix.locale = js.native
  
  @scala.inline
  implicit class localeMutableBuilder[Self <: locale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPager(value: js.Any): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
  }
}
