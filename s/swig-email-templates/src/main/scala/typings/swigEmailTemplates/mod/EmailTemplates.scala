package typings.swigEmailTemplates.mod

import typings.jquery.JQueryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailTemplates extends js.Object {
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
  implicit class EmailTemplatesOps[Self <: EmailTemplates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGenerateSubject(value: (String, js.Any, js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]) => Unit): Self = this.set("generateSubject", js.Any.fromFunction3(value))
    @scala.inline
    def setGenerateText(
      value: (String, js.Any, String, js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]) => Unit
    ): Self = this.set("generateText", js.Any.fromFunction4(value))
    @scala.inline
    def setRender(
      value: (String, js.Any, js.Function4[
          /* error */ js.Any, 
          /* inlinedHTML */ js.UndefOr[String], 
          /* text */ js.UndefOr[String], 
          /* subject */ js.UndefOr[String], 
          Unit
        ]) => Unit
    ): Self = this.set("render", js.Any.fromFunction3(value))
    @scala.inline
    def setRewriteUrls(value: (JQueryStatic, js.Function1[/* href */ String, Unit]) => Unit): Self = this.set("rewriteUrls", js.Any.fromFunction2(value))
  }
  
}

