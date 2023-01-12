package typings.vite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixStacktrace extends StObject {
  
  var fixStacktrace: js.UndefOr[Boolean] = js.undefined
}
object FixStacktrace {
  
  inline def apply(): FixStacktrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixStacktrace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FixStacktrace] (val x: Self) extends AnyVal {
    
    inline def setFixStacktrace(value: Boolean): Self = StObject.set(x, "fixStacktrace", value.asInstanceOf[js.Any])
    
    inline def setFixStacktraceUndefined: Self = StObject.set(x, "fixStacktrace", js.undefined)
  }
}
