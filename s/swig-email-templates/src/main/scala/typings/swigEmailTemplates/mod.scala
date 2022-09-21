package typings.swigEmailTemplates

import typings.jquery.JQueryStatic
import typings.swig.mod.SwigOptions
import typings.swigEmailTemplates.anon.Html
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swig-email-templates", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EmailTemplates {
    def this(options: SwigEmailTemplatesOptions) = this()
  }
  
  @js.native
  trait EmailTemplates extends StObject {
    
    def generateSubject(
      templatePath: String,
      context: Any,
      cb: js.Function2[/* error */ Any, /* text */ String | Null, Unit]
    ): Unit = js.native
    
    def generateText(
      templatePath: String,
      context: Any,
      html: String,
      cb: js.Function2[/* error */ Any, /* text */ String | Null, Unit]
    ): Unit = js.native
    
    /** @async */
    def render(templatePath: String, context: Any): js.Promise[Html] = js.native
    def render(
      templatePath: String,
      context: Any,
      cb: js.Function4[
          /* error */ Any, 
          /* inlinedHTML */ js.UndefOr[String], 
          /* text */ js.UndefOr[String], 
          /* subject */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    
    def rewriteUrls($: JQueryStatic, rewrite: js.Function1[/* href */ String, Unit]): Unit = js.native
  }
  
  trait SwigEmailTemplatesOptions
    extends StObject
       with SwigOptions {
    
    var juice: js.UndefOr[Any] = js.undefined
    
    var rewrite: js.UndefOr[js.Function1[/* $ */ JQueryStatic, Unit]] = js.undefined
    
    var rewriteUrl: js.UndefOr[js.Function1[/* href */ String, String]] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
  }
  object SwigEmailTemplatesOptions {
    
    inline def apply(): SwigEmailTemplatesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwigEmailTemplatesOptions]
    }
    
    extension [Self <: SwigEmailTemplatesOptions](x: Self) {
      
      inline def setJuice(value: Any): Self = StObject.set(x, "juice", value.asInstanceOf[js.Any])
      
      inline def setJuiceUndefined: Self = StObject.set(x, "juice", js.undefined)
      
      inline def setRewrite(value: /* $ */ JQueryStatic => Unit): Self = StObject.set(x, "rewrite", js.Any.fromFunction1(value))
      
      inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
      
      inline def setRewriteUrl(value: /* href */ String => String): Self = StObject.set(x, "rewriteUrl", js.Any.fromFunction1(value))
      
      inline def setRewriteUrlUndefined: Self = StObject.set(x, "rewriteUrl", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type SwigRender[T] = js.Function3[
    /* file */ String, 
    /* context */ T, 
    /* callback */ js.Function3[/* err */ Any, /* html */ String, /* text */ String, Any], 
    Any
  ]
}
