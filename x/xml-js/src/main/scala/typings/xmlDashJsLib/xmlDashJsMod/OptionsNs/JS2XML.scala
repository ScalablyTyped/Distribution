package typings
package xmlDashJsLib.xmlDashJsMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JS2XML
  extends ChangingKeyNames
     with IgnoreOptions {
  var attributeNameFn: js.UndefOr[
    js.Function4[
      /* attributeName */ java.lang.String, 
      /* attributeValue */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var attributeValueFn: js.UndefOr[
    js.Function4[
      /* attributeValue */ java.lang.String, 
      /* attributeName */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var attributesFn: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var cdataFn: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var commentFn: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var doctypeFn: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var elementNameFn: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var fullTagEmptyElement: js.UndefOr[scala.Boolean] = js.undefined
  var fullTagEmptyElementFn: js.UndefOr[
    js.Function2[
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var indentAttributes: js.UndefOr[scala.Boolean] = js.undefined
  var indentCdata: js.UndefOr[scala.Boolean] = js.undefined
  var indentInstruction: js.UndefOr[scala.Boolean] = js.undefined
  var indentText: js.UndefOr[scala.Boolean] = js.undefined
  var instructionFn: js.UndefOr[
    js.Function4[
      /* instructionValue */ java.lang.String, 
      /* instructionName */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var instructionNameFn: js.UndefOr[
    js.Function4[
      /* instructionName */ java.lang.String, 
      /* instructionValue */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var noQuotesForNativeAttributes: js.UndefOr[scala.Boolean] = js.undefined
  var spaces: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var textFn: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
}

