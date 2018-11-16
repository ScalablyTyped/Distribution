package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOnManager extends js.Object {
  def add(
    id: java.lang.String,
    addOn: js.Function2[/* editor */ Editor, /* url */ java.lang.String, scala.Unit]
  ): Theme | stdLib.Plugin = js.native
  def addComponents(pluginName: java.lang.String, scripts: js.Array[java.lang.String]): scala.Unit = js.native
  def get(name: java.lang.String): Theme | stdLib.Plugin = js.native
  def load(name: java.lang.String, addOnUrl: java.lang.String): scala.Unit = js.native
  def load(name: java.lang.String, addOnUrl: java.lang.String, success: js.Function0[scala.Unit]): scala.Unit = js.native
  def load(
    name: java.lang.String,
    addOnUrl: java.lang.String,
    success: js.Function0[scala.Unit],
    scope: js.Object
  ): scala.Unit = js.native
  def load(
    name: java.lang.String,
    addOnUrl: java.lang.String,
    success: js.Function0[scala.Unit],
    scope: js.Object,
    failure: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def requireLangPack(name: java.lang.String): scala.Unit = js.native
  def requireLangPack(name: java.lang.String, languages: java.lang.String): scala.Unit = js.native
}

