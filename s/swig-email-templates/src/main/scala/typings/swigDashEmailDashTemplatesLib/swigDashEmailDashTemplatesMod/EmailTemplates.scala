package typings
package swigDashEmailDashTemplatesLib.swigDashEmailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EmailTemplates extends js.Object {
  def generateSubject(
    templatePath: java.lang.String,
    context: js.Any,
    cb: js.Function2[/* error */ js.Any, /* text */ java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit
  def generateText(
    templatePath: java.lang.String,
    context: js.Any,
    html: java.lang.String,
    cb: js.Function2[/* error */ js.Any, /* text */ java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit
  def render(
    templatePath: java.lang.String,
    context: js.Any,
    cb: js.Function4[
      /* error */ js.Any, 
      /* inlinedHTML */ js.UndefOr[java.lang.String], 
      /* text */ js.UndefOr[java.lang.String], 
      /* subject */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit
  def rewriteUrls($: jqueryLib.JQueryStatic, rewrite: js.Function1[/* href */ java.lang.String, scala.Unit]): scala.Unit
}

