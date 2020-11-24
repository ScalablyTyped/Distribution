package typings.tinymce.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tinymce", "util.URI")
@js.native
class URI protected () extends js.Object {
  def this(url: String) = this()
  def this(url: String, settings: js.Object) = this()
  
  def getURI(noProtoHost: Boolean): URI = js.native
  
  def isSameOrigin(uri: URI): Boolean = js.native
  
  def setPath(path: String): Unit = js.native
  
  def toAbsPath(base: String, path: String): Unit = js.native
  
  def toAbsolute(uri: String, noHost: Boolean): String = js.native
  
  def toRelPath(base: String, path: String): Unit = js.native
  
  def toRelative(uri: String): String = js.native
}
