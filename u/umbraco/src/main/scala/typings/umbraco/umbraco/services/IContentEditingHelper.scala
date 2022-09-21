package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.contentEditingHelper
  * @description A helper service for most editors, some methods are specific to content/media/member model types but most are used by
  * all editors to share logic and reduce the amount of replicated code among editors.
  */
trait IContentEditingHelper extends StObject {
  
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#getAllProps
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * Returns all propertes contained for the content item (since the normal model has properties contained inside of tabs)
    */
  def getAllProps(content: Any): Any
  
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#configureButtons
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * Returns a letter array for buttons, with the primary one first based on content model, permissions and editor state
    */
  def getAllowedActions(content: Any, creating: Any): js.Array[String]
  
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
  def getButtonFromAction(ch: String): Any
  
  /**
    * @ngdoc function
    * @name umbraco.services.contentEditingHelper#handleSaveError
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * A function to handle what happens when we have validation issues from the server side
    */
  def handleSaveError(args: Any*): Unit
  
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
  def handleSuccessfulSave(args: Any*): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#reBindChangedProperties
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * re-binds all changed property values to the origContent object from the savedContent object and returns an array of changed properties.
    */
  def reBindChangedProperties(origContent: Any, savedContent: Any): Unit
  
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
  def redirectToCreatedContent(id: Double, modelState: Any): Unit
}
object IContentEditingHelper {
  
  inline def apply(
    getAllProps: Any => Any,
    getAllowedActions: (Any, Any) => js.Array[String],
    getButtonFromAction: String => Any,
    handleSaveError: /* repeated */ Any => Unit,
    handleSuccessfulSave: /* repeated */ Any => Unit,
    reBindChangedProperties: (Any, Any) => Unit,
    redirectToCreatedContent: (Double, Any) => Unit
  ): IContentEditingHelper = {
    val __obj = js.Dynamic.literal(getAllProps = js.Any.fromFunction1(getAllProps), getAllowedActions = js.Any.fromFunction2(getAllowedActions), getButtonFromAction = js.Any.fromFunction1(getButtonFromAction), handleSaveError = js.Any.fromFunction1(handleSaveError), handleSuccessfulSave = js.Any.fromFunction1(handleSuccessfulSave), reBindChangedProperties = js.Any.fromFunction2(reBindChangedProperties), redirectToCreatedContent = js.Any.fromFunction2(redirectToCreatedContent))
    __obj.asInstanceOf[IContentEditingHelper]
  }
  
  extension [Self <: IContentEditingHelper](x: Self) {
    
    inline def setGetAllProps(value: Any => Any): Self = StObject.set(x, "getAllProps", js.Any.fromFunction1(value))
    
    inline def setGetAllowedActions(value: (Any, Any) => js.Array[String]): Self = StObject.set(x, "getAllowedActions", js.Any.fromFunction2(value))
    
    inline def setGetButtonFromAction(value: String => Any): Self = StObject.set(x, "getButtonFromAction", js.Any.fromFunction1(value))
    
    inline def setHandleSaveError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "handleSaveError", js.Any.fromFunction1(value))
    
    inline def setHandleSuccessfulSave(value: /* repeated */ Any => Unit): Self = StObject.set(x, "handleSuccessfulSave", js.Any.fromFunction1(value))
    
    inline def setReBindChangedProperties(value: (Any, Any) => Unit): Self = StObject.set(x, "reBindChangedProperties", js.Any.fromFunction2(value))
    
    inline def setRedirectToCreatedContent(value: (Double, Any) => Unit): Self = StObject.set(x, "redirectToCreatedContent", js.Any.fromFunction2(value))
  }
}
