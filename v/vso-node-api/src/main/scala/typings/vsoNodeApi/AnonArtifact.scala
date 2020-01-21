package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArtifact extends js.Object {
  var artifact: Double
  var environmentState: Double
  var event: Double
  var undefined: Double
}

object AnonArtifact {
  @scala.inline
  def apply(artifact: Double, environmentState: Double, event: Double, undefined: Double): AnonArtifact = {
    val __obj = js.Dynamic.literal(artifact = artifact.asInstanceOf[js.Any], environmentState = environmentState.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArtifact]
  }
}

