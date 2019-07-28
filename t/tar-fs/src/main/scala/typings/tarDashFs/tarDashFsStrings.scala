package typings.tarDashFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tarDashFsStrings {
  @js.native
  sealed trait directory extends js.Object
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait link extends js.Object
  
  @js.native
  sealed trait symlink extends js.Object
  
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  @scala.inline
  def symlink: symlink = "symlink".asInstanceOf[symlink]
}

