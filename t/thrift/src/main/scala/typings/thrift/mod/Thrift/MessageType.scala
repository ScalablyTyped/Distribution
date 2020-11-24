package typings.thrift.mod.Thrift

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageType extends js.Object
@JSImport("thrift", "Thrift.MessageType")
@js.native
object MessageType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageType with Double] = js.native
  
  @js.native
  sealed trait CALL extends MessageType
  /* 1 */ @js.native
  object CALL extends TopLevel[CALL with Double]
  
  @js.native
  sealed trait EXCEPTION extends MessageType
  /* 3 */ @js.native
  object EXCEPTION extends TopLevel[EXCEPTION with Double]
  
  @js.native
  sealed trait ONEWAY extends MessageType
  /* 4 */ @js.native
  object ONEWAY extends TopLevel[ONEWAY with Double]
  
  @js.native
  sealed trait REPLY extends MessageType
  /* 2 */ @js.native
  object REPLY extends TopLevel[REPLY with Double]
}
