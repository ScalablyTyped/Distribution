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
    val __obj = js.Dynamic.literal(branches = branches, delete = delete, name = name, read = read, write = write)
  
    __obj.asInstanceOf[Project]
  }
}

