package typings
package svgDashSpriteLib.svgDashSpriteMod.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Svg extends js.Object {
  /**
           * If truthy, width and height attributes will be set on the sprite's <svg> element (where applicable).
           * @default true
           */
  var dimensionAttributes: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Include a <DOCTYPE> declaration in each compiled sprite. If you provide a non-empty string here,
           * it will be used one-to-one as declaration (e.g. <!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1 Basic//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11-basic.dtd">).
           * If you set this to TRUE, *svg-sprite* will look at the registered shapes for a DOCTYPE declaration and use the first one it can find.
           * @default true
           */
  var doctypeDeclaration: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
           * In order to avoid CSS class name ambiguities, the default behavior is to namespace CSS class names in the source SVGs before compiling them into a sprite.
           * Each class name is prepended with a unique string. Disable this option to keep the class names untouched.
           * @default true
           */
  var namespaceClassnames: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * In order to avoid ID clashes, the default behavior is to namespace all IDs in the source SVGs before compiling them into a sprite.
           * Each ID is prepended with a unique string. In some situations, it might be desirable to disable ID namespacing, e.g. when you want to script the resulting sprite.
           * Just set svg.namespaceIDs to FALSE then and be aware that you might also want to disable SVGO's ID minification (shape.transform.svgo.plugins: [{cleanupIDs: false}]).
           * @default true
           */
  var namespaceIDs: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Floating point precision for CSS positioning values (defaults to -1 meaning highest possible precision).
           */
  var precision: js.UndefOr[scala.Double] = js.undefined
  /**
           * Shorthand for applying custom attributes to the outermost <svg> element.
           * Please be aware that certain attributes (e.g. viewBox) will be calculated dynamically and override custom rootAttributes in any case.
           */
  var rootAttributes: js.UndefOr[js.Any] = js.undefined
  /**
           * Callback (or list of callbacks) that will be applied to the resulting SVG sprites as global [post-processing transformation](#svg-sprite-customization).
           * transform: Function∣Array
           */
  var transform: js.UndefOr[SvgTransformer | js.Array[SvgTransformer]] = js.undefined
  /**
           * Output an XML declaration at the very beginning of each compiled sprite.
           * If you provide a non-empty string here, it will be used one-to-one as declaration (e.g. <?xml version="1.0" encoding="utf-8"?>).
           * If you set this to TRUE, *svg-sprite* will look at the registered shapes for an XML declaration and use the first one it can find.
           * @default true
           */
  var xmlDeclaration: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

