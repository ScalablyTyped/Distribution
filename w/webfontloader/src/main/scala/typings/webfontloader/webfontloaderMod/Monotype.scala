package typings.webfontloader.webfontloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monotype extends js.Object {
  var projectId: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object Monotype {
  @scala.inline
  def apply(projectId: String = null, version: Int | Double = null): Monotype = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monotype]
  }
}

