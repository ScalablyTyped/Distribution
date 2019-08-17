package typings.strophejsDashPluginDashRoster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object strophejsDashPluginDashRosterMod {
  import typings.std.Element

  type IqCallback = js.Function1[/* stanza */ Element, js.Any]
  type IqID = String
  type PresenceRequestCallback = js.Function1[/* from */ String, js.Any]
  type RosterUpdateCallback = js.Function3[
    /* items */ js.Array[RosterItem], 
    /* item */ RosterItem, 
    /* previousItem */ RosterItem, 
    js.Any
  ]
}
