package typings.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryMultiLabeableProps extends VictoryLabableProps {
  
  /**
    * The labels prop defines labels that will appear above each bar in your chart.
    * This prop should be given as an array of values or as a function of data.
    * If given as an array, the number of elements in the array should be equal to
    * the length of the data array. Labels may also be added directly to the data object
    * like data={[{x: 1, y: 1, label: "first"}]}.
    * @example ["spring", "summer", "fall", "winter"], (datum) => datum.title
    */
  var labels: js.UndefOr[js.Array[String] | (js.Function1[/* data */ js.Any, String])] = js.native
}
object VictoryMultiLabeableProps {
  
  @scala.inline
  def apply(): VictoryMultiLabeableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryMultiLabeableProps]
  }
  
  @scala.inline
  implicit class VictoryMultiLabeablePropsOps[Self <: VictoryMultiLabeableProps] (val x: Self) extends AnyVal {
    
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
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabelsFunction1(value: /* data */ js.Any => String): Self = this.set("labels", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabels(value: js.Array[String] | (js.Function1[/* data */ js.Any, String])): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
}
