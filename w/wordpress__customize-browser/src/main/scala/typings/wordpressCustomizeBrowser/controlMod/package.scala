package typings.wordpressCustomizeBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object controlMod {
  
  type ControlSettings = ((typings.std.Record[
    java.lang.String, 
    typings.wordpressCustomizeBrowser.settingMod.Setting[_] | typings.wordpressCustomizeBrowser.valueMod.Value[_]
  ]) | (js.Array[
    typings.wordpressCustomizeBrowser.settingMod.Setting[_] | typings.wordpressCustomizeBrowser.valueMod.Value[_]
  ])) with typings.wordpressCustomizeBrowser.anon.Default
}
