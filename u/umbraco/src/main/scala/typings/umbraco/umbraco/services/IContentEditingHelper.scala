package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.contentEditingHelper
  * @description A helper service for most editors, some methods are specific to content/media/member model types but most are used by
  * all editors to share logic and reduce the amount of replicated code among editors.
  */
@js.native
trait IContentEditingHelper extends js.Object {
  
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#getAllProps
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * Returns all propertes contained for the content item (since the normal model has properties contained inside of tabs)
    */
  def getAllProps(content: js.Any): js.Any = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#configureButtons
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * Returns a letter array for buttons, with the primary one first based on content model, permissions and editor state
    */
  def getAllowedActions(content: js.Any, creating: js.Any): js.Array[String] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#getButtonFromAction
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * Returns a button object to render a button for the tabbed editor
    * currently only returns built in system buttons for content and media actions
    * returns label, alias, action char and hot-key
    */
  def getButtonFromAction(ch: String): js.Any = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.contentEditingHelper#handleSaveError
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * A function to handle what happens when we have validation issues from the server side
    */
  def handleSaveError(args: js.Any*): Unit = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.contentEditingHelper#handleSuccessfulSave
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * A function to handle when saving a content item is successful. This will rebind the values of the model that have changed
    * ensure the notifications are displayed and that the appropriate events are fired. This will also check if we need to redirect
    * when we're creating new content.
    */
  def handleSuccessfulSave(args: js.Any*): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#reBindChangedProperties
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * re-binds all changed property values to the origContent object from the savedContent object and returns an array of changed properties.
    */
  def reBindChangedProperties(origContent: js.Any, savedContent: js.Any): Unit = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.contentEditingHelper#redirectToCreatedContent
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * Changes the location to be editing the newly created content after create was successful.
    * We need to decide if we need to redirect to edito mode or if we will remain in create mode.
    * We will only need to maintain create mode if we have not fulfilled the basic requirements for creating an entity which is at least having a name.
    */
  def redirectToCreatedContent(id: Double, modelState: js.Any): Unit = js.native
}
object IContentEditingHelper {
  
  @scala.inline
  def apply(
    getAllProps: js.Any => js.Any,
    getAllowedActions: (js.Any, js.Any) => js.Array[String],
    getButtonFromAction: String => js.Any,
    handleSaveError: /* repeated */ js.Any => Unit,
    handleSuccessfulSave: /* repeated */ js.Any => Unit,
    reBindChangedProperties: (js.Any, js.Any) => Unit,
    redirectToCreatedContent: (Double, js.Any) => Unit
  ): IContentEditingHelper = {
    val __obj = js.Dynamic.literal(getAllProps = js.Any.fromFunction1(getAllProps), getAllowedActions = js.Any.fromFunction2(getAllowedActions), getButtonFromAction = js.Any.fromFunction1(getButtonFromAction), handleSaveError = js.Any.fromFunction1(handleSaveError), handleSuccessfulSave = js.Any.fromFunction1(handleSuccessfulSave), reBindChangedProperties = js.Any.fromFunction2(reBindChangedProperties), redirectToCreatedContent = js.Any.fromFunction2(redirectToCreatedContent))
    __obj.asInstanceOf[IContentEditingHelper]
  }
  
  @scala.inline
  implicit class IContentEditingHelperOps[Self <: IContentEditingHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAllProps(value: js.Any => js.Any): Self = this.set("getAllProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllowedActions(value: (js.Any, js.Any) => js.Array[String]): Self = this.set("getAllowedActions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetButtonFromAction(value: String => js.Any): Self = this.set("getButtonFromAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleSaveError(value: /* repeated */ js.Any => Unit): Self = this.set("handleSaveError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleSuccessfulSave(value: /* repeated */ js.Any => Unit): Self = this.set("handleSuccessfulSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReBindChangedProperties(value: (js.Any, js.Any) => Unit): Self = this.set("reBindChangedProperties", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRedirectToCreatedContent(value: (Double, js.Any) => Unit): Self = this.set("redirectToCreatedContent", js.Any.fromFunction2(value))
  }
}
