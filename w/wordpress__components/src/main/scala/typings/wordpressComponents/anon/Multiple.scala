package typings.wordpressComponents.anon

import typings.wordpressComponents.wordpressComponentsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multiple extends StObject {
  
  var multiple: `true`
}
object Multiple {
  
  @scala.inline
  def apply(): Multiple = {
    val __obj = js.Dynamic.literal(multiple = true)
    __obj.asInstanceOf[Multiple]
  }
  
  @scala.inline
  implicit class MultipleMutableBuilder[Self <: Multiple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiple(value: `true`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
  }
}
