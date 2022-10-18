package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import typings.std.ImageData
import typings.std.PredefinedColorSpace
import typings.webextensionPolyfill.anon.Instantiable
import typings.webextensionPolyfill.anon.InstantiableRequestContentScript
import typings.webextensionPolyfill.anon.InstantiableSetIcon
import typings.webextensionPolyfill.anon.InstantiableShowAction
import typings.webextensionPolyfill.namespacesEventsMod.Events.UrlFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesDeclarativeContentMod {
  
  object DeclarativeContent {
    
    /**
      * See <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageData">https://developer.mozilla.
      * org/en-US/docs/Web/API/ImageData</a>.
      */
    trait ImageDataType
      extends StObject
         with ImageData
         with /* s */ StringDictionary[Any]
    object ImageDataType {
      
      inline def apply(
        colorSpace: PredefinedColorSpace,
        data: js.typedarray.Uint8ClampedArray,
        height: Double,
        width: Double
      ): ImageDataType = {
        val __obj = js.Dynamic.literal(colorSpace = colorSpace.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[ImageDataType]
      }
    }
    
    /**
      * Matches the state of a web page based on various criteria.
      */
    trait PageStateMatcher extends StObject {
      
      /**
        * Matches if all of the CSS selectors in the array match displayed elements in a frame with the same origin as the page's
        * main frame. All selectors in this array must be <a href="http://www.w3.org/TR/selectors4/#compound">
        * compound selectors</a> to speed up matching. Note: Listing hundreds of CSS selectors or listing CSS selectors that match
        * hundreds of times per page can slow down web sites.
        * Optional.
        */
      var css: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Matches if the bookmarked state of the page is equal to the specified value. Requres the <a href='declare_permissions'>
        * bookmarks permission</a>.
        * Optional.
        */
      var isBookmarked: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Matches if the conditions of the <code>UrlFilter</code> are fulfilled for the top-level URL of the page.
        * Optional.
        */
      var pageUrl: js.UndefOr[UrlFilter] = js.undefined
    }
    object PageStateMatcher {
      
      inline def apply(): PageStateMatcher = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PageStateMatcher]
      }
      
      extension [Self <: PageStateMatcher](x: Self) {
        
        inline def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        
        inline def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value*))
        
        inline def setIsBookmarked(value: Boolean): Self = StObject.set(x, "isBookmarked", value.asInstanceOf[js.Any])
        
        inline def setIsBookmarkedUndefined: Self = StObject.set(x, "isBookmarked", js.undefined)
        
        inline def setPageUrl(value: UrlFilter): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
        
        inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
      }
    }
    
    /**
      * Declarative event action that injects a content script. <p><b>WARNING:</b> This action is still experimental and is not
      * supported on stable builds of Chrome.</p>
      */
    trait RequestContentScript extends StObject {
      
      /**
        * Whether the content script runs in all frames of the matching page, or in only the top frame. Default is <code>
        * false</code>.
        * Optional.
        */
      var allFrames: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Names of CSS files to be injected as a part of the content script.
        * Optional.
        */
      var css: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Names of JavaScript files to be injected as a part of the content script.
        * Optional.
        */
      @JSName("js")
      var js_ : js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Whether to insert the content script on <code>about:blank</code> and <code>about:srcdoc</code>. Default is <code>
        * false</code>.
        * Optional.
        */
      var matchAboutBlank: js.UndefOr[Boolean] = js.undefined
    }
    object RequestContentScript {
      
      inline def apply(): RequestContentScript = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RequestContentScript]
      }
      
      extension [Self <: RequestContentScript](x: Self) {
        
        inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
        
        inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
        
        inline def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        
        inline def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value*))
        
        inline def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
        
        inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
        
        inline def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value*))
        
        inline def setMatchAboutBlank(value: Boolean): Self = StObject.set(x, "matchAboutBlank", value.asInstanceOf[js.Any])
        
        inline def setMatchAboutBlankUndefined: Self = StObject.set(x, "matchAboutBlank", js.undefined)
      }
    }
    
    trait Rule[TCondition, TAction] extends StObject {
      
      /**
        * List of actions that are triggered if one of the conditions is fulfilled.
        */
      var actions: js.Array[TAction]
      
      /**
        * List of conditions that can trigger the actions.
        */
      var conditions: js.Array[TCondition]
    }
    object Rule {
      
      inline def apply[TCondition, TAction](actions: js.Array[TAction], conditions: js.Array[TCondition]): Rule[TCondition, TAction] = {
        val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
        __obj.asInstanceOf[Rule[TCondition, TAction]]
      }
      
      extension [Self <: Rule[?, ?], TCondition, TAction](x: Self & (Rule[TCondition, TAction])) {
        
        inline def setActions(value: js.Array[TAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        inline def setActionsVarargs(value: TAction*): Self = StObject.set(x, "actions", js.Array(value*))
        
        inline def setConditions(value: js.Array[TCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
        
        inline def setConditionsVarargs(value: TCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
      }
    }
    
    /**
      * An object which allows the addition and removal of rules for declarative content.
      */
    @js.native
    trait RuleEvent[TCondition, TAction] extends StObject {
      
      /**
        * Registers rules to handle events.
        *
        * @param rules Rules to be registered. These do not replace previously registered rules.
        */
      def addRules(rules: js.Array[Rule[TCondition, TAction]]): Unit = js.native
      
      /**
        * Fetches currently registered rules.
        *
        * @param rules Optional. Rule ids to fetch.
        * @param callback Optional. Called when rules have been fetched.
        */
      def getRules(): Unit = js.native
      def getRules(rules: js.Array[String]): Unit = js.native
      def getRules(
        rules: js.Array[String],
        callback: js.Function1[/* rules */ js.Array[Rule[TCondition, TAction]], Unit]
      ): Unit = js.native
      def getRules(rules: Unit, callback: js.Function1[/* rules */ js.Array[Rule[TCondition, TAction]], Unit]): Unit = js.native
      
      /**
        * Unregisters currently registered rules.
        *
        * @param rules Optional. Rule ids to be unregistered.
        * @param callback Optional. Called when rules were unregistered.
        */
      def removeRules(): Unit = js.native
      def removeRules(rules: js.Array[String]): Unit = js.native
      def removeRules(rules: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
      def removeRules(rules: Unit, callback: js.Function0[Unit]): Unit = js.native
    }
    
    /**
      * Declarative event action that sets the n-<abbr title="device-independent pixel">dip</abbr>
      * square icon for the extension's $(ref:pageAction page action) or $(ref:browserAction browser action)
      * while the corresponding conditions are met. This action can be used without <a href="declare_permissions.
      * html#host-permissions">host permissions</a>, but the extension must have a page or browser action.<p>
      * Exactly one of <code>imageData</code> or <code>path</code> must be specified. Both are dictionaries mapping a number of
      * pixels to an image representation. The image representation in <code>imageData</code> is an <a href="https://developer.
      * mozilla.org/en-US/docs/Web/API/ImageData">ImageData</a> object; for example, from a <code>canvas</code> element,
      * while the image representation in <code>path</code> is the path to an image file relative to the extension's manifest.
      * If <code>scale</code> screen pixels fit into a device-independent pixel, the <code>scale * n</code> icon is used.
      * If that scale is missing, another image is resized to the required size.</p>
      */
    trait SetIcon extends StObject {
      
      /**
        * Either an <code>ImageData</code> object or a dictionary {size -> ImageData} representing an icon to be set.
        * If the icon is specified as a dictionary, the image used is chosen depending on the screen's pixel density.
        * If the number of image pixels that fit into one screen space unit equals <code>scale</code>,
        * then an image with size <code>scale * n</code> is selected, where <i>n</i> is the size of the icon in the UI.
        * At least one image must be specified. Note that <code>details.imageData = foo</code> is equivalent to <code>details.
        * imageData = {'16': foo}</code>.
        * Optional.
        */
      var imageData: js.UndefOr[ImageDataType | SetIconImageDataC2Type] = js.undefined
    }
    object SetIcon {
      
      inline def apply(): SetIcon = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SetIcon]
      }
      
      extension [Self <: SetIcon](x: Self) {
        
        inline def setImageData(value: ImageDataType | SetIconImageDataC2Type): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
        
        inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
      }
    }
    
    type SetIconImageDataC2Type = StringDictionary[Any]
    
    /**
      * Declarative event action that shows the extension's toolbar action ($(ref:pageAction page action)
      * or $(ref:browserAction browser action)) while the corresponding conditions are met.
      * This action can be used without <a href="declare_permissions#host-permissions">host permissions</a>.
      * If the extension has the <a href="activeTab.html">activeTab</a> permission, clicking the page action grants access to
      * the active tab.
      */
    type ShowAction = StringDictionary[Any]
    
    /**
      * Please use ShowAction.
      */
    type ShowPageAction = scala.Nothing
    
    trait Static extends StObject {
      
      var PageStateMatcher: Instantiable
      
      var RequestContentScript: InstantiableRequestContentScript
      
      var SetIcon: InstantiableSetIcon
      
      var ShowAction: InstantiableShowAction
      
      var onPageChanged: RuleEvent[PageStateMatcher, RequestContentScript | SetIcon | ShowPageAction | ShowAction]
    }
    object Static {
      
      inline def apply(
        PageStateMatcher: Instantiable,
        RequestContentScript: InstantiableRequestContentScript,
        SetIcon: InstantiableSetIcon,
        ShowAction: InstantiableShowAction,
        onPageChanged: RuleEvent[PageStateMatcher, RequestContentScript | SetIcon | ShowPageAction | ShowAction]
      ): Static = {
        val __obj = js.Dynamic.literal(PageStateMatcher = PageStateMatcher.asInstanceOf[js.Any], RequestContentScript = RequestContentScript.asInstanceOf[js.Any], SetIcon = SetIcon.asInstanceOf[js.Any], ShowAction = ShowAction.asInstanceOf[js.Any], onPageChanged = onPageChanged.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setOnPageChanged(value: RuleEvent[PageStateMatcher, RequestContentScript | SetIcon | ShowPageAction | ShowAction]): Self = StObject.set(x, "onPageChanged", value.asInstanceOf[js.Any])
        
        inline def setPageStateMatcher(value: Instantiable): Self = StObject.set(x, "PageStateMatcher", value.asInstanceOf[js.Any])
        
        inline def setRequestContentScript(value: InstantiableRequestContentScript): Self = StObject.set(x, "RequestContentScript", value.asInstanceOf[js.Any])
        
        inline def setSetIcon(value: InstantiableSetIcon): Self = StObject.set(x, "SetIcon", value.asInstanceOf[js.Any])
        
        inline def setShowAction(value: InstantiableShowAction): Self = StObject.set(x, "ShowAction", value.asInstanceOf[js.Any])
      }
    }
  }
}
