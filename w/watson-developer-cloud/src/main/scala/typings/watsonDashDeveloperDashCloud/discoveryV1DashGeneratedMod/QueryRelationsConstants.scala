package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import org.scalablytyped.runtime.TopLevel
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.QueryRelationsConstants.Sort
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.QueryRelationsConstants.Sort.FREQUENCY
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.QueryRelationsConstants.Sort.SCORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `queryRelations` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "QueryRelationsConstants")
@js.native
object QueryRelationsConstants extends js.Object {
  @js.native
  sealed trait Sort extends js.Object
  
  /** The sorting method for the relationships, can be `score` or `frequency`. `frequency` is the number of unique times each entity is identified. The default is `score`. This parameter cannot be used in the same query as the **bias** parameter. */
  @js.native
  object Sort extends js.Object {
    @js.native
    sealed trait FREQUENCY extends Sort
    
    @js.native
    sealed trait SCORE extends Sort
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    /* "frequency" */ @js.native
    object FREQUENCY extends TopLevel[FREQUENCY with String]
    
    /* "score" */ @js.native
    object SCORE extends TopLevel[SCORE with String]
    
  }
  
}

