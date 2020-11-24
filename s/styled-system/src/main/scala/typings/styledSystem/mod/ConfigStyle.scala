package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigStyle extends js.Object {
  
  /** A fallback scale object for when there isn't one defined in the `theme` object. */
  var defaultScale: js.UndefOr[Scale] = js.native
  
  /**
    * An array of multiple properties (e.g. `['marginLeft', 'marginRight']`) to which this style's value will be
    * assigned (overrides `property` when present).
    */
  var properties: js.UndefOr[
    js.Array[
      /* keyof csstype.csstype.Properties<string | 0> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 776 */ js.Any
    ]
  ] = js.native
  
  /** The CSS property to use in the returned style object (overridden by `properties` if present). */
  var property: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 777 */ js.Any
  ] = js.native
  
  /** A string referencing a key in the `theme` object. */
  var scale: js.UndefOr[String] = js.native
  
  /** A function to transform the raw value based on the scale. */
  var transform: js.UndefOr[js.Function2[/* value */ js.Any, /* scale */ js.UndefOr[Scale], _]] = js.native
}
object ConfigStyle {
  
  @scala.inline
  def apply(): ConfigStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigStyle]
  }
  
  @scala.inline
  implicit class ConfigStyleOps[Self <: ConfigStyle] (val x: Self) extends AnyVal {
    
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
    def setDefaultScaleVarargs(value: (Double | String)*): Self = this.set("defaultScale", js.Array(value :_*))
    
    @scala.inline
    def setDefaultScale(value: Scale): Self = this.set("defaultScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultScale: Self = this.set("defaultScale", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(
      value: (/* keyof csstype.csstype.Properties<string | 0> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 776 */ js.Any)*
    ): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(
      value: js.Array[
          /* keyof csstype.csstype.Properties<string | 0> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 776 */ js.Any
        ]
    ): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setProperty(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 777 */ js.Any): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setScale(value: String): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setTransform(value: (/* value */ js.Any, /* scale */ js.UndefOr[Scale]) => _): Self = this.set("transform", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
