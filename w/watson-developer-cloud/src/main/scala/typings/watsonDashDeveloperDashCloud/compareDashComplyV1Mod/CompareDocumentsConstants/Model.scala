package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants

import org.scalablytyped.runtime.TopLevel
import typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.Model.CONTRACTS
import typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.Model.TABLES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Model extends js.Object

/** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
@JSImport("watson-developer-cloud/compare-comply/v1", "CompareDocumentsConstants.Model")
@js.native
object Model extends js.Object {
  @js.native
  sealed trait CONTRACTS extends Model
  
  @js.native
  sealed trait TABLES extends Model
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Model with String] = js.native
  /* "contracts" */ @js.native
  object CONTRACTS extends TopLevel[CONTRACTS with String]
  
  /* "tables" */ @js.native
  object TABLES extends TopLevel[TABLES with String]
  
}

