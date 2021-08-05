package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlighterMod {
  
  @JSImport("wix-style-react/dist/es/src/Highlighter", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[HighlighterProps, js.Object, js.Any]
  
  type Highlighter = PureComponent[HighlighterProps, js.Object, js.Any]
  
  trait HighlighterProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var `match`: js.UndefOr[String] = js.undefined
  }
  object HighlighterProps {
    
    inline def apply(): HighlighterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlighterProps]
    }
    
    extension [Self <: HighlighterProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    }
  }
}
