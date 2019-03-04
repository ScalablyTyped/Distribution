package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityRefWithVote
  extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef {
  /**
    * Indicates if this is a required reviewer for this pull request. <br /> Branches can have policies that require particular reviewers are required for pull requests.
    */
  var isRequired: scala.Boolean
  /**
    * URL to retrieve information about this identity
    */
  var reviewerUrl: java.lang.String
  /**
    * Vote on a pull request:<br /> 10 - approved 5 - approved with suggestions 0 - no vote -5 - waiting for author -10 - rejected
    */
  var vote: scala.Double
  /**
    * Groups or teams that that this reviewer contributed to. <br /> Groups and teams can be reviewers on pull requests but can not vote directly.  When a member of the group or team votes, that vote is rolled up into the group or team vote.  VotedFor is a list of such votes.
    */
  var votedFor: js.Array[IdentityRefWithVote]
}

object IdentityRefWithVote {
  @scala.inline
  def apply(
    directoryAlias: java.lang.String,
    displayName: java.lang.String,
    id: java.lang.String,
    imageUrl: java.lang.String,
    inactive: scala.Boolean,
    isAadIdentity: scala.Boolean,
    isContainer: scala.Boolean,
    isRequired: scala.Boolean,
    profileUrl: java.lang.String,
    reviewerUrl: java.lang.String,
    uniqueName: java.lang.String,
    url: java.lang.String,
    vote: scala.Double,
    votedFor: js.Array[IdentityRefWithVote]
  ): IdentityRefWithVote = {
    val __obj = js.Dynamic.literal(directoryAlias = directoryAlias, displayName = displayName, id = id, imageUrl = imageUrl, inactive = inactive, isAadIdentity = isAadIdentity, isContainer = isContainer, isRequired = isRequired, profileUrl = profileUrl, reviewerUrl = reviewerUrl, uniqueName = uniqueName, url = url, vote = vote, votedFor = votedFor)
  
    __obj.asInstanceOf[IdentityRefWithVote]
  }
}

