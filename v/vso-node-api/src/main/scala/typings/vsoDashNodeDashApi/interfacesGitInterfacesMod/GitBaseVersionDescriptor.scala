package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitBaseVersionDescriptor extends GitVersionDescriptor {
  /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
  var baseVersion: String
  /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
  var baseVersionOptions: GitVersionOptions
  /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
  var baseVersionType: GitVersionType
}

object GitBaseVersionDescriptor {
  @scala.inline
  def apply(
    baseVersion: String,
    baseVersionOptions: GitVersionOptions,
    baseVersionType: GitVersionType,
    version: String,
    versionOptions: GitVersionOptions,
    versionType: GitVersionType
  ): GitBaseVersionDescriptor = {
    val __obj = js.Dynamic.literal(baseVersion = baseVersion, baseVersionOptions = baseVersionOptions, baseVersionType = baseVersionType, version = version, versionOptions = versionOptions, versionType = versionType)
  
    __obj.asInstanceOf[GitBaseVersionDescriptor]
  }
}

