package typings.vegaLite.anon

import typings.vegaLite.srcMarkMod.MarkConfig
import typings.vegaLite.titleMod.BaseTitleNoValueRefs
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonMark extends StObject {
  
  var nonMark: BaseTitleNoValueRefs[SignalRef] = js.native
  
  var subtitle: BaseTitleNoValueRefs[SignalRef] = js.native
  
  var subtitleMarkConfig: MarkConfig[SignalRef] = js.native
  
  var titleMarkConfig: MarkConfig[SignalRef] = js.native
}
object NonMark {
  
  @scala.inline
  def apply(
    nonMark: BaseTitleNoValueRefs[SignalRef],
    subtitle: BaseTitleNoValueRefs[SignalRef],
    subtitleMarkConfig: MarkConfig[SignalRef],
    titleMarkConfig: MarkConfig[SignalRef]
  ): NonMark = {
    val __obj = js.Dynamic.literal(nonMark = nonMark.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], subtitleMarkConfig = subtitleMarkConfig.asInstanceOf[js.Any], titleMarkConfig = titleMarkConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonMark]
  }
  
  @scala.inline
  implicit class NonMarkMutableBuilder[Self <: NonMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonMark(value: BaseTitleNoValueRefs[SignalRef]): Self = StObject.set(x, "nonMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: BaseTitleNoValueRefs[SignalRef]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleMarkConfig(value: MarkConfig[SignalRef]): Self = StObject.set(x, "subtitleMarkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleMarkConfig(value: MarkConfig[SignalRef]): Self = StObject.set(x, "titleMarkConfig", value.asInstanceOf[js.Any])
  }
}
