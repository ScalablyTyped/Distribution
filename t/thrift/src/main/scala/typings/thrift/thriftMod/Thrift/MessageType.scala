package typings.thrift.thriftMod.Thrift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageType extends js.Object

@JSImport("thrift", "Thrift.MessageType")
@js.native
object MessageType extends js.Object {
  @js.native
  sealed trait CALL extends MessageType
  
  @js.native
  sealed trait EXCEPTION extends MessageType
  
  @js.native
  sealed trait ONEWAY extends MessageType
  
  @js.native
  sealed trait REPLY extends MessageType
  
  /* 1 */ val CALL: typings.thrift.thriftMod.Thrift.MessageType.CALL with Double = js.native
  /* 3 */ val EXCEPTION: typings.thrift.thriftMod.Thrift.MessageType.EXCEPTION with Double = js.native
  /* 4 */ val ONEWAY: typings.thrift.thriftMod.Thrift.MessageType.ONEWAY with Double = js.native
  /* 2 */ val REPLY: typings.thrift.thriftMod.Thrift.MessageType.REPLY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageType with Double] = js.native
}

