package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: java.lang.String
  var request: java.lang.String
}

object Anon_Path {
  @scala.inline
  def apply(path: java.lang.String, request: java.lang.String): Anon_Path = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[Anon_Path]
  }
}

