package typings.vegaLite.anon

import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcMarkMod.MarkConfig
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groupsubtitle[ES /* <: ExprRef | SignalRef */] extends StObject {
  
  /**
    * Default style for chart subtitles
    */
  var `group-subtitle`: js.UndefOr[MarkConfig[ES]] = js.native
  
  /**
    * Default style for chart titles
    */
  var `group-title`: js.UndefOr[MarkConfig[ES]] = js.native
  
  /**
    * Default style for axis, legend, and header labels.
    */
  var `guide-label`: js.UndefOr[MarkConfig[ES]] = js.native
  
  /**
    * Default style for axis, legend, and header titles.
    */
  var `guide-title`: js.UndefOr[MarkConfig[ES]] = js.native
}
object Groupsubtitle {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): Groupsubtitle[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Groupsubtitle[ES]]
  }
  
  @scala.inline
  implicit class GroupsubtitleMutableBuilder[Self <: Groupsubtitle[_], ES /* <: ExprRef | SignalRef */] (val x: Self with Groupsubtitle[ES]) extends AnyVal {
    
    @scala.inline
    def `setGroup-subtitle`(value: MarkConfig[ES]): Self = StObject.set(x, "group-subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGroup-subtitleUndefined`: Self = StObject.set(x, "group-subtitle", js.undefined)
    
    @scala.inline
    def `setGroup-title`(value: MarkConfig[ES]): Self = StObject.set(x, "group-title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGroup-titleUndefined`: Self = StObject.set(x, "group-title", js.undefined)
    
    @scala.inline
    def `setGuide-label`(value: MarkConfig[ES]): Self = StObject.set(x, "guide-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGuide-labelUndefined`: Self = StObject.set(x, "guide-label", js.undefined)
    
    @scala.inline
    def `setGuide-title`(value: MarkConfig[ES]): Self = StObject.set(x, "guide-title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGuide-titleUndefined`: Self = StObject.set(x, "guide-title", js.undefined)
  }
}
