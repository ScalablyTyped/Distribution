package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleOptions extends StObject {
  
  var preserveState: js.UndefOr[Boolean] = js.undefined
}
object ModuleOptions {
  
  @scala.inline
  def apply(): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleOptions]
  }
  
  @scala.inline
  implicit class ModuleOptionsMutableBuilder[Self <: ModuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreserveState(value: Boolean): Self = StObject.set(x, "preserveState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveStateUndefined: Self = StObject.set(x, "preserveState", js.undefined)
  }
}
