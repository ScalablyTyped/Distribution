package typings.thrift.mod.Thrift

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TProtocolExceptionType extends StObject
@JSImport("thrift", "Thrift.TProtocolExceptionType")
@js.native
object TProtocolExceptionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TProtocolExceptionType with Double] = js.native
  
  @js.native
  sealed trait BAD_VERSION extends TProtocolExceptionType
  /* 4 */ val BAD_VERSION: typings.thrift.mod.Thrift.TProtocolExceptionType.BAD_VERSION with Double = js.native
  
  @js.native
  sealed trait DEPTH_LIMIT extends TProtocolExceptionType
  /* 6 */ val DEPTH_LIMIT: typings.thrift.mod.Thrift.TProtocolExceptionType.DEPTH_LIMIT with Double = js.native
  
  @js.native
  sealed trait INVALID_DATA extends TProtocolExceptionType
  /* 1 */ val INVALID_DATA: typings.thrift.mod.Thrift.TProtocolExceptionType.INVALID_DATA with Double = js.native
  
  @js.native
  sealed trait NEGATIVE_SIZE extends TProtocolExceptionType
  /* 2 */ val NEGATIVE_SIZE: typings.thrift.mod.Thrift.TProtocolExceptionType.NEGATIVE_SIZE with Double = js.native
  
  @js.native
  sealed trait NOT_IMPLEMENTED extends TProtocolExceptionType
  /* 5 */ val NOT_IMPLEMENTED: typings.thrift.mod.Thrift.TProtocolExceptionType.NOT_IMPLEMENTED with Double = js.native
  
  @js.native
  sealed trait SIZE_LIMIT extends TProtocolExceptionType
  /* 3 */ val SIZE_LIMIT: typings.thrift.mod.Thrift.TProtocolExceptionType.SIZE_LIMIT with Double = js.native
  
  @js.native
  sealed trait UNKNOWN extends TProtocolExceptionType
  /* 0 */ val UNKNOWN: typings.thrift.mod.Thrift.TProtocolExceptionType.UNKNOWN with Double = js.native
}
