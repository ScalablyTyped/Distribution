package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueType extends StObject
@JSImport("xelib", "ValueType")
@js.native
object ValueType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType & Double] = js.native
  
  @js.native
  sealed trait vtArray
    extends StObject
       with ValueType
  /* 9 */ val vtArray: typings.xelib.mod.ValueType.vtArray & Double = js.native
  
  @js.native
  sealed trait vtBytes
    extends StObject
       with ValueType
  /* 1 */ val vtBytes: typings.xelib.mod.ValueType.vtBytes & Double = js.native
  
  @js.native
  sealed trait vtColor
    extends StObject
       with ValueType
  /* 8 */ val vtColor: typings.xelib.mod.ValueType.vtColor & Double = js.native
  
  @js.native
  sealed trait vtEnum
    extends StObject
       with ValueType
  /* 7 */ val vtEnum: typings.xelib.mod.ValueType.vtEnum & Double = js.native
  
  @js.native
  sealed trait vtFlags
    extends StObject
       with ValueType
  /* 6 */ val vtFlags: typings.xelib.mod.ValueType.vtFlags & Double = js.native
  
  @js.native
  sealed trait vtNumber
    extends StObject
       with ValueType
  /* 2 */ val vtNumber: typings.xelib.mod.ValueType.vtNumber & Double = js.native
  
  @js.native
  sealed trait vtReference
    extends StObject
       with ValueType
  /* 5 */ val vtReference: typings.xelib.mod.ValueType.vtReference & Double = js.native
  
  @js.native
  sealed trait vtString
    extends StObject
       with ValueType
  /* 3 */ val vtString: typings.xelib.mod.ValueType.vtString & Double = js.native
  
  @js.native
  sealed trait vtStruct
    extends StObject
       with ValueType
  /* 10 */ val vtStruct: typings.xelib.mod.ValueType.vtStruct & Double = js.native
  
  @js.native
  sealed trait vtText
    extends StObject
       with ValueType
  /* 4 */ val vtText: typings.xelib.mod.ValueType.vtText & Double = js.native
  
  @js.native
  sealed trait vtUnknown
    extends StObject
       with ValueType
  /* 0 */ val vtUnknown: typings.xelib.mod.ValueType.vtUnknown & Double = js.native
}
