package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatcherLocationAsPath
  extends StObject
     with MatcherLocationRaw {
  
  var path: String
}
object MatcherLocationAsPath {
  
  inline def apply(path: String): MatcherLocationAsPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherLocationAsPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatcherLocationAsPath] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
