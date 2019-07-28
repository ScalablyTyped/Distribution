package typings.atUirouterCore.atUirouterCoreMod

import typings.atUirouterCore.libCommonCoreservicesMod.LocationConfig
import typings.atUirouterCore.libCommonCoreservicesMod.LocationServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "UIRouter")
@js.native
/**
  * Creates a new `UIRouter` object
  *
  * @param locationService a [[LocationServices]] implementation
  * @param locationConfig a [[LocationConfig]] implementation
  * @internalapi
  */
class UIRouter ()
  extends typings.atUirouterCore.libRouterMod.UIRouter {
  def this(locationService: LocationServices) = this()
  def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
}

