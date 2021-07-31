package typings.umbraco.umbraco.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Direction extends StObject
/**
  * Can be Ascending or Descending - Default: Ascending
  */
@JSGlobal("umbraco.resources.Direction")
@js.native
object Direction extends StObject {
  
  @js.native
  sealed trait Ascending
    extends StObject
       with Direction
  
  @js.native
  sealed trait Descending
    extends StObject
       with Direction
}
