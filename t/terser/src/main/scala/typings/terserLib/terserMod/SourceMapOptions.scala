package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapOptions extends js.Object {
  /**
    * The compressed file name
    */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The input source map.
    * Useful when you compress code that was generated from some other source (possibly other programming language).
    * If you have an input source map, pass it in this argument and Terser will generate a mapping that maps back
    * to the original source (as opposed to the compiled code that you are compressing).
    */
  var orig: js.UndefOr[js.Object | stdLib.JSON] = js.undefined
  /**
    * The root URL to the original sources
    */
  var root: js.UndefOr[java.lang.String] = js.undefined
}

