package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitQueryRefsCriteria extends js.Object {
  /**
       * List of commit Ids to be searched
       */
  var commitIds: js.Array[java.lang.String]
  /**
       * List of complete or partial names for refs to be searched
       */
  var refNames: js.Array[java.lang.String]
  /**
       * Type of search on refNames, if provided
       */
  var searchType: GitRefSearchType
}

