package typings.vegaLite

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite.buildSrcChannelMod.SingleDefUnitChannel
import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcCompileSelectionMod.SelectionCompiler
import typings.vegaLite.buildSrcSelectionMod.BrushConfig
import typings.vegaLite.buildSrcSelectionMod.SelectionResolution
import typings.vegaLite.vegaLiteStrings.interval
import typings.vegaTypings.typesSpecStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileSelectionIntervalMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/interval", JSImport.Default)
  @js.native
  val default: SelectionCompiler[interval] = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/interval", "BRUSH")
  @js.native
  val BRUSH: /* "_brush" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/interval", "GEO_INIT_TICK")
  @js.native
  val GEO_INIT_TICK: /* "geo_interval_init_tick" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/interval", "SCALE_TRIGGER")
  @js.native
  val SCALE_TRIGGER: /* "_scale_trigger" */ String = js.native
  
  /* Inlined vega-lite.vega-lite/build/src/selection.IntervalSelectionConfigWithoutType & {  fields :std.Array<vega-lite.vega-lite/build/src/channeldef.FieldName> | undefined} */
  trait IntervalSelectionConfigWithField extends StObject {
    
    var clear: js.UndefOr[Stream | String | Boolean] = js.undefined
    
    var encodings: js.UndefOr[js.Array[SingleDefUnitChannel]] = js.undefined
    
    var fields: js.UndefOr[js.Array[FieldName]] = js.undefined
    
    var mark: js.UndefOr[BrushConfig] = js.undefined
    
    var on: js.UndefOr[Stream | String] = js.undefined
    
    var resolve: js.UndefOr[SelectionResolution] = js.undefined
    
    var translate: js.UndefOr[String | Boolean] = js.undefined
    
    var zoom: js.UndefOr[String | Boolean] = js.undefined
  }
  object IntervalSelectionConfigWithField {
    
    inline def apply(): IntervalSelectionConfigWithField = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntervalSelectionConfigWithField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntervalSelectionConfigWithField] (val x: Self) extends AnyVal {
      
      inline def setClear(value: Stream | String | Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setEncodings(value: js.Array[SingleDefUnitChannel]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
      
      inline def setEncodingsUndefined: Self = StObject.set(x, "encodings", js.undefined)
      
      inline def setEncodingsVarargs(value: SingleDefUnitChannel*): Self = StObject.set(x, "encodings", js.Array(value*))
      
      inline def setFields(value: js.Array[FieldName]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: FieldName*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setMark(value: BrushConfig): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setOn(value: Stream | String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setResolve(value: SelectionResolution): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setTranslate(value: String | Boolean): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setZoom(value: String | Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  type _To = SelectionCompiler[interval]
  
  /* This means you don't have to write `default`, but can instead just say `buildSrcCompileSelectionIntervalMod.foo` */
  override def _to: SelectionCompiler[interval] = default
}
