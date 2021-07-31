package typings.wordpressEditPost

import typings.wordpressEditPost.wordpressEditPostStrings.text
import typings.wordpressEditPost.wordpressEditPostStrings.visual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("@wordpress/edit-post/store/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def closeGeneralSidebar(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeGeneralSidebar")().asInstanceOf[Unit]
  
  @scala.inline
  def closeModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeModal")().asInstanceOf[Unit]
  
  @scala.inline
  def closePublishSidebar(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closePublishSidebar")().asInstanceOf[Unit]
  
  @scala.inline
  def hideBlockTypes(blockNames: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideBlockTypes")(blockNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def hideBlockTypes(blockNames: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideBlockTypes")(blockNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def metaBoxUpdatesSuccess(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("metaBoxUpdatesSuccess")().asInstanceOf[Unit]
  
  @scala.inline
  def openGeneralSidebar(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openGeneralSidebar")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def openModal(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openModal")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def openPublishSidebar(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openPublishSidebar")().asInstanceOf[Unit]
  
  @scala.inline
  def removeEditorPanel(panelName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEditorPanel")(panelName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def requestMetaBoxUpdates(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestMetaBoxUpdates")().asInstanceOf[Unit]
  
  @scala.inline
  def setAvailableMetaBoxesPerLocation(metaBoxesPerLocation: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAvailableMetaBoxesPerLocation")(metaBoxesPerLocation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def showBlockTypes(blockNames: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showBlockTypes")(blockNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def showBlockTypes(blockNames: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showBlockTypes")(blockNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def switchEditorMode_text(mode: text): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("switchEditorMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def switchEditorMode_visual(mode: visual): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("switchEditorMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def toggleEditorPanelEnabled(panelName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleEditorPanelEnabled")(panelName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def toggleEditorPanelOpened(panelName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleEditorPanelOpened")(panelName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def toggleFeature(feature: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleFeature")(feature.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def togglePinnedPluginItem(pluginName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("togglePinnedPluginItem")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def togglePublishSidebar(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("togglePublishSidebar")().asInstanceOf[Unit]
}
