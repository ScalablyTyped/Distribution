package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRegExpOptions extends StObject {
  
  var options: js.UndefOr[String] = js.native
  
  var regexp: String = js.native
}
object IRegExpOptions {
  
  @scala.inline
  def apply(regexp: String): IRegExpOptions = {
    val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegExpOptions]
  }
  
  @scala.inline
  implicit class IRegExpOptionsMutableBuilder[Self <: IRegExpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
  }
}
