package typings
package winstonDashMailLib.winstonDashMailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MailTransportOptions extends js.Object {
  var authentication: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filter: js.UndefOr[js.Function1[/* obj */ winstonDashMailLib.Anon_Level, scala.Boolean]] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* obj */ winstonDashMailLib.Anon_Level, java.lang.String]] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var handleExceptions: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var ssl: js.UndefOr[scala.Boolean | winstonDashMailLib.Anon_Ca] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var tls: js.UndefOr[scala.Boolean | winstonDashMailLib.Anon_Ciphers] = js.undefined
  var to: java.lang.String
  var unique: js.UndefOr[scala.Boolean] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

