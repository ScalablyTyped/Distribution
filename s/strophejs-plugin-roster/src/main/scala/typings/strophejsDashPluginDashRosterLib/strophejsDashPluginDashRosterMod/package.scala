package typings
package strophejsDashPluginDashRosterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object strophejsDashPluginDashRosterMod {
  type IqCallback = js.Function1[/* stanza */ stdLib.Element, js.Any]
  type IqID = java.lang.String
  type PresenceRequestCallback = js.Function1[/* from */ java.lang.String, js.Any]
  type RosterUpdateCallback = js.Function3[
    /* items */ js.Array[RosterItem], 
    /* item */ RosterItem, 
    /* previousItem */ RosterItem, 
    js.Any
  ]
}
