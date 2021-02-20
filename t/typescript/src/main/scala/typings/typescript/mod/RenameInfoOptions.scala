package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameInfoOptions extends StObject {
  
  val allowRenameOfImportPath: js.UndefOr[Boolean] = js.native
}
object RenameInfoOptions {
  
  @scala.inline
  def apply(): RenameInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameInfoOptions]
  }
  
  @scala.inline
  implicit class RenameInfoOptionsMutableBuilder[Self <: RenameInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowRenameOfImportPath(value: Boolean): Self = StObject.set(x, "allowRenameOfImportPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRenameOfImportPathUndefined: Self = StObject.set(x, "allowRenameOfImportPath", js.undefined)
  }
}
