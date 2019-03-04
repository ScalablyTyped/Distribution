package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.contentEditingHelper
  * @description A helper service for most editors, some methods are specific to content/media/member model types but most are used by
  * all editors to share logic and reduce the amount of replicated code among editors.
  */
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
  def getAllProps(content: js.Any): js.Any
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#configureButtons
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * Returns a letter array for buttons, with the primary one first based on content model, permissions and editor state
    */
  def getAllowedActions(content: js.Any, creating: js.Any): js.Array[java.lang.String]
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
  def getButtonFromAction(ch: java.lang.String): js.Any
  /**
    * @ngdoc function
    * @name umbraco.services.contentEditingHelper#handleSaveError
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * A function to handle what happens when we have validation issues from the server side
    */
  def handleSaveError(args: js.Any*): scala.Unit
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
  def handleSuccessfulSave(args: js.Any*): scala.Unit
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#reBindChangedProperties
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * re-binds all changed property values to the origContent object from the savedContent object and returns an array of changed properties.
    */
  def reBindChangedProperties(origContent: js.Any, savedContent: js.Any): scala.Unit
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
  def redirectToCreatedContent(id: scala.Double, modelState: js.Any): scala.Unit
}

object IContentEditingHelper {
  @scala.inline
  def apply(
    getAllProps: js.Function1[js.Any, js.Any],
    getAllowedActions: js.Function2[js.Any, js.Any, js.Array[java.lang.String]],
    getButtonFromAction: js.Function1[java.lang.String, js.Any],
    handleSaveError: js.Function1[/* repeated */ js.Any, scala.Unit],
    handleSuccessfulSave: js.Function1[/* repeated */ js.Any, scala.Unit],
    reBindChangedProperties: js.Function2[js.Any, js.Any, scala.Unit],
    redirectToCreatedContent: js.Function2[scala.Double, js.Any, scala.Unit]
  ): IContentEditingHelper = {
    val __obj = js.Dynamic.literal(getAllProps = getAllProps, getAllowedActions = getAllowedActions, getButtonFromAction = getButtonFromAction, handleSaveError = handleSaveError, handleSuccessfulSave = handleSuccessfulSave, reBindChangedProperties = reBindChangedProperties, redirectToCreatedContent = redirectToCreatedContent)
  
    __obj.asInstanceOf[IContentEditingHelper]
  }
}

