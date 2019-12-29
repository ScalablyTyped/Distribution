package typings.thrift.thriftMod.Thrift

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageType with Double] = js.native
  /* 1 */ @js.native
  object CALL extends TopLevel[CALL with Double]
  
  /* 3 */ @js.native
  object EXCEPTION extends TopLevel[EXCEPTION with Double]
  
  /* 4 */ @js.native
  object ONEWAY extends TopLevel[ONEWAY with Double]
  
  /* 2 */ @js.native
  object REPLY extends TopLevel[REPLY with Double]
  
}

