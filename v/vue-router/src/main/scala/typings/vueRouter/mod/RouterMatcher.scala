package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterMatcher extends StObject {
  
  def addRoute(record: RouteRecordRaw): js.Function0[Unit] = js.native
  def addRoute(record: RouteRecordRaw, parent: RouteRecordMatcher): js.Function0[Unit] = js.native
  
  def getRecordMatcher(name: RouteRecordName): js.UndefOr[RouteRecordMatcher] = js.native
  
  def getRoutes(): js.Array[RouteRecordMatcher] = js.native
  
  def removeRoute(matcher: RouteRecordMatcher): Unit = js.native
  def removeRoute(name: RouteRecordName): Unit = js.native
  
  /**
    * Resolves a location. Gives access to the route record that corresponds to the actual path as well as filling the corresponding params objects
    *
    * @param location - MatcherLocationRaw to resolve to a url
    * @param currentLocation - MatcherLocation of the current location
    */
  def resolve(location: MatcherLocationRaw, currentLocation: MatcherLocation): MatcherLocation = js.native
}
