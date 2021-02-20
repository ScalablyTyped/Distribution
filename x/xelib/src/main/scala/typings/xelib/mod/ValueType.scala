package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueType extends StObject
@JSImport("xelib", "ValueType")
@js.native
object ValueType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
  
  @js.native
  sealed trait vtArray extends ValueType
  /* 9 */ val vtArray: typings.xelib.mod.ValueType.vtArray with Double = js.native
  
  @js.native
  sealed trait vtBytes extends ValueType
  /* 1 */ val vtBytes: typings.xelib.mod.ValueType.vtBytes with Double = js.native
  
  @js.native
  sealed trait vtColor extends ValueType
  /* 8 */ val vtColor: typings.xelib.mod.ValueType.vtColor with Double = js.native
  
  @js.native
  sealed trait vtEnum extends ValueType
  /* 7 */ val vtEnum: typings.xelib.mod.ValueType.vtEnum with Double = js.native
  
  @js.native
  sealed trait vtFlags extends ValueType
  /* 6 */ val vtFlags: typings.xelib.mod.ValueType.vtFlags with Double = js.native
  
  @js.native
  sealed trait vtNumber extends ValueType
  /* 2 */ val vtNumber: typings.xelib.mod.ValueType.vtNumber with Double = js.native
  
  @js.native
  sealed trait vtReference extends ValueType
  /* 5 */ val vtReference: typings.xelib.mod.ValueType.vtReference with Double = js.native
  
  @js.native
  sealed trait vtString extends ValueType
  /* 3 */ val vtString: typings.xelib.mod.ValueType.vtString with Double = js.native
  
  @js.native
  sealed trait vtStruct extends ValueType
  /* 10 */ val vtStruct: typings.xelib.mod.ValueType.vtStruct with Double = js.native
  
  @js.native
  sealed trait vtText extends ValueType
  /* 4 */ val vtText: typings.xelib.mod.ValueType.vtText with Double = js.native
  
  @js.native
  sealed trait vtUnknown extends ValueType
  /* 0 */ val vtUnknown: typings.xelib.mod.ValueType.vtUnknown with Double = js.native
}
