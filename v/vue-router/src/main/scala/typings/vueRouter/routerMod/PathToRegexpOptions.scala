package typings.vueRouter.routerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathToRegexpOptions extends StObject {
  
  var end: js.UndefOr[Boolean] = js.undefined
  
  var sensitive: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object PathToRegexpOptions {
  
  @scala.inline
  def apply(): PathToRegexpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathToRegexpOptions]
  }
  
  @scala.inline
  implicit class PathToRegexpOptionsMutableBuilder[Self <: PathToRegexpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
