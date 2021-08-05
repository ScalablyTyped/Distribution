package typings.waitme

import typings.waitme.waitmeStrings.bounce
import typings.waitme.waitmeStrings.bouncePulse
import typings.waitme.waitmeStrings.facebook
import typings.waitme.waitmeStrings.hide
import typings.waitme.waitmeStrings.horizontal
import typings.waitme.waitmeStrings.img
import typings.waitme.waitmeStrings.ios
import typings.waitme.waitmeStrings.none
import typings.waitme.waitmeStrings.orbit
import typings.waitme.waitmeStrings.progressBar
import typings.waitme.waitmeStrings.pulse
import typings.waitme.waitmeStrings.rotateplane
import typings.waitme.waitmeStrings.rotation
import typings.waitme.waitmeStrings.roundBounce
import typings.waitme.waitmeStrings.stretch
import typings.waitme.waitmeStrings.timer
import typings.waitme.waitmeStrings.vertical
import typings.waitme.waitmeStrings.win8
import typings.waitme.waitmeStrings.win8_linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WaitMe {
  
  trait WaitMeOptions extends StObject {
    
    /**
      * background for container (string).
      * Use: 'rgba(255,255,255,0.7)'. You can use color and image.
      */
    var bg: js.UndefOr[String] = js.undefined
    
    /**
      * color for background animation and text (string, array).
      * Use: '#000', ['','',...] - you can use multicolor for effect
      */
    var color: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * animation effect (string).
      * Use: 'bounce' - default
      *      | none
      *      | rotateplane
      *      | stretch
      *      | orbit
      *      | roundBounce
      *      | win8
      *      | win8_linear
      *      | ios
      *      | facebook
      *      | rotation
      *      | timer
      *      | pulse
      *      | progressBar
      *      | bouncePulse
      *      | img
      */
    var effect: js.UndefOr[
        none | bounce | rotateplane | stretch | orbit | roundBounce | win8 | win8_linear | ios | facebook | rotation | timer | pulse | progressBar | bouncePulse | img
      ] = js.undefined
    
    /**
      * change font size (string).
      * Use: '18px'. By default, use empty string.
      */
    var fontSize: js.UndefOr[String] = js.undefined
    
    /**
      * set max size for elem animation (string).
      * Use: 40. By default, use empty string.
      */
    var maxSize: js.UndefOr[Double | String] = js.undefined
    
    /**
      * code execution after closed (function).
      * Use: function(){ //your code here... } or ()=>{ //your code here... }
      * @returns {void} 
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * url to image (string).
      * Use: 'url'. By default, use empty string. Use with effect: 'img'.
      */
    var source: js.UndefOr[String] = js.undefined
    
    /**
      * place text under the effect (string).
      * Use: 'text'.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * change text position (string).
      * Use: 'vertical' - default, 'horizontal'.
      */
    var textPos: js.UndefOr[vertical | horizontal] = js.undefined
  }
  object WaitMeOptions {
    
    inline def apply(): WaitMeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitMeOptions]
    }
    
    extension [Self <: WaitMeOptions](x: Self) {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setColor(value: String | js.Array[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setEffect(
        value: none | bounce | rotateplane | stretch | orbit | roundBounce | win8 | win8_linear | ios | facebook | rotation | timer | pulse | progressBar | bouncePulse | img
      ): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setMaxSize(value: Double | String): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextPos(value: vertical | horizontal): Self = StObject.set(x, "textPos", value.asInstanceOf[js.Any])
      
      inline def setTextPosUndefined: Self = StObject.set(x, "textPos", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type WaitMeStatic = js.Function1[/* options */ js.UndefOr[WaitMeOptions | hide], JQuery]
}
