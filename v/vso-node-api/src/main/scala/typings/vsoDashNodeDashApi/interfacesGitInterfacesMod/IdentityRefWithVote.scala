package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityRefWithVote extends IdentityRef {
  /**
    * Indicates if this is a required reviewer for this pull request. <br /> Branches can have policies that require particular reviewers are required for pull requests.
    */
  var isRequired: Boolean
  /**
    * URL to retrieve information about this identity
    */
  var reviewerUrl: String
  /**
    * Vote on a pull request:<br /> 10 - approved 5 - approved with suggestions 0 - no vote -5 - waiting for author -10 - rejected
    */
  var vote: Double
  /**
    * Groups or teams that that this reviewer contributed to. <br /> Groups and teams can be reviewers on pull requests but can not vote directly.  When a member of the group or team votes, that vote is rolled up into the group or team vote.  VotedFor is a list of such votes.
    */
  var votedFor: js.Array[IdentityRefWithVote]
}

object IdentityRefWithVote {
  @scala.inline
  def apply(
    directoryAlias: String,
    displayName: String,
    id: String,
    imageUrl: String,
    inactive: Boolean,
    isAadIdentity: Boolean,
    isContainer: Boolean,
    isRequired: Boolean,
    profileUrl: String,
    reviewerUrl: String,
    uniqueName: String,
    url: String,
    vote: Double,
    votedFor: js.Array[IdentityRefWithVote]
  ): IdentityRefWithVote = {
    val __obj = js.Dynamic.literal(directoryAlias = directoryAlias, displayName = displayName, id = id, imageUrl = imageUrl, inactive = inactive, isAadIdentity = isAadIdentity, isContainer = isContainer, isRequired = isRequired, profileUrl = profileUrl, reviewerUrl = reviewerUrl, uniqueName = uniqueName, url = url, vote = vote, votedFor = votedFor)
  
    __obj.asInstanceOf[IdentityRefWithVote]
  }
}

