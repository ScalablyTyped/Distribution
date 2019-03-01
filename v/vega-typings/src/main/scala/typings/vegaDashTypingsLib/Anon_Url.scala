package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Url extends js.Object {
  var url: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
}

object Anon_Url {
  @scala.inline
  def apply(url: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef): Anon_Url = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Url]
  }
}

