package typings.tinymce.mod.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Writer extends js.Object {
  
  def cdata(text: String): Unit = js.native
  
  def doctype(text: String): Unit = js.native
  
  def end(name: String): Unit = js.native
  
  def getContent(): String = js.native
  
  def pi(name: String, text: String): Unit = js.native
  
  def reset(): Unit = js.native
  
  def start(name: String): Unit = js.native
  def start(name: String, attrs: js.UndefOr[scala.Nothing], empty: Boolean): Unit = js.native
  def start(name: String, attrs: js.Array[_]): Unit = js.native
  def start(name: String, attrs: js.Array[_], empty: Boolean): Unit = js.native
  
  def text(text: String, raw: Boolean): Unit = js.native
}
