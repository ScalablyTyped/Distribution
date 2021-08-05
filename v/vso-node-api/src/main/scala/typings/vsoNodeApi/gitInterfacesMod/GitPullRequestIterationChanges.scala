package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPullRequestIterationChanges extends StObject {
  
  /**
    * Changes made in the iteration.
    */
  var changeEntries: js.Array[GitPullRequestChange]
  
  /**
    * Value to specify as skip to get the next page of changes.  This will be zero if there are no more changes.
    */
  var nextSkip: Double
  
  /**
    * Value to specify as top to get the next page of changes.  This will be zero if there are no more changes.
    */
  var nextTop: Double
}
object GitPullRequestIterationChanges {
  
  inline def apply(changeEntries: js.Array[GitPullRequestChange], nextSkip: Double, nextTop: Double): GitPullRequestIterationChanges = {
    val __obj = js.Dynamic.literal(changeEntries = changeEntries.asInstanceOf[js.Any], nextSkip = nextSkip.asInstanceOf[js.Any], nextTop = nextTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestIterationChanges]
  }
  
  extension [Self <: GitPullRequestIterationChanges](x: Self) {
    
    inline def setChangeEntries(value: js.Array[GitPullRequestChange]): Self = StObject.set(x, "changeEntries", value.asInstanceOf[js.Any])
    
    inline def setChangeEntriesVarargs(value: GitPullRequestChange*): Self = StObject.set(x, "changeEntries", js.Array(value :_*))
    
    inline def setNextSkip(value: Double): Self = StObject.set(x, "nextSkip", value.asInstanceOf[js.Any])
    
    inline def setNextTop(value: Double): Self = StObject.set(x, "nextTop", value.asInstanceOf[js.Any])
  }
}
