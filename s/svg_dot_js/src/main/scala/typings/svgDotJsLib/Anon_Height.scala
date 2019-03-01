package typings
package svgDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: scala.Double
  var ratio: scala.Double
  var url: java.lang.String
  var width: scala.Double
}

object Anon_Height {
  @scala.inline
  def apply(height: scala.Double, ratio: scala.Double, url: java.lang.String, width: scala.Double): Anon_Height = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("ratio")(ratio)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Height]
  }
}

