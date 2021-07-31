package typings.vegaLite.specBaseMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcDataMod.Data
import typings.vegaLite.titleMod.TitleParams
import typings.vegaLite.transformMod.Transform
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSpec extends StObject {
  
  /**
    * An object describing the data source. Set to `null` to ignore the parent's data source. If no data is set, it is derived from the parent.
    */
  var data: js.UndefOr[Data | Null] = js.undefined
  
  /**
    * Description of this mark for commenting purpose.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the visualization for later reference.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Title for the plot.
    */
  var title: js.UndefOr[Text | (TitleParams[ExprRef | SignalRef])] = js.undefined
  
  /**
    * An array of data transformations such as filter and new field calculation.
    */
  var transform: js.UndefOr[js.Array[Transform]] = js.undefined
}
object BaseSpec {
  
  @scala.inline
  def apply(): BaseSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSpec]
  }
  
  @scala.inline
  implicit class BaseSpecMutableBuilder[Self <: BaseSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTitle(value: Text | (TitleParams[ExprRef | SignalRef])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: js.Array[Transform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: Transform*): Self = StObject.set(x, "transform", js.Array(value :_*))
  }
}
