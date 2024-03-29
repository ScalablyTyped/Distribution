package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkipNulls extends StObject {
  
  var skipNulls: js.UndefOr[Boolean] = js.undefined
}
object SkipNulls {
  
  inline def apply(): SkipNulls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipNulls]
  }
  
  extension [Self <: SkipNulls](x: Self) {
    
    inline def setSkipNulls(value: Boolean): Self = StObject.set(x, "skipNulls", value.asInstanceOf[js.Any])
    
    inline def setSkipNullsUndefined: Self = StObject.set(x, "skipNulls", js.undefined)
  }
}
