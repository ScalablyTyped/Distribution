package typings.swigEmailTemplates.mod

import typings.jquery.JQueryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplates extends js.Object {
  def generateSubject(
    templatePath: String,
    context: js.Any,
    cb: js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]
  ): Unit
  def generateText(
    templatePath: String,
    context: js.Any,
    html: String,
    cb: js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]
  ): Unit
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
  ): Unit
  def rewriteUrls($: JQueryStatic, rewrite: js.Function1[/* href */ String, Unit]): Unit
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
}

