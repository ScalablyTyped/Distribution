package typings.uirouterCore.anon

import typings.uirouterCore.coreservicesMod.LocationConfig
import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.routerMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var configuration: LocationConfig = js.native
  var name: String = js.native
  var service: LocationServices = js.native
  def dispose(router: UIRouter): Unit = js.native
}

object Configuration {
  @scala.inline
  def apply(configuration: LocationConfig, dispose: UIRouter => Unit, name: String, service: LocationServices): Configuration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], dispose = js.Any.fromFunction1(dispose), name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfiguration(value: LocationConfig): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispose(value: UIRouter => Unit): Self = this.set("dispose", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: LocationServices): Self = this.set("service", value.asInstanceOf[js.Any])
  }
  
}

