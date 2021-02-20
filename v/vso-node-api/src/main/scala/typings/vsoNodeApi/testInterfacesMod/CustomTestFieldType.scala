package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomTestFieldType extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "CustomTestFieldType")
@js.native
object CustomTestFieldType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomTestFieldType with Double] = js.native
  
  @js.native
  sealed trait Bit extends CustomTestFieldType
  /* 2 */ val Bit: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldType.Bit with Double = js.native
  
  @js.native
  sealed trait DateTime extends CustomTestFieldType
  /* 4 */ val DateTime: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldType.DateTime with Double = js.native
  
  @js.native
  sealed trait Float extends CustomTestFieldType
  /* 6 */ val Float: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldType.Float with Double = js.native
  
  @js.native
  sealed trait Guid extends CustomTestFieldType
  /* 14 */ val Guid: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldType.Guid with Double = js.native
  
  @js.native
  sealed trait Int extends CustomTestFieldType
  /* 8 */ val Int: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldType.Int with Double = js.native
  
  @js.native
  sealed trait String extends CustomTestFieldType
  /* 12 */ val String: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldType.String with Double = js.native
}
