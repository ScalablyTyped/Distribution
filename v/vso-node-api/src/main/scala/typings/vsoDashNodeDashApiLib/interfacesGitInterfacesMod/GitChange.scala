package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitChange extends Change[GitItem] {
  /**
       * ID of the change within the group of changes.
       */
  var changeId: scala.Double
  /**
       * New Content template to be used when pushing new changes.
       */
  var newContentTemplate: GitTemplate
  /**
       * Original path of item if different from current path.
       */
  var originalPath: java.lang.String
}

