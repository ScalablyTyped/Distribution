package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseFileSystemEntriesFileOptions extends StObject {
  
  var accepts: js.UndefOr[js.Array[ChooseFileSystemEntriesOptionsAccepts]] = js.native
  
  var excludeAcceptAllOption: js.UndefOr[Boolean] = js.native
}
object ChooseFileSystemEntriesFileOptions {
  
  @scala.inline
  def apply(): ChooseFileSystemEntriesFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseFileSystemEntriesFileOptions]
  }
  
  @scala.inline
  implicit class ChooseFileSystemEntriesFileOptionsMutableBuilder[Self <: ChooseFileSystemEntriesFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepts(value: js.Array[ChooseFileSystemEntriesOptionsAccepts]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
    
    @scala.inline
    def setAcceptsVarargs(value: ChooseFileSystemEntriesOptionsAccepts*): Self = StObject.set(x, "accepts", js.Array(value :_*))
    
    @scala.inline
    def setExcludeAcceptAllOption(value: Boolean): Self = StObject.set(x, "excludeAcceptAllOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeAcceptAllOptionUndefined: Self = StObject.set(x, "excludeAcceptAllOption", js.undefined)
  }
}
