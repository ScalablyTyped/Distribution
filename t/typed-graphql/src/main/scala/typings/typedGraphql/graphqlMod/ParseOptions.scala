package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// language/parser.js
trait ParseOptions extends StObject {
  
  var noLocation: js.UndefOr[Boolean] = js.undefined
  
  var noSource: js.UndefOr[Boolean] = js.undefined
}
object ParseOptions {
  
  inline def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
    inline def setNoLocation(value: Boolean): Self = StObject.set(x, "noLocation", value.asInstanceOf[js.Any])
    
    inline def setNoLocationUndefined: Self = StObject.set(x, "noLocation", js.undefined)
    
    inline def setNoSource(value: Boolean): Self = StObject.set(x, "noSource", value.asInstanceOf[js.Any])
    
    inline def setNoSourceUndefined: Self = StObject.set(x, "noSource", js.undefined)
  }
}
