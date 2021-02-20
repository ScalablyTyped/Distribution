package typings.wordpressEditPost

import typings.std.Record
import typings.wordpressEditPost.mod.EditorMode
import typings.wordpressEditPost.mod.MetaboxDescriptor
import typings.wordpressEditPost.mod.MetaboxLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("@wordpress/edit-post/store/selectors", "getActiveGeneralSidebarName")
  @js.native
  def getActiveGeneralSidebarName(): String | Null = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "getActiveMetaBoxLocations")
  @js.native
  def getActiveMetaBoxLocations(): js.Array[MetaboxLocation] = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "getAllMetaBoxes")
  @js.native
  def getAllMetaBoxes(): js.Array[MetaboxDescriptor] = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "getEditorMode")
  @js.native
  def getEditorMode(): EditorMode = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "getMetaBoxesPerLocation")
  @js.native
  def getMetaBoxesPerLocation(location: MetaboxLocation): js.UndefOr[js.Array[MetaboxDescriptor]] = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "getPreference")
  @js.native
  def getPreference[T](preferenceKey: String): js.UndefOr[T] = js.native
  @JSImport("@wordpress/edit-post/store/selectors", "getPreference")
  @js.native
  def getPreference[T](preferenceKey: String, defaultValue: T): T | Double | String = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "getPreferences")
  @js.native
  def getPreferences(): Record[String, _] = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "hasMetaBoxes")
  @js.native
  def hasMetaBoxes(): Boolean = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "isEditorPanelEnabled")
  @js.native
  def isEditorPanelEnabled(panelName: String): Boolean = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "isEditorPanelOpened")
  @js.native
  def isEditorPanelOpened(panelName: String): Boolean = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "isEditorPanelRemoved")
  @js.native
  def isEditorPanelRemoved(panelName: String): Boolean = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "isEditorSidebarOpened")
  @js.native
  def isEditorSidebarOpened(): Boolean = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "isFeatureActive")
  @js.native
  def isFeatureActive(feature: String): Boolean = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "isMetaBoxLocationActive")
  @js.native
  def isMetaBoxLocationActive(location: MetaboxLocation): Boolean = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "isMetaBoxLocationVisible")
  @js.native
  def isMetaBoxLocationVisible(location: MetaboxLocation): Boolean = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "isModalActive")
  @js.native
  def isModalActive(modalName: String): Boolean = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "isPluginItemPinned")
  @js.native
  def isPluginItemPinned(pluginName: String): Boolean = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "isPluginSidebarOpened")
  @js.native
  def isPluginSidebarOpened(): Boolean = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "isPublishSidebarOpened")
  @js.native
  def isPublishSidebarOpened(): Boolean = js.native
  
  @JSImport("@wordpress/edit-post/store/selectors", "isSavingMetaBoxes")
  @js.native
  def isSavingMetaBoxes(): Boolean = js.native
}
