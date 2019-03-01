package typings
package wiredepLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssSassScss extends js.Object {
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var css: java.lang.String
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var sass: java.lang.String
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var scss: java.lang.String
}

object Anon_CssSassScss {
  @scala.inline
  def apply(css: java.lang.String, sass: java.lang.String, scss: java.lang.String): Anon_CssSassScss = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("sass")(sass)
    __obj.updateDynamic("scss")(scss)
    __obj.asInstanceOf[Anon_CssSassScss]
  }
}

