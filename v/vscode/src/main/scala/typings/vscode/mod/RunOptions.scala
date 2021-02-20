package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunOptions extends StObject {
  
  /**
    * Controls whether task variables are re-evaluated on rerun.
    */
  var reevaluateOnRerun: js.UndefOr[Boolean] = js.native
}
object RunOptions {
  
  @scala.inline
  def apply(): RunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions]
  }
  
  @scala.inline
  implicit class RunOptionsMutableBuilder[Self <: RunOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReevaluateOnRerun(value: Boolean): Self = StObject.set(x, "reevaluateOnRerun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReevaluateOnRerunUndefined: Self = StObject.set(x, "reevaluateOnRerun", js.undefined)
  }
}
