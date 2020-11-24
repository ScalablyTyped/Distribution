package typings.tinymce.mod.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventUtils extends js.Object {
  
  def bind(target: js.Object, names: String, callback: js.Function0[Unit], scope: js.Object): js.Function0[Unit] = js.native
  
  def clean(target: js.Object): EventUtils = js.native
  
  def fire(target: js.Object, name: String): EventUtils = js.native
  def fire(target: js.Object, name: String, args: js.Object): EventUtils = js.native
  
  def unbind(target: js.Object): EventUtils = js.native
  def unbind(target: js.Object, names: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): EventUtils = js.native
  def unbind(target: js.Object, names: String): EventUtils = js.native
  def unbind(target: js.Object, names: String, callback: js.Function0[Unit]): EventUtils = js.native
}
