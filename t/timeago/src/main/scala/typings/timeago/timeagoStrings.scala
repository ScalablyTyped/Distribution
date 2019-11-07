package typings.timeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object timeagoStrings {
  @js.native
  sealed trait dispose extends js.Object
  
  @js.native
  sealed trait init extends js.Object
  
  @js.native
  sealed trait update extends js.Object
  
  @js.native
  sealed trait updateFromDOM extends js.Object
  
  @scala.inline
  def dispose: dispose = "dispose".asInstanceOf[dispose]
  @scala.inline
  def init: init = "init".asInstanceOf[init]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  @scala.inline
  def updateFromDOM: updateFromDOM = "updateFromDOM".asInstanceOf[updateFromDOM]
}

