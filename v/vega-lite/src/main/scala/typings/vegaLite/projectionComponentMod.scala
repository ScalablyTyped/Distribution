package typings.vegaLite

import typings.vegaLite.splitMod.Split
import typings.vegaTypings.projectionMod.Projection
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionComponentMod {
  
  @JSImport("vega-lite/build/src/compile/projection/component", "ProjectionComponent")
  @js.native
  class ProjectionComponent protected () extends Split[Projection] {
    def this(
      name: String,
      specifiedProjection: typings.vegaLite.projectionMod.Projection,
      size: js.Array[SignalRef],
      data: js.Array[String | SignalRef]
    ) = this()
    
    var data: js.Array[String | SignalRef] = js.native
    
    /**
      * Whether the projection parameters should fit provided data.
      */
    def isFit: Boolean = js.native
    
    var merged: Boolean = js.native
    
    var size: js.Array[SignalRef] = js.native
    
    var specifiedProjection: typings.vegaLite.projectionMod.Projection = js.native
  }
}
