package typings.uirouterAngularjs.mod.core

import typings.uirouterCore.coreservicesMod.LocationConfig
import typings.uirouterCore.coreservicesMod.LocationServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "core.UIRouter")
@js.native
/**
  * Creates a new `UIRouter` object
  *
  * @param locationService a [[LocationServices]] implementation
  * @param locationConfig a [[LocationConfig]] implementation
  * @internal
  */
class UIRouter ()
  extends typings.uirouterCore.mod.UIRouter {
  def this(locationService: LocationServices) = this()
  def this(locationService: js.UndefOr[scala.Nothing], locationConfig: LocationConfig) = this()
  def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
}
