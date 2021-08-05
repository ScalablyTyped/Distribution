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
  
  inline def addScopedStyle(css: String, suffix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addScopedStyle")(css.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cleanName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def concatenate(src: StringDictionary[js.Any], otherObj: StringDictionary[js.Any]*): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(src.asInstanceOf[js.Any], otherObj.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  inline def getDefaultExample(doc: ComponentDoc): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultExample")(doc.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isCodeVueSfc(code: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCodeVueSfc")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseComponent(code: String): VsgSFCDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("parseComponent")(code.asInstanceOf[js.Any]).asInstanceOf[VsgSFCDescriptor]
}
