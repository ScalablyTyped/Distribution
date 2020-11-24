package typings.urlToolkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait URLParts extends js.Object {
  
  var fragment: String = js.native
  
  var netLoc: String = js.native
  
  var params: String = js.native
  
  var path: String = js.native
  
  var query: String = js.native
  
  var scheme: String = js.native
}
object URLParts {
  
  @scala.inline
  def apply(fragment: String, netLoc: String, params: String, path: String, query: String, scheme: String): URLParts = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], netLoc = netLoc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLParts]
  }
  
  @scala.inline
  implicit class URLPartsOps[Self <: URLParts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetLoc(value: String): Self = this.set("netLoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: String): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
  }
}
