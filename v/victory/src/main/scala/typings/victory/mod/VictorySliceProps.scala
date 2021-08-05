package typings.victory.mod

import typings.react.mod.ReactElement
import typings.victory.anon.Active
import typings.victory.anon.EndAngle
import typings.victory.victoryStrings.cornerRadius
import typings.victory.victoryStrings.padAngle
import typings.victory.victoryStrings.radius
import typings.victory.victoryStrings.sliceEndAngle
import typings.victory.victoryStrings.sliceStartAngle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictorySliceProps
  extends StObject
     with VictoryCommonProps {
  
  /**
    * the corner radius to apply to this slice.
    * When this prop is given as a function
    * it will be called with the rest of the props supplied to Slice.
    */
  var cornerRadius: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typings.victory.victoryStrings.cornerRadius]
  ] = js.undefined
  
  /**
    * the data point corresponding to this slice
    */
  var datum: js.UndefOr[js.Object] = js.undefined
  
  /**
    * the inner radius of the slice.
    * When this prop is given as a function
    * it will be called with datum and active.
    */
  var innerRadius: js.UndefOr[Double | (js.Function1[/* props */ Active, Double])] = js.undefined
  
  /**
    * the angular padding to add to the slice.
    * When this prop is given as a function it will be called with
    * the rest of the props supplied to Slice.
    */
  var padAngle: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typings.victory.victoryStrings.padAngle]
  ] = js.undefined
  
  /**
    * the rendered path element
    * @default pathComponent={<Path/>}
    */
  var pathComponent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * a function that calculates the path of a given slice.
    * When given, this prop will be called with the slice object
    */
  var pathFunction: js.UndefOr[js.Function1[/* props */ this.type, String]] = js.undefined
  
  /**
    * the outer radius of the slice.
    * When this prop is given as a function it will be called with
    * the rest of the props supplied to Slice.
    */
  var radius: js.UndefOr[SliceNumberOrCallback[VictorySliceProps, typings.victory.victoryStrings.radius]] = js.undefined
  
  /**
    * an object specifying the `startAngle`, `endAngle`, `padAngle`,
    * and `data` of the slice
    */
  var slice: EndAngle
  
  /**
    * the end angle the slice.
    * When this prop is given as a function it will be called
    * with the rest of the props supplied to Slice.
    */
  var sliceEndAngle: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typings.victory.victoryStrings.sliceEndAngle]
  ] = js.undefined
  
  /**
    * the start angle the slice.
    * When this prop is given as a function it will be called
    * with the rest of the props supplied to Slice
    */
  var sliceStartAngle: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typings.victory.victoryStrings.sliceStartAngle]
  ] = js.undefined
}
object VictorySliceProps {
  
  inline def apply(slice: EndAngle): VictorySliceProps = {
    val __obj = js.Dynamic.literal(slice = slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictorySliceProps]
  }
  
  extension [Self <: VictorySliceProps](x: Self) {
    
    inline def setCornerRadius(value: SliceNumberOrCallback[VictorySliceProps, cornerRadius]): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusFunction1(value: /* props */ Omit[VictorySliceProps, cornerRadius] => Double): Self = StObject.set(x, "cornerRadius", js.Any.fromFunction1(value))
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    inline def setInnerRadius(value: Double | (js.Function1[/* props */ Active, Double])): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusFunction1(value: /* props */ Active => Double): Self = StObject.set(x, "innerRadius", js.Any.fromFunction1(value))
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setPadAngle(value: SliceNumberOrCallback[VictorySliceProps, padAngle]): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    inline def setPadAngleFunction1(value: /* props */ Omit[VictorySliceProps, padAngle] => Double): Self = StObject.set(x, "padAngle", js.Any.fromFunction1(value))
    
    inline def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
    
    inline def setPathComponent(value: ReactElement): Self = StObject.set(x, "pathComponent", value.asInstanceOf[js.Any])
    
    inline def setPathComponentUndefined: Self = StObject.set(x, "pathComponent", js.undefined)
    
    inline def setPathFunction(value: VictorySliceProps => String): Self = StObject.set(x, "pathFunction", js.Any.fromFunction1(value))
    
    inline def setPathFunctionUndefined: Self = StObject.set(x, "pathFunction", js.undefined)
    
    inline def setRadius(value: SliceNumberOrCallback[VictorySliceProps, radius]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusFunction1(value: /* props */ Omit[VictorySliceProps, radius] => Double): Self = StObject.set(x, "radius", js.Any.fromFunction1(value))
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSlice(value: EndAngle): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    inline def setSliceEndAngle(value: SliceNumberOrCallback[VictorySliceProps, sliceEndAngle]): Self = StObject.set(x, "sliceEndAngle", value.asInstanceOf[js.Any])
    
    inline def setSliceEndAngleFunction1(value: /* props */ Omit[VictorySliceProps, sliceEndAngle] => Double): Self = StObject.set(x, "sliceEndAngle", js.Any.fromFunction1(value))
    
    inline def setSliceEndAngleUndefined: Self = StObject.set(x, "sliceEndAngle", js.undefined)
    
    inline def setSliceStartAngle(value: SliceNumberOrCallback[VictorySliceProps, sliceStartAngle]): Self = StObject.set(x, "sliceStartAngle", value.asInstanceOf[js.Any])
    
    inline def setSliceStartAngleFunction1(value: /* props */ Omit[VictorySliceProps, sliceStartAngle] => Double): Self = StObject.set(x, "sliceStartAngle", js.Any.fromFunction1(value))
    
    inline def setSliceStartAngleUndefined: Self = StObject.set(x, "sliceStartAngle", js.undefined)
  }
}
