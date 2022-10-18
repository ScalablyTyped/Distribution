package typings.webextensionPolyfill.namespacesTabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the changes to the state of the tab that was updated.
  */
trait OnUpdatedChangeInfoType extends StObject {
  
  /**
    * The tab's new attention state.
    * Optional.
    */
  var attention: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tab's new audible state.
    * Optional.
    */
  var audible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True while the tab is not loaded with content.
    * Optional.
    */
  var discarded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tab's new favicon URL. This property is only present if the extension's manifest includes the <code>"tabs"</code>
    * permission.
    * Optional.
    */
  var favIconUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The tab's new hidden state.
    * Optional.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the document in the tab can be rendered in reader mode.
    * Optional.
    */
  var isArticle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tab's new muted state and the reason for the change.
    * Optional.
    */
  var mutedInfo: js.UndefOr[MutedInfo] = js.undefined
  
  /**
    * The tab's new pinned state.
    * Optional.
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tab's new sharing state for screen, microphone and camera.
    * Optional.
    */
  var sharingState: js.UndefOr[SharingState] = js.undefined
  
  /**
    * The status of the tab. Can be either <em>loading</em> or <em>complete</em>.
    * Optional.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the tab if it has changed. This property is only present if the extension's manifest includes the <code>
    * "tabs"</code> permission.
    * Optional.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The tab's URL if it has changed. This property is only present if the extension's manifest includes the <code>
    * "tabs"</code> permission.
    * Optional.
    */
  var url: js.UndefOr[String] = js.undefined
}
object OnUpdatedChangeInfoType {
  
  inline def apply(): OnUpdatedChangeInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnUpdatedChangeInfoType]
  }
  
  extension [Self <: OnUpdatedChangeInfoType](x: Self) {
    
    inline def setAttention(value: Boolean): Self = StObject.set(x, "attention", value.asInstanceOf[js.Any])
    
    inline def setAttentionUndefined: Self = StObject.set(x, "attention", js.undefined)
    
    inline def setAudible(value: Boolean): Self = StObject.set(x, "audible", value.asInstanceOf[js.Any])
    
    inline def setAudibleUndefined: Self = StObject.set(x, "audible", js.undefined)
    
    inline def setDiscarded(value: Boolean): Self = StObject.set(x, "discarded", value.asInstanceOf[js.Any])
    
    inline def setDiscardedUndefined: Self = StObject.set(x, "discarded", js.undefined)
    
    inline def setFavIconUrl(value: String): Self = StObject.set(x, "favIconUrl", value.asInstanceOf[js.Any])
    
    inline def setFavIconUrlUndefined: Self = StObject.set(x, "favIconUrl", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIsArticle(value: Boolean): Self = StObject.set(x, "isArticle", value.asInstanceOf[js.Any])
    
    inline def setIsArticleUndefined: Self = StObject.set(x, "isArticle", js.undefined)
    
    inline def setMutedInfo(value: MutedInfo): Self = StObject.set(x, "mutedInfo", value.asInstanceOf[js.Any])
    
    inline def setMutedInfoUndefined: Self = StObject.set(x, "mutedInfo", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setSharingState(value: SharingState): Self = StObject.set(x, "sharingState", value.asInstanceOf[js.Any])
    
    inline def setSharingStateUndefined: Self = StObject.set(x, "sharingState", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
