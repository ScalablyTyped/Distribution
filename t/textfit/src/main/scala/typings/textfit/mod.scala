package typings.textfit

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLCollection
import typings.std.HTMLElement
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(els: js.Array[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].apply(els.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(els: js.Array[HTMLElement], options: TextFitOption): Unit = (^.asInstanceOf[js.Dynamic].apply(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(els: JQuery[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].apply(els.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(els: JQuery[HTMLElement], options: TextFitOption): Unit = (^.asInstanceOf[js.Dynamic].apply(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(els: HTMLCollection): Unit = ^.asInstanceOf[js.Dynamic].apply(els.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(els: HTMLCollection, options: TextFitOption): Unit = (^.asInstanceOf[js.Dynamic].apply(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(els: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].apply(els.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(els: HTMLElement, options: TextFitOption): Unit = (^.asInstanceOf[js.Dynamic].apply(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(els: NodeListOf[Element]): Unit = ^.asInstanceOf[js.Dynamic].apply(els.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(els: NodeListOf[Element], options: TextFitOption): Unit = (^.asInstanceOf[js.Dynamic].apply(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("textfit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TextFitOption extends StObject {
    
    /**
      *  if true, textFit will set text-align: center
      *  @default false
      */
    var alignHoriz: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  if true, textFit will align vertically using css tables
      *  @default false
      */
    var alignVert: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  if true, textFit will use flexbox for vertical alignment
      *  @default false
      */
    var alignVertWithFlexbox: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  disable to turn off automatic multi-line sensing
      *  @default true
      */
    var detectMultiLine: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  @default 80
      */
    var maxFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      *  @default 6
      */
    var minFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      *  if true, textFit will not set white-space: no-wrap
      *  @default false
      */
    var multiLine: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  if true, textFit will re-process already-fit nodes. Set to 'false' for better performance
      *  @default true
      */
    var reProcess: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  if true, textFit will fit text to element width, regardless of text height
      *  @default false
      */
    var widthOnly: js.UndefOr[Boolean] = js.undefined
  }
  object TextFitOption {
    
    inline def apply(): TextFitOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextFitOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextFitOption] (val x: Self) extends AnyVal {
      
      inline def setAlignHoriz(value: Boolean): Self = StObject.set(x, "alignHoriz", value.asInstanceOf[js.Any])
      
      inline def setAlignHorizUndefined: Self = StObject.set(x, "alignHoriz", js.undefined)
      
      inline def setAlignVert(value: Boolean): Self = StObject.set(x, "alignVert", value.asInstanceOf[js.Any])
      
      inline def setAlignVertUndefined: Self = StObject.set(x, "alignVert", js.undefined)
      
      inline def setAlignVertWithFlexbox(value: Boolean): Self = StObject.set(x, "alignVertWithFlexbox", value.asInstanceOf[js.Any])
      
      inline def setAlignVertWithFlexboxUndefined: Self = StObject.set(x, "alignVertWithFlexbox", js.undefined)
      
      inline def setDetectMultiLine(value: Boolean): Self = StObject.set(x, "detectMultiLine", value.asInstanceOf[js.Any])
      
      inline def setDetectMultiLineUndefined: Self = StObject.set(x, "detectMultiLine", js.undefined)
      
      inline def setMaxFontSize(value: Double): Self = StObject.set(x, "maxFontSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeUndefined: Self = StObject.set(x, "maxFontSize", js.undefined)
      
      inline def setMinFontSize(value: Double): Self = StObject.set(x, "minFontSize", value.asInstanceOf[js.Any])
      
      inline def setMinFontSizeUndefined: Self = StObject.set(x, "minFontSize", js.undefined)
      
      inline def setMultiLine(value: Boolean): Self = StObject.set(x, "multiLine", value.asInstanceOf[js.Any])
      
      inline def setMultiLineUndefined: Self = StObject.set(x, "multiLine", js.undefined)
      
      inline def setReProcess(value: Boolean): Self = StObject.set(x, "reProcess", value.asInstanceOf[js.Any])
      
      inline def setReProcessUndefined: Self = StObject.set(x, "reProcess", js.undefined)
      
      inline def setWidthOnly(value: Boolean): Self = StObject.set(x, "widthOnly", value.asInstanceOf[js.Any])
      
      inline def setWidthOnlyUndefined: Self = StObject.set(x, "widthOnly", js.undefined)
    }
  }
}
