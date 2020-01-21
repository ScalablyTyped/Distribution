package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rowEdit {
  type saveRowHandler[TEntity] = js.Function1[/* rowEntity */ TEntity, scala.Unit]
}
