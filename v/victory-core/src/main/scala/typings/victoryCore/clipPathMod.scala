package typings.victoryCore

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.victoryCore.anon.ClipId
import typings.victoryCore.commonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipPathMod {
  
  object ClipPath {
    
    inline def apply(props: ClipPathProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("victory-core/lib/victory-primitives/clip-path", "ClipPath")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives/clip-path", "ClipPath.propTypes")
    @js.native
    def propTypes: ClipId = js.native
    inline def propTypes_=(x: ClipId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait ClipPathProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
    
    var clipId: js.UndefOr[Double | String] = js.undefined
  }
  object ClipPathProps {
    
    inline def apply(): ClipPathProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClipPathProps]
    }
    
    extension [Self <: ClipPathProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClipId(value: Double | String): Self = StObject.set(x, "clipId", value.asInstanceOf[js.Any])
      
      inline def setClipIdUndefined: Self = StObject.set(x, "clipId", js.undefined)
    }
  }
}
