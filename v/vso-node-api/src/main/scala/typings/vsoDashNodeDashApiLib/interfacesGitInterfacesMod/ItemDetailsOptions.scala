package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ItemDetailsOptions extends js.Object {
  /**
       * If true, include metadata about the file type
       */
  var includeContentMetadata: scala.Boolean
  /**
       * Specifies whether to include children (OneLevel), all descendants (Full) or None for folder items
       */
  var recursionLevel: VersionControlRecursionType
}

