package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SvgIconRegistry")
@js.native
open class SvgIconRegistry () extends StObject {
  
  var iconPrefix: String = js.native
  
  var icons: SvgIconData = js.native
  
  def iconsRenderedHtml(): Any = js.native
  
  def registerIconFromSvg(iconId: String, iconSvg: String): Boolean = js.native
  def registerIconFromSvg(iconId: String, iconSvg: String, iconPrefix: String): Boolean = js.native
  
  def registerIconFromSvgViaElement(iconId: String, iconSvg: String): Unit = js.native
  def registerIconFromSvgViaElement(iconId: String, iconSvg: String, iconPrefix: String): Unit = js.native
  
  def registerIconFromSymbol(iconId: String, iconSymbolSvg: String): Unit = js.native
  
  def registerIconsFromFolder(r: Any): Unit = js.native
  
  def renderIcons(): Unit = js.native
}
