package typings.vsoNodeApi.gitInterfacesMod

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
    val __obj = js.Dynamic.literal(targetVersion = targetVersion.asInstanceOf[js.Any], targetVersionOptions = targetVersionOptions.asInstanceOf[js.Any], targetVersionType = targetVersionType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionOptions = versionOptions.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitTargetVersionDescriptor]
  }
}

