package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityRefWithVote extends IdentityRef {
  
  /**
    * Indicates if this is a required reviewer for this pull request. <br /> Branches can have policies that require particular reviewers are required for pull requests.
    */
  var isRequired: Boolean = js.native
  
  /**
    * URL to retrieve information about this identity
    */
  var reviewerUrl: String = js.native
  
  /**
    * Vote on a pull request:<br /> 10 - approved 5 - approved with suggestions 0 - no vote -5 - waiting for author -10 - rejected
    */
  var vote: Double = js.native
  
  /**
    * Groups or teams that that this reviewer contributed to. <br /> Groups and teams can be reviewers on pull requests but can not vote directly.  When a member of the group or team votes, that vote is rolled up into the group or team vote.  VotedFor is a list of such votes.
    */
  var votedFor: js.Array[IdentityRefWithVote] = js.native
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
    val __obj = js.Dynamic.literal(directoryAlias = directoryAlias.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], isAadIdentity = isAadIdentity.asInstanceOf[js.Any], isContainer = isContainer.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], reviewerUrl = reviewerUrl.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any], votedFor = votedFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityRefWithVote]
  }
  
  @scala.inline
  implicit class IdentityRefWithVoteOps[Self <: IdentityRefWithVote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewerUrl(value: String): Self = this.set("reviewerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVote(value: Double): Self = this.set("vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVotedForVarargs(value: IdentityRefWithVote*): Self = this.set("votedFor", js.Array(value :_*))
    
    @scala.inline
    def setVotedFor(value: js.Array[IdentityRefWithVote]): Self = this.set("votedFor", value.asInstanceOf[js.Any])
  }
}
