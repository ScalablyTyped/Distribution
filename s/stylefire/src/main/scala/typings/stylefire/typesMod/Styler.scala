package typings.stylefire.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styler extends js.Object {
  
  def get(key: String): js.Any = js.native
  def get(key: String, forceRead: Boolean): js.Any = js.native
  
  def render(): Styler = js.native
  def render(forceRender: Boolean): Styler = js.native
  
  def set(key: String): Styler = js.native
  def set(key: String, value: js.Any): Styler = js.native
  def set(key: State): Styler = js.native
  def set(key: State, value: js.Any): Styler = js.native
}
