package typings
package wpapiLib.wpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base WordPress API request
  *
  * @see http://wp-api.org/node-wpapi/api-reference/wpapi/1.1.2/WPRequest.html
  */
@JSImport("wpapi", "WPRequest")
@js.native
class WPRequest protected ()
  extends wpapiLib.wpapiMod.WPAPINs.WPRequest {
  /**
    * WPRequest is the base API request object constructor
    *
    * @param options A hash of options for the WPRequest instance
    */
  def this(options: wpapiLib.wpapiMod.WPAPINs.WPAPIOptions) = this()
}

