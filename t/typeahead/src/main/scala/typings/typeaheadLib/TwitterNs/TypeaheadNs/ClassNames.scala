package typings
package typeaheadLib.TwitterNs.TypeaheadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used for overriding the default class names.
  */
trait ClassNames extends js.Object {
  /**
    * Added to suggestion element when menu cursor moves to said suggestion.Defaults to tt- cursor.
    */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to dataset elements.to Defaults to tt- dataset.
    */
  var dataset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to menu element when it contains no content.Defaults to tt- empty.
    */
  var empty: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the element that wraps highlighted text.Defaults to tt- highlight.
    */
  var highlight: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to hint input.Defaults to tt- hint.
    */
  var hint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to input that's initialized into a typeahead. Defaults to tt-input.
    */
  var input: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to menu element.Defaults to tt- menu.
    */
  var menu: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to menu element when it is opened.Defaults to tt- open.
    */
  var open: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to suggestion elements.Defaults to tt- suggestion.
    */
  var suggestion: js.UndefOr[java.lang.String] = js.undefined
}

object ClassNames {
  @scala.inline
  def apply(
    cursor: java.lang.String = null,
    dataset: java.lang.String = null,
    empty: java.lang.String = null,
    highlight: java.lang.String = null,
    hint: java.lang.String = null,
    input: java.lang.String = null,
    menu: java.lang.String = null,
    open: java.lang.String = null,
    suggestion: java.lang.String = null
  ): ClassNames = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (input != null) __obj.updateDynamic("input")(input)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (open != null) __obj.updateDynamic("open")(open)
    if (suggestion != null) __obj.updateDynamic("suggestion")(suggestion)
    __obj.asInstanceOf[ClassNames]
  }
}

