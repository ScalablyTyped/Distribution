package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputDataType extends js.Object
@JSImport("vso-node-api/interfaces/common/FormInputInterfaces", "InputDataType")
@js.native
object InputDataType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputDataType with Double] = js.native
  
  /**
    * Represents a value of true or false.
    */
  @js.native
  sealed trait Boolean extends InputDataType
  /* 30 */ @js.native
  object Boolean extends TopLevel[Boolean with Double]
  
  /**
    * Represents a Guid.
    */
  @js.native
  sealed trait Guid extends InputDataType
  /* 40 */ @js.native
  object Guid extends TopLevel[Guid with Double]
  
  /**
    * No data type is specified.
    */
  @js.native
  sealed trait None extends InputDataType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Represents a numberic value.
    */
  @js.native
  sealed trait Number extends InputDataType
  /* 20 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  /**
    * Represents a textual value.
    */
  @js.native
  sealed trait String extends InputDataType
  /* 10 */ @js.native
  object String extends TopLevel[String with Double]
  
  /**
    * Represents a URI.
    */
  @js.native
  sealed trait Uri extends InputDataType
  /* 50 */ @js.native
  object Uri extends TopLevel[Uri with Double]
}
