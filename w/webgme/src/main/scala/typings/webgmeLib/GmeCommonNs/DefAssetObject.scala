package typings
package webgmeLib.GmeCommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefAssetObject extends DefObject {
  var `type`: webgmeLib.webgmeLibStrings.asset
}

object DefAssetObject {
  @scala.inline
  def apply(`type`: webgmeLib.webgmeLibStrings.asset): DefAssetObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DefAssetObject]
  }
}

