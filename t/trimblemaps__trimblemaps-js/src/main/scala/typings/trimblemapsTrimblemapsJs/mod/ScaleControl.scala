package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.anon.MaxWidth
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.imperial
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.metric
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.nautical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@trimblemaps/trimblemaps-js", "ScaleControl")
@js.native
open class ScaleControl () extends Control {
  def this(options: MaxWidth) = this()
  
  @JSName("getDefaultPosition")
  def getDefaultPosition_MScaleControl(): String = js.native
  
  def setUnit(unit: imperial | metric | nautical): Unit = js.native
}
