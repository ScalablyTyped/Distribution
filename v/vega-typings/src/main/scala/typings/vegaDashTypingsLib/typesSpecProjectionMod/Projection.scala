package typings
package vegaDashTypingsLib.typesSpecProjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  /*
    * The center of the projection.
    */
  var center: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  /*
    * The clip angle of the projection.
    */
  var clipAngle: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /*
    * Sets the projection’s viewport clip extent to the specified bounds in pixels
    */
  var clipExtent: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[
      vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]
    ]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  // TODO: use a union tagged by the projection type to determine which of the following is applicable
  /* The following properties are all supported for specific types of projections. Consult the d3-geo-projection library for more information: https://github.com/d3/d3-geo-projection */
  var coefficient: js.UndefOr[scala.Double] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  /*
    * Used in conjunction with fit, provides the pixel area to which the projection should be automatically fit.
    */
  var extent: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[
      vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]
    ]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  /*
    * GeoJSON data to which the projection should attempt to automatically fit the translate and scale parameters..
    */
  var fit: js.UndefOr[Fit | js.Array[Fit] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var fraction: js.UndefOr[scala.Double] = js.undefined
  var lobes: js.UndefOr[scala.Double] = js.undefined
  /*
    * The name of the projection.
    */
  var name: java.lang.String
  var parallel: js.UndefOr[scala.Double] = js.undefined
  var parallels: js.UndefOr[
    (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var pointRadius: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /*
    * The desired precision of the projection.
    */
  var precision: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
  /**
    * The rotation of the projection.
    */
  var rotate: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector3[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var scale: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /*
    * Used in conjunction with fit, provides the width and height in pixels of the area to which the projection should be automatically fit.
    */
  var size: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var tilt: js.UndefOr[scala.Double] = js.undefined
  /*
    * The translation of the projection.
    */
  var translate: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  /*
    * The type of the projection.
    */
  var `type`: ProjectionType | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
}

