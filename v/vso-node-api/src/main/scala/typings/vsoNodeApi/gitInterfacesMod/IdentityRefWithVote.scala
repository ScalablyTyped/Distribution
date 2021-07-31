package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityRefWithVote
  extends StObject
     with IdentityRef {
  
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
    val __obj = js.Dynamic.literal(directoryAlias = directoryAlias.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], isAadIdentity = isAadIdentity.asInstanceOf[js.Any], isContainer = isContainer.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], reviewerUrl = reviewerUrl.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any], votedFor = votedFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityRefWithVote]
  }
  
  @scala.inline
  implicit class IdentityRefWithVoteMutableBuilder[Self <: IdentityRefWithVote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewerUrl(value: String): Self = StObject.set(x, "reviewerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVote(value: Double): Self = StObject.set(x, "vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVotedFor(value: js.Array[IdentityRefWithVote]): Self = StObject.set(x, "votedFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVotedForVarargs(value: IdentityRefWithVote*): Self = StObject.set(x, "votedFor", js.Array(value :_*))
  }
}
