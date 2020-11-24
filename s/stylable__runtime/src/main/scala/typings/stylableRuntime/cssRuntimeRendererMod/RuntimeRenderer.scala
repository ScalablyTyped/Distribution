package typings.stylableRuntime.cssRuntimeRendererMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.HTMLStyleElement
import typings.stylableRuntime.cssRuntimeRendererMod.global.Window
import typings.stylableRuntime.keyedListRendererMod.DOMListRenderer
import typings.stylableRuntime.typesMod.RenderableStylesheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/runtime/cjs/css-runtime-renderer", "RuntimeRenderer")
@js.native
class RuntimeRenderer () extends js.Object {
  
  def findDepthIndex(depth: Double): Double = js.native
  
  def getStyles(ids: js.Array[String], sortIndexes: Boolean): js.Array[RenderableStylesheet] = js.native
  
  var id: Double | Null = js.native
  
  def init(_window: Window): Unit = js.native
  
  def onRegister(): Unit = js.native
  
  def register(stylesheet: RenderableStylesheet): Unit = js.native
  
  def removeStyle(stylesheet: RenderableStylesheet): Unit = js.native
  
  var renderer: (DOMListRenderer[RenderableStylesheet, HTMLStyleElement, Element]) | Null = js.native
  
  def sortStyles(styles: js.Array[RenderableStylesheet]): js.Array[RenderableStylesheet] = js.native
  def sortStyles(styles: js.Array[RenderableStylesheet], sortIndexes: Boolean): js.Array[RenderableStylesheet] = js.native
  
  var styles: js.Array[RenderableStylesheet] = js.native
  
  var stylesMap: StringDictionary[RenderableStylesheet] = js.native
  
  def update(): Unit = js.native
  
  var window: Window | Null = js.native
}
