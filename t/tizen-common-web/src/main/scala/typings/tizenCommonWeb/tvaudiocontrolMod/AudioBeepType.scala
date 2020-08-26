package typings.tizenCommonWeb.tvaudiocontrolMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioBeepType extends js.Object

@JSImport("tizen-common-web/tvaudiocontrol", "AudioBeepType")
@js.native
object AudioBeepType extends js.Object {
  @js.native
  sealed trait BACK extends AudioBeepType
  
  @js.native
  sealed trait CANCEL extends AudioBeepType
  
  @js.native
  sealed trait DOWN extends AudioBeepType
  
  @js.native
  sealed trait KEYPAD extends AudioBeepType
  
  @js.native
  sealed trait KEYPAD_DEL extends AudioBeepType
  
  @js.native
  sealed trait KEYPAD_ENTER extends AudioBeepType
  
  @js.native
  sealed trait LEFT extends AudioBeepType
  
  @js.native
  sealed trait MOVE extends AudioBeepType
  
  @js.native
  sealed trait PAGE_LEFT extends AudioBeepType
  
  @js.native
  sealed trait PAGE_RIGHT extends AudioBeepType
  
  @js.native
  sealed trait PREPARING extends AudioBeepType
  
  @js.native
  sealed trait RIGHT extends AudioBeepType
  
  @js.native
  sealed trait SELECT extends AudioBeepType
  
  @js.native
  sealed trait UP extends AudioBeepType
  
  @js.native
  sealed trait WARNING extends AudioBeepType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AudioBeepType with String] = js.native
  /* "BACK" */ @js.native
  object BACK extends TopLevel[BACK with String]
  
  /* "CANCEL" */ @js.native
  object CANCEL extends TopLevel[CANCEL with String]
  
  /* "DOWN" */ @js.native
  object DOWN extends TopLevel[DOWN with String]
  
  /* "KEYPAD" */ @js.native
  object KEYPAD extends TopLevel[KEYPAD with String]
  
  /* "KEYPAD_DEL" */ @js.native
  object KEYPAD_DEL extends TopLevel[KEYPAD_DEL with String]
  
  /* "KEYPAD_ENTER" */ @js.native
  object KEYPAD_ENTER extends TopLevel[KEYPAD_ENTER with String]
  
  /* "LEFT" */ @js.native
  object LEFT extends TopLevel[LEFT with String]
  
  /* "MOVE" */ @js.native
  object MOVE extends TopLevel[MOVE with String]
  
  /* "PAGE_LEFT" */ @js.native
  object PAGE_LEFT extends TopLevel[PAGE_LEFT with String]
  
  /* "PAGE_RIGHT" */ @js.native
  object PAGE_RIGHT extends TopLevel[PAGE_RIGHT with String]
  
  /* "PREPARING" */ @js.native
  object PREPARING extends TopLevel[PREPARING with String]
  
  /* "RIGHT" */ @js.native
  object RIGHT extends TopLevel[RIGHT with String]
  
  /* "SELECT" */ @js.native
  object SELECT extends TopLevel[SELECT with String]
  
  /* "UP" */ @js.native
  object UP extends TopLevel[UP with String]
  
  /* "WARNING" */ @js.native
  object WARNING extends TopLevel[WARNING with String]
  
}

