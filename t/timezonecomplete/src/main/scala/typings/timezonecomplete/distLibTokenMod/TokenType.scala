package typings.timezonecomplete.distLibTokenMod

import org.scalablytyped.runtime.TopLevel
import typings.timezonecomplete.distLibTokenMod.TokenType.DAY
import typings.timezonecomplete.distLibTokenMod.TokenType.DAYPERIOD
import typings.timezonecomplete.distLibTokenMod.TokenType.ERA
import typings.timezonecomplete.distLibTokenMod.TokenType.HOUR
import typings.timezonecomplete.distLibTokenMod.TokenType.IDENTITY
import typings.timezonecomplete.distLibTokenMod.TokenType.MINUTE
import typings.timezonecomplete.distLibTokenMod.TokenType.MONTH
import typings.timezonecomplete.distLibTokenMod.TokenType.QUARTER
import typings.timezonecomplete.distLibTokenMod.TokenType.SECOND
import typings.timezonecomplete.distLibTokenMod.TokenType.WEEK
import typings.timezonecomplete.distLibTokenMod.TokenType.WEEKDAY
import typings.timezonecomplete.distLibTokenMod.TokenType.YEAR
import typings.timezonecomplete.distLibTokenMod.TokenType.ZONE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenType extends js.Object

@JSImport("timezonecomplete/dist/lib/token", "TokenType")
@js.native
object TokenType extends js.Object {
  @js.native
  sealed trait DAY extends TokenType
  
  @js.native
  sealed trait DAYPERIOD extends TokenType
  
  @js.native
  sealed trait ERA extends TokenType
  
  @js.native
  sealed trait HOUR extends TokenType
  
  /**
    * Raw text
    */
  @js.native
  sealed trait IDENTITY extends TokenType
  
  @js.native
  sealed trait MINUTE extends TokenType
  
  @js.native
  sealed trait MONTH extends TokenType
  
  @js.native
  sealed trait QUARTER extends TokenType
  
  @js.native
  sealed trait SECOND extends TokenType
  
  @js.native
  sealed trait WEEK extends TokenType
  
  @js.native
  sealed trait WEEKDAY extends TokenType
  
  @js.native
  sealed trait YEAR extends TokenType
  
  @js.native
  sealed trait ZONE extends TokenType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
  /* 6 */ @js.native
  object DAY extends TopLevel[DAY with Double]
  
  /* 8 */ @js.native
  object DAYPERIOD extends TopLevel[DAYPERIOD with Double]
  
  /* 1 */ @js.native
  object ERA extends TopLevel[ERA with Double]
  
  /* 9 */ @js.native
  object HOUR extends TopLevel[HOUR with Double]
  
  /* 0 */ @js.native
  object IDENTITY extends TopLevel[IDENTITY with Double]
  
  /* 10 */ @js.native
  object MINUTE extends TopLevel[MINUTE with Double]
  
  /* 4 */ @js.native
  object MONTH extends TopLevel[MONTH with Double]
  
  /* 3 */ @js.native
  object QUARTER extends TopLevel[QUARTER with Double]
  
  /* 11 */ @js.native
  object SECOND extends TopLevel[SECOND with Double]
  
  /* 5 */ @js.native
  object WEEK extends TopLevel[WEEK with Double]
  
  /* 7 */ @js.native
  object WEEKDAY extends TopLevel[WEEKDAY with Double]
  
  /* 2 */ @js.native
  object YEAR extends TopLevel[YEAR with Double]
  
  /* 12 */ @js.native
  object ZONE extends TopLevel[ZONE with Double]
  
}

