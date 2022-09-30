package typings.vueInbrowserCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import typings.vueInbrowserCompilerUtils.adaptCreateElementMod.CreateElementFunction
import typings.vueInbrowserCompilerUtils.parseComponentMod.VsgSFCDescriptor
import typings.vueInbrowserCompilerUtils.typesMod.ComponentDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-inbrowser-compiler-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptCreateElement(h: CreateElementFunction): CreateElementFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptCreateElement")(h.asInstanceOf[js.Any]).asInstanceOf[CreateElementFunction]
  
  inline def addScopedStyle(css: String, suffix: String): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addScopedStyle")(css.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def cleanName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def concatenate(src: StringDictionary[Any], otherObj: StringDictionary[Any]*): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(scala.List(src.asInstanceOf[js.Any]).`++`(otherObj.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StringDictionary[Any]]
  
  inline def getDefaultExample(doc: ComponentDoc): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultExample")(doc.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def h(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("h")().asInstanceOf[Unit]
  
  inline def isCodeVueSfc(code: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCodeVueSfc")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("vue-inbrowser-compiler-utils", "isVue3")
  @js.native
  val isVue3: Boolean = js.native
  
  inline def parseComponent(code: String): VsgSFCDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("parseComponent")(code.asInstanceOf[js.Any]).asInstanceOf[VsgSFCDescriptor]
  
  inline def resolveComponent(name: String): String | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponent")(name.asInstanceOf[js.Any]).asInstanceOf[String | js.Object]
  inline def resolveComponent(name: js.Object): String | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponent")(name.asInstanceOf[js.Any]).asInstanceOf[String | js.Object]
}
