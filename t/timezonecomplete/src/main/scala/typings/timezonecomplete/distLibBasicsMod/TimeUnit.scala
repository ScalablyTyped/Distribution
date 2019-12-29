package typings.timezonecomplete.distLibBasicsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeUnit extends js.Object

@JSImport("timezonecomplete/dist/lib/basics", "TimeUnit")
@js.native
object TimeUnit extends js.Object {
  @js.native
  sealed trait Day extends TimeUnit
  
  @js.native
  sealed trait Hour extends TimeUnit
  
  /**
    * End-of-enum marker, do not use
    */
  @js.native
  sealed trait MAX extends TimeUnit
  
  @js.native
  sealed trait Millisecond extends TimeUnit
  
  @js.native
  sealed trait Minute extends TimeUnit
  
  @js.native
  sealed trait Month extends TimeUnit
  
  @js.native
  sealed trait Second extends TimeUnit
  
  @js.native
  sealed trait Week extends TimeUnit
  
  @js.native
  sealed trait Year extends TimeUnit
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeUnit with Double] = js.native
  /* 4 */ @js.native
  object Day extends TopLevel[Day with Double]
  
  /* 3 */ @js.native
  object Hour extends TopLevel[Hour with Double]
  
  /* 8 */ @js.native
  object MAX extends TopLevel[MAX with Double]
  
  /* 0 */ @js.native
  object Millisecond extends TopLevel[Millisecond with Double]
  
  /* 2 */ @js.native
  object Minute extends TopLevel[Minute with Double]
  
  /* 6 */ @js.native
  object Month extends TopLevel[Month with Double]
  
  /* 1 */ @js.native
  object Second extends TopLevel[Second with Double]
  
  /* 5 */ @js.native
  object Week extends TopLevel[Week with Double]
  
  /* 7 */ @js.native
  object Year extends TopLevel[Year with Double]
  
}

