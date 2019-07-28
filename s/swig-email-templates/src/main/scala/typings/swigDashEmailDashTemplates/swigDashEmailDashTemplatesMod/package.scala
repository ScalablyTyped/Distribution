package typings.swigDashEmailDashTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swigDashEmailDashTemplatesMod {
  type SwigRender[T] = js.Function3[
    /* file */ String, 
    /* context */ T, 
    /* callback */ js.Function3[/* err */ js.Any, /* html */ String, /* text */ String, js.Any], 
    js.Any
  ]
}
