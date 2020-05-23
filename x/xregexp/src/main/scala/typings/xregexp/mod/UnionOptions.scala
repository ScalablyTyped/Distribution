package typings.xregexp.mod

import typings.xregexp.xregexpStrings.none
import typings.xregexp.xregexpStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional options for when doing a RegExp union.
  */
trait UnionOptions extends js.Object {
  /**
    * The conjunction to use for the union. Default is `none`.
    */
  var conjunction: js.UndefOr[or | none | Null] = js.undefined
}

object UnionOptions {
  @scala.inline
  def apply(conjunction: js.UndefOr[Null | or | none] = js.undefined): UnionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(conjunction)) __obj.updateDynamic("conjunction")(conjunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionOptions]
  }
}

