package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifact extends js.Object {
  var artifact: scala.Double
  var environmentState: scala.Double
  var event: scala.Double
  var undefined: scala.Double
}

object Artifact {
  @scala.inline
  def apply(
    artifact: scala.Double,
    environmentState: scala.Double,
    event: scala.Double,
    undefined: scala.Double
  ): Artifact = {
    val __obj = js.Dynamic.literal(artifact = artifact.asInstanceOf[js.Any], environmentState = environmentState.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifact]
  }
}

