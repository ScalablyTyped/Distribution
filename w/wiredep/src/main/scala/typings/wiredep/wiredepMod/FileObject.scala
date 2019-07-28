package typings.wiredep.wiredepMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileObject extends js.Object {
  /**
    * type of wiredep block ('js', 'css', etc)
    */
  var block: String
  /**
    * name of file that was updated
    */
  var file: String
  /**
    * path to file that was injected
    */
  var path: String
}

object FileObject {
  @scala.inline
  def apply(block: String, file: String, path: String): FileObject = {
    val __obj = js.Dynamic.literal(block = block, file = file, path = path)
  
    __obj.asInstanceOf[FileObject]
  }
}

