package typings
package vsslnDashParserLib.vsslnDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- vsslnDashParserLib.vsslnDashParserMod.VsSolutionSectionCollection because Already inherited */ trait VsSolutionProject extends VsSolutionSection {
  var name: java.lang.String
  var path: java.lang.String
  var projectDependencies: js.UndefOr[VsSolutionSection] = js.undefined
  var projectGuid: java.lang.String
  var `type`: java.lang.String
  var typeGuid: java.lang.String
}

object VsSolutionProject {
  @scala.inline
  def apply(
    name: java.lang.String,
    path: java.lang.String,
    projectGuid: java.lang.String,
    `type`: java.lang.String,
    typeGuid: java.lang.String,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[VsSolutionSection] = null,
    projectDependencies: VsSolutionSection = null
  ): VsSolutionProject = {
    val __obj = js.Dynamic.literal(name = name, path = path, projectGuid = projectGuid, typeGuid = typeGuid)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (projectDependencies != null) __obj.updateDynamic("projectDependencies")(projectDependencies)
    __obj.asInstanceOf[VsSolutionProject]
  }
}

