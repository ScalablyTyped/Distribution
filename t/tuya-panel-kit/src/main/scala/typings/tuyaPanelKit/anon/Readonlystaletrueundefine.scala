package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.PartialRoute
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  stale :true | undefined,   routes :std.Array<tuya-panel-kit.tuya-panel-kit/@react-navigation/core.PartialRoute<tuya-panel-kit.tuya-panel-kit/@react-navigation/core.Route<string, object | undefined>>>}> */
trait Readonlystaletrueundefine extends StObject {
  
  val routes: js.Array[
    PartialRoute[
      typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route[String, js.UndefOr[js.Object]]
    ]
  ]
  
  val stale: js.UndefOr[`true`] = js.undefined
}
object Readonlystaletrueundefine {
  
  inline def apply(
    routes: js.Array[
      PartialRoute[
        typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route[String, js.UndefOr[js.Object]]
      ]
    ]
  ): Readonlystaletrueundefine = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlystaletrueundefine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlystaletrueundefine] (val x: Self) extends AnyVal {
    
    inline def setRoutes(
      value: js.Array[
          PartialRoute[
            typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route[String, js.UndefOr[js.Object]]
          ]
        ]
    ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(
      value: (PartialRoute[
          typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route[String, js.UndefOr[js.Object]]
        ])*
    ): Self = StObject.set(x, "routes", js.Array(value*))
    
    inline def setStale(value: `true`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
  }
}
