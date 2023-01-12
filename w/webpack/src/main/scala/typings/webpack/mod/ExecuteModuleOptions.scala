package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteModuleOptions extends StObject {
  
  var entryOptions: js.UndefOr[EntryOptions] = js.undefined
}
object ExecuteModuleOptions {
  
  inline def apply(): ExecuteModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteModuleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteModuleOptions] (val x: Self) extends AnyVal {
    
    inline def setEntryOptions(value: EntryOptions): Self = StObject.set(x, "entryOptions", value.asInstanceOf[js.Any])
    
    inline def setEntryOptionsUndefined: Self = StObject.set(x, "entryOptions", js.undefined)
  }
}
