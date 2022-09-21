package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
trait MatcherLocationAsRelative
  extends StObject
     with MatcherLocationRaw {
  
  var params: js.UndefOr[RouteParams] = js.undefined
}
object MatcherLocationAsRelative {
  
  inline def apply(): MatcherLocationAsRelative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherLocationAsRelative]
  }
  
  extension [Self <: MatcherLocationAsRelative](x: Self) {
    
    inline def setParams(value: RouteParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
