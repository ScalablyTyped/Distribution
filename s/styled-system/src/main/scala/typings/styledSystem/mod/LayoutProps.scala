package typings.styledSystem.mod

import typings.csstype.mod.Property.Height
import typings.csstype.mod.Property.MaxHeight
import typings.csstype.mod.Property.MaxWidth
import typings.csstype.mod.Property.MinHeight
import typings.csstype.mod.Property.MinWidth
import typings.csstype.mod.Property.VerticalAlign
import typings.csstype.mod.Property.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends StObject
     with WidthProps[ThemeType, Width[TLengthStyledSystem]]
     with HeightProps[ThemeType, Height[TLengthStyledSystem]]
     with MinWidthProps[ThemeType, MinWidth[TLengthStyledSystem]]
     with MinHeightProps[ThemeType, MinHeight[TLengthStyledSystem]]
     with MaxWidthProps[ThemeType, MaxWidth[TLengthStyledSystem]]
     with MaxHeightProps[ThemeType, MaxHeight[TLengthStyledSystem]]
     with DisplayProps[ThemeType]
     with VerticalAlignProps[ThemeType, VerticalAlign[TLengthStyledSystem]]
     with SizeProps[ThemeType, Height[TLengthStyledSystem]]
     with OverflowProps[ThemeType]
object LayoutProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): LayoutProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutProps[ThemeType]]
  }
}
