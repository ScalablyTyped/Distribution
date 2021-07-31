package typings.tinymce.mod

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddOnManager extends StObject {
  
  def add(id: String, addOn: js.Function2[/* editor */ Editor, /* url */ String, Unit]): Theme | Plugin = js.native
  
  def addComponents(pluginName: String, scripts: js.Array[String]): Unit = js.native
  
  def get(name: String): Theme | Plugin = js.native
  
  def load(name: String, addOnUrl: String): Unit = js.native
  def load(name: String, addOnUrl: String, success: js.Function0[Unit]): Unit = js.native
  def load(name: String, addOnUrl: String, success: js.Function0[Unit], scope: js.Object): Unit = js.native
  def load(
    name: String,
    addOnUrl: String,
    success: js.Function0[Unit],
    scope: js.Object,
    failure: js.Function0[Unit]
  ): Unit = js.native
  def load(
    name: String,
    addOnUrl: String,
    success: js.Function0[Unit],
    scope: Unit,
    failure: js.Function0[Unit]
  ): Unit = js.native
  def load(name: String, addOnUrl: String, success: Unit, scope: js.Object): Unit = js.native
  def load(name: String, addOnUrl: String, success: Unit, scope: js.Object, failure: js.Function0[Unit]): Unit = js.native
  def load(name: String, addOnUrl: String, success: Unit, scope: Unit, failure: js.Function0[Unit]): Unit = js.native
  
  def requireLangPack(name: String): Unit = js.native
  def requireLangPack(name: String, languages: String): Unit = js.native
}
