package typings.atUirouterCore.libCommonCoreservicesMod

import typings.atUirouterCore.libInterfaceMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationConfig extends Disposable {
  /** See: [[UrlConfig.baseHref]] */ @JSName("baseHref")
  var baseHref_Original: js.Function0[String] = js.native
  /** See: [[UrlConfig.hashPrefix]] */ @JSName("hashPrefix")
  var hashPrefix_Original: js.Function1[/* newprefix */ js.UndefOr[String], String] = js.native
  /** See: [[UrlConfig.host]] */ @JSName("host")
  var host_Original: js.Function0[String] = js.native
  /** See: [[UrlConfig.html5Mode]] */ @JSName("html5Mode")
  var html5Mode_Original: js.Function0[Boolean] = js.native
  /** See: [[UrlConfig.port]] */ @JSName("port")
  var port_Original: js.Function0[Double] = js.native
  /** See: [[UrlConfig.protocol]] */ @JSName("protocol")
  var protocol_Original: js.Function0[String] = js.native
  /** See: [[UrlConfig.baseHref]] */ def baseHref(): String = js.native
  /** See: [[UrlConfig.hashPrefix]] */ def hashPrefix(): String = js.native
  def hashPrefix(newprefix: String): String = js.native
  /** See: [[UrlConfig.host]] */ def host(): String = js.native
  /** See: [[UrlConfig.html5Mode]] */ def html5Mode(): Boolean = js.native
  /** See: [[UrlConfig.port]] */ def port(): Double = js.native
  /** See: [[UrlConfig.protocol]] */ def protocol(): String = js.native
}

