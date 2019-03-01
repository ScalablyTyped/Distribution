package typings
package svgDashSpriteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Generator extends js.Object {
  /**
    * SVG shape ID generator callback
    */
  var generator: js.UndefOr[java.lang.String | (js.Function1[/* svg */ java.lang.String, java.lang.String])] = js.undefined
  /**
    * File name separator for shape states (e.g. ':hover')
    */
  var pseudo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Separator for directory name traversal
    */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whitespace replacement for shape IDs
    */
  var whitespace: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Generator {
  @scala.inline
  def apply(
    generator: java.lang.String | (js.Function1[/* svg */ java.lang.String, java.lang.String]) = null,
    pseudo: java.lang.String = null,
    separator: java.lang.String = null,
    whitespace: java.lang.String = null
  ): Anon_Generator = {
    val __obj = js.Dynamic.literal()
    if (generator != null) __obj.updateDynamic("generator")(generator.asInstanceOf[js.Any])
    if (pseudo != null) __obj.updateDynamic("pseudo")(pseudo)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (whitespace != null) __obj.updateDynamic("whitespace")(whitespace)
    __obj.asInstanceOf[Anon_Generator]
  }
}

