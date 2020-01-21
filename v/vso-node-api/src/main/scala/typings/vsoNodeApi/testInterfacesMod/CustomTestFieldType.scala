package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomTestFieldType extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "CustomTestFieldType")
@js.native
object CustomTestFieldType extends js.Object {
  @js.native
  sealed trait Bit extends CustomTestFieldType
  
  @js.native
  sealed trait DateTime extends CustomTestFieldType
  
  @js.native
  sealed trait Float extends CustomTestFieldType
  
  @js.native
  sealed trait Guid extends CustomTestFieldType
  
  @js.native
  sealed trait Int extends CustomTestFieldType
  
  @js.native
  sealed trait String extends CustomTestFieldType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomTestFieldType with Double] = js.native
  /* 2 */ @js.native
  object Bit extends TopLevel[Bit with Double]
  
  /* 4 */ @js.native
  object DateTime extends TopLevel[DateTime with Double]
  
  /* 6 */ @js.native
  object Float extends TopLevel[Float with Double]
  
  /* 14 */ @js.native
  object Guid extends TopLevel[Guid with Double]
  
  /* 8 */ @js.native
  object Int extends TopLevel[Int with Double]
  
  /* 12 */ @js.native
  object String extends TopLevel[String with Double]
  
}

