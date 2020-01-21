package typings.vsslnParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.vsslnParser.mod.VsSolutionSectionCollection because Already inherited */ trait VsSolutionProject extends VsSolutionSection {
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
    StringDictionary: StringDictionary[js.Any] = null,
    projectDependencies: VsSolutionSection = null
  ): VsSolutionProject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], projectGuid = projectGuid.asInstanceOf[js.Any], typeGuid = typeGuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (projectDependencies != null) __obj.updateDynamic("projectDependencies")(projectDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[VsSolutionProject]
  }
}

