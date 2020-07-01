package typings.svgSpritemapWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keep extends js.Object {
  /**
    * Whether to keep the chunk after it's been emitted by webpack.
    */
  var keep: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of the chunk that will be generated.
    */
  var name: js.UndefOr[String] = js.undefined
}

object Keep {
  @scala.inline
  def apply(keep: js.UndefOr[Boolean] = js.undefined, name: String = null): Keep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keep)) __obj.updateDynamic("keep")(keep.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keep]
  }
}

