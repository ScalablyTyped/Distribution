package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitItemDescriptor extends js.Object {
  /**
    * Path to item
    */
  var path: String
  /**
    * Specifies whether to include children (OneLevel), all descendants (Full), or None
    */
  var recursionLevel: VersionControlRecursionType
  /**
    * Version string (interpretation based on VersionType defined in subclass
    */
  var version: String
  /**
    * Version modifiers (e.g. previous)
    */
  var versionOptions: GitVersionOptions
  /**
    * How to interpret version (branch,tag,commit)
    */
  var versionType: GitVersionType
}

object GitItemDescriptor {
  @scala.inline
  def apply(
    path: String,
    recursionLevel: VersionControlRecursionType,
    version: String,
    versionOptions: GitVersionOptions,
    versionType: GitVersionType
  ): GitItemDescriptor = {
    val __obj = js.Dynamic.literal(path = path, recursionLevel = recursionLevel, version = version, versionOptions = versionOptions, versionType = versionType)
  
    __obj.asInstanceOf[GitItemDescriptor]
  }
}

