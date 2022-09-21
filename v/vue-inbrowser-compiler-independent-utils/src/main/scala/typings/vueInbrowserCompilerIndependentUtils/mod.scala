package typings.vueInbrowserCompilerIndependentUtils

import typings.vueInbrowserCompilerIndependentUtils.typesMod.ComponentDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-inbrowser-compiler-independent-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addScopedStyle(css: String, suffix: String): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addScopedStyle")(css.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def cleanName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDefaultExample(doc: ComponentDoc): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultExample")(doc.asInstanceOf[js.Any]).asInstanceOf[String]
}
