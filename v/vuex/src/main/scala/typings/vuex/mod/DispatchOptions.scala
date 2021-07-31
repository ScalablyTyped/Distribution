package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatchOptions extends StObject {
  
  var root: js.UndefOr[Boolean] = js.undefined
}
object DispatchOptions {
  
  @scala.inline
  def apply(): DispatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatchOptions]
  }
  
  @scala.inline
  implicit class DispatchOptionsMutableBuilder[Self <: DispatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
