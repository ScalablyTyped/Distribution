package typings.vegaUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaUtil.vegaUtilStrings.ascending
  - typings.vegaUtil.vegaUtilStrings.descending
*/
trait Order extends js.Object

object Order {
  @scala.inline
  def ascending: typings.vegaUtil.vegaUtilStrings.ascending = this.cast("ascending")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def descending: typings.vegaUtil.vegaUtilStrings.descending = this.cast("descending")
}

