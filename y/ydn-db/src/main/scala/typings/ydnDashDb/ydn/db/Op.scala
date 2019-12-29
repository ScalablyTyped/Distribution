package typings.ydnDashDb.ydn.db

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Op extends js.Object

@JSGlobal("ydn.db.Op")
@js.native
object Op extends js.Object {
  @js.native
  sealed trait Equalssign extends Op
  
  @js.native
  sealed trait Greaterthansign extends Op
  
  @js.native
  sealed trait GreaterthansignEqualssign extends Op
  
  @js.native
  sealed trait Lessthansign extends Op
  
  @js.native
  sealed trait LessthansignEqualssign extends Op
  
  @js.native
  sealed trait ^ extends Op
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Op with Double] = js.native
  /* 2 */ @js.native
  object Equalssign extends TopLevel[Equalssign with Double]
  
  /* 0 */ @js.native
  object Greaterthansign extends TopLevel[Greaterthansign with Double]
  
  /* 3 */ @js.native
  object GreaterthansignEqualssign extends TopLevel[GreaterthansignEqualssign with Double]
  
  /* 1 */ @js.native
  object Lessthansign extends TopLevel[Lessthansign with Double]
  
  /* 4 */ @js.native
  object LessthansignEqualssign extends TopLevel[LessthansignEqualssign with Double]
  
  /* 5 */ @js.native
  object ^ extends TopLevel[^  with Double]
  
}

