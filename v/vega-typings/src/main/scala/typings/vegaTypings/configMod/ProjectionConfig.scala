package typings.vegaTypings.configMod

import typings.std.Exclude
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.ScaledValueRef
import typings.vegaTypings.projectionMod.Fit
import typings.vegaTypings.projectionMod.GeoJsonFeature
import typings.vegaTypings.projectionMod.ProjectionType
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/projection.BaseProjection> */
@js.native
trait ProjectionConfig extends js.Object {
  var center: js.UndefOr[
    (Exclude[
      js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
  ] = js.native
  var clipAngle: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var clipExtent: js.UndefOr[
    (Exclude[
      js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
  ] = js.native
  var coefficient: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var distance: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var extent: js.UndefOr[
    (Exclude[
      js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
  ] = js.native
  var fit: js.UndefOr[
    (Exclude[
      js.UndefOr[Fit | js.Array[Fit] | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Fit | js.Array[Fit] | SignalRef]])
  ] = js.native
  var fraction: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var lobes: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var parallel: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var parallels: js.UndefOr[
    (Exclude[
      js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef]])
  ] = js.native
  var pointRadius: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var precision: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var radius: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var ratio: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var reflectX: js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
  ] = js.native
  var reflectY: js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
  ] = js.native
  var rotate: js.UndefOr[
    (Exclude[
      js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[
      js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef]
    ])
  ] = js.native
  var scale: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var size: js.UndefOr[
    (Exclude[
      js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
  ] = js.native
  var spacing: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var tilt: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.native
  var translate: js.UndefOr[
    (Exclude[
      js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
  ] = js.native
  var `type`: js.UndefOr[
    (Exclude[
      js.UndefOr[ProjectionType | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[ProjectionType | SignalRef]])
  ] = js.native
}

object ProjectionConfig {
  @scala.inline
  def apply(): ProjectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectionConfig]
  }
  @scala.inline
  implicit class ProjectionConfigOps[Self <: ProjectionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCenter(
      value: (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
    ): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setClipAngle(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("clipAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipAngle: Self = this.set("clipAngle", js.undefined)
    @scala.inline
    def setClipExtent(
      value: (Exclude[
          js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
    ): Self = this.set("clipExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipExtent: Self = this.set("clipExtent", js.undefined)
    @scala.inline
    def setCoefficient(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("coefficient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoefficient: Self = this.set("coefficient", js.undefined)
    @scala.inline
    def setDistance(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setExtent(
      value: (Exclude[
          js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
    ): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setFitVarargs(value: GeoJsonFeature*): Self = this.set("fit", js.Array(value :_*))
    @scala.inline
    def setFit(
      value: (Exclude[
          js.UndefOr[Fit | js.Array[Fit] | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Fit | js.Array[Fit] | SignalRef]])
    ): Self = this.set("fit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    @scala.inline
    def setFraction(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("fraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFraction: Self = this.set("fraction", js.undefined)
    @scala.inline
    def setLobes(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("lobes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLobes: Self = this.set("lobes", js.undefined)
    @scala.inline
    def setParallel(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("parallel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    @scala.inline
    def setParallelsVarargs(value: (Double | SignalRef)*): Self = this.set("parallels", js.Array(value :_*))
    @scala.inline
    def setParallels(
      value: (Exclude[
          js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef]])
    ): Self = this.set("parallels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallels: Self = this.set("parallels", js.undefined)
    @scala.inline
    def setPointRadius(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("pointRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointRadius: Self = this.set("pointRadius", js.undefined)
    @scala.inline
    def setPrecision(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setRadius(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRatio(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    @scala.inline
    def setReflectX(
      value: (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
    ): Self = this.set("reflectX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReflectX: Self = this.set("reflectX", js.undefined)
    @scala.inline
    def setReflectY(
      value: (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
    ): Self = this.set("reflectY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReflectY: Self = this.set("reflectY", js.undefined)
    @scala.inline
    def setRotate(
      value: (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[
          js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef]
        ])
    ): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setScale(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSize(
      value: (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
    ): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpacing(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setTilt(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("tilt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilt: Self = this.set("tilt", js.undefined)
    @scala.inline
    def setTranslate(
      value: (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
    ): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setType(
      value: (Exclude[
          js.UndefOr[ProjectionType | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[ProjectionType | SignalRef]])
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

