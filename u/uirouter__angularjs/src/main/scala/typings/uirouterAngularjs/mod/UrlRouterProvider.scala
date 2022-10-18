package typings.uirouterAngularjs.mod

import typings.uirouterCore.libCommonCommonMod.IInjectable
import typings.uirouterCore.libUrlInterfaceMod.UrlRuleHandlerFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "UrlRouterProvider")
@js.native
open class UrlRouterProvider protected ()
  extends typings.uirouterAngularjs.libUrlRouterProviderMod.UrlRouterProvider {
  /** @hidden */
  def this(/** @hidden */ router: typings.uirouterCore.mod.UIRouter) = this()
}
/* static members */
object UrlRouterProvider {
  
  @JSImport("@uirouter/angularjs", "UrlRouterProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def injectableHandler(router: typings.uirouterCore.mod.UIRouter, handler: IInjectable): UrlRuleHandlerFn = (^.asInstanceOf[js.Dynamic].applyDynamic("injectableHandler")(router.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[UrlRuleHandlerFn]
}
