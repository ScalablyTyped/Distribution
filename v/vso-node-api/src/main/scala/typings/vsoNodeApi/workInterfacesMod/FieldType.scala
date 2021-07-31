package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "FieldType")
@js.native
object FieldType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType & scala.Double] = js.native
  
  @js.native
  sealed trait Boolean
    extends StObject
       with FieldType
  /* 5 */ val Boolean: typings.vsoNodeApi.workInterfacesMod.FieldType.Boolean & scala.Double = js.native
  
  @js.native
  sealed trait DateTime
    extends StObject
       with FieldType
  /* 3 */ val DateTime: typings.vsoNodeApi.workInterfacesMod.FieldType.DateTime & scala.Double = js.native
  
  @js.native
  sealed trait Double
    extends StObject
       with FieldType
  /* 6 */ val Double: typings.vsoNodeApi.workInterfacesMod.FieldType.Double & scala.Double = js.native
  
  @js.native
  sealed trait Integer
    extends StObject
       with FieldType
  /* 2 */ val Integer: typings.vsoNodeApi.workInterfacesMod.FieldType.Integer & scala.Double = js.native
  
  @js.native
  sealed trait PlainText
    extends StObject
       with FieldType
  /* 1 */ val PlainText: typings.vsoNodeApi.workInterfacesMod.FieldType.PlainText & scala.Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with FieldType
  /* 0 */ val String: typings.vsoNodeApi.workInterfacesMod.FieldType.String & scala.Double = js.native
  
  @js.native
  sealed trait TreePath
    extends StObject
       with FieldType
  /* 4 */ val TreePath: typings.vsoNodeApi.workInterfacesMod.FieldType.TreePath & scala.Double = js.native
}
