package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitQueryRefsCriteria extends js.Object {
  /**
    * List of commit Ids to be searched
    */
  var commitIds: js.Array[String]
  /**
    * List of complete or partial names for refs to be searched
    */
  var refNames: js.Array[String]
  /**
    * Type of search on refNames, if provided
    */
  var searchType: GitRefSearchType
}

object GitQueryRefsCriteria {
  @scala.inline
  def apply(commitIds: js.Array[String], refNames: js.Array[String], searchType: GitRefSearchType): GitQueryRefsCriteria = {
    val __obj = js.Dynamic.literal(commitIds = commitIds.asInstanceOf[js.Any], refNames = refNames.asInstanceOf[js.Any], searchType = searchType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitQueryRefsCriteria]
  }
}

