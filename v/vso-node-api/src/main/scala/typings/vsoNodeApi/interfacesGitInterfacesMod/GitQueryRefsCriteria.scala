package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitQueryRefsCriteria extends StObject {
  
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
  
  inline def apply(commitIds: js.Array[String], refNames: js.Array[String], searchType: GitRefSearchType): GitQueryRefsCriteria = {
    val __obj = js.Dynamic.literal(commitIds = commitIds.asInstanceOf[js.Any], refNames = refNames.asInstanceOf[js.Any], searchType = searchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitQueryRefsCriteria]
  }
  
  extension [Self <: GitQueryRefsCriteria](x: Self) {
    
    inline def setCommitIds(value: js.Array[String]): Self = StObject.set(x, "commitIds", value.asInstanceOf[js.Any])
    
    inline def setCommitIdsVarargs(value: String*): Self = StObject.set(x, "commitIds", js.Array(value*))
    
    inline def setRefNames(value: js.Array[String]): Self = StObject.set(x, "refNames", value.asInstanceOf[js.Any])
    
    inline def setRefNamesVarargs(value: String*): Self = StObject.set(x, "refNames", js.Array(value*))
    
    inline def setSearchType(value: GitRefSearchType): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
  }
}
