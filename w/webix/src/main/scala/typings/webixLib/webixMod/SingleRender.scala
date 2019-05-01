package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleRender extends js.Object {
  var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def customize(obj: js.Any): scala.Unit = js.native
  def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def sync(source: js.Any, filter: WebixCallback, silent: scala.Boolean): scala.Unit = js.native
}

