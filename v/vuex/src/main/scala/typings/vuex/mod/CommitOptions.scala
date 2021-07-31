package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitOptions extends StObject {
  
  var root: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
}
object CommitOptions {
  
  @scala.inline
  def apply(): CommitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitOptions]
  }
  
  @scala.inline
  implicit class CommitOptionsMutableBuilder[Self <: CommitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
