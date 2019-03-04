package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildBadge extends js.Object {
  /**
    * The ID of the build represented by this badge.
    */
  var buildId: scala.Double
  /**
    * A link to the SVG resource.
    */
  var imageUrl: java.lang.String
}

object BuildBadge {
  @scala.inline
  def apply(buildId: scala.Double, imageUrl: java.lang.String): BuildBadge = {
    val __obj = js.Dynamic.literal(buildId = buildId, imageUrl = imageUrl)
  
    __obj.asInstanceOf[BuildBadge]
  }
}

