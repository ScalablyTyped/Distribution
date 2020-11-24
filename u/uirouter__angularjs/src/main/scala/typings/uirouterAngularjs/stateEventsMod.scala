package typings.uirouterAngularjs

import typings.angular.mod.IAngularEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs/lib/legacy/stateEvents", JSImport.Namespace)
@js.native
object stateEventsMod extends js.Object {
  
  @JSName("$stateChangeCancel")
  var stateChangeCancel: IAngularEvent = js.native
  
  @JSName("$stateChangeError")
  var stateChangeError: IAngularEvent = js.native
  
  @JSName("$stateChangeStart")
  var stateChangeStart: IAngularEvent = js.native
  
  @JSName("$stateChangeSuccess")
  var stateChangeSuccess: IAngularEvent = js.native
  
  @JSName("$stateNotFound")
  var stateNotFound: IAngularEvent = js.native
}
