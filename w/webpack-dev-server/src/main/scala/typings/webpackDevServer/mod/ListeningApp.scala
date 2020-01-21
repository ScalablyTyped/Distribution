package typings.webpackDevServer.mod

import typings.webpackDevServer.AnonPort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListeningApp extends js.Object {
  def address(): AnonPort
}

object ListeningApp {
  @scala.inline
  def apply(address: () => AnonPort): ListeningApp = {
    val __obj = js.Dynamic.literal(address = js.Any.fromFunction0(address))
  
    __obj.asInstanceOf[ListeningApp]
  }
}

