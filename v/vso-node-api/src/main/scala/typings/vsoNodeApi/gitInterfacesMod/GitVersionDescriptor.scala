package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitVersionDescriptor extends js.Object {
  /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
  var version: String
  /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
  var versionOptions: GitVersionOptions
  /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
  var versionType: GitVersionType
}

object GitVersionDescriptor {
  @scala.inline
  def apply(version: String, versionOptions: GitVersionOptions, versionType: GitVersionType): GitVersionDescriptor = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], versionOptions = versionOptions.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitVersionDescriptor]
  }
}

