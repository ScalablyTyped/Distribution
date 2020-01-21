package typings.tileReduce.TileReduce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tileReduce.tileReduceStrings.start
  - typings.tileReduce.tileReduceStrings.map
  - typings.tileReduce.tileReduceStrings.reduce
  - typings.tileReduce.tileReduceStrings.end
*/
trait Types extends js.Object

object Types {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typings.tileReduce.tileReduceStrings.end = this.cast("end")
  @scala.inline
  def map: typings.tileReduce.tileReduceStrings.map = this.cast("map")
  @scala.inline
  def reduce: typings.tileReduce.tileReduceStrings.reduce = this.cast("reduce")
  @scala.inline
  def start: typings.tileReduce.tileReduceStrings.start = this.cast("start")
}

