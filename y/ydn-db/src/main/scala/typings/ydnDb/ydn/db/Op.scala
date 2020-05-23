package typings.ydnDb.ydn.db

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
  
}

