package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `queryRelations` operation. */
object QueryRelationsConstants {
  
  @js.native
  sealed trait Sort extends StObject
  /** The sorting method for the relationships, can be `score` or `frequency`. `frequency` is the number of unique times each entity is identified. The default is `score`. This parameter cannot be used in the same query as the **bias** parameter. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "QueryRelationsConstants.Sort")
  @js.native
  object Sort extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort & String] = js.native
    
    @js.native
    sealed trait FREQUENCY
      extends StObject
         with Sort
    /* "frequency" */ val FREQUENCY: typings.watsonDeveloperCloud.v1GeneratedMod.QueryRelationsConstants.Sort.FREQUENCY & String = js.native
    
    @js.native
    sealed trait SCORE
      extends StObject
         with Sort
    /* "score" */ val SCORE: typings.watsonDeveloperCloud.v1GeneratedMod.QueryRelationsConstants.Sort.SCORE & String = js.native
  }
}
