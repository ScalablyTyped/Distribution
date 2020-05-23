package typings.uirouterCore.anon

import typings.uirouterCore.coreservicesMod.LocationConfig
import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.routerMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var configuration: LocationConfig
  var name: String
  var service: LocationServices
  def dispose(router: UIRouter): Unit
}

object Configuration {
  @scala.inline
  def apply(configuration: LocationConfig, dispose: UIRouter => Unit, name: String, service: LocationServices): Configuration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], dispose = js.Any.fromFunction1(dispose), name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

