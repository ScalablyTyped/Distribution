package typings.vueRouter.anon

import typings.std.MouseEvent
import typings.vueReactivity.mod.ComputedRef
import typings.vueRouter.mod.NavigationFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsExactActive extends StObject {
  
  var href: ComputedRef[String] = js.native
  
  var isActive: ComputedRef[Boolean] = js.native
  
  var isExactActive: ComputedRef[Boolean] = js.native
  
  def navigate(): js.Promise[Unit | NavigationFailure] = js.native
  def navigate(e: MouseEvent): js.Promise[Unit | NavigationFailure] = js.native
  
  var route: ComputedRef[RouteLocationhrefstring] = js.native
}
