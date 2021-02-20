package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// language/parser.js
@js.native
trait ParseOptions extends StObject {
  
  var noLocation: js.UndefOr[Boolean] = js.native
  
  var noSource: js.UndefOr[Boolean] = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoLocation(value: Boolean): Self = StObject.set(x, "noLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLocationUndefined: Self = StObject.set(x, "noLocation", js.undefined)
    
    @scala.inline
    def setNoSource(value: Boolean): Self = StObject.set(x, "noSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSourceUndefined: Self = StObject.set(x, "noSource", js.undefined)
  }
}
