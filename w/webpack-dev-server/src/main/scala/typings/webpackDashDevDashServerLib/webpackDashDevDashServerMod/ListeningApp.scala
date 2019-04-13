package typings
package webpackDashDevDashServerLib.webpackDashDevDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListeningApp extends js.Object {
  def address(): webpackDashDevDashServerLib.Anon_Port
}

object ListeningApp {
  @scala.inline
  def apply(address: () => webpackDashDevDashServerLib.Anon_Port): ListeningApp = {
    val __obj = js.Dynamic.literal(address = js.Any.fromFunction0(address))
  
    __obj.asInstanceOf[ListeningApp]
  }
}

