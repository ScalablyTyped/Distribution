package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseQueryWithFile extends BaseQuery {
  /** may hold either a filename, or a string in the form "#N", where N should be an integer referring to one of the files included in the request */
  var file: java.lang.String
}

