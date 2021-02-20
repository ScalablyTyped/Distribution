package typings.vegaLite.srcMarkMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkDefMixins[ES /* <: ExprRef | SignalRef */] extends StObject {
  
  /**
    * Whether a mark be clipped to the enclosing group’s width and height.
    */
  var clip: js.UndefOr[Boolean] = js.native
  
  /**
    * Offset for radius2.
    */
  var radius2Offset: js.UndefOr[Double | ES] = js.native
  
  /**
    * Offset for radius.
    */
  var radiusOffset: js.UndefOr[Double | ES] = js.native
  
  /**
    * A string or array of strings indicating the name of custom styles to apply to the mark. A style is a named collection of mark property defaults defined within the [style configuration](https://vega.github.io/vega-lite/docs/mark.html#style-config). If style is an array, later styles will override earlier styles. Any [mark properties](https://vega.github.io/vega-lite/docs/encoding.html#mark-prop) explicitly defined within the `encoding` will override a style default.
    *
    * __Default value:__ The mark's name. For example, a bar mark will have style `"bar"` by default.
    * __Note:__ Any specified style will augment the default style. For example, a bar mark with `"style": "foo"` will receive from `config.style.bar` and `config.style.foo` (the specified style `"foo"` has higher precedence).
    */
  var style: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Offset for theta2.
    */
  var theta2Offset: js.UndefOr[Double | ES] = js.native
  
  /**
    * Offset for theta.
    */
  var thetaOffset: js.UndefOr[Double | ES] = js.native
  
  /**
    * Offset for x2-position.
    */
  var x2Offset: js.UndefOr[Double | ES] = js.native
  
  /**
    * Offset for x-position.
    */
  var xOffset: js.UndefOr[Double | ES] = js.native
  
  /**
    * Offset for y2-position.
    */
  var y2Offset: js.UndefOr[Double | ES] = js.native
  
  /**
    * Offset for y-position.
    */
  var yOffset: js.UndefOr[Double | ES] = js.native
}
object MarkDefMixins {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): MarkDefMixins[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkDefMixins[ES]]
  }
  
  @scala.inline
  implicit class MarkDefMixinsMutableBuilder[Self <: MarkDefMixins[_], ES /* <: ExprRef | SignalRef */] (val x: Self with MarkDefMixins[ES]) extends AnyVal {
    
    @scala.inline
    def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setRadius2Offset(value: Double | ES): Self = StObject.set(x, "radius2Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius2OffsetUndefined: Self = StObject.set(x, "radius2Offset", js.undefined)
    
    @scala.inline
    def setRadiusOffset(value: Double | ES): Self = StObject.set(x, "radiusOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusOffsetUndefined: Self = StObject.set(x, "radiusOffset", js.undefined)
    
    @scala.inline
    def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
    
    @scala.inline
    def setTheta2Offset(value: Double | ES): Self = StObject.set(x, "theta2Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheta2OffsetUndefined: Self = StObject.set(x, "theta2Offset", js.undefined)
    
    @scala.inline
    def setThetaOffset(value: Double | ES): Self = StObject.set(x, "thetaOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaOffsetUndefined: Self = StObject.set(x, "thetaOffset", js.undefined)
    
    @scala.inline
    def setX2Offset(value: Double | ES): Self = StObject.set(x, "x2Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2OffsetUndefined: Self = StObject.set(x, "x2Offset", js.undefined)
    
    @scala.inline
    def setXOffset(value: Double | ES): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
    
    @scala.inline
    def setY2Offset(value: Double | ES): Self = StObject.set(x, "y2Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2OffsetUndefined: Self = StObject.set(x, "y2Offset", js.undefined)
    
    @scala.inline
    def setYOffset(value: Double | ES): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
  }
}
