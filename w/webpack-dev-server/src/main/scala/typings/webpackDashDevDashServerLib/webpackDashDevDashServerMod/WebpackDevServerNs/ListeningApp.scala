package typings
package webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListeningApp extends js.Object {
  def address(): webpackDashDevDashServerLib.Anon_Port
}

object ListeningApp {
  @scala.inline
  def apply(address: js.Function0[webpackDashDevDashServerLib.Anon_Port]): ListeningApp = {
    val __obj = js.Dynamic.literal(address = address)
  
    __obj.asInstanceOf[ListeningApp]
  }
}

