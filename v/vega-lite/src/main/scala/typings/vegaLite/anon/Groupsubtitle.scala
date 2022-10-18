package typings.vegaLite.anon

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcMarkMod.MarkConfig
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groupsubtitle[ES /* <: ExprRef | SignalRef */] extends StObject {
  
  /**
    * Default style for chart subtitles
    */
  var `group-subtitle`: js.UndefOr[MarkConfig[ES]] = js.undefined
  
  /**
    * Default style for chart titles
    */
  var `group-title`: js.UndefOr[MarkConfig[ES]] = js.undefined
  
  /**
    * Default style for axis, legend, and header labels.
    */
  var `guide-label`: js.UndefOr[MarkConfig[ES]] = js.undefined
  
  /**
    * Default style for axis, legend, and header titles.
    */
  var `guide-title`: js.UndefOr[MarkConfig[ES]] = js.undefined
}
object Groupsubtitle {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): Groupsubtitle[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Groupsubtitle[ES]]
  }
  
  extension [Self <: Groupsubtitle[?], ES /* <: ExprRef | SignalRef */](x: Self & Groupsubtitle[ES]) {
    
    inline def `setGroup-subtitle`(value: MarkConfig[ES]): Self = StObject.set(x, "group-subtitle", value.asInstanceOf[js.Any])
    
    inline def `setGroup-subtitleUndefined`: Self = StObject.set(x, "group-subtitle", js.undefined)
    
    inline def `setGroup-title`(value: MarkConfig[ES]): Self = StObject.set(x, "group-title", value.asInstanceOf[js.Any])
    
    inline def `setGroup-titleUndefined`: Self = StObject.set(x, "group-title", js.undefined)
    
    inline def `setGuide-label`(value: MarkConfig[ES]): Self = StObject.set(x, "guide-label", value.asInstanceOf[js.Any])
    
    inline def `setGuide-labelUndefined`: Self = StObject.set(x, "guide-label", js.undefined)
    
    inline def `setGuide-title`(value: MarkConfig[ES]): Self = StObject.set(x, "guide-title", value.asInstanceOf[js.Any])
    
    inline def `setGuide-titleUndefined`: Self = StObject.set(x, "guide-title", js.undefined)
  }
}
