package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterDataType extends StObject
@JSGlobal("tableau.ParameterDataType")
@js.native
object ParameterDataType extends StObject {
  
  @js.native
  sealed trait BOOLEAN
    extends StObject
       with ParameterDataType
  
  @js.native
  sealed trait DATE
    extends StObject
       with ParameterDataType
  
  @js.native
  sealed trait DATETIME
    extends StObject
       with ParameterDataType
  
  @js.native
  sealed trait FLOAT
    extends StObject
       with ParameterDataType
  
  @js.native
  sealed trait INTEGER
    extends StObject
       with ParameterDataType
  
  @js.native
  sealed trait STRING
    extends StObject
       with ParameterDataType
}
