package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object streamMod {
  
  type EventSource = (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/stream.EventStream['source'] */ js.Any) with js.Object
  
  type EventStream = typings.vegaTypings.streamMod.StreamParameters with (typings.vegaTypings.anon.Source | typings.vegaTypings.anon.Type)
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.streamMod.EventStream
    - typings.vegaTypings.streamMod.DerivedStream
    - typings.vegaTypings.streamMod.MergedStream
  */
  type Stream = typings.vegaTypings.streamMod._Stream | typings.vegaTypings.streamMod.EventStream
  
  type WindowEventType = typings.vegaTypings.streamMod.EventType | java.lang.String
}
