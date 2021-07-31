package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SvgInfo extends StObject {
  
  var path: js.UndefOr[String] = js.undefined
}
object SvgInfo {
  
  @scala.inline
  def apply(): SvgInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgInfo]
  }
  
  @scala.inline
  implicit class SvgInfoMutableBuilder[Self <: SvgInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
