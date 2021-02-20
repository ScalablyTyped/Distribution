package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commit extends StObject {
  
  var commit: scala.Double = js.native
  
  var lastMergeCommit: scala.Double = js.native
  
  var notSet: scala.Double = js.native
}
object Commit {
  
  @scala.inline
  def apply(commit: scala.Double, lastMergeCommit: scala.Double, notSet: scala.Double): Commit = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], lastMergeCommit = lastMergeCommit.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
  
  @scala.inline
  implicit class CommitMutableBuilder[Self <: Commit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit(value: scala.Double): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastMergeCommit(value: scala.Double): Self = StObject.set(x, "lastMergeCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSet(value: scala.Double): Self = StObject.set(x, "notSet", value.asInstanceOf[js.Any])
  }
}
