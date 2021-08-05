package typings.uirouterAngularjs.mod

import typings.angular.mod.IRootScopeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object watchDigests {
  
  inline def apply($rootScope: IRootScopeService): Unit = ^.asInstanceOf[js.Dynamic].apply($rootScope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@uirouter/angularjs", "watchDigests")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/angularjs", "watchDigests.$inject")
  @js.native
  def inject: js.Array[String] = js.native
  
  inline def inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
}
