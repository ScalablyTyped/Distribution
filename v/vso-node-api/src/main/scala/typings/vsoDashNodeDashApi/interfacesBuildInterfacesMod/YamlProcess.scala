package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YamlProcess extends BuildProcess {
  var errors: js.Array[String]
  /**
    * The resources used by the build definition.
    */
  var resources: BuildProcessResources
  /**
    * The YAML filename.
    */
  var yamlFilename: String
}

object YamlProcess {
  @scala.inline
  def apply(errors: js.Array[String], resources: BuildProcessResources, `type`: Double, yamlFilename: String): YamlProcess = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], yamlFilename = yamlFilename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[YamlProcess]
  }
}

