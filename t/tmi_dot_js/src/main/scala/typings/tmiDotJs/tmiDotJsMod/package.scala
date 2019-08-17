package typings.tmiDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tmiDotJsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Exclude
  import typings.tmiDotJs.Anon_Code
  import typings.tmiDotJs.strictDashEventDashEmitterDashTypesMod.OverriddenKeys
  import typings.tmiDotJs.strictDashEventDashEmitterDashTypesMod.StrictEventEmitter

  type Client = (StrictEventEmitter[
    ClientBase, 
    Events, 
    Events, 
    Exclude[OverriddenKeys, String], 
    Exclude[OverriddenKeys, Exclude[OverriddenKeys, String]]
  ]) with Actions
  type EmoteObj = StringDictionary[js.Array[Anon_Code]]
}
