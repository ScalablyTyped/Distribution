package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
trait MatcherLocationAsName
  extends StObject
     with MatcherLocationRaw {
  
  var name: RouteRecordName
  
  var params: js.UndefOr[RouteParams] = js.undefined
}
object MatcherLocationAsName {
  
  inline def apply(name: RouteRecordName): MatcherLocationAsName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherLocationAsName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatcherLocationAsName] (val x: Self) extends AnyVal {
    
    inline def setName(value: RouteRecordName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(value: RouteParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
