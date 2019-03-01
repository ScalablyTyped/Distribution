package typings
package typesettableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object typesettableLibStrings {
  @js.native
  sealed trait Writer extends js.Object
  
  @js.native
  sealed trait bottom
    extends typesettableLib.buildSrcWritersWriterMod.IYAlign
  
  @js.native
  sealed trait center
    extends typesettableLib.buildSrcWritersWriterMod.IXAlign
       with typesettableLib.buildSrcWritersWriterMod.IYAlign
  
  @js.native
  sealed trait end
    extends typesettableLib.buildSrcContextsSvgMod.IAnchor
  
  @js.native
  sealed trait left
    extends typesettableLib.buildSrcWritersWriterMod.IXAlign
  
  @js.native
  sealed trait middle
    extends typesettableLib.buildSrcContextsSvgMod.IAnchor
  
  @js.native
  sealed trait right
    extends typesettableLib.buildSrcWritersWriterMod.IXAlign
  
  @js.native
  sealed trait start
    extends typesettableLib.buildSrcContextsSvgMod.IAnchor
  
  @js.native
  sealed trait top
    extends typesettableLib.buildSrcWritersWriterMod.IYAlign
  
  @scala.inline
  def Writer: Writer = "Writer".asInstanceOf[Writer]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}

