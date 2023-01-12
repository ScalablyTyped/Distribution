package typings.svgToPdfkit

import typings.pdfkit.PDFKit.PDFDocument
import typings.std.SVGElement
import typings.svgToPdfkit.anon.FauxBold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(doc: PDFDocument, svg: String): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: String, x: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: String, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: String, x: Double, y: Double, options: SVGtoPDFOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: String, x: Double, y: Unit, options: SVGtoPDFOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: String, x: Unit, y: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: String, x: Unit, y: Double, options: SVGtoPDFOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: String, x: Unit, y: Unit, options: SVGtoPDFOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: SVGElement): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: SVGElement, x: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: SVGElement, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: SVGElement, x: Double, y: Double, options: SVGtoPDFOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: SVGElement, x: Double, y: Unit, options: SVGtoPDFOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: SVGElement, x: Unit, y: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: SVGElement, x: Unit, y: Double, options: SVGtoPDFOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(doc: PDFDocument, svg: SVGElement, x: Unit, y: Unit, options: SVGtoPDFOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("svg-to-pdfkit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SVGtoPDFOptions extends StObject {
    
    var assumePt: js.UndefOr[Boolean] = js.undefined
    
    var colorCallback: js.UndefOr[
        js.Function2[
          /* result */ String, 
          /* raw */ String, 
          js.Tuple2[js.Tuple3[Double, Double, Double], Double]
        ]
      ] = js.undefined
    
    var documentCallback: js.UndefOr[js.Function1[/* file */ String, String]] = js.undefined
    
    var fontCallback: js.UndefOr[
        js.Function4[
          /* family */ String, 
          /* bold */ Boolean, 
          /* italic */ Boolean, 
          /* fontOptions */ FauxBold, 
          String
        ]
      ] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var imageCallback: js.UndefOr[js.Function1[/* link */ String, String]] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var useCSS: js.UndefOr[Boolean] = js.undefined
    
    var warningCallback: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SVGtoPDFOptions {
    
    inline def apply(): SVGtoPDFOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SVGtoPDFOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SVGtoPDFOptions] (val x: Self) extends AnyVal {
      
      inline def setAssumePt(value: Boolean): Self = StObject.set(x, "assumePt", value.asInstanceOf[js.Any])
      
      inline def setAssumePtUndefined: Self = StObject.set(x, "assumePt", js.undefined)
      
      inline def setColorCallback(
        value: (/* result */ String, /* raw */ String) => js.Tuple2[js.Tuple3[Double, Double, Double], Double]
      ): Self = StObject.set(x, "colorCallback", js.Any.fromFunction2(value))
      
      inline def setColorCallbackUndefined: Self = StObject.set(x, "colorCallback", js.undefined)
      
      inline def setDocumentCallback(value: /* file */ String => String): Self = StObject.set(x, "documentCallback", js.Any.fromFunction1(value))
      
      inline def setDocumentCallbackUndefined: Self = StObject.set(x, "documentCallback", js.undefined)
      
      inline def setFontCallback(
        value: (/* family */ String, /* bold */ Boolean, /* italic */ Boolean, /* fontOptions */ FauxBold) => String
      ): Self = StObject.set(x, "fontCallback", js.Any.fromFunction4(value))
      
      inline def setFontCallbackUndefined: Self = StObject.set(x, "fontCallback", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImageCallback(value: /* link */ String => String): Self = StObject.set(x, "imageCallback", js.Any.fromFunction1(value))
      
      inline def setImageCallbackUndefined: Self = StObject.set(x, "imageCallback", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
      
      inline def setUseCSSUndefined: Self = StObject.set(x, "useCSS", js.undefined)
      
      inline def setWarningCallback(value: /* str */ String => Unit): Self = StObject.set(x, "warningCallback", js.Any.fromFunction1(value))
      
      inline def setWarningCallbackUndefined: Self = StObject.set(x, "warningCallback", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
