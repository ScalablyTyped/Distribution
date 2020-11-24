package typings.wordpressEditPost

import typings.wordpressEditPost.wordpressEditPostStrings.text
import typings.wordpressEditPost.wordpressEditPostStrings.visual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/edit-post/store/actions", JSImport.Namespace)
@js.native
object actionsMod extends js.Object {
  
  def closeGeneralSidebar(): Unit = js.native
  
  def closeModal(): Unit = js.native
  
  def closePublishSidebar(): Unit = js.native
  
  def hideBlockTypes(blockNames: String): Unit = js.native
  def hideBlockTypes(blockNames: js.Array[String]): Unit = js.native
  
  def metaBoxUpdatesSuccess(): Unit = js.native
  
  def openGeneralSidebar(name: String): Unit = js.native
  
  def openModal(name: String): Unit = js.native
  
  def openPublishSidebar(): Unit = js.native
  
  def removeEditorPanel(panelName: String): Unit = js.native
  
  def requestMetaBoxUpdates(): Unit = js.native
  
  def setAvailableMetaBoxesPerLocation(metaBoxesPerLocation: js.Object): Unit = js.native
  
  def showBlockTypes(blockNames: String): Unit = js.native
  def showBlockTypes(blockNames: js.Array[String]): Unit = js.native
  
  @JSName("switchEditorMode")
  def switchEditorMode_text(mode: text): Unit = js.native
  @JSName("switchEditorMode")
  def switchEditorMode_visual(mode: visual): Unit = js.native
  
  def toggleEditorPanelEnabled(panelName: String): Unit = js.native
  
  def toggleEditorPanelOpened(panelName: String): Unit = js.native
  
  def toggleFeature(feature: String): Unit = js.native
  
  def togglePinnedPluginItem(pluginName: String): Unit = js.native
  
  def togglePublishSidebar(): Unit = js.native
}
