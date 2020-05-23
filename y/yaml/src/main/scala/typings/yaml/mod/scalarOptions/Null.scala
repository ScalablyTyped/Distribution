package typings.yaml.mod.scalarOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Null extends js.Object {
  /**
    * String representation for `null`. With the core schema, use `'null' | 'Null' | 'NULL' | '~' | ''`.
    *
    * Default: `'null'`
    */
  var nullStr: String
}

object Null {
  @scala.inline
  def apply(nullStr: String): Null = {
    val __obj = js.Dynamic.literal(nullStr = nullStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Null]
  }
}

