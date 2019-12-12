package typings.ydnDashDb.ydn.db

import org.scalablytyped.runtime.TopLevel
import typings.ydnDashDb.ydn.db.Op.^
import typings.ydnDashDb.ydn.db.Op.`<=`
import typings.ydnDashDb.ydn.db.Op.`<`
import typings.ydnDashDb.ydn.db.Op.`=`
import typings.ydnDashDb.ydn.db.Op.`>=`
import typings.ydnDashDb.ydn.db.Op.`>`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Op extends js.Object

@JSGlobal("ydn.db.Op")
@js.native
object Op extends js.Object {
  @js.native
  sealed trait `<` extends Op
  
  @js.native
  sealed trait `<=` extends Op
  
  @js.native
  sealed trait `=` extends Op
  
  @js.native
  sealed trait `>` extends Op
  
  @js.native
  sealed trait `>=` extends Op
  
  @js.native
  sealed trait ^ extends Op
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Op with Double] = js.native
  /* 1 */ @js.native
  object `<` extends TopLevel[`<` with Double]
  
  /* 4 */ @js.native
  object `<=` extends TopLevel[`<=` with Double]
  
  /* 2 */ @js.native
  object `=` extends TopLevel[`=` with Double]
  
  /* 0 */ @js.native
  object `>` extends TopLevel[`>` with Double]
  
  /* 3 */ @js.native
  object `>=` extends TopLevel[`>=` with Double]
  
  /* 5 */ @js.native
  object ^ extends TopLevel[^  with Double]
  
}

