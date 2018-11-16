package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * Tracks the parent object for complex editors by exposing it as an object reference via editorState.current.entity
    * it is possible to modify this object, so should be used with care
    */

trait IEditorState extends js.Object {
  var current: js.Any
  var state: IState
}

