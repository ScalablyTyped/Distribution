package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Route location that can be passed to the matcher.
  */
/* Rewritten from type alias, can be one of: 
  - typings.vueRouter.mod.MatcherLocationAsPath
  - typings.vueRouter.mod.MatcherLocationAsName
  - typings.vueRouter.mod.MatcherLocationAsRelative
*/
trait MatcherLocationRaw extends StObject
object MatcherLocationRaw {
  
  inline def MatcherLocationAsName(name: RouteRecordName): typings.vueRouter.mod.MatcherLocationAsName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueRouter.mod.MatcherLocationAsName]
  }
  
  inline def MatcherLocationAsPath(path: String): typings.vueRouter.mod.MatcherLocationAsPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueRouter.mod.MatcherLocationAsPath]
  }
  
  inline def MatcherLocationAsRelative(): typings.vueRouter.mod.MatcherLocationAsRelative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.vueRouter.mod.MatcherLocationAsRelative]
  }
}
