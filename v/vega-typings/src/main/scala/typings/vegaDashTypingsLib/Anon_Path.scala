package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path
  extends vegaDashTypingsLib.typesSpecMarkMod._Clip {
  var path: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
}

object Anon_Path {
  @scala.inline
  def apply(path: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef): Anon_Path = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Path]
  }
}

