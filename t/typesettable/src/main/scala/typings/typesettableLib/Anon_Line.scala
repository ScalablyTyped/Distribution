package typings
package typesettableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Line extends js.Object {
  def write(
    line: java.lang.String,
    width: scala.Double,
    xAlign: typesettableLib.buildSrcWritersWriterMod.IXAlign,
    xOffset: scala.Double,
    yOffset: scala.Double
  ): scala.Unit
}

object Anon_Line {
  @scala.inline
  def apply(
    write: js.Function5[
      java.lang.String, 
      scala.Double, 
      typesettableLib.buildSrcWritersWriterMod.IXAlign, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ]
  ): Anon_Line = {
    val __obj = js.Dynamic.literal(write = write)
  
    __obj.asInstanceOf[Anon_Line]
  }
}

