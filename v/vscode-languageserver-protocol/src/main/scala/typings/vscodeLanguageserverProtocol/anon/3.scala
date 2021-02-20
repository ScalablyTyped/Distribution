package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends StObject {
  
  /**
    * Whether client supports handling progress notifications. If set servers are allowed to
    * report in `workDoneProgress` property in the request specific server capabilities.
    *
    * Since 3.15.0
    */
  var workDoneProgress: js.UndefOr[Boolean] = js.native
}
object `3` {
  
  @scala.inline
  def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkDoneProgress(value: Boolean): Self = StObject.set(x, "workDoneProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkDoneProgressUndefined: Self = StObject.set(x, "workDoneProgress", js.undefined)
  }
}
