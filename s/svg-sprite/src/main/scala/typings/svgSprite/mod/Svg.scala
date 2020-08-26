package typings.svgSprite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Svg extends js.Object {
  /**
    * If truthy, width and height attributes will be set on the sprite's <svg> element (where applicable).
    * @default true
    */
  var dimensionAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Include a <DOCTYPE> declaration in each compiled sprite. If you provide a non-empty string here,
    * it will be used one-to-one as declaration (e.g. <!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1 Basic//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11-basic.dtd">).
    * If you set this to TRUE, *svg-sprite* will look at the registered shapes for a DOCTYPE declaration and use the first one it can find.
    * @default true
    */
  var doctypeDeclaration: js.UndefOr[Boolean | String] = js.native
  /**
    * In order to avoid CSS class name ambiguities, the default behavior is to namespace CSS class names in the source SVGs before compiling them into a sprite.
    * Each class name is prepended with a unique string. Disable this option to keep the class names untouched.
    * @default true
    */
  var namespaceClassnames: js.UndefOr[Boolean] = js.native
  /**
    * In order to avoid ID clashes, the default behavior is to namespace all IDs in the source SVGs before compiling them into a sprite.
    * Each ID is prepended with a unique string. In some situations, it might be desirable to disable ID namespacing, e.g. when you want to script the resulting sprite.
    * Just set svg.namespaceIDs to FALSE then and be aware that you might also want to disable SVGO's ID minification (shape.transform.svgo.plugins: [{cleanupIDs: false}]).
    * @default true
    */
  var namespaceIDs: js.UndefOr[Boolean] = js.native
  /**
    * Floating point precision for CSS positioning values (defaults to -1 meaning highest possible precision).
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Shorthand for applying custom attributes to the outermost <svg> element.
    * Please be aware that certain attributes (e.g. viewBox) will be calculated dynamically and override custom rootAttributes in any case.
    */
  var rootAttributes: js.UndefOr[js.Any] = js.native
  /**
    * Callback (or list of callbacks) that will be applied to the resulting SVG sprites as global [post-processing transformation](#svg-sprite-customization).
    * transform: Function∣Array
    */
  var transform: js.UndefOr[SvgTransformer | js.Array[SvgTransformer]] = js.native
  /**
    * Output an XML declaration at the very beginning of each compiled sprite.
    * If you provide a non-empty string here, it will be used one-to-one as declaration (e.g. <?xml version="1.0" encoding="utf-8"?>).
    * If you set this to TRUE, *svg-sprite* will look at the registered shapes for an XML declaration and use the first one it can find.
    * @default true
    */
  var xmlDeclaration: js.UndefOr[Boolean | String] = js.native
}

object Svg {
  @scala.inline
  def apply(): Svg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Svg]
  }
  @scala.inline
  implicit class SvgOps[Self <: Svg] (val x: Self) extends AnyVal {
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
    def setDimensionAttributes(value: Boolean): Self = this.set("dimensionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionAttributes: Self = this.set("dimensionAttributes", js.undefined)
    @scala.inline
    def setDoctypeDeclaration(value: Boolean | String): Self = this.set("doctypeDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoctypeDeclaration: Self = this.set("doctypeDeclaration", js.undefined)
    @scala.inline
    def setNamespaceClassnames(value: Boolean): Self = this.set("namespaceClassnames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceClassnames: Self = this.set("namespaceClassnames", js.undefined)
    @scala.inline
    def setNamespaceIDs(value: Boolean): Self = this.set("namespaceIDs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceIDs: Self = this.set("namespaceIDs", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setRootAttributes(value: js.Any): Self = this.set("rootAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootAttributes: Self = this.set("rootAttributes", js.undefined)
    @scala.inline
    def setTransformVarargs(value: SvgTransformer*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransformFunction1(value: /* svg */ String => String): Self = this.set("transform", js.Any.fromFunction1(value))
    @scala.inline
    def setTransform(value: SvgTransformer | js.Array[SvgTransformer]): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setXmlDeclaration(value: Boolean | String): Self = this.set("xmlDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlDeclaration: Self = this.set("xmlDeclaration", js.undefined)
  }
  
}

