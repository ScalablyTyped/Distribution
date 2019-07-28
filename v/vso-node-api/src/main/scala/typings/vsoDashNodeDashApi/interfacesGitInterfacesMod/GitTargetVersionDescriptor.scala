package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTargetVersionDescriptor extends GitVersionDescriptor {
  /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
  var targetVersion: String
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
    targetVersion: String,
    targetVersionOptions: GitVersionOptions,
    targetVersionType: GitVersionType,
    version: String,
    versionOptions: GitVersionOptions,
    versionType: GitVersionType
  ): GitTargetVersionDescriptor = {
    val __obj = js.Dynamic.literal(targetVersion = targetVersion, targetVersionOptions = targetVersionOptions, targetVersionType = targetVersionType, version = version, versionOptions = versionOptions, versionType = versionType)
  
    __obj.asInstanceOf[GitTargetVersionDescriptor]
  }
}

