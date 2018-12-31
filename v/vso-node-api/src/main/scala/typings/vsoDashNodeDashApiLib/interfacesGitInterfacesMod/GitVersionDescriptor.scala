package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitVersionDescriptor extends js.Object {
  /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
  var version: java.lang.String
  /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
  var versionOptions: GitVersionOptions
  /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
  var versionType: GitVersionType
}

