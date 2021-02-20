package typings.swigEmailTemplates

import typings.jquery.JQueryStatic
import typings.swig.mod.SwigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swig-email-templates", JSImport.Namespace)
  @js.native
  class ^ () extends EmailTemplates {
    def this(options: SwigEmailTemplatesOptions) = this()
  }
  
  @js.native
  trait EmailTemplates extends StObject {
    
    def generateSubject(
      templatePath: String,
      context: js.Any,
      cb: js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]
    ): Unit = js.native
    
    def generateText(
      templatePath: String,
      context: js.Any,
      html: String,
      cb: js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]
    ): Unit = js.native
    
    def render(
      templatePath: String,
      context: js.Any,
      cb: js.Function4[
          /* error */ js.Any, 
          /* inlinedHTML */ js.UndefOr[String], 
          /* text */ js.UndefOr[String], 
          /* subject */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    
    def rewriteUrls($: JQueryStatic, rewrite: js.Function1[/* href */ String, Unit]): Unit = js.native
  }
  object EmailTemplates {
    
    @scala.inline
    def apply(
      generateSubject: (String, js.Any, js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]) => Unit,
      generateText: (String, js.Any, String, js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]) => Unit,
      render: (String, js.Any, js.Function4[
          /* error */ js.Any, 
          /* inlinedHTML */ js.UndefOr[String], 
          /* text */ js.UndefOr[String], 
          /* subject */ js.UndefOr[String], 
          Unit
        ]) => Unit,
      rewriteUrls: (JQueryStatic, js.Function1[/* href */ String, Unit]) => Unit
    ): EmailTemplates = {
      val __obj = js.Dynamic.literal(generateSubject = js.Any.fromFunction3(generateSubject), generateText = js.Any.fromFunction4(generateText), render = js.Any.fromFunction3(render), rewriteUrls = js.Any.fromFunction2(rewriteUrls))
      __obj.asInstanceOf[EmailTemplates]
    }
    
    @scala.inline
    implicit class EmailTemplatesMutableBuilder[Self <: EmailTemplates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenerateSubject(value: (String, js.Any, js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]) => Unit): Self = StObject.set(x, "generateSubject", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGenerateText(
        value: (String, js.Any, String, js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]) => Unit
      ): Self = StObject.set(x, "generateText", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRender(
        value: (String, js.Any, js.Function4[
              /* error */ js.Any, 
              /* inlinedHTML */ js.UndefOr[String], 
              /* text */ js.UndefOr[String], 
              /* subject */ js.UndefOr[String], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRewriteUrls(value: (JQueryStatic, js.Function1[/* href */ String, Unit]) => Unit): Self = StObject.set(x, "rewriteUrls", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SwigEmailTemplatesOptions extends SwigOptions {
    
    var juice: js.UndefOr[js.Any] = js.native
    
    var rewrite: js.UndefOr[js.Function1[/* $ */ JQueryStatic, Unit]] = js.native
    
    var rewriteUrl: js.UndefOr[js.Function1[/* href */ String, String]] = js.native
    
    var root: js.UndefOr[String] = js.native
  }
  object SwigEmailTemplatesOptions {
    
    @scala.inline
    def apply(): SwigEmailTemplatesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwigEmailTemplatesOptions]
    }
    
    @scala.inline
    implicit class SwigEmailTemplatesOptionsMutableBuilder[Self <: SwigEmailTemplatesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJuice(value: js.Any): Self = StObject.set(x, "juice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJuiceUndefined: Self = StObject.set(x, "juice", js.undefined)
      
      @scala.inline
      def setRewrite(value: /* $ */ JQueryStatic => Unit): Self = StObject.set(x, "rewrite", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
      
      @scala.inline
      def setRewriteUrl(value: /* href */ String => String): Self = StObject.set(x, "rewriteUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRewriteUrlUndefined: Self = StObject.set(x, "rewriteUrl", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type SwigRender[T] = js.Function3[
    /* file */ String, 
    /* context */ T, 
    /* callback */ js.Function3[/* err */ js.Any, /* html */ String, /* text */ String, js.Any], 
    js.Any
  ]
}
