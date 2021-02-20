package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.PartialRoute
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  stale :true | undefined,   routes :std.Array<tuya-panel-kit.tuya-panel-kit/@react-navigation/core.PartialRoute<tuya-panel-kit.tuya-panel-kit/@react-navigation/core.Route<string, object | undefined>>>}> */
@js.native
trait Readonlystaletrueundefine extends StObject {
  
  val routes: js.Array[
    PartialRoute[typings.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]]
  ] = js.native
  
  val stale: js.UndefOr[`true`] = js.native
}
object Readonlystaletrueundefine {
  
  @scala.inline
  def apply(
    routes: js.Array[
      PartialRoute[typings.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]]
    ]
  ): Readonlystaletrueundefine = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlystaletrueundefine]
  }
  
  @scala.inline
  implicit class ReadonlystaletrueundefineMutableBuilder[Self <: Readonlystaletrueundefine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoutes(
      value: js.Array[
          PartialRoute[typings.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]]
        ]
    ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: (PartialRoute[typings.tuyaPanelKit.routersTypesMod.Route[String, js.UndefOr[js.Object]]])*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setStale(value: `true`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
  }
}
