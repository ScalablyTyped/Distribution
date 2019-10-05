package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  var lastAccessedTime: Double
  var lastModifiedTime: Double
  var mode: String
  var size: Double
  def isDirectory(): Boolean
  def isFile(): Boolean
}

object Stat {
  @scala.inline
  def apply(
    isDirectory: () => Boolean,
    isFile: () => Boolean,
    lastAccessedTime: Double,
    lastModifiedTime: Double,
    mode: String,
    size: Double
  ): Stat = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), lastAccessedTime = lastAccessedTime, lastModifiedTime = lastModifiedTime, mode = mode, size = size)
  
    __obj.asInstanceOf[Stat]
  }
}

