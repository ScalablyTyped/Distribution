package typings.vexflow.anon

import typings.vexflow.Vex.IFont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cache extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var font: js.UndefOr[IFont] = js.undefined
}
object Cache {
  
  @scala.inline
  def apply(): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cache]
  }
  
  @scala.inline
  implicit class CacheMutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setFont(value: IFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
