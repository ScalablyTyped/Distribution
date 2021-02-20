package typings.vueInbrowserCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import typings.vueInbrowserCompilerUtils.adaptCreateElementMod.CreateElementFunction
import typings.vueInbrowserCompilerUtils.parseComponentMod.VsgSFCDescriptor
import typings.vueInbrowserCompilerUtils.typesMod.ComponentDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-inbrowser-compiler-utils", "adaptCreateElement")
  @js.native
  def adaptCreateElement(h: CreateElementFunction): CreateElementFunction = js.native
  
  @JSImport("vue-inbrowser-compiler-utils", "addScopedStyle")
  @js.native
  def addScopedStyle(css: String, suffix: String): Unit = js.native
  
  @JSImport("vue-inbrowser-compiler-utils", "cleanName")
  @js.native
  def cleanName(name: String): String = js.native
  
  @JSImport("vue-inbrowser-compiler-utils", "concatenate")
  @js.native
  def concatenate(src: StringDictionary[js.Any], otherObj: StringDictionary[js.Any]*): StringDictionary[js.Any] = js.native
  
  @JSImport("vue-inbrowser-compiler-utils", "getDefaultExample")
  @js.native
  def getDefaultExample(doc: ComponentDoc): String = js.native
  
  @JSImport("vue-inbrowser-compiler-utils", "isCodeVueSfc")
  @js.native
  def isCodeVueSfc(code: String): Boolean = js.native
  
  @JSImport("vue-inbrowser-compiler-utils", "parseComponent")
  @js.native
  def parseComponent(code: String): VsgSFCDescriptor = js.native
}
