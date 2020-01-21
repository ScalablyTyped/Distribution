package typings.uaParserJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEngine extends js.Object {
  /**
    * Possible name:
    * Amaya, EdgeHTML, Gecko, iCab, KHTML, Links, Lynx, NetFront, NetSurf, Presto,
    * Tasman, Trident, w3m, WebKit
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Determined dynamically
    */
  var version: js.UndefOr[String] = js.undefined
}

object IEngine {
  @scala.inline
  def apply(name: String = null, version: String = null): IEngine = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEngine]
  }
}

