package typings
package atUifabricMergeDashStylesLib.libStylesheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICSPSettings extends js.Object {
  /**
    * Nonce to inject into script tag
    */
  var nonce: js.UndefOr[java.lang.String] = js.undefined
}

object ICSPSettings {
  @scala.inline
  def apply(nonce: java.lang.String = null): ICSPSettings = {
    val __obj = js.Dynamic.literal()
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[ICSPSettings]
  }
}

