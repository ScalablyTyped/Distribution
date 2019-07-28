package typings.webpackDashDevDashServer.webpackDashDevDashServerMod

import typings.webpackDashDevDashServer.Anon_Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListeningApp extends js.Object {
  def address(): Anon_Port
}

object ListeningApp {
  @scala.inline
  def apply(address: () => Anon_Port): ListeningApp = {
    val __obj = js.Dynamic.literal(address = js.Any.fromFunction0(address))
  
    __obj.asInstanceOf[ListeningApp]
  }
}

