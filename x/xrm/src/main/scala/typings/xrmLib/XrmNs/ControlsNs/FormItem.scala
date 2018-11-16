package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Interface for an entity's form selector item.
         */

trait FormItem extends js.Object {
  /**
               * Gets the unique identifier of the form.
               * @returns The identifier, in Guid format.
               */
  def getId(): java.lang.String
  /**
               * Gets the label for the form.
               * @returns The label.
               */
  def getLabel(): java.lang.String
  /**
               * Navigates the user to this form.
               */
  def navigate(): scala.Unit
}

