package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConfigure extends StObject {
  
  // please note, filter could be also a function. This case is not represented here
  var container: js.UndefOr[js.Any] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[String | js.Array[String] | Boolean] = js.native
  
  var showButton: js.UndefOr[Boolean] = js.native
}
object NetworkConfigure {
  
  @scala.inline
  def apply(): NetworkConfigure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfigure]
  }
  
  @scala.inline
  implicit class NetworkConfigureMutableBuilder[Self <: NetworkConfigure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFilter(value: String | js.Array[String] | Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def setShowButton(value: Boolean): Self = StObject.set(x, "showButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowButtonUndefined: Self = StObject.set(x, "showButton", js.undefined)
  }
}
