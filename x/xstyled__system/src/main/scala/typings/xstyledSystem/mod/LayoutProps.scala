package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutProps
  extends DisplayProps
     with WidthProps[StyledSystemLength]
     with HeightProps[StyledSystemLength]
     with MaxWidthProps[StyledSystemLength]
     with MaxHeightProps[StyledSystemLength]
     with MinWidthProps[StyledSystemLength]
     with MinHeightProps[StyledSystemLength]
     with SizeProps[StyledSystemLength]
     with VerticalAlignProps[StyledSystemLength]
object LayoutProps {
  
  @scala.inline
  def apply(): LayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutProps]
  }
}
