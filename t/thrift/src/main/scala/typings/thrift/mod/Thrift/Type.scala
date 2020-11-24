package typings.thrift.mod.Thrift

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends js.Object
@JSImport("thrift", "Thrift.Type")
@js.native
object Type extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  
  @js.native
  sealed trait BOOL extends Type
  /* 2 */ @js.native
  object BOOL extends TopLevel[BOOL with Double]
  
  @js.native
  sealed trait BYTE extends Type
  /* 3 */ @js.native
  object BYTE extends TopLevel[BYTE with Double]
  
  @js.native
  sealed trait DOUBLE extends Type
  /* 4 */ @js.native
  object DOUBLE extends TopLevel[DOUBLE with Double]
  
  @js.native
  sealed trait I08 extends Type
  /* 3 */ @js.native
  object I08 extends TopLevel[I08 with Double]
  
  @js.native
  sealed trait I16 extends Type
  /* 6 */ @js.native
  object I16 extends TopLevel[I16 with Double]
  
  @js.native
  sealed trait I32 extends Type
  /* 8 */ @js.native
  object I32 extends TopLevel[I32 with Double]
  
  @js.native
  sealed trait I64 extends Type
  /* 10 */ @js.native
  object I64 extends TopLevel[I64 with Double]
  
  @js.native
  sealed trait LIST extends Type
  /* 15 */ @js.native
  object LIST extends TopLevel[LIST with Double]
  
  @js.native
  sealed trait MAP extends Type
  /* 13 */ @js.native
  object MAP extends TopLevel[MAP with Double]
  
  @js.native
  sealed trait SET extends Type
  /* 14 */ @js.native
  object SET extends TopLevel[SET with Double]
  
  @js.native
  sealed trait STOP extends Type
  /* 0 */ @js.native
  object STOP extends TopLevel[STOP with Double]
  
  @js.native
  sealed trait STRING extends Type
  /* 11 */ @js.native
  object STRING extends TopLevel[STRING with Double]
  
  @js.native
  sealed trait STRUCT extends Type
  /* 12 */ @js.native
  object STRUCT extends TopLevel[STRUCT with Double]
  
  @js.native
  sealed trait UTF16 extends Type
  /* 17 */ @js.native
  object UTF16 extends TopLevel[UTF16 with Double]
  
  @js.native
  sealed trait UTF7 extends Type
  /* 11 */ @js.native
  object UTF7 extends TopLevel[UTF7 with Double]
  
  @js.native
  sealed trait UTF8 extends Type
  /* 16 */ @js.native
  object UTF8 extends TopLevel[UTF8 with Double]
  
  @js.native
  sealed trait VOID extends Type
  /* 1 */ @js.native
  object VOID extends TopLevel[VOID with Double]
}
