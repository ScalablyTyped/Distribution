package typings.tinymce.mod.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entities extends js.Object {
  
  def decode(text: String): String = js.native
  
  def encodeAllRaw(text: String): String = js.native
  
  def encodeNamed(text: String): String = js.native
  def encodeNamed(text: String, attr: js.UndefOr[scala.Nothing], entities: js.Object): String = js.native
  def encodeNamed(text: String, attr: Boolean): String = js.native
  def encodeNamed(text: String, attr: Boolean, entities: js.Object): String = js.native
  
  def encodeNumeric(text: String): String = js.native
  def encodeNumeric(text: String, attr: Boolean): String = js.native
  
  def encodeRaw(text: String): String = js.native
  def encodeRaw(text: String, attr: Boolean): String = js.native
  
  def getEncodeFunc(name: String): js.Function0[Unit] = js.native
  def getEncodeFunc(name: String, entities: String): js.Function0[Unit] = js.native
}
