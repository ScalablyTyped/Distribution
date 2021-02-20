package typings.vegaLite.srcMarkMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var line: js.UndefOr[Boolean | OverlayMarkDef[ES]] = js.native
}
object LineOverlayMixins {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): LineOverlayMixins[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOverlayMixins[ES]]
  }
  
  @scala.inline
  implicit class LineOverlayMixinsMutableBuilder[Self <: LineOverlayMixins[_], ES /* <: ExprRef | SignalRef */] (val x: Self with LineOverlayMixins[ES]) extends AnyVal {
    
    @scala.inline
    def setLine(value: Boolean | OverlayMarkDef[ES]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
