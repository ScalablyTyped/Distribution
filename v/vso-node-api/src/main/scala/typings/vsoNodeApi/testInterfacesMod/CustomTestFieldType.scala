package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomTestFieldType extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "CustomTestFieldType")
@js.native
object CustomTestFieldType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomTestFieldType & Double] = js.native
  
  @js.native
  sealed trait Bit
    extends StObject
       with CustomTestFieldType
  /* 2 */ val Bit: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldType.Bit & Double = js.native
  
  @js.native
  sealed trait DateTime
    extends StObject
       with CustomTestFieldType
  /* 4 */ val DateTime: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldType.DateTime & Double = js.native
  
  @js.native
  sealed trait Float
    extends StObject
       with CustomTestFieldType
  /* 6 */ val Float: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldType.Float & Double = js.native
  
  @js.native
  sealed trait Guid
    extends StObject
       with CustomTestFieldType
  /* 14 */ val Guid: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldType.Guid & Double = js.native
  
  @js.native
  sealed trait Int
    extends StObject
       with CustomTestFieldType
  /* 8 */ val Int: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldType.Int & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with CustomTestFieldType
  /* 12 */ val String: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldType.String & Double = js.native
}
