package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitItemDescriptor extends js.Object {
  /**
       * Path to item
       */
  var path: java.lang.String
  /**
       * Specifies whether to include children (OneLevel), all descendants (Full), or None
       */
  var recursionLevel: VersionControlRecursionType
  /**
       * Version string (interpretation based on VersionType defined in subclass
       */
  var version: java.lang.String
  /**
       * Version modifiers (e.g. previous)
       */
  var versionOptions: GitVersionOptions
  /**
       * How to interpret version (branch,tag,commit)
       */
  var versionType: GitVersionType
}

