package typings.wordpressCustomizeBrowser.sectionMod

import typings.wordpressCustomizeBrowser.containerMod.Container
import typings.wordpressCustomizeBrowser.controlMod.Control
import typings.wordpressCustomizeBrowser.valueMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/Section", "Section")
@js.native
class Section () extends Container {
  
  def attachEvents(): Unit = js.native
  
  var containerPaneParent: String = js.native
  
  var containerParent: String = js.native
  
  def controls(): js.Array[Control] = js.native
  
  def embed(): Unit = js.native
  
  var id: String = js.native
  
  def initialize(id: js.UndefOr[scala.Nothing], options: SectionParams): Unit = js.native
  def initialize(id: String, options: SectionParams): Unit = js.native
  
  var panel: Value[String] = js.native
}
