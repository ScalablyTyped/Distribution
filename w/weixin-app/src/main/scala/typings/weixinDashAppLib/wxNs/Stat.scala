package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  var lastAccessedTime: scala.Double
  var lastModifiedTime: scala.Double
  var mode: java.lang.String
  var size: scala.Double
  def isDirectory(): scala.Boolean
  def isFile(): scala.Boolean
}

object Stat {
  @scala.inline
  def apply(
    isDirectory: () => scala.Boolean,
    isFile: () => scala.Boolean,
    lastAccessedTime: scala.Double,
    lastModifiedTime: scala.Double,
    mode: java.lang.String,
    size: scala.Double
  ): Stat = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), lastAccessedTime = lastAccessedTime, lastModifiedTime = lastModifiedTime, mode = mode, size = size)
  
    __obj.asInstanceOf[Stat]
  }
}

