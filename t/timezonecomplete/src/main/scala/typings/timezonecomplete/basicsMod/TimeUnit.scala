package typings.timezonecomplete.basicsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeUnit extends js.Object
@JSImport("timezonecomplete/dist/lib/basics", "TimeUnit")
@js.native
object TimeUnit extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeUnit with Double] = js.native
  
  @js.native
  sealed trait Day extends TimeUnit
  /* 4 */ @js.native
  object Day extends TopLevel[Day with Double]
  
  @js.native
  sealed trait Hour extends TimeUnit
  /* 3 */ @js.native
  object Hour extends TopLevel[Hour with Double]
  
  /**
    * End-of-enum marker, do not use
    */
  @js.native
  sealed trait MAX extends TimeUnit
  /* 8 */ @js.native
  object MAX extends TopLevel[MAX with Double]
  
  @js.native
  sealed trait Millisecond extends TimeUnit
  /* 0 */ @js.native
  object Millisecond extends TopLevel[Millisecond with Double]
  
  @js.native
  sealed trait Minute extends TimeUnit
  /* 2 */ @js.native
  object Minute extends TopLevel[Minute with Double]
  
  @js.native
  sealed trait Month extends TimeUnit
  /* 6 */ @js.native
  object Month extends TopLevel[Month with Double]
  
  @js.native
  sealed trait Second extends TimeUnit
  /* 1 */ @js.native
  object Second extends TopLevel[Second with Double]
  
  @js.native
  sealed trait Week extends TimeUnit
  /* 5 */ @js.native
  object Week extends TopLevel[Week with Double]
  
  @js.native
  sealed trait Year extends TimeUnit
  /* 7 */ @js.native
  object Year extends TopLevel[Year with Double]
}
