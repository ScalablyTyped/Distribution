package typings.ts3NodejsLibrary.contextMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectType extends js.Object
@JSImport("ts3-nodejs-library/lib/types/context", "SelectType")
@js.native
object SelectType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectType with Double] = js.native
  
  @js.native
  sealed trait NONE extends SelectType
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait PORT extends SelectType
  /* 2 */ @js.native
  object PORT extends TopLevel[PORT with Double]
  
  @js.native
  sealed trait SID extends SelectType
  /* 1 */ @js.native
  object SID extends TopLevel[SID with Double]
}
