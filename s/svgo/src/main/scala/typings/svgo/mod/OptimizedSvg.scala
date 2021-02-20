package typings.svgo.mod

import typings.svgo.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimizedSvg extends StObject {
  
  var data: String = js.native
  
  var info: Height = js.native
  
  var path: js.UndefOr[String] = js.native
}
object OptimizedSvg {
  
  @scala.inline
  def apply(data: String, info: Height): OptimizedSvg = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizedSvg]
  }
  
  @scala.inline
  implicit class OptimizedSvgMutableBuilder[Self <: OptimizedSvg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: Height): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
