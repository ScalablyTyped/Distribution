package typings.vegaLite.anon

import typings.vegaTypings.transformMod.Transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<vega-lite.vega-lite/build/src/vega.schema.VgData> */
trait PartialVgData extends StObject {
  
  var format: js.UndefOr[Feature] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[js.Array[Transforms]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[js.Any] = js.undefined
}
object PartialVgData {
  
  @scala.inline
  def apply(): PartialVgData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVgData]
  }
  
  @scala.inline
  implicit class PartialVgDataMutableBuilder[Self <: PartialVgData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: Feature): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTransform(value: js.Array[Transforms]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: Transforms*): Self = StObject.set(x, "transform", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
