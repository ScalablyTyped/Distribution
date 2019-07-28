package typings.vegaDashUtil

import typings.vegaDashUtil.vegaDashUtilMod.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vegaDashUtilStrings {
  @js.native
  sealed trait ascending extends Order
  
  @js.native
  sealed trait center extends js.Object
  
  @js.native
  sealed trait descending extends Order
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait right extends js.Object
  
  @scala.inline
  def ascending: ascending = "ascending".asInstanceOf[ascending]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def descending: descending = "descending".asInstanceOf[descending]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
}

