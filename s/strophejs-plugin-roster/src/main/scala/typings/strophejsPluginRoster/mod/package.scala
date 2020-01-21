package typings.strophejsPluginRoster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IqCallback = js.Function1[/* stanza */ typings.std.Element, js.Any]
  type IqID = java.lang.String
  type PresenceRequestCallback = js.Function1[/* from */ java.lang.String, js.Any]
  type RosterUpdateCallback = js.Function3[
    /* items */ js.Array[typings.strophejsPluginRoster.mod.RosterItem], 
    /* item */ typings.strophejsPluginRoster.mod.RosterItem, 
    /* previousItem */ typings.strophejsPluginRoster.mod.RosterItem, 
    js.Any
  ]
}
