package typings.themeUiComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'm' | 'margin' | 'mt' | 'marginTop' | 'mb' | 'marginBottom' | 'ml' | 'marginLeft' | 'mr' | 'marginRight' | 'my' | 'mx' ]: styled-system.styled-system.SpaceProps<styled-system.styled-system.RequiredTheme, styled-system.styled-system.ThemeValue<'space', styled-system.styled-system.RequiredTheme, any>>[P]} */ trait FieldOwnProps extends js.Object {
  /**
    * Text for Label component
    */
  var label: String
  /**
    * Used for the for, id, and name attributes
    */
  var name: String
}

object FieldOwnProps {
  @scala.inline
  def apply(label: String, name: String): FieldOwnProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldOwnProps]
  }
}

