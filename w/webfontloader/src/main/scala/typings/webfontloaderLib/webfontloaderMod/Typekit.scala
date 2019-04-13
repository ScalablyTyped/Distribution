package typings
package webfontloaderLib.webfontloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typekit extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Typekit {
  @scala.inline
  def apply(id: java.lang.String = null): Typekit = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Typekit]
  }
}

