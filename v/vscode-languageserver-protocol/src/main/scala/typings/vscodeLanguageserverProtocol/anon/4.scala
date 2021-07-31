package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var workspaceFolders: js.UndefOr[ChangeNotifications] = js.undefined
}
object `4` {
  
  @scala.inline
  def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkspaceFolders(value: ChangeNotifications): Self = StObject.set(x, "workspaceFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceFoldersUndefined: Self = StObject.set(x, "workspaceFolders", js.undefined)
  }
}
