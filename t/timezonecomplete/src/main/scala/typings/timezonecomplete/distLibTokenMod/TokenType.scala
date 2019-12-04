package typings.timezonecomplete.distLibTokenMod

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
  
  /* 6 */ val DAY: typings.timezonecomplete.distLibTokenMod.TokenType.DAY with Double = js.native
  /* 8 */ val DAYPERIOD: typings.timezonecomplete.distLibTokenMod.TokenType.DAYPERIOD with Double = js.native
  /* 1 */ val ERA: typings.timezonecomplete.distLibTokenMod.TokenType.ERA with Double = js.native
  /* 9 */ val HOUR: typings.timezonecomplete.distLibTokenMod.TokenType.HOUR with Double = js.native
  /* 0 */ val IDENTITY: typings.timezonecomplete.distLibTokenMod.TokenType.IDENTITY with Double = js.native
  /* 10 */ val MINUTE: typings.timezonecomplete.distLibTokenMod.TokenType.MINUTE with Double = js.native
  /* 4 */ val MONTH: typings.timezonecomplete.distLibTokenMod.TokenType.MONTH with Double = js.native
  /* 3 */ val QUARTER: typings.timezonecomplete.distLibTokenMod.TokenType.QUARTER with Double = js.native
  /* 11 */ val SECOND: typings.timezonecomplete.distLibTokenMod.TokenType.SECOND with Double = js.native
  /* 5 */ val WEEK: typings.timezonecomplete.distLibTokenMod.TokenType.WEEK with Double = js.native
  /* 7 */ val WEEKDAY: typings.timezonecomplete.distLibTokenMod.TokenType.WEEKDAY with Double = js.native
  /* 2 */ val YEAR: typings.timezonecomplete.distLibTokenMod.TokenType.YEAR with Double = js.native
  /* 12 */ val ZONE: typings.timezonecomplete.distLibTokenMod.TokenType.ZONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
}

