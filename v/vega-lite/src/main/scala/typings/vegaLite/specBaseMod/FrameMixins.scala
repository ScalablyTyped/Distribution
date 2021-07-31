package typings.vegaLite.specBaseMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
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
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): FrameMixins[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameMixins[ES]]
  }
  
  @scala.inline
  implicit class FrameMixinsMutableBuilder[Self <: FrameMixins[?], ES /* <: ExprRef | SignalRef */] (val x: Self & FrameMixins[ES]) extends AnyVal {
    
    @scala.inline
    def setView(value: ViewBackground[ES]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
