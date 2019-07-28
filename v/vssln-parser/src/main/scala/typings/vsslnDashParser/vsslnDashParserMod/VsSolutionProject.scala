package typings.vsslnDashParser.vsslnDashParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.vsslnDashParser.vsslnDashParserMod.VsSolutionSectionCollection because Already inherited */ trait VsSolutionProject extends VsSolutionSection {
  var name: String
  var path: String
  var projectDependencies: js.UndefOr[VsSolutionSection] = js.undefined
  var projectGuid: String
  var `type`: String
  var typeGuid: String
}

object VsSolutionProject {
  @scala.inline
  def apply(
    name: String,
    path: String,
    projectGuid: String,
    `type`: String,
    typeGuid: String,
    StringDictionary: StringDictionary[VsSolutionSection] = null,
    projectDependencies: VsSolutionSection = null
  ): VsSolutionProject = {
    val __obj = js.Dynamic.literal(name = name, path = path, projectGuid = projectGuid, typeGuid = typeGuid)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (projectDependencies != null) __obj.updateDynamic("projectDependencies")(projectDependencies)
    __obj.asInstanceOf[VsSolutionProject]
  }
}

