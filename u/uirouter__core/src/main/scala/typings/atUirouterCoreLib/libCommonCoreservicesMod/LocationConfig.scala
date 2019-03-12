package typings
package atUirouterCoreLib.libCommonCoreservicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationConfig
  extends atUirouterCoreLib.libInterfaceMod.Disposable {
  /** See: [[UrlConfig.baseHref]] */ @JSName("baseHref")
  var baseHref_Original: js.Function0[java.lang.String] = js.native
  /** See: [[UrlConfig.hashPrefix]] */ @JSName("hashPrefix")
  var hashPrefix_Original: js.Function1[/* newprefix */ js.UndefOr[java.lang.String], java.lang.String] = js.native
  /** See: [[UrlConfig.host]] */ @JSName("host")
  var host_Original: js.Function0[java.lang.String] = js.native
  /** See: [[UrlConfig.html5Mode]] */ @JSName("html5Mode")
  var html5Mode_Original: js.Function0[scala.Boolean] = js.native
  /** See: [[UrlConfig.port]] */ @JSName("port")
  var port_Original: js.Function0[scala.Double] = js.native
  /** See: [[UrlConfig.protocol]] */ @JSName("protocol")
  var protocol_Original: js.Function0[java.lang.String] = js.native
  /** See: [[UrlConfig.baseHref]] */ def baseHref(): java.lang.String = js.native
  /** See: [[UrlConfig.hashPrefix]] */ def hashPrefix(): java.lang.String = js.native
  def hashPrefix(newprefix: java.lang.String): java.lang.String = js.native
  /** See: [[UrlConfig.host]] */ def host(): java.lang.String = js.native
  /** See: [[UrlConfig.html5Mode]] */ def html5Mode(): scala.Boolean = js.native
  /** See: [[UrlConfig.port]] */ def port(): scala.Double = js.native
  /** See: [[UrlConfig.protocol]] */ def protocol(): java.lang.String = js.native
}

