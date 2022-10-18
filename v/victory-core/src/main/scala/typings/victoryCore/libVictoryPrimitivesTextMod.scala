package typings.victoryCore

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.victoryCore.anon.Desc
import typings.victoryCore.libVictoryUtilCommonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryPrimitivesTextMod {
  
  object Text {
    
    inline def apply(props: TextProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("victory-core/lib/victory-primitives/text", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives/text", "Text.propTypes")
    @js.native
    def propTypes: Desc = js.native
    inline def propTypes_=(x: Desc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait TextProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    @JSName("desc")
    var desc_TextProps: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object TextProps {
    
    inline def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    extension [Self <: TextProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
