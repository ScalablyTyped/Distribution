package typings
package threeLib.threeDashLutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-lut", "Lut")
@js.native
class Lut protected () extends js.Object {
  def this(colormap: ColorMapKeyword, numberofcolors: scala.Double) = this()
  def addColorMap(colormapName: java.lang.String, arrayOfColors: js.Array[js.Tuple2[scala.Double, java.lang.String]]): scala.Unit = js.native
  def changeColorMap(colormap: ColorMapKeyword): Lut = js.native
  def changeNumberOfColors(numberofcolors: scala.Double): Lut = js.native
  def copy(lut: Lut): scala.Unit = js.native
  def getColor(alpha: scala.Double): threeLib.threeDashCoreMod.Color = js.native
  @JSName("setLegendLayout")
  def setLegendLayout_horizontal(layout: threeLib.threeLibStrings.horizontal): scala.Unit = js.native
  @JSName("setLegendLayout")
  def setLegendLayout_vertical(layout: threeLib.threeLibStrings.vertical): scala.Unit = js.native
  def setLegendOff(): scala.Unit = js.native
  def setLegendOn(): threeLib.threeDashCoreMod.Mesh = js.native
  def setLegendPosition(position: threeLib.threeDashCoreMod.Vector3): scala.Unit = js.native
  def setMax(max: scala.Double): scala.Unit = js.native
  def setMin(min: scala.Double): scala.Unit = js.native
}

