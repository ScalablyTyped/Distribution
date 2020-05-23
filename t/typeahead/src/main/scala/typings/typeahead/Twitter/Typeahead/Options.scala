package typings.typeahead.Twitter.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Used for overriding the default class names.
    */
  var classNames: js.UndefOr[ClassNames] = js.undefined
  /**
    * If true, when suggestions are rendered, pattern matches for the current query in text nodes will be wrapped in a strong element with its class set to {{classNames.highlight}}.
    * Defaults to false.
    */
  var highlight: js.UndefOr[Boolean] = js.undefined
  /**
    * If false, the typeahead will not show a hint.
    * Defaults to true.
    */
  var hint: js.UndefOr[Boolean] = js.undefined
  /**
    * The minimum character length needed before suggestions start getting rendered.
    * Defaults to 1.
    */
  var minLength: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    classNames: ClassNames = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    hint: js.UndefOr[Boolean] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hint)) __obj.updateDynamic("hint")(hint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

