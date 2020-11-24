package typings.stylableRuntime.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeStylesheet
  extends StylableExports
     with RenderableStylesheet {
  
  def cssStates(stateMap: StateMap): String = js.native
  
  var namespace: String = js.native
  
  def st(context: String, stateOrClass: js.UndefOr[scala.Nothing], classes: js.UndefOr[String]*): String = js.native
  def st(context: String, stateOrClass: String, classes: js.UndefOr[String]*): String = js.native
  def st(context: String, stateOrClass: StateMap, classes: js.UndefOr[String]*): String = js.native
  @JSName("st")
  var st_Original: STFunction = js.native
  
  def style(context: String, stateOrClass: js.UndefOr[scala.Nothing], classes: js.UndefOr[String]*): String = js.native
  def style(context: String, stateOrClass: String, classes: js.UndefOr[String]*): String = js.native
  def style(context: String, stateOrClass: StateMap, classes: js.UndefOr[String]*): String = js.native
  @JSName("style")
  var style_Original: STFunction = js.native
}
