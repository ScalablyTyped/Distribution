package typings
package webfontloaderLib.webfontloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monotype extends js.Object {
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object Monotype {
  @scala.inline
  def apply(projectId: java.lang.String = null, version: scala.Int | scala.Double = null): Monotype = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monotype]
  }
}

