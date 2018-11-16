package typings
package swigDashEmailDashTemplatesLib.swigDashEmailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swig-email-templates", JSImport.Namespace)
@js.native
class namespaced () extends EmailTemplates {
  def this(options: SwigEmailTemplatesOptions) = this()
  /* CompleteClass */
  override def generateSubject(
    templatePath: java.lang.String,
    context: js.Any,
    cb: js.Function2[/* error */ js.Any, /* text */ java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def generateText(
    templatePath: java.lang.String,
    context: js.Any,
    html: java.lang.String,
    cb: js.Function2[/* error */ js.Any, /* text */ java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def render(
    templatePath: java.lang.String,
    context: js.Any,
    cb: js.Function4[
      /* error */ js.Any, 
      /* inlinedHTML */ js.UndefOr[java.lang.String], 
      /* text */ js.UndefOr[java.lang.String], 
      /* subject */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def rewriteUrls($: jqueryLib.JQueryStatic, rewrite: js.Function1[/* href */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

