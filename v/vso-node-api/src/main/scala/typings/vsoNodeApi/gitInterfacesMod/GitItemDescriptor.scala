package typings.vsoNodeApi.gitInterfacesMod

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
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], recursionLevel = recursionLevel.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionOptions = versionOptions.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitItemDescriptor]
  }
}

