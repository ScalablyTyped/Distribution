package typings.typesettable

import typings.typesettable.svgMod.IAnchor
import typings.typesettable.writerMod.IXAlign
import typings.typesettable.writerMod.IYAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesettableStrings {
  
  @js.native
  sealed trait bottom
    extends StObject
       with IYAlign
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait center
    extends StObject
       with IXAlign
       with IYAlign
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait end
    extends StObject
       with IAnchor
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait left
    extends StObject
       with IXAlign
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait middle
    extends StObject
       with IAnchor
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait right
    extends StObject
       with IXAlign
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait start
    extends StObject
       with IAnchor
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait top
    extends StObject
       with IYAlign
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}
