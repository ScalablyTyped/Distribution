package typings
package typeaheadLib.TwitterNs.TypeaheadNs

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
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  /**
            * If false, the typeahead will not show a hint.
            * Defaults to true.
            */
  var hint: js.UndefOr[scala.Boolean] = js.undefined
  /**
            * The minimum character length needed before suggestions start getting rendered.
            * Defaults to 1.
            */
  var minLength: js.UndefOr[scala.Double] = js.undefined
}

