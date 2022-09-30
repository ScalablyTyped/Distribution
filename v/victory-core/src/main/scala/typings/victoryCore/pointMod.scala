package typings.victoryCore

import typings.react.mod.ReactElement
import typings.victoryCore.anon.Desc
import typings.victoryCore.anon.PathComponent
import typings.victoryCore.commonPropsMod.VictoryCommonPrimitiveProps
import typings.victoryCore.typesMod.ScatterSymbolType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointMod {
  
  object Point {
    
    inline def apply(props: PointProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("victory-core/lib/victory-primitives/point", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives/point", "Point.defaultProps")
    @js.native
    def defaultProps: PathComponent = js.native
    inline def defaultProps_=(x: PathComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-primitives/point", "Point.propTypes")
    @js.native
    def propTypes: Desc = js.native
    inline def propTypes_=(x: Desc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait PointProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    var datum: js.UndefOr[Any] = js.undefined
    
    var getPath: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* size */ Double, String]] = js.undefined
    
    var pathComponent: js.UndefOr[ReactElement] = js.undefined
    
    var size: js.UndefOr[Double | js.Function] = js.undefined
    
    var symbol: js.UndefOr[ScatterSymbolType | js.Function] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PointProps {
    
    inline def apply(): PointProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointProps]
    }
    
    extension [Self <: PointProps](x: Self) {
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setGetPath(value: (/* x */ Double, /* y */ Double, /* size */ Double) => String): Self = StObject.set(x, "getPath", js.Any.fromFunction3(value))
      
      inline def setGetPathUndefined: Self = StObject.set(x, "getPath", js.undefined)
      
      inline def setPathComponent(value: ReactElement): Self = StObject.set(x, "pathComponent", value.asInstanceOf[js.Any])
      
      inline def setPathComponentUndefined: Self = StObject.set(x, "pathComponent", js.undefined)
      
      inline def setSize(value: Double | js.Function): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSymbol(value: ScatterSymbolType | js.Function): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
