package typings.vsslnDashParser.vsslnDashParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.vsslnDashParser.vsslnDashParserMod.VsSolutionSectionCollection because Already inherited */ trait VsSolutionFile extends VsSolutionSection {
  var minimumVisualStudioVersion: js.UndefOr[String] = js.undefined
  var nestedProjects: js.UndefOr[VsSolutionSection] = js.undefined
  var projectConfigurationPlatforms: js.UndefOr[VsSolutionSection] = js.undefined
  var projects: js.Array[VsSolutionProject]
  var solutionConfigurationPlatforms: js.UndefOr[VsSolutionSection] = js.undefined
  var solutionProperties: js.UndefOr[VsSolutionSection] = js.undefined
  var teamFoundationVersionControl: js.UndefOr[VsSolutionSection] = js.undefined
  var visualStudioVersion: js.UndefOr[String] = js.undefined
}

object VsSolutionFile {
  @scala.inline
  def apply(
    projects: js.Array[VsSolutionProject],
    StringDictionary: StringDictionary[VsSolutionSection] = null,
    minimumVisualStudioVersion: String = null,
    nestedProjects: VsSolutionSection = null,
    projectConfigurationPlatforms: VsSolutionSection = null,
    solutionConfigurationPlatforms: VsSolutionSection = null,
    solutionProperties: VsSolutionSection = null,
    teamFoundationVersionControl: VsSolutionSection = null,
    visualStudioVersion: String = null
  ): VsSolutionFile = {
    val __obj = js.Dynamic.literal(projects = projects)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (minimumVisualStudioVersion != null) __obj.updateDynamic("minimumVisualStudioVersion")(minimumVisualStudioVersion)
    if (nestedProjects != null) __obj.updateDynamic("nestedProjects")(nestedProjects)
    if (projectConfigurationPlatforms != null) __obj.updateDynamic("projectConfigurationPlatforms")(projectConfigurationPlatforms)
    if (solutionConfigurationPlatforms != null) __obj.updateDynamic("solutionConfigurationPlatforms")(solutionConfigurationPlatforms)
    if (solutionProperties != null) __obj.updateDynamic("solutionProperties")(solutionProperties)
    if (teamFoundationVersionControl != null) __obj.updateDynamic("teamFoundationVersionControl")(teamFoundationVersionControl)
    if (visualStudioVersion != null) __obj.updateDynamic("visualStudioVersion")(visualStudioVersion)
    __obj.asInstanceOf[VsSolutionFile]
  }
}

