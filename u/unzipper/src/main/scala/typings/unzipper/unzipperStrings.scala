package typings.unzipper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object unzipperStrings {
  @js.native
  sealed trait Directory extends js.Object
  
  @js.native
  sealed trait File extends js.Object
  
  @scala.inline
  def Directory: Directory = "Directory".asInstanceOf[Directory]
  @scala.inline
  def File: File = "File".asInstanceOf[File]
}

