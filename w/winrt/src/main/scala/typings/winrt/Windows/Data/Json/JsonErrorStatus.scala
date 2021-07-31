package typings.winrt.Windows.Data.Json

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsonErrorStatus extends StObject
@JSGlobal("Windows.Data.Json.JsonErrorStatus")
@js.native
object JsonErrorStatus extends StObject {
  
  @js.native
  sealed trait implementationLimit
    extends StObject
       with JsonErrorStatus
  
  @js.native
  sealed trait invalidJsonNumber
    extends StObject
       with JsonErrorStatus
  
  @js.native
  sealed trait invalidJsonString
    extends StObject
       with JsonErrorStatus
  
  @js.native
  sealed trait jsonValueNotFound
    extends StObject
       with JsonErrorStatus
  
  @js.native
  sealed trait unknown
    extends StObject
       with JsonErrorStatus
}
