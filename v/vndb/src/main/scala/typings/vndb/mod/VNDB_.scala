package typings.vndb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used for creating a connection to VNDB API
  */
@js.native
trait VNDB_ extends js.Object {
  /**
    * Connects to the VNDB API.
    * Host and port are not required unless VNDB changes them.
    * @param host VNDB host address
    * @param port VNDB port
    */
  def start(): js.Promise[vndb] = js.native
  def start(host: js.UndefOr[scala.Nothing], port: Double): js.Promise[vndb] = js.native
  def start(host: String): js.Promise[vndb] = js.native
  def start(host: String, port: Double): js.Promise[vndb] = js.native
}

