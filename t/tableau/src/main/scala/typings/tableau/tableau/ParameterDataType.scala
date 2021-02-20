package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterDataType extends StObject
@JSGlobal("tableau.ParameterDataType")
@js.native
object ParameterDataType extends StObject {
  
  @js.native
  sealed trait BOOLEAN extends ParameterDataType
  
  @js.native
  sealed trait DATE extends ParameterDataType
  
  @js.native
  sealed trait DATETIME extends ParameterDataType
  
  @js.native
  sealed trait FLOAT extends ParameterDataType
  
  @js.native
  sealed trait INTEGER extends ParameterDataType
  
  @js.native
  sealed trait STRING extends ParameterDataType
}
