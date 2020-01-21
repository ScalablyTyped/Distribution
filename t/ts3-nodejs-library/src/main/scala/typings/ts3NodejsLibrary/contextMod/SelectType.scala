package typings.ts3NodejsLibrary.contextMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectType extends js.Object

@JSImport("ts3-nodejs-library/lib/types/context", "SelectType")
@js.native
object SelectType extends js.Object {
  @js.native
  sealed trait NONE extends SelectType
  
  @js.native
  sealed trait PORT extends SelectType
  
  @js.native
  sealed trait SID extends SelectType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectType with Double] = js.native
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 2 */ @js.native
  object PORT extends TopLevel[PORT with Double]
  
  /* 1 */ @js.native
  object SID extends TopLevel[SID with Double]
  
}

