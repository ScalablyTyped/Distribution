package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search args
  */
trait ISearchArgs extends StObject {
  
  var term: String
}
object ISearchArgs {
  
  inline def apply(term: String): ISearchArgs = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchArgs]
  }
  
  extension [Self <: ISearchArgs](x: Self) {
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
  }
}
