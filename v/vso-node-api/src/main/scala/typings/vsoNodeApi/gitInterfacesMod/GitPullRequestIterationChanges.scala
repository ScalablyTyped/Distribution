package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPullRequestIterationChanges extends js.Object {
  
  /**
    * Changes made in the iteration.
    */
  var changeEntries: js.Array[GitPullRequestChange] = js.native
  
  /**
    * Value to specify as skip to get the next page of changes.  This will be zero if there are no more changes.
    */
  var nextSkip: Double = js.native
  
  /**
    * Value to specify as top to get the next page of changes.  This will be zero if there are no more changes.
    */
  var nextTop: Double = js.native
}
object GitPullRequestIterationChanges {
  
  @scala.inline
  def apply(changeEntries: js.Array[GitPullRequestChange], nextSkip: Double, nextTop: Double): GitPullRequestIterationChanges = {
    val __obj = js.Dynamic.literal(changeEntries = changeEntries.asInstanceOf[js.Any], nextSkip = nextSkip.asInstanceOf[js.Any], nextTop = nextTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestIterationChanges]
  }
  
  @scala.inline
  implicit class GitPullRequestIterationChangesOps[Self <: GitPullRequestIterationChanges] (val x: Self) extends AnyVal {
    
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
    def setChangeEntriesVarargs(value: GitPullRequestChange*): Self = this.set("changeEntries", js.Array(value :_*))
    
    @scala.inline
    def setChangeEntries(value: js.Array[GitPullRequestChange]): Self = this.set("changeEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSkip(value: Double): Self = this.set("nextSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTop(value: Double): Self = this.set("nextTop", value.asInstanceOf[js.Any])
  }
}
