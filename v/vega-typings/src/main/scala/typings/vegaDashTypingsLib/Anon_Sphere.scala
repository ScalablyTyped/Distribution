package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sphere
  extends vegaDashTypingsLib.typesSpecMarkMod._Clip {
  var sphere: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
}

object Anon_Sphere {
  @scala.inline
  def apply(sphere: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef): Anon_Sphere = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sphere")(sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Sphere]
  }
}

