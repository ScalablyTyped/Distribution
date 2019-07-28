package typings.atUifabricMergeDashStyles.libStylesheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICSPSettings extends js.Object {
  /**
    * Nonce to inject into script tag
    */
  var nonce: js.UndefOr[String] = js.undefined
}

object ICSPSettings {
  @scala.inline
  def apply(nonce: String = null): ICSPSettings = {
    val __obj = js.Dynamic.literal()
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[ICSPSettings]
  }
}

