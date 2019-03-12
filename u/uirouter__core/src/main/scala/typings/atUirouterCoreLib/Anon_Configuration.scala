package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configuration extends js.Object {
  var configuration: atUirouterCoreLib.libCommonCoreservicesMod.LocationConfig
  var name: java.lang.String
  var service: atUirouterCoreLib.libCommonCoreservicesMod.LocationServices
  def dispose(router: atUirouterCoreLib.libRouterMod.UIRouter): scala.Unit
}

object Anon_Configuration {
  @scala.inline
  def apply(
    configuration: atUirouterCoreLib.libCommonCoreservicesMod.LocationConfig,
    dispose: atUirouterCoreLib.libRouterMod.UIRouter => scala.Unit,
    name: java.lang.String,
    service: atUirouterCoreLib.libCommonCoreservicesMod.LocationServices
  ): Anon_Configuration = {
    val __obj = js.Dynamic.literal(configuration = configuration, dispose = js.Any.fromFunction1(dispose), name = name, service = service)
  
    __obj.asInstanceOf[Anon_Configuration]
  }
}

