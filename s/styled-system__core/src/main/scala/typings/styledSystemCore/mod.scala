package typings.styledSystemCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@styled-system/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compose(parsers: styleFn*): styleFn = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(parsers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[styleFn]
  
  inline def createParser(config: ConfigStyle): styleFn = ^.asInstanceOf[js.Dynamic].applyDynamic("createParser")(config.asInstanceOf[js.Any]).asInstanceOf[styleFn]
  
  inline def createStyleFunction(args: ConfigStyle): styleFn = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyleFunction")(args.asInstanceOf[js.Any]).asInstanceOf[styleFn]
  
  inline def get(obj: Any, paths: (String | Double)*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(scala.List(obj.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def system(styleDefinitions: Config): styleFn = ^.asInstanceOf[js.Dynamic].applyDynamic("system")(styleDefinitions.asInstanceOf[js.Any]).asInstanceOf[styleFn]
  
  type Config = /** Property name exposed for use in components */
  StringDictionary[ConfigStyle | Boolean]
  
  trait ConfigStyle extends StObject {
    
    /** A fallback scale object for when there isn't one defined in the `theme` object. */
    var defaultScale: js.UndefOr[Scale] = js.undefined
    
    /**
      * An array of multiple properties (e.g. `['marginLeft', 'marginRight']`) to which this style's value will be
      * assigned (overrides `property` when present).
      */
    var properties: js.UndefOr[
        js.Array[
          /* keyof csstype.csstype.Properties<string & {} | 0, string & {}> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 788, starting with typings.styledSystemCore.styledSystemCoreStrings.accentColor, typings.styledSystemCore.styledSystemCoreStrings.alignContent, typings.styledSystemCore.styledSystemCoreStrings.alignItems */ Any
        ]
      ] = js.undefined
    
    /** The CSS property to use in the returned style object (overridden by `properties` if present). */
    var property: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 789, starting with typings.styledSystemCore.styledSystemCoreStrings.accentColor, typings.styledSystemCore.styledSystemCoreStrings.alignContent, typings.styledSystemCore.styledSystemCoreStrings.alignItems */ Any
      ] = js.undefined
    
    /** A string referencing a key in the `theme` object. */
    var scale: js.UndefOr[String] = js.undefined
    
    /** A function to transform the raw value based on the scale. */
    var transform: js.UndefOr[js.Function2[/* value */ Any, /* scale */ js.UndefOr[Scale], Any]] = js.undefined
  }
  object ConfigStyle {
    
    inline def apply(): ConfigStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigStyle] (val x: Self) extends AnyVal {
      
      inline def setDefaultScale(value: Scale): Self = StObject.set(x, "defaultScale", value.asInstanceOf[js.Any])
      
      inline def setDefaultScaleUndefined: Self = StObject.set(x, "defaultScale", js.undefined)
      
      inline def setDefaultScaleVarargs(value: (Double | String)*): Self = StObject.set(x, "defaultScale", js.Array(value*))
      
      inline def setProperties(
        value: js.Array[
              /* keyof csstype.csstype.Properties<string & {} | 0, string & {}> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 788, starting with typings.styledSystemCore.styledSystemCoreStrings.accentColor, typings.styledSystemCore.styledSystemCoreStrings.alignContent, typings.styledSystemCore.styledSystemCoreStrings.alignItems */ Any
            ]
      ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertiesVarargs(
        value: (/* keyof csstype.csstype.Properties<string & {} | 0, string & {}> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 788, starting with typings.styledSystemCore.styledSystemCoreStrings.accentColor, typings.styledSystemCore.styledSystemCoreStrings.alignContent, typings.styledSystemCore.styledSystemCoreStrings.alignItems */ Any)*
      ): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setProperty(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 789, starting with typings.styledSystemCore.styledSystemCoreStrings.accentColor, typings.styledSystemCore.styledSystemCoreStrings.alignContent, typings.styledSystemCore.styledSystemCoreStrings.alignItems */ Any
      ): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setTransform(value: (/* value */ Any, /* scale */ js.UndefOr[Scale]) => Any): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type ObjectOrArray[T, K /* <: /* keyof any */ String */] = js.Array[T] | (Record[K, T | (Record[K, T]) | js.Array[T]])
  
  type Scale = ObjectOrArray[Double | String, /* keyof any */ String]
  
  @js.native
  trait styleFn extends StObject {
    
    def apply(args: Any*): Any = js.native
    
    var cache: js.UndefOr[js.Object] = js.native
    
    var config: js.UndefOr[js.Object] = js.native
    
    var propNames: js.UndefOr[js.Array[String]] = js.native
  }
}
