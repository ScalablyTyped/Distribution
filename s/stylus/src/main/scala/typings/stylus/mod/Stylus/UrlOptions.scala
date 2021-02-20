package typings.stylus.mod.Stylus

import typings.stylus.stylusBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlOptions extends StObject {
  
  var limit: js.UndefOr[Double | `false` | Null] = js.native
  
  var paths: js.UndefOr[js.Array[String]] = js.native
}
object UrlOptions {
  
  @scala.inline
  def apply(): UrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlOptions]
  }
  
  @scala.inline
  implicit class UrlOptionsMutableBuilder[Self <: UrlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double | `false`): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitNull: Self = StObject.set(x, "limit", null)
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
  }
}
