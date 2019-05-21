package typings
package uaDashParserDashJsLib.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEngine extends js.Object {
  /**
    * Possible name:
    * Amaya, EdgeHTML, Gecko, iCab, KHTML, Links, Lynx, NetFront, NetSurf, Presto,
    * Tasman, Trident, w3m, WebKit
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determined dynamically
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object IEngine {
  @scala.inline
  def apply(name: java.lang.String = null, version: java.lang.String = null): IEngine = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IEngine]
  }
}

