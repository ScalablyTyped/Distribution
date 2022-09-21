package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationGuardNext extends StObject {
  
  def apply(): Unit = js.native
  def apply(cb: NavigationGuardNextCallback): Unit = js.native
  def apply(error: js.Error): Unit = js.native
  def apply(location: RouteLocationRaw): Unit = js.native
  def apply(valid: Boolean): Unit = js.native
}
