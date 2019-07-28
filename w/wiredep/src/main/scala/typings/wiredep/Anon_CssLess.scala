package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssLess extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: RegExp
  /**
    * @example:
    *  /@import\s['"](.+less)['"]/gi
    */
  var less: RegExp
}

object Anon_CssLess {
  @scala.inline
  def apply(css: RegExp, less: RegExp): Anon_CssLess = {
    val __obj = js.Dynamic.literal(css = css, less = less)
  
    __obj.asInstanceOf[Anon_CssLess]
  }
}

