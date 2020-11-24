package typings.tizenCommonWeb.tvaudiocontrolMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioBeepType extends js.Object
@JSImport("tizen-common-web/tvaudiocontrol", "AudioBeepType")
@js.native
object AudioBeepType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AudioBeepType with String] = js.native
  
  @js.native
  sealed trait BACK extends AudioBeepType
  /* "BACK" */ @js.native
  object BACK extends TopLevel[BACK with String]
  
  @js.native
  sealed trait CANCEL extends AudioBeepType
  /* "CANCEL" */ @js.native
  object CANCEL extends TopLevel[CANCEL with String]
  
  @js.native
  sealed trait DOWN extends AudioBeepType
  /* "DOWN" */ @js.native
  object DOWN extends TopLevel[DOWN with String]
  
  @js.native
  sealed trait KEYPAD extends AudioBeepType
  /* "KEYPAD" */ @js.native
  object KEYPAD extends TopLevel[KEYPAD with String]
  
  @js.native
  sealed trait KEYPAD_DEL extends AudioBeepType
  /* "KEYPAD_DEL" */ @js.native
  object KEYPAD_DEL extends TopLevel[KEYPAD_DEL with String]
  
  @js.native
  sealed trait KEYPAD_ENTER extends AudioBeepType
  /* "KEYPAD_ENTER" */ @js.native
  object KEYPAD_ENTER extends TopLevel[KEYPAD_ENTER with String]
  
  @js.native
  sealed trait LEFT extends AudioBeepType
  /* "LEFT" */ @js.native
  object LEFT extends TopLevel[LEFT with String]
  
  @js.native
  sealed trait MOVE extends AudioBeepType
  /* "MOVE" */ @js.native
  object MOVE extends TopLevel[MOVE with String]
  
  @js.native
  sealed trait PAGE_LEFT extends AudioBeepType
  /* "PAGE_LEFT" */ @js.native
  object PAGE_LEFT extends TopLevel[PAGE_LEFT with String]
  
  @js.native
  sealed trait PAGE_RIGHT extends AudioBeepType
  /* "PAGE_RIGHT" */ @js.native
  object PAGE_RIGHT extends TopLevel[PAGE_RIGHT with String]
  
  @js.native
  sealed trait PREPARING extends AudioBeepType
  /* "PREPARING" */ @js.native
  object PREPARING extends TopLevel[PREPARING with String]
  
  @js.native
  sealed trait RIGHT extends AudioBeepType
  /* "RIGHT" */ @js.native
  object RIGHT extends TopLevel[RIGHT with String]
  
  @js.native
  sealed trait SELECT extends AudioBeepType
  /* "SELECT" */ @js.native
  object SELECT extends TopLevel[SELECT with String]
  
  @js.native
  sealed trait UP extends AudioBeepType
  /* "UP" */ @js.native
  object UP extends TopLevel[UP with String]
  
  @js.native
  sealed trait WARNING extends AudioBeepType
  /* "WARNING" */ @js.native
  object WARNING extends TopLevel[WARNING with String]
}
