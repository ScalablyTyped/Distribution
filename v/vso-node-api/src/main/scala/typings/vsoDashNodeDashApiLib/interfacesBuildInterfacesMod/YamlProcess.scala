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
    val __obj = js.Dynamic.literal(errors = errors, resources = resources, yamlFilename = yamlFilename)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[YamlProcess]
  }
}

