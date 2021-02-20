package typings.winrt.Windows.Data.Json

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsonErrorStatus extends StObject
@JSGlobal("Windows.Data.Json.JsonErrorStatus")
@js.native
object JsonErrorStatus extends StObject {
  
  @js.native
  sealed trait implementationLimit extends JsonErrorStatus
  
  @js.native
  sealed trait invalidJsonNumber extends JsonErrorStatus
  
  @js.native
  sealed trait invalidJsonString extends JsonErrorStatus
  
  @js.native
  sealed trait jsonValueNotFound extends JsonErrorStatus
  
  @js.native
  sealed trait unknown extends JsonErrorStatus
}
