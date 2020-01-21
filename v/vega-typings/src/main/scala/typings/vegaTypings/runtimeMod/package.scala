package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtimeMod {
  type DataListenerHandler = js.Function2[/* name */ java.lang.String, /* value */ js.Any, scala.Unit]
  type EventListenerHandler = js.Function2[
    /* event */ typings.vegaTypings.runtimeMod.ScenegraphEvent, 
    /* item */ js.UndefOr[typings.vegaTypings.runtimeMod.Item[js.Any]], 
    scala.Unit
  ]
  type ResizeHandler = js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit]
  type Runtime = js.Any
  type RuntimeMark = typings.vegaTypings.runtimeMod.DefineMark[
    typings.vegaTypings.vegaTypingsStrings.group | typings.vegaTypings.vegaTypingsStrings.rect | typings.vegaTypings.vegaTypingsStrings.symbol | typings.vegaTypings.vegaTypingsStrings.path | typings.vegaTypings.vegaTypingsStrings.arc | typings.vegaTypings.vegaTypingsStrings.area | typings.vegaTypings.vegaTypingsStrings.line | typings.vegaTypings.vegaTypingsStrings.image | typings.vegaTypings.vegaTypingsStrings.text, 
    typings.vegaTypings.AnonFill | js.Object, 
    typings.vegaTypings.vegaTypingsStrings.`legend-symbol` | typings.vegaTypings.vegaTypingsStrings.`axis-label` | typings.vegaTypings.vegaTypingsStrings.`legend-label` | scala.Nothing
  ]
  type ScenegraphEvent = typings.std.MouseEvent | typings.std.TouchEvent | typings.std.KeyboardEvent
  type SignalListenerHandler = js.Function2[
    /* name */ java.lang.String, 
    /* value */ typings.vegaTypings.signalMod.SignalValue, 
    scala.Unit
  ]
  type TooltipHandler = js.Function4[
    /* handler */ js.Any, 
    /* event */ typings.std.MouseEvent, 
    /* item */ typings.vegaTypings.runtimeMod.Item[js.Any], 
    /* value */ js.Any, 
    scala.Unit
  ]
}
