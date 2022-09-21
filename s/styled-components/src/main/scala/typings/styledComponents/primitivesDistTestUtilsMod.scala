package typings.styledComponents

import typings.std.Document
import typings.std.HTMLElement
import typings.styledComponents.anon.Address
import typings.styledComponents.anon.IgnoreWhitespace
import typings.styledComponents.anon.`528`
import typings.styledComponents.primitivesDistTypesMod.WebTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesDistTestUtilsMod {
  
  @JSImport("styled-components/primitives/dist/test/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expectCSSMatches(_expectation: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("expectCSSMatches")(_expectation.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def expectCSSMatches(_expectation: String, opts: IgnoreWhitespace): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expectCSSMatches")(_expectation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCSS(scope: Document): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCSS")(scope.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getCSS(scope: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCSS")(scope.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getRenderedCSS(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderedCSS")().asInstanceOf[String]
  
  inline def rehydrateTestStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rehydrateTestStyles")().asInstanceOf[Unit]
  
  inline def resetStyled(): (js.Function1[/* tag */ WebTarget, `528`[WebTarget]]) & Address = ^.asInstanceOf[js.Dynamic].applyDynamic("resetStyled")().asInstanceOf[(js.Function1[/* tag */ WebTarget, `528`[WebTarget]]) & Address]
  inline def resetStyled(isServer: Boolean): (js.Function1[/* tag */ WebTarget, `528`[WebTarget]]) & Address = ^.asInstanceOf[js.Dynamic].applyDynamic("resetStyled")(isServer.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* tag */ WebTarget, `528`[WebTarget]]) & Address]
  
  inline def seedNextClassnames(names: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("seedNextClassnames")(names.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def stripComments(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripComments")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripWhitespace(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripWhitespace")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
