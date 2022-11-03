package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceEditMetadata extends StObject {
  
  /**
    * Signal to the editor that this edit is a refactoring.
    */
  var isRefactoring: js.UndefOr[Boolean] = js.undefined
}
object WorkspaceEditMetadata {
  
  inline def apply(): WorkspaceEditMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceEditMetadata]
  }
  
  extension [Self <: WorkspaceEditMetadata](x: Self) {
    
    inline def setIsRefactoring(value: Boolean): Self = StObject.set(x, "isRefactoring", value.asInstanceOf[js.Any])
    
    inline def setIsRefactoringUndefined: Self = StObject.set(x, "isRefactoring", js.undefined)
  }
}
