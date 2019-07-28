package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineProcess extends js.Object {
  var `type`: PipelineProcessTypes
}

object PipelineProcess {
  @scala.inline
  def apply(`type`: PipelineProcessTypes): PipelineProcess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PipelineProcess]
  }
}

