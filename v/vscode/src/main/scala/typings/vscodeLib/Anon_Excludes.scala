package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Excludes extends js.Object {
  var excludes: js.Array[java.lang.String]
  var recursive: scala.Boolean
}

object Anon_Excludes {
  @scala.inline
  def apply(excludes: js.Array[java.lang.String], recursive: scala.Boolean): Anon_Excludes = {
    val __obj = js.Dynamic.literal(excludes = excludes, recursive = recursive)
  
    __obj.asInstanceOf[Anon_Excludes]
  }
}

