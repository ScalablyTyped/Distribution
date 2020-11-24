package typings.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object enhancePropsMod {
  
  type PreservedProps = typings.uiBox.boxTypesMod.Without[
    typings.react.mod.ComponentProps[js.Any], 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any
  ]
}
