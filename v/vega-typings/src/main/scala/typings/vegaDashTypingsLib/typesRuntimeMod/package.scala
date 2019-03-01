package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesRuntimeMod {
  type DataListenerHandler = js.Function2[/* name */ java.lang.String, /* value */ js.Any, scala.Unit]
  type EventListenerHandler = js.Function2[/* event */ ScenegraphEvent, /* item */ js.UndefOr[Item[js.Any]], scala.Unit]
  type ResizeHandler = js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit]
  type Runtime = js.Any
  type RuntimeMark = (DefineMark[vegaDashTypingsLib.vegaDashTypingsLibStrings.group, js.Object, scala.Nothing]) | (DefineMark[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.rect, 
    vegaDashTypingsLib.Anon_Fill, 
    scala.Nothing
  ]) | (DefineMark[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.symbol, 
    js.Object, 
    vegaDashTypingsLib.vegaDashTypingsLibStrings.`legend-symbol`
  ]) | (DefineMark[vegaDashTypingsLib.vegaDashTypingsLibStrings.path, js.Object, scala.Nothing]) | (DefineMark[vegaDashTypingsLib.vegaDashTypingsLibStrings.arc, js.Object, scala.Nothing]) | (DefineMark[vegaDashTypingsLib.vegaDashTypingsLibStrings.area, js.Object, scala.Nothing]) | (DefineMark[vegaDashTypingsLib.vegaDashTypingsLibStrings.line, js.Object, scala.Nothing]) | (DefineMark[vegaDashTypingsLib.vegaDashTypingsLibStrings.image, js.Object, scala.Nothing]) | (DefineMark[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.text, 
    js.Object, 
    vegaDashTypingsLib.vegaDashTypingsLibStrings.`axis-label` | vegaDashTypingsLib.vegaDashTypingsLibStrings.`legend-label`
  ])
  type ScenegraphEvent = stdLib.MouseEvent | stdLib.TouchEvent | stdLib.KeyboardEvent
  type SignalListenerHandler = js.Function2[
    /* name */ java.lang.String, 
    /* value */ vegaDashTypingsLib.typesSpecSignalMod.SignalValue, 
    scala.Unit
  ]
  type TooltipHandler = js.Function4[
    /* handler */ js.Any, 
    /* event */ stdLib.MouseEvent, 
    /* item */ Item[js.Any], 
    /* value */ js.Any, 
    scala.Unit
  ]
}
