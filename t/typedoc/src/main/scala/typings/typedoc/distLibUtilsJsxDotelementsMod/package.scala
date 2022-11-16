package typings.typedoc.distLibUtilsJsxDotelementsMod

import typings.typedoc.distLibUtilsJsxDotelementsMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def JsxFragment: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("JsxFragment").asInstanceOf[js.Symbol]

/** 
NOTE: Rewritten from type alias:
{{{
type JsxChildren = typedoc.typedoc/dist/lib/utils/jsx.elements.JsxElement | string | number | null | undefined | std.Array<typedoc.typedoc/dist/lib/utils/jsx.elements.JsxChildren>
}}}
to avoid circular code involving: 
- typedoc.typedoc/dist/lib/utils/jsx.elements.JsxChildren
*/
type JsxChildren = js.UndefOr[JsxElement | String | Double | Null | js.Array[Any]]

type JsxComponent[P] = js.Function1[/* props */ P, js.UndefOr[JsxElement | Null]]
