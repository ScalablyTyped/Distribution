package typings.winrt.Windows.Data.Json

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsonValueType extends StObject
@JSGlobal("Windows.Data.Json.JsonValueType")
@js.native
object JsonValueType extends StObject {
  
  @js.native
  sealed trait array
    extends StObject
       with JsonValueType
  
  @js.native
  sealed trait boolean
    extends StObject
       with JsonValueType
  
  @js.native
  sealed trait null_
    extends StObject
       with JsonValueType
  
  @js.native
  sealed trait number
    extends StObject
       with JsonValueType
  
  @js.native
  sealed trait `object`
    extends StObject
       with JsonValueType
  
  @js.native
  sealed trait string
    extends StObject
       with JsonValueType
}
