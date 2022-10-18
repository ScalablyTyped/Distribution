package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StringDictionary
import typings.uikit.anon.Svg
import typings.uikit.distJsUikitMod.UIkitElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon_ extends StObject {
  
  def apply(element: UIkitElement): Svg = js.native
  def apply(element: UIkitElement, options: UIkitIconOptions): Svg = js.native
  
  def add(contents: StringDictionary[String]): Unit = js.native
  def add(name: String, svg: String): Unit = js.native
}
