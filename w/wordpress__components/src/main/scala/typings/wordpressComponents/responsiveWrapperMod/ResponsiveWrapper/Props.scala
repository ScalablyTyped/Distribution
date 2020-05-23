package typings.wordpressComponents.responsiveWrapperMod.ResponsiveWrapper

import typings.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactChild
  var naturalHeight: Double
  var naturalWidth: Double
}

object Props {
  @scala.inline
  def apply(children: ReactChild, naturalHeight: Double, naturalWidth: Double): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

