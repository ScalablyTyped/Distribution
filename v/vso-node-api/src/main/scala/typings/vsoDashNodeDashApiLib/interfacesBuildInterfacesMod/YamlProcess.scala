package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YamlProcess extends BuildProcess {
  var errors: js.Array[java.lang.String]
  /**
    * The resources used by the build definition.
    */
  var resources: BuildProcessResources
  /**
    * The YAML filename.
    */
  var yamlFilename: java.lang.String
}

object YamlProcess {
  @scala.inline
  def apply(
    errors: js.Array[java.lang.String],
    resources: BuildProcessResources,
    `type`: scala.Double,
    yamlFilename: java.lang.String
  ): YamlProcess = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("yamlFilename")(yamlFilename)
    __obj.asInstanceOf[YamlProcess]
  }
}

