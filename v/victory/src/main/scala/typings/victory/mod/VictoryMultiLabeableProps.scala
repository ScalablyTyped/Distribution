package typings.victory.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryMultiLabeableProps
  extends StObject
     with VictoryLabableProps {
  
  /**
    * The labels prop defines labels that will appear above each bar in your chart.
    * This prop should be given as an array of values or as a function of data.
    * If given as an array, the number of elements in the array should be equal to
    * the length of the data array. Labels may also be added directly to the data object
    * like data={[{x: 1, y: 1, label: "first"}]}.
    * @example ["spring", "summer", "fall", "winter"], (datum) => datum.title
    */
  var labels: js.UndefOr[js.Array[String] | (js.Function1[/* data */ js.Any, String])] = js.undefined
}
object VictoryMultiLabeableProps {
  
  @scala.inline
  def apply(): VictoryMultiLabeableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryMultiLabeableProps]
  }
  
  @scala.inline
  implicit class VictoryMultiLabeablePropsMutableBuilder[Self <: VictoryMultiLabeableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: js.Array[String] | (js.Function1[/* data */ js.Any, String])): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsFunction1(value: /* data */ js.Any => String): Self = StObject.set(x, "labels", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
  }
}
