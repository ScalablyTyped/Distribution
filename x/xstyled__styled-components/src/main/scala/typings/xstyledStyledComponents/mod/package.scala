package typings.xstyledStyledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Augments a type to be Type | BreakpointObject<Type>,
    * in other words, allow a property to be `1` or `{ xs: 1, sm: 2 }`
    */
  type WithBreakpointArgs[Props] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof Props ]:? Props[Key] | @xstyled/styled-components.@xstyled/styled-components.BreakpointObject<Props[Key]>}
    */ typings.xstyledStyledComponents.xstyledStyledComponentsStrings.WithBreakpointArgs with org.scalablytyped.runtime.TopLevel[js.Any]
}
