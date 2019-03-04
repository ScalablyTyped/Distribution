package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Artifact extends js.Object {
  var artifact: scala.Double
  var environmentState: scala.Double
  var event: scala.Double
  var undefined: scala.Double
}

object Anon_Artifact {
  @scala.inline
  def apply(
    artifact: scala.Double,
    environmentState: scala.Double,
    event: scala.Double,
    undefined: scala.Double
  ): Anon_Artifact = {
    val __obj = js.Dynamic.literal(artifact = artifact, environmentState = environmentState, event = event, undefined = undefined)
  
    __obj.asInstanceOf[Anon_Artifact]
  }
}

