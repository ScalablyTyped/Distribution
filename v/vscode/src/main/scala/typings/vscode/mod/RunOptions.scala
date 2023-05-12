package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunOptions extends StObject {
  
  /**
  		 * Controls whether task variables are re-evaluated on rerun.
  		 */
  var reevaluateOnRerun: js.UndefOr[Boolean] = js.undefined
}
object RunOptions {
  
  inline def apply(): RunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunOptions] (val x: Self) extends AnyVal {
    
    inline def setReevaluateOnRerun(value: Boolean): Self = StObject.set(x, "reevaluateOnRerun", value.asInstanceOf[js.Any])
    
    inline def setReevaluateOnRerunUndefined: Self = StObject.set(x, "reevaluateOnRerun", js.undefined)
  }
}
