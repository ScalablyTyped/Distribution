package typings.vinylFile.mod

import typings.vinyl.mod.File
import typings.vinylFile.anon.Contents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VinylFile extends File {
  
  def clone(opts: Contents): this.type = js.native
  
  /** Gets and sets the path where the file points to if it's a symbolic link */
  @JSName("symlink")
  var symlink_VinylFile: String = js.native
}
