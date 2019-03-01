package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Artifacts extends js.Object {
  var artifacts: scala.Double
  var environments: scala.Double
  var lastRelease: scala.Double
  var none: scala.Double
  var tags: scala.Double
  var triggers: scala.Double
  var variables: scala.Double
}

object Anon_Artifacts {
  @scala.inline
  def apply(
    artifacts: scala.Double,
    environments: scala.Double,
    lastRelease: scala.Double,
    none: scala.Double,
    tags: scala.Double,
    triggers: scala.Double,
    variables: scala.Double
  ): Anon_Artifacts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifacts")(artifacts)
    __obj.updateDynamic("environments")(environments)
    __obj.updateDynamic("lastRelease")(lastRelease)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("triggers")(triggers)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Anon_Artifacts]
  }
}

