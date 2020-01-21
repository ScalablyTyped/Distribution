package typings.tmiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Client_ = (typings.tmiJs.strictEventEmitterTypesMod.StrictEventEmitter[
    typings.tmiJs.mod.ClientBase, 
    typings.tmiJs.mod.Events, 
    typings.tmiJs.mod.Events, 
    typings.std.Exclude[typings.tmiJs.strictEventEmitterTypesMod.OverriddenKeys, java.lang.String], 
    typings.std.Exclude[
      typings.tmiJs.strictEventEmitterTypesMod.OverriddenKeys, 
      typings.std.Exclude[typings.tmiJs.strictEventEmitterTypesMod.OverriddenKeys, java.lang.String]
    ]
  ]) with typings.tmiJs.mod.Actions
  type EmoteObj = org.scalablytyped.runtime.StringDictionary[js.Array[typings.tmiJs.AnonCode]]
}
