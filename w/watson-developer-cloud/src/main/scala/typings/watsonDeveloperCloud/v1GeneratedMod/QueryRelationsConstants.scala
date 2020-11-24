package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `queryRelations` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "QueryRelationsConstants")
@js.native
object QueryRelationsConstants extends js.Object {
  
  @js.native
  sealed trait Sort extends js.Object
  /** The sorting method for the relationships, can be `score` or `frequency`. `frequency` is the number of unique times each entity is identified. The default is `score`. This parameter cannot be used in the same query as the **bias** parameter. */
  @js.native
  object Sort extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    
    @js.native
    sealed trait FREQUENCY extends Sort
    /* "frequency" */ @js.native
    object FREQUENCY extends TopLevel[FREQUENCY with String]
    
    @js.native
    sealed trait SCORE extends Sort
    /* "score" */ @js.native
    object SCORE extends TopLevel[SCORE with String]
  }
}
