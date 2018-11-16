package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*Tracks the parent object for complex editors by exposing it as an object reference via editorState.current.entity
     * it is possible to modify this object, so should be used with care */

trait IState extends js.Object {
  /**
          * @ngdoc function
          * @name umbraco.services.angularHelper#getCurrent
          * @methodOf umbraco.services.editorState
          * @function
          *
          * @description
          * Returns an object reference to the current editor entity.
          * the entity is the root object of the editor.
          * EditorState is used by property/parameter editors that need
          * access to the entire entity being edited, not just the property/parameter
          *
          * editorState.current can not be overwritten, you should only read values from it
          * since modifying individual properties should be handled by the property editors
          */
  def getCurrent(): js.Any
  /**
          * @ngdoc function
          * @name umbraco.services.angularHelper#reset
          * @methodOf umbraco.services.editorState
          * @function
          *
          * @description
          * Since the editorstate entity is read-only, you cannot set it to null
          * only through the reset() method
          */
  def reset(): scala.Unit
  /**
          * @ngdoc function
          * @name umbraco.services.angularHelper#set
          * @methodOf umbraco.services.editorState
          * @function
          *
          * @description
          * Sets the current entity object for the currently active editor
          * This is only used when implementing an editor with a complex model
          * like the content editor, where the model is modified by several
          * child controllers.
          */
  def set(entity: js.Object): scala.Unit
}

