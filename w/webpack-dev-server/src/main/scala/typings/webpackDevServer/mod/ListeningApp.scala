package typings.webpackDevServer.mod

import typings.webpackDevServer.anon.Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListeningApp extends js.Object {
  def address(): Port
}

object ListeningApp {
  @scala.inline
  def apply(address: () => Port): ListeningApp = {
    val __obj = js.Dynamic.literal(address = js.Any.fromFunction0(address))
    __obj.asInstanceOf[ListeningApp]
  }
}

