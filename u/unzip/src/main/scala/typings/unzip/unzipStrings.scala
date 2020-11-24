package typings.unzip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unzipStrings {
  
  @scala.inline
  def Directory: Directory = "Directory".asInstanceOf[Directory]
  
  @scala.inline
  def File: File = "File".asInstanceOf[File]
  
  @js.native
  sealed trait Directory extends js.Object
  
  @js.native
  sealed trait File extends js.Object
}
