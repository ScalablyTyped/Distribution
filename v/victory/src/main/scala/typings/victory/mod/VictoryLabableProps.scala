package typings.victory.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Common labable interface
@js.native
trait VictoryLabableProps extends StObject {
  
  /**
    * The labelComponent prop takes in an entire label component which will be used
    * to create a label for the area. The new element created from the passed labelComponent
    * will be supplied with the following properties: x, y, index, data, verticalAnchor,
    * textAnchor, angle, style, text, and events. any of these props may be overridden
    * by passing in props to the supplied component, or modified or ignored within
    * the custom component itself. If labelComponent is omitted, a new VictoryLabel
    * will be created with props described above. This labelComponent prop should be used to
    * provide a series label for VictoryArea. If individual labels are required for each
    * data point, they should be created by composing VictoryArea with VictoryScatter
    * @default <VictoryLabel/>
    */
  var labelComponent: js.UndefOr[ReactElement] = js.native
}
object VictoryLabableProps {
  
  @scala.inline
  def apply(): VictoryLabableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryLabableProps]
  }
  
  @scala.inline
  implicit class VictoryLabablePropsMutableBuilder[Self <: VictoryLabableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelComponent(value: ReactElement): Self = StObject.set(x, "labelComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelComponentUndefined: Self = StObject.set(x, "labelComponent", js.undefined)
  }
}
