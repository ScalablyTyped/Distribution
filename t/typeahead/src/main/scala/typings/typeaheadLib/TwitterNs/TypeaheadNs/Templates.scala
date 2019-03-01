package typings
package typeaheadLib.TwitterNs.TypeaheadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A hash of templates to be used when rendering the dataset. Note a
  * precompiled template is a function that takes a JavaScript object as
  * its first argument and returns a HTML string.
  */
trait Templates[T] extends js.Object {
  /**
    * Rendered at the bottom of the dataset when suggestions are present. Can be either a HTML string or
    * a precompiled template. If it's a precompiled template, the passed in context will contain
    * query and suggestions.
    */
  var footer: js.UndefOr[
    java.lang.String | (js.Function2[/* query */ java.lang.String, /* suggestions */ js.Array[T], java.lang.String])
  ] = js.undefined
  /**
    * Rendered at the top of the dataset when suggestions are present. Can be either a HTML string or
    * a precompiled template. If it's a precompiled template, the passed in context will contain
    * query and suggestions.
    */
  var header: js.UndefOr[
    java.lang.String | (js.Function2[/* query */ java.lang.String, /* suggestions */ js.Array[T], java.lang.String])
  ] = js.undefined
  /**
    * Rendered when 0 suggestions are available for the given query.
    * Can be either a HTML string or a precompiled template.
    * If it's a precompiled template, the passed in context will contain query.
    */
  var notFound: js.UndefOr[
    java.lang.String | (js.Function1[/* query */ java.lang.String, java.lang.String])
  ] = js.undefined
  /**
    * Rendered when 0 synchronous suggestions are available but asynchronous suggestions are expected.
    * Can be either a HTML string or a precompiled template.
    * If it's a precompiled template, the passed in context will contain query.
    */
  var pending: js.UndefOr[
    java.lang.String | (js.Function1[/* query */ java.lang.String, java.lang.String])
  ] = js.undefined
  /**
    * Used to render a single suggestion. If set, this has to be a precompiled template.
    * The associated suggestion object will serve as the context.
    * Defaults to the value of display wrapped in a div tag i.e. <div>{{value}}</div>.
    */
  var suggestion: js.UndefOr[js.Function1[/* suggestion */ T, java.lang.String]] = js.undefined
}

object Templates {
  @scala.inline
  def apply[T](
    footer: java.lang.String | (js.Function2[/* query */ java.lang.String, /* suggestions */ js.Array[T], java.lang.String]) = null,
    header: java.lang.String | (js.Function2[/* query */ java.lang.String, /* suggestions */ js.Array[T], java.lang.String]) = null,
    notFound: java.lang.String | (js.Function1[/* query */ java.lang.String, java.lang.String]) = null,
    pending: java.lang.String | (js.Function1[/* query */ java.lang.String, java.lang.String]) = null,
    suggestion: js.Function1[/* suggestion */ T, java.lang.String] = null
  ): Templates[T] = {
    val __obj = js.Dynamic.literal()
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (notFound != null) __obj.updateDynamic("notFound")(notFound.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    if (suggestion != null) __obj.updateDynamic("suggestion")(suggestion)
    __obj.asInstanceOf[Templates[T]]
  }
}

