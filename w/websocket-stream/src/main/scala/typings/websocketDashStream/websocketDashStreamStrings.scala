package typings.websocketDashStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object websocketDashStreamStrings {
  @js.native
  sealed trait connection extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait headers extends js.Object
  
  @js.native
  sealed trait listening extends js.Object
  
  @js.native
  sealed trait stream extends js.Object
  
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def headers: headers = "headers".asInstanceOf[headers]
  @scala.inline
  def listening: listening = "listening".asInstanceOf[listening]
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
}

