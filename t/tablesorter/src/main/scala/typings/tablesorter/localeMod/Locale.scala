package typings.tablesorter.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  /**
    * The text to show for applying ascending sorting.
    */
  var nextAsc: String
  /**
    * The text to show for applying descending sorting.
    */
  var nextDesc: String
  /**
    * The text to show for disabling sorting.
    */
  var nextNone: String
  /**
    * The text to show for ascending sorting.
    */
  var sortAsc: String
  /**
    * The text to show for descending sorting.
    */
  var sortDesc: String
  /**
    * The text to show for disabled sorting.
    */
  var sortDisabled: String
  /**
    * The text to show for non-sorted columns.
    */
  var sortNone: String
}

object Locale {
  @scala.inline
  def apply(
    nextAsc: String,
    nextDesc: String,
    nextNone: String,
    sortAsc: String,
    sortDesc: String,
    sortDisabled: String,
    sortNone: String
  ): Locale = {
    val __obj = js.Dynamic.literal(nextAsc = nextAsc.asInstanceOf[js.Any], nextDesc = nextDesc.asInstanceOf[js.Any], nextNone = nextNone.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any], sortDesc = sortDesc.asInstanceOf[js.Any], sortDisabled = sortDisabled.asInstanceOf[js.Any], sortNone = sortNone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Locale]
  }
}

