package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildBadge extends js.Object {
  /**
    * The ID of the build represented by this badge.
    */
  var buildId: Double
  /**
    * A link to the SVG resource.
    */
  var imageUrl: String
}

object BuildBadge {
  @scala.inline
  def apply(buildId: Double, imageUrl: String): BuildBadge = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildBadge]
  }
}

