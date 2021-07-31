package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.RenameInfoSuccess
  - typings.typescript.mod.RenameInfoFailure
*/
trait RenameInfo extends StObject
object RenameInfo {
  
  @scala.inline
  def RenameInfoFailure(localizedErrorMessage: java.lang.String): typings.typescript.mod.RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = false, localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.RenameInfoFailure]
  }
  
  @scala.inline
  def RenameInfoSuccess(
    displayName: java.lang.String,
    fullDisplayName: java.lang.String,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    triggerSpan: TextSpan
  ): typings.typescript.mod.RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = true, displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.RenameInfoSuccess]
  }
}
