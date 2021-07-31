package typings.wordpressEditPost

import typings.std.Record
import typings.wordpressEditPost.mod.EditorMode
import typings.wordpressEditPost.mod.MetaboxDescriptor
import typings.wordpressEditPost.mod.MetaboxLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("@wordpress/edit-post/store/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getActiveGeneralSidebarName(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveGeneralSidebarName")().asInstanceOf[String | Null]
  
  @scala.inline
  def getActiveMetaBoxLocations(): js.Array[MetaboxLocation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveMetaBoxLocations")().asInstanceOf[js.Array[MetaboxLocation]]
  
  @scala.inline
  def getAllMetaBoxes(): js.Array[MetaboxDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllMetaBoxes")().asInstanceOf[js.Array[MetaboxDescriptor]]
  
  @scala.inline
  def getEditorMode(): EditorMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditorMode")().asInstanceOf[EditorMode]
  
  @scala.inline
  def getMetaBoxesPerLocation(location: MetaboxLocation): js.UndefOr[js.Array[MetaboxDescriptor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetaBoxesPerLocation")(location.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[MetaboxDescriptor]]]
  
  @scala.inline
  def getPreference[T](preferenceKey: String): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreference")(preferenceKey.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def getPreference[T](preferenceKey: String, defaultValue: T): T | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreference")(preferenceKey.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T | Double | String]
  
  @scala.inline
  def getPreferences(): Record[String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreferences")().asInstanceOf[Record[String, js.Any]]
  
  @scala.inline
  def hasMetaBoxes(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMetaBoxes")().asInstanceOf[Boolean]
  
  @scala.inline
  def isEditorPanelEnabled(panelName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditorPanelEnabled")(panelName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEditorPanelOpened(panelName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditorPanelOpened")(panelName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEditorPanelRemoved(panelName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditorPanelRemoved")(panelName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEditorSidebarOpened(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditorSidebarOpened")().asInstanceOf[Boolean]
  
  @scala.inline
  def isFeatureActive(feature: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFeatureActive")(feature.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isMetaBoxLocationActive(location: MetaboxLocation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMetaBoxLocationActive")(location.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isMetaBoxLocationVisible(location: MetaboxLocation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMetaBoxLocationVisible")(location.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isModalActive(modalName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModalActive")(modalName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPluginItemPinned(pluginName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPluginItemPinned")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPluginSidebarOpened(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPluginSidebarOpened")().asInstanceOf[Boolean]
  
  @scala.inline
  def isPublishSidebarOpened(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPublishSidebarOpened")().asInstanceOf[Boolean]
  
  @scala.inline
  def isSavingMetaBoxes(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSavingMetaBoxes")().asInstanceOf[Boolean]
}
