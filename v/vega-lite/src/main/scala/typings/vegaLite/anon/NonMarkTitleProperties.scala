package typings.vegaLite.anon

import typings.vegaLite.buildSrcMarkMod.MarkConfig
import typings.vegaLite.buildSrcTitleMod.BaseTitleNoValueRefs
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonMarkTitleProperties extends StObject {
  
  /** These are non-mark title config that need to be hardcoded in the title directive. */
  var nonMarkTitleProperties: BaseTitleNoValueRefs[SignalRef]
  
  var subtitle: BaseTitleNoValueRefs[SignalRef]
  
  var subtitleMarkConfig: MarkConfig[SignalRef]
  
  var titleMarkConfig: MarkConfig[SignalRef]
}
object NonMarkTitleProperties {
  
  inline def apply(
    nonMarkTitleProperties: BaseTitleNoValueRefs[SignalRef],
    subtitle: BaseTitleNoValueRefs[SignalRef],
    subtitleMarkConfig: MarkConfig[SignalRef],
    titleMarkConfig: MarkConfig[SignalRef]
  ): NonMarkTitleProperties = {
    val __obj = js.Dynamic.literal(nonMarkTitleProperties = nonMarkTitleProperties.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], subtitleMarkConfig = subtitleMarkConfig.asInstanceOf[js.Any], titleMarkConfig = titleMarkConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonMarkTitleProperties]
  }
  
  extension [Self <: NonMarkTitleProperties](x: Self) {
    
    inline def setNonMarkTitleProperties(value: BaseTitleNoValueRefs[SignalRef]): Self = StObject.set(x, "nonMarkTitleProperties", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: BaseTitleNoValueRefs[SignalRef]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleMarkConfig(value: MarkConfig[SignalRef]): Self = StObject.set(x, "subtitleMarkConfig", value.asInstanceOf[js.Any])
    
    inline def setTitleMarkConfig(value: MarkConfig[SignalRef]): Self = StObject.set(x, "titleMarkConfig", value.asInstanceOf[js.Any])
  }
}
