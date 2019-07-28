package typings.atStyledDashSystemCss

import typings.csstype.csstypeMod.HeightProperty
import typings.csstype.csstypeMod.MaxHeightProperty
import typings.csstype.csstypeMod.MaxWidthProperty
import typings.csstype.csstypeMod.MinHeightProperty
import typings.csstype.csstypeMod.MinWidthProperty
import typings.csstype.csstypeMod.WidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: HeightProperty[Double]
  var maxHeight: MaxHeightProperty[Double]
  var maxWidth: MaxWidthProperty[Double]
  var minHeight: MinHeightProperty[Double]
  var minWidth: MinWidthProperty[Double]
  var width: WidthProperty[Double]
}

object Anon_Height {
  @scala.inline
  def apply(
    height: HeightProperty[Double],
    maxHeight: MaxHeightProperty[Double],
    maxWidth: MaxWidthProperty[Double],
    minHeight: MinHeightProperty[Double],
    minWidth: MinWidthProperty[Double],
    width: WidthProperty[Double]
  ): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Height]
  }
}

