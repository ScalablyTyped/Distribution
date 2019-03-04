package typings
package webgmeLib.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  var branches: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var delete: scala.Boolean
  var name: java.lang.String
  /** should always be true */
  var read: scala.Boolean
  var write: scala.Boolean
}

object Project {
  @scala.inline
  def apply(
    branches: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    delete: scala.Boolean,
    name: java.lang.String,
    read: scala.Boolean,
    write: scala.Boolean
  ): Project = {
    val __obj = js.Dynamic.literal(branches = branches, delete = delete, name = name, read = read, write = write)
  
    __obj.asInstanceOf[Project]
  }
}

