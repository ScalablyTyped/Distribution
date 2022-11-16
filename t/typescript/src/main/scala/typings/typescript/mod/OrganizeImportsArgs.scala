package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizeImportsArgs
  extends StObject
     with CombinedCodeFixScope {
  
  var mode: js.UndefOr[OrganizeImportsMode] = js.undefined
  
  /** @deprecated Use `mode` instead */
  var skipDestructiveCodeActions: js.UndefOr[Boolean] = js.undefined
}
object OrganizeImportsArgs {
  
  inline def apply(fileName: java.lang.String): OrganizeImportsArgs = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("file")
    __obj.asInstanceOf[OrganizeImportsArgs]
  }
  
  extension [Self <: OrganizeImportsArgs](x: Self) {
    
    inline def setMode(value: OrganizeImportsMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSkipDestructiveCodeActions(value: Boolean): Self = StObject.set(x, "skipDestructiveCodeActions", value.asInstanceOf[js.Any])
    
    inline def setSkipDestructiveCodeActionsUndefined: Self = StObject.set(x, "skipDestructiveCodeActions", js.undefined)
  }
}
