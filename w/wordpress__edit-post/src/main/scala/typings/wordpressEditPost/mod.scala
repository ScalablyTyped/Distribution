package typings.wordpressEditPost

import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import typings.std.Record
import typings.wordpressEditPost.anon.AjaxUrl
import typings.wordpressEditPost.anon.Color
import typings.wordpressEditPost.anon.Css
import typings.wordpressEditPost.anon.Description
import typings.wordpressEditPost.anon.IsLocked
import typings.wordpressEditPost.anon.Name
import typings.wordpressEditPost.anon.OmitPropsname
import typings.wordpressEditPost.anon.PartialEditorSettings
import typings.wordpressEditPost.anon.Slug
import typings.wordpressEditPost.anon.TypeofimportedActions
import typings.wordpressEditPost.anon.TypeofimportedSelectors
import typings.wordpressEditPost.pluginBlockSettingsMenuItemMod.PluginBlockSettingsMenuItem.Props
import typings.wordpressEditPost.wordpressEditPostStrings.`coreSlashedit-post`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/edit-post", "PluginBlockSettingsMenuItem")
  @js.native
  val PluginBlockSettingsMenuItem: ComponentType[Props] = js.native
  
  /**
    * Renders items below the Status & Availability panel in the Document Sidebar.
    *
    * @example
    * ```jsx
    * const { registerPlugin } = wp.plugins;
    * const { PluginDocumentSettingPanel } = wp.editPost;
    *
    * const MyDocumentSettingTest = () => (
    *     <PluginDocumentSettingPanel className="my-document-setting-plugin" title="My Panel">
    *         <p>My Document Setting Panel</p>
    *     </PluginDocumentSettingPanel>
    * );
    *
    * registerPlugin( 'document-setting-test', { render: MyDocumentSettingTest } );
    * ```
    */
  object PluginDocumentSettingPanel {
    
    @JSImport("@wordpress/edit-post", "PluginDocumentSettingPanel")
    @js.native
    def apply(props: typings.wordpressEditPost.pluginDocumentSettingPanelMod.PluginDocumentSettingPanel.Props): Element = js.native
    @JSImport("@wordpress/edit-post", "PluginDocumentSettingPanel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post", "PluginDocumentSettingPanel.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/edit-post", "PluginMoreMenuItem")
  @js.native
  val PluginMoreMenuItem: ComponentType[typings.wordpressEditPost.pluginMoreMenuItemMod.PluginMoreMenuItem.Props] = js.native
  
  /**
    * Renders provided content to the post-publish panel in the publish flow (side panel that opens
    * after a user publishes the post).
    *
    * @example
    * ```jsx
    * const { PluginPostPublishPanel } = wp.editPost;
    *
    * const MyPluginPostPublishPanel = () => (
    *     <PluginPostPublishPanel
    *         className="my-plugin-post-publish-panel"
    *         title="My panel title"
    *         initialOpen={true}
    *     >
    *         My panel content
    *     </PluginPostPublishPanel>
    * );
    * ```
    */
  object PluginPostPublishPanel {
    
    @JSImport("@wordpress/edit-post", "PluginPostPublishPanel")
    @js.native
    def apply(props: typings.wordpressEditPost.pluginPostPublishPanelMod.PluginPostPublishPanel.Props): Element = js.native
    @JSImport("@wordpress/edit-post", "PluginPostPublishPanel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post", "PluginPostPublishPanel.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Renders a row in the Status & Visibility panel of the Document sidebar.
    * It should be noted that this is named and implemented around the function it serves
    * and not its location, which may change in future iterations.
    *
    * @example
    * ```jsx
    * const { PluginPostStatusInfo } = wp.editPost;
    *
    * const MyPluginPostStatusInfo = () => (
    *     <PluginPostStatusInfo className="my-plugin-post-status-info">
    *         My post status info
    *     </PluginPostStatusInfo>
    * );
    * ```
    */
  object PluginPostStatusInfo {
    
    @JSImport("@wordpress/edit-post", "PluginPostStatusInfo")
    @js.native
    def apply(props: typings.wordpressEditPost.pluginPostStatusInfoMod.PluginPostStatusInfo.Props): Element = js.native
    @JSImport("@wordpress/edit-post", "PluginPostStatusInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post", "PluginPostStatusInfo.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Renders provided content to the pre-publish side panel in the publish flow (side panel that opens
    * when a user first pushes "Publish" from the main editor).
    *
    * @example
    * ```jsx
    * const { PluginPrePublishPanel } = wp.editPost;
    *
    * const MyPluginPrePublishPanel = () => (
    *     <PluginPrePublishPanel
    *         className="my-plugin-pre-publish-panel"
    *         title="My panel title"
    *         initialOpen={true}
    *     >
    *         My panel content
    *     </PluginPrePublishPanel>
    * );
    * ```
    */
  object PluginPrePublishPanel {
    
    @JSImport("@wordpress/edit-post", "PluginPrePublishPanel")
    @js.native
    def apply(props: typings.wordpressEditPost.pluginPrePublishPanelMod.PluginPrePublishPanel.Props): Element = js.native
    @JSImport("@wordpress/edit-post", "PluginPrePublishPanel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post", "PluginPrePublishPanel.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/edit-post", "PluginSidebar")
  @js.native
  val PluginSidebar: ComponentType[typings.wordpressEditPost.pluginSidebarMod.PluginSidebar.Props] = js.native
  
  @JSImport("@wordpress/edit-post", "PluginSidebarMoreMenuItem")
  @js.native
  val PluginSidebarMoreMenuItem: ComponentType[
    typings.wordpressEditPost.pluginSidebarMoreMenuItemMod.PluginSidebarMoreMenuItem.Props
  ] = js.native
  
  @JSImport("@wordpress/edit-post", "initializeEditor")
  @js.native
  def initializeEditor(id: String, postType: String, postId: String): Unit = js.native
  @JSImport("@wordpress/edit-post", "initializeEditor")
  @js.native
  def initializeEditor(
    id: String,
    postType: String,
    postId: String,
    settings: js.UndefOr[scala.Nothing],
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
  @JSImport("@wordpress/edit-post", "initializeEditor")
  @js.native
  def initializeEditor(id: String, postType: String, postId: String, settings: PartialEditorSettings): Unit = js.native
  @JSImport("@wordpress/edit-post", "initializeEditor")
  @js.native
  def initializeEditor(
    id: String,
    postType: String,
    postId: String,
    settings: PartialEditorSettings,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
  @JSImport("@wordpress/edit-post", "initializeEditor")
  @js.native
  def initializeEditor(id: String, postType: String, postId: Double): Unit = js.native
  @JSImport("@wordpress/edit-post", "initializeEditor")
  @js.native
  def initializeEditor(
    id: String,
    postType: String,
    postId: Double,
    settings: js.UndefOr[scala.Nothing],
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
  @JSImport("@wordpress/edit-post", "initializeEditor")
  @js.native
  def initializeEditor(id: String, postType: String, postId: Double, settings: PartialEditorSettings): Unit = js.native
  @JSImport("@wordpress/edit-post", "initializeEditor")
  @js.native
  def initializeEditor(
    id: String,
    postType: String,
    postId: Double,
    settings: PartialEditorSettings,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
  
  @JSImport("@wordpress/edit-post", "reinitializeEditor")
  @js.native
  def reinitializeEditor(postType: String, postId: String, target: typings.std.Element): Unit = js.native
  @JSImport("@wordpress/edit-post", "reinitializeEditor")
  @js.native
  def reinitializeEditor(
    postType: String,
    postId: String,
    target: typings.std.Element,
    settings: js.UndefOr[scala.Nothing],
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
  @JSImport("@wordpress/edit-post", "reinitializeEditor")
  @js.native
  def reinitializeEditor(postType: String, postId: String, target: typings.std.Element, settings: PartialEditorSettings): Unit = js.native
  @JSImport("@wordpress/edit-post", "reinitializeEditor")
  @js.native
  def reinitializeEditor(
    postType: String,
    postId: String,
    target: typings.std.Element,
    settings: PartialEditorSettings,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
  @JSImport("@wordpress/edit-post", "reinitializeEditor")
  @js.native
  def reinitializeEditor(postType: String, postId: Double, target: typings.std.Element): Unit = js.native
  @JSImport("@wordpress/edit-post", "reinitializeEditor")
  @js.native
  def reinitializeEditor(
    postType: String,
    postId: Double,
    target: typings.std.Element,
    settings: js.UndefOr[scala.Nothing],
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
  @JSImport("@wordpress/edit-post", "reinitializeEditor")
  @js.native
  def reinitializeEditor(postType: String, postId: Double, target: typings.std.Element, settings: PartialEditorSettings): Unit = js.native
  @JSImport("@wordpress/edit-post", "reinitializeEditor")
  @js.native
  def reinitializeEditor(
    postType: String,
    postId: Double,
    target: typings.std.Element,
    settings: PartialEditorSettings,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = js.native
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", "dispatch")
    @js.native
    def dispatch_coreeditpost(key: `coreSlashedit-post`): TypeofimportedActions = js.native
    
    @JSImport("@wordpress/data", "select")
    @js.native
    def select_coreeditpost(key: `coreSlashedit-post`): TypeofimportedSelectors = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressEditPost.wordpressEditPostStrings.text
    - typings.wordpressEditPost.wordpressEditPostStrings.visual
  */
  trait EditorMode extends StObject
  object EditorMode {
    
    @scala.inline
    def text: typings.wordpressEditPost.wordpressEditPostStrings.text = "text".asInstanceOf[typings.wordpressEditPost.wordpressEditPostStrings.text]
    
    @scala.inline
    def visual: typings.wordpressEditPost.wordpressEditPostStrings.visual = "visual".asInstanceOf[typings.wordpressEditPost.wordpressEditPostStrings.visual]
  }
  
  @js.native
  trait EditorSettings extends StObject {
    
    /**
      * Enable/Disable Wide/Full Alignments
      * @defaultValue `false`
      */
    var alignWide: Boolean = js.native
    
    /**
      * Array of allowed block types, `true` for all blocks, or `false` for no blocks.
      * @defaultValue `true`
      */
    var allowedBlockTypes: js.Array[String] | Boolean = js.native
    
    /**
      * Mapping of extension:mimetype
      * @example
      * ```js
      * {
      *   "jpg|jpeg|jpe": "image/jpeg",
      * }
      * ```
      */
    var allowedMimeTypes: (Record[String, String]) | Null = js.native
    
    var autosaveInterval: Double = js.native
    
    /**
      * Array of objects representing the legacy widgets available.
      */
    var availableLegacyWidgets: js.Array[Description] = js.native
    
    // FIXME: it is unclear what this value should be.
    var availableTemplates: js.Array[_] = js.native
    
    /**
      * Empty post placeholder.
      * @defaultValue `"Start writing or type / to choose a block"`
      */
    var bodyPlaceholder: String = js.native
    
    /**
      * Whether or not the user can switch to the code editor.
      */
    var codeEditingEnabled: Boolean = js.native
    
    /**
      * Palette colors.
      */
    var colors: js.Array[Color] = js.native
    
    /**
      * Whether or not the custom colors are disabled.
      */
    var disableCustomColors: Boolean = js.native
    
    /**
      * Whether or not the custom font sizes are disabled.
      */
    var disableCustomFontSizes: Boolean = js.native
    
    /**
      * Whether or not the custom post formats are disabled.
      */
    var disablePostFormats: Boolean = js.native
    
    /**
      * Whether or not the custom fields are enabled.
      */
    var enableCustomFields: Boolean = js.native
    
    /**
      * Whether the focus mode is enabled or not.
      */
    var focusMode: Boolean = js.native
    
    /**
      * Array of available font sizes.
      */
    var fontSizes: js.Array[Name] = js.native
    
    /**
      * Whether or not the editor toolbar is fixed.
      */
    var hasFixedToolbar: Boolean = js.native
    
    /**
      * Whether or not the user is able to manage widgets.
      */
    var hasPermissionsToManageWidgets: Boolean = js.native
    
    /**
      * Available image sizes.
      */
    var imageSizes: js.Array[Slug] = js.native
    
    /**
      * Whether the editor is in RTL mode.
      */
    var isRTL: Boolean = js.native
    
    var maxUploadFileSize: Double = js.native
    
    /**
      * Max width to constraint resizing.
      */
    var maxWidth: Double = js.native
    
    var postLock: IsLocked = js.native
    
    var postLockUtils: AjaxUrl = js.native
    
    var richEditingEnabled: Boolean = js.native
    
    var styles: js.Array[Css] = js.native
    
    /**
      * Empty title placeholder.
      * @defaultValue `"Add title"`
      */
    var titlePlaceholder: String = js.native
  }
  object EditorSettings {
    
    @scala.inline
    def apply(
      alignWide: Boolean,
      allowedBlockTypes: js.Array[String] | Boolean,
      autosaveInterval: Double,
      availableLegacyWidgets: js.Array[Description],
      availableTemplates: js.Array[_],
      bodyPlaceholder: String,
      codeEditingEnabled: Boolean,
      colors: js.Array[Color],
      disableCustomColors: Boolean,
      disableCustomFontSizes: Boolean,
      disablePostFormats: Boolean,
      enableCustomFields: Boolean,
      focusMode: Boolean,
      fontSizes: js.Array[Name],
      hasFixedToolbar: Boolean,
      hasPermissionsToManageWidgets: Boolean,
      imageSizes: js.Array[Slug],
      isRTL: Boolean,
      maxUploadFileSize: Double,
      maxWidth: Double,
      postLock: IsLocked,
      postLockUtils: AjaxUrl,
      richEditingEnabled: Boolean,
      styles: js.Array[Css],
      titlePlaceholder: String
    ): EditorSettings = {
      val __obj = js.Dynamic.literal(alignWide = alignWide.asInstanceOf[js.Any], allowedBlockTypes = allowedBlockTypes.asInstanceOf[js.Any], autosaveInterval = autosaveInterval.asInstanceOf[js.Any], availableLegacyWidgets = availableLegacyWidgets.asInstanceOf[js.Any], availableTemplates = availableTemplates.asInstanceOf[js.Any], bodyPlaceholder = bodyPlaceholder.asInstanceOf[js.Any], codeEditingEnabled = codeEditingEnabled.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], disableCustomColors = disableCustomColors.asInstanceOf[js.Any], disableCustomFontSizes = disableCustomFontSizes.asInstanceOf[js.Any], disablePostFormats = disablePostFormats.asInstanceOf[js.Any], enableCustomFields = enableCustomFields.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], fontSizes = fontSizes.asInstanceOf[js.Any], hasFixedToolbar = hasFixedToolbar.asInstanceOf[js.Any], hasPermissionsToManageWidgets = hasPermissionsToManageWidgets.asInstanceOf[js.Any], imageSizes = imageSizes.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], maxUploadFileSize = maxUploadFileSize.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], postLock = postLock.asInstanceOf[js.Any], postLockUtils = postLockUtils.asInstanceOf[js.Any], richEditingEnabled = richEditingEnabled.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], titlePlaceholder = titlePlaceholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorSettings]
    }
    
    @scala.inline
    implicit class EditorSettingsMutableBuilder[Self <: EditorSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignWide(value: Boolean): Self = StObject.set(x, "alignWide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedBlockTypes(value: js.Array[String] | Boolean): Self = StObject.set(x, "allowedBlockTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedBlockTypesVarargs(value: String*): Self = StObject.set(x, "allowedBlockTypes", js.Array(value :_*))
      
      @scala.inline
      def setAllowedMimeTypes(value: Record[String, String]): Self = StObject.set(x, "allowedMimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedMimeTypesNull: Self = StObject.set(x, "allowedMimeTypes", null)
      
      @scala.inline
      def setAutosaveInterval(value: Double): Self = StObject.set(x, "autosaveInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableLegacyWidgets(value: js.Array[Description]): Self = StObject.set(x, "availableLegacyWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableLegacyWidgetsVarargs(value: Description*): Self = StObject.set(x, "availableLegacyWidgets", js.Array(value :_*))
      
      @scala.inline
      def setAvailableTemplates(value: js.Array[_]): Self = StObject.set(x, "availableTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableTemplatesVarargs(value: js.Any*): Self = StObject.set(x, "availableTemplates", js.Array(value :_*))
      
      @scala.inline
      def setBodyPlaceholder(value: String): Self = StObject.set(x, "bodyPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeEditingEnabled(value: Boolean): Self = StObject.set(x, "codeEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCustomFontSizes(value: Boolean): Self = StObject.set(x, "disableCustomFontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePostFormats(value: Boolean): Self = StObject.set(x, "disablePostFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCustomFields(value: Boolean): Self = StObject.set(x, "enableCustomFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusMode(value: Boolean): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizes(value: js.Array[Name]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizesVarargs(value: Name*): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
      
      @scala.inline
      def setHasFixedToolbar(value: Boolean): Self = StObject.set(x, "hasFixedToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPermissionsToManageWidgets(value: Boolean): Self = StObject.set(x, "hasPermissionsToManageWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizes(value: js.Array[Slug]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizesVarargs(value: Slug*): Self = StObject.set(x, "imageSizes", js.Array(value :_*))
      
      @scala.inline
      def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUploadFileSize(value: Double): Self = StObject.set(x, "maxUploadFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLock(value: IsLocked): Self = StObject.set(x, "postLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLockUtils(value: AjaxUrl): Self = StObject.set(x, "postLockUtils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRichEditingEnabled(value: Boolean): Self = StObject.set(x, "richEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: js.Array[Css]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: Css*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MetaboxDescriptor extends StObject {
    
    var id: String = js.native
    
    var title: String = js.native
  }
  object MetaboxDescriptor {
    
    @scala.inline
    def apply(id: String, title: String): MetaboxDescriptor = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaboxDescriptor]
    }
    
    @scala.inline
    implicit class MetaboxDescriptorMutableBuilder[Self <: MetaboxDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressEditPost.wordpressEditPostStrings.advanced
    - typings.wordpressEditPost.wordpressEditPostStrings.normal
    - typings.wordpressEditPost.wordpressEditPostStrings.side
  */
  trait MetaboxLocation extends StObject
  object MetaboxLocation {
    
    @scala.inline
    def advanced: typings.wordpressEditPost.wordpressEditPostStrings.advanced = "advanced".asInstanceOf[typings.wordpressEditPost.wordpressEditPostStrings.advanced]
    
    @scala.inline
    def normal: typings.wordpressEditPost.wordpressEditPostStrings.normal = "normal".asInstanceOf[typings.wordpressEditPost.wordpressEditPostStrings.normal]
    
    @scala.inline
    def side: typings.wordpressEditPost.wordpressEditPostStrings.side = "side".asInstanceOf[typings.wordpressEditPost.wordpressEditPostStrings.side]
  }
}
