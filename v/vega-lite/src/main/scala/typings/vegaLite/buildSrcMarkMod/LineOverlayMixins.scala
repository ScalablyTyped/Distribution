package typings.vegaLite.buildSrcMarkMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOverlayMixins[ES /* <: ExprRef | SignalRef */] extends StObject {
  
  /**
    * A flag for overlaying line on top of area marks, or an object defining the properties of the overlayed lines.
    *
    * - If this value is an empty object (`{}`) or `true`, lines with default properties will be used.
    *
    * - If this value is `false`, no lines would be automatically added to area marks.
    *
    * __Default value:__ `false`.
    */
  var line: js.UndefOr[Boolean | OverlayMarkDef[ES]] = js.undefined
}
object LineOverlayMixins {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): LineOverlayMixins[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOverlayMixins[ES]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineOverlayMixins[?], ES /* <: ExprRef | SignalRef */] (val x: Self & LineOverlayMixins[ES]) extends AnyVal {
    
    inline def setLine(value: Boolean | OverlayMarkDef[ES]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
