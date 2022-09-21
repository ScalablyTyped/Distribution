package typings.wordpressAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindHandlers extends StObject {
  
  /**
    * Bind region mode event callbacks.
    */
  def bindHandlers(): Unit
  
  // RouterView => media.view.Router
  /**
    * Render callback for the content region in the `browse` mode.
    */
  def browseContent(contentRegion: typings.wordpressAdmin.mediaViewsMod.Region): Unit
  
  /**
    * Render callback for the router region in the `browse` mode.
    */
  def browseRouter(routerView: Any): Unit
  
  def createSelectToolbar(toolbar: Any, option: Any): Unit
  
  /**
    * Attach a selection collection to the frame.
    *
    * A selection is a collection of attachments used for a specific purpose
    * by a media frame. e.g. Selecting an attachment (or many) to insert into
    * post content.
    */
  def createSelection(): Unit
  
  /**
    * Create the default states on the frame.
    */
  def createStates(): Unit
  
  def editImageContent(): Unit
  
  def initialize(): Unit
  
  /**
    * Render callback for the content region in the `upload` mode.
    */
  def uploadContent(): Unit
}
object BindHandlers {
  
  inline def apply(
    bindHandlers: () => Unit,
    browseContent: typings.wordpressAdmin.mediaViewsMod.Region => Unit,
    browseRouter: Any => Unit,
    createSelectToolbar: (Any, Any) => Unit,
    createSelection: () => Unit,
    createStates: () => Unit,
    editImageContent: () => Unit,
    initialize: () => Unit,
    uploadContent: () => Unit
  ): BindHandlers = {
    val __obj = js.Dynamic.literal(bindHandlers = js.Any.fromFunction0(bindHandlers), browseContent = js.Any.fromFunction1(browseContent), browseRouter = js.Any.fromFunction1(browseRouter), createSelectToolbar = js.Any.fromFunction2(createSelectToolbar), createSelection = js.Any.fromFunction0(createSelection), createStates = js.Any.fromFunction0(createStates), editImageContent = js.Any.fromFunction0(editImageContent), initialize = js.Any.fromFunction0(initialize), uploadContent = js.Any.fromFunction0(uploadContent))
    __obj.asInstanceOf[BindHandlers]
  }
  
  extension [Self <: BindHandlers](x: Self) {
    
    inline def setBindHandlers(value: () => Unit): Self = StObject.set(x, "bindHandlers", js.Any.fromFunction0(value))
    
    inline def setBrowseContent(value: typings.wordpressAdmin.mediaViewsMod.Region => Unit): Self = StObject.set(x, "browseContent", js.Any.fromFunction1(value))
    
    inline def setBrowseRouter(value: Any => Unit): Self = StObject.set(x, "browseRouter", js.Any.fromFunction1(value))
    
    inline def setCreateSelectToolbar(value: (Any, Any) => Unit): Self = StObject.set(x, "createSelectToolbar", js.Any.fromFunction2(value))
    
    inline def setCreateSelection(value: () => Unit): Self = StObject.set(x, "createSelection", js.Any.fromFunction0(value))
    
    inline def setCreateStates(value: () => Unit): Self = StObject.set(x, "createStates", js.Any.fromFunction0(value))
    
    inline def setEditImageContent(value: () => Unit): Self = StObject.set(x, "editImageContent", js.Any.fromFunction0(value))
    
    inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    inline def setUploadContent(value: () => Unit): Self = StObject.set(x, "uploadContent", js.Any.fromFunction0(value))
  }
}
