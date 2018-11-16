package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends Shape {
  def error(cb: js.Function1[/* event */ stdLib.Event, scala.Unit]): this.type = js.native
  def load(): this.type = js.native
  def load(url: java.lang.String): this.type = js.native
  def loaded(cb: js.Function1[/* info */ svgDotJsLib.Anon_Url, scala.Unit]): this.type = js.native
}

