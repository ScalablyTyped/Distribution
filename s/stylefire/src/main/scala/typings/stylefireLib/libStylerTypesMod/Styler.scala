package typings
package stylefireLib.libStylerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styler extends js.Object {
  def get(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String, forceRead: scala.Boolean): js.Any = js.native
  def render(): Styler = js.native
  def render(forceRender: scala.Boolean): Styler = js.native
  def set(key: java.lang.String): Styler = js.native
  def set(key: java.lang.String, value: js.Any): Styler = js.native
  def set(key: State): Styler = js.native
  def set(key: State, value: js.Any): Styler = js.native
}

