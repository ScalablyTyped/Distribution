package typings.vegaDashTypings

import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.vegaDashTypings.Anon_Fill
import typings.vegaDashTypings.typesSpecSignalMod.SignalValue
import typings.vegaDashTypings.vegaDashTypingsStrings.`axis-label`
import typings.vegaDashTypings.vegaDashTypingsStrings.`legend-label`
import typings.vegaDashTypings.vegaDashTypingsStrings.`legend-symbol`
import typings.vegaDashTypings.vegaDashTypingsStrings.arc
import typings.vegaDashTypings.vegaDashTypingsStrings.area
import typings.vegaDashTypings.vegaDashTypingsStrings.group
import typings.vegaDashTypings.vegaDashTypingsStrings.image
import typings.vegaDashTypings.vegaDashTypingsStrings.line
import typings.vegaDashTypings.vegaDashTypingsStrings.path
import typings.vegaDashTypings.vegaDashTypingsStrings.rect
import typings.vegaDashTypings.vegaDashTypingsStrings.symbol
import typings.vegaDashTypings.vegaDashTypingsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesRuntimeMod {
  type DataListenerHandler = js.Function2[/* name */ String, /* value */ js.Any, Unit]
  type EventListenerHandler = js.Function2[/* event */ ScenegraphEvent, /* item */ js.UndefOr[Item[js.Any]], Unit]
  type ResizeHandler = js.Function2[/* width */ Double, /* height */ Double, Unit]
  type Runtime = js.Any
  type RuntimeMark = DefineMark[
    group | rect | symbol | path | arc | area | line | image | text, 
    Anon_Fill | js.Object, 
    `legend-symbol` | `axis-label` | `legend-label` | scala.Nothing
  ]
  type ScenegraphEvent = MouseEvent | TouchEvent | KeyboardEvent
  type SignalListenerHandler = js.Function2[/* name */ String, /* value */ SignalValue, Unit]
  type TooltipHandler = js.Function4[
    /* handler */ js.Any, 
    /* event */ MouseEvent, 
    /* item */ Item[js.Any], 
    /* value */ js.Any, 
    Unit
  ]
}
