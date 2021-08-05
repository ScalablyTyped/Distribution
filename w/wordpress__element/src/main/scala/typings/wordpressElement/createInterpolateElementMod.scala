package typings.wordpressElement

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createInterpolateElementMod {
  
  @JSImport("@wordpress/element/build-types/create-interpolate-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(interpolatedString: String, conversionMap: js.Any): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(interpolatedString.asInstanceOf[js.Any], conversionMap.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  trait Frame extends StObject {
    
    /**
      * Children.
      */
    var children: js.Array[ReactElement]
    
    /**
      * A parent element which may still have
      */
    var element: ReactElement
    
    /**
      * Offset at which last closing element
      *  finished, used for finding text between
      *  elements.
      */
    var leadingTextStart: js.UndefOr[Double] = js.undefined
    
    /**
      * Running offset at which parsing should
      *        continue.
      */
    var prevOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Length of string marking start of parent
      * element.
      */
    var tokenLength: Double
    
    /**
      * Offset at which parent element first
      * appears.
      */
    var tokenStart: Double
  }
  object Frame {
    
    inline def apply(children: js.Array[ReactElement], element: ReactElement, tokenLength: Double, tokenStart: Double): Frame = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], tokenLength = tokenLength.asInstanceOf[js.Any], tokenStart = tokenStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frame]
    }
    
    extension [Self <: Frame](x: Self) {
      
      inline def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setElement(value: ReactElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setLeadingTextStart(value: Double): Self = StObject.set(x, "leadingTextStart", value.asInstanceOf[js.Any])
      
      inline def setLeadingTextStartUndefined: Self = StObject.set(x, "leadingTextStart", js.undefined)
      
      inline def setPrevOffset(value: Double): Self = StObject.set(x, "prevOffset", value.asInstanceOf[js.Any])
      
      inline def setPrevOffsetUndefined: Self = StObject.set(x, "prevOffset", js.undefined)
      
      inline def setTokenLength(value: Double): Self = StObject.set(x, "tokenLength", value.asInstanceOf[js.Any])
      
      inline def setTokenStart(value: Double): Self = StObject.set(x, "tokenStart", value.asInstanceOf[js.Any])
    }
  }
  
  type WPElement = ReactElement
}
