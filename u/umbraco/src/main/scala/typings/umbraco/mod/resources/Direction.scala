package typings.umbraco.mod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Can be Ascending or Descending - Default: Ascending
  */
@JSImport("umbraco", "resources.Direction")
@js.native
object Direction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.umbraco.umbraco.resources.Direction with Double] = js.native
  
  /* 0 */ val Ascending: typings.umbraco.umbraco.resources.Direction.Ascending with Double = js.native
  
  /* 1 */ val Descending: typings.umbraco.umbraco.resources.Direction.Descending with Double = js.native
}
