package typings
package xmlDashJsLib.xmlDashJsMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XML2JS
  extends ChangingKeyNames
     with IgnoreOptions {
  var addParent: js.UndefOr[scala.Boolean] = js.undefined
  var alwaysArray: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var alwaysChildren: js.UndefOr[scala.Boolean] = js.undefined
  var attributeNameFn: js.UndefOr[
    js.Function3[
      /* attributeName */ java.lang.String, 
      /* attributeValue */ java.lang.String, 
      /* parentElement */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var attributeValueFn: js.UndefOr[
    js.Function3[
      /* attributeValue */ java.lang.String, 
      /* attributeName */ java.lang.String, 
      /* parentElement */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var attributesFn: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* parentElement */ java.lang.String, scala.Unit]
  ] = js.undefined
  var captureSpacesBetweenElements: js.UndefOr[scala.Boolean] = js.undefined
  var cdataFn: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* parentElement */ js.Object, scala.Unit]
  ] = js.undefined
  var commentFn: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* parentElement */ js.Object, scala.Unit]
  ] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var doctypeFn: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* parentElement */ js.Object, scala.Unit]
  ] = js.undefined
  var elementNameFn: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* parentElement */ js.Object, scala.Unit]
  ] = js.undefined
  var instructionFn: js.UndefOr[
    js.Function3[
      /* instructionValue */ java.lang.String, 
      /* instructionName */ java.lang.String, 
      /* parentElement */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var instructionHasAttributes: js.UndefOr[scala.Boolean] = js.undefined
  var instructionNameFn: js.UndefOr[
    js.Function3[
      /* instructionName */ java.lang.String, 
      /* instructionValue */ java.lang.String, 
      /* parentElement */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var nativeType: js.UndefOr[scala.Boolean] = js.undefined
  var sanitize: js.UndefOr[scala.Boolean] = js.undefined
  var textFn: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* parentElement */ js.Object, scala.Unit]
  ] = js.undefined
  var trim: js.UndefOr[scala.Boolean] = js.undefined
}

