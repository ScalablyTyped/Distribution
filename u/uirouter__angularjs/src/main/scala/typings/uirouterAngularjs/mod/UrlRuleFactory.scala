package typings.uirouterAngularjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "UrlRuleFactory")
@js.native
class UrlRuleFactory protected ()
  extends typings.uirouterCore.mod.UrlRuleFactory {
  def this(router: typings.uirouterCore.routerMod.UIRouter) = this()
}
/* static members */
object UrlRuleFactory {
  
  @JSImport("@uirouter/angularjs", "UrlRuleFactory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUrlRule(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlRule")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
