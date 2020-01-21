package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pagination {
  type paginationChangedHandler = js.Function2[/* newPage */ scala.Double, /* pageSize */ scala.Double, scala.Unit]
}
