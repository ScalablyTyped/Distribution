package typings.uirouterCore.mod

import typings.uirouterCore.coreservicesMod.LocationConfig
import typings.uirouterCore.coreservicesMod.LocationServices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core", "UIRouter")
@js.native
/**
  * Creates a new `UIRouter` object
  *
  * @param locationService a [[LocationServices]] implementation
  * @param locationConfig a [[LocationConfig]] implementation
  * @internal
  */
open class UIRouter ()
  extends typings.uirouterCore.routerMod.UIRouter {
  def this(locationService: LocationServices) = this()
  def this(locationService: Unit, locationConfig: LocationConfig) = this()
  def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
}
