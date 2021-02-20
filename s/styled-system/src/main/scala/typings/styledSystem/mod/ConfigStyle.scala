package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigStyle extends StObject {
  
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
  implicit class ConfigStyleMutableBuilder[Self <: ConfigStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultScale(value: Scale): Self = StObject.set(x, "defaultScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultScaleUndefined: Self = StObject.set(x, "defaultScale", js.undefined)
    
    @scala.inline
    def setDefaultScaleVarargs(value: (Double | String)*): Self = StObject.set(x, "defaultScale", js.Array(value :_*))
    
    @scala.inline
    def setProperties(
      value: js.Array[
          /* keyof csstype.csstype.Properties<string | 0> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 776 */ js.Any
        ]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(
      value: (/* keyof csstype.csstype.Properties<string | 0> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 776 */ js.Any)*
    ): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setProperty(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 777 */ js.Any): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setTransform(value: (/* value */ js.Any, /* scale */ js.UndefOr[Scale]) => _): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
