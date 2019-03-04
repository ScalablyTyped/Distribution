package typings
package atUifabricStylingLib.libInterfacesIEffectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEffects extends js.Object {
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * Used for: search result dropdowns, hover cards, tooltips, help bubbles
    */
  var elevation16: java.lang.String
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * Used for: cards, grid items
    */
  var elevation4: java.lang.String
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * Used for: Panels, Dialogs
    */
  var elevation64: java.lang.String
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * Used for: menus, command surfaces
    */
  var elevation8: java.lang.String
  /**
    * How much corners should be rounded, for use with border-radius.
    */
  var roundedCorner2: java.lang.String
}

object IEffects {
  @scala.inline
  def apply(
    elevation16: java.lang.String,
    elevation4: java.lang.String,
    elevation64: java.lang.String,
    elevation8: java.lang.String,
    roundedCorner2: java.lang.String
  ): IEffects = {
    val __obj = js.Dynamic.literal(elevation16 = elevation16, elevation4 = elevation4, elevation64 = elevation64, elevation8 = elevation8, roundedCorner2 = roundedCorner2)
  
    __obj.asInstanceOf[IEffects]
  }
}

