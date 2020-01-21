package typings.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "writeJSON")
@js.native
object writeJSON extends js.Object {
  def apply(filepath: String, str: String): js.Promise[_] = js.native
  def apply(filepath: String, str: String, options: IJSONStaticOptions): js.Promise[_] = js.native
  def apply(filepath: String, str: ObjStatic): js.Promise[_] = js.native
  def apply(filepath: String, str: ObjStatic, options: IJSONStaticOptions): js.Promise[_] = js.native
}

