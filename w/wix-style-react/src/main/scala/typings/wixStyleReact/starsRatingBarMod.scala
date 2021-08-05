package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object starsRatingBarMod {
  
  @JSImport("wix-style-react/dist/es/src/StarsRatingBar", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[StarsRatingBarProps, js.Object, js.Any]
  
  type StarsRatingBar = PureComponent[StarsRatingBarProps, js.Object, js.Any]
  
  trait StarsRatingBarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var descriptionValues: js.UndefOr[js.Tuple5[String, String, String, String, String]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* rate */ Double, Unit]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[starRatingBarSize] = js.undefined
    
    var value: starRatingBarValue
  }
  object StarsRatingBarProps {
    
    inline def apply(value: starRatingBarValue): StarsRatingBarProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StarsRatingBarProps]
    }
    
    extension [Self <: StarsRatingBarProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDescriptionValues(value: js.Tuple5[String, String, String, String, String]): Self = StObject.set(x, "descriptionValues", value.asInstanceOf[js.Any])
      
      inline def setDescriptionValuesUndefined: Self = StObject.set(x, "descriptionValues", js.undefined)
      
      inline def setOnChange(value: /* rate */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSize(value: starRatingBarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: starRatingBarValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tiny
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait starRatingBarSize extends StObject
  object starRatingBarSize {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactNumbers.`0`
    - typings.wixStyleReact.wixStyleReactNumbers.`1`
    - typings.wixStyleReact.wixStyleReactNumbers.`2`
    - typings.wixStyleReact.wixStyleReactNumbers.`3`
    - typings.wixStyleReact.wixStyleReactNumbers.`4`
    - typings.wixStyleReact.wixStyleReactNumbers.`5`
  */
  trait starRatingBarValue extends StObject
  object starRatingBarValue {
    
    inline def `0`: typings.wixStyleReact.wixStyleReactNumbers.`0` = 0.asInstanceOf[typings.wixStyleReact.wixStyleReactNumbers.`0`]
    
    inline def `1`: typings.wixStyleReact.wixStyleReactNumbers.`1` = 1.asInstanceOf[typings.wixStyleReact.wixStyleReactNumbers.`1`]
    
    inline def `2`: typings.wixStyleReact.wixStyleReactNumbers.`2` = 2.asInstanceOf[typings.wixStyleReact.wixStyleReactNumbers.`2`]
    
    inline def `3`: typings.wixStyleReact.wixStyleReactNumbers.`3` = 3.asInstanceOf[typings.wixStyleReact.wixStyleReactNumbers.`3`]
    
    inline def `4`: typings.wixStyleReact.wixStyleReactNumbers.`4` = 4.asInstanceOf[typings.wixStyleReact.wixStyleReactNumbers.`4`]
    
    inline def `5`: typings.wixStyleReact.wixStyleReactNumbers.`5` = 5.asInstanceOf[typings.wixStyleReact.wixStyleReactNumbers.`5`]
  }
}
