package typings.vegaLite.buildSrcSpecBaseMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameMixins[ES /* <: ExprRef | SignalRef */]
  extends StObject
     with LayoutSizeMixins {
  
  /**
    * An object defining the view background's fill and stroke.
    *
    * __Default value:__ none (transparent)
    */
  var view: js.UndefOr[ViewBackground[ES]] = js.undefined
}
object FrameMixins {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): FrameMixins[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameMixins[ES]]
  }
  
  extension [Self <: FrameMixins[?], ES /* <: ExprRef | SignalRef */](x: Self & FrameMixins[ES]) {
    
    inline def setView(value: ViewBackground[ES]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
