package typings.timezonecomplete.tokenMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends js.Object
@JSImport("timezonecomplete/dist/lib/token", "TokenType")
@js.native
object TokenType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
  
  @js.native
  sealed trait DAY extends TokenType
  /* 6 */ @js.native
  object DAY extends TopLevel[DAY with Double]
  
  @js.native
  sealed trait DAYPERIOD extends TokenType
  /* 8 */ @js.native
  object DAYPERIOD extends TopLevel[DAYPERIOD with Double]
  
  @js.native
  sealed trait ERA extends TokenType
  /* 1 */ @js.native
  object ERA extends TopLevel[ERA with Double]
  
  @js.native
  sealed trait HOUR extends TokenType
  /* 9 */ @js.native
  object HOUR extends TopLevel[HOUR with Double]
  
  /**
    * Raw text
    */
  @js.native
  sealed trait IDENTITY extends TokenType
  /* 0 */ @js.native
  object IDENTITY extends TopLevel[IDENTITY with Double]
  
  @js.native
  sealed trait MINUTE extends TokenType
  /* 10 */ @js.native
  object MINUTE extends TopLevel[MINUTE with Double]
  
  @js.native
  sealed trait MONTH extends TokenType
  /* 4 */ @js.native
  object MONTH extends TopLevel[MONTH with Double]
  
  @js.native
  sealed trait QUARTER extends TokenType
  /* 3 */ @js.native
  object QUARTER extends TopLevel[QUARTER with Double]
  
  @js.native
  sealed trait SECOND extends TokenType
  /* 11 */ @js.native
  object SECOND extends TopLevel[SECOND with Double]
  
  @js.native
  sealed trait WEEK extends TokenType
  /* 5 */ @js.native
  object WEEK extends TopLevel[WEEK with Double]
  
  @js.native
  sealed trait WEEKDAY extends TokenType
  /* 7 */ @js.native
  object WEEKDAY extends TopLevel[WEEKDAY with Double]
  
  @js.native
  sealed trait YEAR extends TokenType
  /* 2 */ @js.native
  object YEAR extends TopLevel[YEAR with Double]
  
  @js.native
  sealed trait ZONE extends TokenType
  /* 12 */ @js.native
  object ZONE extends TopLevel[ZONE with Double]
}
