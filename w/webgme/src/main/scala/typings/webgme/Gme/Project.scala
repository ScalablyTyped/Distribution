package typings.webgme.Gme

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  var branches: StringDictionary[String]
  var delete: Boolean
  var name: String
  /** should always be true */
  var read: Boolean
  var write: Boolean
}

object Project {
  @scala.inline
  def apply(branches: StringDictionary[String], delete: Boolean, name: String, read: Boolean, write: Boolean): Project = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Project]
  }
}

