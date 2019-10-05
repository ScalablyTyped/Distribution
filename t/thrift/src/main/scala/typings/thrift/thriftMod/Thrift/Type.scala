package typings.thrift.thriftMod.Thrift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSImport("thrift", "Thrift.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait BOOL extends Type
  
  @js.native
  sealed trait BYTE extends Type
  
  @js.native
  sealed trait DOUBLE extends Type
  
  @js.native
  sealed trait I08 extends Type
  
  @js.native
  sealed trait I16 extends Type
  
  @js.native
  sealed trait I32 extends Type
  
  @js.native
  sealed trait I64 extends Type
  
  @js.native
  sealed trait LIST extends Type
  
  @js.native
  sealed trait MAP extends Type
  
  @js.native
  sealed trait SET extends Type
  
  @js.native
  sealed trait STOP extends Type
  
  @js.native
  sealed trait STRING extends Type
  
  @js.native
  sealed trait STRUCT extends Type
  
  @js.native
  sealed trait UTF16 extends Type
  
  @js.native
  sealed trait UTF7 extends Type
  
  @js.native
  sealed trait UTF8 extends Type
  
  @js.native
  sealed trait VOID extends Type
  
  /* 2 */ val BOOL: typings.thrift.thriftMod.Thrift.Type.BOOL with Double = js.native
  /* 3 */ val BYTE: typings.thrift.thriftMod.Thrift.Type.BYTE with Double = js.native
  /* 4 */ val DOUBLE: typings.thrift.thriftMod.Thrift.Type.DOUBLE with Double = js.native
  /* 3 */ val I08: typings.thrift.thriftMod.Thrift.Type.I08 with Double = js.native
  /* 6 */ val I16: typings.thrift.thriftMod.Thrift.Type.I16 with Double = js.native
  /* 8 */ val I32: typings.thrift.thriftMod.Thrift.Type.I32 with Double = js.native
  /* 10 */ val I64: typings.thrift.thriftMod.Thrift.Type.I64 with Double = js.native
  /* 15 */ val LIST: typings.thrift.thriftMod.Thrift.Type.LIST with Double = js.native
  /* 13 */ val MAP: typings.thrift.thriftMod.Thrift.Type.MAP with Double = js.native
  /* 14 */ val SET: typings.thrift.thriftMod.Thrift.Type.SET with Double = js.native
  /* 0 */ val STOP: typings.thrift.thriftMod.Thrift.Type.STOP with Double = js.native
  /* 11 */ val STRING: typings.thrift.thriftMod.Thrift.Type.STRING with Double = js.native
  /* 12 */ val STRUCT: typings.thrift.thriftMod.Thrift.Type.STRUCT with Double = js.native
  /* 17 */ val UTF16: typings.thrift.thriftMod.Thrift.Type.UTF16 with Double = js.native
  /* 11 */ val UTF7: typings.thrift.thriftMod.Thrift.Type.UTF7 with Double = js.native
  /* 16 */ val UTF8: typings.thrift.thriftMod.Thrift.Type.UTF8 with Double = js.native
  /* 1 */ val VOID: typings.thrift.thriftMod.Thrift.Type.VOID with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
}

