package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Use `UserPreferences` instead.
  */
trait RenameInfoOptions extends StObject {
  
  val allowRenameOfImportPath: js.UndefOr[Boolean] = js.undefined
}
object RenameInfoOptions {
  
  inline def apply(): RenameInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameInfoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenameInfoOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowRenameOfImportPath(value: Boolean): Self = StObject.set(x, "allowRenameOfImportPath", value.asInstanceOf[js.Any])
    
    inline def setAllowRenameOfImportPathUndefined: Self = StObject.set(x, "allowRenameOfImportPath", js.undefined)
  }
}
