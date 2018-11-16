package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_EventName
  extends /* eventName */ ScalablyTyped.runtime.StringDictionary[
      js.Function2[
        /* options */ js.UndefOr[Anon_Filter], 
        /* cb */ js.UndefOr[web3Lib.typesMod.Callback[web3Lib.typesMod.EventLog]], 
        web3Lib.typesMod.EventEmitter
      ]
    ] {
  var allEvents: js.Function2[
    /* options */ js.UndefOr[Anon_Filter], 
    /* cb */ js.UndefOr[web3Lib.typesMod.Callback[web3Lib.typesMod.EventLog]], 
    web3Lib.typesMod.EventEmitter
  ]
}

