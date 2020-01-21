package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cellNav {
  type navigateHandler[TEntity] = js.Function2[
    /* newRowCol */ typings.uiGrid.mod.cellNav.IRowCol[TEntity], 
    /* oldRowCol */ typings.uiGrid.mod.cellNav.IRowCol[TEntity], 
    scala.Unit
  ]
  type viewportKeyDownHandler[TEntity] = js.Function2[
    /* event */ typings.angular.JQueryKeyEventObject, 
    /* rowCol */ typings.uiGrid.mod.cellNav.IRowCol[TEntity], 
    scala.Unit
  ]
  type viewportKeyPressHandler[TEntity] = js.Function2[
    /* event */ typings.angular.JQueryKeyEventObject, 
    /* rowCol */ typings.uiGrid.mod.cellNav.IRowCol[TEntity], 
    scala.Unit
  ]
}
