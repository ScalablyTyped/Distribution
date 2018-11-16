package typings
package tabtabLib.tabtabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabtab", JSImport.Namespace)
@js.native
object tabtabModMembers extends js.Object {
  def complete(name: java.lang.String, cb: CallBack): scala.Unit = js.native
  def complete(name: java.lang.String, completer: java.lang.String, cb: CallBack): scala.Unit = js.native
  def isComplete(): scala.Boolean = js.native
  def log(values: js.Array[java.lang.String], data: Data): scala.Unit = js.native
  def log(values: js.Array[java.lang.String], data: Data, prefix: java.lang.String): scala.Unit = js.native
  def parseOut(str: java.lang.String): tabtabLib.Anon_Shorts = js.native
  def parseTasks(str: java.lang.String, prefix: java.lang.String): js.Array[java.lang.String] = js.native
  def parseTasks(str: java.lang.String, prefix: java.lang.String, reg: java.lang.String): js.Array[java.lang.String] = js.native
  def parseTasks(str: java.lang.String, prefix: java.lang.String, reg: stdLib.RegExp): js.Array[java.lang.String] = js.native
}

