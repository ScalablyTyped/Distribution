package typings.swigEmailTemplates.mod

import typings.jquery.JQueryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swig-email-templates", JSImport.Namespace)
@js.native
class ^ () extends EmailTemplates {
  def this(options: SwigEmailTemplatesOptions) = this()
  /* CompleteClass */
  override def generateSubject(
    templatePath: String,
    context: js.Any,
    cb: js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def generateText(
    templatePath: String,
    context: js.Any,
    html: String,
    cb: js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def render(
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
  /* CompleteClass */
  override def rewriteUrls($: JQueryStatic, rewrite: js.Function1[/* href */ String, Unit]): Unit = js.native
}

