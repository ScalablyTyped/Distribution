package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFacesRatingBarMod {
  
  @JSImport("wix-style-react/dist/types/FacesRatingBar", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[FacesRatingBarProps, js.Object, Any]
  
  type FacesRatingBar = PureComponent[FacesRatingBarProps, js.Object, Any]
  
  trait FacesRatingBarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var descriptionValues: js.UndefOr[
        js.Tuple5[String, String, js.UndefOr[String], js.UndefOr[String], js.UndefOr[String]]
      ] = js.undefined
    
    var maxValue: js.UndefOr[typings.wixStyleReact.distTypesFacesRatingBarMod.maxValue] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var value: facesRatingBarValues
  }
  object FacesRatingBarProps {
    
    inline def apply(value: facesRatingBarValues): FacesRatingBarProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacesRatingBarProps]
    }
    
    extension [Self <: FacesRatingBarProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDescriptionValues(value: js.Tuple5[String, String, js.UndefOr[String], js.UndefOr[String], js.UndefOr[String]]): Self = StObject.set(x, "descriptionValues", value.asInstanceOf[js.Any])
      
      inline def setDescriptionValuesUndefined: Self = StObject.set(x, "descriptionValues", js.undefined)
      
      inline def setMaxValue(value: maxValue): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setOnChange(value: /* rating */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setValue(value: facesRatingBarValues): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactInts.`0`
    - typings.wixStyleReact.wixStyleReactInts.`1`
    - typings.wixStyleReact.wixStyleReactInts.`2`
    - typings.wixStyleReact.wixStyleReactInts.`3`
    - typings.wixStyleReact.wixStyleReactInts.`4`
    - typings.wixStyleReact.wixStyleReactInts.`5`
  */
  trait facesRatingBarValues extends StObject
  object facesRatingBarValues {
    
    inline def `0`: typings.wixStyleReact.wixStyleReactInts.`0` = 0.asInstanceOf[typings.wixStyleReact.wixStyleReactInts.`0`]
    
    inline def `1`: typings.wixStyleReact.wixStyleReactInts.`1` = 1.asInstanceOf[typings.wixStyleReact.wixStyleReactInts.`1`]
    
    inline def `2`: typings.wixStyleReact.wixStyleReactInts.`2` = 2.asInstanceOf[typings.wixStyleReact.wixStyleReactInts.`2`]
    
    inline def `3`: typings.wixStyleReact.wixStyleReactInts.`3` = 3.asInstanceOf[typings.wixStyleReact.wixStyleReactInts.`3`]
    
    inline def `4`: typings.wixStyleReact.wixStyleReactInts.`4` = 4.asInstanceOf[typings.wixStyleReact.wixStyleReactInts.`4`]
    
    inline def `5`: typings.wixStyleReact.wixStyleReactInts.`5` = 5.asInstanceOf[typings.wixStyleReact.wixStyleReactInts.`5`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactInts.`2`
    - typings.wixStyleReact.wixStyleReactInts.`3`
    - typings.wixStyleReact.wixStyleReactInts.`4`
    - typings.wixStyleReact.wixStyleReactInts.`5`
  */
  trait maxValue extends StObject
  object maxValue {
    
    inline def `2`: typings.wixStyleReact.wixStyleReactInts.`2` = 2.asInstanceOf[typings.wixStyleReact.wixStyleReactInts.`2`]
    
    inline def `3`: typings.wixStyleReact.wixStyleReactInts.`3` = 3.asInstanceOf[typings.wixStyleReact.wixStyleReactInts.`3`]
    
    inline def `4`: typings.wixStyleReact.wixStyleReactInts.`4` = 4.asInstanceOf[typings.wixStyleReact.wixStyleReactInts.`4`]
    
    inline def `5`: typings.wixStyleReact.wixStyleReactInts.`5` = 5.asInstanceOf[typings.wixStyleReact.wixStyleReactInts.`5`]
  }
}
