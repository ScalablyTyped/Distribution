package typings.vite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ssr extends StObject {
  
  var ssr: js.UndefOr[Boolean] = js.undefined
}
object Ssr {
  
  inline def apply(): Ssr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ssr]
  }
  
  extension [Self <: Ssr](x: Self) {
    
    inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
  }
}
