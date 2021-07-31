package typings.wordpressEditPost

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import typings.std.Record
import typings.wordpressEditPost.mod.EditorMode
import typings.wordpressEditPost.mod.MetaboxDescriptor
import typings.wordpressEditPost.mod.MetaboxLocation
import typings.wordpressEditPost.wordpressEditPostStrings.text
import typings.wordpressEditPost.wordpressEditPostStrings.visual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AjaxUrl extends StObject {
    
    var ajaxUrl: String
    
    var nonce: String
    
    var unlockNonce: String
  }
  object AjaxUrl {
    
    @scala.inline
    def apply(ajaxUrl: String, nonce: String, unlockNonce: String): AjaxUrl = {
      val __obj = js.Dynamic.literal(ajaxUrl = ajaxUrl.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], unlockNonce = unlockNonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[AjaxUrl]
    }
    
    @scala.inline
    implicit class AjaxUrlMutableBuilder[Self <: AjaxUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxUrl(value: String): Self = StObject.set(x, "ajaxUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnlockNonce(value: String): Self = StObject.set(x, "unlockNonce", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    var color: String
    
    var name: String
    
    var slug: String
  }
  object Color {
    
    @scala.inline
    def apply(color: String, name: String, slug: String): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
  
  trait Css extends StObject {
    
    var css: String
  }
  object Css {
    
    @scala.inline
    def apply(css: String): Css = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
      __obj.asInstanceOf[Css]
    }
    
    @scala.inline
    implicit class CssMutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: String
    
    var isCallbackWidget: Boolean
    
    var isHidden: Boolean
    
    var name: String
  }
  object Description {
    
    @scala.inline
    def apply(description: String, isCallbackWidget: Boolean, isHidden: Boolean, name: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], isCallbackWidget = isCallbackWidget.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCallbackWidget(value: Boolean): Self = StObject.set(x, "isCallbackWidget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsLocked extends StObject {
    
    var isLocked: Boolean
    
    var user: Null | String
  }
  object IsLocked {
    
    @scala.inline
    def apply(isLocked: Boolean): IsLocked = {
      val __obj = js.Dynamic.literal(isLocked = isLocked.asInstanceOf[js.Any], user = null)
      __obj.asInstanceOf[IsLocked]
    }
    
    @scala.inline
    implicit class IsLockedMutableBuilder[Self <: IsLocked] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNull: Self = StObject.set(x, "user", null)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var size: Double
    
    var slug: String
  }
  object Name {
    
    @scala.inline
    def apply(name: String, size: Double, slug: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@wordpress/components.@wordpress/components.Slot.Props, 'name'> */
  trait OmitPropsname extends StObject {
    
    var bubblesVirtually: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[js.Function1[/* fills */ js.Array[js.Array[Element]], Element | Null]] = js.undefined
    
    var fillProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object OmitPropsname {
    
    @scala.inline
    def apply(): OmitPropsname = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitPropsname]
    }
    
    @scala.inline
    implicit class OmitPropsnameMutableBuilder[Self <: OmitPropsname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBubblesVirtually(value: Boolean): Self = StObject.set(x, "bubblesVirtually", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubblesVirtuallyUndefined: Self = StObject.set(x, "bubblesVirtually", js.undefined)
      
      @scala.inline
      def setChildren(value: /* fills */ js.Array[js.Array[Element]] => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFillProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "fillProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillPropsUndefined: Self = StObject.set(x, "fillProps", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@wordpress/edit-post.@wordpress/edit-post.EditorSettings> */
  trait PartialEditorSettings extends StObject {
    
    var alignWide: js.UndefOr[Boolean] = js.undefined
    
    var allowedBlockTypes: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    var allowedMimeTypes: js.UndefOr[(Record[String, String]) | Null] = js.undefined
    
    var autosaveInterval: js.UndefOr[Double] = js.undefined
    
    var availableLegacyWidgets: js.UndefOr[js.Array[Description]] = js.undefined
    
    var availableTemplates: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var bodyPlaceholder: js.UndefOr[String] = js.undefined
    
    var codeEditingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var colors: js.UndefOr[js.Array[Color]] = js.undefined
    
    var disableCustomColors: js.UndefOr[Boolean] = js.undefined
    
    var disableCustomFontSizes: js.UndefOr[Boolean] = js.undefined
    
    var disablePostFormats: js.UndefOr[Boolean] = js.undefined
    
    var enableCustomFields: js.UndefOr[Boolean] = js.undefined
    
    var focusMode: js.UndefOr[Boolean] = js.undefined
    
    var fontSizes: js.UndefOr[js.Array[Name]] = js.undefined
    
    var hasFixedToolbar: js.UndefOr[Boolean] = js.undefined
    
    var hasPermissionsToManageWidgets: js.UndefOr[Boolean] = js.undefined
    
    var imageSizes: js.UndefOr[js.Array[Slug]] = js.undefined
    
    var isRTL: js.UndefOr[Boolean] = js.undefined
    
    var maxUploadFileSize: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var postLock: js.UndefOr[IsLocked] = js.undefined
    
    var postLockUtils: js.UndefOr[AjaxUrl] = js.undefined
    
    var richEditingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var styles: js.UndefOr[js.Array[Css]] = js.undefined
    
    var titlePlaceholder: js.UndefOr[String] = js.undefined
  }
  object PartialEditorSettings {
    
    @scala.inline
    def apply(): PartialEditorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEditorSettings]
    }
    
    @scala.inline
    implicit class PartialEditorSettingsMutableBuilder[Self <: PartialEditorSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignWide(value: Boolean): Self = StObject.set(x, "alignWide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignWideUndefined: Self = StObject.set(x, "alignWide", js.undefined)
      
      @scala.inline
      def setAllowedBlockTypes(value: js.Array[String] | Boolean): Self = StObject.set(x, "allowedBlockTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedBlockTypesUndefined: Self = StObject.set(x, "allowedBlockTypes", js.undefined)
      
      @scala.inline
      def setAllowedBlockTypesVarargs(value: String*): Self = StObject.set(x, "allowedBlockTypes", js.Array(value :_*))
      
      @scala.inline
      def setAllowedMimeTypes(value: Record[String, String]): Self = StObject.set(x, "allowedMimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedMimeTypesNull: Self = StObject.set(x, "allowedMimeTypes", null)
      
      @scala.inline
      def setAllowedMimeTypesUndefined: Self = StObject.set(x, "allowedMimeTypes", js.undefined)
      
      @scala.inline
      def setAutosaveInterval(value: Double): Self = StObject.set(x, "autosaveInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutosaveIntervalUndefined: Self = StObject.set(x, "autosaveInterval", js.undefined)
      
      @scala.inline
      def setAvailableLegacyWidgets(value: js.Array[Description]): Self = StObject.set(x, "availableLegacyWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableLegacyWidgetsUndefined: Self = StObject.set(x, "availableLegacyWidgets", js.undefined)
      
      @scala.inline
      def setAvailableLegacyWidgetsVarargs(value: Description*): Self = StObject.set(x, "availableLegacyWidgets", js.Array(value :_*))
      
      @scala.inline
      def setAvailableTemplates(value: js.Array[js.Any]): Self = StObject.set(x, "availableTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableTemplatesUndefined: Self = StObject.set(x, "availableTemplates", js.undefined)
      
      @scala.inline
      def setAvailableTemplatesVarargs(value: js.Any*): Self = StObject.set(x, "availableTemplates", js.Array(value :_*))
      
      @scala.inline
      def setBodyPlaceholder(value: String): Self = StObject.set(x, "bodyPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyPlaceholderUndefined: Self = StObject.set(x, "bodyPlaceholder", js.undefined)
      
      @scala.inline
      def setCodeEditingEnabled(value: Boolean): Self = StObject.set(x, "codeEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeEditingEnabledUndefined: Self = StObject.set(x, "codeEditingEnabled", js.undefined)
      
      @scala.inline
      def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCustomColorsUndefined: Self = StObject.set(x, "disableCustomColors", js.undefined)
      
      @scala.inline
      def setDisableCustomFontSizes(value: Boolean): Self = StObject.set(x, "disableCustomFontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCustomFontSizesUndefined: Self = StObject.set(x, "disableCustomFontSizes", js.undefined)
      
      @scala.inline
      def setDisablePostFormats(value: Boolean): Self = StObject.set(x, "disablePostFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePostFormatsUndefined: Self = StObject.set(x, "disablePostFormats", js.undefined)
      
      @scala.inline
      def setEnableCustomFields(value: Boolean): Self = StObject.set(x, "enableCustomFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCustomFieldsUndefined: Self = StObject.set(x, "enableCustomFields", js.undefined)
      
      @scala.inline
      def setFocusMode(value: Boolean): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusModeUndefined: Self = StObject.set(x, "focusMode", js.undefined)
      
      @scala.inline
      def setFontSizes(value: js.Array[Name]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
      
      @scala.inline
      def setFontSizesVarargs(value: Name*): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
      
      @scala.inline
      def setHasFixedToolbar(value: Boolean): Self = StObject.set(x, "hasFixedToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFixedToolbarUndefined: Self = StObject.set(x, "hasFixedToolbar", js.undefined)
      
      @scala.inline
      def setHasPermissionsToManageWidgets(value: Boolean): Self = StObject.set(x, "hasPermissionsToManageWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPermissionsToManageWidgetsUndefined: Self = StObject.set(x, "hasPermissionsToManageWidgets", js.undefined)
      
      @scala.inline
      def setImageSizes(value: js.Array[Slug]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizesUndefined: Self = StObject.set(x, "imageSizes", js.undefined)
      
      @scala.inline
      def setImageSizesVarargs(value: Slug*): Self = StObject.set(x, "imageSizes", js.Array(value :_*))
      
      @scala.inline
      def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      @scala.inline
      def setMaxUploadFileSize(value: Double): Self = StObject.set(x, "maxUploadFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUploadFileSizeUndefined: Self = StObject.set(x, "maxUploadFileSize", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setPostLock(value: IsLocked): Self = StObject.set(x, "postLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLockUndefined: Self = StObject.set(x, "postLock", js.undefined)
      
      @scala.inline
      def setPostLockUtils(value: AjaxUrl): Self = StObject.set(x, "postLockUtils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLockUtilsUndefined: Self = StObject.set(x, "postLockUtils", js.undefined)
      
      @scala.inline
      def setRichEditingEnabled(value: Boolean): Self = StObject.set(x, "richEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRichEditingEnabledUndefined: Self = StObject.set(x, "richEditingEnabled", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Array[Css]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setStylesVarargs(value: Css*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePlaceholderUndefined: Self = StObject.set(x, "titlePlaceholder", js.undefined)
    }
  }
  
  trait Slug extends StObject {
    
    var name: String
    
    var slug: String
  }
  object Slug {
    
    @scala.inline
    def apply(name: String, slug: String): Slug = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slug]
    }
    
    @scala.inline
    implicit class SlugMutableBuilder[Self <: Slug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofimportedActions extends StObject {
    
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
  
  @js.native
  trait TypeofimportedSelectors extends StObject {
    
    def getActiveGeneralSidebarName(): String | Null = js.native
    
    def getActiveMetaBoxLocations(): js.Array[MetaboxLocation] = js.native
    
    def getAllMetaBoxes(): js.Array[MetaboxDescriptor] = js.native
    
    def getEditorMode(): EditorMode = js.native
    
    def getMetaBoxesPerLocation(location: MetaboxLocation): js.UndefOr[js.Array[MetaboxDescriptor]] = js.native
    
    def getPreference[T](preferenceKey: String): js.UndefOr[T] = js.native
    def getPreference[T](preferenceKey: String, defaultValue: T): T | Double | String = js.native
    
    def getPreferences(): Record[String, js.Any] = js.native
    
    def hasMetaBoxes(): Boolean = js.native
    
    def isEditorPanelEnabled(panelName: String): Boolean = js.native
    
    def isEditorPanelOpened(panelName: String): Boolean = js.native
    
    def isEditorPanelRemoved(panelName: String): Boolean = js.native
    
    def isEditorSidebarOpened(): Boolean = js.native
    
    def isFeatureActive(feature: String): Boolean = js.native
    
    def isMetaBoxLocationActive(location: MetaboxLocation): Boolean = js.native
    
    def isMetaBoxLocationVisible(location: MetaboxLocation): Boolean = js.native
    
    def isModalActive(modalName: String): Boolean = js.native
    
    def isPluginItemPinned(pluginName: String): Boolean = js.native
    
    def isPluginSidebarOpened(): Boolean = js.native
    
    def isPublishSidebarOpened(): Boolean = js.native
    
    def isSavingMetaBoxes(): Boolean = js.native
  }
}
