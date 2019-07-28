package typings.uiDashGrid.uiDashGridMod

import typings.angular.JQueryKeyEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cellNavNs {
  type navigateHandler[TEntity] = js.Function2[/* newRowCol */ IRowCol[TEntity], /* oldRowCol */ IRowCol[TEntity], Unit]
  type viewportKeyDownHandler[TEntity] = js.Function2[/* event */ JQueryKeyEventObject, /* rowCol */ IRowCol[TEntity], Unit]
  type viewportKeyPressHandler[TEntity] = js.Function2[/* event */ JQueryKeyEventObject, /* rowCol */ IRowCol[TEntity], Unit]
}
