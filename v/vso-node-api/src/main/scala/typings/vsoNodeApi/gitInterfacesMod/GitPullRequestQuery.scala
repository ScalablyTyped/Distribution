package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPullRequestQuery extends js.Object {
  
  /**
    * The queries to perform.
    */
  var queries: js.Array[GitPullRequestQueryInput] = js.native
  
  /**
    * The results of the queries. This matches the QueryInputs list so Results[n] are the results of QueryInputs[n]. Each entry in the list is a dictionary of commit->pull requests.
    */
  var results: js.Array[StringDictionary[js.Array[GitPullRequest]]] = js.native
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
  
  @scala.inline
  implicit class GitPullRequestQueryOps[Self <: GitPullRequestQuery] (val x: Self) extends AnyVal {
    
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
    def setQueriesVarargs(value: GitPullRequestQueryInput*): Self = this.set("queries", js.Array(value :_*))
    
    @scala.inline
    def setQueries(value: js.Array[GitPullRequestQueryInput]): Self = this.set("queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: StringDictionary[js.Array[GitPullRequest]]*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[StringDictionary[js.Array[GitPullRequest]]]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
