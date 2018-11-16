package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(yandexDashMapsLib.ymapsNs.ICustomizable because Would inherit conflicting mutable fields List(events))*/
@js.native
trait ILayer extends IChild[IControlParent] {
  var getBrightness: js.UndefOr[js.Function0[scala.Double]] = js.native
  var getCopyrights: js.UndefOr[
    js.Function2[
      /* coords */ js.Array[scala.Double], 
      /* zoom */ scala.Double, 
      stdLib.Promise[js.Array[java.lang.String | stdLib.HTMLElement]]
    ]
  ] = js.native
  var getZoomRange: js.UndefOr[
    js.Function1[/* point */ js.Array[scala.Double], stdLib.Promise[js.Array[scala.Double]]]
  ] = js.native
}

