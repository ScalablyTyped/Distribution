package typings.typescript.mod

import typings.typescript.typescriptBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameInfoSuccess
  extends StObject
     with RenameInfo {
  
  var canRename: `true`
  
  var displayName: java.lang.String
  
  /**
    * File or directory to rename.
    * If set, `getEditsForFileRename` should be called instead of `findRenameLocations`.
    */
  var fileToRename: js.UndefOr[java.lang.String] = js.undefined
  
  var fullDisplayName: java.lang.String
  
  var kind: ScriptElementKind
  
  var kindModifiers: java.lang.String
  
  var triggerSpan: TextSpan
}
object RenameInfoSuccess {
  
  @scala.inline
  def apply(
    displayName: java.lang.String,
    fullDisplayName: java.lang.String,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    triggerSpan: TextSpan
  ): RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = true, displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
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
