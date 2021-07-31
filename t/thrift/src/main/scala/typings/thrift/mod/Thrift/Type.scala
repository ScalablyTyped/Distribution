package typings.thrift.mod.Thrift

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends StObject
@JSImport("thrift", "Thrift.Type")
@js.native
object Type extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type & Double] = js.native
  
  @js.native
  sealed trait BOOL
    extends StObject
       with Type
  /* 2 */ val BOOL: typings.thrift.mod.Thrift.Type.BOOL & Double = js.native
  
  @js.native
  sealed trait BYTE
    extends StObject
       with Type
  /* 3 */ val BYTE: typings.thrift.mod.Thrift.Type.BYTE & Double = js.native
  
  @js.native
  sealed trait DOUBLE
    extends StObject
       with Type
  /* 4 */ val DOUBLE: typings.thrift.mod.Thrift.Type.DOUBLE & Double = js.native
  
  @js.native
  sealed trait I08
    extends StObject
       with Type
  /* 3 */ val I08: typings.thrift.mod.Thrift.Type.I08 & Double = js.native
  
  @js.native
  sealed trait I16
    extends StObject
       with Type
  /* 6 */ val I16: typings.thrift.mod.Thrift.Type.I16 & Double = js.native
  
  @js.native
  sealed trait I32
    extends StObject
       with Type
  /* 8 */ val I32: typings.thrift.mod.Thrift.Type.I32 & Double = js.native
  
  @js.native
  sealed trait I64
    extends StObject
       with Type
  /* 10 */ val I64: typings.thrift.mod.Thrift.Type.I64 & Double = js.native
  
  @js.native
  sealed trait LIST
    extends StObject
       with Type
  /* 15 */ val LIST: typings.thrift.mod.Thrift.Type.LIST & Double = js.native
  
  @js.native
  sealed trait MAP
    extends StObject
       with Type
  /* 13 */ val MAP: typings.thrift.mod.Thrift.Type.MAP & Double = js.native
  
  @js.native
  sealed trait SET
    extends StObject
       with Type
  /* 14 */ val SET: typings.thrift.mod.Thrift.Type.SET & Double = js.native
  
  @js.native
  sealed trait STOP
    extends StObject
       with Type
  /* 0 */ val STOP: typings.thrift.mod.Thrift.Type.STOP & Double = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with Type
  /* 11 */ val STRING: typings.thrift.mod.Thrift.Type.STRING & Double = js.native
  
  @js.native
  sealed trait STRUCT
    extends StObject
       with Type
  /* 12 */ val STRUCT: typings.thrift.mod.Thrift.Type.STRUCT & Double = js.native
  
  @js.native
  sealed trait UTF16
    extends StObject
       with Type
  /* 17 */ val UTF16: typings.thrift.mod.Thrift.Type.UTF16 & Double = js.native
  
  @js.native
  sealed trait UTF7
    extends StObject
       with Type
  /* 11 */ val UTF7: typings.thrift.mod.Thrift.Type.UTF7 & Double = js.native
  
  @js.native
  sealed trait UTF8
    extends StObject
       with Type
  /* 16 */ val UTF8: typings.thrift.mod.Thrift.Type.UTF8 & Double = js.native
  
  @js.native
  sealed trait VOID
    extends StObject
       with Type
  /* 1 */ val VOID: typings.thrift.mod.Thrift.Type.VOID & Double = js.native
}
