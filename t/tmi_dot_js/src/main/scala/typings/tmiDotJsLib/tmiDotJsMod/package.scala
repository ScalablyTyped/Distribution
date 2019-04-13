package typings
package tmiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tmiDotJsMod {
  type Client = (tmiDotJsLib.strictDashEventDashEmitterDashTypesMod.StrictEventEmitter[
    ClientBase, 
    Events, 
    Events, 
    stdLib.Exclude[
      tmiDotJsLib.strictDashEventDashEmitterDashTypesMod.OverriddenKeys, 
      java.lang.String
    ], 
    stdLib.Exclude[
      tmiDotJsLib.strictDashEventDashEmitterDashTypesMod.OverriddenKeys, 
      stdLib.Exclude[
        tmiDotJsLib.strictDashEventDashEmitterDashTypesMod.OverriddenKeys, 
        java.lang.String
      ]
    ]
  ]) with Actions
  type EmoteObj = org.scalablytyped.runtime.StringDictionary[js.Array[tmiDotJsLib.Anon_Code]]
}
