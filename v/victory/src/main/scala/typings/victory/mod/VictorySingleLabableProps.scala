package typings.victory.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictorySingleLabableProps
  extends StObject
     with VictoryLabableProps {
  
  /**
    * The label prop defines the label that will appear at the edge of the area.
    * This prop should be given a string or as a function of data. If individual
    * labels are required for each data point, they should be created by composing
    * VictoryArea with VictoryScatter
    * @example: "Series 1", (data) => `${data.length} points`
    */
  var label: js.UndefOr[String | (js.Function1[/* data */ js.Any, String])] = js.undefined
}
object VictorySingleLabableProps {
  
  @scala.inline
  def apply(): VictorySingleLabableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictorySingleLabableProps]
  }
  
  @scala.inline
  implicit class VictorySingleLabablePropsMutableBuilder[Self <: VictorySingleLabableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String | (js.Function1[/* data */ js.Any, String])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFunction1(value: /* data */ js.Any => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
