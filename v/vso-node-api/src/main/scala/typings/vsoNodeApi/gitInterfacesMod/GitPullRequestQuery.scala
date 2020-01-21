package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestQuery extends js.Object {
  /**
    * The queries to perform.
    */
  var queries: js.Array[GitPullRequestQueryInput]
  /**
    * The results of the queries. This matches the QueryInputs list so Results[n] are the results of QueryInputs[n]. Each entry in the list is a dictionary of commit->pull requests.
    */
  var results: js.Array[StringDictionary[js.Array[GitPullRequest]]]
}

object GitPullRequestQuery {
  @scala.inline
  def apply(
    queries: js.Array[GitPullRequestQueryInput],
    results: js.Array[StringDictionary[js.Array[GitPullRequest]]]
  ): GitPullRequestQuery = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitPullRequestQuery]
  }
}

