package typings
package torrentDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object torrentDashStreamLibStrings {
  @js.native
  sealed trait download extends js.Object
  
  @js.native
  sealed trait idle extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait torrent extends js.Object
  
  @js.native
  sealed trait upload extends js.Object
  
  def download: download = "download".asInstanceOf[download]
  def idle: idle = "idle".asInstanceOf[idle]
  def ready: ready = "ready".asInstanceOf[ready]
  def torrent: torrent = "torrent".asInstanceOf[torrent]
  def upload: upload = "upload".asInstanceOf[upload]
}

