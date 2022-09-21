package typings.wordpressElement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createInterpolateElementMod {
  
  @JSImport("@wordpress/element/build-types/create-interpolate-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This function creates an interpolated element from a passed in string with
    * specific tags matching how the string should be converted to an element via
    * the conversion map value.
    *
    * @example
    * For example, for the given string:
    *
    * "This is a <span>string</span> with <a>a link</a> and a self-closing
    * <CustomComponentB/> tag"
    *
    * You would have something like this as the conversionMap value:
    *
    * ```js
    * {
    *     span: <span />,
    *     a: <a href={ 'https://github.com' } />,
    *     CustomComponentB: <CustomComponent />,
    * }
    * ```
    *
    * @param {string} interpolatedString The interpolation string to be parsed.
    * @param {Object} conversionMap      The map used to convert the string to
    *                                    a react element.
    * @throws {TypeError}
    * @return {WPElement}  A wp element.
    */
  inline def default(interpolatedString: String, conversionMap: Any): WPElement = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(interpolatedString.asInstanceOf[js.Any], conversionMap.asInstanceOf[js.Any])).asInstanceOf[WPElement]
  
  trait Frame extends StObject {
    
    /**
      * Children.
      */
    var children: js.Array[WPElement]
    
    /**
      * A parent element which may still have
      */
    var element: WPElement
    
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
    
    inline def apply(children: js.Array[WPElement], element: WPElement, tokenLength: Double, tokenStart: Double): Frame = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], tokenLength = tokenLength.asInstanceOf[js.Any], tokenStart = tokenStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frame]
    }
    
    extension [Self <: Frame](x: Self) {
      
      inline def setChildren(value: js.Array[WPElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: WPElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setElement(value: WPElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setLeadingTextStart(value: Double): Self = StObject.set(x, "leadingTextStart", value.asInstanceOf[js.Any])
      
      inline def setLeadingTextStartUndefined: Self = StObject.set(x, "leadingTextStart", js.undefined)
      
      inline def setPrevOffset(value: Double): Self = StObject.set(x, "prevOffset", value.asInstanceOf[js.Any])
      
      inline def setPrevOffsetUndefined: Self = StObject.set(x, "prevOffset", js.undefined)
      
      inline def setTokenLength(value: Double): Self = StObject.set(x, "tokenLength", value.asInstanceOf[js.Any])
      
      inline def setTokenStart(value: Double): Self = StObject.set(x, "tokenStart", value.asInstanceOf[js.Any])
    }
  }
  
  type WPElement = typings.wordpressElement.reactMod.WPElement
}
