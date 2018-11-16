package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MeshPhongMaterialParameters extends MaterialParameters {
  var alphaMap: js.UndefOr[Texture] = js.undefined
  var aoMap: js.UndefOr[Texture] = js.undefined
  var aoMapIntensity: js.UndefOr[scala.Double] = js.undefined
  var bumpMap: js.UndefOr[Texture] = js.undefined
  var bumpScale: js.UndefOr[scala.Double] = js.undefined
  /** geometry color in hexadecimal. Default is 0xffffff. */
  var color: js.UndefOr[Color | java.lang.String | scala.Double] = js.undefined
  var combine: js.UndefOr[Combine] = js.undefined
  var displacementBias: js.UndefOr[scala.Double] = js.undefined
  var displacementMap: js.UndefOr[Texture] = js.undefined
  var displacementScale: js.UndefOr[scala.Double] = js.undefined
  var emissive: js.UndefOr[Color | java.lang.String | scala.Double] = js.undefined
  var emissiveIntensity: js.UndefOr[scala.Double] = js.undefined
  var emissiveMap: js.UndefOr[Texture] = js.undefined
  var envMap: js.UndefOr[Texture] = js.undefined
  var lightMap: js.UndefOr[Texture] = js.undefined
  var lightMapIntensity: js.UndefOr[scala.Double] = js.undefined
  var map: js.UndefOr[Texture] = js.undefined
  var morphNormals: js.UndefOr[scala.Boolean] = js.undefined
  var morphTargets: js.UndefOr[scala.Boolean] = js.undefined
  var normalMap: js.UndefOr[Texture] = js.undefined
  var normalScale: js.UndefOr[Vector2] = js.undefined
  var reflectivity: js.UndefOr[scala.Double] = js.undefined
  var refractionRatio: js.UndefOr[scala.Double] = js.undefined
  var shininess: js.UndefOr[scala.Double] = js.undefined
  var skinning: js.UndefOr[scala.Boolean] = js.undefined
  var specular: js.UndefOr[Color | java.lang.String | scala.Double] = js.undefined
  var specularMap: js.UndefOr[Texture] = js.undefined
  var wireframe: js.UndefOr[scala.Boolean] = js.undefined
  var wireframeLinecap: js.UndefOr[java.lang.String] = js.undefined
  var wireframeLinejoin: js.UndefOr[java.lang.String] = js.undefined
  var wireframeLinewidth: js.UndefOr[scala.Double] = js.undefined
}

