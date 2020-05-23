package typings.svgSprite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generator extends js.Object {
  /**
    * SVG shape ID generator callback
    */
  var generator: js.UndefOr[String | (js.Function1[/* svg */ String, String])] = js.undefined
  /**
    * File name separator for shape states (e.g. ':hover')
    */
  var pseudo: js.UndefOr[String] = js.undefined
  /**
    * Separator for directory name traversal
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * Whitespace replacement for shape IDs
    */
  var whitespace: js.UndefOr[String] = js.undefined
}

object Generator {
  @scala.inline
  def apply(
    generator: String | (js.Function1[/* svg */ String, String]) = null,
    pseudo: String = null,
    separator: String = null,
    whitespace: String = null
  ): Generator = {
    val __obj = js.Dynamic.literal()
    if (generator != null) __obj.updateDynamic("generator")(generator.asInstanceOf[js.Any])
    if (pseudo != null) __obj.updateDynamic("pseudo")(pseudo.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (whitespace != null) __obj.updateDynamic("whitespace")(whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generator]
  }
}

