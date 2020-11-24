package typings.three.materialMod

import typings.three.constantsMod.Blending
import typings.three.constantsMod.BlendingDstFactor
import typings.three.constantsMod.BlendingEquation
import typings.three.constantsMod.BlendingSrcFactor
import typings.three.constantsMod.DepthModes
import typings.three.constantsMod.Side
import typings.three.constantsMod.StencilFunc
import typings.three.constantsMod.StencilOp
import typings.three.planeMod.Plane
import typings.three.threeStrings.highp
import typings.three.threeStrings.lowp
import typings.three.threeStrings.mediump
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterialParameters extends js.Object {
  
  var alphaTest: js.UndefOr[Double] = js.native
  
  var blendDst: js.UndefOr[BlendingDstFactor] = js.native
  
  var blendDstAlpha: js.UndefOr[Double] = js.native
  
  var blendEquation: js.UndefOr[BlendingEquation] = js.native
  
  var blendEquationAlpha: js.UndefOr[Double] = js.native
  
  var blendSrc: js.UndefOr[BlendingSrcFactor | BlendingDstFactor] = js.native
  
  var blendSrcAlpha: js.UndefOr[Double] = js.native
  
  var blending: js.UndefOr[Blending] = js.native
  
  var clipIntersection: js.UndefOr[Boolean] = js.native
  
  var clipShadows: js.UndefOr[Boolean] = js.native
  
  var clippingPlanes: js.UndefOr[js.Array[Plane]] = js.native
  
  var colorWrite: js.UndefOr[Boolean] = js.native
  
  var defines: js.UndefOr[js.Any] = js.native
  
  var depthFunc: js.UndefOr[DepthModes] = js.native
  
  var depthTest: js.UndefOr[Boolean] = js.native
  
  var depthWrite: js.UndefOr[Boolean] = js.native
  
  var dithering: js.UndefOr[Boolean] = js.native
  
  var flatShading: js.UndefOr[Boolean] = js.native
  
  var fog: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var polygonOffset: js.UndefOr[Boolean] = js.native
  
  var polygonOffsetFactor: js.UndefOr[Double] = js.native
  
  var polygonOffsetUnits: js.UndefOr[Double] = js.native
  
  var precision: js.UndefOr[highp | mediump | lowp | Null] = js.native
  
  var premultipliedAlpha: js.UndefOr[Boolean] = js.native
  
  var shadowSide: js.UndefOr[Side] = js.native
  
  var side: js.UndefOr[Side] = js.native
  
  var stencilFail: js.UndefOr[StencilOp] = js.native
  
  var stencilFunc: js.UndefOr[StencilFunc] = js.native
  
  var stencilMask: js.UndefOr[Double] = js.native
  
  var stencilRef: js.UndefOr[Double] = js.native
  
  var stencilWrite: js.UndefOr[Boolean] = js.native
  
  var stencilZFail: js.UndefOr[StencilOp] = js.native
  
  var stencilZPass: js.UndefOr[StencilOp] = js.native
  
  var toneMapped: js.UndefOr[Boolean] = js.native
  
  var transparent: js.UndefOr[Boolean] = js.native
  
  var vertexColors: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object MaterialParameters {
  
  @scala.inline
  def apply(): MaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialParameters]
  }
  
  @scala.inline
  implicit class MaterialParametersOps[Self <: MaterialParameters] (val x: Self) extends AnyVal {
    
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
    def setAlphaTest(value: Double): Self = this.set("alphaTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaTest: Self = this.set("alphaTest", js.undefined)
    
    @scala.inline
    def setBlendDst(value: BlendingDstFactor): Self = this.set("blendDst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlendDst: Self = this.set("blendDst", js.undefined)
    
    @scala.inline
    def setBlendDstAlpha(value: Double): Self = this.set("blendDstAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlendDstAlpha: Self = this.set("blendDstAlpha", js.undefined)
    
    @scala.inline
    def setBlendEquation(value: BlendingEquation): Self = this.set("blendEquation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlendEquation: Self = this.set("blendEquation", js.undefined)
    
    @scala.inline
    def setBlendEquationAlpha(value: Double): Self = this.set("blendEquationAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlendEquationAlpha: Self = this.set("blendEquationAlpha", js.undefined)
    
    @scala.inline
    def setBlendSrc(value: BlendingSrcFactor | BlendingDstFactor): Self = this.set("blendSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlendSrc: Self = this.set("blendSrc", js.undefined)
    
    @scala.inline
    def setBlendSrcAlpha(value: Double): Self = this.set("blendSrcAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlendSrcAlpha: Self = this.set("blendSrcAlpha", js.undefined)
    
    @scala.inline
    def setBlending(value: Blending): Self = this.set("blending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlending: Self = this.set("blending", js.undefined)
    
    @scala.inline
    def setClipIntersection(value: Boolean): Self = this.set("clipIntersection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipIntersection: Self = this.set("clipIntersection", js.undefined)
    
    @scala.inline
    def setClipShadows(value: Boolean): Self = this.set("clipShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipShadows: Self = this.set("clipShadows", js.undefined)
    
    @scala.inline
    def setClippingPlanesVarargs(value: Plane*): Self = this.set("clippingPlanes", js.Array(value :_*))
    
    @scala.inline
    def setClippingPlanes(value: js.Array[Plane]): Self = this.set("clippingPlanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClippingPlanes: Self = this.set("clippingPlanes", js.undefined)
    
    @scala.inline
    def setColorWrite(value: Boolean): Self = this.set("colorWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorWrite: Self = this.set("colorWrite", js.undefined)
    
    @scala.inline
    def setDefines(value: js.Any): Self = this.set("defines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefines: Self = this.set("defines", js.undefined)
    
    @scala.inline
    def setDepthFunc(value: DepthModes): Self = this.set("depthFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthFunc: Self = this.set("depthFunc", js.undefined)
    
    @scala.inline
    def setDepthTest(value: Boolean): Self = this.set("depthTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthTest: Self = this.set("depthTest", js.undefined)
    
    @scala.inline
    def setDepthWrite(value: Boolean): Self = this.set("depthWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthWrite: Self = this.set("depthWrite", js.undefined)
    
    @scala.inline
    def setDithering(value: Boolean): Self = this.set("dithering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDithering: Self = this.set("dithering", js.undefined)
    
    @scala.inline
    def setFlatShading(value: Boolean): Self = this.set("flatShading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatShading: Self = this.set("flatShading", js.undefined)
    
    @scala.inline
    def setFog(value: Boolean): Self = this.set("fog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFog: Self = this.set("fog", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPolygonOffset(value: Boolean): Self = this.set("polygonOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonOffset: Self = this.set("polygonOffset", js.undefined)
    
    @scala.inline
    def setPolygonOffsetFactor(value: Double): Self = this.set("polygonOffsetFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonOffsetFactor: Self = this.set("polygonOffsetFactor", js.undefined)
    
    @scala.inline
    def setPolygonOffsetUnits(value: Double): Self = this.set("polygonOffsetUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonOffsetUnits: Self = this.set("polygonOffsetUnits", js.undefined)
    
    @scala.inline
    def setPrecision(value: highp | mediump | lowp): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setPrecisionNull: Self = this.set("precision", null)
    
    @scala.inline
    def setPremultipliedAlpha(value: Boolean): Self = this.set("premultipliedAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremultipliedAlpha: Self = this.set("premultipliedAlpha", js.undefined)
    
    @scala.inline
    def setShadowSide(value: Side): Self = this.set("shadowSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowSide: Self = this.set("shadowSide", js.undefined)
    
    @scala.inline
    def setSide(value: Side): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    
    @scala.inline
    def setStencilFail(value: StencilOp): Self = this.set("stencilFail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStencilFail: Self = this.set("stencilFail", js.undefined)
    
    @scala.inline
    def setStencilFunc(value: StencilFunc): Self = this.set("stencilFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStencilFunc: Self = this.set("stencilFunc", js.undefined)
    
    @scala.inline
    def setStencilMask(value: Double): Self = this.set("stencilMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStencilMask: Self = this.set("stencilMask", js.undefined)
    
    @scala.inline
    def setStencilRef(value: Double): Self = this.set("stencilRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStencilRef: Self = this.set("stencilRef", js.undefined)
    
    @scala.inline
    def setStencilWrite(value: Boolean): Self = this.set("stencilWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStencilWrite: Self = this.set("stencilWrite", js.undefined)
    
    @scala.inline
    def setStencilZFail(value: StencilOp): Self = this.set("stencilZFail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStencilZFail: Self = this.set("stencilZFail", js.undefined)
    
    @scala.inline
    def setStencilZPass(value: StencilOp): Self = this.set("stencilZPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStencilZPass: Self = this.set("stencilZPass", js.undefined)
    
    @scala.inline
    def setToneMapped(value: Boolean): Self = this.set("toneMapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToneMapped: Self = this.set("toneMapped", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    
    @scala.inline
    def setVertexColors(value: Boolean): Self = this.set("vertexColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexColors: Self = this.set("vertexColors", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
