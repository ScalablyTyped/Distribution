package typings
package tarDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tarDashFsLibStrings {
  @js.native
  sealed trait directory extends js.Object
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait link extends js.Object
  
  @js.native
  sealed trait symlink extends js.Object
  
  def directory: directory = "directory".asInstanceOf[directory]
  def file: file = "file".asInstanceOf[file]
  def link: link = "link".asInstanceOf[link]
  def symlink: symlink = "symlink".asInstanceOf[symlink]
}

