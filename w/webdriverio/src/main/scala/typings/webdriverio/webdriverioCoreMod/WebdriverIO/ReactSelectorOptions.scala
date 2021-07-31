package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactSelectorOptions extends StObject {
  
  var props: js.UndefOr[js.Object] = js.undefined
  
  var state: js.UndefOr[js.Array[js.Any] | Double | String | js.Object | Boolean] = js.undefined
}
object ReactSelectorOptions {
  
  @scala.inline
  def apply(): ReactSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactSelectorOptions]
  }
  
  @scala.inline
  implicit class ReactSelectorOptionsMutableBuilder[Self <: ReactSelectorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: js.Object): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    @scala.inline
    def setState(value: js.Array[js.Any] | Double | String | js.Object | Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStateVarargs(value: js.Any*): Self = StObject.set(x, "state", js.Array(value :_*))
  }
}
