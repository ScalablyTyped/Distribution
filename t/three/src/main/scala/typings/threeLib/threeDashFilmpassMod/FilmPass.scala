package typings
package threeLib.threeDashFilmpassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-filmpass", "FilmPass")
@js.native
class FilmPass ()
  extends threeLib.threeDashEffectcomposerMod.Pass {
  def this(noiseIntensity: scala.Double) = this()
  def this(noiseIntensity: scala.Double, scanlinesIntensity: scala.Double) = this()
  def this(noiseIntensity: scala.Double, scanlinesIntensity: scala.Double, scanlinesCount: scala.Double) = this()
  def this(noiseIntensity: scala.Double, scanlinesIntensity: scala.Double, scanlinesCount: scala.Double, grayscale: scala.Boolean) = this()
  var camera: threeLib.threeDashCoreMod.OrthographicCamera = js.native
  var material: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var quad: threeLib.threeDashCoreMod.Mesh = js.native
  var scene: threeLib.threeDashCoreMod.Scene = js.native
  var uniforms: org.scalablytyped.runtime.StringDictionary[threeLib.threeDashCoreMod.IUniform] = js.native
}

