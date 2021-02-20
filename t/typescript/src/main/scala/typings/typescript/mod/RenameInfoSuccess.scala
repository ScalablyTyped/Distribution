package typings.typescript.mod

import typings.typescript.typescriptBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameInfoSuccess extends RenameInfo {
  
  var canRename: `true` = js.native
  
  var displayName: java.lang.String = js.native
  
  /**
    * File or directory to rename.
    * If set, `getEditsForFileRename` should be called instead of `findRenameLocations`.
    */
  var fileToRename: js.UndefOr[java.lang.String] = js.native
  
  var fullDisplayName: java.lang.String = js.native
  
  var kind: ScriptElementKind = js.native
  
  var kindModifiers: java.lang.String = js.native
  
  var triggerSpan: TextSpan = js.native
}
object RenameInfoSuccess {
  
  @scala.inline
  def apply(
    canRename: `true`,
    displayName: java.lang.String,
    fullDisplayName: java.lang.String,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    triggerSpan: TextSpan
  ): RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfoSuccess]
  }
  
  @scala.inline
  implicit class RenameInfoSuccessMutableBuilder[Self <: RenameInfoSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanRename(value: `true`): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: java.lang.String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileToRename(value: java.lang.String): Self = StObject.set(x, "fileToRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileToRenameUndefined: Self = StObject.set(x, "fileToRename", js.undefined)
    
    @scala.inline
    def setFullDisplayName(value: java.lang.String): Self = StObject.set(x, "fullDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerSpan(value: TextSpan): Self = StObject.set(x, "triggerSpan", value.asInstanceOf[js.Any])
  }
}
