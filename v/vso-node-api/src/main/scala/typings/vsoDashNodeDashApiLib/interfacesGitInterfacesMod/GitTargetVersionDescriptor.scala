package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTargetVersionDescriptor extends GitVersionDescriptor {
  /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
  var targetVersion: java.lang.String
  /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
  var targetVersionOptions: GitVersionOptions
  /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
  var targetVersionType: GitVersionType
}

object GitTargetVersionDescriptor {
  @scala.inline
  def apply(
    targetVersion: java.lang.String,
    targetVersionOptions: GitVersionOptions,
    targetVersionType: GitVersionType,
    version: java.lang.String,
    versionOptions: GitVersionOptions,
    versionType: GitVersionType
  ): GitTargetVersionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("targetVersion")(targetVersion)
    __obj.updateDynamic("targetVersionOptions")(targetVersionOptions)
    __obj.updateDynamic("targetVersionType")(targetVersionType)
    __obj.updateDynamic("version")(version)
    __obj.updateDynamic("versionOptions")(versionOptions)
    __obj.updateDynamic("versionType")(versionType)
    __obj.asInstanceOf[GitTargetVersionDescriptor]
  }
}

