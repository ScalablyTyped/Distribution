package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtomDataLoader extends js.Object {
  def load(url: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.WebixCallback): js.Promise[_] = js.native
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
}

