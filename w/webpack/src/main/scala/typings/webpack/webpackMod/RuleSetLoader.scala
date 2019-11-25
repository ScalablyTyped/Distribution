package typings.webpack.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleSetLoader extends js.Object {
  /**
    * Unique loader identifier
    */
  var ident: js.UndefOr[String] = js.undefined
  /**
    * Loader name
    */
  var loader: js.UndefOr[String] = js.undefined
  /**
    * Loader options
    */
  var options: js.UndefOr[RuleSetQuery] = js.undefined
  /**
    * Loader query
    */
  var query: js.UndefOr[RuleSetQuery] = js.undefined
}

object RuleSetLoader {
  @scala.inline
  def apply(
    ident: String = null,
    loader: String = null,
    options: RuleSetQuery = null,
    query: RuleSetQuery = null
  ): RuleSetLoader = {
    val __obj = js.Dynamic.literal()
    if (ident != null) __obj.updateDynamic("ident")(ident.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSetLoader]
  }
}

