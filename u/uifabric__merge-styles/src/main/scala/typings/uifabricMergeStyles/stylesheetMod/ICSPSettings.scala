package typings.uifabricMergeStyles.stylesheetMod

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
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICSPSettings]
  }
}

