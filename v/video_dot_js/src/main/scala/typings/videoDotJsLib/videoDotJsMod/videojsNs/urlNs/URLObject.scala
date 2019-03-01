package typings
package videoDotJsLib.videoDotJsMod.videojsNs.urlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLObject extends js.Object {
  /**
  			 * The hash of the url that was parsed.
  			 */
  var hash: java.lang.String
  /**
  			 * The host of the url that was parsed.
  			 */
  var host: java.lang.String
  /**
  			 * The hostname of the url that was parsed.
  			 */
  var hostname: java.lang.String
  /**
  			 * The pathname of the url that was parsed.
  			 */
  var pathname: java.lang.String
  /**
  			 * The port of the url that was parsed.
  			 */
  var port: java.lang.String
  /**
  			 * The protocol of the url that was parsed.
  			 */
  var protocol: java.lang.String
  /**
  			 * The search query of the url that was parsed.
  			 */
  var search: java.lang.String
}

object URLObject {
  @scala.inline
  def apply(
    hash: java.lang.String,
    host: java.lang.String,
    hostname: java.lang.String,
    pathname: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    search: java.lang.String
  ): URLObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("pathname")(pathname)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[URLObject]
  }
}

